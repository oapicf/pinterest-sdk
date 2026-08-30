# Org.OpenAPITools.Model.CreateMembershipOrPartnershipInvitesBody
Body to be used on path to send Members or Partners Invite or Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessRole** | **BusinessRoleForInvite** |  | 
**InviteType** | **InviteType** |  | 
**Members** | **List&lt;string&gt;** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] 
**Partners** | **List&lt;string&gt;** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

