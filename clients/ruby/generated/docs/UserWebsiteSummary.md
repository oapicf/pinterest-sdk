# PinterestSdkClient::UserWebsiteSummary

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **website** | **String** | Website with path or domain only | [optional] |
| **status** | **String** | Status of the verification process | [optional] |
| **verified_at** | **String** | UTC timestamp when the verification happened - sometimes missing | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UserWebsiteSummary.new(
  website: mysite.test,
  status: success,
  verified_at: 2022-12-14T21:03:01.602000
)
```

