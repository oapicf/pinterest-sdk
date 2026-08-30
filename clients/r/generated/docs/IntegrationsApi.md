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
> IntegrationMetadata IntegrationsCommerceDel(external_business_id)

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
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IntegrationsCommerceDel(var_external_business_iddata_file = "result.txt")
result <- api_instance$IntegrationsCommerceDel(var_external_business_id)
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
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **IntegrationsCommercePatch**
> IntegrationMetadata IntegrationsCommercePatch(external_business_id, integration_metadata_update)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Update commerce integration
#
# prepare function argument(s)
var_external_business_id <- "external_business_id_example" # character | External business ID for the integration.
var_integration_metadata_update <- IntegrationMetadataUpdate$new("additional_id_1_example", "connected_advertiser_id_example", "connected_lba_id_example", "connected_merchant_id_example", "connected_tag_id_example", "partner_access_token_example", 123, "partner_metadata_example", "partner_primary_email_example", "partner_refresh_token_example", 123, "scopes_example") # IntegrationMetadataUpdate | 

api_instance <- IntegrationsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IntegrationsCommercePatch(var_external_business_id, var_integration_metadata_updatedata_file = "result.txt")
result <- api_instance$IntegrationsCommercePatch(var_external_business_id, var_integration_metadata_update)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **character**| External business ID for the integration. | 
 **integration_metadata_update** | [**IntegrationMetadataUpdate**](IntegrationMetadataUpdate.md)|  | 

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **IntegrationsCommercePost**
> IntegrationMetadata IntegrationsCommercePost(integration_metadata_create)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Create commerce integration
#
# prepare function argument(s)
var_integration_metadata_create <- IntegrationMetadataCreate$new("additional_id_1_example", "connected_advertiser_id_example", "connected_lba_id_example", "connected_merchant_id_example", "connected_tag_id_example", "external_business_id_example", "partner_access_token_example", 123, "partner_metadata_example", "partner_primary_email_example", "partner_refresh_token_example", 123, "scopes_example") # IntegrationMetadataCreate | 

api_instance <- IntegrationsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IntegrationsCommercePost(var_integration_metadata_createdata_file = "result.txt")
result <- api_instance$IntegrationsCommercePost(var_integration_metadata_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_metadata_create** | [**IntegrationMetadataCreate**](IntegrationMetadataCreate.md)|  | 

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
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

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
var_id <- "id_example" # character | Integration record ID.

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
 **id** | **character**| Integration record ID. | 

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

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
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

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
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **IntegrationsLogsPost**
> IntegrationLogsSuccessResponse IntegrationsLogsPost(integration_logs_request_create)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Receives batched logs from integration applications.
#
# prepare function argument(s)
var_integration_logs_request_create <- IntegrationLogsRequestCreate$new(c(IntegrationLog$new(123, IntegrationLogEventType$new(), IntegrationLogLevel$new(), "advertiser_id_example", "app_version_number_example", IntegrationLogClientError$new("cause_example", 123, "file_name_example", 123, "message_example", "message_detail_example", "name_example", 123, "stack_trace_example"), "external_business_id_example", "feed_profile_id_example", "merchant_id_example", "message_example", "platform_version_number_example", IntegrationLogClientRequest$new("host_example", HttpMethod$new(), "path_example", c(key = "inner_example"), c(key = "inner_example"), 123), "tag_id_example"))) # IntegrationLogsRequestCreate | 

api_instance <- IntegrationsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IntegrationsLogsPost(var_integration_logs_request_createdata_file = "result.txt")
result <- api_instance$IntegrationsLogsPost(var_integration_logs_request_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_logs_request_create** | [**IntegrationLogsRequestCreate**](IntegrationLogsRequestCreate.md)|  | 

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
| **200** | The request has succeeded. |  -  |
| **400** | The server could not understand the request due to invalid syntax. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

