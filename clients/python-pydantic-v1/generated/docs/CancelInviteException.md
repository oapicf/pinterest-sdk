# CancelInviteException

An exception object if there is an error performing the cancellation. It will only be provided if there is an error.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_id** | **str** |  | [optional] 
**message** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.cancel_invite_exception import CancelInviteException

# TODO update the JSON string below
json = "{}"
# create an instance of CancelInviteException from a JSON string
cancel_invite_exception_instance = CancelInviteException.from_json(json)
# print the JSON string representation of the object
print CancelInviteException.to_json()

# convert the object into a dict
cancel_invite_exception_dict = cancel_invite_exception_instance.to_dict()
# create an instance of CancelInviteException from a dict
cancel_invite_exception_from_dict = CancelInviteException.from_dict(cancel_invite_exception_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


