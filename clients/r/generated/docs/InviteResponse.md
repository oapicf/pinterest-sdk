# openapi::InviteResponse

A user's username or email OR a partner id that caused the error.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] 
**business_roles** | **array[character]** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**created_by_business** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] 
**created_by_user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] 
**created_time** | **integer** | The time the invite/request was created. Returned in milliseconds. | [optional] 
**id** | **character** | Unique identifier of the invite/request. | [optional] [Pattern: ^\\d+$] 
**invite_data** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] 
**is_received_invite** | **character** | Indicates whether the invite/request was received. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 


