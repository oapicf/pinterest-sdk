package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionTagCommon._

case class ConversionTagCommon (
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

object ConversionTagCommon {
  import DateTimeCodecs._

  implicit val ConversionTagCommonCodecJson: CodecJson[ConversionTagCommon] = CodecJson.derive[ConversionTagCommon]
  implicit val ConversionTagCommonDecoder: EntityDecoder[ConversionTagCommon] = jsonOf[ConversionTagCommon]
  implicit val ConversionTagCommonEncoder: EntityEncoder[ConversionTagCommon] = jsonEncoderOf[ConversionTagCommon]
}
