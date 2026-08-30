<a name="__pageTop"></a>
# TrendsApi   { #TrendsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trends_editorial_articles/list**](#trends_editorial_articles/list) | **GET** `/trends/editorial_articles` | Returns editorial articles for a given region
[**trends_featured_topics/list**](#trends_featured_topics/list) | **GET** `/trends/topics/featured` | Get featured topics
[**trends_product_categories_details/list**](#trends_product_categories_details/list) | **GET** `/trends/product_categories/details` | Get product category details
[**trends_product_categories_trending/list**](#trends_product_categories_trending/list) | **GET** `/trends/product_categories/trending` | Get a list of growing Shopping Product Categories

# **trends_editorial_articles/list**   { #trends_editorial_articles/list }
<a name="trends_editorial_articles/list"></a>

> `trends_editorial_articles/list(region: ProductCategoryRegion, on_success: Callable, on_failure: Callable)`

Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

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
var api = TrendsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = TrendsApi.new(config, client)


# Invoke an endpoint
api.trends_editorial_articles/list(
	# region: ProductCategoryRegion
	#      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
	region,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "trends_editorial_articles/list", response)
		assert(response.data is TrendsEditorial)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **trends_featured_topics/list**   { #trends_featured_topics/list }
<a name="trends_featured_topics/list"></a>

> `trends_featured_topics/list(region: ProductCategoryRegion,interest = null, on_success: Callable, on_failure: Callable)`

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

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
var api = TrendsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = TrendsApi.new(config, client)


# Invoke an endpoint
api.trends_featured_topics/list(
	# region: ProductCategoryRegion
	#      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
	region,
	# interest: InterestsEnum
	# Interest to filter by
	interest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "trends_featured_topics/list", response)
		assert(response.data is FeaturedTrend)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **trends_product_categories_details/list**   { #trends_product_categories_details/list }
<a name="trends_product_categories_details/list"></a>

> `trends_product_categories_details/list(productCategories: Array,region: ProductCategoryRegion,lookbackWindow = null,engagementType = null, on_success: Callable, on_failure: Callable)`

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

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
var api = TrendsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = TrendsApi.new(config, client)


# Invoke an endpoint
api.trends_product_categories_details/list(
	# productCategories: Array
	# List of product categories
	productCategories,
	# region: ProductCategoryRegion
	#      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
	region,
	# lookbackWindow: ProductCategoryDetailLookbackWindow
	#   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
	lookbackWindow,
	# engagementType: ProductCategoriesEngagementType
	#     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
	engagementType,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "trends_product_categories_details/list", response)
		assert(response.data is ProductCategoryDetails)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **trends_product_categories_trending/list**   { #trends_product_categories_trending/list }
<a name="trends_product_categories_trending/list"></a>

> `trends_product_categories_trending/list(region: ProductCategoryRegion,verticals = null,ages = null,genders = null,engagementType = null, on_success: Callable, on_failure: Callable)`

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

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
var api = TrendsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = TrendsApi.new(config, client)


# Invoke an endpoint
api.trends_product_categories_trending/list(
	# region: ProductCategoryRegion
	#      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
	region,
	# verticals: Array
	# List of verticals to filter by
	verticals,
	# ages: Array
	# Age to filter by. If not provided, the results will be filtered by all ages.
	ages,
	# genders: Array
	# Gender to filter by, If not provided, the results will be filtered by all genders.
	genders,
	# engagementType: ProductCategoriesEngagementType
	#     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
	engagementType,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "trends_product_categories_trending/list", response)
		assert(response.data is TrendingProductCategory)
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

