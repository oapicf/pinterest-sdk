<a name="__pageTop"></a>
# ConversionTagsApi   { #ConversionTagsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_tags/create**](#conversion_tags/create) | **POST** `/ad_accounts/{ad_account_id}/conversion_tags` | Create conversion tag
[**conversion_tags/get**](#conversion_tags/get) | **GET** `/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}` | Get conversion tag
[**conversion_tags/list**](#conversion_tags/list) | **GET** `/ad_accounts/{ad_account_id}/conversion_tags` | List conversion tags
[**ocpm_eligible_conversion_tags/get**](#ocpm_eligible_conversion_tags/get) | **GET** `/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible` | Get Ocpm eligible conversion tags
[**page_visit_conversion_tags/get**](#page_visit_conversion_tags/get) | **GET** `/ad_accounts/{ad_account_id}/conversion_tags/page_visit` | Get page visit conversion tags

# **conversion_tags/create**   { #conversion_tags/create }
<a name="conversion_tags/create"></a>

> `conversion_tags/create(adAccountId: String,conversionTagCreate: ConversionTagCreate, on_success: Callable, on_failure: Callable)`

Create conversion tag

Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)

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
var api = ConversionTagsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionTagsApi.new(config, client)

var conversionTagCreate = ConversionTagCreate.new()
# … fill model conversionTagCreate with data

# Invoke an endpoint
api.conversion_tags/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# conversionTagCreate: ConversionTagCreate
	conversionTagCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "conversion_tags/create", response)
		assert(response.data is ConversionTag)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **conversion_tags/get**   { #conversion_tags/get }
<a name="conversion_tags/get"></a>

> `conversion_tags/get(adAccountId: String,conversionTagId: String, on_success: Callable, on_failure: Callable)`

Get conversion tag

Get information about an existing conversion tag.

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
var api = ConversionTagsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionTagsApi.new(config, client)


# Invoke an endpoint
api.conversion_tags/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# conversionTagId: String = ""   Eg: conversionTagId_example
	# Id of the conversion tag.
	conversionTagId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "conversion_tags/get", response)
		assert(response.data is ConversionTag)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **conversion_tags/list**   { #conversion_tags/list }
<a name="conversion_tags/list"></a>

> `conversion_tags/list(adAccountId: String,filterDeleted = false, on_success: Callable, on_failure: Callable)`

List conversion tags

List conversion tags associated with an ad account.

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
var api = ConversionTagsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionTagsApi.new(config, client)


# Invoke an endpoint
api.conversion_tags/list(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# filterDeleted: bool = false   Eg: true
	# Filter by deleted status
	filterDeleted,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "conversion_tags/list", response)
		assert(response.data is conversion_tags_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ocpm_eligible_conversion_tags/get**   { #ocpm_eligible_conversion_tags/get }
<a name="ocpm_eligible_conversion_tags/get"></a>

> `ocpm_eligible_conversion_tags/get(adAccountId: String, on_success: Callable, on_failure: Callable)`

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

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
var api = ConversionTagsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionTagsApi.new(config, client)


# Invoke an endpoint
api.ocpm_eligible_conversion_tags/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ocpm_eligible_conversion_tags/get", response)
		assert(response.data is array)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **page_visit_conversion_tags/get**   { #page_visit_conversion_tags/get }
<a name="page_visit_conversion_tags/get"></a>

> `page_visit_conversion_tags/get(adAccountId: String,bookmark = "",pageSize = 25,order = null, on_success: Callable, on_failure: Callable)`

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

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
var api = ConversionTagsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionTagsApi.new(config, client)


# Invoke an endpoint
api.page_visit_conversion_tags/get(
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
		prints("Success!", "page_visit_conversion_tags/get", response)
		assert(response.data is page_visit_conversion_tags_get_200_response)
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

