<a name="__pageTop"></a>
# ProductTagsApi   { #ProductTagsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**product_tags/bulk_add**](#product_tags/bulk_add) | **POST** `/pins/{pin_id}/product_tags` | Add product tags to pin
[**product_tags/bulk_delete**](#product_tags/bulk_delete) | **POST** `/pins/{pin_id}/product_tags/bulk-delete` | Delete product tags from pin
[**product_tags/list**](#product_tags/list) | **GET** `/pins/{pin_id}/product_tags` | Get product tags for pin

# **product_tags/bulk_add**   { #product_tags/bulk_add }
<a name="product_tags/bulk_add"></a>

> `product_tags/bulk_add(pinId: String,productTagsBulkAddRequest: ProductTagsBulkAddRequest, on_success: Callable, on_failure: Callable)`

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

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
var api = ProductTagsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProductTagsApi.new(config, client)

var productTagsBulkAddRequest = ProductTagsBulkAddRequest.new()
# … fill model productTagsBulkAddRequest with data

# Invoke an endpoint
api.product_tags/bulk_add(
	# pinId: String = ""   Eg: pinId_example
	# Unique identifier of the hero pin that will receive product tags.
	pinId,
	# productTagsBulkAddRequest: ProductTagsBulkAddRequest
	productTagsBulkAddRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "product_tags/bulk_add", response)
		assert(response.data is ProductTagsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **product_tags/bulk_delete**   { #product_tags/bulk_delete }
<a name="product_tags/bulk_delete"></a>

> `product_tags/bulk_delete(pinId: String,productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest, on_success: Callable, on_failure: Callable)`

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

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
var api = ProductTagsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProductTagsApi.new(config, client)

var productTagsBulkDeleteRequest = ProductTagsBulkDeleteRequest.new()
# … fill model productTagsBulkDeleteRequest with data

# Invoke an endpoint
api.product_tags/bulk_delete(
	# pinId: String = ""   Eg: pinId_example
	# Unique identifier of the hero pin that will receive product tags.
	pinId,
	# productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest
	productTagsBulkDeleteRequest,
	# On Success
	func(response):
		prints("Success!", "product_tags/bulk_delete", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **product_tags/list**   { #product_tags/list }
<a name="product_tags/list"></a>

> `product_tags/list(pinId: String, on_success: Callable, on_failure: Callable)`

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

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
var api = ProductTagsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProductTagsApi.new(config, client)


# Invoke an endpoint
api.product_tags/list(
	# pinId: String = ""   Eg: pinId_example
	# Unique identifier of the hero pin that will receive product tags.
	pinId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "product_tags/list", response)
		assert(response.data is ProductTagsResponse)
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

