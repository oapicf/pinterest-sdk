# SSIOInsertionOrderStatusResponse

SSIO insertion order status response for a single pin order id lookup.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_time** | **str** | Salesforce insertion order creation time | [optional] 
**pin_order_id** | **str** | Salesforce order id | [optional] 
**status** | **str** | Salesforce insertion order status | [optional] 

## Example

```python
from openapi_client.models.ssio_insertion_order_status_response import SSIOInsertionOrderStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOInsertionOrderStatusResponse from a JSON string
ssio_insertion_order_status_response_instance = SSIOInsertionOrderStatusResponse.from_json(json)
# print the JSON string representation of the object
print SSIOInsertionOrderStatusResponse.to_json()

# convert the object into a dict
ssio_insertion_order_status_response_dict = ssio_insertion_order_status_response_instance.to_dict()
# create an instance of SSIOInsertionOrderStatusResponse from a dict
ssio_insertion_order_status_response_from_dict = SSIOInsertionOrderStatusResponse.from_dict(ssio_insertion_order_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


