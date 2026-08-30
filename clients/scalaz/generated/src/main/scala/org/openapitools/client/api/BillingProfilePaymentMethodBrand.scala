package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingProfilePaymentMethodBrand._

case class BillingProfilePaymentMethodBrand (
  
object BillingProfilePaymentMethodBrand {
  import DateTimeCodecs._

  implicit val BillingProfilePaymentMethodBrandCodecJson: CodecJson[BillingProfilePaymentMethodBrand] = CodecJson.derive[BillingProfilePaymentMethodBrand]
  implicit val BillingProfilePaymentMethodBrandDecoder: EntityDecoder[BillingProfilePaymentMethodBrand] = jsonOf[BillingProfilePaymentMethodBrand]
  implicit val BillingProfilePaymentMethodBrandEncoder: EntityEncoder[BillingProfilePaymentMethodBrand] = jsonEncoderOf[BillingProfilePaymentMethodBrand]
}
