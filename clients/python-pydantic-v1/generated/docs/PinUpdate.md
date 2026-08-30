# PinUpdate

Resource create or update operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ai_disclosures** | [**AiDisclosuresUpdate**](AiDisclosuresUpdate.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**alt_text** | **str** |  | [optional] 
**board_id** | **str** | The board to which this Pin belongs. | [optional] 
**board_section_id** | **str** | The board section to which this Pin belongs. | [optional] 
**carousel_slots** | [**List[CarouselSlot]**](CarouselSlot.md) | Carousel Pin slots data. | [optional] 
**description** | **str** |  | [optional] 
**link** | **str** |  | [optional] 
**title** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.pin_update import PinUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of PinUpdate from a JSON string
pin_update_instance = PinUpdate.from_json(json)
# print the JSON string representation of the object
print PinUpdate.to_json()

# convert the object into a dict
pin_update_dict = pin_update_instance.to_dict()
# create an instance of PinUpdate from a dict
pin_update_from_dict = PinUpdate.from_dict(pin_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


