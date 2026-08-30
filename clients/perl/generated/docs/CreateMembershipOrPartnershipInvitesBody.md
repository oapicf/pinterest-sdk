# WWW::OpenAPIClient::Object::CreateMembershipOrPartnershipInvitesBody

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CreateMembershipOrPartnershipInvitesBody;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | [**BusinessRoleForInvite**](BusinessRoleForInvite.md) |  | 
**invite_type** | [**InviteType**](InviteType.md) |  | 
**members** | **ARRAY[string]** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] 
**partners** | **ARRAY[string]** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


