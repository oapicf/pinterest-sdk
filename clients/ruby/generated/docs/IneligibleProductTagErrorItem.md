# PinterestSdkClient::IneligibleProductTagErrorItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **error_message** | [**IneligibleProductTagReason**](IneligibleProductTagReason.md) | Reason why the pin is ineligible for tagging. |  |
| **pin_id** | **String** | Pin ID that failed eligibility check. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IneligibleProductTagErrorItem.new(
  error_message: null,
  pin_id: null
)
```

