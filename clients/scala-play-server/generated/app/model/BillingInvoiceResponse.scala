package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for BillingInvoiceResponse.
  * @param adAccountId The ID of the ad account this invoice belongs to
  * @param adAccountName The name of the ad account this invoice belongs to
  * @param amountBilledMicroCurrency The amount billed in this invoice. Denoted in micro currency
  * @param amountDiscountMicroCurrency The discount in this invoice. Denoted in micro currency
  * @param amountNetMicroCurrency The net amount in this invoice. Denoted in micro currency
  * @param amountTaxMicroCurrency The tax in this invoice. Denoted in micro currency
  * @param billToCountry The country of the bill to address
  * @param billingPeriodEndDate The end date of the billing period. Format: YYYY-MM-DD
  * @param billingPeriodStartDate The start date of the billing period. Format: YYYY-MM-DD
  * @param documentType The type of the document
  * @param id Unique identifier for the billing invoice
  * @param invoiceDueDate The date the invoice is due. Format: YYYY-MM-DD
  * @param paymentTerms The payment terms of the invoice
  * @param status The status of the invoice
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BillingInvoiceResponse(
  adAccountId: Option[String],
  adAccountName: Option[String],
  amountBilledMicroCurrency: Option[Int],
  amountDiscountMicroCurrency: Option[Int],
  amountNetMicroCurrency: Option[Int],
  amountTaxMicroCurrency: Option[Int],
  billToCountry: Option[String],
  billingPeriodEndDate: Option[LocalDate],
  billingPeriodStartDate: Option[LocalDate],
  currency: Option[Currency],
  documentType: Option[BillingInvoiceResponse.DocumentType.Value],
  id: Option[String],
  invoiceDueDate: Option[LocalDate],
  paymentTerms: Option[String],
  status: Option[BillingInvoiceResponse.Status.Value]
)

object BillingInvoiceResponse {
  implicit lazy val billingInvoiceResponseJsonFormat: Format[BillingInvoiceResponse] = Json.format[BillingInvoiceResponse]

  // noinspection TypeAnnotation
  object DocumentType extends Enumeration {
    val INVOICE = Value("INVOICE")
    val CREDITMEMO = Value("CREDIT_MEMO")

    type DocumentType = Value
    implicit lazy val DocumentTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val OPEN = Value("OPEN")
    val CLOSED = Value("CLOSED")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

