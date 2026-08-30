package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * A billing invoice in the advertiser account.
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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BillingInvoice(
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
  documentType: Option[BillingInvoiceDocumentType],
  id: Option[String],
  invoiceDueDate: Option[LocalDate],
  paymentTerms: Option[String],
  status: Option[BillingInvoiceStatus]
)

object BillingInvoice {
  implicit lazy val billingInvoiceJsonFormat: Format[BillingInvoice] = Json.format[BillingInvoice]
}

