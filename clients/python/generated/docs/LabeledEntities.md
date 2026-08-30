# LabeledEntities


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entities_labels** | [**List[EntityLabel]**](EntityLabel.md) |  | [optional] [readonly] 
**errors** | [**List[EntityLabelError]**](EntityLabelError.md) | Labels that were not successfully applied. | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.labeled_entities import LabeledEntities

# TODO update the JSON string below
json = "{}"
# create an instance of LabeledEntities from a JSON string
labeled_entities_instance = LabeledEntities.from_json(json)
# print the JSON string representation of the object
print(LabeledEntities.to_json())

# convert the object into a dict
labeled_entities_dict = labeled_entities_instance.to_dict()
# create an instance of LabeledEntities from a dict
labeled_entities_from_dict = LabeledEntities.from_dict(labeled_entities_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


