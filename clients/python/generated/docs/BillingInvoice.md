# BillingInvoice

A billing invoice in the advertiser account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | The ID of the ad account this invoice belongs to | [optional] 
**ad_account_name** | **str** | The name of the ad account this invoice belongs to | [optional] 
**amount_billed_micro_currency** | **int** | The amount billed in this invoice. Denoted in micro currency | [optional] 
**amount_discount_micro_currency** | **int** | The discount in this invoice. Denoted in micro currency | [optional] 
**amount_net_micro_currency** | **int** | The net amount in this invoice. Denoted in micro currency | [optional] 
**amount_tax_micro_currency** | **int** | The tax in this invoice. Denoted in micro currency | [optional] 
**bill_to_country** | **str** | The country of the bill to address | [optional] 
**billing_period_end_date** | **date** | The end date of the billing period. Format: YYYY-MM-DD | [optional] 
**billing_period_start_date** | **date** | The start date of the billing period. Format: YYYY-MM-DD | [optional] 
**currency** | [**Currency**](Currency.md) |  | [optional] 
**document_type** | [**BillingInvoiceDocumentType**](BillingInvoiceDocumentType.md) | The type of the document | [optional] 
**id** | **str** | Unique identifier for the billing invoice | [optional] 
**invoice_due_date** | **date** | The date the invoice is due. Format: YYYY-MM-DD | [optional] 
**payment_terms** | **str** | The payment terms of the invoice | [optional] 
**status** | [**BillingInvoiceStatus**](BillingInvoiceStatus.md) | The status of the invoice | [optional] 

## Example

```python
from pinterestsdk.models.billing_invoice import BillingInvoice

# TODO update the JSON string below
json = "{}"
# create an instance of BillingInvoice from a JSON string
billing_invoice_instance = BillingInvoice.from_json(json)
# print the JSON string representation of the object
print(BillingInvoice.to_json())

# convert the object into a dict
billing_invoice_dict = billing_invoice_instance.to_dict()
# create an instance of BillingInvoice from a dict
billing_invoice_from_dict = BillingInvoice.from_dict(billing_invoice_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


