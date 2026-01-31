# AudienceDefinition

Queryable audience representation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_date** | **str** | Generation date | [optional] 
**scope** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.audience_definition import AudienceDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceDefinition from a JSON string
audience_definition_instance = AudienceDefinition.from_json(json)
# print the JSON string representation of the object
print(AudienceDefinition.to_json())

# convert the object into a dict
audience_definition_dict = audience_definition_instance.to_dict()
# create an instance of AudienceDefinition from a dict
audience_definition_from_dict = AudienceDefinition.from_dict(audience_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


