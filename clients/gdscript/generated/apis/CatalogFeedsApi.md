<a name="__pageTop"></a>
# CatalogFeedsApi   { #CatalogFeedsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**feed_processing_results/list**](#feed_processing_results/list) | **GET** `/catalogs/feeds/{feed_id}/processing_results` | List feed processing results
[**feeds/create**](#feeds/create) | **POST** `/catalogs/feeds` | Create feed
[**feeds/delete**](#feeds/delete) | **DELETE** `/catalogs/feeds/{feed_id}` | Delete feed
[**feeds/get**](#feeds/get) | **GET** `/catalogs/feeds/{feed_id}` | Get feed
[**feeds/ingest**](#feeds/ingest) | **POST** `/catalogs/feeds/{feed_id}/ingest` | Ingest feed items
[**feeds/list**](#feeds/list) | **GET** `/catalogs/feeds` | List feeds
[**feeds/update**](#feeds/update) | **PATCH** `/catalogs/feeds/{feed_id}` | Update feed
[**items_issues/list**](#items_issues/list) | **GET** `/catalogs/processing_results/{processing_result_id}/item_issues` | List item issues

# **feed_processing_results/list**   { #feed_processing_results/list }
<a name="feed_processing_results/list"></a>

> `feed_processing_results/list(feedId: String,adAccountId = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List feed processing results

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogFeedsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogFeedsApi.new(config, client)


# Invoke an endpoint
api.feed_processing_results/list(
	# feedId: String = ""   Eg: feedId_example
	# Unique identifier of a feed.
	feedId,
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
		prints("Success!", "feed_processing_results/list", response)
		assert(response.data is feed_processing_results_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **feeds/create**   { #feeds/create }
<a name="feeds/create"></a>

> `feeds/create(catalogsFeedCreateRequestSchema: CatalogsFeedCreateRequestSchema,adAccountId = "", on_success: Callable, on_failure: Callable)`

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
var api = CatalogFeedsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogFeedsApi.new(config, client)

var catalogsFeedCreateRequestSchema = CatalogsFeedCreateRequestSchema.new()
# … fill model catalogsFeedCreateRequestSchema with data

# Invoke an endpoint
api.feeds/create(
	# catalogsFeedCreateRequestSchema: CatalogsFeedCreateRequestSchema
	catalogsFeedCreateRequestSchema,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "feeds/create", response)
		assert(response.data is CatalogsFeed)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **feeds/delete**   { #feeds/delete }
<a name="feeds/delete"></a>

> `feeds/delete(feedId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Delete feed

Delete a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

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
var api = CatalogFeedsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogFeedsApi.new(config, client)


# Invoke an endpoint
api.feeds/delete(
	# feedId: String = ""   Eg: feedId_example
	# Unique identifier of a feed.
	feedId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "feeds/delete", response)
		assert(response.data is CatalogsFeed)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **feeds/get**   { #feeds/get }
<a name="feeds/get"></a>

> `feeds/get(feedId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

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
var api = CatalogFeedsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogFeedsApi.new(config, client)


# Invoke an endpoint
api.feeds/get(
	# feedId: String = ""   Eg: feedId_example
	# Unique identifier of a feed.
	feedId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "feeds/get", response)
		assert(response.data is CatalogsFeed)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **feeds/ingest**   { #feeds/ingest }
<a name="feeds/ingest"></a>

> `feeds/ingest(feedId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Ingest feed items

Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
var api = CatalogFeedsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogFeedsApi.new(config, client)


# Invoke an endpoint
api.feeds/ingest(
	# feedId: String = ""   Eg: feedId_example
	# Unique identifier of a feed.
	feedId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "feeds/ingest", response)
		assert(response.data is CatalogsFeedIngestion)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **feeds/list**   { #feeds/list }
<a name="feeds/list"></a>

> `feeds/list(catalogId = "",adAccountId = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

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
var api = CatalogFeedsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogFeedsApi.new(config, client)


# Invoke an endpoint
api.feeds/list(
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
		prints("Success!", "feeds/list", response)
		assert(response.data is feeds_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **feeds/update**   { #feeds/update }
<a name="feeds/update"></a>

> `feeds/update(feedId: String,catalogsFeedUpdateRequestSchema: CatalogsFeedUpdateRequestSchema,adAccountId = "", on_success: Callable, on_failure: Callable)`

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
var api = CatalogFeedsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogFeedsApi.new(config, client)

var catalogsFeedUpdateRequestSchema = CatalogsFeedUpdateRequestSchema.new()
# … fill model catalogsFeedUpdateRequestSchema with data

# Invoke an endpoint
api.feeds/update(
	# feedId: String = ""   Eg: feedId_example
	# Unique identifier of a feed.
	feedId,
	# catalogsFeedUpdateRequestSchema: CatalogsFeedUpdateRequestSchema
	catalogsFeedUpdateRequestSchema,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "feeds/update", response)
		assert(response.data is CatalogsFeed)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **items_issues/list**   { #items_issues/list }
<a name="items_issues/list"></a>

> `items_issues/list(processingResultId: String,itemNumbers = null,itemValidationIssue = null,adAccountId = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List item issues

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)

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
var api = CatalogFeedsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogFeedsApi.new(config, client)


# Invoke an endpoint
api.items_issues/list(
	# processingResultId: String = ""   Eg: processingResultId_example
	# Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
	processingResultId,
	# itemNumbers: Array
	# Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
	itemNumbers,
	# itemValidationIssue: CatalogsItemValidationIssue
	# Filter item validation issues that have a given type of item validation issue.
	itemValidationIssue,
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
		prints("Success!", "items_issues/list", response)
		assert(response.data is items_issues_list_200_response)
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

