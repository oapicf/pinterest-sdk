# ProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**productTagsBulkAdd**](#producttagsbulkadd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin|
|[**productTagsBulkDelete**](#producttagsbulkdelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin|
|[**productTagsList**](#producttagslist) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin|

# **productTagsBulkAdd**
> ProductTagsResponse productTagsBulkAdd(productTagsBulkAddRequest)

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example

```typescript
import {
    ProductTagsApi,
    Configuration,
    ProductTagsBulkAddRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ProductTagsApi(configuration);

let pinId: string; //Unique identifier of the hero pin that will receive product tags. (default to undefined)
let productTagsBulkAddRequest: ProductTagsBulkAddRequest; //

const { status, data } = await apiInstance.productTagsBulkAdd(
    pinId,
    productTagsBulkAddRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **productTagsBulkAddRequest** | **ProductTagsBulkAddRequest**|  | |
| **pinId** | [**string**] | Unique identifier of the hero pin that will receive product tags. | defaults to undefined|


### Return type

**ProductTagsResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request contains ineligible product tags. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productTagsBulkDelete**
> productTagsBulkDelete(productTagsBulkDeleteRequest)

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Example

```typescript
import {
    ProductTagsApi,
    Configuration,
    ProductTagsBulkDeleteRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ProductTagsApi(configuration);

let pinId: string; //Unique identifier of the hero pin that will receive product tags. (default to undefined)
let productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest; //

const { status, data } = await apiInstance.productTagsBulkDelete(
    pinId,
    productTagsBulkDeleteRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **productTagsBulkDeleteRequest** | **ProductTagsBulkDeleteRequest**|  | |
| **pinId** | [**string**] | Unique identifier of the hero pin that will receive product tags. | defaults to undefined|


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
|**204** | Resource deleted successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productTagsList**
> ProductTagsResponse productTagsList()

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Example

```typescript
import {
    ProductTagsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProductTagsApi(configuration);

let pinId: string; //Unique identifier of the hero pin that will receive product tags. (default to undefined)

const { status, data } = await apiInstance.productTagsList(
    pinId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pinId** | [**string**] | Unique identifier of the hero pin that will receive product tags. | defaults to undefined|


### Return type

**ProductTagsResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

