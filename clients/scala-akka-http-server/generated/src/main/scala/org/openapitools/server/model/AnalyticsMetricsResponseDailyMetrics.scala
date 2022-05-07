package org.openapitools.server.model


/**
 * @param dataStatus Metrics availablity, e.g., \"READY\". for example: ''READY''
 * @param date Metrics date (UTC): YYYY-MM-DD. for example: ''2019-12-01''
 * @param metrics The metric name and daily value for each requested metric for example: ''{"ENGAGEMENT":100,"CLICKTHROUGH_RATE":0.2,"CLICKTHROUGH":200,"CLOSEUP":37,"CLOSEUP_RATE":0.5,"ENGAGEMENT_RATE":0.2,"SAVE":20,"SAVE_RATE":0.18,"IMPRESSION":240}''
*/
final case class AnalyticsMetricsResponseDailyMetrics (
  dataStatus: Option[String],
  date: Option[String],
  metrics: Option[Map[String, Double]]
)

