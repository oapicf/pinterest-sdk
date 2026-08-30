# CancelInviteResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**invite_data** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] 
**is_received_invite** | **bool** |  | [optional] 
**user** | [**CancelInviteResultUser**](CancelInviteResultUser.md) |  | [optional] 

## Example

```python
from openapi_client.models.cancel_invite_result import CancelInviteResult

# TODO update the JSON string below
json = "{}"
# create an instance of CancelInviteResult from a JSON string
cancel_invite_result_instance = CancelInviteResult.from_json(json)
# print the JSON string representation of the object
print CancelInviteResult.to_json()

# convert the object into a dict
cancel_invite_result_dict = cancel_invite_result_instance.to_dict()
# create an instance of CancelInviteResult from a dict
cancel_invite_result_from_dict = CancelInviteResult.from_dict(cancel_invite_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


