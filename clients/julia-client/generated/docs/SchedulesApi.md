# SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedules_create**](SchedulesApi.md#schedules_create) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedules_list**](SchedulesApi.md#schedules_list) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedules_update**](SchedulesApi.md#schedules_update) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


# **schedules_create**
> `schedules_create`(_api::`SchedulesApi`, `ad_account_id`::`String`, `schedule_create`::`Vector{ScheduleCreate}`; _mediaType=nothing) -> `Vector{SchedulesCreate200ResponseInner}`, `OpenAPI.Clients.ApiResponse` <br/>
> `schedules_create`(_api::`SchedulesApi`, response_stream::`Channel`, `ad_account_id`::`String`, `schedule_create`::`Vector{ScheduleCreate}`; _mediaType=nothing) -> `Channel`{ `Vector{SchedulesCreate200ResponseInner}` }, `OpenAPI.Clients.ApiResponse`

Create schedules

Batch create schedules

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`SchedulesApi`** | API context | 
**`ad_account_id`** | **`String`** |  |
**`schedule_create`** | [**`Vector{ScheduleCreate}`**](ScheduleCreate.md) |  |

### Return type

[**`Vector{SchedulesCreate200ResponseInner}`**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **schedules_list**
> `schedules_list`(_api::`SchedulesApi`, `ad_account_id`::`String`, `entity_ids`::`Vector{String}`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `schedule_statuses`=nothing, `schedule_type`=nothing, _mediaType=nothing) -> `SchedulesList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `schedules_list`(_api::`SchedulesApi`, response_stream::`Channel`, `ad_account_id`::`String`, `entity_ids`::`Vector{String}`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `schedule_statuses`=nothing, `schedule_type`=nothing, _mediaType=nothing) -> `Channel`{ `SchedulesList200Response` }, `OpenAPI.Clients.ApiResponse`

Get Schedules

Get schedules for a specific advertiser

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`SchedulesApi`** | API context | 
**`ad_account_id`** | **`String`** |  |
**`entity_ids`** | [**`Vector{String}`**](String.md) | List of Entity IDs, must be associated with the Ad Accound ID provided in the path. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]
 **`schedule_statuses`** | [**`Vector{ScheduleStatus}`**](ScheduleStatus.md) | Filter schedules by status (one or more) | [default to nothing]
 **`schedule_type`** | [**`ScheduleType`**](.md) | Filter schedules by a type | [default to nothing]

### Return type

[**`SchedulesList200Response`**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **schedules_update**
> `schedules_update`(_api::`SchedulesApi`, `ad_account_id`::`String`, `schedule_batch_update`::`Vector{ScheduleBatchUpdate}`; _mediaType=nothing) -> `Vector{SchedulesCreate200ResponseInner}`, `OpenAPI.Clients.ApiResponse` <br/>
> `schedules_update`(_api::`SchedulesApi`, response_stream::`Channel`, `ad_account_id`::`String`, `schedule_batch_update`::`Vector{ScheduleBatchUpdate}`; _mediaType=nothing) -> `Channel`{ `Vector{SchedulesCreate200ResponseInner}` }, `OpenAPI.Clients.ApiResponse`

Update schedules

Update one or more schedules

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`SchedulesApi`** | API context | 
**`ad_account_id`** | **`String`** |  |
**`schedule_batch_update`** | [**`Vector{ScheduleBatchUpdate}`**](ScheduleBatchUpdate.md) |  |

### Return type

[**`Vector{SchedulesCreate200ResponseInner}`**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

