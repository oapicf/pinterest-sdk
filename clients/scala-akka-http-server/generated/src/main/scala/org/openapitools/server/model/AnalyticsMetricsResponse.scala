package org.openapitools.server.model


/**
 * @param dailyMetrics Array with the requested daily metric records for example: ''null''
 * @param summaryMetrics The metric name and value over the requested period for each requested metric for example: ''{"ENGAGEMENT":100,"CLICKTHROUGH_RATE":0.2,"CLICKTHROUGH":200,"CLOSEUP":37,"CLOSEUP_RATE":0.5,"ENGAGEMENT_RATE":0.2,"SAVE":20,"SAVE_RATE":0.18,"IMPRESSION":240}''
*/
final case class AnalyticsMetricsResponse (
  dailyMetrics: Option[Seq[AnalyticsMetricsResponseDailyMetrics]],
  summaryMetrics: Option[Map[String, Double]]
)

