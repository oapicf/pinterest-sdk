# PinterestSdkClient::SSIOAccountAddress

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **address_id** | **String** | Salesforce id for address | [optional] |
| **display** | **String** | Address display | [optional] |
| **order_legal_entity** | **String** | Legal entity for this insertion order | [optional] |
| **purpose** | **String** | Purpose for which the address is used, usually Billing or Businness | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SSIOAccountAddress.new(
  address_id: a1C1N000004MUrLUAW,
  display: 475 Brannan Street, San Francisco, CA 94103,
  order_legal_entity: PIN US OU,
  purpose: Billing
)
```

