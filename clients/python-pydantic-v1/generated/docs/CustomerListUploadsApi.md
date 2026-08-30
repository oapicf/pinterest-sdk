# openapi_client.CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_list_uploads_create**](CustomerListUploadsApi.md#customer_list_uploads_create) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customer_list_uploads_get**](CustomerListUploadsApi.md#customer_list_uploads_get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customer_list_uploads_run**](CustomerListUploadsApi.md#customer_list_uploads_run) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


# **customer_list_uploads_create**
> CustomerListUploadCreateResponse customer_list_uploads_create(ad_account_id, customer_list_id, customer_list_upload_create_request)

Create customer list upload

Create a customer list upload request for multipart S3 upload.

Note: Each part must be at least 5mb; however the last part can be any size greater than 0.
Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.

**Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.customer_list_upload_create_request import CustomerListUploadCreateRequest
from openapi_client.models.customer_list_upload_create_response import CustomerListUploadCreateResponse
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
    api_instance = openapi_client.CustomerListUploadsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 
    customer_list_id = 'customer_list_id_example' # str | Customer list ID.
    customer_list_upload_create_request = openapi_client.CustomerListUploadCreateRequest() # CustomerListUploadCreateRequest | 

    try:
        # Create customer list upload
        api_response = api_instance.customer_list_uploads_create(ad_account_id, customer_list_id, customer_list_upload_create_request)
        print("The response of CustomerListUploadsApi->customer_list_uploads_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerListUploadsApi->customer_list_uploads_create: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **customer_list_id** | **str**| Customer list ID. | 
 **customer_list_upload_create_request** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)|  | 

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

# **customer_list_uploads_get**
> CustomerListUpload customer_list_uploads_get(ad_account_id, customer_list_id, customer_list_upload_id)

Get customer list upload

Get the metadata for a given upload by its ID.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.customer_list_upload import CustomerListUpload
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
    api_instance = openapi_client.CustomerListUploadsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 
    customer_list_id = 'customer_list_id_example' # str | Customer list ID.
    customer_list_upload_id = 'customer_list_upload_id_example' # str | Customer List Upload ID.

    try:
        # Get customer list upload
        api_response = api_instance.customer_list_uploads_get(ad_account_id, customer_list_id, customer_list_upload_id)
        print("The response of CustomerListUploadsApi->customer_list_uploads_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerListUploadsApi->customer_list_uploads_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **customer_list_id** | **str**| Customer list ID. | 
 **customer_list_upload_id** | **str**| Customer List Upload ID. | 

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

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

# **customer_list_uploads_run**
> CustomerListUpload customer_list_uploads_run(ad_account_id, customer_list_id, customer_list_upload_id)

Run customer list upload

Begin processing a customer list upload.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.customer_list_upload import CustomerListUpload
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
    api_instance = openapi_client.CustomerListUploadsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 
    customer_list_id = 'customer_list_id_example' # str | Customer list ID.
    customer_list_upload_id = 'customer_list_upload_id_example' # str | Customer List Upload ID.

    try:
        # Run customer list upload
        api_response = api_instance.customer_list_uploads_run(ad_account_id, customer_list_id, customer_list_upload_id)
        print("The response of CustomerListUploadsApi->customer_list_uploads_run:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerListUploadsApi->customer_list_uploads_run: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **customer_list_id** | **str**| Customer list ID. | 
 **customer_list_upload_id** | **str**| Customer List Upload ID. | 

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

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

