# # CreateMembershipOrPartnershipInvitesBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | **string** | The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. |
**invite_type** | [**\OpenAPI\Client\Model\InviteType**](InviteType.md) |  |
**members** | **string[]** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional]
**partners** | **string[]** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
