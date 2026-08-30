<a name="__pageTop"></a>
# PromotionsApi   { #PromotionsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotions/create**](#promotions/create) | **POST** `/ad_accounts/{ad_account_id}/promotions` | Create promotions
[**promotions/delete**](#promotions/delete) | **DELETE** `/ad_accounts/{ad_account_id}/promotions/{promotion_id}` | Delete promotion by id
[**promotions/get**](#promotions/get) | **GET** `/ad_accounts/{ad_account_id}/promotions/{promotion_id}` | Get promotion by id
[**promotions/list**](#promotions/list) | **GET** `/ad_accounts/{ad_account_id}/promotions` | Get promotions
[**promotions/update**](#promotions/update) | **PATCH** `/ad_accounts/{ad_account_id}/promotions` | Update promotions

# **promotions/create**   { #promotions/create }
<a name="promotions/create"></a>

> `promotions/create(adAccountId: String,promotionCreate: Array, on_success: Callable, on_failure: Callable)`

Create promotions

Create multiple new promotions.

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
var api = PromotionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PromotionsApi.new(config, client)


# Invoke an endpoint
api.promotions/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# promotionCreate: Array
	promotionCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "promotions/create", response)
		assert(response.data is PromotionsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **promotions/delete**   { #promotions/delete }
<a name="promotions/delete"></a>

> `promotions/delete(promotionId: String,adAccountId: String, on_success: Callable, on_failure: Callable)`

Delete promotion by id

Delete a promotion within Pinterest.

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
var api = PromotionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PromotionsApi.new(config, client)


# Invoke an endpoint
api.promotions/delete(
	# promotionId: String = ""   Eg: promotionId_example
	# Promotion ID
	promotionId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "promotions/delete", response)
		assert(response.data is Promotion)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **promotions/get**   { #promotions/get }
<a name="promotions/get"></a>

> `promotions/get(promotionId: String,adAccountId: String, on_success: Callable, on_failure: Callable)`

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

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
var api = PromotionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PromotionsApi.new(config, client)


# Invoke an endpoint
api.promotions/get(
	# promotionId: String = ""   Eg: promotionId_example
	# Promotion ID
	promotionId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "promotions/get", response)
		assert(response.data is Promotion)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **promotions/list**   { #promotions/list }
<a name="promotions/list"></a>

> `promotions/list(adAccountId: String,bookmark = "",pageSize = 25,order = null, on_success: Callable, on_failure: Callable)`

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

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
var api = PromotionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PromotionsApi.new(config, client)


# Invoke an endpoint
api.promotions/list(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# order: PinterestLibPaginationOrder
	# The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
	order,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "promotions/list", response)
		assert(response.data is promotions_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **promotions/update**   { #promotions/update }
<a name="promotions/update"></a>

> `promotions/update(adAccountId: String,promotionBatchUpdate: Array, on_success: Callable, on_failure: Callable)`

Update promotions

Update multiple promotions.

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
var api = PromotionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PromotionsApi.new(config, client)


# Invoke an endpoint
api.promotions/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# promotionBatchUpdate: Array
	promotionBatchUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "promotions/update", response)
		assert(response.data is PromotionsResponse)
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

