# PinterestSdkClient::CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **catalog_id** | **String** | Catalog id pertaining to the creative assets product group. |  |
| **filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.new(
  catalog_type: null,
  catalog_id: 2680059592705,
  filters: null
)
```

