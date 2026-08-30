# openapi_client.ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_defined_events_create**](ConversionsApi.md#advertiser_defined_events_create) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiser_defined_events_delete**](ConversionsApi.md#advertiser_defined_events_delete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiser_defined_events_get**](ConversionsApi.md#advertiser_defined_events_get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiser_defined_events_update**](ConversionsApi.md#advertiser_defined_events_update) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


# **advertiser_defined_events_create**
> AdvertiserDefinedEventsCreate200Response advertiser_defined_events_create(ad_account_id, advertiser_defined_events_create_request)

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.advertiser_defined_events_create200_response import AdvertiserDefinedEventsCreate200Response
from openapi_client.models.advertiser_defined_events_create_request import AdvertiserDefinedEventsCreateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConversionsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    advertiser_defined_events_create_request = openapi_client.AdvertiserDefinedEventsCreateRequest() # AdvertiserDefinedEventsCreateRequest | 

    try:
        # Create advertiser defined events
        api_response = api_instance.advertiser_defined_events_create(ad_account_id, advertiser_defined_events_create_request)
        print("The response of ConversionsApi->advertiser_defined_events_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConversionsApi->advertiser_defined_events_create: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
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

# **advertiser_defined_events_delete**
> AdvertiserDefinedEventsCreate200Response advertiser_defined_events_delete(ad_account_id, event_names)

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.advertiser_defined_events_create200_response import AdvertiserDefinedEventsCreate200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConversionsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    event_names = ['event_names_example'] # List[str] | List of event names to delete

    try:
        # Delete advertiser defined events
        api_response = api_instance.advertiser_defined_events_delete(ad_account_id, event_names)
        print("The response of ConversionsApi->advertiser_defined_events_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConversionsApi->advertiser_defined_events_delete: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **event_names** | [**List[str]**](str.md)| List of event names to delete | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

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

# **advertiser_defined_events_get**
> AdvertiserDefinedEventsGet200Response advertiser_defined_events_get(ad_account_id)

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.advertiser_defined_events_get200_response import AdvertiserDefinedEventsGet200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConversionsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.

    try:
        # Get advertiser defined events
        api_response = api_instance.advertiser_defined_events_get(ad_account_id)
        print("The response of ConversionsApi->advertiser_defined_events_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConversionsApi->advertiser_defined_events_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 

### Return type

[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md)

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

# **advertiser_defined_events_update**
> AdvertiserDefinedEventsCreate200Response advertiser_defined_events_update(ad_account_id, advertiser_defined_events_create_request)

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.advertiser_defined_events_create200_response import AdvertiserDefinedEventsCreate200Response
from openapi_client.models.advertiser_defined_events_create_request import AdvertiserDefinedEventsCreateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConversionsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    advertiser_defined_events_create_request = openapi_client.AdvertiserDefinedEventsCreateRequest() # AdvertiserDefinedEventsCreateRequest | 

    try:
        # Update advertiser defined events
        api_response = api_instance.advertiser_defined_events_update(ad_account_id, advertiser_defined_events_create_request)
        print("The response of ConversionsApi->advertiser_defined_events_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ConversionsApi->advertiser_defined_events_update: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
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

