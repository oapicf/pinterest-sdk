# PinterestSdkClient::UserWebsiteVerifyRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **website** | **String** |  | [optional] |
| **verification_method** | **String** |  | [optional][default to &#39;METATAG&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UserWebsiteVerifyRequest.new(
  website: pintest-website-12345678.test/test_1,
  verification_method: null
)
```

