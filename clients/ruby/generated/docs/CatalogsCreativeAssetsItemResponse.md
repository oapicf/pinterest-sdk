# PinterestSdkClient::CatalogsCreativeAssetsItemResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **creative_assets_id** | **String** | The catalog creative assets id in the merchant namespace | [optional] |
| **pins** | [**Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsItemResponse.new(
  attributes: null,
  catalog_type: null,
  creative_assets_id: DS0294-M,
  pins: null
)
```

