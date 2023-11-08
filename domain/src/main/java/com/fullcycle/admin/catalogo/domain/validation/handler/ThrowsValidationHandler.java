package com.fullcycle.admin.catalogo.domain.validation.handler;

import com.fullcycle.admin.catalogo.domain.exceptions.DomainException;
import com.fullcycle.admin.catalogo.domain.validation.Error;
import com.fullcycle.admin.catalogo.domain.validation.ValidationrHandler;

import java.util.List;

public class ThrowsValidationHandler implements ValidationrHandler {
    @Override
    public ValidationrHandler append(final Error anError) {
        throw DomainException.with(anError);
    }

    @Override
    public ValidationrHandler append(final ValidationrHandler aHandler) {

        throw DomainException.with(aHandler.getErrors());
    }

    @Override
    public ValidationrHandler validate(final Validation aValidation) {
        try{
            aValidation.validate();
        } catch (final Exception ex){
            throw DomainException.with(new Error(ex.getMessage()));
        }
        return this;
    }

    @Override
    public List<Error> getErrors() {
        return List.of();
    }
}
