<a name="__pageTop"></a>
# AdAccountsApi   { #AdAccountsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account/analytics**](#ad_account/analytics) | **GET** `/ad_accounts/{ad_account_id}/analytics` | Get ad account analytics
[**ad_account_targeting_analytics/get**](#ad_account_targeting_analytics/get) | **GET** `/ad_accounts/{ad_account_id}/targeting_analytics` | Get targeting analytics for an ad account
[**ad_accounts/create**](#ad_accounts/create) | **POST** `/ad_accounts` | Create ad account
[**ad_accounts/get**](#ad_accounts/get) | **GET** `/ad_accounts/{ad_account_id}` | Get ad account
[**ad_accounts/list**](#ad_accounts/list) | **GET** `/ad_accounts` | List ad accounts
[**analytics/create_conversion_product_report**](#analytics/create_conversion_product_report) | **POST** `/ad_accounts/{ad_account_id}/reports/brand_category_sku` | Create a request for a brand, category, SKU report
[**analytics/create_mmm_report**](#analytics/create_mmm_report) | **POST** `/ad_accounts/{ad_account_id}/mmm_reports` | Create a request for a Marketing Mix Modeling (MMM) report
[**analytics/create_report**](#analytics/create_report) | **POST** `/ad_accounts/{ad_account_id}/reports` | Create async request for an account analytics report
[**analytics/create_template_report**](#analytics/create_template_report) | **POST** `/ad_accounts/{ad_account_id}/templates/{template_id}/reports` | Create async request for an analytics report using a template
[**analytics/get_conversion_product_report**](#analytics/get_conversion_product_report) | **GET** `/ad_accounts/{ad_account_id}/reports/brand_category_sku` | Get advertiser brand, category, SKU report
[**analytics/get_mmm_report**](#analytics/get_mmm_report) | **GET** `/ad_accounts/{ad_account_id}/mmm_reports` | Get advertiser Marketing Mix Modeling (MMM) report.
[**analytics/get_report**](#analytics/get_report) | **GET** `/ad_accounts/{ad_account_id}/reports` | Get the account analytics report created by the async call
[**sandbox/delete**](#sandbox/delete) | **DELETE** `/ad_accounts/{ad_account_id}/sandbox` | Delete ads data for ad account in API Sandbox
[**templates/list**](#templates/list) | **GET** `/ad_accounts/{ad_account_id}/templates` | List templates

# **ad_account/analytics**   { #ad_account/analytics }
<a name="ad_account/analytics"></a>

> `ad_account/analytics(startDate: String,endDate: String,columns: Array,granularity: Granularity,adAccountId: String,clickWindowDays = 30,engagementWindowDays = 30,viewWindowDays = 1,conversionReportTime = "TIME_OF_AD_ACTION",reportingTimezone = null, on_success: Callable, on_failure: Callable)`

Get ad account analytics

  Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)


# Invoke an endpoint
api.ad_account/analytics(
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
	# reportingTimezone: ReportingTimeZone
	# Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
	reportingTimezone,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_account/analytics", response)
		assert(response.data is AdAccountAnalyticsItems)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_account_targeting_analytics/get**   { #ad_account_targeting_analytics/get }
<a name="ad_account_targeting_analytics/get"></a>

> `ad_account_targeting_analytics/get(adAccountId: String,startDate: String,endDate: String,targetingTypes: Array,columns: Array,granularity: Granularity,clickWindowDays = 30,engagementWindowDays = 30,viewWindowDays = 1,conversionReportTime = "TIME_OF_AD_ACTION",attributionTypes = null,reportingTimezone = null, on_success: Callable, on_failure: Callable)`

Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)


# Invoke an endpoint
api.ad_account_targeting_analytics/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
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
		prints("Success!", "ad_account_targeting_analytics/get", response)
		assert(response.data is MetricsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_accounts/create**   { #ad_accounts/create }
<a name="ad_accounts/create"></a>

> `ad_accounts/create(adAccountCreate: AdAccountCreate, on_success: Callable, on_failure: Callable)`

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)

var adAccountCreate = AdAccountCreate.new()
# … fill model adAccountCreate with data

# Invoke an endpoint
api.ad_accounts/create(
	# adAccountCreate: AdAccountCreate
	adAccountCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_accounts/create", response)
		assert(response.data is AdAccount)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_accounts/get**   { #ad_accounts/get }
<a name="ad_accounts/get"></a>

> `ad_accounts/get(adAccountId: String, on_success: Callable, on_failure: Callable)`

Get ad account

Get an ad account

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)


# Invoke an endpoint
api.ad_accounts/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_accounts/get", response)
		assert(response.data is AdAccount)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ad_accounts/list**   { #ad_accounts/list }
<a name="ad_accounts/list"></a>

> `ad_accounts/list(includeSharedAccounts = true,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)


# Invoke an endpoint
api.ad_accounts/list(
	# includeSharedAccounts: bool = true   Eg: true
	# Include shared ad accounts
	includeSharedAccounts,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ad_accounts/list", response)
		assert(response.data is ad_accounts_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **analytics/create_conversion_product_report**   { #analytics/create_conversion_product_report }
<a name="analytics/create_conversion_product_report"></a>

> `analytics/create_conversion_product_report(adAccountId: String,conversionProductReportCreate: ConversionProductReportCreate, on_success: Callable, on_failure: Callable)`

Create a request for a brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)

var conversionProductReportCreate = ConversionProductReportCreate.new()
# … fill model conversionProductReportCreate with data

# Invoke an endpoint
api.analytics/create_conversion_product_report(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# conversionProductReportCreate: ConversionProductReportCreate
	conversionProductReportCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "analytics/create_conversion_product_report", response)
		assert(response.data is ConversionProductReport)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **analytics/create_mmm_report**   { #analytics/create_mmm_report }
<a name="analytics/create_mmm_report"></a>

> `analytics/create_mmm_report(adAccountId: String,mMMReportCreate: MMMReportCreate, on_success: Callable, on_failure: Callable)`

Create a request for a Marketing Mix Modeling (MMM) report

    This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it's in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we'll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)

var mMMReportCreate = MMMReportCreate.new()
# … fill model mMMReportCreate with data

# Invoke an endpoint
api.analytics/create_mmm_report(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# mMMReportCreate: MMMReportCreate
	mMMReportCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "analytics/create_mmm_report", response)
		assert(response.data is MMMReport)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **analytics/create_report**   { #analytics/create_report }
<a name="analytics/create_report"></a>

> `analytics/create_report(adAccountId: String,adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest, on_success: Callable, on_failure: Callable)`

Create async request for an account analytics report

  This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)

var adsAnalyticsCreateAsyncRequest = AdsAnalyticsCreateAsyncRequest.new()
# … fill model adsAnalyticsCreateAsyncRequest with data

# Invoke an endpoint
api.analytics/create_report(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest
	adsAnalyticsCreateAsyncRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "analytics/create_report", response)
		assert(response.data is AdsAnalyticsCreateAsyncResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **analytics/create_template_report**   { #analytics/create_template_report }
<a name="analytics/create_template_report"></a>

> `analytics/create_template_report(adAccountId: String,templateId: String,startDate = null,endDate = null,granularity = null, on_success: Callable, on_failure: Callable)`

Create async request for an analytics report using a template

  This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)


# Invoke an endpoint
api.analytics/create_template_report(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# templateId: String = ""   Eg: templateId_example
	# Unique identifier of a template.
	templateId,
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
	endDate,
	# granularity: Granularity
	#   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	granularity,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "analytics/create_template_report", response)
		assert(response.data is TemplateBasedReport)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **analytics/get_conversion_product_report**   { #analytics/get_conversion_product_report }
<a name="analytics/get_conversion_product_report"></a>

> `analytics/get_conversion_product_report(adAccountId: String,token: String, on_success: Callable, on_failure: Callable)`

Get advertiser brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)


# Invoke an endpoint
api.analytics/get_conversion_product_report(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# token: String = ""   Eg: token_example
	# Token returned from the post request creation call
	token,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "analytics/get_conversion_product_report", response)
		assert(response.data is ConversionProductReport)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **analytics/get_mmm_report**   { #analytics/get_mmm_report }
<a name="analytics/get_mmm_report"></a>

> `analytics/get_mmm_report(adAccountId: String,token: String, on_success: Callable, on_failure: Callable)`

Get advertiser Marketing Mix Modeling (MMM) report.

    Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)


# Invoke an endpoint
api.analytics/get_mmm_report(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# token: String = ""   Eg: token_example
	# Token returned from the post request creation call
	token,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "analytics/get_mmm_report", response)
		assert(response.data is MMMReport)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **analytics/get_report**   { #analytics/get_report }
<a name="analytics/get_report"></a>

> `analytics/get_report(adAccountId: String,token: String, on_success: Callable, on_failure: Callable)`

Get the account analytics report created by the async call

  This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)


# Invoke an endpoint
api.analytics/get_report(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# token: String = ""   Eg: token_example
	# Token returned from the post request creation call
	token,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "analytics/get_report", response)
		assert(response.data is AdsAnalyticsGetAsyncResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **sandbox/delete**   { #sandbox/delete }
<a name="sandbox/delete"></a>

> `sandbox/delete(adAccountId: String, on_success: Callable, on_failure: Callable)`

Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)


# Invoke an endpoint
api.sandbox/delete(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "sandbox/delete", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **templates/list**   { #templates/list }
<a name="templates/list"></a>

> `templates/list(adAccountId: String,bookmark = "",pageSize = 25,order = null, on_success: Callable, on_failure: Callable)`

List templates

Gets all Templates associated with an ad account ID.

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
var api = AdAccountsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AdAccountsApi.new(config, client)


# Invoke an endpoint
api.templates/list(
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
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "templates/list", response)
		assert(response.data is templates_list_200_response)
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

