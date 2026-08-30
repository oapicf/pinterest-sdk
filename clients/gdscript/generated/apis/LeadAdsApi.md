<a name="__pageTop"></a>
# LeadAdsApi   { #LeadAdsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_subscriptions/del_by_id**](#ad_accounts_subscriptions/del_by_id) | **DELETE** `/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}` | Delete lead ads subscription
[**ad_accounts_subscriptions/get_by_id**](#ad_accounts_subscriptions/get_by_id) | **GET** `/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}` | Get lead ads subscription by ID
[**ad_accounts_subscriptions/get_list**](#ad_accounts_subscriptions/get_list) | **GET** `/ad_accounts/{ad_account_id}/leads/subscriptions` | Get lead ads subscriptions
[**ad_accounts_subscriptions/post**](#ad_accounts_subscriptions/post) | **POST** `/ad_accounts/{ad_account_id}/leads/subscriptions` | Create lead ads subscription

# **ad_accounts_subscriptions/del_by_id**   { #ad_accounts_subscriptions/del_by_id }
<a name="ad_accounts_subscriptions/del_by_id"></a>

> `ad_accounts_subscriptions/del_by_id(adAccountId: String,subscriptionId: String, on_success: Callable, on_failure: Callable)`

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

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
var api = LeadAdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadAdsApi.new(config, client)


# Invoke an endpoint
api.ad_accounts_subscriptions/del_by_id(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# subscriptionId: String = ""   Eg: subscriptionId_example
	# Unique identifier of a subscription.
	subscriptionId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_accounts_subscriptions/del_by_id", response)
		assert(response.data is LeadSubscription)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_accounts_subscriptions/get_by_id**   { #ad_accounts_subscriptions/get_by_id }
<a name="ad_accounts_subscriptions/get_by_id"></a>

> `ad_accounts_subscriptions/get_by_id(adAccountId: String,subscriptionId: String, on_success: Callable, on_failure: Callable)`

Get lead ads subscription by ID

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

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
var api = LeadAdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadAdsApi.new(config, client)


# Invoke an endpoint
api.ad_accounts_subscriptions/get_by_id(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# subscriptionId: String = ""   Eg: subscriptionId_example
	# Unique identifier of a subscription.
	subscriptionId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_accounts_subscriptions/get_by_id", response)
		assert(response.data is LeadSubscription)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_accounts_subscriptions/get_list**   { #ad_accounts_subscriptions/get_list }
<a name="ad_accounts_subscriptions/get_list"></a>

> `ad_accounts_subscriptions/get_list(adAccountId: String,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.

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
var api = LeadAdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadAdsApi.new(config, client)


# Invoke an endpoint
api.ad_accounts_subscriptions/get_list(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_accounts_subscriptions/get_list", response)
		assert(response.data is ad_accounts_subscriptions_get_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_accounts_subscriptions/post**   { #ad_accounts_subscriptions/post }
<a name="ad_accounts_subscriptions/post"></a>

> `ad_accounts_subscriptions/post(adAccountId: String,leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate, on_success: Callable, on_failure: Callable)`

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.

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
var api = LeadAdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadAdsApi.new(config, client)

var leadSubscriptionPostParamsCreate = LeadSubscriptionPostParamsCreate.new()
# … fill model leadSubscriptionPostParamsCreate with data

# Invoke an endpoint
api.ad_accounts_subscriptions/post(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate
	leadSubscriptionPostParamsCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_accounts_subscriptions/post", response)
		assert(response.data is LeadSubscription)
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

