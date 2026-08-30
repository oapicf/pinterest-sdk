
# BillingInvoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **kotlin.String** | The ID of the ad account this invoice belongs to |  [optional]
**adAccountName** | **kotlin.String** | The name of the ad account this invoice belongs to |  [optional]
**amountBilledMicroCurrency** | **kotlin.Int** | The amount billed in this invoice. Denoted in micro currency |  [optional]
**amountDiscountMicroCurrency** | **kotlin.Int** | The discount in this invoice. Denoted in micro currency |  [optional]
**amountNetMicroCurrency** | **kotlin.Int** | The net amount in this invoice. Denoted in micro currency |  [optional]
**amountTaxMicroCurrency** | **kotlin.Int** | The tax in this invoice. Denoted in micro currency |  [optional]
**billToCountry** | **kotlin.String** | The country of the bill to address |  [optional]
**billingPeriodEndDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The end date of the billing period. Format: YYYY-MM-DD |  [optional]
**billingPeriodStartDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The start date of the billing period. Format: YYYY-MM-DD |  [optional]
**currency** | [**Currency**](Currency.md) |  |  [optional]
**documentType** | [**BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document |  [optional]
**id** | **kotlin.String** | Unique identifier for the billing invoice |  [optional]
**invoiceDueDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date the invoice is due. Format: YYYY-MM-DD |  [optional]
**paymentTerms** | **kotlin.String** | The payment terms of the invoice |  [optional]
**status** | [**BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice |  [optional]



