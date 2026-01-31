package org.openapitools.server.model


/**
 * @param isRealtime  for example: ''false''
 * @param latestAvailableTimestamp  for example: ''1649116799000''
*/
final case class TopPinsAnalyticsResponseDateAvailability (
  isRealtime: Option[Boolean] = None,
  latestAvailableTimestamp: Option[Double] = None
)

