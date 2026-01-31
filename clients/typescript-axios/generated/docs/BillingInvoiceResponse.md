# BillingInvoiceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The ID of the ad account this invoice belongs to | [optional] [default to undefined]
**ad_account_name** | **string** | The name of the ad account this invoice belongs to | [optional] [default to undefined]
**amount_billed_micro_currency** | **number** | The amount billed in this invoice. Denoted in micro currency | [optional] [default to undefined]
**amount_discount_micro_currency** | **number** | The discount in this invoice. Denoted in micro currency | [optional] [default to undefined]
**amount_net_micro_currency** | **number** | The net amount in this invoice. Denoted in micro currency | [optional] [default to undefined]
**amount_tax_micro_currency** | **number** | The tax in this invoice. Denoted in micro currency | [optional] [default to undefined]
**bill_to_country** | **string** | The country of the bill to address | [optional] [default to undefined]
**billing_period_end_date** | **string** | The end date of the billing period. Format: YYYY-MM-DD | [optional] [default to undefined]
**billing_period_start_date** | **string** | The start date of the billing period. Format: YYYY-MM-DD | [optional] [default to undefined]
**currency** | [**Currency**](Currency.md) |  | [optional] [default to undefined]
**document_type** | **string** | The type of the document | [optional] [default to undefined]
**id** | **string** | Unique identifier for the billing invoice | [optional] [default to undefined]
**invoice_due_date** | **string** | The date the invoice is due. Format: YYYY-MM-DD | [optional] [default to undefined]
**payment_terms** | **string** | The payment terms of the invoice | [optional] [default to undefined]
**status** | **string** | The status of the invoice | [optional] [default to undefined]

## Example

```typescript
import { BillingInvoiceResponse } from './api';

const instance: BillingInvoiceResponse = {
    ad_account_id,
    ad_account_name,
    amount_billed_micro_currency,
    amount_discount_micro_currency,
    amount_net_micro_currency,
    amount_tax_micro_currency,
    bill_to_country,
    billing_period_end_date,
    billing_period_start_date,
    currency,
    document_type,
    id,
    invoice_due_date,
    payment_terms,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
