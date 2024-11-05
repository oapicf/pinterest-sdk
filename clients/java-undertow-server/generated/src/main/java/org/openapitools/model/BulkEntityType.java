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
 * Refers ads entity type
 */

/**
 * Refers ads entity type
 */
public enum BulkEntityType {
    
        CAMPAIGN("CAMPAIGN"),
        
        AD_GROUP("AD_GROUP"),
        
        PRODUCT_GROUP("PRODUCT_GROUP"),
        
        AD("AD"),
        
        KEYWORD("KEYWORD");

private String value;

BulkEntityType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BulkEntityType fromValue(String text) {
for (BulkEntityType b : BulkEntityType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


