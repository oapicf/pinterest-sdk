# ProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productTagsBulkAdd**](ProductTagsApi.md#producttagsbulkaddoperation) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin |
| [**productTagsBulkDelete**](ProductTagsApi.md#producttagsbulkdeleteoperation) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin |
| [**productTagsList**](ProductTagsApi.md#producttagslist) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin |



## productTagsBulkAdd

> ProductTagsResponse productTagsBulkAdd(pinId, productTagsBulkAddRequest)

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example

```ts
import {
  Configuration,
  ProductTagsApi,
} from '';
import type { ProductTagsBulkAddOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new ProductTagsApi(config);

  const body = {
    // string | Unique identifier of the hero pin that will receive product tags.
    pinId: pinId_example,
    // ProductTagsBulkAddRequest
    productTagsBulkAddRequest: ...,
  } satisfies ProductTagsBulkAddOperationRequest;

  try {
    const data = await api.productTagsBulkAdd(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | `string` | Unique identifier of the hero pin that will receive product tags. | [Defaults to `undefined`] |
| **productTagsBulkAddRequest** | [ProductTagsBulkAddRequest](ProductTagsBulkAddRequest.md) |  | |

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request contains ineligible product tags. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## productTagsBulkDelete

> productTagsBulkDelete(pinId, productTagsBulkDeleteRequest)

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Example

```ts
import {
  Configuration,
  ProductTagsApi,
} from '';
import type { ProductTagsBulkDeleteOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new ProductTagsApi(config);

  const body = {
    // string | Unique identifier of the hero pin that will receive product tags.
    pinId: pinId_example,
    // ProductTagsBulkDeleteRequest
    productTagsBulkDeleteRequest: ...,
  } satisfies ProductTagsBulkDeleteOperationRequest;

  try {
    const data = await api.productTagsBulkDelete(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | `string` | Unique identifier of the hero pin that will receive product tags. | [Defaults to `undefined`] |
| **productTagsBulkDeleteRequest** | [ProductTagsBulkDeleteRequest](ProductTagsBulkDeleteRequest.md) |  | |

### Return type

`void` (Empty response body)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## productTagsList

> ProductTagsResponse productTagsList(pinId)

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Example

```ts
import {
  Configuration,
  ProductTagsApi,
} from '';
import type { ProductTagsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new ProductTagsApi(config);

  const body = {
    // string | Unique identifier of the hero pin that will receive product tags.
    pinId: pinId_example,
  } satisfies ProductTagsListRequest;

  try {
    const data = await api.productTagsList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | `string` | Unique identifier of the hero pin that will receive product tags. | [Defaults to `undefined`] |

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

