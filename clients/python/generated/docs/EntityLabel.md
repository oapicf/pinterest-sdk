# EntityLabel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **str** | Entity ID to apply label to. | 
**entity_type** | [**LabelParentType**](LabelParentType.md) |  | [optional] 
**label_id** | **str** | Label ID. | 
**status** | [**EntityLabelStatus**](EntityLabelStatus.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.entity_label import EntityLabel

# TODO update the JSON string below
json = "{}"
# create an instance of EntityLabel from a JSON string
entity_label_instance = EntityLabel.from_json(json)
# print the JSON string representation of the object
print(EntityLabel.to_json())

# convert the object into a dict
entity_label_dict = entity_label_instance.to_dict()
# create an instance of EntityLabel from a dict
entity_label_from_dict = EntityLabel.from_dict(entity_label_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


