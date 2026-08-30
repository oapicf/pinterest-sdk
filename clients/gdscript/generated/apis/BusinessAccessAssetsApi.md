<a name="__pageTop"></a>
# BusinessAccessAssetsApi   { #BusinessAccessAssetsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asset_group/create**](#asset_group/create) | **POST** `/businesses/{business_id}/asset_groups` | Create a new asset group.
[**asset_group/delete**](#asset_group/delete) | **DELETE** `/businesses/{business_id}/asset_groups` | Delete asset groups.
[**asset_group/update**](#asset_group/update) | **PATCH** `/businesses/{business_id}/asset_groups` | Update asset groups.
[**business_asset_members/get**](#business_asset_members/get) | **GET** `/businesses/{business_id}/assets/{asset_id}/members` | Get members with access to asset
[**business_asset_partners/get**](#business_asset_partners/get) | **GET** `/businesses/{business_id}/assets/{asset_id}/partners` | Get partners with access to asset
[**business_assets/get**](#business_assets/get) | **GET** `/businesses/{business_id}/assets` | List business assets
[**business_member_assets/get**](#business_member_assets/get) | **GET** `/businesses/{business_id}/members/{member_id}/assets` | Get assets assigned to a member
[**business_members_asset_access/delete**](#business_members_asset_access/delete) | **DELETE** `/businesses/{business_id}/members/assets/access` | Delete member access to asset
[**business_members_asset_access/update**](#business_members_asset_access/update) | **PATCH** `/businesses/{business_id}/members/assets/access` | Assign/Update member asset permissions
[**business_partner_asset_access/get**](#business_partner_asset_access/get) | **GET** `/businesses/{business_id}/partners/{partner_id}/assets` | Get assets assigned to a partner or assets assigned by a partner
[**delete_partner_asset_access_handler_impl**](#delete_partner_asset_access_handler_impl) | **DELETE** `/businesses/{business_id}/partners/assets` | Delete partner access to asset
[**update_partner_asset_access_handler_impl**](#update_partner_asset_access_handler_impl) | **PATCH** `/businesses/{business_id}/partners/assets` | Assign/Update partner asset permissions

# **asset_group/create**   { #asset_group/create }
<a name="asset_group/create"></a>

> `asset_group/create(businessId: String,assetGroupInputCreate: AssetGroupInputCreate, on_success: Callable, on_failure: Callable)`

Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)

var assetGroupInputCreate = AssetGroupInputCreate.new()
# … fill model assetGroupInputCreate with data

# Invoke an endpoint
api.asset_group/create(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# assetGroupInputCreate: AssetGroupInputCreate
	assetGroupInputCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "asset_group/create", response)
		assert(response.data is AssetGroupInput)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **asset_group/delete**   { #asset_group/delete }
<a name="asset_group/delete"></a>

> `asset_group/delete(businessId: String,assetGroupDeletionDelete: AssetGroupDeletionDelete, on_success: Callable, on_failure: Callable)`

Delete asset groups.

Delete a batch of asset groups.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)

var assetGroupDeletionDelete = AssetGroupDeletionDelete.new()
# … fill model assetGroupDeletionDelete with data

# Invoke an endpoint
api.asset_group/delete(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# assetGroupDeletionDelete: AssetGroupDeletionDelete
	assetGroupDeletionDelete,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "asset_group/delete", response)
		assert(response.data is AssetGroupDeletion)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **asset_group/update**   { #asset_group/update }
<a name="asset_group/update"></a>

> `asset_group/update(businessId: String,assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate, on_success: Callable, on_failure: Callable)`

Update asset groups.

Update a batch of asset groups with the specified parameters.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)

var assetGroupModificationReadOrUpdate = AssetGroupModificationReadOrUpdate.new()
# … fill model assetGroupModificationReadOrUpdate with data

# Invoke an endpoint
api.asset_group/update(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate
	assetGroupModificationReadOrUpdate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "asset_group/update", response)
		assert(response.data is AssetGroupModification)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **business_asset_members/get**   { #business_asset_members/get }
<a name="business_asset_members/get"></a>

> `business_asset_members/get(businessId: String,assetId: String,startIndex = 0,fetchSystemUsers = false,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)


# Invoke an endpoint
api.business_asset_members/get(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# assetId: String = ""   Eg: assetId_example
	# Unique identifier of a business asset.
	assetId,
	# startIndex: int = 0   Eg: 56
	# An index to start fetching the results from. Only the results starting from this index will be returned.
	startIndex,
	# fetchSystemUsers: bool = false   Eg: true
	# Fetches system users if True. Fetches regular user employees if False.
	fetchSystemUsers,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "business_asset_members/get", response)
		assert(response.data is business_asset_members_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **business_asset_partners/get**   { #business_asset_partners/get }
<a name="business_asset_partners/get"></a>

> `business_asset_partners/get(businessId: String,assetId: String,startIndex = 0,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)


# Invoke an endpoint
api.business_asset_partners/get(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# assetId: String = ""   Eg: assetId_example
	# Unique identifier of a business asset.
	assetId,
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
		prints("Success!", "business_asset_partners/get", response)
		assert(response.data is business_asset_members_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **business_assets/get**   { #business_assets/get }
<a name="business_assets/get"></a>

> `business_assets/get(businessId: String,permissions = null,childAssetId = "",assetGroupId = "",assetType = "AD_ACCOUNT",startIndex = 0,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)


# Invoke an endpoint
api.business_assets/get(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# permissions: Array
	# A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
	permissions,
	# childAssetId: String = ""   Eg: childAssetId_example
	# A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
	childAssetId,
	# assetGroupId: String = ""   Eg: assetGroupId_example
	# An asset group unique identifier. Used to fetch assets contained within the specified asset group.
	assetGroupId,
	# assetType: String = "AD_ACCOUNT"   Eg: assetType_example
	# A resource type to filter the assets by. Only assets of the specified type will be returned.
	assetType,
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
		prints("Success!", "business_assets/get", response)
		assert(response.data is business_assets_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **business_member_assets/get**   { #business_member_assets/get }
<a name="business_member_assets/get"></a>

> `business_member_assets/get(businessId: String,memberId: String,assetType = "AD_ACCOUNT",startIndex = 0,sortBy = null,sortAscending = true,searchBy = null,searchValue = "",assetPermissionType = null,adAccountStatuses = null,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)


# Invoke an endpoint
api.business_member_assets/get(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# memberId: String = ""   Eg: memberId_example
	# The member id to fetch assets for.
	memberId,
	# assetType: String = "AD_ACCOUNT"   Eg: assetType_example
	# A resource type to filter the assets by. Only assets of the specified type will be returned.
	assetType,
	# startIndex: int = 0   Eg: 56
	# An index to start fetching the results from. Only the results starting from this index will be returned.
	startIndex,
	# sortBy: AssetSortBy
	# The field to sort member assets by
	sortBy,
	# sortAscending: bool = true   Eg: true
	# Sort assets in ascending order
	sortAscending,
	# searchBy: AssetSearchBy
	# The field to search member assets by
	searchBy,
	# searchValue: String = ""   Eg: searchValue_example
	# The value to search for
	searchValue,
	# assetPermissionType: AssetPermissionType
	# The type of asset permission to filter by
	assetPermissionType,
	# adAccountStatuses: Array
	# A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
	adAccountStatuses,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "business_member_assets/get", response)
		assert(response.data is BusinessMemberAssetsGetResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **business_members_asset_access/delete**   { #business_members_asset_access/delete }
<a name="business_members_asset_access/delete"></a>

> `business_members_asset_access/delete(businessId: String,businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody, on_success: Callable, on_failure: Callable)`

Delete member access to asset

Terminate multiple members' access to an asset.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)

var businessMembersAssetAccessDeleteBody = BusinessMembersAssetAccessDeleteBody.new()
# … fill model businessMembersAssetAccessDeleteBody with data

# Invoke an endpoint
api.business_members_asset_access/delete(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody
	businessMembersAssetAccessDeleteBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "business_members_asset_access/delete", response)
		assert(response.data is DeleteMemberAccessResultsResponseArray)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **business_members_asset_access/update**   { #business_members_asset_access/update }
<a name="business_members_asset_access/update"></a>

> `business_members_asset_access/update(businessId: String,updateMemberAssetAccessBody: UpdateMemberAssetAccessBody, on_success: Callable, on_failure: Callable)`

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)

var updateMemberAssetAccessBody = UpdateMemberAssetAccessBody.new()
# … fill model updateMemberAssetAccessBody with data

# Invoke an endpoint
api.business_members_asset_access/update(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# updateMemberAssetAccessBody: UpdateMemberAssetAccessBody
	updateMemberAssetAccessBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "business_members_asset_access/update", response)
		assert(response.data is UpdateMemberAssetsResultsResponseArray)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **business_partner_asset_access/get**   { #business_partner_asset_access/get }
<a name="business_partner_asset_access/get"></a>

> `business_partner_asset_access/get(businessId: String,partnerId: String,partnerType = "INTERNAL",assetType = "AD_ACCOUNT",startIndex = 0,sortBy = null,sortAscending = true,searchBy = null,searchValue = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)


# Invoke an endpoint
api.business_partner_asset_access/get(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# partnerId: String = ""   Eg: partnerId_example
	# The partner id to be bound to the Business
	partnerId,
	# partnerType: String = "INTERNAL"   Eg: partnerType_example
	# Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
	partnerType,
	# assetType: String = "AD_ACCOUNT"   Eg: assetType_example
	# A resource type to filter the assets by. Only assets of the specified type will be returned.
	assetType,
	# startIndex: int = 0   Eg: 56
	# An index to start fetching the results from. Only the results starting from this index will be returned.
	startIndex,
	# sortBy: AssetSortBy
	# The field to sort member assets by
	sortBy,
	# sortAscending: bool = true   Eg: true
	# Sort assets in ascending order
	sortAscending,
	# searchBy: AssetSearchBy
	# The field to search member assets by
	searchBy,
	# searchValue: String = ""   Eg: searchValue_example
	# The value to search for
	searchValue,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "business_partner_asset_access/get", response)
		assert(response.data is business_partner_asset_access_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_partner_asset_access_handler_impl**   { #delete_partner_asset_access_handler_impl }
<a name="delete_partner_asset_access_handler_impl"></a>

> `delete_partner_asset_access_handler_impl(businessId: String,deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody, on_success: Callable, on_failure: Callable)`

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)

var deletePartnerAssetAccessBody = DeletePartnerAssetAccessBody.new()
# … fill model deletePartnerAssetAccessBody with data

# Invoke an endpoint
api.delete_partner_asset_access_handler_impl(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody
	deletePartnerAssetAccessBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "delete_partner_asset_access_handler_impl", response)
		assert(response.data is DeletePartnerAssetAccessResultsResponseArray)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **update_partner_asset_access_handler_impl**   { #update_partner_asset_access_handler_impl }
<a name="update_partner_asset_access_handler_impl"></a>

> `update_partner_asset_access_handler_impl(businessId: String,updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody, on_success: Callable, on_failure: Callable)`

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

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
var api = BusinessAccessAssetsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BusinessAccessAssetsApi.new(config, client)

var updatePartnerAssetAccessBody = UpdatePartnerAssetAccessBody.new()
# … fill model updatePartnerAssetAccessBody with data

# Invoke an endpoint
api.update_partner_asset_access_handler_impl(
	# businessId: String = ""   Eg: businessId_example
	# Unique identifier of the requesting business.
	businessId,
	# updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody
	updatePartnerAssetAccessBody,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "update_partner_asset_access_handler_impl", response)
		assert(response.data is UpdatePartnerAssetsResultsResponseArray)
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

