package com.rsjavasolutions.strategy.email;

import com.rsjavasolutions.strategy.request.EmailNotification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FakeEmailService implements EmailSender {

    @Override
    public void send(EmailNotification notification) {
        log.info("Fake service : Email sent");
    }
}
