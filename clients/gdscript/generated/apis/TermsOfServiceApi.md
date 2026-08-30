<a name="__pageTop"></a>
# TermsOfServiceApi   { #TermsOfServiceApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terms_of_service/get**](#terms_of_service/get) | **GET** `/ad_accounts/{ad_account_id}/terms_of_service` | Get terms of service

# **terms_of_service/get**   { #terms_of_service/get }
<a name="terms_of_service/get"></a>

> `terms_of_service/get(adAccountId: String,includeHtml = false,tosType = "", on_success: Callable, on_failure: Callable)`

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

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
var api = TermsOfServiceApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = TermsOfServiceApi.new(config, client)


# Invoke an endpoint
api.terms_of_service/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# includeHtml: bool = false   Eg: true
	# Return HTML in TOS text.
	includeHtml,
	# tosType: String = ""   Eg: tosType_example
	# Request type.
	tosType,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "terms_of_service/get", response)
		assert(response.data is TermsOfService)
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

