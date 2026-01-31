# pinterestsdk.CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_list_uploads_create**](CustomerListUploadsApi.md#customer_list_uploads_create) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customer_list_uploads_get**](CustomerListUploadsApi.md#customer_list_uploads_get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customer_list_uploads_run**](CustomerListUploadsApi.md#customer_list_uploads_run) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


# **customer_list_uploads_create**
> CustomerListUploadCreateResponse customer_list_uploads_create(ad_account_id, customer_list_id, customer_list_upload_create_request)

Create customer list upload

<a href="/docs/getting-started/using-beta-and-restricted-features/" target="_blank">Closed beta</a>

<p>Create a customer list upload request for multipart S3 upload.</p>
<p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0.
Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p>
<p><b>Please review the <u><a href="/docs/api/v5/customer_lists-update/" target="_blank">update customer list endpoint</a></u> documentation for additional information.</b></p>

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.customer_list_upload_create_request import CustomerListUploadCreateRequest
from pinterestsdk.models.customer_list_upload_create_response import CustomerListUploadCreateResponse
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
    api_instance = pinterestsdk.CustomerListUploadsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    customer_list_id = 'customer_list_id_example' # str | Unique identifier of a customer list
    customer_list_upload_create_request = pinterestsdk.CustomerListUploadCreateRequest() # CustomerListUploadCreateRequest | Parameters to create a customer list upload request

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
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **customer_list_id** | **str**| Unique identifier of a customer list | 
 **customer_list_upload_create_request** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)| Parameters to create a customer list upload request | 

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
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_list_uploads_get**
> CustomerListUploadResponse customer_list_uploads_get(ad_account_id, customer_list_id, customer_list_upload_id)

Get customer list upload

<a href="/docs/getting-started/using-beta-and-restricted-features/" target="_blank">Closed beta</a>
<p>Get the metadata for a given upload by its ID.</p>

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.customer_list_upload_response import CustomerListUploadResponse
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
    api_instance = pinterestsdk.CustomerListUploadsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    customer_list_id = 'customer_list_id_example' # str | Unique identifier of a customer list
    customer_list_upload_id = 'customer_list_upload_id_example' # str | Unique identifier of a customer list upload

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
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **customer_list_id** | **str**| Unique identifier of a customer list | 
 **customer_list_upload_id** | **str**| Unique identifier of a customer list upload | 

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_list_uploads_run**
> CustomerListUploadResponse customer_list_uploads_run(ad_account_id, customer_list_id, customer_list_upload_id)

Run customer list upload

<a href="/docs/getting-started/using-beta-and-restricted-features/" target="_blank">Closed beta</a>
<p>Begin processing a customer list upload.</p>

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.customer_list_upload_response import CustomerListUploadResponse
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
    api_instance = pinterestsdk.CustomerListUploadsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    customer_list_id = 'customer_list_id_example' # str | Unique identifier of a customer list
    customer_list_upload_id = 'customer_list_upload_id_example' # str | Unique identifier of a customer list upload

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
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **customer_list_id** | **str**| Unique identifier of a customer list | 
 **customer_list_upload_id** | **str**| Unique identifier of a customer list upload | 

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

