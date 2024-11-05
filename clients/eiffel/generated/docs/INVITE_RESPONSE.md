# INVITE_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**INVITE_ASSETS_SUMMARY**](InviteAssetsSummary.md) |  | [optional] [default to null]
**business_roles** | [**LIST [STRING_32]**](STRING_32.md) | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] [default to null]
**created_by_business** | [**BUSINESS_ACCESS_USER_SUMMARY**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] [default to null]
**created_by_user** | [**BUSINESS_ACCESS_USER_SUMMARY**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] [default to null]
**created_time** | **INTEGER_32** | The time the invite/request was created. Returned in milliseconds. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Unique identifier of the invite/request. | [optional] [default to null]
**invite_data** | [**BASE_INVITE_DATA_RESPONSE_INVITE_DATA**](BaseInviteDataResponse_invite_data.md) |  | [optional] [default to null]
**is_received_invite** | **BOOLEAN** | Indicates whether the invite/request was received. | [optional] [default to null]
**user** | [**BUSINESS_ACCESS_USER_SUMMARY**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


