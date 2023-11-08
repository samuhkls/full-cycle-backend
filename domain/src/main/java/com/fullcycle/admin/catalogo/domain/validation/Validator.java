package com.fullcycle.admin.catalogo.domain.validation;

public abstract class Validator {

    private final ValidationrHandler handler;

    protected Validator(final ValidationrHandler aHandler){
        this.handler = aHandler;
    }

    public abstract void validate();

    protected ValidationrHandler validationrHandler(){
        return this.handler;
    }

}
