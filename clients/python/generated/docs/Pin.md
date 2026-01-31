# Pin

Pin model containing properties related to a Pinterest Pin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_text** | **str** |  | [optional] 
**board_id** | **str** | The board to which this Pin belongs. | [optional] 
**board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**board_section_id** | **str** | The board section to which this Pin belongs. | [optional] 
**created_at** | **datetime** |  | [optional] [readonly] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] 
**description** | **str** |  | [optional] 
**dominant_color** | **str** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**has_been_promoted** | **bool** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**id** | **str** |  | 
**is_owner** | **bool** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**is_standard** | **bool** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**link** | **str** |  | [optional] 
**media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**parent_pin_id** | **str** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**pin_metrics** | **object** | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**title** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.pin import Pin

# TODO update the JSON string below
json = "{}"
# create an instance of Pin from a JSON string
pin_instance = Pin.from_json(json)
# print the JSON string representation of the object
print(Pin.to_json())

# convert the object into a dict
pin_dict = pin_instance.to_dict()
# create an instance of Pin from a dict
pin_from_dict = Pin.from_dict(pin_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


