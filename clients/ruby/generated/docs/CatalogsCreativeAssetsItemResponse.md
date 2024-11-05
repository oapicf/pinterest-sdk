# PinterestSdkClient::CatalogsCreativeAssetsItemResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **creative_assets_id** | **String** | The catalog creative assets id in the merchant namespace | [optional] |
| **pins** | [**Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] |
| **attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsItemResponse.new(
  catalog_type: null,
  creative_assets_id: DS0294-M,
  pins: null,
  attributes: null
)
```

