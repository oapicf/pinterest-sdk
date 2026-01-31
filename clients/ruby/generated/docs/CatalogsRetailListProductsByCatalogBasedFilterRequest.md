# PinterestSdkClient::CatalogsRetailListProductsByCatalogBasedFilterRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the retail product group. |  |
| **catalog_type** | **String** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  |
| **country** | [**Country**](Country.md) |  |  |
| **filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  |
| **locale** | [**CatalogsLocale**](CatalogsLocale.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailListProductsByCatalogBasedFilterRequest.new(
  catalog_id: 2680059592705,
  catalog_type: null,
  country: null,
  filters: null,
  locale: null
)
```

