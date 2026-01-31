# PinterestSdkClient::OauthAccessTokenResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **access_token** | **String** |  |  |
| **expires_in** | **Integer** |  |  |
| **response_type** | **String** |  | [optional] |
| **scope** | **String** |  |  |
| **token_type** | **String** |  | [default to &#39;bearer&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OauthAccessTokenResponse.new(
  access_token: null,
  expires_in: null,
  response_type: null,
  scope: null,
  token_type: null
)
```

