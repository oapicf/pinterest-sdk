<a name="__pageTop"></a>
# BusinessAccessRelationshipsApi   { #BusinessAccessRelationshipsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brand_accounts/create**](#brand_accounts/create) | **POST** `/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts` | Create a Brand Account
[**brand_accounts/update**](#brand_accounts/update) | **PATCH** `/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}` | Update a Brand Account
[**delete_business_membership**](#delete_business_membership) | **DELETE** `/businesses/{business_id}/members` | Terminate business memberships
[**delete_business_partners**](#delete_business_partners) | **DELETE** `/businesses/{business_id}/partners` | Terminate business partnerships
[**get/business_employers**](#get/business_employers) | **GET** `/businesses/employers` | List business employers for user
[**get/business_members**](#get/business_members) | **GET** `/businesses/{business_id}/members` | Get business members
[**get/business_partners**](#get/business_partners) | **GET** `/businesses/{business_id}/partners` | Get business partners
[**system_user/update**](#system_user/update) | **PATCH** `/businesses/{business_id}/system_users/{system_user_id}` | Update a system user information.
[**update/business_memberships**](#update/business_memberships) | **PATCH** `/businesses/{business_id}/members` | Update member&#x27;s business role

# **brand_accounts/create**   { #brand_accounts/create }
<a name="brand_accounts/create"></a>

> `brand_accounts/create(businessHierarchyId: String,brandAccountCreate: BrandAccountCreate, on_success: Callable, on_failure: Callable)`

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

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
var api = BusinessAccessRelationshipsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessRelationshipsApi.new(config, client)

var brandAccountCreate = BrandAccountCreate.new()
# … fill model brandAccountCreate with data

# Invoke an endpoint
api.brand_accounts/create(
	# businessHierarchyId: String = ""   Eg: businessHierarchyId_example
	# business hierarchy node id
	businessHierarchyId,
	# brandAccountCreate: BrandAccountCreate
	brandAccountCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "brand_accounts/create", response)
		assert(response.data is BrandAccount)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **brand_accounts/update**   { #brand_accounts/update }
<a name="brand_accounts/update"></a>

> `brand_accounts/update(brandAccountId: String,businessHierarchyId: String,brandAccountUpdate: BrandAccountUpdate, on_success: Callable, on_failure: Callable)`

Update a Brand Account

Update an existing Brand Account

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
var api = BusinessAccessRelationshipsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessRelationshipsApi.new(config, client)

var brandAccountUpdate = BrandAccountUpdate.new()
# … fill model brandAccountUpdate with data

# Invoke an endpoint
api.brand_accounts/update(
	# brandAccountId: String = ""   Eg: brandAccountId_example
	brandAccountId,
	# businessHierarchyId: String = ""   Eg: businessHierarchyId_example
	# business hierarchy node id
	businessHierarchyId,
	# brandAccountUpdate: BrandAccountUpdate
	brandAccountUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "brand_accounts/update", response)
		assert(response.data is BrandAccount)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_business_membership**   { #delete_business_membership }
<a name="delete_business_membership"></a>

> `delete_business_membership(businessId: String,deleteBusinessMembershipBody: DeleteBusinessMembershipBody, on_success: Callable, on_failure: Callable)`

Terminate business memberships

Terminate memberships between the specified members and your business.

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
var api = BusinessAccessRelationshipsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessRelationshipsApi.new(config, client)

var deleteBusinessMembershipBody = DeleteBusinessMembershipBody.new()
# … fill model deleteBusinessMembershipBody with data

# Invoke an endpoint
api.delete_business_membership(
	# businessId: String = ""   Eg: businessId_example
	# Business id
	businessId,
	# deleteBusinessMembershipBody: DeleteBusinessMembershipBody
	deleteBusinessMembershipBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_business_membership", response)
		assert(response.data is delete_business_membership_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_business_partners**   { #delete_business_partners }
<a name="delete_business_partners"></a>

> `delete_business_partners(businessId: String,deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete, on_success: Callable, on_failure: Callable)`

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

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
var api = BusinessAccessRelationshipsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessRelationshipsApi.new(config, client)

var deleteBusinessPartnersDelete = DeleteBusinessPartnersDelete.new()
# … fill model deleteBusinessPartnersDelete with data

# Invoke an endpoint
api.delete_business_partners(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete
	deleteBusinessPartnersDelete,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_business_partners", response)
		assert(response.data is DeleteBusinessPartners)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get/business_employers**   { #get/business_employers }
<a name="get/business_employers"></a>

> `get/business_employers(assetsSummary = true,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List business employers for user

Get all of the viewing user's business employers.

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
var api = BusinessAccessRelationshipsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessRelationshipsApi.new(config, client)


# Invoke an endpoint
api.get/business_employers(
	# assetsSummary: bool = true   Eg: true
	# Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
	assetsSummary,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get/business_employers", response)
		assert(response.data is get_business_employers_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get/business_members**   { #get/business_members }
<a name="get/business_members"></a>

> `get/business_members(businessId: String,fetchSystemUsers = false,assetsSummary = false,businessRoles = null,memberIds = "",startIndex = 0,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

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
var api = BusinessAccessRelationshipsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessRelationshipsApi.new(config, client)


# Invoke an endpoint
api.get/business_members(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# fetchSystemUsers: bool = false   Eg: true
	# Fetches system users if True. Fetches regular user employees if False.
	fetchSystemUsers,
	# assetsSummary: bool = false   Eg: true
	# Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
	assetsSummary,
	# businessRoles: Array
	# A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
	businessRoles,
	# memberIds: String = ""   Eg: memberIds_example
	# A list of business members ids separated by comma.
	memberIds,
	# startIndex: int = 0   Eg: 56
	# An index to start fetching the results from. Only the results starting from this index will be returned.
	startIndex,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get/business_members", response)
		assert(response.data is get_business_employers_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get/business_partners**   { #get/business_partners }
<a name="get/business_partners"></a>

> `get/business_partners(businessId: String,assetsSummary = false,partnerType = null,partnerIds = "",startIndex = 0,sortAscending = null,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

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
var api = BusinessAccessRelationshipsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessRelationshipsApi.new(config, client)


# Invoke an endpoint
api.get/business_partners(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# assetsSummary: bool = false   Eg: true
	# Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
	assetsSummary,
	# partnerType: PartnerType
	# Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
	partnerType,
	# partnerIds: String = ""   Eg: partnerIds_example
	# A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
	partnerIds,
	# startIndex: int = 0   Eg: 56
	# An index to start fetching the results from. Only the results starting from this index will be returned.
	startIndex,
	# sortAscending: bool   Eg: true
	# Sort ascending.
	sortAscending,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get/business_partners", response)
		assert(response.data is get_business_employers_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **system_user/update**   { #system_user/update }
<a name="system_user/update"></a>

> `system_user/update(businessId: String,systemUserId: String,systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody, on_success: Callable, on_failure: Callable)`

Update a system user information.

Update a system user information such as name.

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
var api = BusinessAccessRelationshipsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessRelationshipsApi.new(config, client)

var systemUserUpdateWithRequiredBody = SystemUserUpdateWithRequiredBody.new()
# … fill model systemUserUpdateWithRequiredBody with data

# Invoke an endpoint
api.system_user/update(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# systemUserId: String = ""   Eg: systemUserId_example
	# Unique identifier of a system user.
	systemUserId,
	# systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody
	systemUserUpdateWithRequiredBody,
	# On Success
	func(response):
		prints("Success!", "system_user/update", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **update/business_memberships**   { #update/business_memberships }
<a name="update/business_memberships"></a>

> `update/business_memberships(businessId: String,businessMembershipMember: Array, on_success: Callable, on_failure: Callable)`

Update member's business role

Update a member's business role within the business.

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
var api = BusinessAccessRelationshipsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessRelationshipsApi.new(config, client)


# Invoke an endpoint
api.update/business_memberships(
	# businessId: String = ""   Eg: businessId_example
	# Business id
	businessId,
	# businessMembershipMember: Array
	businessMembershipMember,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "update/business_memberships", response)
		assert(response.data is UpdateBusinessMembershipsResponse)
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

