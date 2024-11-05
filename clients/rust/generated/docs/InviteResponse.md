# InviteResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | Option<[**models::InviteAssetsSummary**](InviteAssetsSummary.md)> |  | [optional]
**business_roles** | Option<**Vec<String>**> | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional]
**created_by_business** | Option<[**models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md)> | Metadata for the business that created the invite/request. | [optional]
**created_by_user** | Option<[**models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md)> | Metadata for the user that created the invite/request. | [optional]
**created_time** | Option<**i32**> | The time the invite/request was created. Returned in milliseconds. | [optional]
**id** | Option<**String**> | Unique identifier of the invite/request. | [optional]
**invite_data** | Option<[**models::BaseInviteDataResponseInviteData**](BaseInviteDataResponse_invite_data.md)> |  | [optional]
**is_received_invite** | Option<**bool**> | Indicates whether the invite/request was received. | [optional]
**user** | Option<[**models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md)> | Metadata for the member/partner that was sent the invite/request. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


