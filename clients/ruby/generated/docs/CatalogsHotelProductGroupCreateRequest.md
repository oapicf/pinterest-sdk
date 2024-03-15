# PinterestSdkClient::CatalogsHotelProductGroupCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **name** | **String** |  |  |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  |  |
| **catalog_id** | **String** | Catalog id pertaining to the hotel product group. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelProductGroupCreateRequest.new(
  catalog_type: null,
  name: null,
  description: null,
  filters: null,
  catalog_id: 2680059592705
)
```

