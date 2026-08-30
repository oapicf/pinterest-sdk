
package org.openapitools.client.model

import java.time.LocalDate

case class BillingInvoice (
    /* The ID of the ad account this invoice belongs to */
    _adAccountId: Option[String],
    /* The name of the ad account this invoice belongs to */
    _adAccountName: Option[String],
    /* The amount billed in this invoice. Denoted in micro currency */
    _amountBilledMicroCurrency: Option[Integer],
    /* The discount in this invoice. Denoted in micro currency */
    _amountDiscountMicroCurrency: Option[Integer],
    /* The net amount in this invoice. Denoted in micro currency */
    _amountNetMicroCurrency: Option[Integer],
    /* The tax in this invoice. Denoted in micro currency */
    _amountTaxMicroCurrency: Option[Integer],
    /* The country of the bill to address */
    _billToCountry: Option[String],
    /* The end date of the billing period. Format: YYYY-MM-DD */
    _billingPeriodEndDate: Option[LocalDate],
    /* The start date of the billing period. Format: YYYY-MM-DD */
    _billingPeriodStartDate: Option[LocalDate],
    _currency: Option[Currency],
    /* The type of the document */
    _documentType: Option[BillingInvoiceDocumentType],
    /* Unique identifier for the billing invoice */
    _id: Option[String],
    /* The date the invoice is due. Format: YYYY-MM-DD */
    _invoiceDueDate: Option[LocalDate],
    /* The payment terms of the invoice */
    _paymentTerms: Option[String],
    /* The status of the invoice */
    _status: Option[BillingInvoiceStatus]
)
object BillingInvoice {
    def toStringBody(var_adAccountId: Object, var_adAccountName: Object, var_amountBilledMicroCurrency: Object, var_amountDiscountMicroCurrency: Object, var_amountNetMicroCurrency: Object, var_amountTaxMicroCurrency: Object, var_billToCountry: Object, var_billingPeriodEndDate: Object, var_billingPeriodStartDate: Object, var_currency: Object, var_documentType: Object, var_id: Object, var_invoiceDueDate: Object, var_paymentTerms: Object, var_status: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"adAccountName":$var_adAccountName,"amountBilledMicroCurrency":$var_amountBilledMicroCurrency,"amountDiscountMicroCurrency":$var_amountDiscountMicroCurrency,"amountNetMicroCurrency":$var_amountNetMicroCurrency,"amountTaxMicroCurrency":$var_amountTaxMicroCurrency,"billToCountry":$var_billToCountry,"billingPeriodEndDate":$var_billingPeriodEndDate,"billingPeriodStartDate":$var_billingPeriodStartDate,"currency":$var_currency,"documentType":$var_documentType,"id":$var_id,"invoiceDueDate":$var_invoiceDueDate,"paymentTerms":$var_paymentTerms,"status":$var_status
        | }
        """.stripMargin
}
