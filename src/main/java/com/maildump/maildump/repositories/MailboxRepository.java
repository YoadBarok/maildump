package com.maildump.maildump.repositories;

import com.maildump.maildump.models.Mailbox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MailboxRepository extends JpaRepository<Mailbox, Long> {
    List<Mailbox> findAllByUserId(Long userId);
}
