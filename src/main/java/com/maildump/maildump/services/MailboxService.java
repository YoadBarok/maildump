package com.maildump.maildump.services;

import com.maildump.maildump.models.Mailbox;

import java.util.List;
import java.util.Optional;

public interface MailboxService {

    List<Mailbox> getAllMailboxes();

    List<Mailbox> getAllMailboxesByUserId(Long userId);

    Optional<Mailbox> getMailboxById(Long id);
}
