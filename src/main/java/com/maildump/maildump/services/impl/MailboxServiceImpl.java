package com.maildump.maildump.services.impl;

import com.maildump.maildump.models.Mailbox;
import com.maildump.maildump.repositories.MailboxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailboxServiceImpl implements com.maildump.maildump.services.MailboxService {

    private final MailboxRepository mailboxRepository;

    @Autowired
    public MailboxServiceImpl(MailboxRepository mailboxRepository) {
        this.mailboxRepository = mailboxRepository;
    }

    @Override
    public List<Mailbox> getAllMailboxes() {
        return this.mailboxRepository.findAll();
    }

    @Override
    public List<Mailbox> getAllMailboxesByUserId(Long userId) {
        return this.mailboxRepository.findAllByUserId(userId);
    }
}
