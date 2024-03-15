package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BookClosedResponse._

case class BookClosedResponse (
  /* Are conversion metrics ready? */
  conversionMetricsReady: Option[Boolean],
/* Are non-conversion metrics ready? */
  nonConversionMetricsReady: Option[Boolean])

object BookClosedResponse {
  import DateTimeCodecs._

  implicit val BookClosedResponseCodecJson: CodecJson[BookClosedResponse] = CodecJson.derive[BookClosedResponse]
  implicit val BookClosedResponseDecoder: EntityDecoder[BookClosedResponse] = jsonOf[BookClosedResponse]
  implicit val BookClosedResponseEncoder: EntityEncoder[BookClosedResponse] = jsonEncoderOf[BookClosedResponse]
}
