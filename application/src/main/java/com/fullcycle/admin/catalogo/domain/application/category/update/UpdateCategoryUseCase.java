package com.fullcycle.admin.catalogo.domain.application.category.update;

import com.fullcycle.admin.catalogo.domain.application.UseCase;
import com.fullcycle.admin.catalogo.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase
        extends UseCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}
