# PinterestSdkClient::CatalogsProductGroupCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Catalog Feed id pertaining to the catalog product group. |  |
| **name** | **String** |  |  |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsProductGroupCreateRequest.new(
  feed_id: 2680059592705,
  name: null,
  description: null,
  filters: null
)
```

