# UserWebsitesGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[UserWebsiteSummary]**](UserWebsiteSummary.md) |  | 

## Example

```python
from pinterestsdk.models.user_websites_get200_response import UserWebsitesGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of UserWebsitesGet200Response from a JSON string
user_websites_get200_response_instance = UserWebsitesGet200Response.from_json(json)
# print the JSON string representation of the object
print(UserWebsitesGet200Response.to_json())

# convert the object into a dict
user_websites_get200_response_dict = user_websites_get200_response_instance.to_dict()
# create an instance of UserWebsitesGet200Response from a dict
user_websites_get200_response_from_dict = UserWebsitesGet200Response.from_dict(user_websites_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


