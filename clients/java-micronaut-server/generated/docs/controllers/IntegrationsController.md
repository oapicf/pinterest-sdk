# IntegrationsController

All URIs are relative to `"/v5"`

The controller class is defined in **[IntegrationsController.java](../../src/main/java/org/openapitools/controller/IntegrationsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrationsCommerceDel**](#integrationsCommerceDel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**integrationsCommerceGet**](#integrationsCommerceGet) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**integrationsCommercePatch**](#integrationsCommercePatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**integrationsCommercePost**](#integrationsCommercePost) | **POST** /integrations/commerce | Create commerce integration
[**integrationsGetById**](#integrationsGetById) | **GET** /integrations/{id} | Get integration metadata
[**integrationsGetList**](#integrationsGetList) | **GET** /integrations | Get integration metadata list
[**integrationsLogsPost**](#integrationsLogsPost) | **POST** /integrations/logs | Receives batched logs from integration applications.

<a id="integrationsCommerceDel"></a>
# **integrationsCommerceDel**
```java
Mono<IntegrationMetadata> IntegrationsController.integrationsCommerceDel(externalBusinessId)
```

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**externalBusinessId** | `String` | External business ID for the integration. |

### Return type
[**IntegrationMetadata**](../../docs/models/IntegrationMetadata.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="integrationsCommerceGet"></a>
# **integrationsCommerceGet**
```java
Mono<IntegrationMetadata> IntegrationsController.integrationsCommerceGet(externalBusinessId)
```

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**externalBusinessId** | `String` | External business ID for the integration. |

### Return type
[**IntegrationMetadata**](../../docs/models/IntegrationMetadata.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="integrationsCommercePatch"></a>
# **integrationsCommercePatch**
```java
Mono<IntegrationMetadata> IntegrationsController.integrationsCommercePatch(externalBusinessIdintegrationMetadataUpdate)
```

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**externalBusinessId** | `String` | External business ID for the integration. |
**integrationMetadataUpdate** | [**IntegrationMetadataUpdate**](../../docs/models/IntegrationMetadataUpdate.md) |  |

### Return type
[**IntegrationMetadata**](../../docs/models/IntegrationMetadata.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="integrationsCommercePost"></a>
# **integrationsCommercePost**
```java
Mono<IntegrationMetadata> IntegrationsController.integrationsCommercePost(integrationMetadataCreate)
```

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**integrationMetadataCreate** | [**IntegrationMetadataCreate**](../../docs/models/IntegrationMetadataCreate.md) |  |

### Return type
[**IntegrationMetadata**](../../docs/models/IntegrationMetadata.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="integrationsGetById"></a>
# **integrationsGetById**
```java
Mono<IntegrationRecord> IntegrationsController.integrationsGetById(id)
```

Get integration metadata

Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | Integration record ID. |

### Return type
[**IntegrationRecord**](../../docs/models/IntegrationRecord.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="integrationsGetList"></a>
# **integrationsGetList**
```java
Mono<IntegrationsGetList200Response> IntegrationsController.integrationsGetList(bookmarkpageSize)
```

Get integration metadata list

Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**IntegrationsGetList200Response**](../../docs/models/IntegrationsGetList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="integrationsLogsPost"></a>
# **integrationsLogsPost**
```java
Mono<IntegrationLogsSuccessResponse> IntegrationsController.integrationsLogsPost(integrationLogsRequestCreate)
```

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**integrationLogsRequestCreate** | [**IntegrationLogsRequestCreate**](../../docs/models/IntegrationLogsRequestCreate.md) |  |

### Return type
[**IntegrationLogsSuccessResponse**](../../docs/models/IntegrationLogsSuccessResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

