# Org.OpenAPITools.Api.IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**IntegrationsCommerceDel**](IntegrationsApi.md#integrationscommercedel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration |
| [**IntegrationsCommerceGet**](IntegrationsApi.md#integrationscommerceget) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration |
| [**IntegrationsCommercePatch**](IntegrationsApi.md#integrationscommercepatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration |
| [**IntegrationsCommercePost**](IntegrationsApi.md#integrationscommercepost) | **POST** /integrations/commerce | Create commerce integration |
| [**IntegrationsGetById**](IntegrationsApi.md#integrationsgetbyid) | **GET** /integrations/{id} | Get integration metadata |
| [**IntegrationsGetList**](IntegrationsApi.md#integrationsgetlist) | **GET** /integrations | Get integration metadata list |
| [**IntegrationsLogsPost**](IntegrationsApi.md#integrationslogspost) | **POST** /integrations/logs | Receives batched logs from integration applications. |

<a id="integrationscommercedel"></a>
# **IntegrationsCommerceDel**
> void IntegrationsCommerceDel (string externalBusinessId)

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **externalBusinessId** | **string** | External business ID for the integration. |  |

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
| **204** | Commerce Integration deleted successfully |  -  |
| **0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="integrationscommerceget"></a>
# **IntegrationsCommerceGet**
> IntegrationMetadata IntegrationsCommerceGet (string externalBusinessId)

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **externalBusinessId** | **string** | External business ID for the integration. |  |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Integration not found. |  -  |
| **409** | Can&#39;t access this integration metadata. |  -  |
| **0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="integrationscommercepatch"></a>
# **IntegrationsCommercePatch**
> IntegrationMetadata IntegrationsCommercePatch (string externalBusinessId, IntegrationRequestPatch integrationRequestPatch)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **externalBusinessId** | **string** | External business ID for the integration. |  |
| **integrationRequestPatch** | [**IntegrationRequestPatch**](IntegrationRequestPatch.md) | Parameters to get create/update the Integration Metadata |  |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Integration not found. |  -  |
| **409** | Can&#39;t access this integration metadata. |  -  |
| **0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="integrationscommercepost"></a>
# **IntegrationsCommercePost**
> IntegrationMetadata IntegrationsCommercePost (IntegrationRequest integrationRequest)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **integrationRequest** | [**IntegrationRequest**](IntegrationRequest.md) | Parameters to get create/update the Integration Metadata |  |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Integration not found. |  -  |
| **409** | Can&#39;t access this integration metadata. |  -  |
| **0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="integrationsgetbyid"></a>
# **IntegrationsGetById**
> IntegrationRecord IntegrationsGetById (string id)

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | Integration ID. |  |

### Return type

[**IntegrationRecord**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Integration not found. |  -  |
| **0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="integrationsgetlist"></a>
# **IntegrationsGetList**
> IntegrationsGetList200Response IntegrationsGetList (string bookmark = null, int pageSize = null)

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="integrationslogspost"></a>
# **IntegrationsLogsPost**
> IntegrationLogsSuccessResponse IntegrationsLogsPost (IntegrationLogsRequest integrationLogsRequest)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **integrationLogsRequest** | [**IntegrationLogsRequest**](IntegrationLogsRequest.md) | Ingest log information from external integration application. |  |

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

