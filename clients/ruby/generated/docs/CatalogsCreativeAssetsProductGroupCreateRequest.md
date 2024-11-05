# PinterestSdkClient::CatalogsCreativeAssetsProductGroupCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **name** | **String** |  |  |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  |  |
| **catalog_id** | **String** | Catalog id pertaining to the creative assets product group. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsProductGroupCreateRequest.new(
  catalog_type: null,
  name: null,
  description: null,
  filters: null,
  catalog_id: 2680059592705
)
```

