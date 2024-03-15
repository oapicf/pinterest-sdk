# IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IntegrationsCommerceDel**](IntegrationsApi.md#IntegrationsCommerceDel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**IntegrationsCommerceGet**](IntegrationsApi.md#IntegrationsCommerceGet) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**IntegrationsCommercePatch**](IntegrationsApi.md#IntegrationsCommercePatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**IntegrationsCommercePost**](IntegrationsApi.md#IntegrationsCommercePost) | **POST** /integrations/commerce | Create commerce integration
[**IntegrationsGetById**](IntegrationsApi.md#IntegrationsGetById) | **GET** /integrations/{id} | Get integration metadata
[**IntegrationsGetList**](IntegrationsApi.md#IntegrationsGetList) | **GET** /integrations | Get integration metadata list
[**IntegrationsLogsPost**](IntegrationsApi.md#IntegrationsLogsPost) | **POST** /integrations/logs | Receives batched logs from integration applications.


# **IntegrationsCommerceDel**
> IntegrationsCommerceDel(external_business_id)

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Delete commerce integration
#
# prepare function argument(s)
var_external_business_id <- "external_business_id_example" # character | External business ID for the integration.

api_instance <- IntegrationsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$IntegrationsCommerceDel(var_external_business_id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **character**| External business ID for the integration. | 

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

# **IntegrationsCommerceGet**
> IntegrationMetadata IntegrationsCommerceGet(external_business_id)

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Get commerce integration
#
# prepare function argument(s)
var_external_business_id <- "external_business_id_example" # character | External business ID for the integration.

api_instance <- IntegrationsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IntegrationsCommerceGet(var_external_business_iddata_file = "result.txt")
result <- api_instance$IntegrationsCommerceGet(var_external_business_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **character**| External business ID for the integration. | 

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

# **IntegrationsCommercePatch**
> IntegrationMetadata IntegrationsCommercePatch(external_business_id, integration_request_patch = var.integration_request_patch)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Update commerce integration
#
# prepare function argument(s)
var_external_business_id <- "external_business_id_example" # character | External business ID for the integration.
var_integration_request_patch <- IntegrationRequestPatch$new("connected_merchant_id_example", "connected_advertiser_id_example", "connected_lba_id_example", "connected_tag_id_example", "partner_access_token_example", "partner_refresh_token_example", "partner_primary_email_example", 123, 123, "scopes_example", "additional_id_1_example", "partner_metadata_example") # IntegrationRequestPatch | Parameters to get create/update the Integration Metadata (Optional)

api_instance <- IntegrationsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IntegrationsCommercePatch(var_external_business_id, integration_request_patch = var_integration_request_patchdata_file = "result.txt")
result <- api_instance$IntegrationsCommercePatch(var_external_business_id, integration_request_patch = var_integration_request_patch)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **character**| External business ID for the integration. | 
 **integration_request_patch** | [**IntegrationRequestPatch**](IntegrationRequestPatch.md)| Parameters to get create/update the Integration Metadata | [optional] 

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

# **IntegrationsCommercePost**
> IntegrationMetadata IntegrationsCommercePost(integration_request = var.integration_request)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Create commerce integration
#
# prepare function argument(s)
var_integration_request <- IntegrationRequest$new("external_business_id_example", "connected_merchant_id_example", "connected_advertiser_id_example", "connected_lba_id_example", "connected_tag_id_example", "partner_access_token_example", "partner_refresh_token_example", "partner_primary_email_example", 123, 123, "scopes_example", "additional_id_1_example", "partner_metadata_example") # IntegrationRequest | Parameters to get create/update the Integration Metadata (Optional)

api_instance <- IntegrationsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IntegrationsCommercePost(integration_request = var_integration_requestdata_file = "result.txt")
result <- api_instance$IntegrationsCommercePost(integration_request = var_integration_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_request** | [**IntegrationRequest**](IntegrationRequest.md)| Parameters to get create/update the Integration Metadata | [optional] 

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

# **IntegrationsGetById**
> IntegrationRecord IntegrationsGetById(id)

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Get integration metadata
#
# prepare function argument(s)
var_id <- "id_example" # character | Integration ID.

api_instance <- IntegrationsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IntegrationsGetById(var_iddata_file = "result.txt")
result <- api_instance$IntegrationsGetById(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| Integration ID. | 

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

# **IntegrationsGetList**
> IntegrationsGetList200Response IntegrationsGetList(bookmark = var.bookmark, page_size = 25)

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Get integration metadata list
#
# prepare function argument(s)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)

api_instance <- IntegrationsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IntegrationsGetList(bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$IntegrationsGetList(bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**IntegrationsGetList200Response**](integrations_get_list_200_response.md)

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

# **IntegrationsLogsPost**
> IntegrationLogsSuccessResponse IntegrationsLogsPost(integration_logs_request)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Receives batched logs from integration applications.
#
# prepare function argument(s)
var_integration_logs_request <- IntegrationLogsRequest$new(c(IntegrationLog$new(123, "APP", "INFO", "external_business_id_example", "advertiser_id_example", "merchant_id_example", "tag_id_example", "feed_profile_id_example", "message_example", "app_version_number_example", "platform_version_number_example", IntegrationLogClientError$new("cause_example", 123, "file_name_example", 123, "message_example", "message_detail_example", "name_example", 123, "stack_trace_example"), IntegrationLogClientRequest$new("GET", "host_example", "path_example", c(key = "inner_example"), c(key = "inner_example"), 123)))) # IntegrationLogsRequest | Ingest log information from external integration application.

api_instance <- IntegrationsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IntegrationsLogsPost(var_integration_logs_requestdata_file = "result.txt")
result <- api_instance$IntegrationsLogsPost(var_integration_logs_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_logs_request** | [**IntegrationLogsRequest**](IntegrationLogsRequest.md)| Ingest log information from external integration application. | 

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

