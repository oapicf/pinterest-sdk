<a name="__pageTop"></a>
# CustomerSegmentApi   { #CustomerSegmentApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_segment/create**](#customer_segment/create) | **POST** `/ad_accounts/{ad_account_id}/customer_segments` | Create customer segments
[**customer_segment/list**](#customer_segment/list) | **GET** `/ad_accounts/{ad_account_id}/customer_segments` | List customer segments
[**customer_segment/update**](#customer_segment/update) | **PATCH** `/ad_accounts/{ad_account_id}/customer_segments` | Update customer segments

# **customer_segment/create**   { #customer_segment/create }
<a name="customer_segment/create"></a>

> `customer_segment/create(adAccountId: String,customerSegmentCreate: CustomerSegmentCreate, on_success: Callable, on_failure: Callable)`

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

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
var api = CustomerSegmentApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomerSegmentApi.new(config, client)

var customerSegmentCreate = CustomerSegmentCreate.new()
# … fill model customerSegmentCreate with data

# Invoke an endpoint
api.customer_segment/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# customerSegmentCreate: CustomerSegmentCreate
	customerSegmentCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "customer_segment/create", response)
		assert(response.data is CustomerSegment)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **customer_segment/list**   { #customer_segment/list }
<a name="customer_segment/list"></a>

> `customer_segment/list(adAccountId: String,bookmark = "",pageSize = 25,order = null,includeSizing = false,searchQuery = "", on_success: Callable, on_failure: Callable)`

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

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
var api = CustomerSegmentApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomerSegmentApi.new(config, client)


# Invoke an endpoint
api.customer_segment/list(
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
	# includeSizing: bool = false   Eg: true
	# Include audience sizing in result or not
	includeSizing,
	# searchQuery: String = ""   Eg: searchQuery_example
	# Search query. Can contain pin description keywords or comma-separated pin IDs.
	searchQuery,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "customer_segment/list", response)
		assert(response.data is customer_segment_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **customer_segment/update**   { #customer_segment/update }
<a name="customer_segment/update"></a>

> `customer_segment/update(adAccountId: String,customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody, on_success: Callable, on_failure: Callable)`

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

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
var api = CustomerSegmentApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomerSegmentApi.new(config, client)

var customerSegmentUpdateRequestUpdateWithRequiredBody = CustomerSegmentUpdateRequestUpdateWithRequiredBody.new()
# … fill model customerSegmentUpdateRequestUpdateWithRequiredBody with data

# Invoke an endpoint
api.customer_segment/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody
	customerSegmentUpdateRequestUpdateWithRequiredBody,
	# On Success
	func(response):
		prints("Success!", "customer_segment/update", response)
		
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

