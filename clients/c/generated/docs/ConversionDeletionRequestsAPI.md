# ConversionDeletionRequestsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionDeletionRequestsAPI_conversionDeletionRequestCreate**](ConversionDeletionRequestsAPI.md#ConversionDeletionRequestsAPI_conversionDeletionRequestCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**ConversionDeletionRequestsAPI_conversionDeletionRequestDelete**](ConversionDeletionRequestsAPI.md#ConversionDeletionRequestsAPI_conversionDeletionRequestDelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**ConversionDeletionRequestsAPI_conversionDeletionRequestGet**](ConversionDeletionRequestsAPI.md#ConversionDeletionRequestsAPI_conversionDeletionRequestGet) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**ConversionDeletionRequestsAPI_conversionDeletionRequestList**](ConversionDeletionRequestsAPI.md#ConversionDeletionRequestsAPI_conversionDeletionRequestList) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests


# **ConversionDeletionRequestsAPI_conversionDeletionRequestCreate**
```c
// Create a conversion deletion request
//
// **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
//
conversion_deletion_request_t* ConversionDeletionRequestsAPI_conversionDeletionRequestCreate(apiClient_t *apiClient, char *ad_account_id, conversion_deletion_request_create_t *conversion_deletion_request_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**conversion_deletion_request_create** | **[conversion_deletion_request_create_t](conversion_deletion_request_create.md) \*** |  | 

### Return type

[conversion_deletion_request_t](conversion_deletion_request.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConversionDeletionRequestsAPI_conversionDeletionRequestDelete**
```c
// Delete a conversion deletion request
//
// **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.
//
conversion_deletion_request_t* ConversionDeletionRequestsAPI_conversionDeletionRequestDelete(apiClient_t *apiClient, char *request_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**request_id** | **char \*** | Unique identifier of the conversion deletion request | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[conversion_deletion_request_t](conversion_deletion_request.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConversionDeletionRequestsAPI_conversionDeletionRequestGet**
```c
// Get a single conversion deletion request
//
// **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.
//
conversion_deletion_request_t* ConversionDeletionRequestsAPI_conversionDeletionRequestGet(apiClient_t *apiClient, char *request_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**request_id** | **char \*** | Unique identifier of the conversion deletion request | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[conversion_deletion_request_t](conversion_deletion_request.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConversionDeletionRequestsAPI_conversionDeletionRequestList**
```c
// List conversion deletion requests
//
// **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.
//
conversion_deletion_request_list_200_response_t* ConversionDeletionRequestsAPI_conversionDeletionRequestList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
**order** | **pinterest_lib_pagination_order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[conversion_deletion_request_list_200_response_t](conversion_deletion_request_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

