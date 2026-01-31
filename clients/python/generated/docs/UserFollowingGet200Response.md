# UserFollowingGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[UserSummary]**](UserSummary.md) | Users | 

## Example

```python
from pinterestsdk.models.user_following_get200_response import UserFollowingGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of UserFollowingGet200Response from a JSON string
user_following_get200_response_instance = UserFollowingGet200Response.from_json(json)
# print the JSON string representation of the object
print(UserFollowingGet200Response.to_json())

# convert the object into a dict
user_following_get200_response_dict = user_following_get200_response_instance.to_dict()
# create an instance of UserFollowingGet200Response from a dict
user_following_get200_response_from_dict = UserFollowingGet200Response.from_dict(user_following_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


