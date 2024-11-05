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
 * Summary status for product group
 */

/**
 * Summary status for product group
 */
public enum ProductGroupSummaryStatus {
    
        RUNNING("RUNNING"),
        
        PAUSED("PAUSED"),
        
        EXCLUDED("EXCLUDED"),
        
        ARCHIVED("ARCHIVED");

private String value;

ProductGroupSummaryStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ProductGroupSummaryStatus fromValue(String text) {
for (ProductGroupSummaryStatus b : ProductGroupSummaryStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


