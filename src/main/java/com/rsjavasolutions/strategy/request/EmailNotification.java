package com.rsjavasolutions.strategy.request;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
public class EmailNotification {

    @Email
    private String recipient;

    @NotNull
    private String subject;

    @NotNull
    private String contents;
}
