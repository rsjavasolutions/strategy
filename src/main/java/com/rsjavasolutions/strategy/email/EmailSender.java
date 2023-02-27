package com.rsjavasolutions.strategy.email;

import com.rsjavasolutions.strategy.request.EmailNotification;

public interface EmailSender {
    void send(EmailNotification notification);
}
