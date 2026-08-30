package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingInvoiceDocumentType._

case class BillingInvoiceDocumentType (
  
object BillingInvoiceDocumentType {
  import DateTimeCodecs._

  implicit val BillingInvoiceDocumentTypeCodecJson: CodecJson[BillingInvoiceDocumentType] = CodecJson.derive[BillingInvoiceDocumentType]
  implicit val BillingInvoiceDocumentTypeDecoder: EntityDecoder[BillingInvoiceDocumentType] = jsonOf[BillingInvoiceDocumentType]
  implicit val BillingInvoiceDocumentTypeEncoder: EntityEncoder[BillingInvoiceDocumentType] = jsonEncoderOf[BillingInvoiceDocumentType]
}
