# PinterestSdkClient::PriceFilterPrice

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  |  |
| **negated** | **Boolean** |  | [optional] |
| **operator** | [**NumericFilterOperatorType**](NumericFilterOperatorType.md) |  |  |
| **value** | **Float** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PriceFilterPrice.new(
  currency: null,
  negated: null,
  operator: null,
  value: null
)
```

