# AudienceDefinitionScope

Generated audience scope to request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.audience_definition_scope import AudienceDefinitionScope

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceDefinitionScope from a JSON string
audience_definition_scope_instance = AudienceDefinitionScope.from_json(json)
# print the JSON string representation of the object
print(AudienceDefinitionScope.to_json())

# convert the object into a dict
audience_definition_scope_dict = audience_definition_scope_instance.to_dict()
# create an instance of AudienceDefinitionScope from a dict
audience_definition_scope_from_dict = AudienceDefinitionScope.from_dict(audience_definition_scope_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


