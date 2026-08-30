<a name="__pageTop"></a>
# ConversionsApi   { #ConversionsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_defined_events/create**](#advertiser_defined_events/create) | **POST** `/ad_accounts/{ad_account_id}/advertiser_defined_events` | Create advertiser defined events
[**advertiser_defined_events/delete**](#advertiser_defined_events/delete) | **DELETE** `/ad_accounts/{ad_account_id}/advertiser_defined_events` | Delete advertiser defined events
[**advertiser_defined_events/get**](#advertiser_defined_events/get) | **GET** `/ad_accounts/{ad_account_id}/advertiser_defined_events` | Get advertiser defined events
[**advertiser_defined_events/update**](#advertiser_defined_events/update) | **PATCH** `/ad_accounts/{ad_account_id}/advertiser_defined_events` | Update advertiser defined events

# **advertiser_defined_events/create**   { #advertiser_defined_events/create }
<a name="advertiser_defined_events/create"></a>

> `advertiser_defined_events/create(adAccountId: String,advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest, on_success: Callable, on_failure: Callable)`

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

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
var api = ConversionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionsApi.new(config, client)

var advertiserDefinedEventsCreateRequest = AdvertiserDefinedEventsCreateRequest.new()
# … fill model advertiserDefinedEventsCreateRequest with data

# Invoke an endpoint
api.advertiser_defined_events/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest
	advertiserDefinedEventsCreateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "advertiser_defined_events/create", response)
		assert(response.data is advertiser_defined_events_create_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **advertiser_defined_events/delete**   { #advertiser_defined_events/delete }
<a name="advertiser_defined_events/delete"></a>

> `advertiser_defined_events/delete(adAccountId: String,eventNames: Array, on_success: Callable, on_failure: Callable)`

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

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
var api = ConversionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionsApi.new(config, client)


# Invoke an endpoint
api.advertiser_defined_events/delete(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# eventNames: Array
	# List of event names to delete
	eventNames,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "advertiser_defined_events/delete", response)
		assert(response.data is advertiser_defined_events_create_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **advertiser_defined_events/get**   { #advertiser_defined_events/get }
<a name="advertiser_defined_events/get"></a>

> `advertiser_defined_events/get(adAccountId: String, on_success: Callable, on_failure: Callable)`

Get advertiser defined events

Get advertiser defined events for the given ad account.

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
var api = ConversionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionsApi.new(config, client)


# Invoke an endpoint
api.advertiser_defined_events/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "advertiser_defined_events/get", response)
		assert(response.data is advertiser_defined_events_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **advertiser_defined_events/update**   { #advertiser_defined_events/update }
<a name="advertiser_defined_events/update"></a>

> `advertiser_defined_events/update(adAccountId: String,advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest, on_success: Callable, on_failure: Callable)`

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

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
var api = ConversionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionsApi.new(config, client)

var advertiserDefinedEventsCreateRequest = AdvertiserDefinedEventsCreateRequest.new()
# … fill model advertiserDefinedEventsCreateRequest with data

# Invoke an endpoint
api.advertiser_defined_events/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest
	advertiserDefinedEventsCreateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "advertiser_defined_events/update", response)
		assert(response.data is advertiser_defined_events_create_200_response)
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

