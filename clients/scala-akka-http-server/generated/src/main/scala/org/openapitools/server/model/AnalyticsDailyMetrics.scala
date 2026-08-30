package org.openapitools.server.model


/**
 * @param dataStatus  for example: ''null''
 * @param date Metrics date (UTC): YYYY-MM-DD. for example: ''2019-12-01''
 * @param metrics  for example: ''null''
*/
final case class AnalyticsDailyMetrics (
  dataStatus: Option[DataStatus] = None,
  date: Option[String] = None,
  metrics: Option[Map[String, Double]] = None
)

