# PinterestSdkClient::OauthAccessTokenRequestRefresh

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **refresh_token** | **String** |  |  |
| **scope** | **String** |  | [optional] |
| **refresh_on** | **Boolean** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OauthAccessTokenRequestRefresh.new(
  refresh_token: null,
  scope: null,
  refresh_on: null
)
```

