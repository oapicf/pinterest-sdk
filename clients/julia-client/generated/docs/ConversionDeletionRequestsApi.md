# ConversionDeletionRequestsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_deletion_request_create**](ConversionDeletionRequestsApi.md#conversion_deletion_request_create) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**conversion_deletion_request_delete**](ConversionDeletionRequestsApi.md#conversion_deletion_request_delete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**conversion_deletion_request_get**](ConversionDeletionRequestsApi.md#conversion_deletion_request_get) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**conversion_deletion_request_list**](ConversionDeletionRequestsApi.md#conversion_deletion_request_list) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests


# **conversion_deletion_request_create**
> `conversion_deletion_request_create`(_api::`ConversionDeletionRequestsApi`, `ad_account_id`::`String`, `conversion_deletion_request_create_param`::`ConversionDeletionRequestCreate`; _mediaType=nothing) -> `ConversionDeletionRequest`, `OpenAPI.Clients.ApiResponse` <br/>
> `conversion_deletion_request_create`(_api::`ConversionDeletionRequestsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `conversion_deletion_request_create_param`::`ConversionDeletionRequestCreate`; _mediaType=nothing) -> `Channel`{ `ConversionDeletionRequest` }, `OpenAPI.Clients.ApiResponse`

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ConversionDeletionRequestsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`conversion_deletion_request_create_param`** | [**`ConversionDeletionRequestCreate`**](ConversionDeletionRequestCreate.md) |  |

### Return type

[**`ConversionDeletionRequest`**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **conversion_deletion_request_delete**
> `conversion_deletion_request_delete`(_api::`ConversionDeletionRequestsApi`, `request_id`::`String`, `ad_account_id`::`String`; _mediaType=nothing) -> `ConversionDeletionRequest`, `OpenAPI.Clients.ApiResponse` <br/>
> `conversion_deletion_request_delete`(_api::`ConversionDeletionRequestsApi`, response_stream::`Channel`, `request_id`::`String`, `ad_account_id`::`String`; _mediaType=nothing) -> `Channel`{ `ConversionDeletionRequest` }, `OpenAPI.Clients.ApiResponse`

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ConversionDeletionRequestsApi`** | API context | 
**`request_id`** | **`String`** | Unique identifier of the conversion deletion request |
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Return type

[**`ConversionDeletionRequest`**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **conversion_deletion_request_get**
> `conversion_deletion_request_get`(_api::`ConversionDeletionRequestsApi`, `request_id`::`String`, `ad_account_id`::`String`; _mediaType=nothing) -> `ConversionDeletionRequest`, `OpenAPI.Clients.ApiResponse` <br/>
> `conversion_deletion_request_get`(_api::`ConversionDeletionRequestsApi`, response_stream::`Channel`, `request_id`::`String`, `ad_account_id`::`String`; _mediaType=nothing) -> `Channel`{ `ConversionDeletionRequest` }, `OpenAPI.Clients.ApiResponse`

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ConversionDeletionRequestsApi`** | API context | 
**`request_id`** | **`String`** | Unique identifier of the conversion deletion request |
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Return type

[**`ConversionDeletionRequest`**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **conversion_deletion_request_list**
> `conversion_deletion_request_list`(_api::`ConversionDeletionRequestsApi`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, _mediaType=nothing) -> `ConversionDeletionRequestList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `conversion_deletion_request_list`(_api::`ConversionDeletionRequestsApi`, response_stream::`Channel`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, _mediaType=nothing) -> `Channel`{ `ConversionDeletionRequestList200Response` }, `OpenAPI.Clients.ApiResponse`

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ConversionDeletionRequestsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]

### Return type

[**`ConversionDeletionRequestList200Response`**](ConversionDeletionRequestList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

