# IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**integrationsCommerceDel**](IntegrationsApi.md#integrationsCommerceDel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration |
| [**integrationsCommerceGet**](IntegrationsApi.md#integrationsCommerceGet) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration |
| [**integrationsCommercePatch**](IntegrationsApi.md#integrationsCommercePatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration |
| [**integrationsCommercePost**](IntegrationsApi.md#integrationsCommercePost) | **POST** /integrations/commerce | Create commerce integration |
| [**integrationsGetById**](IntegrationsApi.md#integrationsGetById) | **GET** /integrations/{id} | Get integration metadata |
| [**integrationsGetList**](IntegrationsApi.md#integrationsGetList) | **GET** /integrations | Get integration metadata list |
| [**integrationsLogsPost**](IntegrationsApi.md#integrationsLogsPost) | **POST** /integrations/logs | Receives batched logs from integration applications. |


<a id="integrationsCommerceDel"></a>
# **integrationsCommerceDel**
> IntegrationMetadata integrationsCommerceDel(externalBusinessId)

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IntegrationsApi()
val externalBusinessId : kotlin.String = externalBusinessId_example // kotlin.String | External business ID for the integration.
try {
    val result : IntegrationMetadata = apiInstance.integrationsCommerceDel(externalBusinessId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#integrationsCommerceDel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#integrationsCommerceDel")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalBusinessId** | **kotlin.String**| External business ID for the integration. | |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="integrationsCommerceGet"></a>
# **integrationsCommerceGet**
> IntegrationMetadata integrationsCommerceGet(externalBusinessId)

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IntegrationsApi()
val externalBusinessId : kotlin.String = externalBusinessId_example // kotlin.String | External business ID for the integration.
try {
    val result : IntegrationMetadata = apiInstance.integrationsCommerceGet(externalBusinessId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#integrationsCommerceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#integrationsCommerceGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalBusinessId** | **kotlin.String**| External business ID for the integration. | |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="integrationsCommercePatch"></a>
# **integrationsCommercePatch**
> IntegrationMetadata integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IntegrationsApi()
val externalBusinessId : kotlin.String = externalBusinessId_example // kotlin.String | External business ID for the integration.
val integrationMetadataUpdate : IntegrationMetadataUpdate =  // IntegrationMetadataUpdate | 
try {
    val result : IntegrationMetadata = apiInstance.integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#integrationsCommercePatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#integrationsCommercePatch")
    e.printStackTrace()
}
```

### Parameters
| **externalBusinessId** | **kotlin.String**| External business ID for the integration. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationMetadataUpdate** | [**IntegrationMetadataUpdate**](IntegrationMetadataUpdate.md)|  | |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="integrationsCommercePost"></a>
# **integrationsCommercePost**
> IntegrationMetadata integrationsCommercePost(integrationMetadataCreate)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IntegrationsApi()
val integrationMetadataCreate : IntegrationMetadataCreate =  // IntegrationMetadataCreate | 
try {
    val result : IntegrationMetadata = apiInstance.integrationsCommercePost(integrationMetadataCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#integrationsCommercePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#integrationsCommercePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationMetadataCreate** | [**IntegrationMetadataCreate**](IntegrationMetadataCreate.md)|  | |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="integrationsGetById"></a>
# **integrationsGetById**
> IntegrationRecord integrationsGetById(id)

Get integration metadata

Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IntegrationsApi()
val id : kotlin.String = id_example // kotlin.String | Integration record ID.
try {
    val result : IntegrationRecord = apiInstance.integrationsGetById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#integrationsGetById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#integrationsGetById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Integration record ID. | |

### Return type

[**IntegrationRecord**](IntegrationRecord.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="integrationsGetList"></a>
# **integrationsGetList**
> IntegrationsGetList200Response integrationsGetList(bookmark, pageSize)

Get integration metadata list

Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IntegrationsApi()
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : IntegrationsGetList200Response = apiInstance.integrationsGetList(bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#integrationsGetList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#integrationsGetList")
    e.printStackTrace()
}
```

### Parameters
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="integrationsLogsPost"></a>
# **integrationsLogsPost**
> IntegrationLogsSuccessResponse integrationsLogsPost(integrationLogsRequestCreate)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IntegrationsApi()
val integrationLogsRequestCreate : IntegrationLogsRequestCreate =  // IntegrationLogsRequestCreate | 
try {
    val result : IntegrationLogsSuccessResponse = apiInstance.integrationsLogsPost(integrationLogsRequestCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#integrationsLogsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#integrationsLogsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integrationLogsRequestCreate** | [**IntegrationLogsRequestCreate**](IntegrationLogsRequestCreate.md)|  | |

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

