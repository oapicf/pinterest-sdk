# SharedAudiencesForBusinessList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Audience]**](Audience.md) |  | 

## Example

```python
from pinterestsdk.models.shared_audiences_for_business_list200_response import SharedAudiencesForBusinessList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of SharedAudiencesForBusinessList200Response from a JSON string
shared_audiences_for_business_list200_response_instance = SharedAudiencesForBusinessList200Response.from_json(json)
# print the JSON string representation of the object
print(SharedAudiencesForBusinessList200Response.to_json())

# convert the object into a dict
shared_audiences_for_business_list200_response_dict = shared_audiences_for_business_list200_response_instance.to_dict()
# create an instance of SharedAudiencesForBusinessList200Response from a dict
shared_audiences_for_business_list200_response_from_dict = SharedAudiencesForBusinessList200Response.from_dict(shared_audiences_for_business_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


