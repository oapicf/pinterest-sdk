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
 * Type of the catalog entity.
 */

/**
 * Type of the catalog entity.
 */
public enum CatalogsType {
    
        RETAIL("RETAIL"),
        
        HOTEL("HOTEL"),
        
        CREATIVE_ASSETS("CREATIVE_ASSETS");

private String value;

CatalogsType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static CatalogsType fromValue(String text) {
for (CatalogsType b : CatalogsType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


