# FollowUserCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_follow** | **bool** |   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed. | [optional] 

## Example

```python
from pinterestsdk.models.follow_user_create import FollowUserCreate

# TODO update the JSON string below
json = "{}"
# create an instance of FollowUserCreate from a JSON string
follow_user_create_instance = FollowUserCreate.from_json(json)
# print the JSON string representation of the object
print(FollowUserCreate.to_json())

# convert the object into a dict
follow_user_create_dict = follow_user_create_instance.to_dict()
# create an instance of FollowUserCreate from a dict
follow_user_create_from_dict = FollowUserCreate.from_dict(follow_user_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


