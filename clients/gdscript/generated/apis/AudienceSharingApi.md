<a name="__pageTop"></a>
# AudienceSharingApi   { #AudienceSharingApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_audiences_shared_accounts/list**](#ad_accounts_audiences_shared_accounts/list) | **GET** `/ad_accounts/{ad_account_id}/audiences/shared/accounts` | List accounts with access to an audience owned by an ad account
[**business_account_audiences_shared_accounts/list**](#business_account_audiences_shared_accounts/list) | **GET** `/businesses/{business_id}/audiences/shared/accounts` | List accounts with access to an audience owned by a business
[**shared_audiences_for_business/list**](#shared_audiences_for_business/list) | **GET** `/businesses/{business_id}/audiences` | List received audiences for a business
[**update_ad_account_to_ad_account_shared_audience**](#update_ad_account_to_ad_account_shared_audience) | **PATCH** `/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared` | Update audience sharing between ad accounts
[**update_ad_account_to_business_shared_audience**](#update_ad_account_to_business_shared_audience) | **PATCH** `/ad_accounts/{ad_account_id}/audiences/businesses/shared` | Update audience sharing from an ad account to businesses
[**update_business_to_ad_account_shared_audience**](#update_business_to_ad_account_shared_audience) | **PATCH** `/businesses/{business_id}/audiences/ad_accounts/shared` | Update audience sharing from a business to ad accounts
[**update_business_to_business_shared_audience**](#update_business_to_business_shared_audience) | **PATCH** `/businesses/{business_id}/audiences/businesses/shared` | Update audience sharing between businesses

# **ad_accounts_audiences_shared_accounts/list**   { #ad_accounts_audiences_shared_accounts/list }
<a name="ad_accounts_audiences_shared_accounts/list"></a>

> `ad_accounts_audiences_shared_accounts/list(audienceId: String,accountType: AudienceAccountType,adAccountId: String,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

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
var api = AudienceSharingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudienceSharingApi.new(config, client)


# Invoke an endpoint
api.ad_accounts_audiences_shared_accounts/list(
	# audienceId: String = ""   Eg: audienceId_example
	# Unique identifier of the audience to use to filter the results.
	audienceId,
	# accountType: AudienceAccountType
	# Filter accounts by account type.
	accountType,
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
		prints("Success!", "ad_accounts_audiences_shared_accounts/list", response)
		assert(response.data is ad_accounts_audiences_shared_accounts_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **business_account_audiences_shared_accounts/list**   { #business_account_audiences_shared_accounts/list }
<a name="business_account_audiences_shared_accounts/list"></a>

> `business_account_audiences_shared_accounts/list(businessId: String,audienceId: String,accountType: AudienceAccountType,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

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
var api = AudienceSharingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudienceSharingApi.new(config, client)


# Invoke an endpoint
api.business_account_audiences_shared_accounts/list(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# audienceId: String = ""   Eg: audienceId_example
	# Unique identifier of the audience to use to filter the results.
	audienceId,
	# accountType: AudienceAccountType
	# Filter accounts by account type.
	accountType,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "business_account_audiences_shared_accounts/list", response)
		assert(response.data is ad_accounts_audiences_shared_accounts_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **shared_audiences_for_business/list**   { #shared_audiences_for_business/list }
<a name="shared_audiences_for_business/list"></a>

> `shared_audiences_for_business/list(businessId: String,order = null,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List received audiences for a business

Get a list of received audiences for the given business.

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
var api = AudienceSharingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudienceSharingApi.new(config, client)


# Invoke an endpoint
api.shared_audiences_for_business/list(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# order: Order
	# The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
	order,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "shared_audiences_for_business/list", response)
		assert(response.data is shared_audiences_for_business_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **update_ad_account_to_ad_account_shared_audience**   { #update_ad_account_to_ad_account_shared_audience }
<a name="update_ad_account_to_ad_account_shared_audience"></a>

> `update_ad_account_to_ad_account_shared_audience(adAccountId: String,adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody, on_success: Callable, on_failure: Callable)`

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

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
var api = AudienceSharingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudienceSharingApi.new(config, client)

var adAccountToAdAccountSharedAudienceUpdateWithRequiredBody = AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.new()
# … fill model adAccountToAdAccountSharedAudienceUpdateWithRequiredBody with data

# Invoke an endpoint
api.update_ad_account_to_ad_account_shared_audience(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
	adAccountToAdAccountSharedAudienceUpdateWithRequiredBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "update_ad_account_to_ad_account_shared_audience", response)
		assert(response.data is AdAccountToAdAccountSharedAudience)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **update_ad_account_to_business_shared_audience**   { #update_ad_account_to_business_shared_audience }
<a name="update_ad_account_to_business_shared_audience"></a>

> `update_ad_account_to_business_shared_audience(adAccountId: String,adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody, on_success: Callable, on_failure: Callable)`

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

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
var api = AudienceSharingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudienceSharingApi.new(config, client)

var adAccountToBusinessSharedAudienceUpdateWithRequiredBody = AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.new()
# … fill model adAccountToBusinessSharedAudienceUpdateWithRequiredBody with data

# Invoke an endpoint
api.update_ad_account_to_business_shared_audience(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
	adAccountToBusinessSharedAudienceUpdateWithRequiredBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "update_ad_account_to_business_shared_audience", response)
		assert(response.data is AdAccountToBusinessSharedAudience)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **update_business_to_ad_account_shared_audience**   { #update_business_to_ad_account_shared_audience }
<a name="update_business_to_ad_account_shared_audience"></a>

> `update_business_to_ad_account_shared_audience(businessId: String,businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody, on_success: Callable, on_failure: Callable)`

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

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
var api = AudienceSharingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudienceSharingApi.new(config, client)

var businessToAdAccountSharedAudienceUpdateWithRequiredBody = BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.new()
# … fill model businessToAdAccountSharedAudienceUpdateWithRequiredBody with data

# Invoke an endpoint
api.update_business_to_ad_account_shared_audience(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
	businessToAdAccountSharedAudienceUpdateWithRequiredBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "update_business_to_ad_account_shared_audience", response)
		assert(response.data is BusinessToAdAccountSharedAudience)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **update_business_to_business_shared_audience**   { #update_business_to_business_shared_audience }
<a name="update_business_to_business_shared_audience"></a>

> `update_business_to_business_shared_audience(businessId: String,businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody, on_success: Callable, on_failure: Callable)`

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

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
var api = AudienceSharingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudienceSharingApi.new(config, client)

var businessToBusinessSharedAudienceUpdateWithRequiredBody = BusinessToBusinessSharedAudienceUpdateWithRequiredBody.new()
# … fill model businessToBusinessSharedAudienceUpdateWithRequiredBody with data

# Invoke an endpoint
api.update_business_to_business_shared_audience(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody
	businessToBusinessSharedAudienceUpdateWithRequiredBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "update_business_to_business_shared_audience", response)
		assert(response.data is BusinessToBusinessSharedAudience)
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

