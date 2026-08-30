# CreateMembershipOrPartnershipInvitesBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | [**models::BusinessRoleForInvite**](BusinessRoleForInvite.md) |  | 
**invite_type** | [**models::InviteType**](InviteType.md) |  | 
**members** | Option<**Vec<String>**> | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional]
**partners** | Option<**Vec<String>**> | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


