# PinterestSdkClient::OauthAccessTokenResponseRefresh

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **access_token** | **String** |  |  |
| **expires_in** | **Integer** |  |  |
| **response_type** | **String** |  | [optional] |
| **scope** | **String** |  |  |
| **token_type** | **String** |  | [default to &#39;bearer&#39;] |
| **refresh_token** | **String** |  |  |
| **refresh_token_expires_at** | **Integer** |  |  |
| **refresh_token_expires_in** | **Integer** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OauthAccessTokenResponseRefresh.new(
  access_token: null,
  expires_in: null,
  response_type: null,
  scope: null,
  token_type: null,
  refresh_token: null,
  refresh_token_expires_at: null,
  refresh_token_expires_in: null
)
```

