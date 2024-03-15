# BOARDS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**board_sections_create**](BOARDS_API.md#board_sections_create) | **Post** /boards/{board_id}/sections | Create board section
[**board_sections_delete**](BOARDS_API.md#board_sections_delete) | **Delete** /boards/{board_id}/sections/{section_id} | Delete board section
[**board_sections_list**](BOARDS_API.md#board_sections_list) | **Get** /boards/{board_id}/sections | List board sections
[**board_sections_list_pins**](BOARDS_API.md#board_sections_list_pins) | **Get** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**board_sections_update**](BOARDS_API.md#board_sections_update) | **Patch** /boards/{board_id}/sections/{section_id} | Update board section
[**boards_create**](BOARDS_API.md#boards_create) | **Post** /boards | Create board
[**boards_delete**](BOARDS_API.md#boards_delete) | **Delete** /boards/{board_id} | Delete board
[**boards_get**](BOARDS_API.md#boards_get) | **Get** /boards/{board_id} | Get board
[**boards_list**](BOARDS_API.md#boards_list) | **Get** /boards | List boards
[**boards_list_pins**](BOARDS_API.md#boards_list_pins) | **Get** /boards/{board_id}/pins | List Pins on board
[**boards_update**](BOARDS_API.md#boards_update) | **Patch** /boards/{board_id} | Update board


# **board_sections_create**
> board_sections_create (board_id: STRING_32 ; board_section: BOARD_SECTION ; ad_account_id:  detachable STRING_32 ): detachable BOARD_SECTION


Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **STRING_32**| Unique identifier of a board. | [default to null]
 **board_section** | [**BOARD_SECTION**](BOARD_SECTION.md)| Create a board section. | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**BOARD_SECTION**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections_delete**
> board_sections_delete (board_id: STRING_32 ; section_id: STRING_32 ; ad_account_id:  detachable STRING_32 )


Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **STRING_32**| Unique identifier of a board. | [default to null]
 **section_id** | **STRING_32**| Unique identifier of a board section. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections_list**
> board_sections_list (board_id: STRING_32 ; ad_account_id:  detachable STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable BOARD_SECTIONS_LIST_200_RESPONSE


List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **STRING_32**| Unique identifier of a board. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BOARD_SECTIONS_LIST_200_RESPONSE**](board_sections_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections_list_pins**
> board_sections_list_pins (board_id: STRING_32 ; section_id: STRING_32 ; ad_account_id:  detachable STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable BOARDS_LIST_PINS_200_RESPONSE


List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **STRING_32**| Unique identifier of a board. | [default to null]
 **section_id** | **STRING_32**| Unique identifier of a board section. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BOARDS_LIST_PINS_200_RESPONSE**](boards_list_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **board_sections_update**
> board_sections_update (board_id: STRING_32 ; section_id: STRING_32 ; board_section: BOARD_SECTION ; ad_account_id:  detachable STRING_32 ): detachable BOARD_SECTION


Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **STRING_32**| Unique identifier of a board. | [default to null]
 **section_id** | **STRING_32**| Unique identifier of a board section. | [default to null]
 **board_section** | [**BOARD_SECTION**](BOARD_SECTION.md)| Update a board section. | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**BOARD_SECTION**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_create**
> boards_create (board: BOARD ; ad_account_id:  detachable STRING_32 ): detachable BOARD


Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**BOARD**](BOARD.md)| Create a board using a single board json object. | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**BOARD**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_delete**
> boards_delete (board_id: STRING_32 ; ad_account_id:  detachable STRING_32 )


Delete board

Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **STRING_32**| Unique identifier of a board. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_get**
> boards_get (board_id: STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable BOARD


Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **STRING_32**| Unique identifier of a board. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**BOARD**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_list**
> boards_list (ad_account_id:  detachable STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; privacy:  detachable STRING_32 ): detachable BOARDS_LIST_200_RESPONSE


List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **STRING_32**| Privacy setting for a board. | [optional] [default to null]

### Return type

[**BOARDS_LIST_200_RESPONSE**](boards_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_list_pins**
> boards_list_pins (board_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; creative_types:  detachable LIST [STRING_32] ; ad_account_id:  detachable STRING_32 ; pin_metrics:  detachable BOOLEAN ): detachable BOARDS_LIST_PINS_200_RESPONSE


List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **STRING_32**| Unique identifier of a board. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **creative_types** | [**LIST [STRING_32]**](STRING_32.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]
 **pin_metrics** | **BOOLEAN**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**BOARDS_LIST_PINS_200_RESPONSE**](boards_list_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boards_update**
> boards_update (board_id: STRING_32 ; board_update: BOARD_UPDATE ; ad_account_id:  detachable STRING_32 ): detachable BOARD


Update board

Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **STRING_32**| Unique identifier of a board. | [default to null]
 **board_update** | [**BOARD_UPDATE**](BOARD_UPDATE.md)| Update a board. | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**BOARD**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

