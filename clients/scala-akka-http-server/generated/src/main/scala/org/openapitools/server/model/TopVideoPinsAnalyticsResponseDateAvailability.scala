package org.openapitools.server.model


/**
 * @param isRealtime  for example: ''null''
 * @param latestAvailableTimestamp  for example: ''null''
*/
final case class TopVideoPinsAnalyticsResponseDateAvailability (
  isRealtime: Option[Boolean] = None,
  latestAvailableTimestamp: Option[Double] = None
)

