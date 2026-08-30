# EntityLabelError


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**EntityLabel**](EntityLabel.md) |  | [optional] 
**error_messages** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.entity_label_error import EntityLabelError

# TODO update the JSON string below
json = "{}"
# create an instance of EntityLabelError from a JSON string
entity_label_error_instance = EntityLabelError.from_json(json)
# print the JSON string representation of the object
print EntityLabelError.to_json()

# convert the object into a dict
entity_label_error_dict = entity_label_error_instance.to_dict()
# create an instance of EntityLabelError from a dict
entity_label_error_from_dict = EntityLabelError.from_dict(entity_label_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


