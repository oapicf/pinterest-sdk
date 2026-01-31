# PinterestSdkClient::CatalogsHotelItemResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | [optional] |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **hotel_id** | **String** | The catalog hotel id in the merchant namespace | [optional] |
| **pins** | [**Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelItemResponse.new(
  attributes: null,
  catalog_type: null,
  hotel_id: DS0294-M,
  pins: null
)
```

