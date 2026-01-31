# OrderLinesArrayResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[OrderLines]**](OrderLines.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.order_lines_array_response import OrderLinesArrayResponse

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLinesArrayResponse from a JSON string
order_lines_array_response_instance = OrderLinesArrayResponse.from_json(json)
# print the JSON string representation of the object
print(OrderLinesArrayResponse.to_json())

# convert the object into a dict
order_lines_array_response_dict = order_lines_array_response_instance.to_dict()
# create an instance of OrderLinesArrayResponse from a dict
order_lines_array_response_from_dict = OrderLinesArrayResponse.from_dict(order_lines_array_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


