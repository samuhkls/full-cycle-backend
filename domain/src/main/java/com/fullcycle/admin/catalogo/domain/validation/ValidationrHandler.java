package com.fullcycle.admin.catalogo.domain.validation;

import java.util.List;

public interface ValidationrHandler {

    ValidationrHandler append(Error anError);
    ValidationrHandler append(ValidationrHandler aHandler);
    ValidationrHandler validate(Validation aValidation);

    List<Error> getErrors();

    default boolean hasErrors(){

        return getErrors() != null && !getErrors().isEmpty();
    }

    default Error firstError(){
        if(getErrors() != null && !getErrors().isEmpty()){
            return getErrors().get(0);
        } else{
            return null;
        }
    }

    public interface Validation {
        void validate();
    }
}
