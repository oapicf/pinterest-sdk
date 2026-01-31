# BillingInvoiceResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | The ID of the ad account this invoice belongs to | [optional]
**ad_account_name** | Option<**String**> | The name of the ad account this invoice belongs to | [optional]
**amount_billed_micro_currency** | Option<**i32**> | The amount billed in this invoice. Denoted in micro currency | [optional]
**amount_discount_micro_currency** | Option<**i32**> | The discount in this invoice. Denoted in micro currency | [optional]
**amount_net_micro_currency** | Option<**i32**> | The net amount in this invoice. Denoted in micro currency | [optional]
**amount_tax_micro_currency** | Option<**i32**> | The tax in this invoice. Denoted in micro currency | [optional]
**bill_to_country** | Option<**String**> | The country of the bill to address | [optional]
**billing_period_end_date** | Option<[**String**](string.md)> | The end date of the billing period. Format: YYYY-MM-DD | [optional]
**billing_period_start_date** | Option<[**String**](string.md)> | The start date of the billing period. Format: YYYY-MM-DD | [optional]
**currency** | Option<[**models::Currency**](Currency.md)> |  | [optional]
**document_type** | Option<**String**> | The type of the document | [optional]
**id** | Option<**String**> | Unique identifier for the billing invoice | [optional]
**invoice_due_date** | Option<[**String**](string.md)> | The date the invoice is due. Format: YYYY-MM-DD | [optional]
**payment_terms** | Option<**String**> | The payment terms of the invoice | [optional]
**status** | Option<**String**> | The status of the invoice | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


