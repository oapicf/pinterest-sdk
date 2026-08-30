<a name="__pageTop"></a>
# MsotEventsApi   { #MsotEventsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msot_events/create**](#msot_events/create) | **POST** `/ad_accounts/{ad_account_id}/msot/events` | Send Measurement Source Of Truth (MSOT) attributed conversion events

# **msot_events/create**   { #msot_events/create }
<a name="msot_events/create"></a>

> `msot_events/create(adAccountId: String,conversionMSOTEventsCreate: ConversionMSOTEventsCreate, on_success: Callable, on_failure: Callable)`

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.

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
var api = MsotEventsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MsotEventsApi.new(config, client)

var conversionMSOTEventsCreate = ConversionMSOTEventsCreate.new()
# … fill model conversionMSOTEventsCreate with data

# Invoke an endpoint
api.msot_events/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# conversionMSOTEventsCreate: ConversionMSOTEventsCreate
	conversionMSOTEventsCreate,
	# On Success
	func(response):
		prints("Success!", "msot_events/create", response)
		
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

