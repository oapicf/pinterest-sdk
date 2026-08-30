package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Permission levels available on a business asset.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum Permissions {

    @JsonProperty("ADMIN") ADMIN(String.valueOf("ADMIN")), @JsonProperty("ANALYST") ANALYST(String.valueOf("ANALYST")), @JsonProperty("FINANCE_MANAGER") FINANCE_MANAGER(String.valueOf("FINANCE_MANAGER")), @JsonProperty("FINANCE_EDIT") FINANCE_EDIT(String.valueOf("FINANCE_EDIT")), @JsonProperty("FINANCE_VIEW") FINANCE_VIEW(String.valueOf("FINANCE_VIEW")), @JsonProperty("AUDIENCE_MANAGER") AUDIENCE_MANAGER(String.valueOf("AUDIENCE_MANAGER")), @JsonProperty("CAMPAIGN_MANAGER") CAMPAIGN_MANAGER(String.valueOf("CAMPAIGN_MANAGER")), @JsonProperty("CATALOGS_MANAGER") CATALOGS_MANAGER(String.valueOf("CATALOGS_MANAGER")), @JsonProperty("CATALOGS_VIEWER") CATALOGS_VIEWER(String.valueOf("CATALOGS_VIEWER")), @JsonProperty("PROFILE_PUBLISHER") PROFILE_PUBLISHER(String.valueOf("PROFILE_PUBLISHER")), @JsonProperty("CONSUMER_USER") CONSUMER_USER(String.valueOf("CONSUMER_USER")), @JsonProperty("BIZ_PINNER_LIST_SHARER") BIZ_PINNER_LIST_SHARER(String.valueOf("BIZ_PINNER_LIST_SHARER"));


    private String value;

    Permissions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Permissions fromValue(String value) {
        for (Permissions b : Permissions.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



