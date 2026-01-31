package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import BillingInvoiceResponse._

case class BillingInvoiceResponse (
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
  documentType: Option[DocumentType],
/* Unique identifier for the billing invoice */
  id: Option[String],
/* The date the invoice is due. Format: YYYY-MM-DD */
  invoiceDueDate: Option[LocalDate],
/* The payment terms of the invoice */
  paymentTerms: Option[String],
/* The status of the invoice */
  status: Option[Status])

object BillingInvoiceResponse {
  import DateTimeCodecs._
  sealed trait DocumentType
  case object INVOICE extends DocumentType
  case object CREDITMEMO extends DocumentType

  object DocumentType {
    def toDocumentType(s: String): Option[DocumentType] = s match {
      case "INVOICE" => Some(INVOICE)
      case "CREDITMEMO" => Some(CREDITMEMO)
      case _ => None
    }

    def fromDocumentType(x: DocumentType): String = x match {
      case INVOICE => "INVOICE"
      case CREDITMEMO => "CREDITMEMO"
    }
  }

  implicit val DocumentTypeEnumEncoder: EncodeJson[DocumentType] =
    EncodeJson[DocumentType](is => StringEncodeJson(DocumentType.fromDocumentType(is)))

  implicit val DocumentTypeEnumDecoder: DecodeJson[DocumentType] =
    DecodeJson.optionDecoder[DocumentType](n => n.string.flatMap(jStr => DocumentType.toDocumentType(jStr)), "DocumentType failed to de-serialize")
  sealed trait Status
  case object OPEN extends Status
  case object CLOSED extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "OPEN" => Some(OPEN)
      case "CLOSED" => Some(CLOSED)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case OPEN => "OPEN"
      case CLOSED => "CLOSED"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val BillingInvoiceResponseCodecJson: CodecJson[BillingInvoiceResponse] = CodecJson.derive[BillingInvoiceResponse]
  implicit val BillingInvoiceResponseDecoder: EntityDecoder[BillingInvoiceResponse] = jsonOf[BillingInvoiceResponse]
  implicit val BillingInvoiceResponseEncoder: EntityEncoder[BillingInvoiceResponse] = jsonEncoderOf[BillingInvoiceResponse]
}
