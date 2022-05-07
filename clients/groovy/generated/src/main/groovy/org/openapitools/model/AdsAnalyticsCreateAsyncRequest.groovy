package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequestAllOf;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequestAllOf1;
import org.openapitools.model.AdsAnalyticsMetricsFilter;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.Granularity;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.ProductGroupSummaryStatus;
import org.openapitools.model.ReportingColumnAsync;

@Canonical
class AdsAnalyticsCreateAsyncRequest {
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    String startDate
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    String endDate
    /* TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly */
    Granularity granularity
    /* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    ConversionAttributionWindowDays clickWindowDays = 30
    /* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    ConversionAttributionWindowDays engagementWindowDays = 30
    /* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. */
    ConversionAttributionWindowDays viewWindowDays = 1
    /* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
    ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION"
    /* List of types of attribution for the conversion report */
    List<ConversionReportAttributionType> attributionTypes = new ArrayList<ConversionReportAttributionType>()
    /* Metric and entity columns */
    List<ReportingColumnAsync> columns = new ArrayList<ReportingColumnAsync>()
    /* Level of the report */
    MetricsReportingLevel level
    /* Specification for formatting report data */
    DataOutputFormat reportFormat = "JSON"
    /* List of campaign ids */
    List<String> campaignIds = new ArrayList<String>()
    /* List of status values for filtering */
    List<CampaignSummaryStatus> campaignStatuses = new ArrayList<CampaignSummaryStatus>()
    /* List of values for filtering */
    List<ObjectiveType> campaignObjectiveTypes = new ArrayList<ObjectiveType>()
    /* List of ad group ids */
    List<String> adGroupIds = new ArrayList<String>()
    /* List of values for filtering */
    List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<AdGroupSummaryStatus>()
    /* List of ad ids */
    List<String> adIds = new ArrayList<String>()
    /* List of values for filtering */
    List<PinPromotionSummaryStatus> adStatuses = new ArrayList<PinPromotionSummaryStatus>()
    /* List of product group ids */
    List<String> productGroupIds = new ArrayList<String>()
    /* List of values for filtering */
    List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<ProductGroupSummaryStatus>()
    /* List of product item ids */
    List<String> productItemIds = new ArrayList<String>()
    /* List of targeting types */
    List<AdsAnalyticsTargetingType> targetingTypes = new ArrayList<AdsAnalyticsTargetingType>()
    /* List of metrics filters */
    List<AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<AdsAnalyticsMetricsFilter>()
}
