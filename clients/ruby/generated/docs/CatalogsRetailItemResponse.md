# PinterestSdkClient::CatalogsRetailItemResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attributes** | [**ItemAttributes**](ItemAttributes.md) |  | [optional] |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **item_id** | **String** | The catalog retail item id in the merchant namespace | [optional] |
| **pins** | [**Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailItemResponse.new(
  attributes: null,
  catalog_type: null,
  item_id: DS0294-M,
  pins: null
)
```

