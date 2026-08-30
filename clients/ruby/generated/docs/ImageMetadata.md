# PinterestSdkClient::ImageMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** |  | [optional] |
| **images** | [**ImageSize**](ImageSize.md) |  | [optional] |
| **item_type** | **String** | Discriminator literal identifying this as image metadata inside a &#x60;PinMediaMetadata&#x60; payload. |  |
| **link** | **String** |  | [optional] |
| **title** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ImageMetadata.new(
  description: null,
  images: null,
  item_type: null,
  link: null,
  title: null
)
```

