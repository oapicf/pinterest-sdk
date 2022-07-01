/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: blah@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Summary status for campaign
 */

/**
 * Summary status for campaign
 */
public enum CampaignSummaryStatus {
    
        RUNNING("RUNNING"),
        
        PAUSED("PAUSED"),
        
        NOT_STARTED("NOT_STARTED"),
        
        COMPLETED("COMPLETED"),
        
        ADVERTISER_DISABLED("ADVERTISER_DISABLED"),
        
        ARCHIVED("ARCHIVED");

private String value;

CampaignSummaryStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static CampaignSummaryStatus fromValue(String text) {
for (CampaignSummaryStatus b : CampaignSummaryStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


