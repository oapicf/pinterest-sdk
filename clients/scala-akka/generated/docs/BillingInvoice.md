

# BillingInvoice

A billing invoice in the advertiser account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | The ID of the ad account this invoice belongs to |  [optional]
**adAccountName** | **String** | The name of the ad account this invoice belongs to |  [optional]
**amountBilledMicroCurrency** | **Int** | The amount billed in this invoice. Denoted in micro currency |  [optional]
**amountDiscountMicroCurrency** | **Int** | The discount in this invoice. Denoted in micro currency |  [optional]
**amountNetMicroCurrency** | **Int** | The net amount in this invoice. Denoted in micro currency |  [optional]
**amountTaxMicroCurrency** | **Int** | The tax in this invoice. Denoted in micro currency |  [optional]
**billToCountry** | **String** | The country of the bill to address |  [optional]
**billingPeriodEndDate** | **LocalDate** | The end date of the billing period. Format: YYYY-MM-DD |  [optional]
**billingPeriodStartDate** | **LocalDate** | The start date of the billing period. Format: YYYY-MM-DD |  [optional]
**currency** | **Currency** |  |  [optional]
**documentType** | **BillingInvoiceDocumentType** | The type of the document |  [optional]
**id** | **String** | Unique identifier for the billing invoice |  [optional]
**invoiceDueDate** | **LocalDate** | The date the invoice is due. Format: YYYY-MM-DD |  [optional]
**paymentTerms** | **String** | The payment terms of the invoice |  [optional]
**status** | **BillingInvoiceStatus** | The status of the invoice |  [optional]



