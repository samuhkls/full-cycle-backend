package com.fullcycle.admin.catalogo.domain.application.category.delete;

import com.fullcycle.admin.catalogo.domain.category.Category;
import com.fullcycle.admin.catalogo.domain.category.CategoryGateway;
import com.fullcycle.admin.catalogo.domain.category.CategoryID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.doNothing;

@ExtendWith(MockitoExtension.class)
public class DeleteCategoryUseCaseTest {
    @InjectMocks
    private DefaultDeleteCategoryUseCase useCase;

    @Mock
    private CategoryGateway categoryGateway;

    @BeforeEach
    void cleanUp(){
        reset(categoryGateway);
    }

    @Test
    public void givenAValidId_whenCallsDeleteCategory_shouldBeOk(){
        final var aCategory =  Category.newCategory("filmes", "a categoria mais assistida", true);
        final var expectedid = aCategory.getId();

        doNothing().when(categoryGateway).deleteById(eq(expectedid));

        Assertions.assertDoesNotThrow(() -> useCase.execute(expectedid.getValue()));

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedid));
    }
    @Test
    public void givenAInvalidId_whenCallsDeleteCategory_shouldBeOk(){
        final var expectedid = CategoryID.from("123");

        doNothing().when(categoryGateway).deleteById(eq(expectedid));

        Assertions.assertDoesNotThrow(() -> useCase.execute(expectedid.getValue()));

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedid));
    }
    @Test
    public void givenAValidId_whenGatewayThrowsException_shouldReturnException(){
        final var aCategory =  Category.newCategory("filmes", "a categoria mais assistida", true);
        final var expectedid = aCategory.getId();

        doThrow(new IllegalStateException("Gateway error")).when(categoryGateway).deleteById(eq(expectedid));

        Assertions.assertThrows(IllegalStateException.class, () -> useCase.execute(expectedid.getValue()));

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedid));
    }
}
