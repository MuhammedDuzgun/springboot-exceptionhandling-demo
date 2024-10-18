package com.demo.exception_handling_enesb.exception;

import lombok.Getter;

@Getter
public enum MessageType {

    NO_RECORD_EXIST("1001","Kayit Bulunamadı"),
    GENERAL_EXCEPTİON("9999","Genel bir hata oluştu");

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private final String code;
    private final String message;

}
