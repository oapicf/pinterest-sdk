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
 * Gets or Sets Pinterest.Lib.PaginationOrder
 */
public enum PinterestLibPaginationOrder {
    
        ASCENDING("ASCENDING"),
        
        DESCENDING("DESCENDING");

private String value;

PinterestLibPaginationOrder(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static PinterestLibPaginationOrder fromValue(String text) {
for (PinterestLibPaginationOrder b : PinterestLibPaginationOrder.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


