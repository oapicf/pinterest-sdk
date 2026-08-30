# PinterestSdkClient::CreateMembershipOrPartnershipInvitesBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_role** | [**BusinessRoleForInvite**](BusinessRoleForInvite.md) |  |  |
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

