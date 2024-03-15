package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SummaryPinMedia._

case class SummaryPinMedia (
  mediaType: Option[String])

object SummaryPinMedia {
  import DateTimeCodecs._

  implicit val SummaryPinMediaCodecJson: CodecJson[SummaryPinMedia] = CodecJson.derive[SummaryPinMedia]
  implicit val SummaryPinMediaDecoder: EntityDecoder[SummaryPinMedia] = jsonOf[SummaryPinMedia]
  implicit val SummaryPinMediaEncoder: EntityEncoder[SummaryPinMedia] = jsonEncoderOf[SummaryPinMedia]
}
