# PinterestSdkClient::CatalogsProductGroupCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** |  | [optional] |
| **feed_id** | **String** | Catalog Feed id pertaining to the catalog product group. |  |
| **filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  |
| **is_featured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional][default to false] |
| **name** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsProductGroupCreateRequest.new(
  description: null,
  feed_id: 2680059592705,
  filters: null,
  is_featured: null,
  name: null
)
```

