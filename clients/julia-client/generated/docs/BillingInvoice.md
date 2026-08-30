# BillingInvoice


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_account_id`** | **`String`** | The ID of the ad account this invoice belongs to | [optional] [default to nothing]
**`ad_account_name`** | **`String`** | The name of the ad account this invoice belongs to | [optional] [default to nothing]
**`amount_billed_micro_currency`** | **`Int64`** | The amount billed in this invoice. Denoted in micro currency | [optional] [default to nothing]
**`amount_discount_micro_currency`** | **`Int64`** | The discount in this invoice. Denoted in micro currency | [optional] [default to nothing]
**`amount_net_micro_currency`** | **`Int64`** | The net amount in this invoice. Denoted in micro currency | [optional] [default to nothing]
**`amount_tax_micro_currency`** | **`Int64`** | The tax in this invoice. Denoted in micro currency | [optional] [default to nothing]
**`bill_to_country`** | **`String`** | The country of the bill to address | [optional] [default to nothing]
**`billing_period_end_date`** | **`Date`** | The end date of the billing period. Format: YYYY-MM-DD | [optional] [default to nothing]
**`billing_period_start_date`** | **`Date`** | The start date of the billing period. Format: YYYY-MM-DD | [optional] [default to nothing]
**`currency`** | [**`*Currency`**](Currency.md) |  | [optional] [default to nothing]
**`document_type`** | [**`*BillingInvoiceDocumentType`**](BillingInvoiceDocumentType.md) | The type of the document | [optional] [default to nothing]
**`id`** | **`String`** | Unique identifier for the billing invoice | [optional] [default to nothing]
**`invoice_due_date`** | **`Date`** | The date the invoice is due. Format: YYYY-MM-DD | [optional] [default to nothing]
**`payment_terms`** | **`String`** | The payment terms of the invoice | [optional] [default to nothing]
**`status`** | [**`*BillingInvoiceStatus`**](BillingInvoiceStatus.md) | The status of the invoice | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


