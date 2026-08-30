# BoardSectionUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**name** | **str** |  | 

## Example

```python
from pinterestsdk.models.board_section_update_with_required_body import BoardSectionUpdateWithRequiredBody

# TODO update the JSON string below
json = "{}"
# create an instance of BoardSectionUpdateWithRequiredBody from a JSON string
board_section_update_with_required_body_instance = BoardSectionUpdateWithRequiredBody.from_json(json)
# print the JSON string representation of the object
print(BoardSectionUpdateWithRequiredBody.to_json())

# convert the object into a dict
board_section_update_with_required_body_dict = board_section_update_with_required_body_instance.to_dict()
# create an instance of BoardSectionUpdateWithRequiredBody from a dict
board_section_update_with_required_body_from_dict = BoardSectionUpdateWithRequiredBody.from_dict(board_section_update_with_required_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


