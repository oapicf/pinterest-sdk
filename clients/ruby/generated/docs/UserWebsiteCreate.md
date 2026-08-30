# PinterestSdkClient::UserWebsiteCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **verification_method** | [**WebsiteVerificationMethod**](WebsiteVerificationMethod.md) | Method used to verify website ownership. | [optional] |
| **website** | **String** | Website with path or domain only | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UserWebsiteCreate.new(
  verification_method: null,
  website: null
)
```

