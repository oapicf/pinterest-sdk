<a name="__pageTop"></a>
# UserAccountApi   { #UserAccountApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boards_user_follows/list**](#boards_user_follows/list) | **GET** `/user_account/following/boards` | List following boards
[**follow_user/update**](#follow_user/update) | **POST** `/user_account/following/{username}` | Follow user
[**followers/list**](#followers/list) | **GET** `/user_account/followers` | List followers
[**linked_business_accounts/get**](#linked_business_accounts/get) | **GET** `/user_account/businesses` | List linked businesses
[**unverify_website/delete**](#unverify_website/delete) | **DELETE** `/user_account/websites` | Unverify website
[**user_account/analytics**](#user_account/analytics) | **GET** `/user_account/analytics` | Get user account analytics
[**user_account/analytics/top_pins**](#user_account/analytics/top_pins) | **GET** `/user_account/analytics/top_pins` | Get user account top pins analytics
[**user_account/analytics/top_video_pins**](#user_account/analytics/top_video_pins) | **GET** `/user_account/analytics/top_video_pins` | Get user account top video pins analytics
[**user_account/followed_interests**](#user_account/followed_interests) | **GET** `/users/{username}/interests/follow` | List following interests
[**user_account/get**](#user_account/get) | **GET** `/user_account` | Get user account
[**user_following/get**](#user_following/get) | **GET** `/user_account/following` | List following
[**user_websites/get**](#user_websites/get) | **GET** `/user_account/websites` | Get user websites
[**verify_website/update**](#verify_website/update) | **POST** `/user_account/websites` | Verify website
[**website_verification/get**](#website_verification/get) | **GET** `/user_account/websites/verification` | Get user verification code for website claiming

# **boards_user_follows/list**   { #boards_user_follows/list }
<a name="boards_user_follows/list"></a>

> `boards_user_follows/list(adAccountId = "",explicitFollowing = false,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.boards_user_follows/list(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# explicitFollowing: bool = false   Eg: true
	# Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
	explicitFollowing,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "boards_user_follows/list", response)
		assert(response.data is boards_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **follow_user/update**   { #follow_user/update }
<a name="follow_user/update"></a>

> `follow_user/update(username: String,followUserCreate: FollowUserCreate, on_success: Callable, on_failure: Callable)`

Follow user

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)

var followUserCreate = FollowUserCreate.new()
# … fill model followUserCreate with data

# Invoke an endpoint
api.follow_user/update(
	# username: String = ""   Eg: username_example
	# A valid username
	username,
	# followUserCreate: FollowUserCreate
	followUserCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "follow_user/update", response)
		assert(response.data is FollowUser)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **followers/list**   { #followers/list }
<a name="followers/list"></a>

> `followers/list(bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List followers

Get a list of your followers.

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.followers/list(
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "followers/list", response)
		assert(response.data is followers_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **linked_business_accounts/get**   { #linked_business_accounts/get }
<a name="linked_business_accounts/get"></a>

> `linked_business_accounts/get( on_success: Callable, on_failure: Callable)`

List linked businesses

Get a list of your linked business accounts.

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.linked_business_accounts/get(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "linked_business_accounts/get", response)
		assert(response.data is LinkedBusiness)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **unverify_website/delete**   { #unverify_website/delete }
<a name="unverify_website/delete"></a>

> `unverify_website/delete(website: String, on_success: Callable, on_failure: Callable)`

Unverify website

Unverify a website verified by the signed-in user.

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.unverify_website/delete(
	# website: String = ""   Eg: website_example
	# Website with path or domain only
	website,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "unverify_website/delete", response)
		assert(response.data is UserWebsite)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **user_account/analytics**   { #user_account/analytics }
<a name="user_account/analytics"></a>

> `user_account/analytics(startDate: String,endDate: String,fromClaimedContent = "BOTH",pinFormat = "ALL",appTypes = "ALL",contentType = "ALL",source = "ALL",metricTypes = null,splitField = "NO_SPLIT",adAccountId = "", on_success: Callable, on_failure: Callable)`

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.user_account/analytics(
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# fromClaimedContent: String = "BOTH"   Eg: fromClaimedContent_example
	# Filter on Pins that match your claimed domain.
	fromClaimedContent,
	# pinFormat: String = "ALL"   Eg: pinFormat_example
	# Pin formats to get data for, default is all.
	pinFormat,
	# appTypes: String = "ALL"   Eg: appTypes_example
	# Apps or devices to get data for, default is all.
	appTypes,
	# contentType: String = "ALL"   Eg: contentType_example
	# Filter to paid or organic data. Default is all.
	contentType,
	# source: String = "ALL"   Eg: source_example
	# Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
	source,
	# metricTypes: Array
	# Metric types to get data for, default is all.
	metricTypes,
	# splitField: String = "NO_SPLIT"   Eg: splitField_example
	# How to split the data into groups. Not including this param means data won't be split.
	splitField,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "user_account/analytics", response)
		assert(response.data is AnalyticsMetricsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **user_account/analytics/top_pins**   { #user_account/analytics/top_pins }
<a name="user_account/analytics/top_pins"></a>

> `user_account/analytics/top_pins(startDate: String,endDate: String,sortBy: TopPinsSortBy,fromClaimedContent = "BOTH",pinFormat = "ALL",appTypes = "ALL",contentType = "ALL",source = "ALL",metricTypes = null,numOfPins = 10,createdInLastNDays = null,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.user_account/analytics/top_pins(
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# sortBy: TopPinsSortBy
	# Specify sorting order for metrics
	sortBy,
	# fromClaimedContent: String = "BOTH"   Eg: fromClaimedContent_example
	# Filter on Pins that match your claimed domain.
	fromClaimedContent,
	# pinFormat: String = "ALL"   Eg: pinFormat_example
	# Pin formats to get data for, default is all.
	pinFormat,
	# appTypes: String = "ALL"   Eg: appTypes_example
	# Apps or devices to get data for, default is all.
	appTypes,
	# contentType: String = "ALL"   Eg: contentType_example
	# Filter to paid or organic data. Default is all.
	contentType,
	# source: String = "ALL"   Eg: source_example
	# Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
	source,
	# metricTypes: Array
	# Metric types to get data for, default is all.
	metricTypes,
	# numOfPins: int = 10   Eg: 56
	# Number of pins to include, default is 10. Max is 50.
	numOfPins,
	# createdInLastNDays: float   Eg: 8.14
	# Get metrics for pins created in the last \"n\" days.
	createdInLastNDays,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "user_account/analytics/top_pins", response)
		assert(response.data is TopPinsAnalyticsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **user_account/analytics/top_video_pins**   { #user_account/analytics/top_video_pins }
<a name="user_account/analytics/top_video_pins"></a>

> `user_account/analytics/top_video_pins(startDate: String,endDate: String,sortBy: TopVideoPinsSortBy,fromClaimedContent = "BOTH",pinFormat = "ALL",appTypes = "ALL",contentType = "ALL",source = "ALL",metricTypes = null,numOfPins = 10,createdInLastNDays = null,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.user_account/analytics/top_video_pins(
	# startDate: String   Eg: 2013-10-20
	# Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	startDate,
	# endDate: String   Eg: 2013-10-20
	# Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	endDate,
	# sortBy: TopVideoPinsSortBy
	# Specify sorting order for video metrics
	sortBy,
	# fromClaimedContent: String = "BOTH"   Eg: fromClaimedContent_example
	# Filter on Pins that match your claimed domain.
	fromClaimedContent,
	# pinFormat: String = "ALL"   Eg: pinFormat_example
	# Pin formats to get data for, default is all.
	pinFormat,
	# appTypes: String = "ALL"   Eg: appTypes_example
	# Apps or devices to get data for, default is all.
	appTypes,
	# contentType: String = "ALL"   Eg: contentType_example
	# Filter to paid or organic data. Default is all.
	contentType,
	# source: String = "ALL"   Eg: source_example
	# Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
	source,
	# metricTypes: Array
	# Metric types to get video data for, default is all.
	metricTypes,
	# numOfPins: int = 10   Eg: 56
	# Number of pins to include, default is 10. Max is 50.
	numOfPins,
	# createdInLastNDays: float   Eg: 8.14
	# Get metrics for pins created in the last \"n\" days.
	createdInLastNDays,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "user_account/analytics/top_video_pins", response)
		assert(response.data is TopVideoPinsAnalyticsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **user_account/followed_interests**   { #user_account/followed_interests }
<a name="user_account/followed_interests"></a>

> `user_account/followed_interests(username: String,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List following interests

Get a list of a user's following interests in one place.

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.user_account/followed_interests(
	# username: String = ""   Eg: username_example
	# A valid username
	username,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "user_account/followed_interests", response)
		assert(response.data is user_account_followed_interests_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **user_account/get**   { #user_account/get }
<a name="user_account/get"></a>

> `user_account/get(adAccountId = "", on_success: Callable, on_failure: Callable)`

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.user_account/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "user_account/get", response)
		assert(response.data is Account)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **user_following/get**   { #user_following/get }
<a name="user_following/get"></a>

> `user_following/get(adAccountId = "",explicitFollowing = false,feedType = null,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List following

Get a list of who a certain user follows.

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.user_following/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# explicitFollowing: bool = false   Eg: true
	# Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
	explicitFollowing,
	# feedType: UserFollowingFeedType
	# Thrift param specifying what type of followees will be kept. Default to include all followees.
	feedType,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "user_following/get", response)
		assert(response.data is followers_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **user_websites/get**   { #user_websites/get }
<a name="user_websites/get"></a>

> `user_websites/get(bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get user websites

Get user websites, claimed or not

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.user_websites/get(
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "user_websites/get", response)
		assert(response.data is user_websites_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **verify_website/update**   { #verify_website/update }
<a name="verify_website/update"></a>

> `verify_website/update(userWebsiteCreate: UserWebsiteCreate,adAccountId = "", on_success: Callable, on_failure: Callable)`

Verify website

Verify a website as a signed-in user.

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)

var userWebsiteCreate = UserWebsiteCreate.new()
# … fill model userWebsiteCreate with data

# Invoke an endpoint
api.verify_website/update(
	# userWebsiteCreate: UserWebsiteCreate
	userWebsiteCreate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "verify_website/update", response)
		assert(response.data is UserWebsite)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **website_verification/get**   { #website_verification/get }
<a name="website_verification/get"></a>

> `website_verification/get(adAccountId = "", on_success: Callable, on_failure: Callable)`

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

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
var api = UserAccountApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UserAccountApi.new(config, client)


# Invoke an endpoint
api.website_verification/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "website_verification/get", response)
		assert(response.data is UserWebsiteVerification)
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

