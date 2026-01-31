# BillingInvoiceDownloadResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_url** | **str** | The download url for the billing invoice | [optional] 
**id** | **str** | The billing invoice id | [optional] 

## Example

```python
from pinterestsdk.models.billing_invoice_download_response import BillingInvoiceDownloadResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BillingInvoiceDownloadResponse from a JSON string
billing_invoice_download_response_instance = BillingInvoiceDownloadResponse.from_json(json)
# print the JSON string representation of the object
print(BillingInvoiceDownloadResponse.to_json())

# convert the object into a dict
billing_invoice_download_response_dict = billing_invoice_download_response_instance.to_dict()
# create an instance of BillingInvoiceDownloadResponse from a dict
billing_invoice_download_response_from_dict = BillingInvoiceDownloadResponse.from_dict(billing_invoice_download_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


