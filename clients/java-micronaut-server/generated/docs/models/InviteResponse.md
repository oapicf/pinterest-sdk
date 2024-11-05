

# InviteResponse

The class is defined in **[InviteResponse.java](../../src/main/java/org/openapitools/model/InviteResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetsSummary** | [`InviteAssetsSummary`](InviteAssetsSummary.md) |  |  [optional property]
**businessRoles** | `List&lt;String&gt;` | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. |  [optional property]
**createdByBusiness** | [`BusinessAccessUserSummary`](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. |  [optional property]
**createdByUser** | [`BusinessAccessUserSummary`](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. |  [optional property]
**createdTime** | `Integer` | The time the invite/request was created. Returned in milliseconds. |  [optional property]
**id** | `String` | Unique identifier of the invite/request. |  [optional property]
**inviteData** | [`BaseInviteDataResponseInviteData`](BaseInviteDataResponseInviteData.md) |  |  [optional property]
**isReceivedInvite** | `Boolean` | Indicates whether the invite/request was received. |  [optional property]
**user** | [`BusinessAccessUserSummary`](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. |  [optional property]











