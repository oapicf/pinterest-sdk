package org.openapitools.server.model


/**
 * @param dataStatus  for example: ''null''
 * @param date Metrics date (UTC): YYYY-MM-DD. for example: ''null''
 * @param metrics  for example: ''null''
*/
final case class PinAnalyticsDailyMetrics (
  dataStatus: Option[DataStatus] = None,
  date: Option[String] = None,
  metrics: Option[Map[String, Double]] = None
)

