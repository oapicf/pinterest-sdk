# LabeledEntitiesCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_ids** | **List[str]** | Entity IDs to apply label to. | 

## Example

```python
from openapi_client.models.labeled_entities_create import LabeledEntitiesCreate

# TODO update the JSON string below
json = "{}"
# create an instance of LabeledEntitiesCreate from a JSON string
labeled_entities_create_instance = LabeledEntitiesCreate.from_json(json)
# print the JSON string representation of the object
print LabeledEntitiesCreate.to_json()

# convert the object into a dict
labeled_entities_create_dict = labeled_entities_create_instance.to_dict()
# create an instance of LabeledEntitiesCreate from a dict
labeled_entities_create_from_dict = LabeledEntitiesCreate.from_dict(labeled_entities_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


