<a name="__pageTop"></a>
# BillingApi   { #BillingApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ads_credit/redeem**](#ads_credit/redeem) | **POST** `/ad_accounts/{ad_account_id}/ads_credit/redeem` | Redeem ad credits
[**ads_credits_discounts/get**](#ads_credits_discounts/get) | **GET** `/ad_accounts/{ad_account_id}/ads_credit/discounts` | Get ads credit discounts
[**billing_invoice_download/get**](#billing_invoice_download/get) | **GET** `/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download` | Get download url for a billing invoice
[**billing_invoices/get**](#billing_invoices/get) | **GET** `/ad_accounts/{ad_account_id}/billing_invoices` | Get billing invoices
[**billing_profiles/get**](#billing_profiles/get) | **GET** `/ad_accounts/{ad_account_id}/billing_profiles` | Get billing profiles
[**ssio_accounts/get**](#ssio_accounts/get) | **GET** `/ad_accounts/{ad_account_id}/ssio/accounts` | Get Salesforce account details including bill-to information.
[**ssio_insertion_order/create**](#ssio_insertion_order/create) | **POST** `/ad_accounts/{ad_account_id}/ssio/insertion_orders` | Create insertion order through SSIO.
[**ssio_insertion_order/edit**](#ssio_insertion_order/edit) | **PATCH** `/ad_accounts/{ad_account_id}/ssio/insertion_orders` | Edit insertion order through SSIO.
[**ssio_insertion_orders_status/get_by_ad_account**](#ssio_insertion_orders_status/get_by_ad_account) | **GET** `/ad_accounts/{ad_account_id}/ssio/insertion_orders/status` | Get insertion order status by ad account id.
[**ssio_insertion_orders_status/get_by_pin_order_id**](#ssio_insertion_orders_status/get_by_pin_order_id) | **GET** `/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status` | Get insertion order status by pin order id.
[**ssio_order_lines/get_by_ad_account**](#ssio_order_lines/get_by_ad_account) | **GET** `/ad_accounts/{ad_account_id}/ssio/order_lines` | Get Salesforce order lines by ad account id.

# **ads_credit/redeem**   { #ads_credit/redeem }
<a name="ads_credit/redeem"></a>

> `ads_credit/redeem(adAccountId: String,adsCreditRedeemCreate: AdsCreditRedeemCreate, on_success: Callable, on_failure: Callable)`

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)

var adsCreditRedeemCreate = AdsCreditRedeemCreate.new()
# … fill model adsCreditRedeemCreate with data

# Invoke an endpoint
api.ads_credit/redeem(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adsCreditRedeemCreate: AdsCreditRedeemCreate
	adsCreditRedeemCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ads_credit/redeem", response)
		assert(response.data is AdsCreditRedeem)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ads_credits_discounts/get**   { #ads_credits_discounts/get }
<a name="ads_credits_discounts/get"></a>

> `ads_credits_discounts/get(adAccountId: String,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)


# Invoke an endpoint
api.ads_credits_discounts/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ads_credits_discounts/get", response)
		assert(response.data is ads_credits_discounts_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **billing_invoice_download/get**   { #billing_invoice_download/get }
<a name="billing_invoice_download/get"></a>

> `billing_invoice_download/get(adAccountId: String,billingInvoiceId: String, on_success: Callable, on_failure: Callable)`

Get download url for a billing invoice

Get download url for a billing invoice.

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)


# Invoke an endpoint
api.billing_invoice_download/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# billingInvoiceId: String = ""   Eg: billingInvoiceId_example
	# Unique identifier of a billing invoice.
	billingInvoiceId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "billing_invoice_download/get", response)
		assert(response.data is BillingInvoiceDownloadResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **billing_invoices/get**   { #billing_invoices/get }
<a name="billing_invoices/get"></a>

> `billing_invoices/get(adAccountId: String,bookmark = "",pageSize = 25,order = null,sort = null,status = null,documentType = null,startDueDate = null,endDueDate = null, on_success: Callable, on_failure: Callable)`

Get billing invoices

Get billing invoices in the advertiser account.

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)


# Invoke an endpoint
api.billing_invoices/get(
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
	# sort: BillingInvoiceSortField
	# Field of which to sort billing invoices
	sort,
	# status: BillingInvoiceStatus
	# Status of billing invoices to filter by
	status,
	# documentType: BillingInvoiceDocumentType
	# Document type of billing invoices to filter by
	documentType,
	# startDueDate: String   Eg: 2013-10-20
	# Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
	startDueDate,
	# endDueDate: String   Eg: 2013-10-20
	# Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
	endDueDate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "billing_invoices/get", response)
		assert(response.data is billing_invoices_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **billing_profiles/get**   { #billing_profiles/get }
<a name="billing_profiles/get"></a>

> `billing_profiles/get(isActive: bool,adAccountId: String,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)


# Invoke an endpoint
api.billing_profiles/get(
	# isActive: bool   Eg: true
	# Return active billing profiles, if false return all billing profiles.
	isActive,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "billing_profiles/get", response)
		assert(response.data is billing_profiles_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ssio_accounts/get**   { #ssio_accounts/get }
<a name="ssio_accounts/get"></a>

> `ssio_accounts/get(adAccountId: String, on_success: Callable, on_failure: Callable)`

Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)


# Invoke an endpoint
api.ssio_accounts/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ssio_accounts/get", response)
		assert(response.data is SSIOAccount)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ssio_insertion_order/create**   { #ssio_insertion_order/create }
<a name="ssio_insertion_order/create"></a>

> `ssio_insertion_order/create(adAccountId: String,sSIOInsertionOrderCreate: SSIOInsertionOrderCreate, on_success: Callable, on_failure: Callable)`

Create insertion order through SSIO.

  Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)

var sSIOInsertionOrderCreate = SSIOInsertionOrderCreate.new()
# … fill model sSIOInsertionOrderCreate with data

# Invoke an endpoint
api.ssio_insertion_order/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# sSIOInsertionOrderCreate: SSIOInsertionOrderCreate
	sSIOInsertionOrderCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ssio_insertion_order/create", response)
		assert(response.data is SSIOInsertionOrder)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ssio_insertion_order/edit**   { #ssio_insertion_order/edit }
<a name="ssio_insertion_order/edit"></a>

> `ssio_insertion_order/edit(adAccountId: String,sSIOInsertionOrderUpdate: SSIOInsertionOrderUpdate, on_success: Callable, on_failure: Callable)`

Edit insertion order through SSIO.

  Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)

var sSIOInsertionOrderUpdate = SSIOInsertionOrderUpdate.new()
# … fill model sSIOInsertionOrderUpdate with data

# Invoke an endpoint
api.ssio_insertion_order/edit(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# sSIOInsertionOrderUpdate: SSIOInsertionOrderUpdate
	sSIOInsertionOrderUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ssio_insertion_order/edit", response)
		assert(response.data is SSIOInsertionOrder)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ssio_insertion_orders_status/get_by_ad_account**   { #ssio_insertion_orders_status/get_by_ad_account }
<a name="ssio_insertion_orders_status/get_by_ad_account"></a>

> `ssio_insertion_orders_status/get_by_ad_account(adAccountId: String,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get insertion order status by ad account id.

  Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)


# Invoke an endpoint
api.ssio_insertion_orders_status/get_by_ad_account(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ssio_insertion_orders_status/get_by_ad_account", response)
		assert(response.data is ssio_insertion_orders_status_get_by_ad_account_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ssio_insertion_orders_status/get_by_pin_order_id**   { #ssio_insertion_orders_status/get_by_pin_order_id }
<a name="ssio_insertion_orders_status/get_by_pin_order_id"></a>

> `ssio_insertion_orders_status/get_by_pin_order_id(adAccountId: String,pinOrderId: String, on_success: Callable, on_failure: Callable)`

Get insertion order status by pin order id.

  Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)


# Invoke an endpoint
api.ssio_insertion_orders_status/get_by_pin_order_id(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# pinOrderId: String = ""   Eg: pinOrderId_example
	# The pin order id associated with the ssio insertion order
	pinOrderId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ssio_insertion_orders_status/get_by_pin_order_id", response)
		assert(response.data is SSIOInsertionOrderStatusResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ssio_order_lines/get_by_ad_account**   { #ssio_order_lines/get_by_ad_account }
<a name="ssio_order_lines/get_by_ad_account"></a>

> `ssio_order_lines/get_by_ad_account(adAccountId: String,pinOrderId = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get Salesforce order lines by ad account id.

  Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
var api = BillingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BillingApi.new(config, client)


# Invoke an endpoint
api.ssio_order_lines/get_by_ad_account(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# pinOrderId: String = ""   Eg: pinOrderId_example
	# The pin order id associated with the SSIO insertion order
	pinOrderId,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ssio_order_lines/get_by_ad_account", response)
		assert(response.data is ssio_order_lines_get_by_ad_account_200_response)
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

