# CreateMembershipOrPartnershipInvitesBody

Body to be used on path to send Members or Partners Invite or Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | [**BusinessRoleForInvite**](BusinessRoleForInvite.md) |  | [default to undefined]
**invite_type** | [**InviteType**](InviteType.md) |  | [default to undefined]
**members** | **Array&lt;string&gt;** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] [default to undefined]
**partners** | **Array&lt;string&gt;** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] [default to undefined]

## Example

```typescript
import { CreateMembershipOrPartnershipInvitesBody } from './api';

const instance: CreateMembershipOrPartnershipInvitesBody = {
    business_role,
    invite_type,
    members,
    partners,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
