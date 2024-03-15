# PinterestSdkClient::CatalogsProductMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_id** | **String** | The user-created unique ID that represents the product. |  |
| **item_group_id** | **String** | The parent ID of the product. |  |
| **availability** | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  |  |
| **price** | **Float** | The price of the product. |  |
| **sale_price** | **Float** | The discounted price of the product. |  |
| **currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsProductMetadata.new(
  item_id: DS0294-L,
  item_group_id: DS0294,
  availability: null,
  price: 24.99,
  sale_price: 14.99,
  currency: null
)
```

