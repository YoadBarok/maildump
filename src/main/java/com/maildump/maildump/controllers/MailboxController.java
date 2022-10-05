package com.maildump.maildump.controllers;

import com.maildump.maildump.models.Mailbox;
import com.maildump.maildump.models.dto.MailboxDTO;
import com.maildump.maildump.services.MailboxService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "mailbox/")
@RequiredArgsConstructor
public class MailboxController {

    private final MailboxService mailboxService;

    @GetMapping
    public List<MailboxDTO> getAllMailboxes() {
        // line 27 - 35: demonstrate the effect of the @Lob & @Transactional annotations.
        Optional<Mailbox> box = this.mailboxService.getMailboxById(1L);
        if (box.isPresent()) {
            Set<Integer> filterIds = box.get().getFiltersIds();
            if (filterIds == null) {
                filterIds = new HashSet<>();
            }
            filterIds.add(2);
            box.get().setFiltersIds(filterIds); // @Transactional lets us save directly to db using setters
        }

        return this.mailboxService.getAllMailboxes().stream()
                .map(Mailbox::toDTO).collect(Collectors.toList()); // You will see that mailbox 1 has [2] as filtersIds
    }
}
