# IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrations_commerce_del**](IntegrationsApi.md#integrations_commerce_del) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**integrations_commerce_get**](IntegrationsApi.md#integrations_commerce_get) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**integrations_commerce_patch**](IntegrationsApi.md#integrations_commerce_patch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**integrations_commerce_post**](IntegrationsApi.md#integrations_commerce_post) | **POST** /integrations/commerce | Create commerce integration
[**integrations_get_by_id**](IntegrationsApi.md#integrations_get_by_id) | **GET** /integrations/{id} | Get integration metadata
[**integrations_get_list**](IntegrationsApi.md#integrations_get_list) | **GET** /integrations | Get integration metadata list
[**integrations_logs_post**](IntegrationsApi.md#integrations_logs_post) | **POST** /integrations/logs | Receives batched logs from integration applications.


# **integrations_commerce_del**
> `integrations_commerce_del`(_api::`IntegrationsApi`, `external_business_id`::`String`; _mediaType=nothing) -> `IntegrationMetadata`, `OpenAPI.Clients.ApiResponse` <br/>
> `integrations_commerce_del`(_api::`IntegrationsApi`, response_stream::`Channel`, `external_business_id`::`String`; _mediaType=nothing) -> `Channel`{ `IntegrationMetadata` }, `OpenAPI.Clients.ApiResponse`

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`IntegrationsApi`** | API context | 
**`external_business_id`** | **`String`** | External business ID for the integration. |

### Return type

[**`IntegrationMetadata`**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **integrations_commerce_get**
> `integrations_commerce_get`(_api::`IntegrationsApi`, `external_business_id`::`String`; _mediaType=nothing) -> `IntegrationMetadata`, `OpenAPI.Clients.ApiResponse` <br/>
> `integrations_commerce_get`(_api::`IntegrationsApi`, response_stream::`Channel`, `external_business_id`::`String`; _mediaType=nothing) -> `Channel`{ `IntegrationMetadata` }, `OpenAPI.Clients.ApiResponse`

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`IntegrationsApi`** | API context | 
**`external_business_id`** | **`String`** | External business ID for the integration. |

### Return type

[**`IntegrationMetadata`**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **integrations_commerce_patch**
> `integrations_commerce_patch`(_api::`IntegrationsApi`, `external_business_id`::`String`, `integration_metadata_update`::`IntegrationMetadataUpdate`; _mediaType=nothing) -> `IntegrationMetadata`, `OpenAPI.Clients.ApiResponse` <br/>
> `integrations_commerce_patch`(_api::`IntegrationsApi`, response_stream::`Channel`, `external_business_id`::`String`, `integration_metadata_update`::`IntegrationMetadataUpdate`; _mediaType=nothing) -> `Channel`{ `IntegrationMetadata` }, `OpenAPI.Clients.ApiResponse`

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`IntegrationsApi`** | API context | 
**`external_business_id`** | **`String`** | External business ID for the integration. |
**`integration_metadata_update`** | [**`IntegrationMetadataUpdate`**](IntegrationMetadataUpdate.md) |  |

### Return type

[**`IntegrationMetadata`**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **integrations_commerce_post**
> `integrations_commerce_post`(_api::`IntegrationsApi`, `integration_metadata_create`::`IntegrationMetadataCreate`; _mediaType=nothing) -> `IntegrationMetadata`, `OpenAPI.Clients.ApiResponse` <br/>
> `integrations_commerce_post`(_api::`IntegrationsApi`, response_stream::`Channel`, `integration_metadata_create`::`IntegrationMetadataCreate`; _mediaType=nothing) -> `Channel`{ `IntegrationMetadata` }, `OpenAPI.Clients.ApiResponse`

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`IntegrationsApi`** | API context | 
**`integration_metadata_create`** | [**`IntegrationMetadataCreate`**](IntegrationMetadataCreate.md) |  |

### Return type

[**`IntegrationMetadata`**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **integrations_get_by_id**
> `integrations_get_by_id`(_api::`IntegrationsApi`, `id`::`String`; _mediaType=nothing) -> `IntegrationRecord`, `OpenAPI.Clients.ApiResponse` <br/>
> `integrations_get_by_id`(_api::`IntegrationsApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `IntegrationRecord` }, `OpenAPI.Clients.ApiResponse`

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`IntegrationsApi`** | API context | 
**`id`** | **`String`** | Integration record ID. |

### Return type

[**`IntegrationRecord`**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **integrations_get_list**
> `integrations_get_list`(_api::`IntegrationsApi`; `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `IntegrationsGetList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `integrations_get_list`(_api::`IntegrationsApi`, response_stream::`Channel`; `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `IntegrationsGetList200Response` }, `OpenAPI.Clients.ApiResponse`

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`IntegrationsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`IntegrationsGetList200Response`**](IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **integrations_logs_post**
> `integrations_logs_post`(_api::`IntegrationsApi`, `integration_logs_request_create`::`IntegrationLogsRequestCreate`; _mediaType=nothing) -> `IntegrationLogsSuccessResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `integrations_logs_post`(_api::`IntegrationsApi`, response_stream::`Channel`, `integration_logs_request_create`::`IntegrationLogsRequestCreate`; _mediaType=nothing) -> `Channel`{ `IntegrationLogsSuccessResponse` }, `OpenAPI.Clients.ApiResponse`

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`IntegrationsApi`** | API context | 
**`integration_logs_request_create`** | [**`IntegrationLogsRequestCreate`**](IntegrationLogsRequestCreate.md) |  |

### Return type

[**`IntegrationLogsSuccessResponse`**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

