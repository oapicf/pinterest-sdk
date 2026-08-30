<a name="__pageTop"></a>
# KeywordsApi   { #KeywordsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**country_keywords_metrics/get**](#country_keywords_metrics/get) | **GET** `/ad_accounts/{ad_account_id}/keywords/metrics` | Get country&#x27;s keyword metrics
[**keywords/create**](#keywords/create) | **POST** `/ad_accounts/{ad_account_id}/keywords` | Create keywords
[**keywords/get**](#keywords/get) | **GET** `/ad_accounts/{ad_account_id}/keywords` | Get keywords
[**keywords/update**](#keywords/update) | **PATCH** `/ad_accounts/{ad_account_id}/keywords` | Update keywords
[**trending_keywords/list**](#trending_keywords/list) | **GET** `/trends/keywords/{region}/top/{trend_type}` | List trending keywords

# **country_keywords_metrics/get**   { #country_keywords_metrics/get }
<a name="country_keywords_metrics/get"></a>

> `country_keywords_metrics/get(adAccountId: String,countryCode: String,keywords: Array, on_success: Callable, on_failure: Callable)`

Get country's keyword metrics

  See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).

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
var api = KeywordsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = KeywordsApi.new(config, client)


# Invoke an endpoint
api.country_keywords_metrics/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# countryCode: String = ""   Eg: countryCode_example
	# Two letter country code (ISO 3166-1 alpha-2)
	countryCode,
	# keywords: Array
	# Comma-separated keywords
	keywords,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "country_keywords_metrics/get", response)
		assert(response.data is KeywordsMetricsArrayResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **keywords/create**   { #keywords/create }
<a name="keywords/create"></a>

> `keywords/create(adAccountId: String,keywordsCreate: KeywordsCreate, on_success: Callable, on_failure: Callable)`

Create keywords

  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }

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
var api = KeywordsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = KeywordsApi.new(config, client)

var keywordsCreate = KeywordsCreate.new()
# … fill model keywordsCreate with data

# Invoke an endpoint
api.keywords/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# keywordsCreate: KeywordsCreate
	keywordsCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "keywords/create", response)
		assert(response.data is Keywords)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **keywords/get**   { #keywords/get }
<a name="keywords/get"></a>

> `keywords/get(adAccountId: String,campaignId = "",adGroupId = "",adGroupIds = null,matchTypes = null,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get keywords

    Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }

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
var api = KeywordsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = KeywordsApi.new(config, client)


# Invoke an endpoint
api.keywords/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# campaignId: String = ""   Eg: campaignId_example
	# Campaign Id to use to filter the results.
	campaignId,
	# adGroupId: String = ""   Eg: adGroupId_example
	# Ad group Id.
	adGroupId,
	# adGroupIds: Array
	# List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
	adGroupIds,
	# matchTypes: Array
	# Keyword [match type](/docs/api-features/targeting-overview/)
	matchTypes,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "keywords/get", response)
		assert(response.data is keywords_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **keywords/update**   { #keywords/update }
<a name="keywords/update"></a>

> `keywords/update(adAccountId: String,keywordsUpdate: KeywordsUpdate, on_success: Callable, on_failure: Callable)`

Update keywords

  Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.

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
var api = KeywordsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = KeywordsApi.new(config, client)

var keywordsUpdate = KeywordsUpdate.new()
# … fill model keywordsUpdate with data

# Invoke an endpoint
api.keywords/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# keywordsUpdate: KeywordsUpdate
	keywordsUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "keywords/update", response)
		assert(response.data is Keywords)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **trending_keywords/list**   { #trending_keywords/list }
<a name="trending_keywords/list"></a>

> `trending_keywords/list(region: TrendsSupportedRegion,trendType: TrendType,interests = null,genders = null,ages = null,includeKeywords = null,normalizeAgainstGroup = false,limit = 50,includeDemographics = false, on_success: Callable, on_failure: Callable)`

List trending keywords

Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).

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
var api = KeywordsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = KeywordsApi.new(config, client)


# Invoke an endpoint
api.trending_keywords/list(
	# region: TrendsSupportedRegion
	#   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia
	region,
	# trendType: TrendType
	#   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
	trendType,
	# interests: Array
	#   The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion
	interests,
	# genders: Array
	# If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings.
	genders,
	# ages: Array
	# If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned.
	ages,
	# includeKeywords: Array
	# If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied.
	includeKeywords,
	# normalizeAgainstGroup: bool = false   Eg: true
	#  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
	normalizeAgainstGroup,
	# limit: int = 50   Eg: 56
	# The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.
	limit,
	# includeDemographics: bool = false   Eg: true
	# Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.
	includeDemographics,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "trending_keywords/list", response)
		assert(response.data is TrendingKeywordsResponse)
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

