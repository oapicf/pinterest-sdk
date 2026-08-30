# BoardSection

Sections help organize pins within a board.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**name** | **str** |  | 

## Example

```python
from openapi_client.models.board_section import BoardSection

# TODO update the JSON string below
json = "{}"
# create an instance of BoardSection from a JSON string
board_section_instance = BoardSection.from_json(json)
# print the JSON string representation of the object
print BoardSection.to_json()

# convert the object into a dict
board_section_dict = board_section_instance.to_dict()
# create an instance of BoardSection from a dict
board_section_from_dict = BoardSection.from_dict(board_section_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


