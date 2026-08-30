# CreateMembershipOrPartnershipInvitesBody


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`business_role`** | [**`*BusinessRoleForInvite`**](BusinessRoleForInvite.md) |  | [default to nothing]
**`invite_type`** | [**`*InviteType`**](InviteType.md) |  | [default to nothing]
**`members`** | **`Vector{String}`** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] [default to nothing]
**`partners`** | **`Vector{String}`** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


