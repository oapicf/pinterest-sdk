package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Level of the reporting request
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MetricsReportingLevel {

    @JsonProperty("ADVERTISER") ADVERTISER(String.valueOf("ADVERTISER")), @JsonProperty("ADVERTISER_TARGETING") ADVERTISER_TARGETING(String.valueOf("ADVERTISER_TARGETING")), @JsonProperty("CAMPAIGN") CAMPAIGN(String.valueOf("CAMPAIGN")), @JsonProperty("CAMPAIGN_TARGETING") CAMPAIGN_TARGETING(String.valueOf("CAMPAIGN_TARGETING")), @JsonProperty("AD_GROUP") AD_GROUP(String.valueOf("AD_GROUP")), @JsonProperty("AD_GROUP_TARGETING") AD_GROUP_TARGETING(String.valueOf("AD_GROUP_TARGETING")), @JsonProperty("PIN_PROMOTION") PIN_PROMOTION(String.valueOf("PIN_PROMOTION")), @JsonProperty("PIN_PROMOTION_TARGETING") PIN_PROMOTION_TARGETING(String.valueOf("PIN_PROMOTION_TARGETING")), @JsonProperty("KEYWORD") KEYWORD(String.valueOf("KEYWORD")), @JsonProperty("PRODUCT_GROUP") PRODUCT_GROUP(String.valueOf("PRODUCT_GROUP")), @JsonProperty("PRODUCT_GROUP_TARGETING") PRODUCT_GROUP_TARGETING(String.valueOf("PRODUCT_GROUP_TARGETING")), @JsonProperty("PRODUCT_ITEM") PRODUCT_ITEM(String.valueOf("PRODUCT_ITEM"));


    private String value;

    MetricsReportingLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MetricsReportingLevel fromValue(String value) {
        for (MetricsReportingLevel b : MetricsReportingLevel.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



