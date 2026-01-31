# BILLING_INVOICE_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | The ID of the ad account this invoice belongs to | [optional] [default to null]
**ad_account_name** | [**STRING_32**](STRING_32.md) | The name of the ad account this invoice belongs to | [optional] [default to null]
**amount_billed_micro_currency** | **INTEGER_32** | The amount billed in this invoice. Denoted in micro currency | [optional] [default to null]
**amount_discount_micro_currency** | **INTEGER_32** | The discount in this invoice. Denoted in micro currency | [optional] [default to null]
**amount_net_micro_currency** | **INTEGER_32** | The net amount in this invoice. Denoted in micro currency | [optional] [default to null]
**amount_tax_micro_currency** | **INTEGER_32** | The tax in this invoice. Denoted in micro currency | [optional] [default to null]
**bill_to_country** | [**STRING_32**](STRING_32.md) | The country of the bill to address | [optional] [default to null]
**billing_period_end_date** | [**DATE**](DATE.md) | The end date of the billing period. Format: YYYY-MM-DD | [optional] [default to null]
**billing_period_start_date** | [**DATE**](DATE.md) | The start date of the billing period. Format: YYYY-MM-DD | [optional] [default to null]
**currency** | [**CURRENCY**](Currency.md) |  | [optional] [default to null]
**document_type** | [**STRING_32**](STRING_32.md) | The type of the document | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Unique identifier for the billing invoice | [optional] [default to null]
**invoice_due_date** | [**DATE**](DATE.md) | The date the invoice is due. Format: YYYY-MM-DD | [optional] [default to null]
**payment_terms** | [**STRING_32**](STRING_32.md) | The payment terms of the invoice | [optional] [default to null]
**status** | [**STRING_32**](STRING_32.md) | The status of the invoice | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


