<a name="__pageTop"></a>
# TargetingTemplateApi   { #TargetingTemplateApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targeting_template/create**](#targeting_template/create) | **POST** `/ad_accounts/{ad_account_id}/targeting_templates` | Create targeting templates
[**targeting_template/list**](#targeting_template/list) | **GET** `/ad_accounts/{ad_account_id}/targeting_templates` | List targeting templates
[**targeting_template/update**](#targeting_template/update) | **PATCH** `/ad_accounts/{ad_account_id}/targeting_templates` | Update targeting templates

# **targeting_template/create**   { #targeting_template/create }
<a name="targeting_template/create"></a>

> `targeting_template/create(adAccountId: String,targetingTemplateCreate: TargetingTemplateCreate, on_success: Callable, on_failure: Callable)`

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

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
var api = TargetingTemplateApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = TargetingTemplateApi.new(config, client)

var targetingTemplateCreate = TargetingTemplateCreate.new()
# … fill model targetingTemplateCreate with data

# Invoke an endpoint
api.targeting_template/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# targetingTemplateCreate: TargetingTemplateCreate
	targetingTemplateCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "targeting_template/create", response)
		assert(response.data is TargetingTemplate)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **targeting_template/list**   { #targeting_template/list }
<a name="targeting_template/list"></a>

> `targeting_template/list(adAccountId: String,bookmark = "",pageSize = 25,order = null,includeSizing = false,searchQuery = "", on_success: Callable, on_failure: Callable)`

List targeting templates

Get a list of the targeting templates in the specified `ad_account_id`

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
var api = TargetingTemplateApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = TargetingTemplateApi.new(config, client)


# Invoke an endpoint
api.targeting_template/list(
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
	# includeSizing: bool = false   Eg: true
	# Include audience sizing in result or not
	includeSizing,
	# searchQuery: String = ""   Eg: searchQuery_example
	# Search query. Can contain pin description keywords or comma-separated pin IDs.
	searchQuery,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "targeting_template/list", response)
		assert(response.data is targeting_template_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **targeting_template/update**   { #targeting_template/update }
<a name="targeting_template/update"></a>

> `targeting_template/update(adAccountId: String,targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate, on_success: Callable, on_failure: Callable)`

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

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
var api = TargetingTemplateApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = TargetingTemplateApi.new(config, client)

var targetingTemplateUpdateRequestReadOrUpdate = TargetingTemplateUpdateRequestReadOrUpdate.new()
# … fill model targetingTemplateUpdateRequestReadOrUpdate with data

# Invoke an endpoint
api.targeting_template/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate
	targetingTemplateUpdateRequestReadOrUpdate,
	# On Success
	func(response):
		prints("Success!", "targeting_template/update", response)
		
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

