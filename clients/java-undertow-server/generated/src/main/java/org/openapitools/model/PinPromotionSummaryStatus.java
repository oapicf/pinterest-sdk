/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Summary status for pin promotions
 */

/**
 * Summary status for pin promotions
 */
public enum PinPromotionSummaryStatus {
    
        APPROVED("APPROVED"),
        
        PAUSED("PAUSED"),
        
        PENDING("PENDING"),
        
        REJECTED("REJECTED"),
        
        ADVERTISER_DISABLED("ADVERTISER_DISABLED"),
        
        ARCHIVED("ARCHIVED");

private String value;

PinPromotionSummaryStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static PinPromotionSummaryStatus fromValue(String text) {
for (PinPromotionSummaryStatus b : PinPromotionSummaryStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


