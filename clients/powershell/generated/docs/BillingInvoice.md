# BillingInvoice
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | The ID of the ad account this invoice belongs to | [optional] 
**AdAccountName** | **String** | The name of the ad account this invoice belongs to | [optional] 
**AmountBilledMicroCurrency** | **Int32** | The amount billed in this invoice. Denoted in micro currency | [optional] 
**AmountDiscountMicroCurrency** | **Int32** | The discount in this invoice. Denoted in micro currency | [optional] 
**AmountNetMicroCurrency** | **Int32** | The net amount in this invoice. Denoted in micro currency | [optional] 
**AmountTaxMicroCurrency** | **Int32** | The tax in this invoice. Denoted in micro currency | [optional] 
**BillToCountry** | **String** | The country of the bill to address | [optional] 
**BillingPeriodEndDate** | **System.DateTime** | The end date of the billing period. Format: YYYY-MM-DD | [optional] 
**BillingPeriodStartDate** | **System.DateTime** | The start date of the billing period. Format: YYYY-MM-DD | [optional] 
**Currency** | [**Currency**](Currency.md) |  | [optional] 
**DocumentType** | [**BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document | [optional] 
**Id** | **String** | Unique identifier for the billing invoice | [optional] 
**InvoiceDueDate** | **System.DateTime** | The date the invoice is due. Format: YYYY-MM-DD | [optional] 
**PaymentTerms** | **String** | The payment terms of the invoice | [optional] 
**Status** | [**BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice | [optional] 

## Examples

- Prepare the resource
```powershell
$BillingInvoice = Initialize-PSOpenAPIToolsBillingInvoice  -AdAccountId null `
 -AdAccountName null `
 -AmountBilledMicroCurrency null `
 -AmountDiscountMicroCurrency null `
 -AmountNetMicroCurrency null `
 -AmountTaxMicroCurrency null `
 -BillToCountry null `
 -BillingPeriodEndDate null `
 -BillingPeriodStartDate null `
 -Currency null `
 -DocumentType null `
 -Id null `
 -InvoiceDueDate null `
 -PaymentTerms NET 30 `
 -Status OPEN
```

- Convert the resource to JSON
```powershell
$BillingInvoice | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

