
# Table `CreateMembershipOrPartnershipInvitesBody`
(mapped from: CreateMembershipOrPartnershipInvitesBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**businessRole** | business_role | long NOT NULL |  | [**BusinessRoleForInvite**](BusinessRoleForInvite.md) |  |  [foreignkey]
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



