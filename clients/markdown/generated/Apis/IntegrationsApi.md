# IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**integrations/getById**](IntegrationsApi.md#integrations/getById) | **GET** /integrations/{id} | Get integration metadata |
| [**integrations/getList**](IntegrationsApi.md#integrations/getList) | **GET** /integrations | Get integration metadata list |
| [**integrationsCommerce/del**](IntegrationsApi.md#integrationsCommerce/del) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration |
| [**integrationsCommerce/get**](IntegrationsApi.md#integrationsCommerce/get) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration |
| [**integrationsCommerce/patch**](IntegrationsApi.md#integrationsCommerce/patch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration |
| [**integrationsCommerce/post**](IntegrationsApi.md#integrationsCommerce/post) | **POST** /integrations/commerce | Create commerce integration |
| [**integrationsLogs/post**](IntegrationsApi.md#integrationsLogs/post) | **POST** /integrations/logs | Receives batched logs from integration applications. |


<a name="integrations/getById"></a>
# **integrations/getById**
> IntegrationRecord integrations/getById(id)

Get integration metadata

    Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Integration ID. | [default to null] |

### Return type

[**IntegrationRecord**](../Models/IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="integrations/getList"></a>
# **integrations/getList**
> integrations_get_list_200_response integrations/getList(bookmark, page\_size)

Get integration metadata list

    Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**integrations_get_list_200_response**](../Models/integrations_get_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="integrationsCommerce/del"></a>
# **integrationsCommerce/del**
> integrationsCommerce/del(external\_business\_id)

Delete commerce integration

    Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **external\_business\_id** | **String**| External business ID for the integration. | [default to null] |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="integrationsCommerce/get"></a>
# **integrationsCommerce/get**
> IntegrationMetadata integrationsCommerce/get(external\_business\_id)

Get commerce integration

    Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **external\_business\_id** | **String**| External business ID for the integration. | [default to null] |

### Return type

[**IntegrationMetadata**](../Models/IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="integrationsCommerce/patch"></a>
# **integrationsCommerce/patch**
> IntegrationMetadata integrationsCommerce/patch(external\_business\_id, IntegrationRequestPatch)

Update commerce integration

    Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **external\_business\_id** | **String**| External business ID for the integration. | [default to null] |
| **IntegrationRequestPatch** | [**IntegrationRequestPatch**](../Models/IntegrationRequestPatch.md)| Parameters to get create/update the Integration Metadata | [optional] |

### Return type

[**IntegrationMetadata**](../Models/IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="integrationsCommerce/post"></a>
# **integrationsCommerce/post**
> IntegrationMetadata integrationsCommerce/post(IntegrationRequest)

Create commerce integration

    Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **IntegrationRequest** | [**IntegrationRequest**](../Models/IntegrationRequest.md)| Parameters to get create/update the Integration Metadata | [optional] |

### Return type

[**IntegrationMetadata**](../Models/IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="integrationsLogs/post"></a>
# **integrationsLogs/post**
> IntegrationLogsSuccessResponse integrationsLogs/post(IntegrationLogsRequest)

Receives batched logs from integration applications.

    This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **IntegrationLogsRequest** | [**IntegrationLogsRequest**](../Models/IntegrationLogsRequest.md)| Ingest log information from external integration application. | |

### Return type

[**IntegrationLogsSuccessResponse**](../Models/IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

