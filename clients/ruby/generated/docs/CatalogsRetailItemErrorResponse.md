# PinterestSdkClient::CatalogsRetailItemErrorResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **item_id** | **String** | The catalog item id in the merchant namespace | [optional] |
| **errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailItemErrorResponse.new(
  catalog_type: null,
  item_id: DS0294-M,
  errors: null
)
```

