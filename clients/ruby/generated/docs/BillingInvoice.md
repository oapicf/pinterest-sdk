# PinterestSdkClient::BillingInvoice

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | The ID of the ad account this invoice belongs to | [optional] |
| **ad_account_name** | **String** | The name of the ad account this invoice belongs to | [optional] |
| **amount_billed_micro_currency** | **Integer** | The amount billed in this invoice. Denoted in micro currency | [optional] |
| **amount_discount_micro_currency** | **Integer** | The discount in this invoice. Denoted in micro currency | [optional] |
| **amount_net_micro_currency** | **Integer** | The net amount in this invoice. Denoted in micro currency | [optional] |
| **amount_tax_micro_currency** | **Integer** | The tax in this invoice. Denoted in micro currency | [optional] |
| **bill_to_country** | **String** | The country of the bill to address | [optional] |
| **billing_period_end_date** | **Date** | The end date of the billing period. Format: YYYY-MM-DD | [optional] |
| **billing_period_start_date** | **Date** | The start date of the billing period. Format: YYYY-MM-DD | [optional] |
| **currency** | [**Currency**](Currency.md) |  | [optional] |
| **document_type** | [**BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document | [optional] |
| **id** | **String** | Unique identifier for the billing invoice | [optional] |
| **invoice_due_date** | **Date** | The date the invoice is due. Format: YYYY-MM-DD | [optional] |
| **payment_terms** | **String** | The payment terms of the invoice | [optional] |
| **status** | [**BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BillingInvoice.new(
  ad_account_id: null,
  ad_account_name: null,
  amount_billed_micro_currency: null,
  amount_discount_micro_currency: null,
  amount_net_micro_currency: null,
  amount_tax_micro_currency: null,
  bill_to_country: null,
  billing_period_end_date: null,
  billing_period_start_date: null,
  currency: null,
  document_type: null,
  id: null,
  invoice_due_date: null,
  payment_terms: NET 30,
  status: OPEN
)
```

