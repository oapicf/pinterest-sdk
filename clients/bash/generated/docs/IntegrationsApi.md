# IntegrationsApi

All URIs are relative to */v5*

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

Delete commerce integration

Delete commerce integration metadata for the given external business ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```bash
 integrationsCommerceDel external_business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **string** | External business ID for the integration. | [default to null]

### Return type

(empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrationsCommerceGet

Get commerce integration

Get commerce integration metadata associated with the given external business ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```bash
 integrationsCommerceGet external_business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **string** | External business ID for the integration. | [default to null]

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrationsCommercePatch

Update commerce integration

Update commerce integration metadata for the given external business ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```bash
 integrationsCommercePatch external_business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **string** | External business ID for the integration. | [default to null]
 **integrationRequestPatch** | [**IntegrationRequestPatch**](IntegrationRequestPatch.md) | Parameters to get create/update the Integration Metadata | [optional]

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrationsCommercePost

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```bash
 integrationsCommercePost
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationRequest** | [**IntegrationRequest**](IntegrationRequest.md) | Parameters to get create/update the Integration Metadata | [optional]

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrationsGetById

Get integration metadata

Get integration metadata by ID.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```bash
 integrationsGetById id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | Integration ID. | [default to null]

### Return type

[**IntegrationRecord**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrationsGetList

Get integration metadata list

Get integration metadata list.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```bash
 integrationsGetList  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## integrationsLogsPost

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms.
Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```bash
 integrationsLogsPost
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationLogsRequest** | [**IntegrationLogsRequest**](IntegrationLogsRequest.md) | Ingest log information from external integration application. |

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

