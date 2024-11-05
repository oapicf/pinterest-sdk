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
 * Metrics availablity, e.g., \"READY\".
 */

/**
 * Metrics availablity, e.g., \"READY\".
 */
public enum DataStatus {
    
        PROCESSING("PROCESSING"),
        
        READY("READY"),
        
        ESTIMATE("ESTIMATE"),
        
        BEFORE_BUSINESS_CREATED("BEFORE_BUSINESS_CREATED"),
        
        BEFORE_DATA_RETENTION_PERIOD("BEFORE_DATA_RETENTION_PERIOD"),
        
        BEFORE_PIN_DATA_RETENTION_PERIOD("BEFORE_PIN_DATA_RETENTION_PERIOD"),
        
        BEFORE_METRIC_START_DATE("BEFORE_METRIC_START_DATE"),
        
        BEFORE_CORE_METRIC_START_DATE("BEFORE_CORE_METRIC_START_DATE"),
        
        BEFORE_PIN_FORMAT_METRIC_START_DATE("BEFORE_PIN_FORMAT_METRIC_START_DATE"),
        
        BEFORE_AUDIENCE_METRIC_START_DATE("BEFORE_AUDIENCE_METRIC_START_DATE"),
        
        BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE("BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE"),
        
        BEFORE_VIDEO_METRIC_START_DATE("BEFORE_VIDEO_METRIC_START_DATE"),
        
        BEFORE_CONVERSION_METRIC_START_DATE("BEFORE_CONVERSION_METRIC_START_DATE"),
        
        PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD("PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD"),
        
        IN_BAD_TAG_DATE("IN_BAD_TAG_DATE"),
        
        BEFORE_PUBLISHED_METRIC_START_DATE("BEFORE_PUBLISHED_METRIC_START_DATE"),
        
        BEFORE_ASSIST_METRIC_START_DATE("BEFORE_ASSIST_METRIC_START_DATE"),
        
        BEFORE_PIN_CREATED("BEFORE_PIN_CREATED"),
        
        BEFORE_ACCOUNT_CLAIMED("BEFORE_ACCOUNT_CLAIMED"),
        
        BEFORE_DEMOGRAPHIC_FILTERS_START_DATE("BEFORE_DEMOGRAPHIC_FILTERS_START_DATE"),
        
        AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD("AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD"),
        
        AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD("AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD"),
        
        BEFORE_PRODUCT_GROUP_FILTER_START_DATE("BEFORE_PRODUCT_GROUP_FILTER_START_DATE");

private String value;

DataStatus(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static DataStatus fromValue(String text) {
for (DataStatus b : DataStatus.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


