package org.openapitools.server.model


/**
 * @param dateAvailability  for example: ''null''
 * @param pins  for example: ''null''
 * @param sortBy  for example: ''null''
*/
final case class TopPinsAnalyticsResponse (
  dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability] = None,
  pins: Option[Seq[TopPinsAnalyticsResponsePinsItems]] = None,
  sortBy: Option[TopPinsSortBy] = None
)

