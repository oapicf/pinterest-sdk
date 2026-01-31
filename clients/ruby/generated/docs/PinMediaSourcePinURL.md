# PinterestSdkClient::PinMediaSourcePinURL

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **is_affiliate_link** | **Boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional][default to false] |
| **source_type** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinMediaSourcePinURL.new(
  is_affiliate_link: null,
  source_type: null
)
```

