# PinterestSdkClient::UserSummary

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | Always \&quot;user\&quot; | [optional] |
| **username** | **String** | Username | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UserSummary.new(
  type: user,
  username: username
)
```

