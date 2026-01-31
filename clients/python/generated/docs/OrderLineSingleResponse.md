# OrderLineSingleResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**OrderLineResponse**](.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.order_line_single_response import OrderLineSingleResponse

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLineSingleResponse from a JSON string
order_line_single_response_instance = OrderLineSingleResponse.from_json(json)
# print the JSON string representation of the object
print(OrderLineSingleResponse.to_json())

# convert the object into a dict
order_line_single_response_dict = order_line_single_response_instance.to_dict()
# create an instance of OrderLineSingleResponse from a dict
order_line_single_response_from_dict = OrderLineSingleResponse.from_dict(order_line_single_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


