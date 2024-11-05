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
 * Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 */

/**
 * Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 */
public enum CreativeType {
    
        REGULAR("REGULAR"),
        
        VIDEO("VIDEO"),
        
        SHOPPING("SHOPPING"),
        
        CAROUSEL("CAROUSEL"),
        
        MAX_VIDEO("MAX_VIDEO"),
        
        SHOP_THE_PIN("SHOP_THE_PIN"),
        
        COLLECTION("COLLECTION"),
        
        IDEA("IDEA"),
        
        SHOWCASE("SHOWCASE"),
        
        QUIZ("QUIZ");

private String value;

CreativeType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static CreativeType fromValue(String text) {
for (CreativeType b : CreativeType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


