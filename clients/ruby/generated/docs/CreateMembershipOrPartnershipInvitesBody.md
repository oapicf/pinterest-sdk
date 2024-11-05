# PinterestSdkClient::CreateMembershipOrPartnershipInvitesBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_role** | **String** | The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. |  |
| **invite_type** | [**InviteType**](InviteType.md) |  |  |
| **members** | **Array&lt;String&gt;** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] |
| **partners** | **Array&lt;String&gt;** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CreateMembershipOrPartnershipInvitesBody.new(
  business_role: BIZ_ADMIN,
  invite_type: null,
  members: [&quot;business0101&quot;,&quot;user@business.com&quot;],
  partners: [&quot;809944451643622187&quot;,&quot;766456567741825556&quot;]
)
```

