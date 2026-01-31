package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionHealthSelectionItem._

case class ConversionHealthSelectionItem (
  /* Status for conversion types */
  conversionType: Option[Any],
/* Status for criteria */
  criteria: Option[Any],
/* Status for ingestion sources */
  ingestionSource: Option[Any],
/* Overall status for this selection item */
  status: AnyType)

object ConversionHealthSelectionItem {
  import DateTimeCodecs._

  implicit val ConversionHealthSelectionItemCodecJson: CodecJson[ConversionHealthSelectionItem] = CodecJson.derive[ConversionHealthSelectionItem]
  implicit val ConversionHealthSelectionItemDecoder: EntityDecoder[ConversionHealthSelectionItem] = jsonOf[ConversionHealthSelectionItem]
  implicit val ConversionHealthSelectionItemEncoder: EntityEncoder[ConversionHealthSelectionItem] = jsonEncoderOf[ConversionHealthSelectionItem]
}
