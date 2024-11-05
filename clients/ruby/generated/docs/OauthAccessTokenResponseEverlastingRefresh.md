# PinterestSdkClient::OauthAccessTokenResponseEverlastingRefresh

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **response_type** | **String** |  | [optional] |
| **access_token** | **String** |  |  |
| **token_type** | **String** |  | [default to &#39;bearer&#39;] |
| **expires_in** | **Integer** |  |  |
| **scope** | **String** |  |  |
| **refresh_token** | **String** |  |  |
| **refresh_token_expires_in** | **Integer** |  |  |
| **refresh_token_expires_at** | **Integer** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OauthAccessTokenResponseEverlastingRefresh.new(
  response_type: null,
  access_token: null,
  token_type: null,
  expires_in: null,
  scope: null,
  refresh_token: null,
  refresh_token_expires_in: null,
  refresh_token_expires_at: null
)
```

