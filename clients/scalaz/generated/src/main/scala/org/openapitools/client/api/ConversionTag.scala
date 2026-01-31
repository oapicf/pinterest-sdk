package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionTag._

case class ConversionTag (
  /* Tag code snippet. */
  codeSnippet: Option[String],
configs: Option[ConversionTagConfigs],
/* The enhanced match status of the tag */
  enhancedMatchStatus: Option[EnhancedMatchStatusType],
/* Tag ID. */
  id: Option[String],
/* Time for the last event fired. */
  lastFiredTimeMs: Option[BigDecimal],
/* Conversion tag name. */
  name: String,
/* Version number. */
  version: Option[String],
/* Ad account ID. */
  adAccountId: String,
status: Option[EntityStatus])

object ConversionTag {
  import DateTimeCodecs._

  implicit val ConversionTagCodecJson: CodecJson[ConversionTag] = CodecJson.derive[ConversionTag]
  implicit val ConversionTagDecoder: EntityDecoder[ConversionTag] = jsonOf[ConversionTag]
  implicit val ConversionTagEncoder: EntityEncoder[ConversionTag] = jsonEncoderOf[ConversionTag]
}
