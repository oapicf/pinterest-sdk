# SharedAudienceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Audience ID that was shared | [optional] 
**permissions** | [**List[Role]**](Role.md) |  | [optional] 
**recipient_account_ids** | **List[str]** | Account IDs that received the audience | [optional] 

## Example

```python
from pinterestsdk.models.shared_audience_response import SharedAudienceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SharedAudienceResponse from a JSON string
shared_audience_response_instance = SharedAudienceResponse.from_json(json)
# print the JSON string representation of the object
print(SharedAudienceResponse.to_json())

# convert the object into a dict
shared_audience_response_dict = shared_audience_response_instance.to_dict()
# create an instance of SharedAudienceResponse from a dict
shared_audience_response_from_dict = SharedAudienceResponse.from_dict(shared_audience_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


