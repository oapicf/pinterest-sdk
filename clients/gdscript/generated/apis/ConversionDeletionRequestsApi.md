<a name="__pageTop"></a>
# ConversionDeletionRequestsApi   { #ConversionDeletionRequestsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_deletion_request/create**](#conversion_deletion_request/create) | **POST** `/ad_accounts/{ad_account_id}/conversion_deletion_requests` | Create a conversion deletion request
[**conversion_deletion_request/delete**](#conversion_deletion_request/delete) | **DELETE** `/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}` | Delete a conversion deletion request
[**conversion_deletion_request/get**](#conversion_deletion_request/get) | **GET** `/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}` | Get a single conversion deletion request
[**conversion_deletion_request/list**](#conversion_deletion_request/list) | **GET** `/ad_accounts/{ad_account_id}/conversion_deletion_requests` | List conversion deletion requests

# **conversion_deletion_request/create**   { #conversion_deletion_request/create }
<a name="conversion_deletion_request/create"></a>

> `conversion_deletion_request/create(adAccountId: String,conversionDeletionRequestCreate: ConversionDeletionRequestCreate, on_success: Callable, on_failure: Callable)`

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

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
var api = ConversionDeletionRequestsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionDeletionRequestsApi.new(config, client)

var conversionDeletionRequestCreate = ConversionDeletionRequestCreate.new()
# … fill model conversionDeletionRequestCreate with data

# Invoke an endpoint
api.conversion_deletion_request/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# conversionDeletionRequestCreate: ConversionDeletionRequestCreate
	conversionDeletionRequestCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "conversion_deletion_request/create", response)
		assert(response.data is ConversionDeletionRequest)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **conversion_deletion_request/delete**   { #conversion_deletion_request/delete }
<a name="conversion_deletion_request/delete"></a>

> `conversion_deletion_request/delete(requestId: String,adAccountId: String, on_success: Callable, on_failure: Callable)`

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.

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
var api = ConversionDeletionRequestsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionDeletionRequestsApi.new(config, client)


# Invoke an endpoint
api.conversion_deletion_request/delete(
	# requestId: String = ""   Eg: requestId_example
	# Unique identifier of the conversion deletion request
	requestId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "conversion_deletion_request/delete", response)
		assert(response.data is ConversionDeletionRequest)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **conversion_deletion_request/get**   { #conversion_deletion_request/get }
<a name="conversion_deletion_request/get"></a>

> `conversion_deletion_request/get(requestId: String,adAccountId: String, on_success: Callable, on_failure: Callable)`

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.

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
var api = ConversionDeletionRequestsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionDeletionRequestsApi.new(config, client)


# Invoke an endpoint
api.conversion_deletion_request/get(
	# requestId: String = ""   Eg: requestId_example
	# Unique identifier of the conversion deletion request
	requestId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "conversion_deletion_request/get", response)
		assert(response.data is ConversionDeletionRequest)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **conversion_deletion_request/list**   { #conversion_deletion_request/list }
<a name="conversion_deletion_request/list"></a>

> `conversion_deletion_request/list(adAccountId: String,bookmark = "",pageSize = 25,order = null, on_success: Callable, on_failure: Callable)`

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.

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
var api = ConversionDeletionRequestsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionDeletionRequestsApi.new(config, client)


# Invoke an endpoint
api.conversion_deletion_request/list(
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
		prints("Success!", "conversion_deletion_request/list", response)
		assert(response.data is conversion_deletion_request_list_200_response)
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

