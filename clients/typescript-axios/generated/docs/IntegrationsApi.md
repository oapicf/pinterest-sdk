# IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**integrationsCommerceDel**](#integrationscommercedel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration|
|[**integrationsCommerceGet**](#integrationscommerceget) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration|
|[**integrationsCommercePatch**](#integrationscommercepatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration|
|[**integrationsCommercePost**](#integrationscommercepost) | **POST** /integrations/commerce | Create commerce integration|
|[**integrationsGetById**](#integrationsgetbyid) | **GET** /integrations/{id} | Get integration metadata|
|[**integrationsGetList**](#integrationsgetlist) | **GET** /integrations | Get integration metadata list|
|[**integrationsLogsPost**](#integrationslogspost) | **POST** /integrations/logs | Receives batched logs from integration applications.|

# **integrationsCommerceDel**
> IntegrationMetadata integrationsCommerceDel()

Delete commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```typescript
import {
    IntegrationsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new IntegrationsApi(configuration);

let externalBusinessId: string; //External business ID for the integration. (default to undefined)

const { status, data } = await apiInstance.integrationsCommerceDel(
    externalBusinessId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **externalBusinessId** | [**string**] | External business ID for the integration. | defaults to undefined|


### Return type

**IntegrationMetadata**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**204** | Resource deleted successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsCommerceGet**
> IntegrationMetadata integrationsCommerceGet()

Get commerce integration metadata associated with the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```typescript
import {
    IntegrationsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new IntegrationsApi(configuration);

let externalBusinessId: string; //External business ID for the integration. (default to undefined)

const { status, data } = await apiInstance.integrationsCommerceGet(
    externalBusinessId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **externalBusinessId** | [**string**] | External business ID for the integration. | defaults to undefined|


### Return type

**IntegrationMetadata**

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

# **integrationsCommercePatch**
> IntegrationMetadata integrationsCommercePatch(integrationMetadataUpdate)

Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```typescript
import {
    IntegrationsApi,
    Configuration,
    IntegrationMetadataUpdate
} from './api';

const configuration = new Configuration();
const apiInstance = new IntegrationsApi(configuration);

let externalBusinessId: string; //External business ID for the integration. (default to undefined)
let integrationMetadataUpdate: IntegrationMetadataUpdate; //

const { status, data } = await apiInstance.integrationsCommercePatch(
    externalBusinessId,
    integrationMetadataUpdate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **integrationMetadataUpdate** | **IntegrationMetadataUpdate**|  | |
| **externalBusinessId** | [**string**] | External business ID for the integration. | defaults to undefined|


### Return type

**IntegrationMetadata**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
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

# **integrationsCommercePost**
> IntegrationMetadata integrationsCommercePost(integrationMetadataCreate)

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```typescript
import {
    IntegrationsApi,
    Configuration,
    IntegrationMetadataCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new IntegrationsApi(configuration);

let integrationMetadataCreate: IntegrationMetadataCreate; //

const { status, data } = await apiInstance.integrationsCommercePost(
    integrationMetadataCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **integrationMetadataCreate** | **IntegrationMetadataCreate**|  | |


### Return type

**IntegrationMetadata**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsGetById**
> IntegrationRecord integrationsGetById()

Get integration metadata by ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```typescript
import {
    IntegrationsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new IntegrationsApi(configuration);

let id: string; //Integration record ID. (default to undefined)

const { status, data } = await apiInstance.integrationsGetById(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**string**] | Integration record ID. | defaults to undefined|


### Return type

**IntegrationRecord**

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

# **integrationsGetList**
> IntegrationsGetList200Response integrationsGetList()

Get integration metadata list. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```typescript
import {
    IntegrationsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new IntegrationsApi(configuration);

let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.integrationsGetList(
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**IntegrationsGetList200Response**

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

# **integrationsLogsPost**
> IntegrationLogsSuccessResponse integrationsLogsPost(integrationLogsRequestCreate)

This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```typescript
import {
    IntegrationsApi,
    Configuration,
    IntegrationLogsRequestCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new IntegrationsApi(configuration);

let integrationLogsRequestCreate: IntegrationLogsRequestCreate; //

const { status, data } = await apiInstance.integrationsLogsPost(
    integrationLogsRequestCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **integrationLogsRequestCreate** | **IntegrationLogsRequestCreate**|  | |


### Return type

**IntegrationLogsSuccessResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The server could not understand the request due to invalid syntax. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

