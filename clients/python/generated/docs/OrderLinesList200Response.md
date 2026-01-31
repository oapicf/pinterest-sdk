# OrderLinesList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[OrderLine]**](OrderLine.md) |  | 

## Example

```python
from pinterestsdk.models.order_lines_list200_response import OrderLinesList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLinesList200Response from a JSON string
order_lines_list200_response_instance = OrderLinesList200Response.from_json(json)
# print the JSON string representation of the object
print(OrderLinesList200Response.to_json())

# convert the object into a dict
order_lines_list200_response_dict = order_lines_list200_response_instance.to_dict()
# create an instance of OrderLinesList200Response from a dict
order_lines_list200_response_from_dict = OrderLinesList200Response.from_dict(order_lines_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


