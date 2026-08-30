package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BookClosed._

case class BookClosed (
  /* Are conversion metrics ready? */
  conversionMetricsReady: Boolean,
/* Are non-conversion metrics ready? */
  nonConversionMetricsReady: Boolean)

object BookClosed {
  import DateTimeCodecs._

  implicit val BookClosedCodecJson: CodecJson[BookClosed] = CodecJson.derive[BookClosed]
  implicit val BookClosedDecoder: EntityDecoder[BookClosed] = jsonOf[BookClosed]
  implicit val BookClosedEncoder: EntityEncoder[BookClosed] = jsonEncoderOf[BookClosed]
}
