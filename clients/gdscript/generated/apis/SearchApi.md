<a name="__pageTop"></a>
# SearchApi   { #SearchApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_partner_pins**](#search_partner_pins) | **GET** `/search/partner/pins` | Search pins by a given search term
[**search_user_boards/get**](#search_user_boards/get) | **GET** `/search/boards` | Search user&#x27;s boards
[**search_user_pins/list**](#search_user_pins/list) | **GET** `/search/pins` | Search user&#x27;s Pins

# **search_partner_pins**   { #search_partner_pins }
<a name="search_partner_pins"></a>

> `search_partner_pins(term: String,countryCode: String,bookmark = "",locale = "",limit = 10, on_success: Callable, on_failure: Callable)`

Search pins by a given search term

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.

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
var api = SearchApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SearchApi.new(config, client)


# Invoke an endpoint
api.search_partner_pins(
	# term: String = ""   Eg: term_example
	# Search term to look up pins.
	term,
	# countryCode: String = ""   Eg: countryCode_example
	# Two letter country code (ISO 3166-1 alpha-2)
	countryCode,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# locale: String = ""   Eg: locale_example
	# Search locale.
	locale,
	# limit: int = 10   Eg: 56
	# Max search result size
	limit,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "search_partner_pins", response)
		assert(response.data is search_partner_pins_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **search_user_boards/get**   { #search_user_boards/get }
<a name="search_user_boards/get"></a>

> `search_user_boards/get(adAccountId = "",query = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.

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
var api = SearchApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SearchApi.new(config, client)


# Invoke an endpoint
api.search_user_boards/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# query: String = ""   Eg: query_example
	# Search query. Can contain pin description keywords or comma-separated pin IDs.
	query,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "search_user_boards/get", response)
		assert(response.data is boards_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **search_user_pins/list**   { #search_user_pins/list }
<a name="search_user_pins/list"></a>

> `search_user_pins/list(query: String,adAccountId = "",bookmark = "", on_success: Callable, on_failure: Callable)`

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.

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
var api = SearchApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SearchApi.new(config, client)


# Invoke an endpoint
api.search_user_pins/list(
	# query: String = ""   Eg: query_example
	# Search query. Can contain pin description keywords or comma-separated pin IDs.
	query,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "search_user_pins/list", response)
		assert(response.data is pins_list_200_response)
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

