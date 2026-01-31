# SSIOCreateInsertionOrderResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pin_order_id** | **str** | Salesforce order id | [optional] 

## Example

```python
from pinterestsdk.models.ssio_create_insertion_order_response import SSIOCreateInsertionOrderResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOCreateInsertionOrderResponse from a JSON string
ssio_create_insertion_order_response_instance = SSIOCreateInsertionOrderResponse.from_json(json)
# print the JSON string representation of the object
print(SSIOCreateInsertionOrderResponse.to_json())

# convert the object into a dict
ssio_create_insertion_order_response_dict = ssio_create_insertion_order_response_instance.to_dict()
# create an instance of SSIOCreateInsertionOrderResponse from a dict
ssio_create_insertion_order_response_from_dict = SSIOCreateInsertionOrderResponse.from_dict(ssio_create_insertion_order_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


