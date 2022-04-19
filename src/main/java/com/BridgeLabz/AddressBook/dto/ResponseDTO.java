package com.BridgeLabz.AddressBook.dto;

import lombok.*;

public @Data class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message,Object data){
        this.message=message;
        this.data=data;
    }
}
