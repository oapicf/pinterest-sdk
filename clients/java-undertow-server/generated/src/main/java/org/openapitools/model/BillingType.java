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
 * Advertisers billing type
 */

/**
 * Advertisers billing type
 */
public enum BillingType {
    
        CREDIT_CARD("CREDIT_CARD"),
        
        INVOICE("INVOICE"),
        
        INTERNAL("INTERNAL"),
        
        RECURRING("RECURRING"),
        
        PREPAID("PREPAID");

private String value;

BillingType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BillingType fromValue(String text) {
for (BillingType b : BillingType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


