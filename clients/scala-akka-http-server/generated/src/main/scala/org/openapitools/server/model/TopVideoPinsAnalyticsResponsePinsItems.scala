package org.openapitools.server.model


/**
 * Array with metrics, status, and pin id for the requested metric
 *
 * @param dataStatus  for example: ''null''
 * @param metrics  for example: ''null''
 * @param pinId The pin id for example: ''null''
*/
final case class TopVideoPinsAnalyticsResponsePinsItems (
  dataStatus: Option[Map[String, DataStatus]] = None,
  metrics: Option[Map[String, Double]] = None,
  pinId: Option[String] = None
)

