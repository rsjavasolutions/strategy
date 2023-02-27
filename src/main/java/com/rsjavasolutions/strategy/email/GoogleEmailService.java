package com.rsjavasolutions.strategy.email;

import com.rsjavasolutions.strategy.request.EmailNotification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GoogleEmailService implements  EmailSender {

    public void send(EmailNotification notification) {
        log.info("Google service : Email sent");
    }
}
