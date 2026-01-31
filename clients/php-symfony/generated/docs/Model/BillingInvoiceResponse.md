# BillingInvoiceResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | The ID of the ad account this invoice belongs to | [optional] 
**adAccountName** | **string** | The name of the ad account this invoice belongs to | [optional] 
**amountBilledMicroCurrency** | **int** | The amount billed in this invoice. Denoted in micro currency | [optional] 
**amountDiscountMicroCurrency** | **int** | The discount in this invoice. Denoted in micro currency | [optional] 
**amountNetMicroCurrency** | **int** | The net amount in this invoice. Denoted in micro currency | [optional] 
**amountTaxMicroCurrency** | **int** | The tax in this invoice. Denoted in micro currency | [optional] 
**billToCountry** | **string** | The country of the bill to address | [optional] 
**billingPeriodEndDate** | [**\DateTime**](Date.md) | The end date of the billing period. Format: YYYY-MM-DD | [optional] 
**billingPeriodStartDate** | [**\DateTime**](Date.md) | The start date of the billing period. Format: YYYY-MM-DD | [optional] 
**currency** | [**OpenAPI\Server\Model\Currency**](Currency.md) |  | [optional] 
**documentType** | **string** | The type of the document | [optional] 
**id** | **string** | Unique identifier for the billing invoice | [optional] 
**invoiceDueDate** | [**\DateTime**](Date.md) | The date the invoice is due. Format: YYYY-MM-DD | [optional] 
**paymentTerms** | **string** | The payment terms of the invoice | [optional] 
**status** | **string** | The status of the invoice | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


