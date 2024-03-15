# boards_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**board_sections/create**](boards_api.md#board_sections/create) | **POST** /boards/{board_id}/sections | Create board section
**board_sections/delete**](boards_api.md#board_sections/delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
**board_sections/list**](boards_api.md#board_sections/list) | **GET** /boards/{board_id}/sections | List board sections
**board_sections/list_pins**](boards_api.md#board_sections/list_pins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
**board_sections/update**](boards_api.md#board_sections/update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
**boards/create**](boards_api.md#boards/create) | **POST** /boards | Create board
**boards/delete**](boards_api.md#boards/delete) | **DELETE** /boards/{board_id} | Delete board
**boards/get**](boards_api.md#boards/get) | **GET** /boards/{board_id} | Get board
**boards/list**](boards_api.md#boards/list) | **GET** /boards | List boards
**boards/list_pins**](boards_api.md#boards/list_pins) | **GET** /boards/{board_id}/pins | List Pins on board
**boards/update**](boards_api.md#boards/update) | **PATCH** /boards/{board_id} | Update board


# **board_sections/create**
> models::BoardSection board_sections/create(ctx, board_id, board_section, optional)
Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **board_id** | **String**| Unique identifier of a board. | 
  **board_section** | [**BoardSection**](BoardSection.md)| Create a board section. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **String**| Unique identifier of a board. | 
 **board_section** | [**BoardSection**](BoardSection.md)| Create a board section. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections/delete**
> board_sections/delete(ctx, board_id, section_id, optional)
Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **board_id** | **String**| Unique identifier of a board. | 
  **section_id** | **String**| Unique identifier of a board section. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **String**| Unique identifier of a board. | 
 **section_id** | **String**| Unique identifier of a board section. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections/list**
> models::BoardSectionsList200Response board_sections/list(ctx, board_id, optional)
List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **board_id** | **String**| Unique identifier of a board. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **String**| Unique identifier of a board. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]

### Return type

[**models::BoardSectionsList200Response**](board_sections_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections/list_pins**
> models::BoardsListPins200Response board_sections/list_pins(ctx, board_id, section_id, optional)
List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **board_id** | **String**| Unique identifier of a board. | 
  **section_id** | **String**| Unique identifier of a board section. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **String**| Unique identifier of a board. | 
 **section_id** | **String**| Unique identifier of a board section. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]

### Return type

[**models::BoardsListPins200Response**](boards_list_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections/update**
> models::BoardSection board_sections/update(ctx, board_id, section_id, board_section, optional)
Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **board_id** | **String**| Unique identifier of a board. | 
  **section_id** | **String**| Unique identifier of a board section. | 
  **board_section** | [**BoardSection**](BoardSection.md)| Update a board section. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **String**| Unique identifier of a board. | 
 **section_id** | **String**| Unique identifier of a board section. | 
 **board_section** | [**BoardSection**](BoardSection.md)| Update a board section. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards/create**
> models::Board boards/create(ctx, board, optional)
Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **board** | [**Board**](Board.md)| Create a board using a single board json object. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md)| Create a board using a single board json object. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards/delete**
> boards/delete(ctx, board_id, optional)
Delete board

Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **board_id** | **String**| Unique identifier of a board. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **String**| Unique identifier of a board. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards/get**
> models::Board boards/get(ctx, board_id, optional)
Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **board_id** | **String**| Unique identifier of a board. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **String**| Unique identifier of a board. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards/list**
> models::BoardsList200Response boards/list(ctx, optional)
List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

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
 **privacy** | **String**| Privacy setting for a board. | 

### Return type

[**models::BoardsList200Response**](boards_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards/list_pins**
> models::BoardsListPins200Response boards/list_pins(ctx, board_id, optional)
List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **board_id** | **String**| Unique identifier of a board. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **String**| Unique identifier of a board. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]
 **creative_types** | [**String**](String.md)| Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **pin_metrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]

### Return type

[**models::BoardsListPins200Response**](boards_list_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards/update**
> models::Board boards/update(ctx, board_id, board_update, optional)
Update board

Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **board_id** | **String**| Unique identifier of a board. | 
  **board_update** | [**BoardUpdate**](BoardUpdate.md)| Update a board. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **String**| Unique identifier of a board. | 
 **board_update** | [**BoardUpdate**](BoardUpdate.md)| Update a board. | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

