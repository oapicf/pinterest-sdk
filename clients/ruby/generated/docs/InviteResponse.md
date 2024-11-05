# PinterestSdkClient::InviteResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **assets_summary** | [**InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] |
| **business_roles** | **Array&lt;String&gt;** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] |
| **created_by_business** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] |
| **created_by_user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] |
| **created_time** | **Integer** | The time the invite/request was created. Returned in milliseconds. | [optional] |
| **id** | **String** | Unique identifier of the invite/request. | [optional] |
| **invite_data** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] |
| **is_received_invite** | **Boolean** | Indicates whether the invite/request was received. | [optional] |
| **user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::InviteResponse.new(
  assets_summary: null,
  business_roles: [&quot;BIZ_ADMIN&quot;],
  created_by_business: null,
  created_by_user: null,
  created_time: 1646767577816,
  id: 383791336903426391,
  invite_data: null,
  is_received_invite: null,
  user: null
)
```

