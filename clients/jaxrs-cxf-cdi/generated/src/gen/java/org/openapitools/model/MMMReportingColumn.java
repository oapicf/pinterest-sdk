package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Marketing Mix Modeling (MMM) Reporting Columns
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MMMReportingColumn {

    @JsonProperty("SPEND_IN_DOLLAR") SPEND_IN_DOLLAR(String.valueOf("SPEND_IN_DOLLAR")), @JsonProperty("SPEND_IN_MICRO_DOLLAR") SPEND_IN_MICRO_DOLLAR(String.valueOf("SPEND_IN_MICRO_DOLLAR")), @JsonProperty("ECPC_IN_DOLLAR") ECPC_IN_DOLLAR(String.valueOf("ECPC_IN_DOLLAR")), @JsonProperty("ECTR") ECTR(String.valueOf("ECTR")), @JsonProperty("CAMPAIGN_NAME") CAMPAIGN_NAME(String.valueOf("CAMPAIGN_NAME")), @JsonProperty("TOTAL_ENGAGEMENT") TOTAL_ENGAGEMENT(String.valueOf("TOTAL_ENGAGEMENT")), @JsonProperty("EENGAGEMENT_RATE") EENGAGEMENT_RATE(String.valueOf("EENGAGEMENT_RATE")), @JsonProperty("ECPM_IN_DOLLAR") ECPM_IN_DOLLAR(String.valueOf("ECPM_IN_DOLLAR")), @JsonProperty("CAMPAIGN_ID") CAMPAIGN_ID(String.valueOf("CAMPAIGN_ID")), @JsonProperty("ADVERTISER_ID") ADVERTISER_ID(String.valueOf("ADVERTISER_ID")), @JsonProperty("AD_GROUP_ID") AD_GROUP_ID(String.valueOf("AD_GROUP_ID")), @JsonProperty("AD_GROUP_NAME") AD_GROUP_NAME(String.valueOf("AD_GROUP_NAME")), @JsonProperty("CLICKTHROUGH_1") CLICKTHROUGH_1(String.valueOf("CLICKTHROUGH_1")), @JsonProperty("IMPRESSION_1") IMPRESSION_1(String.valueOf("IMPRESSION_1")), @JsonProperty("CLICKTHROUGH_2") CLICKTHROUGH_2(String.valueOf("CLICKTHROUGH_2")), @JsonProperty("IMPRESSION_2") IMPRESSION_2(String.valueOf("IMPRESSION_2")), @JsonProperty("TOTAL_CLICKTHROUGH") TOTAL_CLICKTHROUGH(String.valueOf("TOTAL_CLICKTHROUGH")), @JsonProperty("TOTAL_IMPRESSION") TOTAL_IMPRESSION(String.valueOf("TOTAL_IMPRESSION")), @JsonProperty("ADVERTISER_NAME") ADVERTISER_NAME(String.valueOf("ADVERTISER_NAME")), @JsonProperty("SPEND_ORDER_LINE_PAID_TYPE") SPEND_ORDER_LINE_PAID_TYPE(String.valueOf("SPEND_ORDER_LINE_PAID_TYPE"));


    private String value;

    MMMReportingColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MMMReportingColumn fromValue(String value) {
        for (MMMReportingColumn b : MMMReportingColumn.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



