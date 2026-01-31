# PinterestSdkClient::CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the creative assets product group. |  |
| **catalog_type** | **String** |  |  |
| **filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.new(
  catalog_id: 2680059592705,
  catalog_type: null,
  filters: null
)
```

