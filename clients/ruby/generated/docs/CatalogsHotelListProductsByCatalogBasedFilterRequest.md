# PinterestSdkClient::CatalogsHotelListProductsByCatalogBasedFilterRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the hotel product group. |  |
| **catalog_type** | **String** |  |  |
| **filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelListProductsByCatalogBasedFilterRequest.new(
  catalog_id: 2680059592705,
  catalog_type: null,
  filters: null
)
```

