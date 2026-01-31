# SharedAudienceCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Unique identifier of an audience | [optional] 
**operation_type** | [**OperationType**](OperationType.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.shared_audience_common import SharedAudienceCommon

# TODO update the JSON string below
json = "{}"
# create an instance of SharedAudienceCommon from a JSON string
shared_audience_common_instance = SharedAudienceCommon.from_json(json)
# print the JSON string representation of the object
print(SharedAudienceCommon.to_json())

# convert the object into a dict
shared_audience_common_dict = shared_audience_common_instance.to_dict()
# create an instance of SharedAudienceCommon from a dict
shared_audience_common_from_dict = SharedAudienceCommon.from_dict(shared_audience_common_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


