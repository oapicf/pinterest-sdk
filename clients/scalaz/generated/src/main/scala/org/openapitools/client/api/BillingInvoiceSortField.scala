package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingInvoiceSortField._

case class BillingInvoiceSortField (
  
object BillingInvoiceSortField {
  import DateTimeCodecs._

  implicit val BillingInvoiceSortFieldCodecJson: CodecJson[BillingInvoiceSortField] = CodecJson.derive[BillingInvoiceSortField]
  implicit val BillingInvoiceSortFieldDecoder: EntityDecoder[BillingInvoiceSortField] = jsonOf[BillingInvoiceSortField]
  implicit val BillingInvoiceSortFieldEncoder: EntityEncoder[BillingInvoiceSortField] = jsonEncoderOf[BillingInvoiceSortField]
}
