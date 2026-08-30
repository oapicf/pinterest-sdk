# PinterestSdkClient::CatalogsCreativeAssetsProductGroupUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [optional] |
| **name** | **String** | Name of catalog product group | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsProductGroupUpdateRequest.new(
  catalog_type: null,
  description: null,
  filters: null,
  name: Most Popular
)
```

