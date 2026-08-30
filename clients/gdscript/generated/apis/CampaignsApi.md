<a name="__pageTop"></a>
# CampaignsApi   { #CampaignsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_pins/analytics**](#ad_pins/analytics) | **GET** `/ad_accounts/{ad_account_id}/pins/analytics` | Get pins analytics
[**campaign_targeting_analytics/get**](#campaign_targeting_analytics/get) | **GET** `/ad_accounts/{ad_account_id}/campaigns/targeting_analytics` | Get targeting analytics for campaigns
[**campaigns/analytics**](#campaigns/analytics) | **GET** `/ad_accounts/{ad_account_id}/campaigns/analytics` | Get campaign analytics
[**campaigns/create**](#campaigns/create) | **POST** `/ad_accounts/{ad_account_id}/campaigns` | Create campaigns
[**campaigns/get**](#campaigns/get) | **GET** `/ad_accounts/{ad_account_id}/campaigns/{campaign_id}` | Get campaign
[**campaigns/list**](#campaigns/list) | **GET** `/ad_accounts/{ad_account_id}/campaigns` | List campaigns
[**campaigns/update**](#campaigns/update) | **PATCH** `/ad_accounts/{ad_account_id}/campaigns` | Update campaigns
[**get_campaign_delivery_estimates**](#get_campaign_delivery_estimates) | **POST** `/ad_accounts/{ad_account_id}/campaigns/delivery_estimates` | Get campaign delivery estimates

# **ad_pins/analytics**   { #ad_pins/analytics }
<a name="ad_pins/analytics"></a>

> `ad_pins/analytics(campaignId: String,pinIds: Array,startDate: String,endDate: String,columns: Array,granularity: Granularity,adAccountId: String,clickWindowDays = 30,engagementWindowDays = 30,viewWindowDays = 1,conversionReportTime = "TIME_OF_AD_ACTION", on_success: Callable, on_failure: Callable)`

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

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
var api = CampaignsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CampaignsApi.new(config, client)


# Invoke an endpoint
api.ad_pins/analytics(
	# campaignId: String = ""   Eg: campaignId_example
	# Campaign Id to use to filter the results.
	campaignId,
	# pinIds: Array
	# List of Pin IDs.
	pinIds,
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
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_pins/analytics", response)
		assert(response.data is AdPinAnalytics)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **campaign_targeting_analytics/get**   { #campaign_targeting_analytics/get }
<a name="campaign_targeting_analytics/get"></a>

> `campaign_targeting_analytics/get(adAccountId: String,campaignIds: Array,startDate: String,endDate: String,targetingTypes: Array,columns: Array,granularity: Granularity,clickWindowDays = 30,engagementWindowDays = 30,viewWindowDays = 1,conversionReportTime = "TIME_OF_AD_ACTION",attributionTypes = null,reportingTimezone = null, on_success: Callable, on_failure: Callable)`

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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
var api = CampaignsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CampaignsApi.new(config, client)


# Invoke an endpoint
api.campaign_targeting_analytics/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# campaignIds: Array
	# List of Campaign Ids to use to filter the results.
	campaignIds,
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
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "campaign_targeting_analytics/get", response)
		assert(response.data is MetricsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **campaigns/analytics**   { #campaigns/analytics }
<a name="campaigns/analytics"></a>

> `campaigns/analytics(startDate: String,endDate: String,campaignIds: Array,columns: Array,granularity: Granularity,adAccountId: String,clickWindowDays = 30,engagementWindowDays = 30,viewWindowDays = 1,conversionReportTime = "TIME_OF_AD_ACTION",aggregateReportRows = false,reportingTimezone = null, on_success: Callable, on_failure: Callable)`

Get campaign analytics

Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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
var api = CampaignsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CampaignsApi.new(config, client)


# Invoke an endpoint
api.campaigns/analytics(
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# campaignIds: Array
	# List of Campaign Ids to use to filter the results.
	campaignIds,
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
		prints("Success!", "campaigns/analytics", response)
		assert(response.data is CampaignsAnalyticsMetrics)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **campaigns/create**   { #campaigns/create }
<a name="campaigns/create"></a>

> `campaigns/create(adAccountId: String,campaignCreateItem: Array, on_success: Callable, on_failure: Callable)`

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

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
var api = CampaignsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CampaignsApi.new(config, client)


# Invoke an endpoint
api.campaigns/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# campaignCreateItem: Array
	campaignCreateItem,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "campaigns/create", response)
		assert(response.data is CampaignBatchWriteResponseModel)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **campaigns/get**   { #campaigns/get }
<a name="campaigns/get"></a>

> `campaigns/get(campaignId: String,adAccountId: String, on_success: Callable, on_failure: Callable)`

Get campaign

Get a specific campaign given the campaign ID.

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
var api = CampaignsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CampaignsApi.new(config, client)


# Invoke an endpoint
api.campaigns/get(
	# campaignId: String = ""   Eg: campaignId_example
	# Campaign ID, must be associated with the ad account ID provided in the path.
	campaignId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "campaigns/get", response)
		assert(response.data is Campaign)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **campaigns/list**   { #campaigns/list }
<a name="campaigns/list"></a>

> `campaigns/list(adAccountId: String,bookmark = "",pageSize = 25,order = null,campaignIds = null,entityStatuses = ["ACTIVE","PAUSED"], on_success: Callable, on_failure: Callable)`

List campaigns

Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

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
var api = CampaignsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CampaignsApi.new(config, client)


# Invoke an endpoint
api.campaigns/list(
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
	# entityStatuses: Array = ["ACTIVE","PAUSED"]
	# Entity status
	entityStatuses,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "campaigns/list", response)
		assert(response.data is campaigns_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **campaigns/update**   { #campaigns/update }
<a name="campaigns/update"></a>

> `campaigns/update(adAccountId: String,campaignBatchUpdateItem: Array, on_success: Callable, on_failure: Callable)`

Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

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
var api = CampaignsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CampaignsApi.new(config, client)


# Invoke an endpoint
api.campaigns/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# campaignBatchUpdateItem: Array
	campaignBatchUpdateItem,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "campaigns/update", response)
		assert(response.data is CampaignBatchWriteResponseModel)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_campaign_delivery_estimates**   { #get_campaign_delivery_estimates }
<a name="get_campaign_delivery_estimates"></a>

> `get_campaign_delivery_estimates(adAccountId: String,campaignDeliveryEstimatesCampaign: Array, on_success: Callable, on_failure: Callable)`

Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

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
var api = CampaignsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CampaignsApi.new(config, client)


# Invoke an endpoint
api.get_campaign_delivery_estimates(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# campaignDeliveryEstimatesCampaign: Array
	campaignDeliveryEstimatesCampaign,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_campaign_delivery_estimates", response)
		assert(response.data is CampaignDeliveryEstimatesResponse)
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

