
# Table `InviteBusinessRoleBinding`
(mapped from: InviteBusinessRoleBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier of the invite/request. |  [optional]
**inviteData** | invite_data | long |  | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  |  [optional] [foreignkey]
**isReceivedInvite** | is_received_invite | boolean |  | **kotlin.Boolean** | Indicates whether the invite/request was received. |  [optional]
**user** | user | blob |  | [**kotlin.Any**](.md) | Metadata for the user that updated the invite/request. |  [optional]
**createdByBusinessId** | created_by_business_id | text |  | **kotlin.String** | Unique identifier for the business that created the invite/request. |  [optional]
**createdByUserId** | created_by_user_id | text |  | **kotlin.String** | Unique identifier for the user that created the invite/request. |  [optional]








