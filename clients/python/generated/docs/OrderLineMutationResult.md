# OrderLineMutationResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[OrderLineMutationError]**](OrderLineMutationError.md) | Error list if update(s) fail. | [optional] 
**order_line** | [**List[OrderLine]**](OrderLine.md) | Order Line object array. | [optional] 

## Example

```python
from pinterestsdk.models.order_line_mutation_result import OrderLineMutationResult

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLineMutationResult from a JSON string
order_line_mutation_result_instance = OrderLineMutationResult.from_json(json)
# print the JSON string representation of the object
print(OrderLineMutationResult.to_json())

# convert the object into a dict
order_line_mutation_result_dict = order_line_mutation_result_instance.to_dict()
# create an instance of OrderLineMutationResult from a dict
order_line_mutation_result_from_dict = OrderLineMutationResult.from_dict(order_line_mutation_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


