package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Permission levels available on a business asset.
 */

public enum Permissions {

    ADMIN("ADMIN"),
    ANALYST("ANALYST"),
    FINANCE_MANAGER("FINANCE_MANAGER"),
    FINANCE_EDIT("FINANCE_EDIT"),
    FINANCE_VIEW("FINANCE_VIEW"),
    AUDIENCE_MANAGER("AUDIENCE_MANAGER"),
    CAMPAIGN_MANAGER("CAMPAIGN_MANAGER"),
    CATALOGS_MANAGER("CATALOGS_MANAGER"),
    CATALOGS_VIEWER("CATALOGS_VIEWER"),
    PROFILE_PUBLISHER("PROFILE_PUBLISHER"),
    CONSUMER_USER("CONSUMER_USER"),
    BIZ_PINNER_LIST_SHARER("BIZ_PINNER_LIST_SHARER");

    private String value;

    Permissions(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Permissions fromValue(String text) {
        for (Permissions b : Permissions.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

