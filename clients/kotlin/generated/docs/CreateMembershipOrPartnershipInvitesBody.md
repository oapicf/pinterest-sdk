
# CreateMembershipOrPartnershipInvitesBody

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessRole** | [**inline**](#BusinessRole) | The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. |  |
| **inviteType** | [**InviteType**](InviteType.md) |  |  |
| **members** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE |  [optional] |
| **partners** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST |  [optional] |


<a id="BusinessRole"></a>
## Enum: business_role
| Name | Value |
| ---- | ----- |
| businessRole | EMPLOYEE, BIZ_ADMIN, PARTNER |



