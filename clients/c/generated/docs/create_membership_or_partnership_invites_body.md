# create_membership_or_partnership_invites_body_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | **business_role_for_invite_t \*** |  | 
**invite_type** | **invite_type_t \*** |  | 
**members** | **list_t \*** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] 
**partners** | **list_t \*** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


