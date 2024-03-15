# PinterestSdkClient::ItemValidationEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attribute** | **String** | The attribute that the item validation event references | [optional] |
| **code** | **Integer** | The event code that the item validation event references | [optional] |
| **message** | **String** | Title message describing the item validation event | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ItemValidationEvent.new(
  attribute: title,
  code: 106,
  message: Title is missing from product metadata.
)
```

