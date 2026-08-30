<a name="__pageTop"></a>
# OauthApi   { #OauthApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth/conversion_token**](#oauth/conversion_token) | **POST** `/oauth/conversion_token` | Generate OAuth access token for conversion API
[**oauth/token**](#oauth/token) | **POST** `/oauth/token` | Generate OAuth access token
[**token/revoke**](#token/revoke) | **POST** `/oauth/token/revoke` | Revoke a token

# **oauth/conversion_token**   { #oauth/conversion_token }
<a name="oauth/conversion_token"></a>

> `oauth/conversion_token( on_success: Callable, on_failure: Callable)`

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.

### Example

* OAuth Authentication (`pinterest_oauth2`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = OauthApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = OauthApi.new(config, client)


# Invoke an endpoint
api.oauth/conversion_token(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "oauth/conversion_token", response)
		assert(response.data is ConversionAccessToken)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **oauth/token**   { #oauth/token }
<a name="oauth/token"></a>

> `oauth/token(grantType: TokenGrantType,code = "",continuousRefresh = "",redirectUri = "",refreshToken = "",scope = "", on_success: Callable, on_failure: Callable)`

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 

### Example

* Basic Authentication (`basic`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = OauthApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = OauthApi.new(config, client)


# Invoke an endpoint
api.oauth/token(
	# grantType: TokenGrantType
	grantType,
	# code: String = ""   Eg: code_example
	code,
	# continuousRefresh: String = ""   Eg: continuousRefresh_example
	#   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.
	continuousRefresh,
	# redirectUri: String = ""   Eg: redirectUri_example
	redirectUri,
	# refreshToken: String = ""   Eg: refreshToken_example
	refreshToken,
	# scope: String = ""   Eg: scope_example
	scope,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "oauth/token", response)
		assert(response.data is OauthAccessToken)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **token/revoke**   { #token/revoke }
<a name="token/revoke"></a>

> `token/revoke(token: String,tokenTypeHint = null, on_success: Callable, on_failure: Callable)`

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.

### Example

* Basic Authentication (`basic`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = OauthApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = OauthApi.new(config, client)


# Invoke an endpoint
api.token/revoke(
	# token: String = ""   Eg: token_example
	# The token to revoke.
	token,
	# tokenTypeHint: TokenTypeHint
	# The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
	tokenTypeHint,
	# On Success
	func(response):
		prints("Success!", "token/revoke", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), 
[client_credentials](../README.md#client_credentials), 
[conversion_token](../README.md#conversion_token), 
[basic](../README.md#basic)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

