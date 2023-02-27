package com.rsjavasolutions.strategy.email;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmailClientService {

    private static final String FAKE_EMAIL_SERVICE = "fakeEmailService";

    private static final String GOOGLE_EMAIL_SERVICE = "googleEmailService";

    private static final String MICROSOFT_EMAIL_SERVICE = "microsoftEmailService";

    @Value("${app.email.sender}")
    private String client;

    private final Map<String, EmailSender> senderMap;

    public EmailSender getInstance() {
        if (client.equals(FAKE_EMAIL_SERVICE)) {
            return senderMap.get(FAKE_EMAIL_SERVICE);
        } else if (client.equals(GOOGLE_EMAIL_SERVICE)) {
            return senderMap.get(GOOGLE_EMAIL_SERVICE);
        }
        return senderMap.get(MICROSOFT_EMAIL_SERVICE);
    }

    public EmailSender getInstance(String beanName) {
        if (client.equals(FAKE_EMAIL_SERVICE)) {
            return senderMap.get(FAKE_EMAIL_SERVICE);
        } else if (client.equals(GOOGLE_EMAIL_SERVICE)) {
            return senderMap.get(GOOGLE_EMAIL_SERVICE);
        }
        return senderMap.get(MICROSOFT_EMAIL_SERVICE);
    }
}