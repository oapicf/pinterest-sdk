# OAIBillingInvoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **NSString*** | The ID of the ad account this invoice belongs to | [optional] 
**adAccountName** | **NSString*** | The name of the ad account this invoice belongs to | [optional] 
**amountBilledMicroCurrency** | **NSNumber*** | The amount billed in this invoice. Denoted in micro currency | [optional] 
**amountDiscountMicroCurrency** | **NSNumber*** | The discount in this invoice. Denoted in micro currency | [optional] 
**amountNetMicroCurrency** | **NSNumber*** | The net amount in this invoice. Denoted in micro currency | [optional] 
**amountTaxMicroCurrency** | **NSNumber*** | The tax in this invoice. Denoted in micro currency | [optional] 
**billToCountry** | **NSString*** | The country of the bill to address | [optional] 
**billingPeriodEndDate** | **NSDate*** | The end date of the billing period. Format: YYYY-MM-DD | [optional] 
**billingPeriodStartDate** | **NSDate*** | The start date of the billing period. Format: YYYY-MM-DD | [optional] 
**currency** | [**OAICurrency***](OAICurrency.md) |  | [optional] 
**documentType** | [**OAIBillingInvoiceDocumentType***](OAIBillingInvoiceDocumentType.md) | The type of the document | [optional] 
**_id** | **NSString*** | Unique identifier for the billing invoice | [optional] 
**invoiceDueDate** | **NSDate*** | The date the invoice is due. Format: YYYY-MM-DD | [optional] 
**paymentTerms** | **NSString*** | The payment terms of the invoice | [optional] 
**status** | [**OAIBillingInvoiceStatus***](OAIBillingInvoiceStatus.md) | The status of the invoice | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


