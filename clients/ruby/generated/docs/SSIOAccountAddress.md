# PinterestSdkClient::SSIOAccountAddress

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **display** | **String** | Address display | [optional] |
| **purpose** | **String** | Purpose for which the address is used, usually Billing or Businness | [optional] |
| **address_id** | **String** | Salesforce id for address | [optional] |
| **order_legal_entity** | **String** | Legal entity for this insertion order | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOAccountAddress.new(
  display: 475 Brannan Street, San Francisco, CA 94103,
  purpose: Billing,
  address_id: a1C1N000004MUrLUAW,
  order_legal_entity: PIN US OU
)
```

