# InviteResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetsSummary** | [**InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] 
**businessRoles** | **[String]** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**createdByBusiness** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] 
**createdByUser** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] 
**createdTime** | **Int** | The time the invite/request was created. Returned in milliseconds. | [optional] 
**id** | **String** | Unique identifier of the invite/request. | [optional] 
**inviteData** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**isReceivedInvite** | **Bool** | Indicates whether the invite/request was received. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


