/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Marketing Mix Modeling (MMM) Reporting Columns
 */

/**
 * Marketing Mix Modeling (MMM) Reporting Columns
 */
public enum MMMReportingColumn {
    
        SPEND_IN_DOLLAR("SPEND_IN_DOLLAR"),
        
        SPEND_IN_MICRO_DOLLAR("SPEND_IN_MICRO_DOLLAR"),
        
        ECPC_IN_DOLLAR("ECPC_IN_DOLLAR"),
        
        ECTR("ECTR"),
        
        CAMPAIGN_NAME("CAMPAIGN_NAME"),
        
        TOTAL_ENGAGEMENT("TOTAL_ENGAGEMENT"),
        
        EENGAGEMENT_RATE("EENGAGEMENT_RATE"),
        
        ECPM_IN_DOLLAR("ECPM_IN_DOLLAR"),
        
        CAMPAIGN_ID("CAMPAIGN_ID"),
        
        ADVERTISER_ID("ADVERTISER_ID"),
        
        AD_GROUP_ID("AD_GROUP_ID"),
        
        AD_GROUP_NAME("AD_GROUP_NAME"),
        
        CLICKTHROUGH_1("CLICKTHROUGH_1"),
        
        IMPRESSION_1("IMPRESSION_1"),
        
        CLICKTHROUGH_2("CLICKTHROUGH_2"),
        
        IMPRESSION_2("IMPRESSION_2"),
        
        TOTAL_CLICKTHROUGH("TOTAL_CLICKTHROUGH"),
        
        TOTAL_IMPRESSION("TOTAL_IMPRESSION"),
        
        ADVERTISER_NAME("ADVERTISER_NAME"),
        
        SPEND_ORDER_LINE_PAID_TYPE("SPEND_ORDER_LINE_PAID_TYPE");

private String value;

MMMReportingColumn(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static MMMReportingColumn fromValue(String text) {
for (MMMReportingColumn b : MMMReportingColumn.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


