# PinterestSdkClient::UpdateMemberResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_role** | **String** | The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. | [optional] |
| **member_id** | **String** | Unique identifier of the business member. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdateMemberResult.new(
  business_role: EMPLOYEE,
  member_id: 140943737684417
)
```

