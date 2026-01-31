# AudienceCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Ad account ID. | [optional] 
**name** | **str** | Audience name. | [optional] 
**rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.audience_common import AudienceCommon

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceCommon from a JSON string
audience_common_instance = AudienceCommon.from_json(json)
# print the JSON string representation of the object
print(AudienceCommon.to_json())

# convert the object into a dict
audience_common_dict = audience_common_instance.to_dict()
# create an instance of AudienceCommon from a dict
audience_common_from_dict = AudienceCommon.from_dict(audience_common_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


