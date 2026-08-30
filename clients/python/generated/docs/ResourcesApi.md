# pinterestsdk.ResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_countries_get**](ResourcesApi.md#ad_account_countries_get) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**delivery_metrics_get**](ResourcesApi.md#delivery_metrics_get) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
[**interest_targeting_options_get**](ResourcesApi.md#interest_targeting_options_get) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**lead_form_questions_get**](ResourcesApi.md#lead_form_questions_get) | **GET** /resources/lead_form_questions | Get lead form questions
[**metrics_ready_state_get**](ResourcesApi.md#metrics_ready_state_get) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**targeting_options_get**](ResourcesApi.md#targeting_options_get) | **GET** /resources/targeting/{targeting_type} | Get targeting options


# **ad_account_countries_get**
> AdAccountCountriesGet200Response ad_account_countries_get()

Get ad accounts countries

Get Ad Accounts countries

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.ad_account_countries_get200_response import AdAccountCountriesGet200Response
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
    api_instance = pinterestsdk.ResourcesApi(api_client)

    try:
        # Get ad accounts countries
        api_response = api_instance.ad_account_countries_get()
        print("The response of ResourcesApi->ad_account_countries_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourcesApi->ad_account_countries_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**AdAccountCountriesGet200Response**](AdAccountCountriesGet200Response.md)

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

# **delivery_metrics_get**
> DeliveryMetricsGet200Response delivery_metrics_get(report_type=report_type)

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints.
The `display_name` attribute will match how the metric is named in our native tools like Ads Manager.
See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.delivery_metrics_get200_response import DeliveryMetricsGet200Response
from pinterestsdk.models.report_type import ReportType
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
    api_instance = pinterestsdk.ResourcesApi(api_client)
    report_type = pinterestsdk.ReportType() # ReportType | Report type. (optional)

    try:
        # Get available metrics' definitions
        api_response = api_instance.delivery_metrics_get(report_type=report_type)
        print("The response of ResourcesApi->delivery_metrics_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourcesApi->delivery_metrics_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_type** | [**ReportType**](.md)| Report type. | [optional] 

### Return type

[**DeliveryMetricsGet200Response**](DeliveryMetricsGet200Response.md)

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

# **interest_targeting_options_get**
> SingleInterestTargetingOption interest_targeting_options_get(interest_id)

Get interest details

Get details of a specific interest given interest ID.

Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.single_interest_targeting_option import SingleInterestTargetingOption
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
    api_instance = pinterestsdk.ResourcesApi(api_client)
    interest_id = 'interest_id_example' # str | Unique identifier of an interest.

    try:
        # Get interest details
        api_response = api_instance.interest_targeting_options_get(interest_id)
        print("The response of ResourcesApi->interest_targeting_options_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourcesApi->interest_targeting_options_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interest_id** | **str**| Unique identifier of an interest. | 

### Return type

[**SingleInterestTargetingOption**](SingleInterestTargetingOption.md)

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

# **lead_form_questions_get**
> lead_form_questions_get()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
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

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.ResourcesApi(api_client)

    try:
        # Get lead form questions
        api_instance.lead_form_questions_get()
    except Exception as e:
        print("Exception when calling ResourcesApi->lead_form_questions_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

# **metrics_ready_state_get**
> BookClosed metrics_ready_state_get(var_date)

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.book_closed import BookClosed
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

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.ResourcesApi(api_client)
    var_date = 'var_date_example' # str | Analytics reports request date (UTC). Format: YYYY-MM-DD

    try:
        # Get metrics ready state
        api_response = api_instance.metrics_ready_state_get(var_date)
        print("The response of ResourcesApi->metrics_ready_state_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourcesApi->metrics_ready_state_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **var_date** | **str**| Analytics reports request date (UTC). Format: YYYY-MM-DD | 

### Return type

[**BookClosed**](BookClosed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

# **targeting_options_get**
> List[object] targeting_options_get(targeting_type, ad_account_id=ad_account_id, client_id=client_id, oauth_signature=oauth_signature, timestamp=timestamp)

Get targeting options

    You can use targeting values in ads placement to define your intended audience.

    Targeting metrics are organized around targeting specifications.

    For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).

    **Sample return:**

    ```
    [{"36313": "Australia: Moreton Bay - North", "124735": "Canada: North Battleford", "36109": "Australia: Murray", "36108": "Australia: Mid North Coast", "36101": "Australia: Capital Region", "811": "U.S.: Reno", "36103": "Australia: Central West", "36102": "Australia: Central Coast", "36105": "Australia: Far West and Orana", "36104": "Australia: Coffs Harbour - Grafton", "36107": "Australia: Illawarra", "36106": "Australia: Hunter Valley Exc Newcastle", "554017": "New Zealand: Wanganui", "554016": "New Zealand: Marlborough", "554015": "New Zealand: Gisborne", "554014": "New Zealand: Tararua", "554013": "New Zealand: Invercargill", "GR": "Greece", "554011": "New Zealand: Whangarei", "554010": "New Zealand: Far North", "717": "U.S.: Quincy-Hannibal-Keokuk", "716": "U.S.: Baton Rouge",...}]
    ```

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.public_targeting_type import PublicTargetingType
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
    api_instance = pinterestsdk.ResourcesApi(api_client)
    targeting_type = pinterestsdk.PublicTargetingType() # PublicTargetingType | Public targeting type
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)
    client_id = 'client_id_example' # str | Client ID (optional)
    oauth_signature = 'oauth_signature_example' # str | Oauth signature (optional)
    timestamp = 'timestamp_example' # str | Timestamp. (optional)

    try:
        # Get targeting options
        api_response = api_instance.targeting_options_get(targeting_type, ad_account_id=ad_account_id, client_id=client_id, oauth_signature=oauth_signature, timestamp=timestamp)
        print("The response of ResourcesApi->targeting_options_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ResourcesApi->targeting_options_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targeting_type** | [**PublicTargetingType**](.md)| Public targeting type | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 
 **client_id** | **str**| Client ID | [optional] 
 **oauth_signature** | **str**| Oauth signature | [optional] 
 **timestamp** | **str**| Timestamp. | [optional] 

### Return type

**List[object]**

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

