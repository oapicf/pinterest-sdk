# PinterestSdkClient::CatalogsProductGroupCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** |  |  |
| **description** | **String** |  | [optional] |
| **is_featured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional][default to false] |
| **filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  |
| **feed_id** | **String** | Catalog Feed id pertaining to the catalog product group. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsProductGroupCreateRequest.new(
  name: null,
  description: null,
  is_featured: null,
  filters: null,
  feed_id: 2680059592705
)
```

