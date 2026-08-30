# openapi_client.ProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**product_tags_bulk_add**](ProductTagsApi.md#product_tags_bulk_add) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**product_tags_bulk_delete**](ProductTagsApi.md#product_tags_bulk_delete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**product_tags_list**](ProductTagsApi.md#product_tags_list) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin


# **product_tags_bulk_add**
> ProductTagsResponse product_tags_bulk_add(pin_id, product_tags_bulk_add_request)

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin.
- Maximum 24 product tags can be added in a single request.
- Duplicate pin_ids in the request will result in an error.
- If any product tag fails eligibility check, the entire request fails (all-or-nothing).
- If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.product_tags_bulk_add_request import ProductTagsBulkAddRequest
from openapi_client.models.product_tags_response import ProductTagsResponse
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
    api_instance = openapi_client.ProductTagsApi(api_client)
    pin_id = 'pin_id_example' # str | Unique identifier of the hero pin that will receive product tags.
    product_tags_bulk_add_request = openapi_client.ProductTagsBulkAddRequest() # ProductTagsBulkAddRequest | 

    try:
        # Add product tags to pin
        api_response = api_instance.product_tags_bulk_add(pin_id, product_tags_bulk_add_request)
        print("The response of ProductTagsApi->product_tags_bulk_add:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProductTagsApi->product_tags_bulk_add: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **str**| Unique identifier of the hero pin that will receive product tags. | 
 **product_tags_bulk_add_request** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md)|  | 

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request contains ineligible product tags. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_tags_bulk_delete**
> product_tags_bulk_delete(pin_id, product_tags_bulk_delete_request)

Delete product tags from pin

Delete product tags from a pin.
- If a product tag is not found on the pin, it is treated as a no-op success.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.product_tags_bulk_delete_request import ProductTagsBulkDeleteRequest
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
    api_instance = openapi_client.ProductTagsApi(api_client)
    pin_id = 'pin_id_example' # str | Unique identifier of the hero pin that will receive product tags.
    product_tags_bulk_delete_request = openapi_client.ProductTagsBulkDeleteRequest() # ProductTagsBulkDeleteRequest | 

    try:
        # Delete product tags from pin
        api_instance.product_tags_bulk_delete(pin_id, product_tags_bulk_delete_request)
    except Exception as e:
        print("Exception when calling ProductTagsApi->product_tags_bulk_delete: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **str**| Unique identifier of the hero pin that will receive product tags. | 
 **product_tags_bulk_delete_request** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Resource deleted successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_tags_list**
> ProductTagsResponse product_tags_list(pin_id)

Get product tags for pin

Retrieve all product tags for a pin.
- Returns an empty array if the pin has no product tags.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.product_tags_response import ProductTagsResponse
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
    api_instance = openapi_client.ProductTagsApi(api_client)
    pin_id = 'pin_id_example' # str | Unique identifier of the hero pin that will receive product tags.

    try:
        # Get product tags for pin
        api_response = api_instance.product_tags_list(pin_id)
        print("The response of ProductTagsApi->product_tags_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ProductTagsApi->product_tags_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **str**| Unique identifier of the hero pin that will receive product tags. | 

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

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

