package org.openapitools.server.model


/**
 * @param dateAvailability  for example: ''null''
 * @param pins  for example: ''null''
 * @param sortBy  for example: ''null''
*/
final case class TopVideoPinsAnalyticsResponse (
  dateAvailability: Option[TopVideoPinsAnalyticsResponseDateAvailability] = None,
  pins: Option[Seq[TopVideoPinsAnalyticsResponsePinsItems]] = None,
  sortBy: Option[TopVideoPinsSortBy] = None
)

