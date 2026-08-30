package org.openapitools.server.model


/**
 * @param isRealtime  for example: ''null''
 * @param latestAvailableTimestamp  for example: ''null''
*/
final case class TopPinsAnalyticsResponseDateAvailability (
  isRealtime: Option[Boolean] = None,
  latestAvailableTimestamp: Option[Double] = None
)

