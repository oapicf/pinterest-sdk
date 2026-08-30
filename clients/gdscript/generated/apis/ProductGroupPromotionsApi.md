<a name="__pageTop"></a>
# ProductGroupPromotionsApi   { #ProductGroupPromotionsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**product_group_promotions/create**](#product_group_promotions/create) | **POST** `/ad_accounts/{ad_account_id}/product_group_promotions` | Create product group promotions
[**product_group_promotions/get**](#product_group_promotions/get) | **GET** `/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}` | Get a product group promotion by id
[**product_group_promotions/list**](#product_group_promotions/list) | **GET** `/ad_accounts/{ad_account_id}/product_group_promotions` | Get product group promotions
[**product_group_promotions/update**](#product_group_promotions/update) | **PATCH** `/ad_accounts/{ad_account_id}/product_group_promotions` | Update product group promotions
[**product_groups/analytics**](#product_groups/analytics) | **GET** `/ad_accounts/{ad_account_id}/product_groups/analytics` | Get product group analytics

# **product_group_promotions/create**   { #product_group_promotions/create }
<a name="product_group_promotions/create"></a>

> `product_group_promotions/create(adAccountId: String,productGroupPromotionsCreate: ProductGroupPromotionsCreate, on_success: Callable, on_failure: Callable)`

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

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
var api = ProductGroupPromotionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProductGroupPromotionsApi.new(config, client)

var productGroupPromotionsCreate = ProductGroupPromotionsCreate.new()
# … fill model productGroupPromotionsCreate with data

# Invoke an endpoint
api.product_group_promotions/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# productGroupPromotionsCreate: ProductGroupPromotionsCreate
	productGroupPromotionsCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "product_group_promotions/create", response)
		assert(response.data is ProductGroupPromotions)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **product_group_promotions/get**   { #product_group_promotions/get }
<a name="product_group_promotions/get"></a>

> `product_group_promotions/get(adAccountId: String,productGroupPromotionId: String, on_success: Callable, on_failure: Callable)`

Get a product group promotion by id

Get a product group promotion by id

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
var api = ProductGroupPromotionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProductGroupPromotionsApi.new(config, client)


# Invoke an endpoint
api.product_group_promotions/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# productGroupPromotionId: String = ""   Eg: productGroupPromotionId_example
	# Unique identifier of a product group promotion
	productGroupPromotionId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "product_group_promotions/get", response)
		assert(response.data is ProductGroupPromotion)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **product_group_promotions/list**   { #product_group_promotions/list }
<a name="product_group_promotions/list"></a>

> `product_group_promotions/list(adAccountId: String,bookmark = "",pageSize = 25,order = null,productGroupPromotionIds = null,entityStatuses = ["ACTIVE","PAUSED"],adGroupId = "", on_success: Callable, on_failure: Callable)`

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

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
var api = ProductGroupPromotionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProductGroupPromotionsApi.new(config, client)


# Invoke an endpoint
api.product_group_promotions/list(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# order: PinterestLibPaginationOrder
	# The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
	order,
	# productGroupPromotionIds: Array
	# List of Product group promotion Ids.
	productGroupPromotionIds,
	# entityStatuses: Array = ["ACTIVE","PAUSED"]
	# Entity status
	entityStatuses,
	# adGroupId: String = ""   Eg: adGroupId_example
	# Ad group Id.
	adGroupId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "product_group_promotions/list", response)
		assert(response.data is product_group_promotions_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **product_group_promotions/update**   { #product_group_promotions/update }
<a name="product_group_promotions/update"></a>

> `product_group_promotions/update(adAccountId: String,productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody, on_success: Callable, on_failure: Callable)`

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

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
var api = ProductGroupPromotionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProductGroupPromotionsApi.new(config, client)

var productGroupPromotionsUpdateWithRequiredBody = ProductGroupPromotionsUpdateWithRequiredBody.new()
# … fill model productGroupPromotionsUpdateWithRequiredBody with data

# Invoke an endpoint
api.product_group_promotions/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody
	productGroupPromotionsUpdateWithRequiredBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "product_group_promotions/update", response)
		assert(response.data is ProductGroupPromotions)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **product_groups/analytics**   { #product_groups/analytics }
<a name="product_groups/analytics"></a>

> `product_groups/analytics(startDate: String,endDate: String,productGroupIds: Array,columns: Array,granularity: Granularity,adAccountId: String,clickWindowDays = 30,engagementWindowDays = 30,viewWindowDays = 1,conversionReportTime = "TIME_OF_AD_ACTION",reportingTimezone = null, on_success: Callable, on_failure: Callable)`

Get product group analytics

Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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
var api = ProductGroupPromotionsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ProductGroupPromotionsApi.new(config, client)


# Invoke an endpoint
api.product_groups/analytics(
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# productGroupIds: Array
	# List of Product group Ids to use to filter the results.
	productGroupIds,
	# columns: Array
	# Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	columns,
	# granularity: Granularity
	#   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	granularity,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# clickWindowDays: float = 30   Eg: 8.14
	# Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	clickWindowDays,
	# engagementWindowDays: float = 30   Eg: 8.14
	# Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
	engagementWindowDays,
	# viewWindowDays: float = 1   Eg: 8.14
	# Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
	viewWindowDays,
	# conversionReportTime: String = "TIME_OF_AD_ACTION"   Eg: conversionReportTime_example
	# The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
	conversionReportTime,
	# reportingTimezone: ReportingTimeZone
	# Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
	reportingTimezone,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "product_groups/analytics", response)
		assert(response.data is ProductGroupAnalyticsItems)
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

