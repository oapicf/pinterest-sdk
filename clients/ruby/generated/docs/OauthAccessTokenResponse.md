# PinterestSdkClient::OauthAccessTokenResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **response_type** | **String** |  | [optional] |
| **access_token** | **String** |  |  |
| **token_type** | **String** |  | [default to &#39;bearer&#39;] |
| **expires_in** | **Integer** |  |  |
| **scope** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OauthAccessTokenResponse.new(
  response_type: null,
  access_token: null,
  token_type: null,
  expires_in: null,
  scope: null
)
```

