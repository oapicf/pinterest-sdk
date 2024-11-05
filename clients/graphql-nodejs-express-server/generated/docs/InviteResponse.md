# InviteResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetsSummary** | [***InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] [default to null]
**businessRoles** | **String!** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] [default to null]
**createdByBusiness** | [***BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] [default to null]
**createdByUser** | [***BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] [default to null]
**createdTime** | **Int!** | The time the invite/request was created. Returned in milliseconds. | [optional] [default to null]
**Id_** | **String!** | Unique identifier of the invite/request. | [optional] [default to null]
**inviteData** | [***BaseInviteDataResponseInviteData**](BaseInviteDataResponse_invite_data.md) |  | [optional] [default to null]
**isReceivedInvite** | **Boolean!** | Indicates whether the invite/request was received. | [optional] [default to null]
**user** | [***BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


