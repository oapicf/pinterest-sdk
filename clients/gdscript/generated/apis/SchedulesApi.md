<a name="__pageTop"></a>
# SchedulesApi   { #SchedulesApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedules/create**](#schedules/create) | **POST** `/ad_accounts/{ad_account_id}/schedules` | Create schedules
[**schedules/list**](#schedules/list) | **GET** `/ad_accounts/{ad_account_id}/schedules` | Get Schedules
[**schedules/update**](#schedules/update) | **PATCH** `/ad_accounts/{ad_account_id}/schedules` | Update schedules

# **schedules/create**   { #schedules/create }
<a name="schedules/create"></a>

> `schedules/create(adAccountId: String,scheduleCreate: Array, on_success: Callable, on_failure: Callable)`

Create schedules

Batch create schedules

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
var api = SchedulesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SchedulesApi.new(config, client)


# Invoke an endpoint
api.schedules/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# scheduleCreate: Array
	scheduleCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "schedules/create", response)
		assert(response.data is schedules_create_200_response_inner)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **schedules/list**   { #schedules/list }
<a name="schedules/list"></a>

> `schedules/list(adAccountId: String,entityIds: Array,bookmark = "",pageSize = 25,order = null,scheduleStatuses = null,scheduleType = null, on_success: Callable, on_failure: Callable)`

Get Schedules

Get schedules for a specific advertiser

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
var api = SchedulesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SchedulesApi.new(config, client)


# Invoke an endpoint
api.schedules/list(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# entityIds: Array
	# List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
	entityIds,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# order: PinterestLibPaginationOrder
	# The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
	order,
	# scheduleStatuses: Array
	# Filter schedules by status (one or more)
	scheduleStatuses,
	# scheduleType: ScheduleType
	# Filter schedules by a type
	scheduleType,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "schedules/list", response)
		assert(response.data is schedules_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **schedules/update**   { #schedules/update }
<a name="schedules/update"></a>

> `schedules/update(adAccountId: String,scheduleBatchUpdate: Array, on_success: Callable, on_failure: Callable)`

Update schedules

Update one or more schedules

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
var api = SchedulesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SchedulesApi.new(config, client)


# Invoke an endpoint
api.schedules/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# scheduleBatchUpdate: Array
	scheduleBatchUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "schedules/update", response)
		assert(response.data is schedules_create_200_response_inner)
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

