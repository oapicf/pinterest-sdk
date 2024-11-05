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
 * conversion tag type
 */

/**
 * conversion tag type
 */
public enum ConversionTagType {
    
        PAGE_LOAD("PAGE_LOAD"),
        
        UNKNOWN("UNKNOWN"),
        
        INITIALIZED("INITIALIZED"),
        
        PAGE_VISIT("PAGE_VISIT"),
        
        SIGNUP("SIGNUP"),
        
        CHECKOUT("CHECKOUT"),
        
        CUSTOM("CUSTOM"),
        
        VIEW_CATEGORY("VIEW_CATEGORY"),
        
        SEARCH("SEARCH"),
        
        ADD_TO_CART("ADD_TO_CART"),
        
        WATCH_VIDEO("WATCH_VIDEO"),
        
        LEAD("LEAD"),
        
        APP_INSTALL("APP_INSTALL"),
        
        WEB_SESSION("WEB_SESSION"),
        
        EXTERNAL_MEASUREMENT("EXTERNAL_MEASUREMENT");

private String value;

ConversionTagType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ConversionTagType fromValue(String text) {
for (ConversionTagType b : ConversionTagType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


