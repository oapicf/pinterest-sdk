# UserAccountFollowedInterests200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Interest]**](Interest.md) |  | 

## Example

```python
from openapi_client.models.user_account_followed_interests200_response import UserAccountFollowedInterests200Response

# TODO update the JSON string below
json = "{}"
# create an instance of UserAccountFollowedInterests200Response from a JSON string
user_account_followed_interests200_response_instance = UserAccountFollowedInterests200Response.from_json(json)
# print the JSON string representation of the object
print UserAccountFollowedInterests200Response.to_json()

# convert the object into a dict
user_account_followed_interests200_response_dict = user_account_followed_interests200_response_instance.to_dict()
# create an instance of UserAccountFollowedInterests200Response from a dict
user_account_followed_interests200_response_from_dict = UserAccountFollowedInterests200Response.from_dict(user_account_followed_interests200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


