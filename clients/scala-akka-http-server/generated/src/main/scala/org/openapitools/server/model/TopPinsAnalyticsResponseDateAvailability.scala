package org.openapitools.server.model


/**
 * @param latestAvailableTimestamp  for example: ''1649116799000''
 * @param isRealtime  for example: ''false''
*/
final case class TopPinsAnalyticsResponseDateAvailability (
  latestAvailableTimestamp: Option[Double] = None,
  isRealtime: Option[Boolean] = None
)

