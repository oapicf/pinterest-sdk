# INVITE_BUSINESS_ROLE_BINDING

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_by_business_id** | [**STRING_32**](STRING_32.md) | Unique identifier for the business that created the invite/request. | [optional] [default to null]
**created_by_user_id** | [**STRING_32**](STRING_32.md) | Unique identifier for the user that created the invite/request. | [optional] [default to null]
**user** | [**BUSINESS_ACCESS_USER_SUMMARY**](BusinessAccessUserSummary.md) | Metadata for the user that updated the invite/request. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Unique identifier of the invite/request. | [optional] [default to null]
**invite_data** | [**BASE_INVITE_DATA_RESPONSE_INVITE_DATA**](BaseInviteDataResponse_invite_data.md) |  | [optional] [default to null]
**is_received_invite** | **BOOLEAN** | Indicates whether the invite/request was received. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


