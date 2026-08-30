# LabelCreateItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label_type** | [**LabelType**](LabelType.md) |  | 
**value** | **str** | Label name. 100-character limit. | 

## Example

```python
from pinterestsdk.models.label_create_item import LabelCreateItem

# TODO update the JSON string below
json = "{}"
# create an instance of LabelCreateItem from a JSON string
label_create_item_instance = LabelCreateItem.from_json(json)
# print the JSON string representation of the object
print(LabelCreateItem.to_json())

# convert the object into a dict
label_create_item_dict = label_create_item_instance.to_dict()
# create an instance of LabelCreateItem from a dict
label_create_item_from_dict = LabelCreateItem.from_dict(label_create_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


