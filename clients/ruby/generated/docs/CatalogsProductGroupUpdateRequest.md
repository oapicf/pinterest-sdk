# PinterestSdkClient::CatalogsProductGroupUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |
| **is_featured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] |
| **filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsProductGroupUpdateRequest.new(
  name: null,
  description: null,
  is_featured: null,
  filters: null
)
```

