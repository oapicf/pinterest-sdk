# OrderLineError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**OrderLine**](.md) |  | [optional] 
**error_messages** | **List[str]** |  | [optional] 

## Example

```python
from pinterestsdk.models.order_line_error import OrderLineError

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLineError from a JSON string
order_line_error_instance = OrderLineError.from_json(json)
# print the JSON string representation of the object
print(OrderLineError.to_json())

# convert the object into a dict
order_line_error_dict = order_line_error_instance.to_dict()
# create an instance of OrderLineError from a dict
order_line_error_from_dict = OrderLineError.from_dict(order_line_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


