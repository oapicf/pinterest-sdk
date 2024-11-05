# \IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrations_commerce_slash_del**](IntegrationsApi.md#integrations_commerce_slash_del) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**integrations_commerce_slash_get**](IntegrationsApi.md#integrations_commerce_slash_get) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**integrations_commerce_slash_patch**](IntegrationsApi.md#integrations_commerce_slash_patch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**integrations_commerce_slash_post**](IntegrationsApi.md#integrations_commerce_slash_post) | **POST** /integrations/commerce | Create commerce integration
[**integrations_logs_slash_post**](IntegrationsApi.md#integrations_logs_slash_post) | **POST** /integrations/logs | Receives batched logs from integration applications.
[**integrations_slash_get_by_id**](IntegrationsApi.md#integrations_slash_get_by_id) | **GET** /integrations/{id} | Get integration metadata
[**integrations_slash_get_list**](IntegrationsApi.md#integrations_slash_get_list) | **GET** /integrations | Get integration metadata list



## integrations_commerce_slash_del

> integrations_commerce_slash_del(external_business_id)
Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**external_business_id** | **String** | External business ID for the integration. | [required] |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrations_commerce_slash_get

> models::IntegrationMetadata integrations_commerce_slash_get(external_business_id)
Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**external_business_id** | **String** | External business ID for the integration. | [required] |

### Return type

[**models::IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrations_commerce_slash_patch

> models::IntegrationMetadata integrations_commerce_slash_patch(external_business_id, integration_request_patch)
Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**external_business_id** | **String** | External business ID for the integration. | [required] |
**integration_request_patch** | Option<[**IntegrationRequestPatch**](IntegrationRequestPatch.md)> | Parameters to get create/update the Integration Metadata |  |

### Return type

[**models::IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrations_commerce_slash_post

> models::IntegrationMetadata integrations_commerce_slash_post(integration_request)
Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**integration_request** | Option<[**IntegrationRequest**](IntegrationRequest.md)> | Parameters to get create/update the Integration Metadata |  |

### Return type

[**models::IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrations_logs_slash_post

> models::IntegrationLogsSuccessResponse integrations_logs_slash_post(integration_logs_request)
Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**integration_logs_request** | [**IntegrationLogsRequest**](IntegrationLogsRequest.md) | Ingest log information from external integration application. | [required] |

### Return type

[**models::IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrations_slash_get_by_id

> models::IntegrationRecord integrations_slash_get_by_id(id)
Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | Integration ID. | [required] |

### Return type

[**models::IntegrationRecord**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrations_slash_get_list

> models::IntegrationsGetList200Response integrations_slash_get_list(bookmark, page_size)
Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**models::IntegrationsGetList200Response**](integrations_get_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

