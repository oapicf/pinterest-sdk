package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopVideoPinsAnalyticsResponse._

case class TopVideoPinsAnalyticsResponse (
  dateAvailability: Option[TopVideoPinsAnalyticsResponseDateAvailability],
pins: Option[List[TopVideoPinsAnalyticsResponsePinsItems]],
sortBy: Option[TopVideoPinsSortBy])

object TopVideoPinsAnalyticsResponse {
  import DateTimeCodecs._

  implicit val TopVideoPinsAnalyticsResponseCodecJson: CodecJson[TopVideoPinsAnalyticsResponse] = CodecJson.derive[TopVideoPinsAnalyticsResponse]
  implicit val TopVideoPinsAnalyticsResponseDecoder: EntityDecoder[TopVideoPinsAnalyticsResponse] = jsonOf[TopVideoPinsAnalyticsResponse]
  implicit val TopVideoPinsAnalyticsResponseEncoder: EntityEncoder[TopVideoPinsAnalyticsResponse] = jsonEncoderOf[TopVideoPinsAnalyticsResponse]
}
