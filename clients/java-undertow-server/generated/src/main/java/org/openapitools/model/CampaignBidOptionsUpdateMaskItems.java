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
 * Fields that can be updated in campaign bid options.
 */

/**
 * Fields that can be updated in campaign bid options.
 */
public enum CampaignBidOptionsUpdateMaskItems {
    
        AUDIENCE("AUDIENCE"),
        
        APP_TYPE("APP_TYPE"),
        
        PLACEMENT("PLACEMENT"),
        
        GENDER("GENDER"),
        
        AGE_BUCKET("AGE_BUCKET"),
        
        FREQUENCY("FREQUENCY");

private String value;

CampaignBidOptionsUpdateMaskItems(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static CampaignBidOptionsUpdateMaskItems fromValue(String text) {
for (CampaignBidOptionsUpdateMaskItems b : CampaignBidOptionsUpdateMaskItems.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


