<a name="__pageTop"></a>
# LabelsApi   { #LabelsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labels/apply**](#labels/apply) | **POST** `/ad_accounts/{ad_account_id}/labels/{label_id}/apply` | Apply label to entity
[**labels/create**](#labels/create) | **POST** `/ad_accounts/{ad_account_id}/labels` | Create labels
[**labels/list**](#labels/list) | **GET** `/ad_accounts/{ad_account_id}/labels` | List labels
[**labels/remove**](#labels/remove) | **POST** `/ad_accounts/{ad_account_id}/labels/{label_id}/remove` | Remove label from entities
[**labels/update**](#labels/update) | **PATCH** `/ad_accounts/{ad_account_id}/labels` | Update labels

# **labels/apply**   { #labels/apply }
<a name="labels/apply"></a>

> `labels/apply(adAccountId: String,labelId: String,labeledEntitiesCreate: LabeledEntitiesCreate, on_success: Callable, on_failure: Callable)`

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

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
var api = LabelsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LabelsApi.new(config, client)

var labeledEntitiesCreate = LabeledEntitiesCreate.new()
# … fill model labeledEntitiesCreate with data

# Invoke an endpoint
api.labels/apply(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# labelId: String = ""   Eg: labelId_example
	# Label ID.
	labelId,
	# labeledEntitiesCreate: LabeledEntitiesCreate
	labeledEntitiesCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "labels/apply", response)
		assert(response.data is LabeledEntities)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **labels/create**   { #labels/create }
<a name="labels/create"></a>

> `labels/create(adAccountId: String,labelCreateRequest: LabelCreateRequest, on_success: Callable, on_failure: Callable)`

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

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
var api = LabelsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LabelsApi.new(config, client)

var labelCreateRequest = LabelCreateRequest.new()
# … fill model labelCreateRequest with data

# Invoke an endpoint
api.labels/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# labelCreateRequest: LabelCreateRequest
	labelCreateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "labels/create", response)
		assert(response.data is LabelsResponse)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **labels/list**   { #labels/list }
<a name="labels/list"></a>

> `labels/list(adAccountId: String,campaignIds = null,labelIds = null,entityStatuses = ["ACTIVE"],labelTypes = ["BRAND","CUSTOM"],bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

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
var api = LabelsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LabelsApi.new(config, client)


# Invoke an endpoint
api.labels/list(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# campaignIds: Array
	# List of Campaign Ids to use to filter the results.
	campaignIds,
	# labelIds: Array
	# List of Label Ids to use to filter the results.
	labelIds,
	# entityStatuses: Array = ["ACTIVE"]
	# Label entity status
	entityStatuses,
	# labelTypes: Array = ["BRAND","CUSTOM"]
	# Label type.
	labelTypes,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "labels/list", response)
		assert(response.data is labels_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **labels/remove**   { #labels/remove }
<a name="labels/remove"></a>

> `labels/remove(adAccountId: String,labelId: String,labeledEntitiesCreate: LabeledEntitiesCreate, on_success: Callable, on_failure: Callable)`

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

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
var api = LabelsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LabelsApi.new(config, client)

var labeledEntitiesCreate = LabeledEntitiesCreate.new()
# … fill model labeledEntitiesCreate with data

# Invoke an endpoint
api.labels/remove(
	# adAccountId: String = ""   Eg: adAccountId_example
	adAccountId,
	# labelId: String = ""   Eg: labelId_example
	# Label ID.
	labelId,
	# labeledEntitiesCreate: LabeledEntitiesCreate
	labeledEntitiesCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "labels/remove", response)
		assert(response.data is LabeledEntities)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **labels/update**   { #labels/update }
<a name="labels/update"></a>

> `labels/update(adAccountId: String,labelUpdateRequest: LabelUpdateRequest, on_success: Callable, on_failure: Callable)`

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

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
var api = LabelsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = LabelsApi.new(config, client)

var labelUpdateRequest = LabelUpdateRequest.new()
# … fill model labelUpdateRequest with data

# Invoke an endpoint
api.labels/update(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# labelUpdateRequest: LabelUpdateRequest
	labelUpdateRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "labels/update", response)
		assert(response.data is LabelsResponse)
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

