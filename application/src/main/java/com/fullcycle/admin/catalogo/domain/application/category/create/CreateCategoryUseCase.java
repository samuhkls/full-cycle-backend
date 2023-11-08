package com.fullcycle.admin.catalogo.domain.application.category.create;

import com.fullcycle.admin.catalogo.domain.application.UseCase;
import com.fullcycle.admin.catalogo.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase
        extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
