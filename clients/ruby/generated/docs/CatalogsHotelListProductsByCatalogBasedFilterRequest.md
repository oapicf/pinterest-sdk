# PinterestSdkClient::CatalogsHotelListProductsByCatalogBasedFilterRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **catalog_id** | **String** | Catalog id pertaining to the hotel product group. |  |
| **filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelListProductsByCatalogBasedFilterRequest.new(
  catalog_type: null,
  catalog_id: 2680059592705,
  filters: null
)
```

