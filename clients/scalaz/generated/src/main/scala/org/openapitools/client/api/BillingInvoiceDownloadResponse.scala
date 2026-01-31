package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingInvoiceDownloadResponse._

case class BillingInvoiceDownloadResponse (
  /* The download url for the billing invoice */
  downloadUrl: Option[String],
/* The billing invoice id */
  id: Option[String])

object BillingInvoiceDownloadResponse {
  import DateTimeCodecs._

  implicit val BillingInvoiceDownloadResponseCodecJson: CodecJson[BillingInvoiceDownloadResponse] = CodecJson.derive[BillingInvoiceDownloadResponse]
  implicit val BillingInvoiceDownloadResponseDecoder: EntityDecoder[BillingInvoiceDownloadResponse] = jsonOf[BillingInvoiceDownloadResponse]
  implicit val BillingInvoiceDownloadResponseEncoder: EntityEncoder[BillingInvoiceDownloadResponse] = jsonEncoderOf[BillingInvoiceDownloadResponse]
}
