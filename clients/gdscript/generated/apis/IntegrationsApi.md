<a name="__pageTop"></a>
# IntegrationsApi   { #IntegrationsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrations/get_by_id**](#integrations/get_by_id) | **GET** `/integrations/{id}` | Get integration metadata
[**integrations/get_list**](#integrations/get_list) | **GET** `/integrations` | Get integration metadata list
[**integrations_commerce/del**](#integrations_commerce/del) | **DELETE** `/integrations/commerce/{external_business_id}` | Delete commerce integration
[**integrations_commerce/get**](#integrations_commerce/get) | **GET** `/integrations/commerce/{external_business_id}` | Get commerce integration
[**integrations_commerce/patch**](#integrations_commerce/patch) | **PATCH** `/integrations/commerce/{external_business_id}` | Update commerce integration
[**integrations_commerce/post**](#integrations_commerce/post) | **POST** `/integrations/commerce` | Create commerce integration
[**integrations_logs/post**](#integrations_logs/post) | **POST** `/integrations/logs` | Receives batched logs from integration applications.

# **integrations/get_by_id**   { #integrations/get_by_id }
<a name="integrations/get_by_id"></a>

> `integrations/get_by_id(id: String, on_success: Callable, on_failure: Callable)`

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

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
var api = IntegrationsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = IntegrationsApi.new(config, client)


# Invoke an endpoint
api.integrations/get_by_id(
	# id: String = ""   Eg: id_example
	# Integration record ID.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "integrations/get_by_id", response)
		assert(response.data is IntegrationRecord)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **integrations/get_list**   { #integrations/get_list }
<a name="integrations/get_list"></a>

> `integrations/get_list(bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

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
var api = IntegrationsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = IntegrationsApi.new(config, client)


# Invoke an endpoint
api.integrations/get_list(
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "integrations/get_list", response)
		assert(response.data is integrations_get_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **integrations_commerce/del**   { #integrations_commerce/del }
<a name="integrations_commerce/del"></a>

> `integrations_commerce/del(externalBusinessId: String, on_success: Callable, on_failure: Callable)`

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

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
var api = IntegrationsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = IntegrationsApi.new(config, client)


# Invoke an endpoint
api.integrations_commerce/del(
	# externalBusinessId: String = ""   Eg: externalBusinessId_example
	# External business ID for the integration.
	externalBusinessId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "integrations_commerce/del", response)
		assert(response.data is IntegrationMetadata)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **integrations_commerce/get**   { #integrations_commerce/get }
<a name="integrations_commerce/get"></a>

> `integrations_commerce/get(externalBusinessId: String, on_success: Callable, on_failure: Callable)`

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

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
var api = IntegrationsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = IntegrationsApi.new(config, client)


# Invoke an endpoint
api.integrations_commerce/get(
	# externalBusinessId: String = ""   Eg: externalBusinessId_example
	# External business ID for the integration.
	externalBusinessId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "integrations_commerce/get", response)
		assert(response.data is IntegrationMetadata)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **integrations_commerce/patch**   { #integrations_commerce/patch }
<a name="integrations_commerce/patch"></a>

> `integrations_commerce/patch(externalBusinessId: String,integrationMetadataUpdate: IntegrationMetadataUpdate, on_success: Callable, on_failure: Callable)`

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

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
var api = IntegrationsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = IntegrationsApi.new(config, client)

var integrationMetadataUpdate = IntegrationMetadataUpdate.new()
# … fill model integrationMetadataUpdate with data

# Invoke an endpoint
api.integrations_commerce/patch(
	# externalBusinessId: String = ""   Eg: externalBusinessId_example
	# External business ID for the integration.
	externalBusinessId,
	# integrationMetadataUpdate: IntegrationMetadataUpdate
	integrationMetadataUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "integrations_commerce/patch", response)
		assert(response.data is IntegrationMetadata)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **integrations_commerce/post**   { #integrations_commerce/post }
<a name="integrations_commerce/post"></a>

> `integrations_commerce/post(integrationMetadataCreate: IntegrationMetadataCreate, on_success: Callable, on_failure: Callable)`

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

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
var api = IntegrationsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = IntegrationsApi.new(config, client)

var integrationMetadataCreate = IntegrationMetadataCreate.new()
# … fill model integrationMetadataCreate with data

# Invoke an endpoint
api.integrations_commerce/post(
	# integrationMetadataCreate: IntegrationMetadataCreate
	integrationMetadataCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "integrations_commerce/post", response)
		assert(response.data is IntegrationMetadata)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **integrations_logs/post**   { #integrations_logs/post }
<a name="integrations_logs/post"></a>

> `integrations_logs/post(integrationLogsRequestCreate: IntegrationLogsRequestCreate, on_success: Callable, on_failure: Callable)`

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

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
var api = IntegrationsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = IntegrationsApi.new(config, client)

var integrationLogsRequestCreate = IntegrationLogsRequestCreate.new()
# … fill model integrationLogsRequestCreate with data

# Invoke an endpoint
api.integrations_logs/post(
	# integrationLogsRequestCreate: IntegrationLogsRequestCreate
	integrationLogsRequestCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "integrations_logs/post", response)
		assert(response.data is IntegrationLogsSuccessResponse)
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

