

# BillingInvoiceResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | The ID of the ad account this invoice belongs to |  [optional]
**adAccountName** | **String** | The name of the ad account this invoice belongs to |  [optional]
**amountBilledMicroCurrency** | **Integer** | The amount billed in this invoice. Denoted in micro currency |  [optional]
**amountDiscountMicroCurrency** | **Integer** | The discount in this invoice. Denoted in micro currency |  [optional]
**amountNetMicroCurrency** | **Integer** | The net amount in this invoice. Denoted in micro currency |  [optional]
**amountTaxMicroCurrency** | **Integer** | The tax in this invoice. Denoted in micro currency |  [optional]
**billToCountry** | **String** | The country of the bill to address |  [optional]
**billingPeriodEndDate** | [**Date**](Date.md) | The end date of the billing period. Format: YYYY-MM-DD |  [optional]
**billingPeriodStartDate** | [**Date**](Date.md) | The start date of the billing period. Format: YYYY-MM-DD |  [optional]
**currency** | [**Currency**](Currency.md) |  |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The type of the document |  [optional]
**id** | **String** | Unique identifier for the billing invoice |  [optional]
**invoiceDueDate** | [**Date**](Date.md) | The date the invoice is due. Format: YYYY-MM-DD |  [optional]
**paymentTerms** | **String** | The payment terms of the invoice |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the invoice |  [optional]


## Enum: DocumentTypeEnum

Name | Value
---- | -----


## Enum: StatusEnum

Name | Value
---- | -----




