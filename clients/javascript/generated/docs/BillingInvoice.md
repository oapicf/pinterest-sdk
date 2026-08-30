# PinterestSdk.BillingInvoice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | The ID of the ad account this invoice belongs to | [optional] 
**adAccountName** | **String** | The name of the ad account this invoice belongs to | [optional] 
**amountBilledMicroCurrency** | **Number** | The amount billed in this invoice. Denoted in micro currency | [optional] 
**amountDiscountMicroCurrency** | **Number** | The discount in this invoice. Denoted in micro currency | [optional] 
**amountNetMicroCurrency** | **Number** | The net amount in this invoice. Denoted in micro currency | [optional] 
**amountTaxMicroCurrency** | **Number** | The tax in this invoice. Denoted in micro currency | [optional] 
**billToCountry** | **String** | The country of the bill to address | [optional] 
**billingPeriodEndDate** | **Date** | The end date of the billing period. Format: YYYY-MM-DD | [optional] 
**billingPeriodStartDate** | **Date** | The start date of the billing period. Format: YYYY-MM-DD | [optional] 
**currency** | [**Currency**](Currency.md) |  | [optional] 
**documentType** | [**BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document | [optional] 
**id** | **String** | Unique identifier for the billing invoice | [optional] 
**invoiceDueDate** | **Date** | The date the invoice is due. Format: YYYY-MM-DD | [optional] 
**paymentTerms** | **String** | The payment terms of the invoice | [optional] 
**status** | [**BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice | [optional] 


