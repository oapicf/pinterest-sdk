# Org.OpenAPITools.Model.BillingInvoiceResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | The ID of the ad account this invoice belongs to | [optional] 
**AdAccountName** | **string** | The name of the ad account this invoice belongs to | [optional] 
**AmountBilledMicroCurrency** | **int** | The amount billed in this invoice. Denoted in micro currency | [optional] 
**AmountDiscountMicroCurrency** | **int** | The discount in this invoice. Denoted in micro currency | [optional] 
**AmountNetMicroCurrency** | **int** | The net amount in this invoice. Denoted in micro currency | [optional] 
**AmountTaxMicroCurrency** | **int** | The tax in this invoice. Denoted in micro currency | [optional] 
**BillToCountry** | **string** | The country of the bill to address | [optional] 
**BillingPeriodEndDate** | **DateOnly** | The end date of the billing period. Format: YYYY-MM-DD | [optional] 
**BillingPeriodStartDate** | **DateOnly** | The start date of the billing period. Format: YYYY-MM-DD | [optional] 
**Currency** | **Currency** |  | [optional] 
**DocumentType** | **string** | The type of the document | [optional] 
**Id** | **string** | Unique identifier for the billing invoice | [optional] 
**InvoiceDueDate** | **DateOnly** | The date the invoice is due. Format: YYYY-MM-DD | [optional] 
**PaymentTerms** | **string** | The payment terms of the invoice | [optional] 
**Status** | **string** | The status of the invoice | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

