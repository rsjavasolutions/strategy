package com.rsjavasolutions.strategy.controller;

import com.rsjavasolutions.strategy.email.EmailClientService;
import com.rsjavasolutions.strategy.request.EmailNotification;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@Tag(name = "Service supporting notifications")
@RequestMapping("api/notifications")
public class NotificationController {

    private final EmailClientService emailService;

    @PostMapping
    public void send(@RequestBody @Valid EmailNotification notification) {
        emailService.getInstance().send(notification);
    }
}
