package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdAdsAnalyticsAsyncTargetingTypes;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.AdsAnalyticsMetricsFilter;
import org.openapitools.model.CampaignObjectiveType;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.CustomConversionEventMetrics;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.Granularity;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.PrimarySort;
import org.openapitools.model.ProductGroupSummaryStatus;
import org.openapitools.model.ReportingColumnAsync;
import org.openapitools.model.ReportingTimeZone;

@Canonical
class AdsAnalyticsCreateAsyncRequest {
    /* List of ad group ids */
    List<String> adGroupIds = new ArrayList<>()
    /* List of values for filtering */
    List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<>()
    /* List of ad ids. This parameter is not supported for Product Item level reports. */
    List<String> adIds = new ArrayList<>()
    /* List of values for filtering. This parameter is not supported for Product Item level reports. */
    List<PinPromotionSummaryStatus> adStatuses = new ArrayList<>()
    /* List of attribution types for the conversion report. */
    List<ConversionReportAttributionType> attributionTypes = new ArrayList<>()
    /* Campaign brand label for filtering. */
    String campaignBrandLabel
    /* Campaign custom label for filtering. */
    String campaignCustomLabel
    /* List of campaign ids */
    List<String> campaignIds = new ArrayList<>()
    /* List of values for filtering. [\"WEB_SESSIONS\"] is in BETA. */
    List<CampaignObjectiveType> campaignObjectiveTypes = new ArrayList<>()
    /* List of status values for filtering */
    List<CampaignSummaryStatus> campaignStatuses = new ArrayList<>()
    /* Number of days to use as the conversion attribution window for a pin click action. */
    ConversionAttributionWindowDays clickWindowDays
    /* Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. */
    List<ReportingColumnAsync> columns = new ArrayList<>()
    /* Determines if the targeting types included in the request should be consolidated into a single breakdown. */
    Boolean combineTargetingTypes = false
    /* Date dimension for conversion metrics. */
    ConversionReportTimeType conversionReportTime
    /* List of advertiser-defined custom conversion event metrics to include in the report */
    List<CustomConversionEventMetrics> customConversionEventMetrics = new ArrayList<>()
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    String endDate
    /* Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. */
    Integer endHour
    /* Number of days to use as the conversion attribution window for an engagement action. */
    ConversionAttributionWindowDays engagementWindowDays
    /*   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. */
    Granularity granularity
    /* Level of the report */
    MetricsReportingLevel level
    /* List of metrics filters */
    List<AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<>()
    
    PrimarySort primarySort
    /* List of product group ids */
    List<String> productGroupIds = new ArrayList<>()
    /* List of values for filtering */
    List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<>()
    /* List of product item ids */
    List<String> productItemIds = new ArrayList<>()
    
    DataOutputFormat reportFormat
    /* Specify the timezone to be applied for the reporting. */
    ReportingTimeZone reportingTimezone
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    String startDate
    /* Which hour of the start date to begin the report. Only allowed for hourly reports. */
    Integer startHour
    /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. */
    List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes = new ArrayList<>()
    /* Number of days to use as the conversion attribution window for a view action. */
    ConversionAttributionWindowDays viewWindowDays
}
