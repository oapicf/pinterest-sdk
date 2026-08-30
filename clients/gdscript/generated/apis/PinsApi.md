<a name="__pageTop"></a>
# PinsApi   { #PinsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**multi_pins/analytics**](#multi_pins/analytics) | **GET** `/pins/analytics` | Get multiple Pin analytics
[**pins/analytics**](#pins/analytics) | **GET** `/pins/{pin_id}/analytics` | Get Pin analytics
[**pins/create**](#pins/create) | **POST** `/pins` | Create Pin
[**pins/delete**](#pins/delete) | **DELETE** `/pins/{pin_id}` | Delete Pin
[**pins/get**](#pins/get) | **GET** `/pins/{pin_id}` | Get Pin
[**pins/list**](#pins/list) | **GET** `/pins` | List Pins
[**pins/save**](#pins/save) | **POST** `/pins/{pin_id}/save` | Save Pin
[**pins/update**](#pins/update) | **PATCH** `/pins/{pin_id}` | Update Pin

# **multi_pins/analytics**   { #multi_pins/analytics }
<a name="multi_pins/analytics"></a>

> `multi_pins/analytics(pinIds: Array,startDate: String,endDate: String,metricTypes: Array,appTypes = "ALL",adAccountId = "", on_success: Callable, on_failure: Callable)`

Get multiple Pin analytics

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

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
var api = PinsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PinsApi.new(config, client)


# Invoke an endpoint
api.multi_pins/analytics(
	# pinIds: Array
	# List of Pin IDs.
	pinIds,
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# metricTypes: Array
	# Pin metric types to get data for.
	metricTypes,
	# appTypes: String = "ALL"   Eg: appTypes_example
	# Apps or devices to get data for, default is all.
	appTypes,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "multi_pins/analytics", response)
		assert(response.data is map)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pins/analytics**   { #pins/analytics }
<a name="pins/analytics"></a>

> `pins/analytics(pinId: String,startDate: String,endDate: String,metricTypes: Array,appTypes = "ALL",splitField = "NO_SPLIT",adAccountId = "", on_success: Callable, on_failure: Callable)`

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

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
var api = PinsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PinsApi.new(config, client)


# Invoke an endpoint
api.pins/analytics(
	# pinId: String = ""   Eg: pinId_example
	# Unique identifier of a Pin.
	pinId,
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# metricTypes: Array
	# Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before `2023-03-20`, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than `NO_SPLIT`.
	metricTypes,
	# appTypes: String = "ALL"   Eg: appTypes_example
	# Apps or devices to get data for, default is all.
	appTypes,
	# splitField: String = "NO_SPLIT"   Eg: splitField_example
	# How to split the data into groups. Not including this param means data won't be split.
	splitField,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pins/analytics", response)
		assert(response.data is PinAnalyticsMetricsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pins/create**   { #pins/create }
<a name="pins/create"></a>

> `pins/create(pinCreate: PinCreate,adAccountId = "", on_success: Callable, on_failure: Callable)`

Create Pin

 Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.

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
var api = PinsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PinsApi.new(config, client)

var pinCreate = PinCreate.new()
# … fill model pinCreate with data

# Invoke an endpoint
api.pins/create(
	# pinCreate: PinCreate
	pinCreate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pins/create", response)
		assert(response.data is Pin)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pins/delete**   { #pins/delete }
<a name="pins/delete"></a>

> `pins/delete(pinId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Delete Pin

  Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

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
var api = PinsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PinsApi.new(config, client)


# Invoke an endpoint
api.pins/delete(
	# pinId: String = ""   Eg: pinId_example
	pinId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pins/delete", response)
		assert(response.data is Pin)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pins/get**   { #pins/get }
<a name="pins/get"></a>

> `pins/get(pinId: String,adAccountId = "",pinMetrics = false, on_success: Callable, on_failure: Callable)`

Get Pin

  Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

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
var api = PinsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PinsApi.new(config, client)


# Invoke an endpoint
api.pins/get(
	# pinId: String = ""   Eg: pinId_example
	pinId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# pinMetrics: bool = false   Eg: true
	# Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
	pinMetrics,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pins/get", response)
		assert(response.data is Pin)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pins/list**   { #pins/list }
<a name="pins/list"></a>

> `pins/list(pinFilter = null,pinMetrics = false,includeProtectedPins = false,pinType = null,creativeTypes = null,adAccountId = "",domain = "",domains = null,includeProductTagObj = null,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List Pins

    Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).

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
var api = PinsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PinsApi.new(config, client)


# Invoke an endpoint
api.pins/list(
	# pinFilter: PinFilter
	# The filter to apply to the pins
	pinFilter,
	# pinMetrics: bool = false   Eg: true
	# Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
	pinMetrics,
	# includeProtectedPins: bool = false   Eg: true
	# Whether to include protected pins in the results
	includeProtectedPins,
	# pinType: PinType
	# The type of pins to return, currently only enabled for private pins
	pinType,
	# creativeTypes: Array
	# Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	creativeTypes,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# domain: String = ""   Eg: domain_example
	# Only return pins with links that match the exact domain. Domain should not include 'www.' prefix. For example, 'pinterest.com' is a valid domain, but 'www.pinterest.com' is not (will not match any pins).
	domain,
	# domains: Array
	# Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. `?domains=instagram.com,jcpenney.com`).
	domains,
	# includeProductTagObj: bool   Eg: true
	# Include product tag objects in the response with their associated links.
	includeProductTagObj,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pins/list", response)
		assert(response.data is pins_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pins/save**   { #pins/save }
<a name="pins/save"></a>

> `pins/save(pinId: String,pinsSaveRequestCreate: PinsSaveRequestCreate,adAccountId = "", on_success: Callable, on_failure: Callable)`

Save Pin

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

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
var api = PinsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PinsApi.new(config, client)

var pinsSaveRequestCreate = PinsSaveRequestCreate.new()
# … fill model pinsSaveRequestCreate with data

# Invoke an endpoint
api.pins/save(
	# pinId: String = ""   Eg: pinId_example
	# Unique identifier of a Pin.
	pinId,
	# pinsSaveRequestCreate: PinsSaveRequestCreate
	pinsSaveRequestCreate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pins/save", response)
		assert(response.data is Pin)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pins/update**   { #pins/update }
<a name="pins/update"></a>

> `pins/update(pinId: String,pinUpdate: PinUpdate,adAccountId = "", on_success: Callable, on_failure: Callable)`

Update Pin

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
var api = PinsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PinsApi.new(config, client)

var pinUpdate = PinUpdate.new()
# … fill model pinUpdate with data

# Invoke an endpoint
api.pins/update(
	# pinId: String = ""   Eg: pinId_example
	pinId,
	# pinUpdate: PinUpdate
	pinUpdate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pins/update", response)
		assert(response.data is Pin)
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

