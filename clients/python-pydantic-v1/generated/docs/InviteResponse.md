# InviteResponse

A user's username or email OR a partner id that caused the error.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] 
**business_roles** | **List[str]** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**created_by_business** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] 
**created_by_user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] 
**created_time** | **int** | The time the invite/request was created. Returned in milliseconds. | [optional] 
**id** | **str** | Unique identifier of the invite/request. | [optional] 
**invite_data** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] 
**is_received_invite** | **bool** | Indicates whether the invite/request was received. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

## Example

```python
from openapi_client.models.invite_response import InviteResponse

# TODO update the JSON string below
json = "{}"
# create an instance of InviteResponse from a JSON string
invite_response_instance = InviteResponse.from_json(json)
# print the JSON string representation of the object
print InviteResponse.to_json()

# convert the object into a dict
invite_response_dict = invite_response_instance.to_dict()
# create an instance of InviteResponse from a dict
invite_response_from_dict = InviteResponse.from_dict(invite_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


