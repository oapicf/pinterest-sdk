# PinsSaveRequestCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_id** | **str** | Unique identifier of the board to which the pin will be saved. | [optional] 
**board_section_id** | **str** | Unique identifier of the board section to which the pin will be saved. | [optional] 

## Example

```python
from pinterestsdk.models.pins_save_request_create import PinsSaveRequestCreate

# TODO update the JSON string below
json = "{}"
# create an instance of PinsSaveRequestCreate from a JSON string
pins_save_request_create_instance = PinsSaveRequestCreate.from_json(json)
# print the JSON string representation of the object
print(PinsSaveRequestCreate.to_json())

# convert the object into a dict
pins_save_request_create_dict = pins_save_request_create_instance.to_dict()
# create an instance of PinsSaveRequestCreate from a dict
pins_save_request_create_from_dict = PinsSaveRequestCreate.from_dict(pins_save_request_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


