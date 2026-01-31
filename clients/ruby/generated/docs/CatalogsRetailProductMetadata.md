# PinterestSdkClient::CatalogsRetailProductMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **availability** | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  |  |
| **currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  |  |
| **item_group_id** | **String** | The parent ID of the product. |  |
| **item_id** | **String** | The user-created unique ID that represents the product. |  |
| **price** | **Float** | The price of the product. |  |
| **sale_price** | **Float** | The discounted price of the product. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailProductMetadata.new(
  availability: null,
  currency: null,
  item_group_id: DS0294,
  item_id: DS0294-L,
  price: 24.99,
  sale_price: 14.99
)
```

