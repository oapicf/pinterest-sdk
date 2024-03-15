# PinterestSdkClient::CatalogsListProductsByFilterRequestOneOf

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Catalog Feed id pertaining to the catalog product group filter. |  |
| **filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsListProductsByFilterRequestOneOf.new(
  feed_id: 2680059592705,
  filters: null
)
```

