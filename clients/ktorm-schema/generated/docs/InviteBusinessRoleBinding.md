
# Table `InviteBusinessRoleBinding`
(mapped from: InviteBusinessRoleBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**createdByBusinessId** | created_by_business_id | text |  | **kotlin.String** | Unique identifier for the business that created the invite/request. |  [optional]
**createdByUserId** | created_by_user_id | text |  | **kotlin.String** | Unique identifier for the user that created the invite/request. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier of the invite/request. |  [optional]
**inviteData** | invite_data | long |  | [**InviteDataResponse**](InviteDataResponse.md) |  |  [optional] [foreignkey]
**isReceivedInvite** | is_received_invite | boolean |  | **kotlin.Boolean** | Indicates whether the invite/request was received. |  [optional]
**user** | user | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. |  [optional] [foreignkey]








