# PinterestSdkClient::UserWebsiteVerifyRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **verification_method** | **String** |  | [optional][default to &#39;METATAG&#39;] |
| **website** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UserWebsiteVerifyRequest.new(
  verification_method: null,
  website: pintest-website-12345678.test/test_1
)
```

