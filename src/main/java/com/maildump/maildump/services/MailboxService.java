package com.maildump.maildump.services;

import com.maildump.maildump.models.Mailbox;

import java.util.List;

public interface MailboxService {

    List<com.maildump.maildump.models.Mailbox> getAllMailboxes();
    List<Mailbox> getAllMailboxesByUserId(Long userId);
}
