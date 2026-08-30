# BillingInvoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | The ID of the ad account this invoice belongs to | [optional] [default to None]
**ad_account_name** | **String** | The name of the ad account this invoice belongs to | [optional] [default to None]
**amount_billed_micro_currency** | **i32** | The amount billed in this invoice. Denoted in micro currency | [optional] [default to None]
**amount_discount_micro_currency** | **i32** | The discount in this invoice. Denoted in micro currency | [optional] [default to None]
**amount_net_micro_currency** | **i32** | The net amount in this invoice. Denoted in micro currency | [optional] [default to None]
**amount_tax_micro_currency** | **i32** | The tax in this invoice. Denoted in micro currency | [optional] [default to None]
**bill_to_country** | **String** | The country of the bill to address | [optional] [default to None]
**billing_period_end_date** | [***chrono::naive::NaiveDate**](date.md) | The end date of the billing period. Format: YYYY-MM-DD | [optional] [default to None]
**billing_period_start_date** | [***chrono::naive::NaiveDate**](date.md) | The start date of the billing period. Format: YYYY-MM-DD | [optional] [default to None]
**currency** | [***models::Currency**](Currency.md) |  | [optional] [default to None]
**document_type** | [***models::BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document | [optional] [default to None]
**id** | **String** | Unique identifier for the billing invoice | [optional] [default to None]
**invoice_due_date** | [***chrono::naive::NaiveDate**](date.md) | The date the invoice is due. Format: YYYY-MM-DD | [optional] [default to None]
**payment_terms** | **String** | The payment terms of the invoice | [optional] [default to None]
**status** | [***models::BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


