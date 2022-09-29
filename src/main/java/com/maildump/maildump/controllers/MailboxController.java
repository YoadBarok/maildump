package com.maildump.maildump.controllers;

import com.maildump.maildump.models.Mailbox;
import com.maildump.maildump.services.MailboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "mailbox/")
public class MailboxController {

    private final MailboxService mailboxService;

    @Autowired
    public MailboxController(MailboxService mailboxService) {
        this.mailboxService = mailboxService;
    }

    @GetMapping
    public List<Mailbox> getAllMailboxes() {
        return this.mailboxService.getAllMailboxes();
    }
}
