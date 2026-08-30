<a name="__pageTop"></a>
# AdsApi   { #AdsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_previews/create**](#ad_previews/create) | **POST** `/ad_accounts/{ad_account_id}/ad_previews` | Create ad preview with pin or image
[**ad_targeting_analytics/get**](#ad_targeting_analytics/get) | **GET** `/ad_accounts/{ad_account_id}/ads/targeting_analytics` | Get targeting analytics for ads
[**ads/analytics**](#ads/analytics) | **GET** `/ad_accounts/{ad_account_id}/ads/analytics` | Get ad analytics
[**ads/create**](#ads/create) | **POST** `/ad_accounts/{ad_account_id}/ads` | Create ads
[**ads/get**](#ads/get) | **GET** `/ad_accounts/{ad_account_id}/ads/{ad_id}` | Get ad
[**ads/list**](#ads/list) | **GET** `/ad_accounts/{ad_account_id}/ads` | List ads
[**ads/update**](#ads/update) | **PATCH** `/ad_accounts/{ad_account_id}/ads` | Update ads
[**campaign_ad_preview/create**](#campaign_ad_preview/create) | **POST** `/ad_accounts/{ad_account_id}/campaign_ad_preview` | Create ad preview records for one or more ad groups
[**campaign_ad_preview/delete**](#campaign_ad_preview/delete) | **DELETE** `/ad_accounts/{ad_account_id}/campaign_ad_preview` | Delete ad preview records for one or more ad groups
[**campaign_ad_preview/read**](#campaign_ad_preview/read) | **GET** `/ad_accounts/{ad_account_id}/campaign_ad_preview` | Fetch ad preview records for one or more ad groups

# **ad_previews/create**   { #ad_previews/create }
<a name="ad_previews/create"></a>

> `ad_previews/create(adAccountId: String,adPreviewRequest: AdPreviewRequest, on_success: Callable, on_failure: Callable)`

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

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
var api = AdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdsApi.new(config, client)

var adPreviewRequest = AdPreviewRequest.new()
# … fill model adPreviewRequest with data

# Invoke an endpoint
api.ad_previews/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adPreviewRequest: AdPreviewRequest
	adPreviewRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_previews/create", response)
		assert(response.data is AdPreviewURLResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_targeting_analytics/get**   { #ad_targeting_analytics/get }
<a name="ad_targeting_analytics/get"></a>

> `ad_targeting_analytics/get(adAccountId: String,adIds: Array,startDate: String,endDate: String,targetingTypes: Array,columns: Array,granularity: Granularity,clickWindowDays = null,engagementWindowDays = null,viewWindowDays = null,conversionReportTime = null,attributionTypes = null,reportingTimezone = null,sortColumns = null,sortAscending = null, on_success: Callable, on_failure: Callable)`

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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
var api = AdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdsApi.new(config, client)


# Invoke an endpoint
api.ad_targeting_analytics/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adIds: Array
	# List of Ad Ids to use to filter the results.
	adIds,
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# targetingTypes: Array
	# Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
	targetingTypes,
	# columns: Array
	# Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	columns,
	# granularity: Granularity
	#   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	granularity,
	# clickWindowDays: ConversionAttributionWindowDays
	# Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	clickWindowDays,
	# engagementWindowDays: ConversionAttributionWindowDays
	# Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
	engagementWindowDays,
	# viewWindowDays: ConversionAttributionWindowDays
	# Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
	viewWindowDays,
	# conversionReportTime: ConversionReportTimeType
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
		prints("Success!", "ad_targeting_analytics/get", response)
		assert(response.data is MetricsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ads/analytics**   { #ads/analytics }
<a name="ads/analytics"></a>

> `ads/analytics(startDate: String,endDate: String,columns: Array,granularity: Granularity,adAccountId: String,pinIds = null,adIds = null,clickWindowDays = 30,engagementWindowDays = 30,viewWindowDays = 1,conversionReportTime = "TIME_OF_AD_ACTION",campaignIds = null,reportingTimezone = null, on_success: Callable, on_failure: Callable)`

Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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
var api = AdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdsApi.new(config, client)


# Invoke an endpoint
api.ads/analytics(
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# columns: Array
	# Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	columns,
	# granularity: Granularity
	#   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	granularity,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# pinIds: Array
	# List of Pin IDs.
	pinIds,
	# adIds: Array
	# List of Ad Ids to use to filter the results.
	adIds,
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
	# campaignIds: Array
	# List of Campaign Ids to use to filter the results.
	campaignIds,
	# reportingTimezone: ReportingTimeZone
	# Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
	reportingTimezone,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ads/analytics", response)
		assert(response.data is AdsAnalytics)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ads/create**   { #ads/create }
<a name="ads/create"></a>

> `ads/create(adAccountId: String,adCreate: Array, on_success: Callable, on_failure: Callable)`

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

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
var api = AdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdsApi.new(config, client)


# Invoke an endpoint
api.ads/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adCreate: Array
	adCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ads/create", response)
		assert(response.data is AdBatchWriteResponseModel)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ads/get**   { #ads/get }
<a name="ads/get"></a>

> `ads/get(adId: String,adAccountId: String, on_success: Callable, on_failure: Callable)`

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

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
var api = AdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdsApi.new(config, client)


# Invoke an endpoint
api.ads/get(
	# adId: String = ""   Eg: adId_example
	# The ID of this ad.
	adId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ads/get", response)
		assert(response.data is Ad)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ads/list**   { #ads/list }
<a name="ads/list"></a>

> `ads/list(adAccountId: String,bookmark = "",pageSize = 25,order = null,campaignIds = null,adGroupIds = null,adIds = null,entityStatuses = ["ACTIVE","PAUSED"], on_success: Callable, on_failure: Callable)`

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

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
var api = AdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdsApi.new(config, client)


# Invoke an endpoint
api.ads/list(
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
	# adIds: Array
	# List of Ad Ids to use to filter the results.
	adIds,
	# entityStatuses: Array = ["ACTIVE","PAUSED"]
	# Entity status
	entityStatuses,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ads/list", response)
		assert(response.data is ads_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ads/update**   { #ads/update }
<a name="ads/update"></a>

> `ads/update(adAccountId: String,adBatchUpdate: Array, on_success: Callable, on_failure: Callable)`

Update ads

Update multiple existing ads

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
var api = AdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdsApi.new(config, client)


# Invoke an endpoint
api.ads/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adBatchUpdate: Array
	adBatchUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ads/update", response)
		assert(response.data is AdBatchWriteResponseModel)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **campaign_ad_preview/create**   { #campaign_ad_preview/create }
<a name="campaign_ad_preview/create"></a>

> `campaign_ad_preview/create(adAccountId: String,campaignAdPreviewCreate: Array, on_success: Callable, on_failure: Callable)`

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

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
var api = AdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdsApi.new(config, client)


# Invoke an endpoint
api.campaign_ad_preview/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# campaignAdPreviewCreate: Array
	campaignAdPreviewCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "campaign_ad_preview/create", response)
		assert(response.data is campaign_ad_preview_create_200_response_inner)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **campaign_ad_preview/delete**   { #campaign_ad_preview/delete }
<a name="campaign_ad_preview/delete"></a>

> `campaign_ad_preview/delete(adGroupIds: Array,adAccountId: String, on_success: Callable, on_failure: Callable)`

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

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
var api = AdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdsApi.new(config, client)


# Invoke an endpoint
api.campaign_ad_preview/delete(
	# adGroupIds: Array
	# List of Ad group Ids to use to filter the results.
	adGroupIds,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "campaign_ad_preview/delete", response)
		assert(response.data is campaign_ad_preview_delete_200_response_inner)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **campaign_ad_preview/read**   { #campaign_ad_preview/read }
<a name="campaign_ad_preview/read"></a>

> `campaign_ad_preview/read(adGroupIds: Array,adAccountId: String, on_success: Callable, on_failure: Callable)`

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

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
var api = AdsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdsApi.new(config, client)


# Invoke an endpoint
api.campaign_ad_preview/read(
	# adGroupIds: Array
	# List of Ad group Ids to use to filter the results.
	adGroupIds,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "campaign_ad_preview/read", response)
		assert(response.data is CampaignAdPreview)
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

