package org.openapitools.server.model


/**
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly for example: ''null''
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. for example: ''null''
 * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. for example: ''null''
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. for example: ''null''
 * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. for example: ''null''
 * @param attributionTypes List of types of attribution for the conversion report for example: ''null''
*/
final case class AdsAnalyticsCreateAsyncRequestAllOf (
  startDate: String,
  endDate: String,
  granularity: Granularity,
  clickWindowDays: Option[ConversionAttributionWindowDays],
  engagementWindowDays: Option[ConversionAttributionWindowDays],
  viewWindowDays: Option[ConversionAttributionWindowDays],
  conversionReportTime: Option[ConversionReportTimeType],
  attributionTypes: Option[Seq[ConversionReportAttributionType]]
)

