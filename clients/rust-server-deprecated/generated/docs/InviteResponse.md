# InviteResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [***swagger::Nullable<models::InviteAssetsSummary>**](InviteAssetsSummary.md) |  | [optional] [default to None]
**business_roles** | **Vec<models::BusinessRoleResponse>** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] [default to None]
**created_by_business** | [***models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] [default to None]
**created_by_user** | [***models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] [default to None]
**created_time** | **i32** | The time the invite/request was created. Returned in milliseconds. | [optional] [default to None]
**id** | **String** | Unique identifier of the invite/request. | [optional] [default to None]
**invite_data** | [***models::InviteDataResponse**](InviteDataResponse.md) |  | [optional] [default to None]
**is_received_invite** | **bool** | Indicates whether the invite/request was received. | [optional] [default to None]
**user** | [***models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


