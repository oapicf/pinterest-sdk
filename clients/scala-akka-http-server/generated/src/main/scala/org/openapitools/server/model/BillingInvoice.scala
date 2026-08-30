package org.openapitools.server.model

import java.time.LocalDate

/**
 * A billing invoice in the advertiser account.
 *
 * @param adAccountId The ID of the ad account this invoice belongs to for example: ''null''
 * @param adAccountName The name of the ad account this invoice belongs to for example: ''null''
 * @param amountBilledMicroCurrency The amount billed in this invoice. Denoted in micro currency for example: ''null''
 * @param amountDiscountMicroCurrency The discount in this invoice. Denoted in micro currency for example: ''null''
 * @param amountNetMicroCurrency The net amount in this invoice. Denoted in micro currency for example: ''null''
 * @param amountTaxMicroCurrency The tax in this invoice. Denoted in micro currency for example: ''null''
 * @param billToCountry The country of the bill to address for example: ''null''
 * @param billingPeriodEndDate The end date of the billing period. Format: YYYY-MM-DD for example: ''null''
 * @param billingPeriodStartDate The start date of the billing period. Format: YYYY-MM-DD for example: ''null''
 * @param currency  for example: ''null''
 * @param documentType The type of the document for example: ''null''
 * @param id Unique identifier for the billing invoice for example: ''null''
 * @param invoiceDueDate The date the invoice is due. Format: YYYY-MM-DD for example: ''null''
 * @param paymentTerms The payment terms of the invoice for example: ''NET 30''
 * @param status The status of the invoice for example: ''OPEN''
*/
final case class BillingInvoice (
  adAccountId: Option[String] = None,
  adAccountName: Option[String] = None,
  amountBilledMicroCurrency: Option[Int] = None,
  amountDiscountMicroCurrency: Option[Int] = None,
  amountNetMicroCurrency: Option[Int] = None,
  amountTaxMicroCurrency: Option[Int] = None,
  billToCountry: Option[String] = None,
  billingPeriodEndDate: Option[LocalDate] = None,
  billingPeriodStartDate: Option[LocalDate] = None,
  currency: Option[Currency] = None,
  documentType: Option[BillingInvoiceDocumentType] = None,
  id: Option[String] = None,
  invoiceDueDate: Option[LocalDate] = None,
  paymentTerms: Option[String] = None,
  status: Option[BillingInvoiceStatus] = None
)

