<a name="__pageTop"></a>
# CatalogProductGroupsApi   { #CatalogProductGroupsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_product_group_pins/list**](#catalogs_product_group_pins/list) | **GET** `/catalogs/product_groups/{product_group_id}/products` | List products by product group
[**catalogs_product_groups/create**](#catalogs_product_groups/create) | **POST** `/catalogs/product_groups` | Create product group
[**catalogs_product_groups/create_many**](#catalogs_product_groups/create_many) | **POST** `/catalogs/product_groups/multiple` | Create product groups
[**catalogs_product_groups/delete**](#catalogs_product_groups/delete) | **DELETE** `/catalogs/product_groups/{product_group_id}` | Delete product group
[**catalogs_product_groups/delete_many**](#catalogs_product_groups/delete_many) | **DELETE** `/catalogs/product_groups/multiple` | Delete product groups
[**catalogs_product_groups/get**](#catalogs_product_groups/get) | **GET** `/catalogs/product_groups/{product_group_id}` | Get product group
[**catalogs_product_groups/list**](#catalogs_product_groups/list) | **GET** `/catalogs/product_groups` | List product groups
[**catalogs_product_groups/product_counts_get**](#catalogs_product_groups/product_counts_get) | **GET** `/catalogs/product_groups/{product_group_id}/product_counts` | Get product counts
[**catalogs_product_groups/update**](#catalogs_product_groups/update) | **PATCH** `/catalogs/product_groups/{product_group_id}` | Update single product group
[**products_by_product_group_filter/list**](#products_by_product_group_filter/list) | **POST** `/catalogs/products/get_by_product_group_filters` | List products by filter

# **catalogs_product_group_pins/list**   { #catalogs_product_group_pins/list }
<a name="catalogs_product_group_pins/list"></a>

> `catalogs_product_group_pins/list(productGroupId: String,adAccountId = "",pinMetrics = false,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogProductGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogProductGroupsApi.new(config, client)


# Invoke an endpoint
api.catalogs_product_group_pins/list(
	# productGroupId: String = ""   Eg: productGroupId_example
	# Unique identifier of a product group
	productGroupId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# pinMetrics: bool = false   Eg: true
	# Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
	pinMetrics,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_product_group_pins/list", response)
		assert(response.data is catalogs_product_group_pins_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_product_groups/create**   { #catalogs_product_groups/create }
<a name="catalogs_product_groups/create"></a>

> `catalogs_product_groups/create(catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema,adAccountId = "", on_success: Callable, on_failure: Callable)`

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
var api = CatalogProductGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogProductGroupsApi.new(config, client)

var catalogsProductGroupsCreateRequestSchema = CatalogsProductGroupsCreateRequestSchema.new()
# … fill model catalogsProductGroupsCreateRequestSchema with data

# Invoke an endpoint
api.catalogs_product_groups/create(
	# catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema
	catalogsProductGroupsCreateRequestSchema,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_product_groups/create", response)
		assert(response.data is CatalogsVerticalProductGroup)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_product_groups/create_many**   { #catalogs_product_groups/create_many }
<a name="catalogs_product_groups/create_many"></a>

> `catalogs_product_groups/create_many(catalogsProductGroupsCreateManyRequestItems: Array,adAccountId = "", on_success: Callable, on_failure: Callable)`

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
var api = CatalogProductGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogProductGroupsApi.new(config, client)


# Invoke an endpoint
api.catalogs_product_groups/create_many(
	# catalogsProductGroupsCreateManyRequestItems: Array
	catalogsProductGroupsCreateManyRequestItems,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_product_groups/create_many", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_product_groups/delete**   { #catalogs_product_groups/delete }
<a name="catalogs_product_groups/delete"></a>

> `catalogs_product_groups/delete(productGroupId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogProductGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogProductGroupsApi.new(config, client)


# Invoke an endpoint
api.catalogs_product_groups/delete(
	# productGroupId: String = ""   Eg: productGroupId_example
	# Unique identifier of a product group
	productGroupId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_product_groups/delete", response)
		assert(response.data is CatalogsVerticalProductGroup)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_product_groups/delete_many**   { #catalogs_product_groups/delete_many }
<a name="catalogs_product_groups/delete_many"></a>

> `catalogs_product_groups/delete_many(id: Array,adAccountId = "", on_success: Callable, on_failure: Callable)`

Delete product groups

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogProductGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogProductGroupsApi.new(config, client)


# Invoke an endpoint
api.catalogs_product_groups/delete_many(
	# id: Array
	# Comma-separated list of product group ids
	id,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):
		prints("Success!", "catalogs_product_groups/delete_many", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_product_groups/get**   { #catalogs_product_groups/get }
<a name="catalogs_product_groups/get"></a>

> `catalogs_product_groups/get(productGroupId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get product group

Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogProductGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogProductGroupsApi.new(config, client)


# Invoke an endpoint
api.catalogs_product_groups/get(
	# productGroupId: String = ""   Eg: productGroupId_example
	# Unique identifier of a product group
	productGroupId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_product_groups/get", response)
		assert(response.data is CatalogsVerticalProductGroup)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_product_groups/list**   { #catalogs_product_groups/list }
<a name="catalogs_product_groups/list"></a>

> `catalogs_product_groups/list(id = null,feedId = "",catalogId = "",adAccountId = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogProductGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogProductGroupsApi.new(config, client)


# Invoke an endpoint
api.catalogs_product_groups/list(
	# id: Array
	# Comma-separated list of product group ids
	id,
	# feedId: String = ""   Eg: feedId_example
	# Filter entities for a given feed_id. If not given, all feeds are considered.
	feedId,
	# catalogId: String = ""   Eg: catalogId_example
	# Filter entities for a given catalog_id. If not given, all catalogs are considered.
	catalogId,
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
		prints("Success!", "catalogs_product_groups/list", response)
		assert(response.data is catalogs_product_groups_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_product_groups/product_counts_get**   { #catalogs_product_groups/product_counts_get }
<a name="catalogs_product_groups/product_counts_get"></a>

> `catalogs_product_groups/product_counts_get(productGroupId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogProductGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogProductGroupsApi.new(config, client)


# Invoke an endpoint
api.catalogs_product_groups/product_counts_get(
	# productGroupId: String = ""   Eg: productGroupId_example
	# Unique identifier of a product group
	productGroupId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_product_groups/product_counts_get", response)
		assert(response.data is CatalogsProductGroupProductCountsVertical)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs_product_groups/update**   { #catalogs_product_groups/update }
<a name="catalogs_product_groups/update"></a>

> `catalogs_product_groups/update(productGroupId: String,catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema,adAccountId = "", on_success: Callable, on_failure: Callable)`

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
var api = CatalogProductGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogProductGroupsApi.new(config, client)

var catalogsProductGroupsUpdateRequestSchema = CatalogsProductGroupsUpdateRequestSchema.new()
# … fill model catalogsProductGroupsUpdateRequestSchema with data

# Invoke an endpoint
api.catalogs_product_groups/update(
	# productGroupId: String = ""   Eg: productGroupId_example
	# Unique identifier of a product group
	productGroupId,
	# catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema
	catalogsProductGroupsUpdateRequestSchema,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs_product_groups/update", response)
		assert(response.data is CatalogsVerticalProductGroup)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **products_by_product_group_filter/list**   { #products_by_product_group_filter/list }
<a name="products_by_product_group_filter/list"></a>

> `products_by_product_group_filter/list(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest,bookmark = "",pageSize = 25,adAccountId = "",pinMetrics = false, on_success: Callable, on_failure: Callable)`

List products by filter

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogProductGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogProductGroupsApi.new(config, client)

var catalogsListProductsByFilterRequest = CatalogsListProductsByFilterRequest.new()
# … fill model catalogsListProductsByFilterRequest with data

# Invoke an endpoint
api.products_by_product_group_filter/list(
	# catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest
	catalogsListProductsByFilterRequest,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# pinMetrics: bool = false   Eg: true
	# Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
	pinMetrics,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "products_by_product_group_filter/list", response)
		assert(response.data is catalogs_product_group_pins_list_200_response)
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

