package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionProductReportingColumn;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.ObjectiveType;

@Canonical
class ConversionProductReportRequest {
    /* List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP. */
    List<String> adGroupIds = new ArrayList<>()
    /* List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN. */
    List<String> campaignIds = new ArrayList<>()
    /* List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION']. */
    List<ObjectiveType> campaignObjectiveTypes = new ArrayList<>()
    /* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.NUMBER_30
    /* Metric and entity columns */
    List<ConversionProductReportingColumn> columns = new ArrayList<>()

    enum ConversionProductAttributionTypeEnum {
    
        DEFAULT("DEFAULT"),
        
        BRAND_ATTRIBUTION("BRAND_ATTRIBUTION")
    
        private final String value
    
        ConversionProductAttributionTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    ConversionProductAttributionTypeEnum conversionProductAttributionType

    enum ConversionProductBreakdownEnum {
    
        PRODUCT_BRAND("PRODUCT_BRAND"),
        
        PRODUCT_CATEGORY("PRODUCT_CATEGORY"),
        
        PRODUCT_BRAND_AND_CATEGORY("PRODUCT_BRAND_AND_CATEGORY"),
        
        PRODUCT_SKU("PRODUCT_SKU"),
        
        PRODUCT_SKU_GROUP("PRODUCT_SKU_GROUP")
    
        private final String value
    
        ConversionProductBreakdownEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    ConversionProductBreakdownEnum conversionProductBreakdown
    /* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
    ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION"
    /* Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports. */
    String endDate

    enum GranularityEnum {
    
        WEEK("WEEK"),
        
        MONTH("MONTH"),
        
        TOTAL("TOTAL")
    
        private final String value
    
        GranularityEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly. */
    GranularityEnum granularity

    enum LevelEnum {
    
        ADVERTISER("ADVERTISER"),
        
        CAMPAIGN("CAMPAIGN"),
        
        AD_GROUP("AD_GROUP")
    
        private final String value
    
        LevelEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* Level of the report */
    LevelEnum level
    /* List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. */
    List<String> productSkuIds = new ArrayList<>()
    /* Name of the conversion product report. */
    String reportName
    /* Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required. */
    String startDate
    /* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day. */
    ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.NUMBER_30
}
