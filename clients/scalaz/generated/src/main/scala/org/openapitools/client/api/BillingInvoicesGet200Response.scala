package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingInvoicesGet200Response._

case class BillingInvoicesGet200Response (
  bookmark: Option[String],
items: List[BillingInvoiceResponse])

object BillingInvoicesGet200Response {
  import DateTimeCodecs._

  implicit val BillingInvoicesGet200ResponseCodecJson: CodecJson[BillingInvoicesGet200Response] = CodecJson.derive[BillingInvoicesGet200Response]
  implicit val BillingInvoicesGet200ResponseDecoder: EntityDecoder[BillingInvoicesGet200Response] = jsonOf[BillingInvoicesGet200Response]
  implicit val BillingInvoicesGet200ResponseEncoder: EntityEncoder[BillingInvoicesGet200Response] = jsonEncoderOf[BillingInvoicesGet200Response]
}
