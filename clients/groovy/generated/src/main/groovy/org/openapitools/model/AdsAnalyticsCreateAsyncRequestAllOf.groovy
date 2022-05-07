package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.Granularity;

@Canonical
class AdsAnalyticsCreateAsyncRequestAllOf {
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
}
