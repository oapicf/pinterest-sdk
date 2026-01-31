# PinterestSdkClient::OauthAccessTokenResponseCode

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **refresh_token** | **String** |  | [optional] |
| **refresh_token_expires_at** | **Integer** |  | [optional] |
| **refresh_token_expires_in** | **Integer** |  | [optional] |
| **access_token** | **String** |  |  |
| **expires_in** | **Integer** |  |  |
| **response_type** | **String** |  | [optional] |
| **scope** | **String** |  |  |
| **token_type** | **String** |  | [default to &#39;bearer&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OauthAccessTokenResponseCode.new(
  refresh_token: null,
  refresh_token_expires_at: null,
  refresh_token_expires_in: null,
  access_token: null,
  expires_in: null,
  response_type: null,
  scope: null,
  token_type: null
)
```

