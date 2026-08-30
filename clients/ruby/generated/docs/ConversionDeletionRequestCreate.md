# PinterestSdkClient::ConversionDeletionRequestCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **deletion_targets** | [**ConversionDeletionRequestTargets**](ConversionDeletionRequestTargets.md) | Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionDeletionRequestCreate.new(
  deletion_targets: null
)
```

