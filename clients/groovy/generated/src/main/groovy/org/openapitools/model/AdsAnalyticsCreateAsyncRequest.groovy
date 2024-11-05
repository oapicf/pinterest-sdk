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
    List<ConversionReportAttributionType> attributionTypes = new ArrayList<>()
    /* List of campaign ids */
    List<String> campaignIds = new ArrayList<>()
    /* List of status values for filtering */
    List<CampaignSummaryStatus> campaignStatuses = new ArrayList<>()
    /* List of values for filtering. [\"WEB_SESSIONS\"] in BETA. */
    List<ObjectiveType> campaignObjectiveTypes = new ArrayList<>()
    /* List of ad group ids */
    List<String> adGroupIds = new ArrayList<>()
    /* List of values for filtering */
    List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<>()
    /* List of ad ids [This parameter is no supported for Product Item Level Reports] */
    List<String> adIds = new ArrayList<>()
    /* List of values for filtering [This parameter is not supported for Product Item Level Reports] */
    List<PinPromotionSummaryStatus> adStatuses = new ArrayList<>()
    /* List of product group ids */
    List<String> productGroupIds = new ArrayList<>()
    /* List of values for filtering */
    List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<>()
    /* List of product item ids */
    List<String> productItemIds = new ArrayList<>()
    /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. */
    List<AdsAnalyticsTargetingType> targetingTypes = new ArrayList<>()
    /* List of metrics filters */
    List<AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<>()
    /* Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. */
    List<ReportingColumnAsync> columns = new ArrayList<>()
    /* Level of the report */
    MetricsReportingLevel level
    /* Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. */
    DataOutputFormat reportFormat = "JSON"

    enum PrimarySortEnum {
    
        ID("BY_ID"),
        
        DATE("BY_DATE")
    
        private final String value
    
        PrimarySortEnum(String value) {
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

    /* Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. */
    PrimarySortEnum primarySort
    /* Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. */
    Integer startHour
    /* Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports. */
    Integer endHour
}
