package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionTagResponse._

case class ConversionTagResponse (
  /* Ad account ID. */
  adAccountId: Option[String],
/* Tag code snippet. */
  codeSnippet: Option[String],
enhancedMatchStatus: Option[EnhancedMatchStatusType],
/* Tag ID. */
  id: Option[String],
/* Time for the last event fired. */
  lastFiredTimeMs: Option[BigDecimal],
/* Conversion tag name. */
  name: Option[String],
status: Option[EntityStatus],
/* Version number. */
  version: Option[String],
configs: Option[ConversionTagConfigs])

object ConversionTagResponse {
  import DateTimeCodecs._

  implicit val ConversionTagResponseCodecJson: CodecJson[ConversionTagResponse] = CodecJson.derive[ConversionTagResponse]
  implicit val ConversionTagResponseDecoder: EntityDecoder[ConversionTagResponse] = jsonOf[ConversionTagResponse]
  implicit val ConversionTagResponseEncoder: EntityEncoder[ConversionTagResponse] = jsonEncoderOf[ConversionTagResponse]
}
