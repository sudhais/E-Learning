package com.onlineCourse.service.interfaces;

import com.onlineCourse.entities.SmsRequest;

public interface SmsService {
    void sendSms(SmsRequest smsRequest);
}
