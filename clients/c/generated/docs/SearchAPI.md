# SearchAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchAPI_searchPartnerPins**](SearchAPI.md#SearchAPI_searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
[**SearchAPI_searchUserBoardsGet**](SearchAPI.md#SearchAPI_searchUserBoardsGet) | **GET** /search/boards | Search user&#39;s boards
[**SearchAPI_searchUserPinsList**](SearchAPI.md#SearchAPI_searchUserPinsList) | **GET** /search/pins | Search user&#39;s Pins


# **SearchAPI_searchPartnerPins**
```c
// Search pins by a given search term
//
// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
//
search_partner_pins_200_response_t* SearchAPI_searchPartnerPins(apiClient_t *apiClient, char *term, char *country_code, char *bookmark, char *locale, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**term** | **char \*** | Search term to look up pins. | 
**country_code** | **char \*** | Two letter country code (ISO 3166-1 alpha-2) | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**locale** | **char \*** | Search locale. | [optional] 
**limit** | **int \*** | Max search result size | [optional] [default to 10]

### Return type

[search_partner_pins_200_response_t](search_partner_pins_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SearchAPI_searchUserBoardsGet**
```c
// Search user's boards
//
// Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
//
search_user_boards_get_200_response_t* SearchAPI_searchUserBoardsGet(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, char *query);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**query** | **char \*** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[search_user_boards_get_200_response_t](search_user_boards_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SearchAPI_searchUserPinsList**
```c
// Search user's Pins
//
// Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
//
pins_list_200_response_t* SearchAPI_searchUserPinsList(apiClient_t *apiClient, char *query, char *ad_account_id, char *bookmark);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**query** | **char \*** | Search query. Can contain pin description keywords or comma-separated pin IDs. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 

### Return type

[pins_list_200_response_t](pins_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

