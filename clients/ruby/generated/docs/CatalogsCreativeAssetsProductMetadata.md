# PinterestSdkClient::CatalogsCreativeAssetsProductMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **creative_assets_id** | **String** | The user-created unique ID that represents the creative assets item. |  |
| **visibility** | [**CreativeAssetsVisibilityType**](CreativeAssetsVisibilityType.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsCreativeAssetsProductMetadata.new(
  creative_assets_id: 123abc,
  visibility: null
)
```

