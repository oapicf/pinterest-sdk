# SearchUserPinsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Pin]**](Pin.md) |  | 

## Example

```python
from pinterestsdk.models.search_user_pins_list200_response import SearchUserPinsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of SearchUserPinsList200Response from a JSON string
search_user_pins_list200_response_instance = SearchUserPinsList200Response.from_json(json)
# print the JSON string representation of the object
print(SearchUserPinsList200Response.to_json())

# convert the object into a dict
search_user_pins_list200_response_dict = search_user_pins_list200_response_instance.to_dict()
# create an instance of SearchUserPinsList200Response from a dict
search_user_pins_list200_response_from_dict = SearchUserPinsList200Response.from_dict(search_user_pins_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


