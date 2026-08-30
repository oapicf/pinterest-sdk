<a name="__pageTop"></a>
# AudienceInsightsApi   { #AudienceInsightsApi }


All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audience_insights/get**](#audience_insights/get) | **GET** `/ad_accounts/{ad_account_id}/audience_insights` | Get audience insights
[**audience_insights_scope_and_type/get**](#audience_insights_scope_and_type/get) | **GET** `/ad_accounts/{ad_account_id}/insights/audiences` | Get audience insights scope and type

# **audience_insights/get**   { #audience_insights/get }
<a name="audience_insights/get"></a>

> `audience_insights/get(adAccountId: String,audienceInsightType: AudienceInsightType, on_success: Callable, on_failure: Callable)`

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).

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
var api = AudienceInsightsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudienceInsightsApi.new(config, client)


# Invoke an endpoint
api.audience_insights/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# audienceInsightType: AudienceInsightType
	# Type of audience insights.
	audienceInsightType,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "audience_insights/get", response)
		assert(response.data is AudienceInsights)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **audience_insights_scope_and_type/get**   { #audience_insights_scope_and_type/get }
<a name="audience_insights_scope_and_type/get"></a>

> `audience_insights_scope_and_type/get(adAccountId: String, on_success: Callable, on_failure: Callable)`

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

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
var api = AudienceInsightsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = AudienceInsightsApi.new(config, client)


# Invoke an endpoint
api.audience_insights_scope_and_type/get(
	# adAccountId: String = ""   Eg: adAccountId_example
	# Unique identifier of an ad account.
	adAccountId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "audience_insights_scope_and_type/get", response)
		assert(response.data is audience_insights_scope_and_type_get_200_response)
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

