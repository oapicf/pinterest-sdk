# TargetingTemplateUpdateRequestReadOrUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Targeting template ID | 
**operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | 
**targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | [optional] 

## Example

```python
from pinterestsdk.models.targeting_template_update_request_read_or_update import TargetingTemplateUpdateRequestReadOrUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTemplateUpdateRequestReadOrUpdate from a JSON string
targeting_template_update_request_read_or_update_instance = TargetingTemplateUpdateRequestReadOrUpdate.from_json(json)
# print the JSON string representation of the object
print(TargetingTemplateUpdateRequestReadOrUpdate.to_json())

# convert the object into a dict
targeting_template_update_request_read_or_update_dict = targeting_template_update_request_read_or_update_instance.to_dict()
# create an instance of TargetingTemplateUpdateRequestReadOrUpdate from a dict
targeting_template_update_request_read_or_update_from_dict = TargetingTemplateUpdateRequestReadOrUpdate.from_dict(targeting_template_update_request_read_or_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


