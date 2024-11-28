package com.example.foodmanagement.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.identity.IdentityColumnSupportImpl;
import org.hibernate.dialect.identity.IdentityColumnSupport;

public class SQLiteDialect extends Dialect {

    public SQLiteDialect() {
        super();
        registerColumnType(1, "text");
        registerColumnType(4, "integer");
        registerColumnType(12, "real");
        registerColumnType(16, "blob");
    }

    @Override
    public IdentityColumnSupport getIdentityColumnSupport() {
        return new IdentityColumnSupportImpl();
    }

    @Override
    public boolean canAddColumn() {
        return true;
    }

    @Override
    public String getAddColumnString() {
        return "add column";
    }
}
