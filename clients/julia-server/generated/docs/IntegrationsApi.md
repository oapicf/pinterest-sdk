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
> `integrations_commerce_del`(req::`HTTP.Request`, `external_business_id`::`String`;) -> `IntegrationMetadata`

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`external_business_id`** | **`String`**| External business ID for the integration. |

### Return type

[**`IntegrationMetadata`**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce_get**
> `integrations_commerce_get`(req::`HTTP.Request`, `external_business_id`::`String`;) -> `IntegrationMetadata`

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`external_business_id`** | **`String`**| External business ID for the integration. |

### Return type

[**`IntegrationMetadata`**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce_patch**
> `integrations_commerce_patch`(req::`HTTP.Request`, `external_business_id`::`String`, `integration_metadata_update`::`IntegrationMetadataUpdate`;) -> `IntegrationMetadata`

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`external_business_id`** | **`String`**| External business ID for the integration. |
**`integration_metadata_update`** | [**`IntegrationMetadataUpdate`**](IntegrationMetadataUpdate.md)|  |

### Return type

[**`IntegrationMetadata`**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce_post**
> `integrations_commerce_post`(req::`HTTP.Request`, `integration_metadata_create`::`IntegrationMetadataCreate`;) -> `IntegrationMetadata`

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`integration_metadata_create`** | [**`IntegrationMetadataCreate`**](IntegrationMetadataCreate.md)|  |

### Return type

[**`IntegrationMetadata`**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_get_by_id**
> `integrations_get_by_id`(req::`HTTP.Request`, `id`::`String`;) -> `IntegrationRecord`

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| Integration record ID. |

### Return type

[**`IntegrationRecord`**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_get_list**
> `integrations_get_list`(req::`HTTP.Request`; `bookmark`=nothing, `page_size`=nothing,) -> `IntegrationsGetList200Response`

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`IntegrationsGetList200Response`**](IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_logs_post**
> `integrations_logs_post`(req::`HTTP.Request`, `integration_logs_request_create`::`IntegrationLogsRequestCreate`;) -> `IntegrationLogsSuccessResponse`

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`integration_logs_request_create`** | [**`IntegrationLogsRequestCreate`**](IntegrationLogsRequestCreate.md)|  |

### Return type

[**`IntegrationLogsSuccessResponse`**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

