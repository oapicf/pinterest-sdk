/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 */

/**
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 */
public enum Role {
    
        UNKNOWN("UNKNOWN"),
        
        OWNER("OWNER"),
        
        ADMIN("ADMIN"),
        
        ANALYST("ANALYST"),
        
        SOS_READER("SOS_READER"),
        
        FINANCE_MANAGER("FINANCE_MANAGER"),
        
        AUDIENCE_MANAGER("AUDIENCE_MANAGER"),
        
        CAMPAIGN_MANAGER("CAMPAIGN_MANAGER"),
        
        CATALOGS_MANAGER("CATALOGS_MANAGER"),
        
        RESTRICTED_OWNER("RESTRICTED_OWNER"),
        
        PROFILE_MANAGER("PROFILE_MANAGER"),
        
        PROFILE_PUBLISHER("PROFILE_PUBLISHER"),
        
        RESOURCE_PINNER_LIST_OWNER("RESOURCE_PINNER_LIST_OWNER"),
        
        RESOURCE_PINNER_LIST_READER("RESOURCE_PINNER_LIST_READER"),
        
        BIZ_PINNER_LIST_SHARER("BIZ_PINNER_LIST_SHARER"),
        
        RESOURCE_CONVERSION_TAGS_READER("RESOURCE_CONVERSION_TAGS_READER");

private String value;

Role(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static Role fromValue(String text) {
for (Role b : Role.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


