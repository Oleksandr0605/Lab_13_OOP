package ua.edu.ucu.apps.task1;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.ToString;

@Data @ToString
public class TwitterUser {
    private String userMail;
    private String country;
    private LocalDateTime lastActiveTime;
}
