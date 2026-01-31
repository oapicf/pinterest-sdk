
# InviteResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Unique identifier of the invite/request. |  [optional] |
| **inviteData** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  |  [optional] |
| **isReceivedInvite** | **kotlin.Boolean** | Indicates whether the invite/request was received. |  [optional] |
| **user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. |  [optional] |
| **assetsSummary** | [**InviteAssetsSummary**](InviteAssetsSummary.md) |  |  [optional] |
| **businessRoles** | **kotlin.collections.List&lt;kotlin.String&gt;** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. |  [optional] |
| **createdByBusiness** | [**kotlin.Any**](.md) | Metadata for the business that created the invite/request. |  [optional] |
| **createdByUser** | [**kotlin.Any**](.md) | Metadata for the user that created the invite/request. |  [optional] |
| **createdTime** | **kotlin.Int** | The time the invite/request was created. Returned in milliseconds. |  [optional] |



