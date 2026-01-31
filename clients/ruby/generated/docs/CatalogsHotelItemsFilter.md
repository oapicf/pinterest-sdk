# PinterestSdkClient::CatalogsHotelItemsFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] |
| **catalog_type** | **String** |  |  |
| **hotel_ids** | **Array&lt;String&gt;** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelItemsFilter.new(
  catalog_id: null,
  catalog_type: null,
  hotel_ids: null
)
```

