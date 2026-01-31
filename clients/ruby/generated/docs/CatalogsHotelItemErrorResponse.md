# PinterestSdkClient::CatalogsHotelItemErrorResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  |
| **hotel_id** | **String** | The catalog hotel id in the merchant namespace | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsHotelItemErrorResponse.new(
  catalog_type: null,
  errors: null,
  hotel_id: DS0294-M
)
```

