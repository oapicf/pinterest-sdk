# BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**board_sections_create**](BoardsApi.md#board_sections_create) | **POST** /boards/{board_id}/sections | Create board section
[**board_sections_delete**](BoardsApi.md#board_sections_delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**board_sections_list**](BoardsApi.md#board_sections_list) | **GET** /boards/{board_id}/sections | List board sections
[**board_sections_list_pins**](BoardsApi.md#board_sections_list_pins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**board_sections_update**](BoardsApi.md#board_sections_update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boards_create**](BoardsApi.md#boards_create) | **POST** /boards | Create board
[**boards_delete**](BoardsApi.md#boards_delete) | **DELETE** /boards/{board_id} | Delete board
[**boards_get**](BoardsApi.md#boards_get) | **GET** /boards/{board_id} | Get board
[**boards_list**](BoardsApi.md#boards_list) | **GET** /boards | List boards
[**boards_list_pins**](BoardsApi.md#boards_list_pins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boards_update**](BoardsApi.md#boards_update) | **PATCH** /boards/{board_id} | Update board


# **board_sections_create**
> `board_sections_create`(_api::`BoardsApi`, `board_id`::`String`, `board_section_create`::`BoardSectionCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `BoardSection`, `OpenAPI.Clients.ApiResponse` <br/>
> `board_sections_create`(_api::`BoardsApi`, response_stream::`Channel`, `board_id`::`String`, `board_section_create`::`BoardSectionCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `BoardSection` }, `OpenAPI.Clients.ApiResponse`

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 
**`board_id`** | **`String`** | Unique identifier of a board. |
**`board_section_create`** | [**`BoardSectionCreate`**](BoardSectionCreate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`BoardSection`**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **board_sections_delete**
> `board_sections_delete`(_api::`BoardsApi`, `board_id`::`String`, `section_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `BoardSection`, `OpenAPI.Clients.ApiResponse` <br/>
> `board_sections_delete`(_api::`BoardsApi`, response_stream::`Channel`, `board_id`::`String`, `section_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `BoardSection` }, `OpenAPI.Clients.ApiResponse`

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 
**`board_id`** | **`String`** | Unique identifier of a board. |
**`section_id`** | **`String`** | Unique identifier of a board section. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`BoardSection`**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **board_sections_list**
> `board_sections_list`(_api::`BoardsApi`, `board_id`::`String`; `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `BoardSectionsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `board_sections_list`(_api::`BoardsApi`, response_stream::`Channel`, `board_id`::`String`; `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `BoardSectionsList200Response` }, `OpenAPI.Clients.ApiResponse`

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 
**`board_id`** | **`String`** | Unique identifier of a board. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`BoardSectionsList200Response`**](BoardSectionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **board_sections_list_pins**
> `board_sections_list_pins`(_api::`BoardsApi`, `board_id`::`String`, `section_id`::`String`; `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `BoardsListPins200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `board_sections_list_pins`(_api::`BoardsApi`, response_stream::`Channel`, `board_id`::`String`, `section_id`::`String`; `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `BoardsListPins200Response` }, `OpenAPI.Clients.ApiResponse`

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 
**`board_id`** | **`String`** | Unique identifier of a board. |
**`section_id`** | **`String`** | Unique identifier of a board section. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`BoardsListPins200Response`**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **board_sections_update**
> `board_sections_update`(_api::`BoardsApi`, `board_id`::`String`, `section_id`::`String`, `board_section_update_with_required_body`::`BoardSectionUpdateWithRequiredBody`; `ad_account_id`=nothing, _mediaType=nothing) -> `BoardSection`, `OpenAPI.Clients.ApiResponse` <br/>
> `board_sections_update`(_api::`BoardsApi`, response_stream::`Channel`, `board_id`::`String`, `section_id`::`String`, `board_section_update_with_required_body`::`BoardSectionUpdateWithRequiredBody`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `BoardSection` }, `OpenAPI.Clients.ApiResponse`

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 
**`board_id`** | **`String`** | Unique identifier of a board. |
**`section_id`** | **`String`** | Unique identifier of a board section. |
**`board_section_update_with_required_body`** | [**`BoardSectionUpdateWithRequiredBody`**](BoardSectionUpdateWithRequiredBody.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`BoardSection`**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **boards_create**
> `boards_create`(_api::`BoardsApi`, `board_create`::`BoardCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Board`, `OpenAPI.Clients.ApiResponse` <br/>
> `boards_create`(_api::`BoardsApi`, response_stream::`Channel`, `board_create`::`BoardCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Board` }, `OpenAPI.Clients.ApiResponse`

Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 
**`board_create`** | [**`BoardCreate`**](BoardCreate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Board`**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **boards_delete**
> `boards_delete`(_api::`BoardsApi`, `board_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Board`, `OpenAPI.Clients.ApiResponse` <br/>
> `boards_delete`(_api::`BoardsApi`, response_stream::`Channel`, `board_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Board` }, `OpenAPI.Clients.ApiResponse`

Delete board

Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 
**`board_id`** | **`String`** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Board`**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **boards_get**
> `boards_get`(_api::`BoardsApi`, `board_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Board`, `OpenAPI.Clients.ApiResponse` <br/>
> `boards_get`(_api::`BoardsApi`, response_stream::`Channel`, `board_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Board` }, `OpenAPI.Clients.ApiResponse`

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 
**`board_id`** | **`String`** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Board`**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **boards_list**
> `boards_list`(_api::`BoardsApi`; `ad_account_id`=nothing, `privacy`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `BoardsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `boards_list`(_api::`BoardsApi`, response_stream::`Channel`; `ad_account_id`=nothing, `privacy`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `BoardsList200Response` }, `OpenAPI.Clients.ApiResponse`

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`privacy`** | [**`BoardPrivacyFilter`**](.md) | The privacy level of the board | [default to nothing]
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

# **boards_list_pins**
> `boards_list_pins`(_api::`BoardsApi`, `board_id`::`String`; `creative_types`=nothing, `ad_account_id`=nothing, `pin_metrics`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `BoardsListPins200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `boards_list_pins`(_api::`BoardsApi`, response_stream::`Channel`, `board_id`::`String`; `creative_types`=nothing, `ad_account_id`=nothing, `pin_metrics`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `BoardsListPins200Response` }, `OpenAPI.Clients.ApiResponse`

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 
**`board_id`** | **`String`** | Unique identifier of a board. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`creative_types`** | [**`Vector{CreativeType}`**](CreativeType.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [default to nothing]
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`pin_metrics`** | **`Bool`** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`BoardsListPins200Response`**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **boards_update**
> `boards_update`(_api::`BoardsApi`, `board_id`::`String`, `board_with_update_privacy_update`::`BoardWithUpdatePrivacyUpdate`; `ad_account_id`=nothing, _mediaType=nothing) -> `BoardWithUpdatePrivacy`, `OpenAPI.Clients.ApiResponse` <br/>
> `boards_update`(_api::`BoardsApi`, response_stream::`Channel`, `board_id`::`String`, `board_with_update_privacy_update`::`BoardWithUpdatePrivacyUpdate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `BoardWithUpdatePrivacy` }, `OpenAPI.Clients.ApiResponse`

Update board

Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BoardsApi`** | API context | 
**`board_id`** | **`String`** |  |
**`board_with_update_privacy_update`** | [**`BoardWithUpdatePrivacyUpdate`**](BoardWithUpdatePrivacyUpdate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`BoardWithUpdatePrivacy`**](BoardWithUpdatePrivacy.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

