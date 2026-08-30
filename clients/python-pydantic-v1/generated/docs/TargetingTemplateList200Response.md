# TargetingTemplateList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[TargetingTemplate]**](TargetingTemplate.md) |  | 

## Example

```python
from openapi_client.models.targeting_template_list200_response import TargetingTemplateList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTemplateList200Response from a JSON string
targeting_template_list200_response_instance = TargetingTemplateList200Response.from_json(json)
# print the JSON string representation of the object
print TargetingTemplateList200Response.to_json()

# convert the object into a dict
targeting_template_list200_response_dict = targeting_template_list200_response_instance.to_dict()
# create an instance of TargetingTemplateList200Response from a dict
targeting_template_list200_response_from_dict = TargetingTemplateList200Response.from_dict(targeting_template_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


