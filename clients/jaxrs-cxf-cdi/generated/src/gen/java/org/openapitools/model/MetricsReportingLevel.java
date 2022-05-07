package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Level of the reporting request
 **/

public enum MetricsReportingLevel {

    ADVERTISER(String.valueOf("ADVERTISER")), ADVERTISER_TARGETING(String.valueOf("ADVERTISER_TARGETING")), CAMPAIGN(String.valueOf("CAMPAIGN")), CAMPAIGN_TARGETING(String.valueOf("CAMPAIGN_TARGETING")), AD_GROUP(String.valueOf("AD_GROUP")), AD_GROUP_TARGETING(String.valueOf("AD_GROUP_TARGETING")), PIN_PROMOTION(String.valueOf("PIN_PROMOTION")), PIN_PROMOTION_TARGETING(String.valueOf("PIN_PROMOTION_TARGETING")), KEYWORD(String.valueOf("KEYWORD")), PRODUCT_GROUP(String.valueOf("PRODUCT_GROUP")), PRODUCT_GROUP_TARGETING(String.valueOf("PRODUCT_GROUP_TARGETING")), PRODUCT_ITEM(String.valueOf("PRODUCT_ITEM"));


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



