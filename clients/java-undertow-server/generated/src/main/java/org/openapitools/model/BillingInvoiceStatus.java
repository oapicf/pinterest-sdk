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
 * The status of a billing invoice.
 */

/**
 * The status of a billing invoice.
 */
public enum BillingInvoiceStatus {
    
        OPEN("OPEN"),
        
        CLOSED("CLOSED");

private String value;

BillingInvoiceStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BillingInvoiceStatus fromValue(String text) {
for (BillingInvoiceStatus b : BillingInvoiceStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


