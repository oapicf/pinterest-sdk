# PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotions_create**](PromotionsApi.md#promotions_create) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotions_delete**](PromotionsApi.md#promotions_delete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotions_get**](PromotionsApi.md#promotions_get) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotions_list**](PromotionsApi.md#promotions_list) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotions_update**](PromotionsApi.md#promotions_update) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions


# **promotions_create**
> `promotions_create`(_api::`PromotionsApi`, `ad_account_id`::`String`, `promotion_create`::`Vector{PromotionCreate}`; _mediaType=nothing) -> `PromotionsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `promotions_create`(_api::`PromotionsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `promotion_create`::`Vector{PromotionCreate}`; _mediaType=nothing) -> `Channel`{ `PromotionsResponse` }, `OpenAPI.Clients.ApiResponse`

Create promotions

Create multiple new promotions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PromotionsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`promotion_create`** | [**`Vector{PromotionCreate}`**](PromotionCreate.md) |  |

### Return type

[**`PromotionsResponse`**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **promotions_delete**
> `promotions_delete`(_api::`PromotionsApi`, `promotion_id`::`String`, `ad_account_id`::`String`; _mediaType=nothing) -> `Promotion`, `OpenAPI.Clients.ApiResponse` <br/>
> `promotions_delete`(_api::`PromotionsApi`, response_stream::`Channel`, `promotion_id`::`String`, `ad_account_id`::`String`; _mediaType=nothing) -> `Channel`{ `Promotion` }, `OpenAPI.Clients.ApiResponse`

Delete promotion by id

Delete a promotion within Pinterest.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PromotionsApi`** | API context | 
**`promotion_id`** | **`String`** | Promotion ID |
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Return type

[**`Promotion`**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **promotions_get**
> `promotions_get`(_api::`PromotionsApi`, `promotion_id`::`String`, `ad_account_id`::`String`; _mediaType=nothing) -> `Promotion`, `OpenAPI.Clients.ApiResponse` <br/>
> `promotions_get`(_api::`PromotionsApi`, response_stream::`Channel`, `promotion_id`::`String`, `ad_account_id`::`String`; _mediaType=nothing) -> `Channel`{ `Promotion` }, `OpenAPI.Clients.ApiResponse`

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PromotionsApi`** | API context | 
**`promotion_id`** | **`String`** | Promotion ID |
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Return type

[**`Promotion`**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **promotions_list**
> `promotions_list`(_api::`PromotionsApi`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, _mediaType=nothing) -> `PromotionsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `promotions_list`(_api::`PromotionsApi`, response_stream::`Channel`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, _mediaType=nothing) -> `Channel`{ `PromotionsList200Response` }, `OpenAPI.Clients.ApiResponse`

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PromotionsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]

### Return type

[**`PromotionsList200Response`**](PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **promotions_update**
> `promotions_update`(_api::`PromotionsApi`, `ad_account_id`::`String`, `promotion_batch_update`::`Vector{PromotionBatchUpdate}`; _mediaType=nothing) -> `PromotionsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `promotions_update`(_api::`PromotionsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `promotion_batch_update`::`Vector{PromotionBatchUpdate}`; _mediaType=nothing) -> `Channel`{ `PromotionsResponse` }, `OpenAPI.Clients.ApiResponse`

Update promotions

Update multiple promotions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PromotionsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`promotion_batch_update`** | [**`Vector{PromotionBatchUpdate}`**](PromotionBatchUpdate.md) |  |

### Return type

[**`PromotionsResponse`**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

