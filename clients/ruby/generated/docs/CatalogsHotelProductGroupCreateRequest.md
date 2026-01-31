# PinterestSdkClient::CatalogsHotelProductGroupCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the hotel product group. |  |
| **catalog_type** | **String** |  |  |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  |  |
| **name** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelProductGroupCreateRequest.new(
  catalog_id: 2680059592705,
  catalog_type: null,
  description: null,
  filters: null,
  name: null
)
```

