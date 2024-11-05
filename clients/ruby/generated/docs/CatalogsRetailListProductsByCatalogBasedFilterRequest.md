# PinterestSdkClient::CatalogsRetailListProductsByCatalogBasedFilterRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  |
| **catalog_id** | **String** | Catalog id pertaining to the retail product group. |  |
| **filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  |
| **country** | [**Country**](Country.md) |  |  |
| **locale** | [**CatalogsLocale**](CatalogsLocale.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailListProductsByCatalogBasedFilterRequest.new(
  catalog_type: null,
  catalog_id: 2680059592705,
  filters: null,
  country: null,
  locale: null
)
```

