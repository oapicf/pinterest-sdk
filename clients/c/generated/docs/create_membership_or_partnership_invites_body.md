# create_membership_or_partnership_invites_body_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | **pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_e** | The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. | 
**invite_type** | **invite_type_t \*** |  | 
**members** | **list_t \*** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] 
**partners** | **list_t \*** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


