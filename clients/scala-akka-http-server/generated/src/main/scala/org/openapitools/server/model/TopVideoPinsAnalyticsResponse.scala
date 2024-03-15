package org.openapitools.server.model


/**
 * @param dateAvailability  for example: ''null''
 * @param pins  for example: ''null''
 * @param sortBy  for example: ''IMPRESSION''
*/
final case class TopVideoPinsAnalyticsResponse (
  dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability] = None,
  pins: Option[Seq[TopVideoPinsAnalyticsResponsePinsInner]] = None,
  sortBy: Option[String] = None
)

