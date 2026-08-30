<a name="__pageTop"></a>
# ConversionEventsApi   { #ConversionEventsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**events/create**](#events/create) | **POST** `/ad_accounts/{ad_account_id}/events` | Send conversions

# **events/create**   { #events/create }
<a name="events/create"></a>

> `events/create(adAccountId: String,conversionEventsCreate: ConversionEventsCreate,test = null, on_success: Callable, on_failure: Callable)`

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example

* OAuth Authentication (`pinterest_oauth2`)
* Bearer Authentication (`conversion_token`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ConversionEventsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConversionEventsApi.new(config, client)

var conversionEventsCreate = ConversionEventsCreate.new()
# … fill model conversionEventsCreate with data

# Invoke an endpoint
api.events/create(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# conversionEventsCreate: ConversionEventsCreate
	conversionEventsCreate,
	# test: bool   Eg: true
	# Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
	test,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "events/create", response)
		assert(response.data is ConversionEvents)
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

