# PinterestSdkClient::CatalogsCreateHotelItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **hotel_id** | **String** | The catalog hotel id in the merchant namespace |  |
| **operation** | **String** |  |  |
| **attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreateHotelItem.new(
  hotel_id: DS0294-M,
  operation: null,
  attributes: null
)
```

