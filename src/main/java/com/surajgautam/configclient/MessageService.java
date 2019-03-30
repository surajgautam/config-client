package com.surajgautam.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by Suraj Gautam.
 */
@Component
public class MessageService {

    @Value("${message}")
    public String message;

    public String getMessage(){
        return message;
    }

}
