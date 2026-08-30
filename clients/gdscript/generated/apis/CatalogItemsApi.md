<a name="__pageTop"></a>
# CatalogItemsApi   { #CatalogItemsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**items/post**](#items/post) | **POST** `/catalogs/items` | Get catalogs items (POST)
[**items_batch/get**](#items_batch/get) | **GET** `/catalogs/items/batch/{batch_id}` | Get item batch status
[**items_batch/post**](#items_batch/post) | **POST** `/catalogs/items/batch` | Operate on item batch

# **items/post**   { #items/post }
<a name="items/post"></a>

> `items/post(catalogsItemsRequest: CatalogsItemsRequest,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get catalogs items (POST)

Get the items of the catalog owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
var api = CatalogItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogItemsApi.new(config, client)

var catalogsItemsRequest = CatalogsItemsRequest.new()
# … fill model catalogsItemsRequest with data

# Invoke an endpoint
api.items/post(
	# catalogsItemsRequest: CatalogsItemsRequest
	catalogsItemsRequest,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "items/post", response)
		assert(response.data is items_post_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **items_batch/get**   { #items_batch/get }
<a name="items_batch/get"></a>

> `items_batch/get(batchId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get item batch status

Get a single catalogs items batch owned by the \"operating user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

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
var api = CatalogItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogItemsApi.new(config, client)


# Invoke an endpoint
api.items_batch/get(
	# batchId: String = ""   Eg: batchId_example
	# Id of a catalogs items batch to fetch
	batchId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "items_batch/get", response)
		assert(response.data is CatalogsItemsBatch)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **items_batch/post**   { #items_batch/post }
<a name="items_batch/post"></a>

> `items_batch/post(catalogsItemsBatchPostRequest: CatalogsItemsBatchPostRequest,adAccountId = "", on_success: Callable, on_failure: Callable)`

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

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
var api = CatalogItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogItemsApi.new(config, client)

var catalogsItemsBatchPostRequest = CatalogsItemsBatchPostRequest.new()
# … fill model catalogsItemsBatchPostRequest with data

# Invoke an endpoint
api.items_batch/post(
	# catalogsItemsBatchPostRequest: CatalogsItemsBatchPostRequest
	catalogsItemsBatchPostRequest,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "items_batch/post", response)
		assert(response.data is CatalogsItemsBatch)
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

