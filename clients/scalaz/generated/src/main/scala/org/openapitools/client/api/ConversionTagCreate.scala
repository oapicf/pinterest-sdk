package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionTagCreate._

case class ConversionTagCreate (
  /* Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
  aemDbEnabled: Option[Boolean],
/* Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
  aemEnabled: Option[Boolean],
/* Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
  aemExternalIdEnabled: Option[Boolean],
/* Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
  aemFnlnEnabled: Option[Boolean],
/* Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
  aemGeEnabled: Option[Boolean],
/* Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
  aemLocEnabled: Option[Boolean],
/* Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. */
  aemPhEnabled: Option[Boolean],
/* Metadata ingestion frequency. */
  mdFrequency: Option[BigDecimal],
/* Conversion tag name. */
  name: String)

object ConversionTagCreate {
  import DateTimeCodecs._

  implicit val ConversionTagCreateCodecJson: CodecJson[ConversionTagCreate] = CodecJson.derive[ConversionTagCreate]
  implicit val ConversionTagCreateDecoder: EntityDecoder[ConversionTagCreate] = jsonOf[ConversionTagCreate]
  implicit val ConversionTagCreateEncoder: EntityEncoder[ConversionTagCreate] = jsonEncoderOf[ConversionTagCreate]
}
