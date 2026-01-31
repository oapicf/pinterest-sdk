# BoardsListPins200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Pin]**](Pin.md) | Pins | 

## Example

```python
from pinterestsdk.models.boards_list_pins200_response import BoardsListPins200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BoardsListPins200Response from a JSON string
boards_list_pins200_response_instance = BoardsListPins200Response.from_json(json)
# print the JSON string representation of the object
print(BoardsListPins200Response.to_json())

# convert the object into a dict
boards_list_pins200_response_dict = boards_list_pins200_response_instance.to_dict()
# create an instance of BoardsListPins200Response from a dict
boards_list_pins200_response_from_dict = BoardsListPins200Response.from_dict(boards_list_pins200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


