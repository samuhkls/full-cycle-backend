package com.fullcycle.admin.catalogo.domain.application;

import com.fullcycle.admin.catalogo.domain.category.Category;

public abstract class UseCase<IN, OUT> {

    public abstract OUT execute(IN anIN);
}