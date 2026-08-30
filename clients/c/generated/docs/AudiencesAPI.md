# AudiencesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudiencesAPI_audiencesCreate**](AudiencesAPI.md#AudiencesAPI_audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**AudiencesAPI_audiencesGet**](AudiencesAPI.md#AudiencesAPI_audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**AudiencesAPI_audiencesList**](AudiencesAPI.md#AudiencesAPI_audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**AudiencesAPI_audiencesUpdate**](AudiencesAPI.md#AudiencesAPI_audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **AudiencesAPI_audiencesCreate**
```c
// Create audience
//
// Create a new audience for the ad account.
//
ad_accounts_audience_t* AudiencesAPI_audiencesCreate(apiClient_t *apiClient, char *ad_account_id, ad_accounts_audience_create_t *ad_accounts_audience_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_accounts_audience_create** | **[ad_accounts_audience_create_t](ad_accounts_audience_create.md) \*** |  | 

### Return type

[ad_accounts_audience_t](ad_accounts_audience.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudiencesAPI_audiencesGet**
```c
// Get audience
//
// Get a specific audience given the audience ID.
//
ad_accounts_audience_t* AudiencesAPI_audiencesGet(apiClient_t *apiClient, char *audience_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**audience_id** | **char \*** | Audience ID. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[ad_accounts_audience_t](ad_accounts_audience.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudiencesAPI_audiencesList**
```c
// List audiences
//
// Get list of audiences for the ad account.
//
audiences_list_200_response_t* AudiencesAPI_audiencesList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, audience_ownership_type_e ownership_type, int *exclude_nca);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
**order** | **pinterest_lib_pagination_order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**ownership_type** | **audience_ownership_type_e** |  | [optional] 
**exclude_nca** | **int \*** | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[audiences_list_200_response_t](audiences_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudiencesAPI_audiencesUpdate**
```c
// Update audience
//
// Update an existing audience for the ad account.
//
ad_accounts_audience_t* AudiencesAPI_audiencesUpdate(apiClient_t *apiClient, char *audience_id, char *ad_account_id, ad_accounts_audience_update_t *ad_accounts_audience_update);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**audience_id** | **char \*** | Audience ID. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_accounts_audience_update** | **[ad_accounts_audience_update_t](ad_accounts_audience_update.md) \*** |  | 

### Return type

[ad_accounts_audience_t](ad_accounts_audience.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

