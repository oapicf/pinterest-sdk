package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromotionTemplateValue._

case class PromotionTemplateValue (
  /* Numeric value. */
  amount: Option[BigDecimal],
currencyCode: Option[Currency],
/* Custom text. */
  customText: Option[String],
/* Percent value. */
  percent: Option[BigDecimal])

object PromotionTemplateValue {
  import DateTimeCodecs._

  implicit val PromotionTemplateValueCodecJson: CodecJson[PromotionTemplateValue] = CodecJson.derive[PromotionTemplateValue]
  implicit val PromotionTemplateValueDecoder: EntityDecoder[PromotionTemplateValue] = jsonOf[PromotionTemplateValue]
  implicit val PromotionTemplateValueEncoder: EntityEncoder[PromotionTemplateValue] = jsonEncoderOf[PromotionTemplateValue]
}
