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
> integrationsCommerceDel()

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

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**204** | Commerce Integration deleted successfully |  -  |
|**0** | Unexpected error. |  -  |

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
|**200** | Success |  -  |
|**404** | Integration not found. |  -  |
|**409** | Can\&#39;t access this integration metadata. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsCommercePatch**
> IntegrationMetadata integrationsCommercePatch(integrationRequestPatch)

Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```typescript
import {
    IntegrationsApi,
    Configuration,
    IntegrationRequestPatch
} from './api';

const configuration = new Configuration();
const apiInstance = new IntegrationsApi(configuration);

let externalBusinessId: string; //External business ID for the integration. (default to undefined)
let integrationRequestPatch: IntegrationRequestPatch; //Parameters to get create/update the Integration Metadata

const { status, data } = await apiInstance.integrationsCommercePatch(
    externalBusinessId,
    integrationRequestPatch
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **integrationRequestPatch** | **IntegrationRequestPatch**| Parameters to get create/update the Integration Metadata | |
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
|**200** | Success |  -  |
|**404** | Integration not found. |  -  |
|**409** | Can\&#39;t access this integration metadata. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsCommercePost**
> IntegrationMetadata integrationsCommercePost(integrationRequest)

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```typescript
import {
    IntegrationsApi,
    Configuration,
    IntegrationRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new IntegrationsApi(configuration);

let integrationRequest: IntegrationRequest; //Parameters to get create/update the Integration Metadata

const { status, data } = await apiInstance.integrationsCommercePost(
    integrationRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **integrationRequest** | **IntegrationRequest**| Parameters to get create/update the Integration Metadata | |


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
|**200** | Success |  -  |
|**404** | Integration not found. |  -  |
|**409** | Can\&#39;t access this integration metadata. |  -  |
|**0** | Unexpected error. |  -  |

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

let id: string; //Integration ID. (default to undefined)

const { status, data } = await apiInstance.integrationsGetById(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**string**] | Integration ID. | defaults to undefined|


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
|**200** | Success |  -  |
|**404** | Integration not found. |  -  |
|**0** | Unexpected error. |  -  |

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
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

const { status, data } = await apiInstance.integrationsGetList(
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|


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
|**200** | Success |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsLogsPost**
> IntegrationLogsSuccessResponse integrationsLogsPost(integrationLogsRequest)

This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```typescript
import {
    IntegrationsApi,
    Configuration,
    IntegrationLogsRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new IntegrationsApi(configuration);

let integrationLogsRequest: IntegrationLogsRequest; //Ingest log information from external integration application.

const { status, data } = await apiInstance.integrationsLogsPost(
    integrationLogsRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **integrationLogsRequest** | **IntegrationLogsRequest**| Ingest log information from external integration application. | |


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
|**200** | Success. |  -  |
|**400** | Bad request. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

