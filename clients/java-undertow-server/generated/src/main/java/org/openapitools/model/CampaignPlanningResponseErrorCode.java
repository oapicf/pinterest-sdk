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
 * Error code returned for a campaign planning estimate failure.
 */

/**
 * Error code returned for a campaign planning estimate failure.
 */
public enum CampaignPlanningResponseErrorCode {
    
        SERVER_ERROR("SERVER_ERROR"),
        
        AUDIENCE_LIST_MISSING("AUDIENCE_LIST_MISSING"),
        
        INVALID_REQUEST("INVALID_REQUEST"),
        
        PRODUCT_GROUP_MISSING("PRODUCT_GROUP_MISSING");

private String value;

CampaignPlanningResponseErrorCode(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static CampaignPlanningResponseErrorCode fromValue(String text) {
for (CampaignPlanningResponseErrorCode b : CampaignPlanningResponseErrorCode.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


