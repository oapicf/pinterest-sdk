

# CreateMembershipOrPartnershipInvitesBody

Body to be used on path to send Members or Partners Invite or Request

The class is defined in **[CreateMembershipOrPartnershipInvitesBody.java](../../src/main/java/org/openapitools/model/CreateMembershipOrPartnershipInvitesBody.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessRole** | [**BusinessRoleEnum**](#BusinessRoleEnum) | The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. | 
**inviteType** | `InviteType` |  | 
**members** | `List&lt;String&gt;` | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE |  [optional property]
**partners** | `List&lt;String&gt;` | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST |  [optional property]

## BusinessRoleEnum

Name | Value
---- | -----
EMPLOYEE | `"EMPLOYEE"`
BIZ_ADMIN | `"BIZ_ADMIN"`
PARTNER | `"PARTNER"`





