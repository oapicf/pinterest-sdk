# BillingInvoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String!** | The ID of the ad account this invoice belongs to | [optional] [default to null]
**adAccountName** | **String!** | The name of the ad account this invoice belongs to | [optional] [default to null]
**amountBilledMicroCurrency** | **Int!** | The amount billed in this invoice. Denoted in micro currency | [optional] [default to null]
**amountDiscountMicroCurrency** | **Int** | The discount in this invoice. Denoted in micro currency | [optional] [default to null]
**amountNetMicroCurrency** | **Int** | The net amount in this invoice. Denoted in micro currency | [optional] [default to null]
**amountTaxMicroCurrency** | **Int** | The tax in this invoice. Denoted in micro currency | [optional] [default to null]
**billToCountry** | **String!** | The country of the bill to address | [optional] [default to null]
**billingPeriodEndDate** | **String!** | The end date of the billing period. Format: YYYY-MM-DD | [optional] [default to null]
**billingPeriodStartDate** | **String!** | The start date of the billing period. Format: YYYY-MM-DD | [optional] [default to null]
**currency** | [***Currency**](Currency.md) |  | [optional] [default to null]
**documentType** | [***BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document | [optional] [default to null]
**Id_** | **String!** | Unique identifier for the billing invoice | [optional] [default to null]
**invoiceDueDate** | **String!** | The date the invoice is due. Format: YYYY-MM-DD | [optional] [default to null]
**paymentTerms** | **String!** | The payment terms of the invoice | [optional] [default to null]
**status** | [***BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


