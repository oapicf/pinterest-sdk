# SSIOInsertionOrderStatus

SSIO insertion order status item in a list response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_time** | **str** | Salesforce insertion order creation time | [optional] 
**pin_order_id** | **str** | Salesforce order id | [optional] 
**status** | **str** | Salesforce insertion order status | [optional] 

## Example

```python
from pinterestsdk.models.ssio_insertion_order_status import SSIOInsertionOrderStatus

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOInsertionOrderStatus from a JSON string
ssio_insertion_order_status_instance = SSIOInsertionOrderStatus.from_json(json)
# print the JSON string representation of the object
print(SSIOInsertionOrderStatus.to_json())

# convert the object into a dict
ssio_insertion_order_status_dict = ssio_insertion_order_status_instance.to_dict()
# create an instance of SSIOInsertionOrderStatus from a dict
ssio_insertion_order_status_from_dict = SSIOInsertionOrderStatus.from_dict(ssio_insertion_order_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


