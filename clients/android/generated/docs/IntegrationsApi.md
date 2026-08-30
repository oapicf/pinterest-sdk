# IntegrationsApi

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



## integrationsCommerceDel

> IntegrationMetadata integrationsCommerceDel(externalBusinessId)

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
String externalBusinessId = null; // String | External business ID for the integration.
try {
    IntegrationMetadata result = apiInstance.integrationsCommerceDel(externalBusinessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#integrationsCommerceDel");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **String**| External business ID for the integration. | [default to null]

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## integrationsCommerceGet

> IntegrationMetadata integrationsCommerceGet(externalBusinessId)

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
String externalBusinessId = null; // String | External business ID for the integration.
try {
    IntegrationMetadata result = apiInstance.integrationsCommerceGet(externalBusinessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#integrationsCommerceGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **String**| External business ID for the integration. | [default to null]

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## integrationsCommercePatch

> IntegrationMetadata integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
String externalBusinessId = null; // String | External business ID for the integration.
IntegrationMetadataUpdate integrationMetadataUpdate = new IntegrationMetadataUpdate(); // IntegrationMetadataUpdate | 
try {
    IntegrationMetadata result = apiInstance.integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#integrationsCommercePatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **String**| External business ID for the integration. | [default to null]
 **integrationMetadataUpdate** | [**IntegrationMetadataUpdate**](IntegrationMetadataUpdate.md)|  |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## integrationsCommercePost

> IntegrationMetadata integrationsCommercePost(integrationMetadataCreate)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
IntegrationMetadataCreate integrationMetadataCreate = new IntegrationMetadataCreate(); // IntegrationMetadataCreate | 
try {
    IntegrationMetadata result = apiInstance.integrationsCommercePost(integrationMetadataCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#integrationsCommercePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationMetadataCreate** | [**IntegrationMetadataCreate**](IntegrationMetadataCreate.md)|  |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## integrationsGetById

> IntegrationRecord integrationsGetById(id)

Get integration metadata

Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
String id = null; // String | Integration record ID.
try {
    IntegrationRecord result = apiInstance.integrationsGetById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#integrationsGetById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Integration record ID. | [default to null]

### Return type

[**IntegrationRecord**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## integrationsGetList

> IntegrationsGetList200Response integrationsGetList(bookmark, pageSize)

Get integration metadata list

Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    IntegrationsGetList200Response result = apiInstance.integrationsGetList(bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#integrationsGetList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## integrationsLogsPost

> IntegrationLogsSuccessResponse integrationsLogsPost(integrationLogsRequestCreate)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
IntegrationLogsRequestCreate integrationLogsRequestCreate = new IntegrationLogsRequestCreate(); // IntegrationLogsRequestCreate | 
try {
    IntegrationLogsSuccessResponse result = apiInstance.integrationsLogsPost(integrationLogsRequestCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#integrationsLogsPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationLogsRequestCreate** | [**IntegrationLogsRequestCreate**](IntegrationLogsRequestCreate.md)|  |

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

