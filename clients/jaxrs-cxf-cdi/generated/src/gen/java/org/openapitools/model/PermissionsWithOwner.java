package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum PermissionsWithOwner {

    @JsonProperty("ADMIN") ADMIN(String.valueOf("ADMIN")), @JsonProperty("ANALYST") ANALYST(String.valueOf("ANALYST")), @JsonProperty("FINANCE_MANAGER") FINANCE_MANAGER(String.valueOf("FINANCE_MANAGER")), @JsonProperty("AUDIENCE_MANAGER") AUDIENCE_MANAGER(String.valueOf("AUDIENCE_MANAGER")), @JsonProperty("CAMPAIGN_MANAGER") CAMPAIGN_MANAGER(String.valueOf("CAMPAIGN_MANAGER")), @JsonProperty("CATALOGS_MANAGER") CATALOGS_MANAGER(String.valueOf("CATALOGS_MANAGER")), @JsonProperty("CATALOGS_VIEWER") CATALOGS_VIEWER(String.valueOf("CATALOGS_VIEWER")), @JsonProperty("PROFILE_PUBLISHER") PROFILE_PUBLISHER(String.valueOf("PROFILE_PUBLISHER")), @JsonProperty("OWNER") OWNER(String.valueOf("OWNER"));


    private String value;

    PermissionsWithOwner(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PermissionsWithOwner fromValue(String value) {
        for (PermissionsWithOwner b : PermissionsWithOwner.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



