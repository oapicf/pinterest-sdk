# SEARCH_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**search_partner_pins**](SEARCH_API.md#search_partner_pins) | **Get** /search/partner/pins | Search pins by a given search term
[**search_user_boards_get**](SEARCH_API.md#search_user_boards_get) | **Get** /search/boards | Search user&#39;s boards
[**search_user_pins_list**](SEARCH_API.md#search_user_pins_list) | **Get** /search/pins | Search user&#39;s Pins


# **search_partner_pins**
> search_partner_pins (term: STRING_32 ; country_code: STRING_32 ; bookmark:  detachable STRING_32 ; locale:  detachable STRING_32 ; limit:  detachable INTEGER_32 ): detachable SEARCH_PARTNER_PINS_200_RESPONSE


Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **STRING_32**| Search term to look up pins. | [default to null]
 **country_code** | **STRING_32**| Two letter country code (ISO 3166-1 alpha-2) | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **locale** | **STRING_32**| Search locale. | [optional] [default to null]
 **limit** | **INTEGER_32**| Max search result size | [optional] [default to 10]

### Return type

[**SEARCH_PARTNER_PINS_200_RESPONSE**](search_partner_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_user_boards_get**
> search_user_boards_get (ad_account_id:  detachable STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; query:  detachable STRING_32 ): detachable SEARCH_USER_BOARDS_GET_200_RESPONSE


Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **query** | **STRING_32**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] [default to null]

### Return type

[**SEARCH_USER_BOARDS_GET_200_RESPONSE**](search_user_boards_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_user_pins_list**
> search_user_pins_list (query: STRING_32 ; ad_account_id:  detachable STRING_32 ; bookmark:  detachable STRING_32 ): detachable PINS_LIST_200_RESPONSE


Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **STRING_32**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**PINS_LIST_200_RESPONSE**](pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

