# PinterestSdkClient::PinMediaSourcePinURL

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **source_type** | **String** |  |  |
| **is_affiliate_link** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional][default to false] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaSourcePinURL.new(
  source_type: null,
  is_affiliate_link: null
)
```

