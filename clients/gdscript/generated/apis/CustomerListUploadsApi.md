<a name="__pageTop"></a>
# CustomerListUploadsApi   { #CustomerListUploadsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_list_uploads/create**](#customer_list_uploads/create) | **POST** `/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads` | Create customer list upload
[**customer_list_uploads/get**](#customer_list_uploads/get) | **GET** `/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}` | Get customer list upload
[**customer_list_uploads/run**](#customer_list_uploads/run) | **POST** `/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run` | Run customer list upload

# **customer_list_uploads/create**   { #customer_list_uploads/create }
<a name="customer_list_uploads/create"></a>

> `customer_list_uploads/create(adAccountId: String,customerListId: String,customerListUploadCreateRequest: CustomerListUploadCreateRequest, on_success: Callable, on_failure: Callable)`

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

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
var api = CustomerListUploadsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomerListUploadsApi.new(config, client)

var customerListUploadCreateRequest = CustomerListUploadCreateRequest.new()
# … fill model customerListUploadCreateRequest with data

# Invoke an endpoint
api.customer_list_uploads/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# customerListId: String = ""   Eg: customerListId_example
	# Customer list ID.
	customerListId,
	# customerListUploadCreateRequest: CustomerListUploadCreateRequest
	customerListUploadCreateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "customer_list_uploads/create", response)
		assert(response.data is CustomerListUploadCreateResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **customer_list_uploads/get**   { #customer_list_uploads/get }
<a name="customer_list_uploads/get"></a>

> `customer_list_uploads/get(adAccountId: String,customerListId: String,customerListUploadId: String, on_success: Callable, on_failure: Callable)`

Get customer list upload

Get the metadata for a given upload by its ID.

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
var api = CustomerListUploadsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomerListUploadsApi.new(config, client)


# Invoke an endpoint
api.customer_list_uploads/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# customerListId: String = ""   Eg: customerListId_example
	# Customer list ID.
	customerListId,
	# customerListUploadId: String = ""   Eg: customerListUploadId_example
	# Customer List Upload ID.
	customerListUploadId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "customer_list_uploads/get", response)
		assert(response.data is CustomerListUpload)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **customer_list_uploads/run**   { #customer_list_uploads/run }
<a name="customer_list_uploads/run"></a>

> `customer_list_uploads/run(adAccountId: String,customerListId: String,customerListUploadId: String, on_success: Callable, on_failure: Callable)`

Run customer list upload

Begin processing a customer list upload.

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
var api = CustomerListUploadsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomerListUploadsApi.new(config, client)


# Invoke an endpoint
api.customer_list_uploads/run(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# customerListId: String = ""   Eg: customerListId_example
	# Customer list ID.
	customerListId,
	# customerListUploadId: String = ""   Eg: customerListUploadId_example
	# Customer List Upload ID.
	customerListUploadId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "customer_list_uploads/run", response)
		assert(response.data is CustomerListUpload)
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

