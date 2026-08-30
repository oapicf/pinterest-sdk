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
 * Field by which to sort billing invoices.
 */

/**
 * Field by which to sort billing invoices.
 */
public enum BillingInvoiceSortField {
    
        DUE_DATE("DUE_DATE"),
        
        BILLING_PERIOD("BILLING_PERIOD"),
        
        DOCUMENT_TYPE("DOCUMENT_TYPE"),
        
        TOTAL_AMOUNT("TOTAL_AMOUNT"),
        
        INVOICE_NUMBER("INVOICE_NUMBER");

private String value;

BillingInvoiceSortField(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static BillingInvoiceSortField fromValue(String text) {
for (BillingInvoiceSortField b : BillingInvoiceSortField.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


