<a name="__pageTop"></a>
# AudiencesApi   { #AudiencesApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiences/create**](#audiences/create) | **POST** `/ad_accounts/{ad_account_id}/audiences` | Create audience
[**audiences/get**](#audiences/get) | **GET** `/ad_accounts/{ad_account_id}/audiences/{audience_id}` | Get audience
[**audiences/list**](#audiences/list) | **GET** `/ad_accounts/{ad_account_id}/audiences` | List audiences
[**audiences/update**](#audiences/update) | **PATCH** `/ad_accounts/{ad_account_id}/audiences/{audience_id}` | Update audience

# **audiences/create**   { #audiences/create }
<a name="audiences/create"></a>

> `audiences/create(adAccountId: String,adAccountsAudienceCreate: AdAccountsAudienceCreate, on_success: Callable, on_failure: Callable)`

Create audience

Create a new audience for the ad account.

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
var api = AudiencesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudiencesApi.new(config, client)

var adAccountsAudienceCreate = AdAccountsAudienceCreate.new()
# … fill model adAccountsAudienceCreate with data

# Invoke an endpoint
api.audiences/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adAccountsAudienceCreate: AdAccountsAudienceCreate
	adAccountsAudienceCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "audiences/create", response)
		assert(response.data is AdAccountsAudience)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **audiences/get**   { #audiences/get }
<a name="audiences/get"></a>

> `audiences/get(audienceId: String,adAccountId: String, on_success: Callable, on_failure: Callable)`

Get audience

Get a specific audience given the audience ID.

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
var api = AudiencesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudiencesApi.new(config, client)


# Invoke an endpoint
api.audiences/get(
	# audienceId: String = ""   Eg: audienceId_example
	# Audience ID.
	audienceId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "audiences/get", response)
		assert(response.data is AdAccountsAudience)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **audiences/list**   { #audiences/list }
<a name="audiences/list"></a>

> `audiences/list(adAccountId: String,bookmark = "",pageSize = 25,order = null,ownershipType = null,excludeNca = false, on_success: Callable, on_failure: Callable)`

List audiences

Get list of audiences for the ad account.

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
var api = AudiencesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudiencesApi.new(config, client)


# Invoke an endpoint
api.audiences/list(
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
	# ownershipType: AudienceOwnershipType
	ownershipType,
	# excludeNca: bool = false   Eg: true
	# When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
	excludeNca,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "audiences/list", response)
		assert(response.data is audiences_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **audiences/update**   { #audiences/update }
<a name="audiences/update"></a>

> `audiences/update(audienceId: String,adAccountId: String,adAccountsAudienceUpdate: AdAccountsAudienceUpdate, on_success: Callable, on_failure: Callable)`

Update audience

Update an existing audience for the ad account.

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
var api = AudiencesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudiencesApi.new(config, client)

var adAccountsAudienceUpdate = AdAccountsAudienceUpdate.new()
# … fill model adAccountsAudienceUpdate with data

# Invoke an endpoint
api.audiences/update(
	# audienceId: String = ""   Eg: audienceId_example
	# Audience ID.
	audienceId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adAccountsAudienceUpdate: AdAccountsAudienceUpdate
	adAccountsAudienceUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "audiences/update", response)
		assert(response.data is AdAccountsAudience)
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

