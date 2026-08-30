# SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SchedulesCreate**](SchedulesApi.md#SchedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**SchedulesList**](SchedulesApi.md#SchedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**SchedulesUpdate**](SchedulesApi.md#SchedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


# **SchedulesCreate**
> array[SchedulesCreate200ResponseInner] SchedulesCreate(ad_account_id, schedule_create)

Create schedules

Batch create schedules

### Example
```R
library(openapi)

# Create schedules
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_schedule_create <- c(ScheduleCreate$new("entity_id_example", Schedule_delta_value$new(BidOptionsAgeBucketMultipliers$new(123, 123, 123, 123, 123, 123, 123), BidOptionsAppTypeMultipliers$new(123, 123, 123, 123, 123, 123), c(BidOptionsAudienceMultipliers$new("audience_id_example", 123)), BidOptionsGenderMultipliers$new(123, 123), BidOptionsPlacementMultipliers$new(123, 123, 123)), 123, AdAccountEntityType$new(), "name_example", ScheduleAction$new(), ScheduleStatus$new(), ScheduleType$new(), 123)) # array[ScheduleCreate] | 

api_instance <- SchedulesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SchedulesCreate(var_ad_account_id, var_schedule_createdata_file = "result.txt")
result <- api_instance$SchedulesCreate(var_ad_account_id, var_schedule_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **schedule_create** | list( [**ScheduleCreate**](ScheduleCreate.md) )|  | 

### Return type

[**array[SchedulesCreate200ResponseInner]**](schedules_create_200_response_inner.md)

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

# **SchedulesList**
> SchedulesList200Response SchedulesList(ad_account_id, entity_ids, bookmark = var.bookmark, page_size = 25, order = var.order, schedule_statuses = var.schedule_statuses, schedule_type = var.schedule_type)

Get Schedules

Get schedules for a specific advertiser

### Example
```R
library(openapi)

# Get Schedules
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_entity_ids <- c("inner_example") # array[character] | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_schedule_statuses <- c(ScheduleStatus$new()) # array[ScheduleStatus] | Filter schedules by status (one or more) (Optional)
var_schedule_type <- ScheduleType$new() # ScheduleType | Filter schedules by a type (Optional)

api_instance <- SchedulesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SchedulesList(var_ad_account_id, var_entity_ids, bookmark = var_bookmark, page_size = var_page_size, order = var_order, schedule_statuses = var_schedule_statuses, schedule_type = var_schedule_typedata_file = "result.txt")
result <- api_instance$SchedulesList(var_ad_account_id, var_entity_ids, bookmark = var_bookmark, page_size = var_page_size, order = var_order, schedule_statuses = var_schedule_statuses, schedule_type = var_schedule_type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **entity_ids** | list( **character** )| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **schedule_statuses** | list( [**ScheduleStatus**](ScheduleStatus.md) )| Filter schedules by status (one or more) | [optional] 
 **schedule_type** | [**ScheduleType**](.md)| Filter schedules by a type | [optional] 

### Return type

[**SchedulesList200Response**](schedules_list_200_response.md)

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

# **SchedulesUpdate**
> array[SchedulesCreate200ResponseInner] SchedulesUpdate(ad_account_id, schedule_batch_update)

Update schedules

Update one or more schedules

### Example
```R
library(openapi)

# Update schedules
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_schedule_batch_update <- c(ScheduleBatchUpdate$new("id_example", "schedule_id_example", Schedule_delta_value$new(BidOptionsAgeBucketMultipliers$new(123, 123, 123, 123, 123, 123, 123), BidOptionsAppTypeMultipliers$new(123, 123, 123, 123, 123, 123), c(BidOptionsAudienceMultipliers$new("audience_id_example", 123)), BidOptionsGenderMultipliers$new(123, 123), BidOptionsPlacementMultipliers$new(123, 123, 123)), 123, "entity_id_example", AdAccountEntityType$new(), "name_example", ScheduleAction$new(), ScheduleStatus$new(), ScheduleType$new(), 123)) # array[ScheduleBatchUpdate] | 

api_instance <- SchedulesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SchedulesUpdate(var_ad_account_id, var_schedule_batch_updatedata_file = "result.txt")
result <- api_instance$SchedulesUpdate(var_ad_account_id, var_schedule_batch_update)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **schedule_batch_update** | list( [**ScheduleBatchUpdate**](ScheduleBatchUpdate.md) )|  | 

### Return type

[**array[SchedulesCreate200ResponseInner]**](schedules_create_200_response_inner.md)

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

