# search_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**search_partner_pins**](search_api.md#search_partner_pins) | **GET** /search/partner/pins | Search pins by a given search term
**search_user_boards/get**](search_api.md#search_user_boards/get) | **GET** /search/boards | Search user's boards
**search_user_pins/list**](search_api.md#search_user_pins/list) | **GET** /search/pins | Search user's Pins


# **search_partner_pins**
> models::SearchPartnerPins200Response search_partner_pins(ctx, term, country_code, optional)
Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **term** | **String**| Search term to look up pins. | 
  **country_code** | **String**| Two letter country code (ISO 3166-1 alpha-2) | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**| Search term to look up pins. | 
 **country_code** | **String**| Two letter country code (ISO 3166-1 alpha-2) | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **locale** | **String**| Search locale. | 
 **limit** | **i32**| Max search result size | [default to 10]

### Return type

[**models::SearchPartnerPins200Response**](search_partner_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_user_boards/get**
> models::SearchUserBoardsGet200Response search_user_boards/get(ctx, optional)
Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]
 **query** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | 

### Return type

[**models::SearchUserBoardsGet200Response**](search_user_boards_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_user_pins/list**
> models::PinsList200Response search_user_pins/list(ctx, query, optional)
Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **query** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 

### Return type

[**models::PinsList200Response**](pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

