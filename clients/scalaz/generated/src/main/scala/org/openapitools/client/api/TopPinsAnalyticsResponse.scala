package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopPinsAnalyticsResponse._

case class TopPinsAnalyticsResponse (
  dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability],
pins: Option[List[TopPinsAnalyticsResponsePinsItems]],
sortBy: Option[TopPinsSortBy])

object TopPinsAnalyticsResponse {
  import DateTimeCodecs._

  implicit val TopPinsAnalyticsResponseCodecJson: CodecJson[TopPinsAnalyticsResponse] = CodecJson.derive[TopPinsAnalyticsResponse]
  implicit val TopPinsAnalyticsResponseDecoder: EntityDecoder[TopPinsAnalyticsResponse] = jsonOf[TopPinsAnalyticsResponse]
  implicit val TopPinsAnalyticsResponseEncoder: EntityEncoder[TopPinsAnalyticsResponse] = jsonEncoderOf[TopPinsAnalyticsResponse]
}
