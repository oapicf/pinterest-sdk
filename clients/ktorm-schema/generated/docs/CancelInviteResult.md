
# Table `CancelInviteResult`
(mapped from: CancelInviteResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional]
**inviteData** | invite_data | long |  | [**InviteDataResponse**](InviteDataResponse.md) |  |  [optional] [foreignkey]
**isReceivedInvite** | is_received_invite | boolean |  | **kotlin.Boolean** |  |  [optional]
**user** | user | long |  | [**CancelInviteResultUser**](CancelInviteResultUser.md) |  |  [optional] [foreignkey]






