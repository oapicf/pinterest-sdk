# PinterestSdkClient::AdPreviewSourcePinId

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **creative_type** | [**AdPinPreviewCreativeType**](AdPinPreviewCreativeType.md) | Creative type of the ad preview. | [optional] |
| **pin_id** | **String** | Pin ID. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdPreviewSourcePinId.new(
  creative_type: MAX_WIDTH_VIDEO_COLLECTION,
  pin_id: 7389479023
)
```

