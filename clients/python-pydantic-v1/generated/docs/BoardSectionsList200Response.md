# BoardSectionsList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[BoardSection]**](BoardSection.md) |  | 

## Example

```python
from openapi_client.models.board_sections_list200_response import BoardSectionsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BoardSectionsList200Response from a JSON string
board_sections_list200_response_instance = BoardSectionsList200Response.from_json(json)
# print the JSON string representation of the object
print BoardSectionsList200Response.to_json()

# convert the object into a dict
board_sections_list200_response_dict = board_sections_list200_response_instance.to_dict()
# create an instance of BoardSectionsList200Response from a dict
board_sections_list200_response_from_dict = BoardSectionsList200Response.from_dict(board_sections_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


