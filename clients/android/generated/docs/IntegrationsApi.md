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

> integrationsCommerceDel(externalBusinessId)

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
String externalBusinessId = null; // String | External business ID for the integration.
try {
    apiInstance.integrationsCommerceDel(externalBusinessId);
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

null (empty response body)

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

> IntegrationMetadata integrationsCommercePatch(externalBusinessId, integrationRequestPatch)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
String externalBusinessId = null; // String | External business ID for the integration.
IntegrationRequestPatch integrationRequestPatch = new IntegrationRequestPatch(); // IntegrationRequestPatch | Parameters to get create/update the Integration Metadata
try {
    IntegrationMetadata result = apiInstance.integrationsCommercePatch(externalBusinessId, integrationRequestPatch);
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
 **integrationRequestPatch** | [**IntegrationRequestPatch**](IntegrationRequestPatch.md)| Parameters to get create/update the Integration Metadata | [optional]

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## integrationsCommercePost

> IntegrationMetadata integrationsCommercePost(integrationRequest)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
IntegrationRequest integrationRequest = new IntegrationRequest(); // IntegrationRequest | Parameters to get create/update the Integration Metadata
try {
    IntegrationMetadata result = apiInstance.integrationsCommercePost(integrationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#integrationsCommercePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationRequest** | [**IntegrationRequest**](IntegrationRequest.md)| Parameters to get create/update the Integration Metadata | [optional]

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
String id = null; // String | Integration ID.
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
 **id** | **String**| Integration ID. | [default to null]

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
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
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
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## integrationsLogsPost

> IntegrationLogsSuccessResponse integrationsLogsPost(integrationLogsRequest)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.IntegrationsApi;

IntegrationsApi apiInstance = new IntegrationsApi();
IntegrationLogsRequest integrationLogsRequest = new IntegrationLogsRequest(); // IntegrationLogsRequest | Ingest log information from external integration application.
try {
    IntegrationLogsSuccessResponse result = apiInstance.integrationsLogsPost(integrationLogsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#integrationsLogsPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationLogsRequest** | [**IntegrationLogsRequest**](IntegrationLogsRequest.md)| Ingest log information from external integration application. |

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

