# BoardSectionCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**name** | **str** |  | 

## Example

```python
from pinterestsdk.models.board_section_create import BoardSectionCreate

# TODO update the JSON string below
json = "{}"
# create an instance of BoardSectionCreate from a JSON string
board_section_create_instance = BoardSectionCreate.from_json(json)
# print the JSON string representation of the object
print(BoardSectionCreate.to_json())

# convert the object into a dict
board_section_create_dict = board_section_create_instance.to_dict()
# create an instance of BoardSectionCreate from a dict
board_section_create_from_dict = BoardSectionCreate.from_dict(board_section_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


