# LabelUpdateItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Label ID. | 
**status** | [**LabelStatus**](LabelStatus.md) |  | [optional] 
**value** | **str** | Label name. 100-character limit. | [optional] 

## Example

```python
from openapi_client.models.label_update_item import LabelUpdateItem

# TODO update the JSON string below
json = "{}"
# create an instance of LabelUpdateItem from a JSON string
label_update_item_instance = LabelUpdateItem.from_json(json)
# print the JSON string representation of the object
print LabelUpdateItem.to_json()

# convert the object into a dict
label_update_item_dict = label_update_item_instance.to_dict()
# create an instance of LabelUpdateItem from a dict
label_update_item_from_dict = LabelUpdateItem.from_dict(label_update_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


