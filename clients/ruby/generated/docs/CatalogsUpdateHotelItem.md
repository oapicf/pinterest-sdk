# PinterestSdkClient::CatalogsUpdateHotelItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **hotel_id** | **String** | The catalog hotel item id in the merchant namespace |  |
| **operation** | **String** |  |  |
| **attributes** | [**CatalogsUpdatableHotelAttributes**](CatalogsUpdatableHotelAttributes.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsUpdateHotelItem.new(
  hotel_id: DS0294-M,
  operation: null,
  attributes: null
)
```

