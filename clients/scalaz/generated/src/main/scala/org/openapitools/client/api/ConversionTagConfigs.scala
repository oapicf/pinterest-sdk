package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionTagConfigs._

case class ConversionTagConfigs (
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
/* List of advertiser subdomains configured for NoCodeCAPI calls. */
  noCodeCapiDomains: Option[List[String]])

object ConversionTagConfigs {
  import DateTimeCodecs._

  implicit val ConversionTagConfigsCodecJson: CodecJson[ConversionTagConfigs] = CodecJson.derive[ConversionTagConfigs]
  implicit val ConversionTagConfigsDecoder: EntityDecoder[ConversionTagConfigs] = jsonOf[ConversionTagConfigs]
  implicit val ConversionTagConfigsEncoder: EntityEncoder[ConversionTagConfigs] = jsonEncoderOf[ConversionTagConfigs]
}
