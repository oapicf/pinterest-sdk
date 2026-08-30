package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingInvoiceStatus._

case class BillingInvoiceStatus (
  
object BillingInvoiceStatus {
  import DateTimeCodecs._

  implicit val BillingInvoiceStatusCodecJson: CodecJson[BillingInvoiceStatus] = CodecJson.derive[BillingInvoiceStatus]
  implicit val BillingInvoiceStatusDecoder: EntityDecoder[BillingInvoiceStatus] = jsonOf[BillingInvoiceStatus]
  implicit val BillingInvoiceStatusEncoder: EntityEncoder[BillingInvoiceStatus] = jsonEncoderOf[BillingInvoiceStatus]
}
