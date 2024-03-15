# integrations_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**integrations_commerce/del**](integrations_api.md#integrations_commerce/del) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
**integrations_commerce/get**](integrations_api.md#integrations_commerce/get) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
**integrations_commerce/patch**](integrations_api.md#integrations_commerce/patch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
**integrations_commerce/post**](integrations_api.md#integrations_commerce/post) | **POST** /integrations/commerce | Create commerce integration
**integrations_logs/post**](integrations_api.md#integrations_logs/post) | **POST** /integrations/logs | Receives batched logs from integration applications.
**integrations/get_by_id**](integrations_api.md#integrations/get_by_id) | **GET** /integrations/{id} | Get integration metadata
**integrations/get_list**](integrations_api.md#integrations/get_list) | **GET** /integrations | Get integration metadata list


# **integrations_commerce/del**
> integrations_commerce/del(ctx, external_business_id)
Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **external_business_id** | **String**| External business ID for the integration. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce/get**
> models::IntegrationMetadata integrations_commerce/get(ctx, external_business_id)
Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **external_business_id** | **String**| External business ID for the integration. | 

### Return type

[**models::IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce/patch**
> models::IntegrationMetadata integrations_commerce/patch(ctx, external_business_id, optional)
Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **external_business_id** | **String**| External business ID for the integration. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **String**| External business ID for the integration. | 
 **integration_request_patch** | [**IntegrationRequestPatch**](IntegrationRequestPatch.md)| Parameters to get create/update the Integration Metadata | 

### Return type

[**models::IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce/post**
> models::IntegrationMetadata integrations_commerce/post(ctx, optional)
Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_request** | [**IntegrationRequest**](IntegrationRequest.md)| Parameters to get create/update the Integration Metadata | 

### Return type

[**models::IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_logs/post**
> models::IntegrationLogsSuccessResponse integrations_logs/post(ctx, integration_logs_request)
Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **integration_logs_request** | [**IntegrationLogsRequest**](IntegrationLogsRequest.md)| Ingest log information from external integration application. | 

### Return type

[**models::IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations/get_by_id**
> models::IntegrationRecord integrations/get_by_id(ctx, id)
Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **id** | **String**| Integration ID. | 

### Return type

[**models::IntegrationRecord**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations/get_list**
> models::IntegrationsGetList200Response integrations/get_list(ctx, optional)
Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]

### Return type

[**models::IntegrationsGetList200Response**](integrations_get_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

