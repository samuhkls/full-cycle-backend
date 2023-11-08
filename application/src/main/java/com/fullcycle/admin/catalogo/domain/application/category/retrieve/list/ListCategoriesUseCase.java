package com.fullcycle.admin.catalogo.domain.application.category.retrieve.list;

import com.fullcycle.admin.catalogo.domain.application.UseCase;
import com.fullcycle.admin.catalogo.domain.category.CategorySearchQuery;
import com.fullcycle.admin.catalogo.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase
        extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> {
}
