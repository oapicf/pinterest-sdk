# PinterestSdkClient::CatalogsHotelItemsPostFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **hotel_ids** | **Array&lt;String&gt;** |  |  |
| **catalog_id** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelItemsPostFilter.new(
  catalog_type: null,
  hotel_ids: null,
  catalog_id: null
)
```

