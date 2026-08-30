/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * The type of OAuth grant being requested.
 */

/**
 * The type of OAuth grant being requested.
 */
public enum TokenGrantType {
    
        AUTHORIZATION_CODE("authorization_code"),
        
        REFRESH_TOKEN("refresh_token"),
        
        CLIENT_CREDENTIALS("client_credentials");

private String value;

TokenGrantType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static TokenGrantType fromValue(String text) {
for (TokenGrantType b : TokenGrantType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


