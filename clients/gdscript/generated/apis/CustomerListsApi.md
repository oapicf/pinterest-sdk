<a name="__pageTop"></a>
# CustomerListsApi   { #CustomerListsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_lists/create**](#customer_lists/create) | **POST** `/ad_accounts/{ad_account_id}/customer_lists` | Create customer lists
[**customer_lists/get**](#customer_lists/get) | **GET** `/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}` | Get customer list
[**customer_lists/list**](#customer_lists/list) | **GET** `/ad_accounts/{ad_account_id}/customer_lists` | Get customer lists
[**customer_lists/update**](#customer_lists/update) | **PATCH** `/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}` | Update customer list

# **customer_lists/create**   { #customer_lists/create }
<a name="customer_lists/create"></a>

> `customer_lists/create(adAccountId: String,customerListCreate: CustomerListCreate, on_success: Callable, on_failure: Callable)`

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

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
var api = CustomerListsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomerListsApi.new(config, client)

var customerListCreate = CustomerListCreate.new()
# … fill model customerListCreate with data

# Invoke an endpoint
api.customer_lists/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# customerListCreate: CustomerListCreate
	customerListCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "customer_lists/create", response)
		assert(response.data is CustomerList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **customer_lists/get**   { #customer_lists/get }
<a name="customer_lists/get"></a>

> `customer_lists/get(adAccountId: String,customerListId: String, on_success: Callable, on_failure: Callable)`

Get customer list

Gets a specific customer list given the customer list ID.

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
var api = CustomerListsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomerListsApi.new(config, client)


# Invoke an endpoint
api.customer_lists/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# customerListId: String = ""   Eg: customerListId_example
	# Customer list ID.
	customerListId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "customer_lists/get", response)
		assert(response.data is CustomerList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **customer_lists/list**   { #customer_lists/list }
<a name="customer_lists/list"></a>

> `customer_lists/list(adAccountId: String,bookmark = "",pageSize = 25,order = null,excludeNca = false, on_success: Callable, on_failure: Callable)`

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

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
var api = CustomerListsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomerListsApi.new(config, client)


# Invoke an endpoint
api.customer_lists/list(
	# adAccountId: String = ""   Eg: adAccountId_example
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
	# excludeNca: bool = false   Eg: true
	# When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
	excludeNca,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "customer_lists/list", response)
		assert(response.data is customer_lists_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **customer_lists/update**   { #customer_lists/update }
<a name="customer_lists/update"></a>

> `customer_lists/update(adAccountId: String,customerListId: String,customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody, on_success: Callable, on_failure: Callable)`

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

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
var api = CustomerListsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomerListsApi.new(config, client)

var customerListUpdateWithRequiredBody = CustomerListUpdateWithRequiredBody.new()
# … fill model customerListUpdateWithRequiredBody with data

# Invoke an endpoint
api.customer_lists/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# customerListId: String = ""   Eg: customerListId_example
	# Customer list ID.
	customerListId,
	# customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody
	customerListUpdateWithRequiredBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "customer_lists/update", response)
		assert(response.data is CustomerList)
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

