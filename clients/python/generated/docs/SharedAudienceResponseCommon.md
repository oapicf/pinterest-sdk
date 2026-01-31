# SharedAudienceResponseCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Audience ID that was shared | [optional] 
**permissions** | [**List[Role]**](Role.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.shared_audience_response_common import SharedAudienceResponseCommon

# TODO update the JSON string below
json = "{}"
# create an instance of SharedAudienceResponseCommon from a JSON string
shared_audience_response_common_instance = SharedAudienceResponseCommon.from_json(json)
# print the JSON string representation of the object
print(SharedAudienceResponseCommon.to_json())

# convert the object into a dict
shared_audience_response_common_dict = shared_audience_response_common_instance.to_dict()
# create an instance of SharedAudienceResponseCommon from a dict
shared_audience_response_common_from_dict = SharedAudienceResponseCommon.from_dict(shared_audience_response_common_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


