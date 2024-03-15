# PinterestSdkClient::CatalogsHotelItemErrorResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **hotel_id** | **String** | The catalog hotel id in the merchant namespace | [optional] |
| **errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelItemErrorResponse.new(
  catalog_type: null,
  hotel_id: DS0294-M,
  errors: null
)
```

