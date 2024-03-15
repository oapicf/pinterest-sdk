# IntegrationsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IntegrationsAPI_integrationsCommerceDel**](IntegrationsAPI.md#IntegrationsAPI_integrationsCommerceDel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**IntegrationsAPI_integrationsCommerceGet**](IntegrationsAPI.md#IntegrationsAPI_integrationsCommerceGet) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**IntegrationsAPI_integrationsCommercePatch**](IntegrationsAPI.md#IntegrationsAPI_integrationsCommercePatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**IntegrationsAPI_integrationsCommercePost**](IntegrationsAPI.md#IntegrationsAPI_integrationsCommercePost) | **POST** /integrations/commerce | Create commerce integration
[**IntegrationsAPI_integrationsGetById**](IntegrationsAPI.md#IntegrationsAPI_integrationsGetById) | **GET** /integrations/{id} | Get integration metadata
[**IntegrationsAPI_integrationsGetList**](IntegrationsAPI.md#IntegrationsAPI_integrationsGetList) | **GET** /integrations | Get integration metadata list
[**IntegrationsAPI_integrationsLogsPost**](IntegrationsAPI.md#IntegrationsAPI_integrationsLogsPost) | **POST** /integrations/logs | Receives batched logs from integration applications.


# **IntegrationsAPI_integrationsCommerceDel**
```c
// Delete commerce integration
//
// Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
void IntegrationsAPI_integrationsCommerceDel(apiClient_t *apiClient, char *external_business_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**external_business_id** | **char \*** | External business ID for the integration. | 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IntegrationsAPI_integrationsCommerceGet**
```c
// Get commerce integration
//
// Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_metadata_t* IntegrationsAPI_integrationsCommerceGet(apiClient_t *apiClient, char *external_business_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**external_business_id** | **char \*** | External business ID for the integration. | 

### Return type

[integration_metadata_t](integration_metadata.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IntegrationsAPI_integrationsCommercePatch**
```c
// Update commerce integration
//
// Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_metadata_t* IntegrationsAPI_integrationsCommercePatch(apiClient_t *apiClient, char *external_business_id, integration_request_patch_t *integration_request_patch);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**external_business_id** | **char \*** | External business ID for the integration. | 
**integration_request_patch** | **[integration_request_patch_t](integration_request_patch.md) \*** | Parameters to get create/update the Integration Metadata | [optional] 

### Return type

[integration_metadata_t](integration_metadata.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IntegrationsAPI_integrationsCommercePost**
```c
// Create commerce integration
//
// Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_metadata_t* IntegrationsAPI_integrationsCommercePost(apiClient_t *apiClient, integration_request_t *integration_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**integration_request** | **[integration_request_t](integration_request.md) \*** | Parameters to get create/update the Integration Metadata | [optional] 

### Return type

[integration_metadata_t](integration_metadata.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IntegrationsAPI_integrationsGetById**
```c
// Get integration metadata
//
// Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_record_t* IntegrationsAPI_integrationsGetById(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | Integration ID. | 

### Return type

[integration_record_t](integration_record.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IntegrationsAPI_integrationsGetList**
```c
// Get integration metadata list
//
// Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integrations_get_list_200_response_t* IntegrationsAPI_integrationsGetList(apiClient_t *apiClient, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[integrations_get_list_200_response_t](integrations_get_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IntegrationsAPI_integrationsLogsPost**
```c
// Receives batched logs from integration applications.
//
// This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_logs_success_response_t* IntegrationsAPI_integrationsLogsPost(apiClient_t *apiClient, integration_logs_request_t *integration_logs_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**integration_logs_request** | **[integration_logs_request_t](integration_logs_request.md) \*** | Ingest log information from external integration application. | 

### Return type

[integration_logs_success_response_t](integration_logs_success_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

