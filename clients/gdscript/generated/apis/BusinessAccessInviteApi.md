<a name="__pageTop"></a>
# BusinessAccessInviteApi   { #BusinessAccessInviteApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asset_access_requests/create**](#asset_access_requests/create) | **POST** `/businesses/{business_id}/requests/assets/access` | Create a request to access an existing partner&#x27;s assets.
[**cancel_invites_or_requests**](#cancel_invites_or_requests) | **DELETE** `/businesses/{business_id}/invites` | Cancel invites/requests
[**create_asset_invites**](#create_asset_invites) | **POST** `/businesses/{business_id}/invites/assets/access` | Update invite/request with an asset permission
[**create_membership_or_partnership_invites**](#create_membership_or_partnership_invites) | **POST** `/businesses/{business_id}/invites` | Create invites or requests
[**get/invites**](#get/invites) | **GET** `/businesses/{business_id}/invites` | Get invites/requests
[**respond_business_access_invites**](#respond_business_access_invites) | **PATCH** `/businesses/invites` | Accept or decline an invite/request

# **asset_access_requests/create**   { #asset_access_requests/create }
<a name="asset_access_requests/create"></a>

> `asset_access_requests/create(businessId: String,createAssetAccessRequestBody: CreateAssetAccessRequestBody, on_success: Callable, on_failure: Callable)`

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

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
var api = BusinessAccessInviteApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessInviteApi.new(config, client)

var createAssetAccessRequestBody = CreateAssetAccessRequestBody.new()
# … fill model createAssetAccessRequestBody with data

# Invoke an endpoint
api.asset_access_requests/create(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# createAssetAccessRequestBody: CreateAssetAccessRequestBody
	createAssetAccessRequestBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "asset_access_requests/create", response)
		assert(response.data is CreateAssetAccessRequestResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **cancel_invites_or_requests**   { #cancel_invites_or_requests }
<a name="cancel_invites_or_requests"></a>

> `cancel_invites_or_requests(businessId: String,cancelInvitesRequest: CancelInvitesRequest, on_success: Callable, on_failure: Callable)`

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

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
var api = BusinessAccessInviteApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessInviteApi.new(config, client)

var cancelInvitesRequest = CancelInvitesRequest.new()
# … fill model cancelInvitesRequest with data

# Invoke an endpoint
api.cancel_invites_or_requests(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# cancelInvitesRequest: CancelInvitesRequest
	cancelInvitesRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "cancel_invites_or_requests", response)
		assert(response.data is CancelInvitesResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_asset_invites**   { #create_asset_invites }
<a name="create_asset_invites"></a>

> `create_asset_invites(businessId: String,createAssetInvitesRequest: CreateAssetInvitesRequest, on_success: Callable, on_failure: Callable)`

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

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
var api = BusinessAccessInviteApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessInviteApi.new(config, client)

var createAssetInvitesRequest = CreateAssetInvitesRequest.new()
# … fill model createAssetInvitesRequest with data

# Invoke an endpoint
api.create_asset_invites(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# createAssetInvitesRequest: CreateAssetInvitesRequest
	createAssetInvitesRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_asset_invites", response)
		assert(response.data is UpdateInvitesResultsResponseArray)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **create_membership_or_partnership_invites**   { #create_membership_or_partnership_invites }
<a name="create_membership_or_partnership_invites"></a>

> `create_membership_or_partnership_invites(businessId: String,createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody, on_success: Callable, on_failure: Callable)`

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

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
var api = BusinessAccessInviteApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessInviteApi.new(config, client)

var createMembershipOrPartnershipInvitesBody = CreateMembershipOrPartnershipInvitesBody.new()
# … fill model createMembershipOrPartnershipInvitesBody with data

# Invoke an endpoint
api.create_membership_or_partnership_invites(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody
	createMembershipOrPartnershipInvitesBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "create_membership_or_partnership_invites", response)
		assert(response.data is CreateInvitesResultsResponseArray)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get/invites**   { #get/invites }
<a name="get/invites"></a>

> `get/invites(businessId: String,isMember = true,inviteStatus = null,inviteType = null,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

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
var api = BusinessAccessInviteApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessInviteApi.new(config, client)


# Invoke an endpoint
api.get/invites(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# isMember: bool = true   Eg: true
	# A boolean field to indicate whether the invite is to create a partnership or a membership.
	isMember,
	# inviteStatus: Array
	# A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
	inviteStatus,
	# inviteType: InviteType
	# Invite type to filter invites by. Only invites of the specified type will be returned.
	inviteType,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get/invites", response)
		assert(response.data is get_invites_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **respond_business_access_invites**   { #respond_business_access_invites }
<a name="respond_business_access_invites"></a>

> `respond_business_access_invites(authRespondInvitesBody: AuthRespondInvitesBody, on_success: Callable, on_failure: Callable)`

Accept or decline an invite/request

Accept or decline invites or requests.

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
var api = BusinessAccessInviteApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessInviteApi.new(config, client)

var authRespondInvitesBody = AuthRespondInvitesBody.new()
# … fill model authRespondInvitesBody with data

# Invoke an endpoint
api.respond_business_access_invites(
	# authRespondInvitesBody: AuthRespondInvitesBody
	authRespondInvitesBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "respond_business_access_invites", response)
		assert(response.data is RespondToInvitesResponseArray)
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

