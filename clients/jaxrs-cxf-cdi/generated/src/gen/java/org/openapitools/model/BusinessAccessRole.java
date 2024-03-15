package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Permission role for business access.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BusinessAccessRole {

    @JsonProperty("OWNER") OWNER(String.valueOf("OWNER")), @JsonProperty("ADMIN") ADMIN(String.valueOf("ADMIN")), @JsonProperty("ANALYST") ANALYST(String.valueOf("ANALYST")), @JsonProperty("SOS_READER") SOS_READER(String.valueOf("SOS_READER")), @JsonProperty("FINANCE_MANAGER") FINANCE_MANAGER(String.valueOf("FINANCE_MANAGER")), @JsonProperty("AUDIENCE_MANAGER") AUDIENCE_MANAGER(String.valueOf("AUDIENCE_MANAGER")), @JsonProperty("CAMPAIGN_MANAGER") CAMPAIGN_MANAGER(String.valueOf("CAMPAIGN_MANAGER")), @JsonProperty("CATALOGS_MANAGER") CATALOGS_MANAGER(String.valueOf("CATALOGS_MANAGER")), @JsonProperty("RESTRICTED_OWNER") RESTRICTED_OWNER(String.valueOf("RESTRICTED_OWNER")), @JsonProperty("PROFILE_MANAGER") PROFILE_MANAGER(String.valueOf("PROFILE_MANAGER")), @JsonProperty("PROFILE_PUBLISHER") PROFILE_PUBLISHER(String.valueOf("PROFILE_PUBLISHER")), @JsonProperty("RESOURCE_PINNER_LIST_OWNER") RESOURCE_PINNER_LIST_OWNER(String.valueOf("RESOURCE_PINNER_LIST_OWNER")), @JsonProperty("RESOURCE_PINNER_LIST_READER") RESOURCE_PINNER_LIST_READER(String.valueOf("RESOURCE_PINNER_LIST_READER")), @JsonProperty("BIZ_PINNER_LIST_SHARER") BIZ_PINNER_LIST_SHARER(String.valueOf("BIZ_PINNER_LIST_SHARER")), @JsonProperty("RESOURCE_CONVERSION_TAGS_READER") RESOURCE_CONVERSION_TAGS_READER(String.valueOf("RESOURCE_CONVERSION_TAGS_READER"));


    private String value;

    BusinessAccessRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BusinessAccessRole fromValue(String value) {
        for (BusinessAccessRole b : BusinessAccessRole.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



