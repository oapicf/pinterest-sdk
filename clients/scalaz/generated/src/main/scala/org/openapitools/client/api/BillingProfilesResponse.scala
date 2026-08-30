package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingProfilesResponse._

case class BillingProfilesResponse (
  /* Advertiser ID of the billing. */
  advertiserId: Option[String],
/* Billing type of the advertiser */
  billingType: Option[BillingType],
/* Type of the card. */
  cardType: Option[BillingProfileCardType],
/* Billing ID. */
  id: Option[String],
/* Brand of the payment method. */
  paymentMethodBrand: Option[BillingProfilePaymentMethodBrand],
/* Status of the billing. */
  status: Option[BillingProfileStatus])

object BillingProfilesResponse {
  import DateTimeCodecs._

  implicit val BillingProfilesResponseCodecJson: CodecJson[BillingProfilesResponse] = CodecJson.derive[BillingProfilesResponse]
  implicit val BillingProfilesResponseDecoder: EntityDecoder[BillingProfilesResponse] = jsonOf[BillingProfilesResponse]
  implicit val BillingProfilesResponseEncoder: EntityEncoder[BillingProfilesResponse] = jsonEncoderOf[BillingProfilesResponse]
}
