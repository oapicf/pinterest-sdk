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
 * User list type
 */

/**
 * User list type
 */
public enum UserListType {
    
        EMAIL("EMAIL"),
        
        IDFA("IDFA"),
        
        MAID("MAID"),
        
        LR_ID("LR_ID"),
        
        DLX_ID("DLX_ID"),
        
        HASHED_PINNER_ID("HASHED_PINNER_ID");

private String value;

UserListType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static UserListType fromValue(String text) {
for (UserListType b : UserListType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


