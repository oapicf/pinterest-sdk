# InviteBusinessRoleBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_by_business_id** | **String** | Unique identifier for the business that created the invite/request. | [optional] [default to None]
**created_by_user_id** | **String** | Unique identifier for the user that created the invite/request. | [optional] [default to None]
**id** | **String** | Unique identifier of the invite/request. | [optional] [default to None]
**invite_data** | [***models::InviteDataResponse**](InviteDataResponse.md) |  | [optional] [default to None]
**is_received_invite** | **bool** | Indicates whether the invite/request was received. | [optional] [default to None]
**user** | [***models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


