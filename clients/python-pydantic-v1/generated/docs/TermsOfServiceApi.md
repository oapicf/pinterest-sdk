# openapi_client.TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terms_of_service_get**](TermsOfServiceApi.md#terms_of_service_get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


# **terms_of_service_get**
> TermsOfService terms_of_service_get(ad_account_id, include_html=include_html, tos_type=tos_type)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.terms_of_service import TermsOfService
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

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TermsOfServiceApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    include_html = False # bool | Return HTML in TOS text. (optional) (default to False)
    tos_type = 'tos_type_example' # str | Request type. (optional)

    try:
        # Get terms of service
        api_response = api_instance.terms_of_service_get(ad_account_id, include_html=include_html, tos_type=tos_type)
        print("The response of TermsOfServiceApi->terms_of_service_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TermsOfServiceApi->terms_of_service_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **include_html** | **bool**| Return HTML in TOS text. | [optional] [default to False]
 **tos_type** | **str**| Request type. | [optional] 

### Return type

[**TermsOfService**](TermsOfService.md)

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

