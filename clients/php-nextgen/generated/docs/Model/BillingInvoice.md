# BillingInvoice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The ID of the ad account this invoice belongs to | [optional]
**ad_account_name** | **string** | The name of the ad account this invoice belongs to | [optional]
**amount_billed_micro_currency** | **int** | The amount billed in this invoice. Denoted in micro currency | [optional]
**amount_discount_micro_currency** | **int** | The discount in this invoice. Denoted in micro currency | [optional]
**amount_net_micro_currency** | **int** | The net amount in this invoice. Denoted in micro currency | [optional]
**amount_tax_micro_currency** | **int** | The tax in this invoice. Denoted in micro currency | [optional]
**bill_to_country** | **string** | The country of the bill to address | [optional]
**billing_period_end_date** | **\DateTime** | The end date of the billing period. Format: YYYY-MM-DD | [optional]
**billing_period_start_date** | **\DateTime** | The start date of the billing period. Format: YYYY-MM-DD | [optional]
**currency** | [**\OpenAPI\Client\Model\Currency**](Currency.md) |  | [optional]
**document_type** | [**\OpenAPI\Client\Model\BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document | [optional]
**id** | **string** | Unique identifier for the billing invoice | [optional]
**invoice_due_date** | **\DateTime** | The date the invoice is due. Format: YYYY-MM-DD | [optional]
**payment_terms** | **string** | The payment terms of the invoice | [optional]
**status** | [**\OpenAPI\Client\Model\BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
