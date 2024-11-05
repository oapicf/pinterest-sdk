
# Table `OauthAccessTokenRequestRefresh`
(mapped from: OauthAccessTokenRequestRefresh)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**refreshToken** | refresh_token | text NOT NULL |  | **kotlin.String** |  | 
**scope** | scope | text |  | **kotlin.String** |  |  [optional]
**refreshOn** | refresh_on | boolean |  | **kotlin.Boolean** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. |  [optional]





