package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdGroupSummaryStatus;
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
    ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.NUMBER_30
    /* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    ConversionAttributionWindowDays engagementWindowDays = ConversionAttributionWindowDays.NUMBER_30
    /* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. */
    ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.NUMBER_1
    /* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
    ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION"
    /* List of types of attribution for the conversion report */
    List<ConversionReportAttributionType> attributionTypes
    /* List of campaign ids */
    List<String> campaignIds
    /* List of status values for filtering */
    List<CampaignSummaryStatus> campaignStatuses
    /* List of values for filtering. [\"WEB_SESSIONS\"] in BETA. */
    List<ObjectiveType> campaignObjectiveTypes
    /* List of ad group ids */
    List<String> adGroupIds
    /* List of values for filtering */
    List<AdGroupSummaryStatus> adGroupStatuses
    /* List of ad ids [This parameter is no supported for Product Item Level Reports] */
    List<String> adIds
    /* List of values for filtering [This parameter is not supported for Product Item Level Reports] */
    List<PinPromotionSummaryStatus> adStatuses
    /* List of product group ids */
    List<String> productGroupIds
    /* List of values for filtering */
    List<ProductGroupSummaryStatus> productGroupStatuses
    /* List of product item ids */
    List<String> productItemIds
    /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. */
    List<AdsAnalyticsTargetingType> targetingTypes
    /* List of metrics filters */
    List<AdsAnalyticsMetricsFilter> metricsFilters
    /* Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. */
    List<ReportingColumnAsync> columns = new ArrayList<>()
    /* Level of the report */
    MetricsReportingLevel level
    /* Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. */
    DataOutputFormat reportFormat = "JSON"
}
