# AudienceDefinitionType

Generated audience type to request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.audience_definition_type import AudienceDefinitionType

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceDefinitionType from a JSON string
audience_definition_type_instance = AudienceDefinitionType.from_json(json)
# print the JSON string representation of the object
print(AudienceDefinitionType.to_json())

# convert the object into a dict
audience_definition_type_dict = audience_definition_type_instance.to_dict()
# create an instance of AudienceDefinitionType from a dict
audience_definition_type_from_dict = AudienceDefinitionType.from_dict(audience_definition_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


