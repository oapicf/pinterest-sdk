<a name="__pageTop"></a>
# AdGroupsApi   { #AdGroupsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_groups/analytics**](#ad_groups/analytics) | **GET** `/ad_accounts/{ad_account_id}/ad_groups/analytics` | Get ad group analytics
[**ad_groups/audience_sizing**](#ad_groups/audience_sizing) | **POST** `/ad_accounts/{ad_account_id}/ad_groups/audience_sizing` | Get audience sizing
[**ad_groups/create**](#ad_groups/create) | **POST** `/ad_accounts/{ad_account_id}/ad_groups` | Create ad groups
[**ad_groups/get**](#ad_groups/get) | **GET** `/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}` | Get ad group
[**ad_groups/list**](#ad_groups/list) | **GET** `/ad_accounts/{ad_account_id}/ad_groups` | List ad groups
[**ad_groups/update**](#ad_groups/update) | **PATCH** `/ad_accounts/{ad_account_id}/ad_groups` | Update ad groups
[**ad_groups_bid_floor/get**](#ad_groups_bid_floor/get) | **POST** `/ad_accounts/{ad_account_id}/bid_floor` | Get bid floors
[**ad_groups_dynamic_titles/download_csv**](#ad_groups_dynamic_titles/download_csv) | **GET** `/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv` | Get dynamic titles CSV download URL
[**ad_groups_dynamic_titles/get_status**](#ad_groups_dynamic_titles/get_status) | **GET** `/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status` | Get dynamic titles status
[**ad_groups_dynamic_titles/get_upload_url**](#ad_groups_dynamic_titles/get_upload_url) | **GET** `/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads` | Get dynamic titles upload URL
[**ad_groups_dynamic_titles/process_csv**](#ad_groups_dynamic_titles/process_csv) | **POST** `/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles` | Process dynamic titles CSV
[**ad_groups_targeting_analytics/get**](#ad_groups_targeting_analytics/get) | **GET** `/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics` | Get targeting analytics for ad groups
[**get_ad_groups_by_promotion_ids/list**](#get_ad_groups_by_promotion_ids/list) | **GET** `/ad_accounts/{ad_account_id}/promotion_applied_entities` | List of ad groups using promotions IDs.

# **ad_groups/analytics**   { #ad_groups/analytics }
<a name="ad_groups/analytics"></a>

> `ad_groups/analytics(startDate: String,endDate: String,adGroupIds: Array,columns: Array,granularity: Granularity,adAccountId: String,clickWindowDays = 30,engagementWindowDays = 30,viewWindowDays = 1,conversionReportTime = "TIME_OF_AD_ACTION",aggregateReportRows = false,reportingTimezone = null, on_success: Callable, on_failure: Callable)`

Get ad group analytics

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)


# Invoke an endpoint
api.ad_groups/analytics(
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# adGroupIds: Array
	# List of Ad group Ids to use to filter the results.
	adGroupIds,
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
	# aggregateReportRows: bool = false   Eg: true
	# Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
	aggregateReportRows,
	# reportingTimezone: ReportingTimeZone
	# Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
	reportingTimezone,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups/analytics", response)
		assert(response.data is AdGroupsAnalyticsMetrics)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups/audience_sizing**   { #ad_groups/audience_sizing }
<a name="ad_groups/audience_sizing"></a>

> `ad_groups/audience_sizing(adAccountId: String,adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate, on_success: Callable, on_failure: Callable)`

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)

var adGroupAudienceSizingCreate = AdGroupAudienceSizingCreate.new()
# … fill model adGroupAudienceSizingCreate with data

# Invoke an endpoint
api.ad_groups/audience_sizing(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate
	adGroupAudienceSizingCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups/audience_sizing", response)
		assert(response.data is AdGroupAudienceSizing)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups/create**   { #ad_groups/create }
<a name="ad_groups/create"></a>

> `ad_groups/create(adAccountId: String,adGroupCreateCreate: Array, on_success: Callable, on_failure: Callable)`

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)


# Invoke an endpoint
api.ad_groups/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adGroupCreateCreate: Array
	adGroupCreateCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups/create", response)
		assert(response.data is ad_groups_create_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups/get**   { #ad_groups/get }
<a name="ad_groups/get"></a>

> `ad_groups/get(adGroupId: String,adAccountId: String, on_success: Callable, on_failure: Callable)`

Get ad group

Get a specific ad group given the ad group ID.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)


# Invoke an endpoint
api.ad_groups/get(
	# adGroupId: String = ""   Eg: adGroupId_example
	# Ad group ID.
	adGroupId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups/get", response)
		assert(response.data is AdGroup)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups/list**   { #ad_groups/list }
<a name="ad_groups/list"></a>

> `ad_groups/list(adAccountId: String,bookmark = "",pageSize = 25,order = null,campaignIds = null,adGroupIds = null,entityStatuses = ["ACTIVE","PAUSED"],translateInterestsToNames = false, on_success: Callable, on_failure: Callable)`

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)


# Invoke an endpoint
api.ad_groups/list(
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
	# campaignIds: Array
	# List of Campaign Ids to use to filter the results.
	campaignIds,
	# adGroupIds: Array
	# List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
	adGroupIds,
	# entityStatuses: Array = ["ACTIVE","PAUSED"]
	# Entity status
	entityStatuses,
	# translateInterestsToNames: bool = false   Eg: true
	# Return interests as text names (if value is true) rather than topic IDs.
	translateInterestsToNames,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups/list", response)
		assert(response.data is ad_groups_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups/update**   { #ad_groups/update }
<a name="ad_groups/update"></a>

> `ad_groups/update(adAccountId: String,adGroupUpdateBatchUpdate: Array, on_success: Callable, on_failure: Callable)`

Update ad groups

Update multiple existing ad groups.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)


# Invoke an endpoint
api.ad_groups/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adGroupUpdateBatchUpdate: Array
	adGroupUpdateBatchUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups/update", response)
		assert(response.data is ad_groups_create_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups_bid_floor/get**   { #ad_groups_bid_floor/get }
<a name="ad_groups_bid_floor/get"></a>

> `ad_groups_bid_floor/get(adAccountId: String,bidFloorCreate: BidFloorCreate, on_success: Callable, on_failure: Callable)`

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)

var bidFloorCreate = BidFloorCreate.new()
# … fill model bidFloorCreate with data

# Invoke an endpoint
api.ad_groups_bid_floor/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bidFloorCreate: BidFloorCreate
	bidFloorCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups_bid_floor/get", response)
		assert(response.data is BidFloor)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups_dynamic_titles/download_csv**   { #ad_groups_dynamic_titles/download_csv }
<a name="ad_groups_dynamic_titles/download_csv"></a>

> `ad_groups_dynamic_titles/download_csv(adAccountId: String,adGroupId: String, on_success: Callable, on_failure: Callable)`

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)


# Invoke an endpoint
api.ad_groups_dynamic_titles/download_csv(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adGroupId: String = ""   Eg: adGroupId_example
	# Ad group ID.
	adGroupId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups_dynamic_titles/download_csv", response)
		assert(response.data is DynamicTitlesDownloadCSV)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups_dynamic_titles/get_status**   { #ad_groups_dynamic_titles/get_status }
<a name="ad_groups_dynamic_titles/get_status"></a>

> `ad_groups_dynamic_titles/get_status(adAccountId: String,adGroupId: String, on_success: Callable, on_failure: Callable)`

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)


# Invoke an endpoint
api.ad_groups_dynamic_titles/get_status(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adGroupId: String = ""   Eg: adGroupId_example
	# Ad group ID.
	adGroupId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups_dynamic_titles/get_status", response)
		assert(response.data is DynamicTitlesGetStatus)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups_dynamic_titles/get_upload_url**   { #ad_groups_dynamic_titles/get_upload_url }
<a name="ad_groups_dynamic_titles/get_upload_url"></a>

> `ad_groups_dynamic_titles/get_upload_url(adAccountId: String,adGroupId: String, on_success: Callable, on_failure: Callable)`

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)


# Invoke an endpoint
api.ad_groups_dynamic_titles/get_upload_url(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adGroupId: String = ""   Eg: adGroupId_example
	# Ad group ID.
	adGroupId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups_dynamic_titles/get_upload_url", response)
		assert(response.data is DynamicTitlesUploadURL)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups_dynamic_titles/process_csv**   { #ad_groups_dynamic_titles/process_csv }
<a name="ad_groups_dynamic_titles/process_csv"></a>

> `ad_groups_dynamic_titles/process_csv(adAccountId: String,adGroupId: String,dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate, on_success: Callable, on_failure: Callable)`

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)

var dynamicTitlesProcessCSVCreate = DynamicTitlesProcessCSVCreate.new()
# … fill model dynamicTitlesProcessCSVCreate with data

# Invoke an endpoint
api.ad_groups_dynamic_titles/process_csv(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adGroupId: String = ""   Eg: adGroupId_example
	# Ad group ID.
	adGroupId,
	# dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate
	dynamicTitlesProcessCSVCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups_dynamic_titles/process_csv", response)
		assert(response.data is DynamicTitlesProcessCSV)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_groups_targeting_analytics/get**   { #ad_groups_targeting_analytics/get }
<a name="ad_groups_targeting_analytics/get"></a>

> `ad_groups_targeting_analytics/get(adAccountId: String,adGroupIds: Array,startDate: String,endDate: String,targetingTypes: Array,columns: Array,granularity: Granularity,clickWindowDays = 30,engagementWindowDays = 30,viewWindowDays = 1,conversionReportTime = "TIME_OF_AD_ACTION",attributionTypes = null,reportingTimezone = null,sortColumns = null,sortAscending = null, on_success: Callable, on_failure: Callable)`

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)


# Invoke an endpoint
api.ad_groups_targeting_analytics/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adGroupIds: Array
	# List of Ad group Ids to use to filter the results.
	adGroupIds,
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# targetingTypes: Array
	# Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
	targetingTypes,
	# columns: Array
	# Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	columns,
	# granularity: Granularity
	#   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	granularity,
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
	# attributionTypes: Array
	# List of types of attribution for the conversion report
	attributionTypes,
	# reportingTimezone: ReportingTimeZone
	# Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
	reportingTimezone,
	# sortColumns: Array
	# Sort Columns.
	sortColumns,
	# sortAscending: bool   Eg: true
	# Sort ascending.
	sortAscending,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_groups_targeting_analytics/get", response)
		assert(response.data is MetricsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_ad_groups_by_promotion_ids/list**   { #get_ad_groups_by_promotion_ids/list }
<a name="get_ad_groups_by_promotion_ids/list"></a>

> `get_ad_groups_by_promotion_ids/list(adAccountId: String,promotionIds: Array,bookmark = "",pageSize = 25,order = null, on_success: Callable, on_failure: Callable)`

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

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
var api = AdGroupsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdGroupsApi.new(config, client)


# Invoke an endpoint
api.get_ad_groups_by_promotion_ids/list(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# promotionIds: Array
	# List of Promotion IDs to use to filter the results.
	promotionIds,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# order: PinterestLibPaginationOrder
	# The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
	order,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_ad_groups_by_promotion_ids/list", response)
		assert(response.data is ad_groups_list_200_response)
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

