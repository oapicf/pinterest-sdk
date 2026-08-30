# ItemsPost200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[ItemResponse]**](ItemResponse.md) |  | 

## Example

```python
from pinterestsdk.models.items_post200_response import ItemsPost200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ItemsPost200Response from a JSON string
items_post200_response_instance = ItemsPost200Response.from_json(json)
# print the JSON string representation of the object
print(ItemsPost200Response.to_json())

# convert the object into a dict
items_post200_response_dict = items_post200_response_instance.to_dict()
# create an instance of ItemsPost200Response from a dict
items_post200_response_from_dict = ItemsPost200Response.from_dict(items_post200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


