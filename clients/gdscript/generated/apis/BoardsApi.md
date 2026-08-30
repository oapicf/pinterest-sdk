<a name="__pageTop"></a>
# BoardsApi   { #BoardsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**board_sections/create**](#board_sections/create) | **POST** `/boards/{board_id}/sections` | Create board section
[**board_sections/delete**](#board_sections/delete) | **DELETE** `/boards/{board_id}/sections/{section_id}` | Delete board section
[**board_sections/list**](#board_sections/list) | **GET** `/boards/{board_id}/sections` | List board sections
[**board_sections/list_pins**](#board_sections/list_pins) | **GET** `/boards/{board_id}/sections/{section_id}/pins` | List Pins on board section
[**board_sections/update**](#board_sections/update) | **PATCH** `/boards/{board_id}/sections/{section_id}` | Update board section
[**boards/create**](#boards/create) | **POST** `/boards` | Create board
[**boards/delete**](#boards/delete) | **DELETE** `/boards/{board_id}` | Delete board
[**boards/get**](#boards/get) | **GET** `/boards/{board_id}` | Get board
[**boards/list**](#boards/list) | **GET** `/boards` | List boards
[**boards/list_pins**](#boards/list_pins) | **GET** `/boards/{board_id}/pins` | List Pins on board
[**boards/update**](#boards/update) | **PATCH** `/boards/{board_id}` | Update board

# **board_sections/create**   { #board_sections/create }
<a name="board_sections/create"></a>

> `board_sections/create(boardId: String,boardSectionCreate: BoardSectionCreate,adAccountId = "", on_success: Callable, on_failure: Callable)`

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)

var boardSectionCreate = BoardSectionCreate.new()
# … fill model boardSectionCreate with data

# Invoke an endpoint
api.board_sections/create(
	# boardId: String = ""   Eg: boardId_example
	# Unique identifier of a board.
	boardId,
	# boardSectionCreate: BoardSectionCreate
	boardSectionCreate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "board_sections/create", response)
		assert(response.data is BoardSection)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **board_sections/delete**   { #board_sections/delete }
<a name="board_sections/delete"></a>

> `board_sections/delete(boardId: String,sectionId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)


# Invoke an endpoint
api.board_sections/delete(
	# boardId: String = ""   Eg: boardId_example
	# Unique identifier of a board.
	boardId,
	# sectionId: String = ""   Eg: sectionId_example
	# Unique identifier of a board section.
	sectionId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "board_sections/delete", response)
		assert(response.data is BoardSection)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **board_sections/list**   { #board_sections/list }
<a name="board_sections/list"></a>

> `board_sections/list(boardId: String,adAccountId = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)


# Invoke an endpoint
api.board_sections/list(
	# boardId: String = ""   Eg: boardId_example
	# Unique identifier of a board.
	boardId,
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
		prints("Success!", "board_sections/list", response)
		assert(response.data is board_sections_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **board_sections/list_pins**   { #board_sections/list_pins }
<a name="board_sections/list_pins"></a>

> `board_sections/list_pins(boardId: String,sectionId: String,adAccountId = "",bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)


# Invoke an endpoint
api.board_sections/list_pins(
	# boardId: String = ""   Eg: boardId_example
	# Unique identifier of a board.
	boardId,
	# sectionId: String = ""   Eg: sectionId_example
	# Unique identifier of a board section.
	sectionId,
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
		prints("Success!", "board_sections/list_pins", response)
		assert(response.data is boards_list_pins_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **board_sections/update**   { #board_sections/update }
<a name="board_sections/update"></a>

> `board_sections/update(boardId: String,sectionId: String,boardSectionUpdateWithRequiredBody: BoardSectionUpdateWithRequiredBody,adAccountId = "", on_success: Callable, on_failure: Callable)`

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)

var boardSectionUpdateWithRequiredBody = BoardSectionUpdateWithRequiredBody.new()
# … fill model boardSectionUpdateWithRequiredBody with data

# Invoke an endpoint
api.board_sections/update(
	# boardId: String = ""   Eg: boardId_example
	# Unique identifier of a board.
	boardId,
	# sectionId: String = ""   Eg: sectionId_example
	# Unique identifier of a board section.
	sectionId,
	# boardSectionUpdateWithRequiredBody: BoardSectionUpdateWithRequiredBody
	boardSectionUpdateWithRequiredBody,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "board_sections/update", response)
		assert(response.data is BoardSection)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **boards/create**   { #boards/create }
<a name="boards/create"></a>

> `boards/create(boardCreate: BoardCreate,adAccountId = "", on_success: Callable, on_failure: Callable)`

Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)

var boardCreate = BoardCreate.new()
# … fill model boardCreate with data

# Invoke an endpoint
api.boards/create(
	# boardCreate: BoardCreate
	boardCreate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "boards/create", response)
		assert(response.data is Board)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **boards/delete**   { #boards/delete }
<a name="boards/delete"></a>

> `boards/delete(boardId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Delete board

Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)


# Invoke an endpoint
api.boards/delete(
	# boardId: String = ""   Eg: boardId_example
	boardId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "boards/delete", response)
		assert(response.data is Board)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **boards/get**   { #boards/get }
<a name="boards/get"></a>

> `boards/get(boardId: String,adAccountId = "", on_success: Callable, on_failure: Callable)`

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)


# Invoke an endpoint
api.boards/get(
	# boardId: String = ""   Eg: boardId_example
	boardId,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "boards/get", response)
		assert(response.data is Board)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **boards/list**   { #boards/list }
<a name="boards/list"></a>

> `boards/list(adAccountId = "",privacy = null,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)


# Invoke an endpoint
api.boards/list(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# privacy: BoardPrivacyFilter
	# The privacy level of the board
	privacy,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "boards/list", response)
		assert(response.data is boards_list_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **boards/list_pins**   { #boards/list_pins }
<a name="boards/list_pins"></a>

> `boards/list_pins(boardId: String,creativeTypes = null,adAccountId = "",pinMetrics = false,bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)


# Invoke an endpoint
api.boards/list_pins(
	# boardId: String = ""   Eg: boardId_example
	# Unique identifier of a board.
	boardId,
	# creativeTypes: Array
	# Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
	creativeTypes,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# pinMetrics: bool = false   Eg: true
	# Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
	pinMetrics,
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "boards/list_pins", response)
		assert(response.data is boards_list_pins_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **boards/update**   { #boards/update }
<a name="boards/update"></a>

> `boards/update(boardId: String,boardWithUpdatePrivacyUpdate: BoardWithUpdatePrivacyUpdate,adAccountId = "", on_success: Callable, on_failure: Callable)`

Update board

Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

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
var api = BoardsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BoardsApi.new(config, client)

var boardWithUpdatePrivacyUpdate = BoardWithUpdatePrivacyUpdate.new()
# … fill model boardWithUpdatePrivacyUpdate with data

# Invoke an endpoint
api.boards/update(
	# boardId: String = ""   Eg: boardId_example
	boardId,
	# boardWithUpdatePrivacyUpdate: BoardWithUpdatePrivacyUpdate
	boardWithUpdatePrivacyUpdate,
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "boards/update", response)
		assert(response.data is BoardWithUpdatePrivacy)
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

