<a name="__pageTop"></a>
# CatalogSupplementalApi   { #CatalogSupplementalApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_local_inventory_items/post**](#catalogs_local_inventory_items/post) | **POST** `/catalogs/{catalog_id}/local_inventory_items/query` | Get local inventory items (POST)
[**catalogs_local_inventory_items_batch/operate**](#catalogs_local_inventory_items_batch/operate) | **POST** `/catalogs/{catalog_id}/local_inventory_items/batch` | Operate on local inventory item batch
[**catalogs_local_stores/create**](#catalogs_local_stores/create) | **POST** `/catalogs/{catalog_id}/local_stores` | Create local stores
[**catalogs_local_stores/delete**](#catalogs_local_stores/delete) | **DELETE** `/catalogs/{catalog_id}/local_stores` | Delete local stores
[**catalogs_local_stores/list**](#catalogs_local_stores/list) | **GET** `/catalogs/{catalog_id}/local_stores` | List local stores
[**catalogs_local_stores/update**](#catalogs_local_stores/update) | **PATCH** `/catalogs/{catalog_id}/local_stores` | Update local stores
[**catalogs_supplemental_items_batch/get**](#catalogs_supplemental_items_batch/get) | **GET** `/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}` | Get supplemental items batch status

# **catalogs_local_inventory_items/post**   { #catalogs_local_inventory_items/post }
<a name="catalogs_local_inventory_items/post"></a>

> `catalogs_local_inventory_items/post(catalogId: String,localInventoryItemsGetCreate: LocalInventoryItemsGetCreate,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogSupplementalApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogSupplementalApi.new(config, client)

var localInventoryItemsGetCreate = LocalInventoryItemsGetCreate.new()
# … fill model localInventoryItemsGetCreate with data

# Invoke an endpoint
api.catalogs_local_inventory_items/post(
	# catalogId: String = ""   Eg: catalogId_example
	# Unique identifier of a catalog.
	catalogId,
	# localInventoryItemsGetCreate: LocalInventoryItemsGetCreate
	localInventoryItemsGetCreate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_local_inventory_items/post", response)
		assert(response.data is LocalInventoryItemsGet)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_local_inventory_items_batch/operate**   { #catalogs_local_inventory_items_batch/operate }
<a name="catalogs_local_inventory_items_batch/operate"></a>

> `catalogs_local_inventory_items_batch/operate(catalogId: String,localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate,adAccountId = "", on_success: Callable, on_failure: Callable)`

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogSupplementalApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogSupplementalApi.new(config, client)

var localInventoryItemsBatchCreate = LocalInventoryItemsBatchCreate.new()
# … fill model localInventoryItemsBatchCreate with data

# Invoke an endpoint
api.catalogs_local_inventory_items_batch/operate(
	# catalogId: String = ""   Eg: catalogId_example
	# Unique identifier of a catalog.
	catalogId,
	# localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate
	localInventoryItemsBatchCreate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_local_inventory_items_batch/operate", response)
		assert(response.data is SupplementalItemsBatchResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_local_stores/create**   { #catalogs_local_stores/create }
<a name="catalogs_local_stores/create"></a>

> `catalogs_local_stores/create(catalogId: String,localStoreCreate: Array,adAccountId = "", on_success: Callable, on_failure: Callable)`

Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogSupplementalApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogSupplementalApi.new(config, client)


# Invoke an endpoint
api.catalogs_local_stores/create(
	# catalogId: String = ""   Eg: catalogId_example
	# Unique identifier of a catalog.
	catalogId,
	# localStoreCreate: Array
	localStoreCreate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_local_stores/create", response)
		assert(response.data is catalogs_local_stores_create_200_response_inner)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_local_stores/delete**   { #catalogs_local_stores/delete }
<a name="catalogs_local_stores/delete"></a>

> `catalogs_local_stores/delete(catalogId: String,ids: Array,adAccountId = "", on_success: Callable, on_failure: Callable)`

Delete local stores

  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogSupplementalApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogSupplementalApi.new(config, client)


# Invoke an endpoint
api.catalogs_local_stores/delete(
	# catalogId: String = ""   Eg: catalogId_example
	# Unique identifier of a catalog.
	catalogId,
	# ids: Array
	# List of local store IDs to filter by.
	ids,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_local_stores/delete", response)
		assert(response.data is catalogs_local_stores_delete_200_response_inner)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_local_stores/list**   { #catalogs_local_stores/list }
<a name="catalogs_local_stores/list"></a>

> `catalogs_local_stores/list(catalogId: String,ids = null,adAccountId = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogSupplementalApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogSupplementalApi.new(config, client)


# Invoke an endpoint
api.catalogs_local_stores/list(
	# catalogId: String = ""   Eg: catalogId_example
	# Unique identifier of a catalog.
	catalogId,
	# ids: Array
	# List of local store IDs to filter by.
	ids,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_local_stores/list", response)
		assert(response.data is catalogs_local_stores_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_local_stores/update**   { #catalogs_local_stores/update }
<a name="catalogs_local_stores/update"></a>

> `catalogs_local_stores/update(catalogId: String,localStoreBatchUpdate: Array,adAccountId = "", on_success: Callable, on_failure: Callable)`

Update local stores

  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogSupplementalApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogSupplementalApi.new(config, client)


# Invoke an endpoint
api.catalogs_local_stores/update(
	# catalogId: String = ""   Eg: catalogId_example
	# Unique identifier of a catalog.
	catalogId,
	# localStoreBatchUpdate: Array
	localStoreBatchUpdate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_local_stores/update", response)
		assert(response.data is catalogs_local_stores_create_200_response_inner)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_supplemental_items_batch/get**   { #catalogs_supplemental_items_batch/get }
<a name="catalogs_supplemental_items_batch/get"></a>

> `catalogs_supplemental_items_batch/get(catalogId: String,batchId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogSupplementalApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogSupplementalApi.new(config, client)


# Invoke an endpoint
api.catalogs_supplemental_items_batch/get(
	# catalogId: String = ""   Eg: catalogId_example
	# Unique identifier of a catalog.
	catalogId,
	# batchId: String = ""   Eg: batchId_example
	# Unique identifier of an items batch operation.
	batchId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_supplemental_items_batch/get", response)
		assert(response.data is SupplementalItemsBatchResponse)
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

