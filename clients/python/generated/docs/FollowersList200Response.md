# FollowersList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[UserSummary]**](UserSummary.md) |  | 

## Example

```python
from pinterestsdk.models.followers_list200_response import FollowersList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of FollowersList200Response from a JSON string
followers_list200_response_instance = FollowersList200Response.from_json(json)
# print the JSON string representation of the object
print(FollowersList200Response.to_json())

# convert the object into a dict
followers_list200_response_dict = followers_list200_response_instance.to_dict()
# create an instance of FollowersList200Response from a dict
followers_list200_response_from_dict = FollowersList200Response.from_dict(followers_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


