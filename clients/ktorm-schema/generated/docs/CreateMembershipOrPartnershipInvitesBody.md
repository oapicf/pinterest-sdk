
# Table `CreateMembershipOrPartnershipInvitesBody`
(mapped from: CreateMembershipOrPartnershipInvitesBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**businessRole** | business_role | text NOT NULL |  | [**business_role**](#BusinessRole) | The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. | 
**inviteType** | invite_type | long NOT NULL |  | [**InviteType**](InviteType.md) |  |  [foreignkey]
**members** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE |  [optional]
**partners** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST |  [optional]




# **Table `CreateMembershipOrPartnershipInvitesBodyMembers`**
(mapped from: CreateMembershipOrPartnershipInvitesBodyMembers)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createMembershipOrPartnershipInvitesBody | createMembershipOrPartnershipInvitesBody | long | | kotlin.Long | Primary Key | *one*
members | members | text | | kotlin.String | Foreign Key | *many*



# **Table `CreateMembershipOrPartnershipInvitesBodyPartners`**
(mapped from: CreateMembershipOrPartnershipInvitesBodyPartners)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createMembershipOrPartnershipInvitesBody | createMembershipOrPartnershipInvitesBody | long | | kotlin.Long | Primary Key | *one*
partners | partners | text | | kotlin.String | Foreign Key | *many*



