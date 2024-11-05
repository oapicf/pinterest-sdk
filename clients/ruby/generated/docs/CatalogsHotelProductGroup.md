# PinterestSdkClient::CatalogsHotelProductGroup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **id** | **String** | ID of the hotel product group. |  |
| **name** | **String** | Name of hotel product group | [optional] |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  |  |
| **created_at** | **Integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] |
| **updated_at** | **Integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] |
| **catalog_id** | **String** | Catalog id pertaining to the hotel product group. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelProductGroup.new(
  catalog_type: null,
  id: 443727193917,
  name: Most Popular,
  description: null,
  filters: null,
  created_at: 1621350033000,
  updated_at: 1622742155000,
  catalog_id: null
)
```

