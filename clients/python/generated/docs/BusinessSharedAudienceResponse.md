# BusinessSharedAudienceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Audience ID that was shared | [optional] 
**permissions** | [**List[Role]**](Role.md) |  | [optional] 
**recipient_business_ids** | **List[str]** | Business IDs that received the audience | [optional] 

## Example

```python
from pinterestsdk.models.business_shared_audience_response import BusinessSharedAudienceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessSharedAudienceResponse from a JSON string
business_shared_audience_response_instance = BusinessSharedAudienceResponse.from_json(json)
# print the JSON string representation of the object
print(BusinessSharedAudienceResponse.to_json())

# convert the object into a dict
business_shared_audience_response_dict = business_shared_audience_response_instance.to_dict()
# create an instance of BusinessSharedAudienceResponse from a dict
business_shared_audience_response_from_dict = BusinessSharedAudienceResponse.from_dict(business_shared_audience_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


