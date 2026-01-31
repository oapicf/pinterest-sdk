
# Table `InviteResponse`
(mapped from: InviteResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier of the invite/request. |  [optional]
**inviteData** | invite_data | long |  | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  |  [optional] [foreignkey]
**isReceivedInvite** | is_received_invite | boolean |  | **kotlin.Boolean** | Indicates whether the invite/request was received. |  [optional]
**user** | user | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. |  [optional] [foreignkey]
**assetsSummary** | assets_summary | long |  | [**InviteAssetsSummary**](InviteAssetsSummary.md) |  |  [optional] [foreignkey]
**businessRoles** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. |  [optional]
**createdByBusiness** | created_by_business | blob |  | [**kotlin.Any**](.md) | Metadata for the business that created the invite/request. |  [optional]
**createdByUser** | created_by_user | blob |  | [**kotlin.Any**](.md) | Metadata for the user that created the invite/request. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | The time the invite/request was created. Returned in milliseconds. |  [optional]







# **Table `InviteResponseBusinessRoles`**
(mapped from: InviteResponseBusinessRoles)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
inviteResponse | inviteResponse | long | | kotlin.Long | Primary Key | *one*
businessRoles | businessRoles | text | | kotlin.String | Foreign Key | *many*






