# INTEGRATIONS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**integrations_commerce_del**](INTEGRATIONS_API.md#integrations_commerce_del) | **Delete** /integrations/commerce/{external_business_id} | Delete commerce integration
[**integrations_commerce_get**](INTEGRATIONS_API.md#integrations_commerce_get) | **Get** /integrations/commerce/{external_business_id} | Get commerce integration
[**integrations_commerce_patch**](INTEGRATIONS_API.md#integrations_commerce_patch) | **Patch** /integrations/commerce/{external_business_id} | Update commerce integration
[**integrations_commerce_post**](INTEGRATIONS_API.md#integrations_commerce_post) | **Post** /integrations/commerce | Create commerce integration
[**integrations_get_by_id**](INTEGRATIONS_API.md#integrations_get_by_id) | **Get** /integrations/{id} | Get integration metadata
[**integrations_get_list**](INTEGRATIONS_API.md#integrations_get_list) | **Get** /integrations | Get integration metadata list
[**integrations_logs_post**](INTEGRATIONS_API.md#integrations_logs_post) | **Post** /integrations/logs | Receives batched logs from integration applications.


# **integrations_commerce_del**
> integrations_commerce_del (external_business_id: STRING_32 )


Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **STRING_32**| External business ID for the integration. | [default to null]

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce_get**
> integrations_commerce_get (external_business_id: STRING_32 ): detachable INTEGRATION_METADATA


Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **STRING_32**| External business ID for the integration. | [default to null]

### Return type

[**INTEGRATION_METADATA**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce_patch**
> integrations_commerce_patch (external_business_id: STRING_32 ; integration_request_patch:  detachable INTEGRATION_REQUEST_PATCH ): detachable INTEGRATION_METADATA


Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **STRING_32**| External business ID for the integration. | [default to null]
 **integration_request_patch** | [**INTEGRATION_REQUEST_PATCH**](INTEGRATION_REQUEST_PATCH.md)| Parameters to get create/update the Integration Metadata | [optional] 

### Return type

[**INTEGRATION_METADATA**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce_post**
> integrations_commerce_post (integration_request:  detachable INTEGRATION_REQUEST ): detachable INTEGRATION_METADATA


Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_request** | [**INTEGRATION_REQUEST**](INTEGRATION_REQUEST.md)| Parameters to get create/update the Integration Metadata | [optional] 

### Return type

[**INTEGRATION_METADATA**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_get_by_id**
> integrations_get_by_id (id: STRING_32 ): detachable INTEGRATION_RECORD


Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| Integration ID. | [default to null]

### Return type

[**INTEGRATION_RECORD**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_get_list**
> integrations_get_list (bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable INTEGRATIONS_GET_LIST_200_RESPONSE


Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**INTEGRATIONS_GET_LIST_200_RESPONSE**](integrations_get_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_logs_post**
> integrations_logs_post (integration_logs_request: INTEGRATION_LOGS_REQUEST ): detachable INTEGRATION_LOGS_SUCCESS_RESPONSE


Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_logs_request** | [**INTEGRATION_LOGS_REQUEST**](INTEGRATION_LOGS_REQUEST.md)| Ingest log information from external integration application. | 

### Return type

[**INTEGRATION_LOGS_SUCCESS_RESPONSE**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

