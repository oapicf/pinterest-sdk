# \SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_partner_pins**](SearchApi.md#search_partner_pins) | **GET** /search/partner/pins | Search pins by a given search term
[**search_user_boards_slash_get**](SearchApi.md#search_user_boards_slash_get) | **GET** /search/boards | Search user's boards
[**search_user_pins_slash_list**](SearchApi.md#search_user_pins_slash_list) | **GET** /search/pins | Search user's Pins



## search_partner_pins

> models::SearchPartnerPins200Response search_partner_pins(term, country_code, bookmark, locale, limit)
Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**term** | **String** | Search term to look up pins. | [required] |
**country_code** | **String** | Two letter country code (ISO 3166-1 alpha-2) | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**locale** | Option<**String**> | Search locale. |  |
**limit** | Option<**i32**> | Max search result size |  |[default to 10]

### Return type

[**models::SearchPartnerPins200Response**](search_partner_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## search_user_boards_slash_get

> models::SearchUserBoardsGet200Response search_user_boards_slash_get(ad_account_id, bookmark, page_size, query)
Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. |  |[default to 25]
**query** | Option<**String**> | Search query. Can contain pin description keywords or comma-separated pin IDs. |  |

### Return type

[**models::SearchUserBoardsGet200Response**](search_user_boards_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## search_user_pins_slash_list

> models::PinsList200Response search_user_pins_slash_list(query, ad_account_id, bookmark)
Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**query** | **String** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |

### Return type

[**models::PinsList200Response**](pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

