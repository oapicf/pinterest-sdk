package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionObjectiveType;
import org.openapitools.model.ConversionProductAttributionType;
import org.openapitools.model.ConversionProductReportBreakdownType;
import org.openapitools.model.ConversionProductReportGranularity;
import org.openapitools.model.ConversionProductReportLevel;
import org.openapitools.model.ConversionProductReportingColumn;
import org.openapitools.model.ConversionReportTimeType;

@Canonical
class ConversionProductReportCreate {
    /*   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. */
    List<String> adGroupIds = new ArrayList<>()
    /*   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. */
    List<String> campaignIds = new ArrayList<>()
    /* List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION']. */
    List<ConversionObjectiveType> campaignObjectiveTypes = new ArrayList<>()
    /* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    ConversionAttributionWindowDays clickWindowDays
    /* Metric and entity columns */
    List<ConversionProductReportingColumn> columns = new ArrayList<>()
    /*   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. */
    ConversionProductAttributionType conversionProductAttributionType
    /* Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. */
    ConversionProductReportBreakdownType conversionProductBreakdown
    /* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
    ConversionReportTimeType conversionReportTime
    /*   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. */
    String endDate
    /* Report granularity for time-based metric aggregation */
    ConversionProductReportGranularity granularity
    /* Level of the report */
    ConversionProductReportLevel level
    /*   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. */
    List<String> productSkuIds = new ArrayList<>()
    /* Name of the conversion product report */
    String reportName
    /*   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. */
    String startDate
    /* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. */
    ConversionAttributionWindowDays viewWindowDays
}
