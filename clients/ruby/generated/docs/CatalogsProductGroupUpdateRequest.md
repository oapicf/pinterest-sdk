# PinterestSdkClient::CatalogsProductGroupUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] |
| **is_featured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] |
| **name** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsProductGroupUpdateRequest.new(
  description: null,
  filters: null,
  is_featured: null,
  name: null
)
```

