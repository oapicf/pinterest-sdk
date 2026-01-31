# FollowUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_follow** | **bool** | Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed. | [optional] [default to False]

## Example

```python
from pinterestsdk.models.follow_user_request import FollowUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of FollowUserRequest from a JSON string
follow_user_request_instance = FollowUserRequest.from_json(json)
# print the JSON string representation of the object
print(FollowUserRequest.to_json())

# convert the object into a dict
follow_user_request_dict = follow_user_request_instance.to_dict()
# create an instance of FollowUserRequest from a dict
follow_user_request_from_dict = FollowUserRequest.from_dict(follow_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


