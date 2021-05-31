package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessagesUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessagesUtils.NO_RECORDS_FOUND);
    }
}
