# OrderLineMutationError


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**OrderLine**](OrderLine.md) |  | [optional] 
**error_messages** | **List[str]** | Error messages. | [optional] 

## Example

```python
from openapi_client.models.order_line_mutation_error import OrderLineMutationError

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLineMutationError from a JSON string
order_line_mutation_error_instance = OrderLineMutationError.from_json(json)
# print the JSON string representation of the object
print OrderLineMutationError.to_json()

# convert the object into a dict
order_line_mutation_error_dict = order_line_mutation_error_instance.to_dict()
# create an instance of OrderLineMutationError from a dict
order_line_mutation_error_from_dict = OrderLineMutationError.from_dict(order_line_mutation_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


