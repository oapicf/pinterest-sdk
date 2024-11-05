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
 * Summary status for ad group
 */

/**
 * Summary status for ad group
 */
public enum AdGroupSummaryStatus {
    
        RUNNING("RUNNING"),
        
        PAUSED("PAUSED"),
        
        NOT_STARTED("NOT_STARTED"),
        
        COMPLETED("COMPLETED"),
        
        ADVERTISER_DISABLED("ADVERTISER_DISABLED"),
        
        ARCHIVED("ARCHIVED"),
        
        DRAFT("DRAFT"),
        
        DELETED_DRAFT("DELETED_DRAFT");

private String value;

AdGroupSummaryStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AdGroupSummaryStatus fromValue(String text) {
for (AdGroupSummaryStatus b : AdGroupSummaryStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


