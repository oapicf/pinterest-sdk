# openapi::BillingInvoiceResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | The ID of the ad account this invoice belongs to | [optional] [Pattern: ^\\d+$] 
**ad_account_name** | **character** | The name of the ad account this invoice belongs to | [optional] 
**amount_billed_micro_currency** | **integer** | The amount billed in this invoice. Denoted in micro currency | [optional] 
**amount_discount_micro_currency** | **integer** | The discount in this invoice. Denoted in micro currency | [optional] 
**amount_net_micro_currency** | **integer** | The net amount in this invoice. Denoted in micro currency | [optional] 
**amount_tax_micro_currency** | **integer** | The tax in this invoice. Denoted in micro currency | [optional] 
**bill_to_country** | **character** | The country of the bill to address | [optional] 
**billing_period_end_date** | **character** | The end date of the billing period. Format: YYYY-MM-DD | [optional] [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**billing_period_start_date** | **character** | The start date of the billing period. Format: YYYY-MM-DD | [optional] [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**currency** | [**Currency**](Currency.md) |  | [optional] [Enum: ] 
**document_type** | **character** | The type of the document | [optional] [Enum: [INVOICE, CREDIT_MEMO]] 
**id** | **character** | Unique identifier for the billing invoice | [optional] [Pattern: ^\\d+$] 
**invoice_due_date** | **character** | The date the invoice is due. Format: YYYY-MM-DD | [optional] [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**payment_terms** | **character** | The payment terms of the invoice | [optional] 
**status** | **character** | The status of the invoice | [optional] [Enum: [OPEN, CLOSED]] 


