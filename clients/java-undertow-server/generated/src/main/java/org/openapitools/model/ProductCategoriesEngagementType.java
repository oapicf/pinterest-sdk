/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Gets or Sets ProductCategoriesEngagementType
 */
public enum ProductCategoriesEngagementType {
    
        ENGAGEMENT("ENGAGEMENT"),
        
        OUTBOUND_CLICK("OUTBOUND_CLICK"),
        
        SAVE("SAVE");

private String value;

ProductCategoriesEngagementType(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ProductCategoriesEngagementType fromValue(String text) {
for (ProductCategoriesEngagementType b : ProductCategoriesEngagementType.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


