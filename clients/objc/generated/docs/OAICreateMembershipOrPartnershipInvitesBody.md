# OAICreateMembershipOrPartnershipInvitesBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessRole** | [**OAIBusinessRoleForInvite***](OAIBusinessRoleForInvite.md) |  | 
**inviteType** | [**OAIInviteType***](OAIInviteType.md) |  | 
**members** | **NSArray&lt;NSString*&gt;*** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] 
**partners** | **NSArray&lt;NSString*&gt;*** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


