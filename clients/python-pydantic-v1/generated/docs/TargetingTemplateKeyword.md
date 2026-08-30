# TargetingTemplateKeyword


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**match_type** | [**MatchType**](MatchType.md) |  | [optional] 
**value** | **str** | The keyword targeting (120 chars max). | [optional] 

## Example

```python
from openapi_client.models.targeting_template_keyword import TargetingTemplateKeyword

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTemplateKeyword from a JSON string
targeting_template_keyword_instance = TargetingTemplateKeyword.from_json(json)
# print the JSON string representation of the object
print TargetingTemplateKeyword.to_json()

# convert the object into a dict
targeting_template_keyword_dict = targeting_template_keyword_instance.to_dict()
# create an instance of TargetingTemplateKeyword from a dict
targeting_template_keyword_from_dict = TargetingTemplateKeyword.from_dict(targeting_template_keyword_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


