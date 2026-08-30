# PinterestSdkClient::UserWebsite

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | **String** | Status of the verification process | [optional][readonly] |
| **verified_at** | **String** | UTC timestamp when the verification happened - sometimes missing | [optional][readonly] |
| **website** | **String** | Website with path or domain only | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UserWebsite.new(
  status: null,
  verified_at: null,
  website: null
)
```

