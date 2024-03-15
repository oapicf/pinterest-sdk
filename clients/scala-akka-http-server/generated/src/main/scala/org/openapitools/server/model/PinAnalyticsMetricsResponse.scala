package org.openapitools.server.model


/**
 * @param lifetimeMetrics The lifetime metric name and value. for example: ''{"TOTAL_COMMENTS":10,"TOTAL_REACTIONS":12}''
 * @param dailyMetrics Array with the requested daily metric records for example: ''null''
 * @param summaryMetrics The metric name and value over the requested period for each requested metric for example: ''{"IMPRESSION":240,"OUTBOUND_CLICK":20,"PIN_CLICK":37,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031}''
*/
final case class PinAnalyticsMetricsResponse (
  lifetimeMetrics: Option[Map[String, Int]] = None,
  dailyMetrics: Option[Seq[PinAnalyticsMetricsResponseDailyMetricsInner]] = None,
  summaryMetrics: Option[Map[String, Double]] = None
)

