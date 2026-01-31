# billing_invoice_response_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | The ID of the ad account this invoice belongs to | [optional] 
**ad_account_name** | **char \*** | The name of the ad account this invoice belongs to | [optional] 
**amount_billed_micro_currency** | **int** | The amount billed in this invoice. Denoted in micro currency | [optional] 
**amount_discount_micro_currency** | **int** | The discount in this invoice. Denoted in micro currency | [optional] 
**amount_net_micro_currency** | **int** | The net amount in this invoice. Denoted in micro currency | [optional] 
**amount_tax_micro_currency** | **int** | The tax in this invoice. Denoted in micro currency | [optional] 
**bill_to_country** | **char \*** | The country of the bill to address | [optional] 
**billing_period_end_date** | **char \*** | The end date of the billing period. Format: YYYY-MM-DD | [optional] 
**billing_period_start_date** | **char \*** | The start date of the billing period. Format: YYYY-MM-DD | [optional] 
**currency** | **currency_t \*** |  | [optional] 
**document_type** | **pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_e** | The type of the document | [optional] 
**id** | **char \*** | Unique identifier for the billing invoice | [optional] 
**invoice_due_date** | **char \*** | The date the invoice is due. Format: YYYY-MM-DD | [optional] 
**payment_terms** | **char \*** | The payment terms of the invoice | [optional] 
**status** | **pinterest_rest_api_billing_invoice_response_STATUS_e** | The status of the invoice | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


