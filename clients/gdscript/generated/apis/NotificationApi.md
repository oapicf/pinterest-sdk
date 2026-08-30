<a name="__pageTop"></a>
# NotificationApi   { #NotificationApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notification/post**](#notification/post) | **POST** `/notifications` | Receive notifications from external partners.

# **notification/post**   { #notification/post }
<a name="notification/post"></a>

> `notification/post(notificationPostRequest: NotificationPostRequest, on_success: Callable, on_failure: Callable)`

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

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
var api = NotificationApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = NotificationApi.new(config, client)

var notificationPostRequest = NotificationPostRequest.new()
# … fill model notificationPostRequest with data

# Invoke an endpoint
api.notification/post(
	# notificationPostRequest: NotificationPostRequest
	notificationPostRequest,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "notification/post", response)
		assert(response.data is NotificationResponse)
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

