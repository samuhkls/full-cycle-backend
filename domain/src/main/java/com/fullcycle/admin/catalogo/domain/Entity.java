package com.fullcycle.admin.catalogo.domain;

import com.fullcycle.admin.catalogo.domain.validation.ValidationrHandler;

import java.util.Objects;

public abstract class Entity<ID extends Identifier> {

    protected final ID Id;


    protected Entity(final ID id) {
        Objects.requireNonNull(id, "'id' should not be null");
        Id = id;
    }

    public abstract void validate(ValidationrHandler handler);

    public ID getId() {
        return Id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Entity<?> entity = (Entity<?>) o;
        return Objects.equals(getId(), entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
