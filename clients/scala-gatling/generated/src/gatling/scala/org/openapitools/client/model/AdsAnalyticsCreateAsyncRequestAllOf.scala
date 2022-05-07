
package org.openapitools.client.model


case class AdsAnalyticsCreateAsyncRequestAllOf (
    /* Metric report start date (UTC). Format: YYYY-MM-DD */
    _startDate: String,
    /* Metric report end date (UTC). Format: YYYY-MM-DD */
    _endDate: String,
    /* TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly */
    _granularity: Granularity,
    /* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    _clickWindowDays: Option[ConversionAttributionWindowDays],
    /* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
    _engagementWindowDays: Option[ConversionAttributionWindowDays],
    /* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. */
    _viewWindowDays: Option[ConversionAttributionWindowDays],
    /* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
    _conversionReportTime: Option[ConversionReportTimeType],
    /* List of types of attribution for the conversion report */
    _attributionTypes: Option[List[ConversionReportAttributionType]]
)
object AdsAnalyticsCreateAsyncRequestAllOf {
    def toStringBody(var_startDate: Object, var_endDate: Object, var_granularity: Object, var_clickWindowDays: Object, var_engagementWindowDays: Object, var_viewWindowDays: Object, var_conversionReportTime: Object, var_attributionTypes: Object) =
        s"""
        | {
        | "startDate":$var_startDate,"endDate":$var_endDate,"granularity":$var_granularity,"clickWindowDays":$var_clickWindowDays,"engagementWindowDays":$var_engagementWindowDays,"viewWindowDays":$var_viewWindowDays,"conversionReportTime":$var_conversionReportTime,"attributionTypes":$var_attributionTypes
        | }
        """.stripMargin
}
