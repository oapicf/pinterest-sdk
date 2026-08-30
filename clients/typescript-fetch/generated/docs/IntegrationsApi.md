# IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**integrationsCommerceDel**](IntegrationsApi.md#integrationscommercedel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration |
| [**integrationsCommerceGet**](IntegrationsApi.md#integrationscommerceget) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration |
| [**integrationsCommercePatch**](IntegrationsApi.md#integrationscommercepatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration |
| [**integrationsCommercePost**](IntegrationsApi.md#integrationscommercepost) | **POST** /integrations/commerce | Create commerce integration |
| [**integrationsGetById**](IntegrationsApi.md#integrationsgetbyid) | **GET** /integrations/{id} | Get integration metadata |
| [**integrationsGetList**](IntegrationsApi.md#integrationsgetlist) | **GET** /integrations | Get integration metadata list |
| [**integrationsLogsPost**](IntegrationsApi.md#integrationslogspost) | **POST** /integrations/logs | Receives batched logs from integration applications. |



## integrationsCommerceDel

> IntegrationMetadata integrationsCommerceDel(externalBusinessId)

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```ts
import {
  Configuration,
  IntegrationsApi,
} from '';
import type { IntegrationsCommerceDelRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new IntegrationsApi(config);

  const body = {
    // string | External business ID for the integration.
    externalBusinessId: externalBusinessId_example,
  } satisfies IntegrationsCommerceDelRequest;

  try {
    const data = await api.integrationsCommerceDel(body);
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
| **externalBusinessId** | `string` | External business ID for the integration. | [Defaults to `undefined`] |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## integrationsCommerceGet

> IntegrationMetadata integrationsCommerceGet(externalBusinessId)

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```ts
import {
  Configuration,
  IntegrationsApi,
} from '';
import type { IntegrationsCommerceGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new IntegrationsApi(config);

  const body = {
    // string | External business ID for the integration.
    externalBusinessId: externalBusinessId_example,
  } satisfies IntegrationsCommerceGetRequest;

  try {
    const data = await api.integrationsCommerceGet(body);
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
| **externalBusinessId** | `string` | External business ID for the integration. | [Defaults to `undefined`] |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

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


## integrationsCommercePatch

> IntegrationMetadata integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```ts
import {
  Configuration,
  IntegrationsApi,
} from '';
import type { IntegrationsCommercePatchRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new IntegrationsApi(config);

  const body = {
    // string | External business ID for the integration.
    externalBusinessId: externalBusinessId_example,
    // IntegrationMetadataUpdate
    integrationMetadataUpdate: ...,
  } satisfies IntegrationsCommercePatchRequest;

  try {
    const data = await api.integrationsCommercePatch(body);
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
| **externalBusinessId** | `string` | External business ID for the integration. | [Defaults to `undefined`] |
| **integrationMetadataUpdate** | [IntegrationMetadataUpdate](IntegrationMetadataUpdate.md) |  | |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
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


## integrationsCommercePost

> IntegrationMetadata integrationsCommercePost(integrationMetadataCreate)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```ts
import {
  Configuration,
  IntegrationsApi,
} from '';
import type { IntegrationsCommercePostRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new IntegrationsApi(config);

  const body = {
    // IntegrationMetadataCreate
    integrationMetadataCreate: ...,
  } satisfies IntegrationsCommercePostRequest;

  try {
    const data = await api.integrationsCommercePost(body);
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
| **integrationMetadataCreate** | [IntegrationMetadataCreate](IntegrationMetadataCreate.md) |  | |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## integrationsGetById

> IntegrationRecord integrationsGetById(id)

Get integration metadata

Get integration metadata by ID. Note: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```ts
import {
  Configuration,
  IntegrationsApi,
} from '';
import type { IntegrationsGetByIdRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new IntegrationsApi(config);

  const body = {
    // string | Integration record ID.
    id: id_example,
  } satisfies IntegrationsGetByIdRequest;

  try {
    const data = await api.integrationsGetById(body);
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
| **id** | `string` | Integration record ID. | [Defaults to `undefined`] |

### Return type

[**IntegrationRecord**](IntegrationRecord.md)

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


## integrationsGetList

> IntegrationsGetList200Response integrationsGetList(bookmark, pageSize)

Get integration metadata list

Get integration metadata list. Note: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```ts
import {
  Configuration,
  IntegrationsApi,
} from '';
import type { IntegrationsGetListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new IntegrationsApi(config);

  const body = {
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies IntegrationsGetListRequest;

  try {
    const data = await api.integrationsGetList(body);
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
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md)

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


## integrationsLogsPost

> IntegrationLogsSuccessResponse integrationsLogsPost(integrationLogsRequestCreate)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```ts
import {
  Configuration,
  IntegrationsApi,
} from '';
import type { IntegrationsLogsPostRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new IntegrationsApi(config);

  const body = {
    // IntegrationLogsRequestCreate
    integrationLogsRequestCreate: ...,
  } satisfies IntegrationsLogsPostRequest;

  try {
    const data = await api.integrationsLogsPost(body);
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
| **integrationLogsRequestCreate** | [IntegrationLogsRequestCreate](IntegrationLogsRequestCreate.md) |  | |

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The server could not understand the request due to invalid syntax. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

