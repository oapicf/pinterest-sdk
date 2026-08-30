<a name="__pageTop"></a>
# ConversionEqsApi   { #ConversionEqsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_eqs/list**](#conversion_eqs/list) | **GET** `/ad_accounts/{ad_account_id}/conversion_eqs` | Get event quality score (EQS)

# **conversion_eqs/list**   { #conversion_eqs/list }
<a name="conversion_eqs/list"></a>

> `conversion_eqs/list(lookbackPeriod: LookbackPeriodOptions,adAccountId: String,sourcePlatform = null,ingestionSource = null, on_success: Callable, on_failure: Callable)`

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example

* OAuth Authentication (`pinterest_oauth2`)
* OAuth Authentication (`client_credentials`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ConversionEqsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionEqsApi.new(config, client)


# Invoke an endpoint
api.conversion_eqs/list(
	# lookbackPeriod: LookbackPeriodOptions
	# Lookback window (number of days).
	lookbackPeriod,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# sourcePlatform: SourcePlatformOptions
	# Source platform of event.
	sourcePlatform,
	# ingestionSource: IngestionSourceOptions
	# Ingestion source of event.
	ingestionSource,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "conversion_eqs/list", response)
		assert(response.data is EventQualityScore)
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

