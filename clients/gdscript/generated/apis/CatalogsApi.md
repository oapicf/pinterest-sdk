<a name="__pageTop"></a>
# CatalogsApi   { #CatalogsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs/available_filter_values**](#catalogs/available_filter_values) | **GET** `/catalogs/available_filter_values` | List available filter values
[**catalogs/create**](#catalogs/create) | **POST** `/catalogs` | Create catalog
[**catalogs/list**](#catalogs/list) | **GET** `/catalogs` | List catalogs

# **catalogs/available_filter_values**   { #catalogs/available_filter_values }
<a name="catalogs/available_filter_values"></a>

> `catalogs/available_filter_values(catalogId: String,feedId = "",country = null,language = null,adAccountId = "", on_success: Callable, on_failure: Callable)`

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogsApi.new(config, client)


# Invoke an endpoint
api.catalogs/available_filter_values(
	# catalogId: String = ""   Eg: catalogId_example
	# Filter entities for a given catalog_id.
	catalogId,
	# feedId: String = ""   Eg: feedId_example
	# Filter entities for a given feed_id. If not given, all feeds are considered.
	feedId,
	# country: Country
	# Country for the Catalogs Items
	country,
	# language: CatalogsLocale
	# Language for the Catalogs Items
	language,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs/available_filter_values", response)
		assert(response.data is CatalogsAvailableFilterValues)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs/create**   { #catalogs/create }
<a name="catalogs/create"></a>

> `catalogs/create(catalogCreate: CatalogCreate,adAccountId = "", on_success: Callable, on_failure: Callable)`

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
var api = CatalogsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogsApi.new(config, client)

var catalogCreate = CatalogCreate.new()
# … fill model catalogCreate with data

# Invoke an endpoint
api.catalogs/create(
	# catalogCreate: CatalogCreate
	catalogCreate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "catalogs/create", response)
		assert(response.data is Catalog)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **catalogs/list**   { #catalogs/list }
<a name="catalogs/list"></a>

> `catalogs/list(adAccountId = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogsApi.new(config, client)


# Invoke an endpoint
api.catalogs/list(
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
		prints("Success!", "catalogs/list", response)
		assert(response.data is catalogs_list_200_response)
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

