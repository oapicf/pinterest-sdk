# BillingInvoicesGet200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[BillingInvoice]**](BillingInvoice.md) |  | 

## Example

```python
from openapi_client.models.billing_invoices_get200_response import BillingInvoicesGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BillingInvoicesGet200Response from a JSON string
billing_invoices_get200_response_instance = BillingInvoicesGet200Response.from_json(json)
# print the JSON string representation of the object
print BillingInvoicesGet200Response.to_json()

# convert the object into a dict
billing_invoices_get200_response_dict = billing_invoices_get200_response_instance.to_dict()
# create an instance of BillingInvoicesGet200Response from a dict
billing_invoices_get200_response_from_dict = BillingInvoicesGet200Response.from_dict(billing_invoices_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


