# FollowUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#39;user&#39; | [optional] [readonly] 
**username** | **str** | Username | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.follow_user import FollowUser

# TODO update the JSON string below
json = "{}"
# create an instance of FollowUser from a JSON string
follow_user_instance = FollowUser.from_json(json)
# print the JSON string representation of the object
print(FollowUser.to_json())

# convert the object into a dict
follow_user_dict = follow_user_instance.to_dict()
# create an instance of FollowUser from a dict
follow_user_from_dict = FollowUser.from_dict(follow_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


