
# CreateMembershipOrPartnershipInvitesBody

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessRole** | [**BusinessRoleForInvite**](BusinessRoleForInvite.md) |  |  |
| **inviteType** | [**InviteType**](InviteType.md) |  |  |
| **members** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE |  [optional] |
| **partners** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST |  [optional] |



