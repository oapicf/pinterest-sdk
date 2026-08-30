# CancelInviteResultUser

Metadata of the member/partner that has access to the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | Email of the business member/partner. | [optional] 
**id** | **str** | Unique identifier of the business member/partner. | [optional] 
**username** | **str** | Username of the business member/partner. | [optional] 

## Example

```python
from pinterestsdk.models.cancel_invite_result_user import CancelInviteResultUser

# TODO update the JSON string below
json = "{}"
# create an instance of CancelInviteResultUser from a JSON string
cancel_invite_result_user_instance = CancelInviteResultUser.from_json(json)
# print the JSON string representation of the object
print(CancelInviteResultUser.to_json())

# convert the object into a dict
cancel_invite_result_user_dict = cancel_invite_result_user_instance.to_dict()
# create an instance of CancelInviteResultUser from a dict
cancel_invite_result_user_from_dict = CancelInviteResultUser.from_dict(cancel_invite_result_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


