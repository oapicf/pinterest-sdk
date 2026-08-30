# PinterestSdkClient::CatalogsCreativeAssetsItemResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] |
| **catalog_type** | **String** |  |  |
| **creative_assets_id** | **String** | The catalog creative assets id in the merchant namespace | [optional] |
| **item_response_kind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. |  |
| **pins** | [**Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsItemResponse.new(
  attributes: null,
  catalog_type: null,
  creative_assets_id: DS0294-M,
  item_response_kind: null,
  pins: null
)
```

