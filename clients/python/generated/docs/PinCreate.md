# PinCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_text** | **str** |  | [optional] 
**board_id** | **str** | The board to which this Pin belongs. | [optional] 
**board_section_id** | **str** | The board section to which this Pin belongs. | [optional] 
**description** | **str** |  | [optional] 
**dominant_color** | **str** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**link** | **str** |  | [optional] 
**media_source** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**parent_pin_id** | **str** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**sponsor_id** | **str** | The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. | [optional] 
**title** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.pin_create import PinCreate

# TODO update the JSON string below
json = "{}"
# create an instance of PinCreate from a JSON string
pin_create_instance = PinCreate.from_json(json)
# print the JSON string representation of the object
print(PinCreate.to_json())

# convert the object into a dict
pin_create_dict = pin_create_instance.to_dict()
# create an instance of PinCreate from a dict
pin_create_from_dict = PinCreate.from_dict(pin_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


