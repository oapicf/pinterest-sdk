# pinterestsdk.AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audience_insights_get**](AudienceInsightsApi.md#audience_insights_get) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**audience_insights_scope_and_type_get**](AudienceInsightsApi.md#audience_insights_scope_and_type_get) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type


# **audience_insights_get**
> AudienceInsights audience_insights_get(ad_account_id, audience_insight_type)

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.

[Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.audience_insight_type import AudienceInsightType
from pinterestsdk.models.audience_insights import AudienceInsights
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AudienceInsightsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    audience_insight_type = pinterestsdk.AudienceInsightType() # AudienceInsightType | Type of audience insights.

    try:
        # Get audience insights
        api_response = api_instance.audience_insights_get(ad_account_id, audience_insight_type)
        print("The response of AudienceInsightsApi->audience_insights_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudienceInsightsApi->audience_insights_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **audience_insight_type** | [**AudienceInsightType**](.md)| Type of audience insights. | 

### Return type

[**AudienceInsights**](AudienceInsights.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audience_insights_scope_and_type_get**
> AudienceInsightsScopeAndTypeGet200Response audience_insights_scope_and_type_get(ad_account_id)

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.audience_insights_scope_and_type_get200_response import AudienceInsightsScopeAndTypeGet200Response
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AudienceInsightsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.

    try:
        # Get audience insights scope and type
        api_response = api_instance.audience_insights_scope_and_type_get(ad_account_id)
        print("The response of AudienceInsightsApi->audience_insights_scope_and_type_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudienceInsightsApi->audience_insights_scope_and_type_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 

### Return type

[**AudienceInsightsScopeAndTypeGet200Response**](AudienceInsightsScopeAndTypeGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

