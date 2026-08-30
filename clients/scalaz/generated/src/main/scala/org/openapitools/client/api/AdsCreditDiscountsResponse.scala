package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsCreditDiscountsResponse._

case class AdsCreditDiscountsResponse (
  /* True if the offer code is currently active. */
  active: Option[Boolean],
/* Advertiser ID the offer was applied to. */
  advertiserId: Option[String],
/* Currency value for the discount. */
  discountCurrency: Option[String],
/* The discount applied in the offer's currency value. */
  discountInMicroCurrency: Option[BigDecimal],
/* The type of discount of this credit */
  discountType: Option[AdsCreditDiscountType],
/* The credits left to spend. */
  remainingDiscountInMicroCurrency: Option[BigDecimal],
/* Human readable title of the offer code. */
  title: Option[String])

object AdsCreditDiscountsResponse {
  import DateTimeCodecs._

  implicit val AdsCreditDiscountsResponseCodecJson: CodecJson[AdsCreditDiscountsResponse] = CodecJson.derive[AdsCreditDiscountsResponse]
  implicit val AdsCreditDiscountsResponseDecoder: EntityDecoder[AdsCreditDiscountsResponse] = jsonOf[AdsCreditDiscountsResponse]
  implicit val AdsCreditDiscountsResponseEncoder: EntityEncoder[AdsCreditDiscountsResponse] = jsonEncoderOf[AdsCreditDiscountsResponse]
}
