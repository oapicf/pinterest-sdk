# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvertiserDefinedEventsCreate**](ConversionsApi.md#AdvertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**AdvertiserDefinedEventsDelete**](ConversionsApi.md#AdvertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**AdvertiserDefinedEventsGet**](ConversionsApi.md#AdvertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**AdvertiserDefinedEventsUpdate**](ConversionsApi.md#AdvertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


# **AdvertiserDefinedEventsCreate**
> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsCreate(ad_account_id, advertiser_defined_events_create_request)

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Example
```R
library(openapi)

# Create advertiser defined events
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_advertiser_defined_events_create_request <- AdvertiserDefinedEventsCreateRequest$new(c(AdvertiserDefinedEventInput$new(AdvertiserDefinedEventMappingType$new(), "name_example"))) # AdvertiserDefinedEventsCreateRequest | 

api_instance <- ConversionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdvertiserDefinedEventsCreate(var_ad_account_id, var_advertiser_defined_events_create_requestdata_file = "result.txt")
result <- api_instance$AdvertiserDefinedEventsCreate(var_ad_account_id, var_advertiser_defined_events_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **AdvertiserDefinedEventsDelete**
> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsDelete(ad_account_id, event_names)

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Example
```R
library(openapi)

# Delete advertiser defined events
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_event_names <- c("inner_example") # array[character] | List of event names to delete

api_instance <- ConversionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdvertiserDefinedEventsDelete(var_ad_account_id, var_event_namesdata_file = "result.txt")
result <- api_instance$AdvertiserDefinedEventsDelete(var_ad_account_id, var_event_names)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **event_names** | list( **character** )| List of event names to delete | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **AdvertiserDefinedEventsGet**
> AdvertiserDefinedEventsGet200Response AdvertiserDefinedEventsGet(ad_account_id)

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Example
```R
library(openapi)

# Get advertiser defined events
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- ConversionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdvertiserDefinedEventsGet(var_ad_account_iddata_file = "result.txt")
result <- api_instance$AdvertiserDefinedEventsGet(var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**AdvertiserDefinedEventsGet200Response**](advertiser_defined_events_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **AdvertiserDefinedEventsUpdate**
> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsUpdate(ad_account_id, advertiser_defined_events_create_request)

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Example
```R
library(openapi)

# Update advertiser defined events
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_advertiser_defined_events_create_request <- AdvertiserDefinedEventsCreateRequest$new(c(AdvertiserDefinedEventInput$new(AdvertiserDefinedEventMappingType$new(), "name_example"))) # AdvertiserDefinedEventsCreateRequest | 

api_instance <- ConversionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdvertiserDefinedEventsUpdate(var_ad_account_id, var_advertiser_defined_events_create_requestdata_file = "result.txt")
result <- api_instance$AdvertiserDefinedEventsUpdate(var_ad_account_id, var_advertiser_defined_events_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

