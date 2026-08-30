package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import BillingInvoice._

case class BillingInvoice (
  /* The ID of the ad account this invoice belongs to */
  adAccountId: Option[String],
/* The name of the ad account this invoice belongs to */
  adAccountName: Option[String],
/* The amount billed in this invoice. Denoted in micro currency */
  amountBilledMicroCurrency: Option[Integer],
/* The discount in this invoice. Denoted in micro currency */
  amountDiscountMicroCurrency: Option[Integer],
/* The net amount in this invoice. Denoted in micro currency */
  amountNetMicroCurrency: Option[Integer],
/* The tax in this invoice. Denoted in micro currency */
  amountTaxMicroCurrency: Option[Integer],
/* The country of the bill to address */
  billToCountry: Option[String],
/* The end date of the billing period. Format: YYYY-MM-DD */
  billingPeriodEndDate: Option[LocalDate],
/* The start date of the billing period. Format: YYYY-MM-DD */
  billingPeriodStartDate: Option[LocalDate],
currency: Option[Currency],
/* The type of the document */
  documentType: Option[BillingInvoiceDocumentType],
/* Unique identifier for the billing invoice */
  id: Option[String],
/* The date the invoice is due. Format: YYYY-MM-DD */
  invoiceDueDate: Option[LocalDate],
/* The payment terms of the invoice */
  paymentTerms: Option[String],
/* The status of the invoice */
  status: Option[BillingInvoiceStatus])

object BillingInvoice {
  import DateTimeCodecs._

  implicit val BillingInvoiceCodecJson: CodecJson[BillingInvoice] = CodecJson.derive[BillingInvoice]
  implicit val BillingInvoiceDecoder: EntityDecoder[BillingInvoice] = jsonOf[BillingInvoice]
  implicit val BillingInvoiceEncoder: EntityEncoder[BillingInvoice] = jsonEncoderOf[BillingInvoice]
}
