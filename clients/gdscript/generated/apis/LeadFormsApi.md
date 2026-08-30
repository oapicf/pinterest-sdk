<a name="__pageTop"></a>
# LeadFormsApi   { #LeadFormsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lead_form/get**](#lead_form/get) | **GET** `/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}` | Get lead form by id
[**lead_form_test/create**](#lead_form_test/create) | **POST** `/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test` | Create lead form test data
[**lead_forms/create**](#lead_forms/create) | **POST** `/ad_accounts/{ad_account_id}/lead_forms` | Create lead forms
[**lead_forms/list**](#lead_forms/list) | **GET** `/ad_accounts/{ad_account_id}/lead_forms` | List lead forms
[**lead_forms/update**](#lead_forms/update) | **PATCH** `/ad_accounts/{ad_account_id}/lead_forms` | Update lead forms

# **lead_form/get**   { #lead_form/get }
<a name="lead_form/get"></a>

> `lead_form/get(leadFormId: String,adAccountId: String, on_success: Callable, on_failure: Callable)`

Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
var api = LeadFormsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadFormsApi.new(config, client)


# Invoke an endpoint
api.lead_form/get(
	# leadFormId: String = ""   Eg: leadFormId_example
	# The ID of this lead form
	leadFormId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "lead_form/get", response)
		assert(response.data is LeadForm)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **lead_form_test/create**   { #lead_form_test/create }
<a name="lead_form_test/create"></a>

> `lead_form_test/create(adAccountId: String,leadFormId: String,leadFormTestCreate: LeadFormTestCreate, on_success: Callable, on_failure: Callable)`

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

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
var api = LeadFormsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadFormsApi.new(config, client)

var leadFormTestCreate = LeadFormTestCreate.new()
# … fill model leadFormTestCreate with data

# Invoke an endpoint
api.lead_form_test/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# leadFormId: String = ""   Eg: leadFormId_example
	# Unique identifier of a lead form.
	leadFormId,
	# leadFormTestCreate: LeadFormTestCreate
	leadFormTestCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "lead_form_test/create", response)
		assert(response.data is LeadFormTest)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **lead_forms/create**   { #lead_forms/create }
<a name="lead_forms/create"></a>

> `lead_forms/create(adAccountId: String,leadFormCreate: Array, on_success: Callable, on_failure: Callable)`

Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
var api = LeadFormsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadFormsApi.new(config, client)


# Invoke an endpoint
api.lead_forms/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# leadFormCreate: Array
	leadFormCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "lead_forms/create", response)
		assert(response.data is lead_forms_create_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **lead_forms/list**   { #lead_forms/list }
<a name="lead_forms/list"></a>

> `lead_forms/list(adAccountId: String,bookmark = "",pageSize = 25,order = null, on_success: Callable, on_failure: Callable)`

List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
var api = LeadFormsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadFormsApi.new(config, client)


# Invoke an endpoint
api.lead_forms/list(
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
		prints("Success!", "lead_forms/list", response)
		assert(response.data is lead_forms_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **lead_forms/update**   { #lead_forms/update }
<a name="lead_forms/update"></a>

> `lead_forms/update(adAccountId: String,leadFormBatchUpdate: Array, on_success: Callable, on_failure: Callable)`

Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
var api = LeadFormsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LeadFormsApi.new(config, client)


# Invoke an endpoint
api.lead_forms/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# leadFormBatchUpdate: Array
	leadFormBatchUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "lead_forms/update", response)
		assert(response.data is lead_forms_create_200_response)
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

