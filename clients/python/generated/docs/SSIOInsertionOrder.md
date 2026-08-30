# SSIOInsertionOrder

An SSIO insertion order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pin_order_id** | **str** | Salesforce order id | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.ssio_insertion_order import SSIOInsertionOrder

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOInsertionOrder from a JSON string
ssio_insertion_order_instance = SSIOInsertionOrder.from_json(json)
# print the JSON string representation of the object
print(SSIOInsertionOrder.to_json())

# convert the object into a dict
ssio_insertion_order_dict = ssio_insertion_order_instance.to_dict()
# create an instance of SSIOInsertionOrder from a dict
ssio_insertion_order_from_dict = SSIOInsertionOrder.from_dict(ssio_insertion_order_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


