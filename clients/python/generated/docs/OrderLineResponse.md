# OrderLineResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[OrderLineError]**](OrderLineError.md) | Error list if update(s) fail. | [optional] 
**order_line** | [**List[OrderLine]**](OrderLine.md) | Order Line object array. | [optional] 

## Example

```python
from pinterestsdk.models.order_line_response import OrderLineResponse

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLineResponse from a JSON string
order_line_response_instance = OrderLineResponse.from_json(json)
# print the JSON string representation of the object
print(OrderLineResponse.to_json())

# convert the object into a dict
order_line_response_dict = order_line_response_instance.to_dict()
# create an instance of OrderLineResponse from a dict
order_line_response_from_dict = OrderLineResponse.from_dict(order_line_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


