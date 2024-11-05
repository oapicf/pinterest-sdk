# PinterestSdkClient::BusinessAccessUserSummary

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email** | **String** | Email of the business member/partner. | [optional] |
| **id** | **String** | Unique identifier of the business member/partner. | [optional] |
| **username** | **String** | Username of the business member/partner. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessAccessUserSummary.new(
  email: business0101@business.com,
  id: 383791336903426391,
  username: business0101
)
```

