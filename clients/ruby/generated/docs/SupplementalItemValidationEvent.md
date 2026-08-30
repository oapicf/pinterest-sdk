# PinterestSdkClient::SupplementalItemValidationEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attribute** | **String** | The item attribute referenced by the validation event eg. price, availability, ad_link |  |
| **code** | **Integer** | The event code that the item validation event references |  |
| **message** | **String** | Title message describing the item validation event |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SupplementalItemValidationEvent.new(
  attribute: price,
  code: 113,
  message: Some supplemental item data was not published due to incorrect formatting
)
```

