# InviteResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetsSummary** | [**OpenAPI\Server\Model\InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] 
**businessRoles** | **string** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**createdByBusiness** | [**OpenAPI\Server\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] 
**createdByUser** | [**OpenAPI\Server\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] 
**createdTime** | **int** | The time the invite/request was created. Returned in milliseconds. | [optional] 
**id** | **string** | Unique identifier of the invite/request. | [optional] 
**inviteData** | [**OpenAPI\Server\Model\BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**isReceivedInvite** | **bool** | Indicates whether the invite/request was received. | [optional] 
**user** | [**OpenAPI\Server\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


