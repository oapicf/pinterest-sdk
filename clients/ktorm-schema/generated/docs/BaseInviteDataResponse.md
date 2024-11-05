
# Table `BaseInviteDataResponse`
(mapped from: BaseInviteDataResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier of the invite/request. |  [optional]
**inviteData** | invite_data | long |  | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  |  [optional] [foreignkey]
**isReceivedInvite** | is_received_invite | boolean |  | **kotlin.Boolean** | Indicates whether the invite/request was received. |  [optional]
**user** | user | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. |  [optional] [foreignkey]






