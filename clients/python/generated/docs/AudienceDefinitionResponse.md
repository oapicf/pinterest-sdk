# AudienceDefinitionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AudienceDefinition]**](AudienceDefinition.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.audience_definition_response import AudienceDefinitionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceDefinitionResponse from a JSON string
audience_definition_response_instance = AudienceDefinitionResponse.from_json(json)
# print the JSON string representation of the object
print(AudienceDefinitionResponse.to_json())

# convert the object into a dict
audience_definition_response_dict = audience_definition_response_instance.to_dict()
# create an instance of AudienceDefinitionResponse from a dict
audience_definition_response_from_dict = AudienceDefinitionResponse.from_dict(audience_definition_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


