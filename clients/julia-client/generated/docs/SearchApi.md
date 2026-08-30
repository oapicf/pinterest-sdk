# SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_partner_pins**](SearchApi.md#search_partner_pins) | **GET** /search/partner/pins | Search pins by a given search term
[**search_user_boards_get**](SearchApi.md#search_user_boards_get) | **GET** /search/boards | Search user&#39;s boards
[**search_user_pins_list**](SearchApi.md#search_user_pins_list) | **GET** /search/pins | Search user&#39;s Pins


# **search_partner_pins**
> `search_partner_pins`(_api::`SearchApi`, `term`::`String`, `country_code`::`String`; `bookmark`=nothing, `locale`=nothing, `limit`=nothing, _mediaType=nothing) -> `SearchPartnerPins200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `search_partner_pins`(_api::`SearchApi`, response_stream::`Channel`, `term`::`String`, `country_code`::`String`; `bookmark`=nothing, `locale`=nothing, `limit`=nothing, _mediaType=nothing) -> `Channel`{ `SearchPartnerPins200Response` }, `OpenAPI.Clients.ApiResponse`

Search pins by a given search term

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`SearchApi`** | API context | 
**`term`** | **`String`** | Search term to look up pins. |
**`country_code`** | **`String`** | Two letter country code (ISO 3166-1 alpha-2) |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`locale`** | **`String`** | Search locale. | [default to nothing]
 **`limit`** | **`Int64`** | Max search result size | [default to 10]

### Return type

[**`SearchPartnerPins200Response`**](SearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **search_user_boards_get**
> `search_user_boards_get`(_api::`SearchApi`; `ad_account_id`=nothing, `query`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `BoardsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `search_user_boards_get`(_api::`SearchApi`, response_stream::`Channel`; `ad_account_id`=nothing, `query`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `BoardsList200Response` }, `OpenAPI.Clients.ApiResponse`

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`SearchApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`query`** | **`String`** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`BoardsList200Response`**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **search_user_pins_list**
> `search_user_pins_list`(_api::`SearchApi`, `query`::`String`; `ad_account_id`=nothing, `bookmark`=nothing, _mediaType=nothing) -> `PinsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `search_user_pins_list`(_api::`SearchApi`, response_stream::`Channel`, `query`::`String`; `ad_account_id`=nothing, `bookmark`=nothing, _mediaType=nothing) -> `Channel`{ `PinsList200Response` }, `OpenAPI.Clients.ApiResponse`

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`SearchApi`** | API context | 
**`query`** | **`String`** | Search query. Can contain pin description keywords or comma-separated pin IDs. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]

### Return type

[**`PinsList200Response`**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

