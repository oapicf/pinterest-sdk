# PinterestSdkClient::CatalogsCreativeAssetsProductGroupCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the creative assets product group. |  |
| **catalog_type** | **String** |  |  |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  |
| **name** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsProductGroupCreateRequest.new(
  catalog_id: 2680059592705,
  catalog_type: null,
  description: null,
  filters: null,
  name: null
)
```

