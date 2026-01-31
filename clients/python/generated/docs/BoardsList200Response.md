# BoardsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Board]**](Board.md) |  | 

## Example

```python
from pinterestsdk.models.boards_list200_response import BoardsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BoardsList200Response from a JSON string
boards_list200_response_instance = BoardsList200Response.from_json(json)
# print the JSON string representation of the object
print(BoardsList200Response.to_json())

# convert the object into a dict
boards_list200_response_dict = boards_list200_response_instance.to_dict()
# create an instance of BoardsList200Response from a dict
boards_list200_response_from_dict = BoardsList200Response.from_dict(boards_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


