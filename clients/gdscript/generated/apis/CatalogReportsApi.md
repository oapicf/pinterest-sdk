<a name="__pageTop"></a>
# CatalogReportsApi   { #CatalogReportsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reports/create**](#reports/create) | **POST** `/catalogs/reports` | Build catalogs report
[**reports/get**](#reports/get) | **GET** `/catalogs/reports` | Get catalogs report
[**reports/stats**](#reports/stats) | **GET** `/catalogs/reports/stats` | List report stats

# **reports/create**   { #reports/create }
<a name="reports/create"></a>

> `reports/create(catalogsReportParameters: CatalogsReportParameters,adAccountId = "", on_success: Callable, on_failure: Callable)`

Build catalogs report

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.

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
var api = CatalogReportsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogReportsApi.new(config, client)

var catalogsReportParameters = CatalogsReportParameters.new()
# … fill model catalogsReportParameters with data

# Invoke an endpoint
api.reports/create(
	# catalogsReportParameters: CatalogsReportParameters
	catalogsReportParameters,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "reports/create", response)
		assert(response.data is CatalogsCreateReportResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **reports/get**   { #reports/get }
<a name="reports/get"></a>

> `reports/get(token: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get catalogs report

This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

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
var api = CatalogReportsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogReportsApi.new(config, client)


# Invoke an endpoint
api.reports/get(
	# token: String = ""   Eg: token_example
	# Token returned from the post request creation call
	token,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "reports/get", response)
		assert(response.data is CatalogsReport)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **reports/stats**   { #reports/stats }
<a name="reports/stats"></a>

> `reports/stats(parameters: CatalogsReportStatsParameters,adAccountId = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List report stats

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

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
var api = CatalogReportsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CatalogReportsApi.new(config, client)


# Invoke an endpoint
api.reports/stats(
	# parameters: CatalogsReportStatsParameters
	# Contains the parameters for report identification.
	parameters,
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
		prints("Success!", "reports/stats", response)
		assert(response.data is reports_stats_200_response)
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

