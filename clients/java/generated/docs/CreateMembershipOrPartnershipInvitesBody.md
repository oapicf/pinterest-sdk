

# CreateMembershipOrPartnershipInvitesBody

Body to be used on path to send Members or Partners Invite or Request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessRole** | [**BusinessRoleEnum**](#BusinessRoleEnum) | The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. |  |
|**inviteType** | **InviteType** |  |  |
|**members** | **List&lt;String&gt;** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE |  [optional] |
|**partners** | **List&lt;String&gt;** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST |  [optional] |



## Enum: BusinessRoleEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;EMPLOYEE&quot; |
| BIZ_ADMIN | &quot;BIZ_ADMIN&quot; |
| PARTNER | &quot;PARTNER&quot; |



