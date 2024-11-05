# Org.OpenAPITools.Model.InviteResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetsSummary** | [**InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] 
**BusinessRoles** | **List&lt;string&gt;** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**CreatedByBusiness** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] 
**CreatedByUser** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] 
**CreatedTime** | **int** | The time the invite/request was created. Returned in milliseconds. | [optional] 
**Id** | **string** | Unique identifier of the invite/request. | [optional] 
**InviteData** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**IsReceivedInvite** | **bool** | Indicates whether the invite/request was received. | [optional] 
**User** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

