# PinterestSdkClient::OauthAccessToken

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **access_token** | **String** |  | [readonly] |
| **expires_in** | **Integer** |  | [readonly] |
| **refresh_token** | **String** |  | [optional] |
| **refresh_token_expires_at** | **Integer** |  | [optional][readonly] |
| **refresh_token_expires_in** | **Integer** |  | [optional][readonly] |
| **response_type** | [**TokenGrantType**](TokenGrantType.md) |  | [optional][readonly] |
| **scope** | **String** |  | [optional] |
| **token_type** | **String** |  | [readonly][default to &#39;bearer&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OauthAccessToken.new(
  access_token: null,
  expires_in: null,
  refresh_token: null,
  refresh_token_expires_at: null,
  refresh_token_expires_in: null,
  response_type: null,
  scope: null,
  token_type: null
)
```

