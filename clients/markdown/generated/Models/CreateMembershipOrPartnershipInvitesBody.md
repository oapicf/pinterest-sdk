# CreateMembershipOrPartnershipInvitesBody
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **business\_role** | [**BusinessRoleForInvite**](BusinessRoleForInvite.md) |  | [default to null] |
| **invite\_type** | [**InviteType**](InviteType.md) |  | [default to null] |
| **members** | **List** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] [default to null] |
| **partners** | **List** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

