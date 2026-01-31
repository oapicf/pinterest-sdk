# AudienceUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Ad account ID. | [optional] 
**name** | **str** | Audience name. | [optional] 
**rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 
**description** | **str** | Audience description. | [optional] 
**operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | [optional] [default to AudienceUpdateOperationType.UPDATE]

## Example

```python
from pinterestsdk.models.audience_update_request import AudienceUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceUpdateRequest from a JSON string
audience_update_request_instance = AudienceUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(AudienceUpdateRequest.to_json())

# convert the object into a dict
audience_update_request_dict = audience_update_request_instance.to_dict()
# create an instance of AudienceUpdateRequest from a dict
audience_update_request_from_dict = AudienceUpdateRequest.from_dict(audience_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


