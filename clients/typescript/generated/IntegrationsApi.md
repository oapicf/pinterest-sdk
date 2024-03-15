# .IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrationsCommerceDel**](IntegrationsApi.md#integrationsCommerceDel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**integrationsCommerceGet**](IntegrationsApi.md#integrationsCommerceGet) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**integrationsCommercePatch**](IntegrationsApi.md#integrationsCommercePatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**integrationsCommercePost**](IntegrationsApi.md#integrationsCommercePost) | **POST** /integrations/commerce | Create commerce integration
[**integrationsGetById**](IntegrationsApi.md#integrationsGetById) | **GET** /integrations/{id} | Get integration metadata
[**integrationsGetList**](IntegrationsApi.md#integrationsGetList) | **GET** /integrations | Get integration metadata list
[**integrationsLogsPost**](IntegrationsApi.md#integrationsLogsPost) | **POST** /integrations/logs | Receives batched logs from integration applications.


# **integrationsCommerceDel**
> void integrationsCommerceDel()

Delete commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationsApi(configuration);

let body:.IntegrationsApiIntegrationsCommerceDelRequest = {
  // string | External business ID for the integration.
  externalBusinessId: "external_business_id_example",
};

apiInstance.integrationsCommerceDel(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | [**string**] | External business ID for the integration. | defaults to undefined


### Return type

**void**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Commerce Integration deleted successfully |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **integrationsCommerceGet**
> IntegrationMetadata integrationsCommerceGet()

Get commerce integration metadata associated with the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationsApi(configuration);

let body:.IntegrationsApiIntegrationsCommerceGetRequest = {
  // string | External business ID for the integration.
  externalBusinessId: "external_business_id_example",
};

apiInstance.integrationsCommerceGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | [**string**] | External business ID for the integration. | defaults to undefined


### Return type

**IntegrationMetadata**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Integration not found. |  -  |
**409** | Can\&#39;t access this integration metadata. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **integrationsCommercePatch**
> IntegrationMetadata integrationsCommercePatch()

Update commerce integration metadata for the given external business ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationsApi(configuration);

let body:.IntegrationsApiIntegrationsCommercePatchRequest = {
  // string | External business ID for the integration.
  externalBusinessId: "external_business_id_example",
  // IntegrationRequestPatch | Parameters to get create/update the Integration Metadata (optional)
  integrationRequestPatch: {
    connectedMerchantId: "connectedMerchantId_example",
    connectedAdvertiserId: "connectedAdvertiserId_example",
    connectedLbaId: "connectedLbaId_example",
    connectedTagId: "connectedTagId_example",
    partnerAccessToken: "partnerAccessToken_example",
    partnerRefreshToken: "partnerRefreshToken_example",
    partnerPrimaryEmail: "partnerPrimaryEmail_example",
    partnerAccessTokenExpiry: 3.14,
    partnerRefreshTokenExpiry: 3.14,
    scopes: "scopes_example",
    additionalId1: "additionalId1_example",
    partnerMetadata: "partnerMetadata_example",
  },
};

apiInstance.integrationsCommercePatch(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationRequestPatch** | **IntegrationRequestPatch**| Parameters to get create/update the Integration Metadata |
 **externalBusinessId** | [**string**] | External business ID for the integration. | defaults to undefined


### Return type

**IntegrationMetadata**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Integration not found. |  -  |
**409** | Can\&#39;t access this integration metadata. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **integrationsCommercePost**
> IntegrationMetadata integrationsCommercePost()

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationsApi(configuration);

let body:.IntegrationsApiIntegrationsCommercePostRequest = {
  // IntegrationRequest | Parameters to get create/update the Integration Metadata (optional)
  integrationRequest: {
    externalBusinessId: "externalBusinessId_example",
    connectedMerchantId: "connectedMerchantId_example",
    connectedAdvertiserId: "connectedAdvertiserId_example",
    connectedLbaId: "connectedLbaId_example",
    connectedTagId: "connectedTagId_example",
    partnerAccessToken: "partnerAccessToken_example",
    partnerRefreshToken: "partnerRefreshToken_example",
    partnerPrimaryEmail: "partnerPrimaryEmail_example",
    partnerAccessTokenExpiry: 1,
    partnerRefreshTokenExpiry: 1,
    scopes: "scopes_example",
    additionalId1: "additionalId1_example",
    partnerMetadata: "partnerMetadata_example",
  },
};

apiInstance.integrationsCommercePost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationRequest** | **IntegrationRequest**| Parameters to get create/update the Integration Metadata |


### Return type

**IntegrationMetadata**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Integration not found. |  -  |
**409** | Can\&#39;t access this integration metadata. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **integrationsGetById**
> IntegrationRecord integrationsGetById()

Get integration metadata by ID. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationsApi(configuration);

let body:.IntegrationsApiIntegrationsGetByIdRequest = {
  // string | Integration ID.
  id: "id_example",
};

apiInstance.integrationsGetById(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | Integration ID. | defaults to undefined


### Return type

**IntegrationRecord**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Integration not found. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **integrationsGetList**
> IntegrationsGetList200Response integrationsGetList()

Get integration metadata list. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationsApi(configuration);

let body:.IntegrationsApiIntegrationsGetListRequest = {
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

apiInstance.integrationsGetList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**IntegrationsGetList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **integrationsLogsPost**
> IntegrationLogsSuccessResponse integrationsLogsPost(integrationLogsRequest)

This endpoint receives batched logs from integration applications on partner platforms. Note: If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationsApi(configuration);

let body:.IntegrationsApiIntegrationsLogsPostRequest = {
  // IntegrationLogsRequest | Ingest log information from external integration application.
  integrationLogsRequest: {
    logs: [
      {
        clientTimestamp: 1,
        eventType: "APP",
        logLevel: "INFO",
        externalBusinessId: "externalBusinessId_example",
        advertiserId: "advertiserId_example",
        merchantId: "merchantId_example",
        tagId: "tagId_example",
        feedProfileId: "feedProfileId_example",
        message: "message_example",
        appVersionNumber: "appVersionNumber_example",
        platformVersionNumber: "platformVersionNumber_example",
        error: {
          cause: "cause_example",
          columnNumber: 1,
          fileName: "fileName_example",
          lineNumber: 1,
          message: "message_example",
          messageDetail: "messageDetail_example",
          name: "name_example",
          number: 1,
          stackTrace: "stackTrace_example",
        },
        request: {
          method: "GET",
          host: "host_example",
          path: "path_example",
          requestHeaders: {
            "key": "key_example",
          },
          responseHeaders: {
            "key": "key_example",
          },
          responseStatusCode: 1,
        },
      },
    ],
  },
};

apiInstance.integrationsLogsPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationLogsRequest** | **IntegrationLogsRequest**| Ingest log information from external integration application. |


### Return type

**IntegrationLogsSuccessResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


