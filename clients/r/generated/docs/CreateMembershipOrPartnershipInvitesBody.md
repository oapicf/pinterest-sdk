# openapi::CreateMembershipOrPartnershipInvitesBody

Body to be used on path to send Members or Partners Invite or Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | [**BusinessRoleForInvite**](BusinessRoleForInvite.md) |  | [Enum: ] 
**invite_type** | [**InviteType**](InviteType.md) |  | [Enum: ] 
**members** | **array[character]** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] [Max. items: 50] [Min. items: 1] 
**partners** | **array[character]** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] [Max. items: 50] [Min. items: 1] 


