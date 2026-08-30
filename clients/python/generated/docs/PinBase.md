# PinBase


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ai_disclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**board_id** | **str** | The board to which this Pin belongs. | [optional] 
**board_owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**board_section_id** | **str** | The board section to which this Pin belongs. | [optional] 
**created_at** | **datetime** |  | [optional] [readonly] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] 
**dominant_color** | **str** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**has_been_promoted** | **bool** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**id** | **str** |  | 
**is_owner** | **bool** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**is_product** | **bool** | Whether the Pin is a product Pin. | [optional] [readonly] 
**is_standard** | **bool** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**parent_pin_id** | **str** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**pin_metrics** | **object** | Pin metrics with associated time intervals if any. | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.pin_base import PinBase

# TODO update the JSON string below
json = "{}"
# create an instance of PinBase from a JSON string
pin_base_instance = PinBase.from_json(json)
# print the JSON string representation of the object
print(PinBase.to_json())

# convert the object into a dict
pin_base_dict = pin_base_instance.to_dict()
# create an instance of PinBase from a dict
pin_base_from_dict = PinBase.from_dict(pin_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


