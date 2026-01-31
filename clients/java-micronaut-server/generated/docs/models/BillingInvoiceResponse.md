

# BillingInvoiceResponse

The class is defined in **[BillingInvoiceResponse.java](../../src/main/java/org/openapitools/model/BillingInvoiceResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | The ID of the ad account this invoice belongs to |  [optional property]
**adAccountName** | `String` | The name of the ad account this invoice belongs to |  [optional property]
**amountBilledMicroCurrency** | `Integer` | The amount billed in this invoice. Denoted in micro currency |  [optional property]
**amountDiscountMicroCurrency** | `Integer` | The discount in this invoice. Denoted in micro currency |  [optional property]
**amountNetMicroCurrency** | `Integer` | The net amount in this invoice. Denoted in micro currency |  [optional property]
**amountTaxMicroCurrency** | `Integer` | The tax in this invoice. Denoted in micro currency |  [optional property]
**billToCountry** | `String` | The country of the bill to address |  [optional property]
**billingPeriodEndDate** | `LocalDate` | The end date of the billing period. Format: YYYY-MM-DD |  [optional property]
**billingPeriodStartDate** | `LocalDate` | The start date of the billing period. Format: YYYY-MM-DD |  [optional property]
**currency** | `Currency` |  |  [optional property]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The type of the document |  [optional property]
**id** | `String` | Unique identifier for the billing invoice |  [optional property]
**invoiceDueDate** | `LocalDate` | The date the invoice is due. Format: YYYY-MM-DD |  [optional property]
**paymentTerms** | `String` | The payment terms of the invoice |  [optional property]
**status** | [**StatusEnum**](#StatusEnum) | The status of the invoice |  [optional property]











## DocumentTypeEnum

Name | Value
---- | -----
INVOICE | `"INVOICE"`
CREDIT_MEMO | `"CREDIT_MEMO"`




## StatusEnum

Name | Value
---- | -----
OPEN | `"OPEN"`
CLOSED | `"CLOSED"`


