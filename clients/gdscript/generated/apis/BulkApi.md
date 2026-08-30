<a name="__pageTop"></a>
# BulkApi   { #BulkApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulk_download/create**](#bulk_download/create) | **POST** `/ad_accounts/{ad_account_id}/bulk/download` | Get advertiser entities in bulk
[**bulk_request/get**](#bulk_request/get) | **GET** `/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}` | Download advertiser entities in bulk
[**bulk_upsert/create**](#bulk_upsert/create) | **POST** `/ad_accounts/{ad_account_id}/bulk/upsert` | Create/update ad entities in bulk

# **bulk_download/create**   { #bulk_download/create }
<a name="bulk_download/create"></a>

> `bulk_download/create(adAccountId: String,bulkDownloadCreate: BulkDownloadCreate, on_success: Callable, on_failure: Callable)`

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

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
var api = BulkApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BulkApi.new(config, client)

var bulkDownloadCreate = BulkDownloadCreate.new()
# … fill model bulkDownloadCreate with data

# Invoke an endpoint
api.bulk_download/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bulkDownloadCreate: BulkDownloadCreate
	bulkDownloadCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "bulk_download/create", response)
		assert(response.data is BulkDownload)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **bulk_request/get**   { #bulk_request/get }
<a name="bulk_request/get"></a>

> `bulk_request/get(adAccountId: String,bulkRequestId: String,includeDetails = false, on_success: Callable, on_failure: Callable)`

Download advertiser entities in bulk

Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).

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
var api = BulkApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BulkApi.new(config, client)


# Invoke an endpoint
api.bulk_request/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bulkRequestId: String = ""   Eg: bulkRequestId_example
	# Bulk request ID that is from one of the entities bulk endpoints
	bulkRequestId,
	# includeDetails: bool = false   Eg: true
	# If set to True then attach the errors/details to all the requests
	includeDetails,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "bulk_request/get", response)
		assert(response.data is BulkJobData)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **bulk_upsert/create**   { #bulk_upsert/create }
<a name="bulk_upsert/create"></a>

> `bulk_upsert/create(adAccountId: String,bulkUpsertRequest: BulkUpsertRequest, on_success: Callable, on_failure: Callable)`

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

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
var api = BulkApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BulkApi.new(config, client)

var bulkUpsertRequest = BulkUpsertRequest.new()
# … fill model bulkUpsertRequest with data

# Invoke an endpoint
api.bulk_upsert/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bulkUpsertRequest: BulkUpsertRequest
	# Parameters to get create/update ad entities in bulk
	bulkUpsertRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "bulk_upsert/create", response)
		assert(response.data is BulkUpsertResponse)
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

