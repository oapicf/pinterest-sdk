<a name="__pageTop"></a>
# OrderLinesApi   { #OrderLinesApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**order_lines/get**](#order_lines/get) | **GET** `/ad_accounts/{ad_account_id}/order_lines/{order_line_id}` | Get order line
[**order_lines/list**](#order_lines/list) | **GET** `/ad_accounts/{ad_account_id}/order_lines` | Get order lines.

# **order_lines/get**   { #order_lines/get }
<a name="order_lines/get"></a>

> `order_lines/get(orderLineId: String,adAccountId: String, on_success: Callable, on_failure: Callable)`

Get order line

Get a specific existing order line associated with an ad account.

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
var api = OrderLinesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = OrderLinesApi.new(config, client)


# Invoke an endpoint
api.order_lines/get(
	# orderLineId: String = ""   Eg: orderLineId_example
	# Order line ID.
	orderLineId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "order_lines/get", response)
		assert(response.data is OrderLine)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **order_lines/list**   { #order_lines/list }
<a name="order_lines/list"></a>

> `order_lines/list(adAccountId: String,bookmark = "",pageSize = 25,order = null, on_success: Callable, on_failure: Callable)`

Get order lines.

List existing order lines associated with an ad account.

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
var api = OrderLinesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = OrderLinesApi.new(config, client)


# Invoke an endpoint
api.order_lines/list(
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
		prints("Success!", "order_lines/list", response)
		assert(response.data is order_lines_list_200_response)
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

