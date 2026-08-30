<a name="__pageTop"></a>
# ResourcesApi   { #ResourcesApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_countries/get**](#ad_account_countries/get) | **GET** `/resources/ad_account_countries` | Get ad accounts countries
[**delivery_metrics/get**](#delivery_metrics/get) | **GET** `/resources/delivery_metrics` | Get available metrics&#x27; definitions
[**interest_targeting_options/get**](#interest_targeting_options/get) | **GET** `/resources/targeting/interests/{interest_id}` | Get interest details
[**lead_form_questions/get**](#lead_form_questions/get) | **GET** `/resources/lead_form_questions` | Get lead form questions
[**metrics_ready_state/get**](#metrics_ready_state/get) | **GET** `/resources/metrics_ready_state` | Get metrics ready state
[**targeting_options/get**](#targeting_options/get) | **GET** `/resources/targeting/{targeting_type}` | Get targeting options

# **ad_account_countries/get**   { #ad_account_countries/get }
<a name="ad_account_countries/get"></a>

> `ad_account_countries/get( on_success: Callable, on_failure: Callable)`

Get ad accounts countries

Get Ad Accounts countries

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
var api = ResourcesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ResourcesApi.new(config, client)


# Invoke an endpoint
api.ad_account_countries/get(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_account_countries/get", response)
		assert(response.data is ad_account_countries_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delivery_metrics/get**   { #delivery_metrics/get }
<a name="delivery_metrics/get"></a>

> `delivery_metrics/get(reportType = null, on_success: Callable, on_failure: Callable)`

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

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
var api = ResourcesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ResourcesApi.new(config, client)


# Invoke an endpoint
api.delivery_metrics/get(
	# reportType: ReportType
	# Report type.
	reportType,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delivery_metrics/get", response)
		assert(response.data is delivery_metrics_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **interest_targeting_options/get**   { #interest_targeting_options/get }
<a name="interest_targeting_options/get"></a>

> `interest_targeting_options/get(interestId: String, on_success: Callable, on_failure: Callable)`

Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.

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
var api = ResourcesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ResourcesApi.new(config, client)


# Invoke an endpoint
api.interest_targeting_options/get(
	# interestId: String = ""   Eg: interestId_example
	# Unique identifier of an interest.
	interestId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "interest_targeting_options/get", response)
		assert(response.data is SingleInterestTargetingOption)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **lead_form_questions/get**   { #lead_form_questions/get }
<a name="lead_form_questions/get"></a>

> `lead_form_questions/get( on_success: Callable, on_failure: Callable)`

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
var api = ResourcesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ResourcesApi.new(config, client)


# Invoke an endpoint
api.lead_form_questions/get(
	# On Success
	func(response):
		prints("Success!", "lead_form_questions/get", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **metrics_ready_state/get**   { #metrics_ready_state/get }
<a name="metrics_ready_state/get"></a>

> `metrics_ready_state/get(date: String, on_success: Callable, on_failure: Callable)`

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

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
var api = ResourcesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ResourcesApi.new(config, client)


# Invoke an endpoint
api.metrics_ready_state/get(
	# date: String = ""   Eg: date_example
	# Analytics reports request date (UTC). Format: YYYY-MM-DD
	date,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "metrics_ready_state/get", response)
		assert(response.data is BookClosed)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **targeting_options/get**   { #targeting_options/get }
<a name="targeting_options/get"></a>

> `targeting_options/get(targetingType: PublicTargetingType,adAccountId = "",clientId = "",oauthSignature = "",timestamp = "", on_success: Callable, on_failure: Callable)`

Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```

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
var api = ResourcesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ResourcesApi.new(config, client)


# Invoke an endpoint
api.targeting_options/get(
	# targetingType: PublicTargetingType
	# Public targeting type
	targetingType,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# clientId: String = ""   Eg: clientId_example
	# Client ID
	clientId,
	# oauthSignature: String = ""   Eg: oauthSignature_example
	# Oauth signature
	oauthSignature,
	# timestamp: String = ""   Eg: timestamp_example
	# Timestamp.
	timestamp,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "targeting_options/get", response)
		assert(response.data is object)
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

