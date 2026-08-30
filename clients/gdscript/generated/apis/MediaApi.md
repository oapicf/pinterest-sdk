<a name="__pageTop"></a>
# MediaApi   { #MediaApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**media/create**](#media/create) | **POST** `/media` | Register media upload
[**media/get**](#media/get) | **GET** `/media/{media_id}` | Get media upload details
[**media/list**](#media/list) | **GET** `/media` | List media uploads

# **media/create**   { #media/create }
<a name="media/create"></a>

> `media/create(mediaUploadCreate: MediaUploadCreate, on_success: Callable, on_failure: Callable)`

Register media upload

Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

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
var api = MediaApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MediaApi.new(config, client)

var mediaUploadCreate = MediaUploadCreate.new()
# … fill model mediaUploadCreate with data

# Invoke an endpoint
api.media/create(
	# mediaUploadCreate: MediaUploadCreate
	mediaUploadCreate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "media/create", response)
		assert(response.data is MediaUpload)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **media/get**   { #media/get }
<a name="media/get"></a>

> `media/get(mediaId: String, on_success: Callable, on_failure: Callable)`

Get media upload details

Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

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
var api = MediaApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MediaApi.new(config, client)


# Invoke an endpoint
api.media/get(
	# mediaId: String = ""   Eg: mediaId_example
	# Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
	mediaId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "media/get", response)
		assert(response.data is Media)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **media/list**   { #media/list }
<a name="media/list"></a>

> `media/list(bookmark = "",pageSize = 25, on_success: Callable, on_failure: Callable)`

List media uploads

List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

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
var api = MediaApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MediaApi.new(config, client)


# Invoke an endpoint
api.media/list(
	# bookmark: String = ""   Eg: bookmark_example
	# Cursor used to fetch the next page of items
	bookmark,
	# pageSize: int = 25   Eg: 56
	# Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
	pageSize,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "media/list", response)
		assert(response.data is media_list_200_response)
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

