# TargetingTemplateUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Targeting template ID | 
**operation_type** | **str** |  | 
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.targeting_template_update_request import TargetingTemplateUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTemplateUpdateRequest from a JSON string
targeting_template_update_request_instance = TargetingTemplateUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(TargetingTemplateUpdateRequest.to_json())

# convert the object into a dict
targeting_template_update_request_dict = targeting_template_update_request_instance.to_dict()
# create an instance of TargetingTemplateUpdateRequest from a dict
targeting_template_update_request_from_dict = TargetingTemplateUpdateRequest.from_dict(targeting_template_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


