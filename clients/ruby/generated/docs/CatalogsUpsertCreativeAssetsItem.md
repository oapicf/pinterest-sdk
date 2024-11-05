# PinterestSdkClient::CatalogsUpsertCreativeAssetsItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **creative_assets_id** | **String** | The catalog creative assets id in the merchant namespace |  |
| **operation** | **String** |  |  |
| **attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsUpsertCreativeAssetsItem.new(
  creative_assets_id: DS0294-M,
  operation: null,
  attributes: null
)
```

