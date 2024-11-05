# PinterestSdkClient::CatalogsCreativeAssetsItemErrorResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |
| **creative_assets_id** | **String** | The catalog creative assets id in the merchant namespace | [optional] |
| **errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsItemErrorResponse.new(
  catalog_type: null,
  creative_assets_id: DS0294-M,
  errors: null
)
```

