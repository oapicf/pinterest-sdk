# AudiencesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudiencesAPI_audiencesCreate**](AudiencesAPI.md#AudiencesAPI_audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**AudiencesAPI_audiencesCreateCustom**](AudiencesAPI.md#AudiencesAPI_audiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**AudiencesAPI_audiencesGet**](AudiencesAPI.md#AudiencesAPI_audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**AudiencesAPI_audiencesList**](AudiencesAPI.md#AudiencesAPI_audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**AudiencesAPI_audiencesUpdate**](AudiencesAPI.md#AudiencesAPI_audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **AudiencesAPI_audiencesCreate**
```c
// Create audience
//
// Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
//
audience_t* AudiencesAPI_audiencesCreate(apiClient_t *apiClient, char *ad_account_id, audience_create_request_t *audience_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**audience_create_request** | **[audience_create_request_t](audience_create_request.md) \*** | List of ads to create, size limit [1, 30] | 

### Return type

[audience_t](audience.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudiencesAPI_audiencesCreateCustom**
```c
// Create custom audience
//
// Create a custom audience and find the audiences you want your ads to reach.
//
audience_t* AudiencesAPI_audiencesCreateCustom(apiClient_t *apiClient, char *ad_account_id, audience_create_custom_request_t *audience_create_custom_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**audience_create_custom_request** | **[audience_create_custom_request_t](audience_create_custom_request.md) \*** | Custom audience to create. | 

### Return type

[audience_t](audience.md) *


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
audience_t* AudiencesAPI_audiencesGet(apiClient_t *apiClient, char *ad_account_id, char *audience_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**audience_id** | **char \*** | Unique identifier of an audience | 

### Return type

[audience_t](audience.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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
audiences_list_200_response_t* AudiencesAPI_audiencesList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, pinterest_rest_api_audiencesList_order_e order, int *page_size, pinterest_rest_api_audiencesList_ownership_type_e ownership_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**order** | **pinterest_rest_api_audiencesList_order_e** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**ownership_type** | **pinterest_rest_api_audiencesList_ownership_type_e** | Filter audiences by ownership type. | [optional] [default to &#39;OWNED&#39;]

### Return type

[audiences_list_200_response_t](audiences_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudiencesAPI_audiencesUpdate**
```c
// Update audience
//
// Update (edit or remove) an existing targeting audience.
//
audience_t* AudiencesAPI_audiencesUpdate(apiClient_t *apiClient, char *ad_account_id, char *audience_id, audience_update_request_t *audience_update_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**audience_id** | **char \*** | Unique identifier of an audience | 
**audience_update_request** | **[audience_update_request_t](audience_update_request.md) \*** | The audience to be updated. | [optional] 

### Return type

[audience_t](audience.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

