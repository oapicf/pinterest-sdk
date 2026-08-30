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
> `promotions_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `promotion_create`::`Vector{PromotionCreate}`;) -> `PromotionsResponse`

Create promotions

Create multiple new promotions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`promotion_create`** | [**`Vector{PromotionCreate}`**](PromotionCreate.md)|  |

### Return type

[**`PromotionsResponse`**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_delete**
> `promotions_delete`(req::`HTTP.Request`, `promotion_id`::`String`, `ad_account_id`::`String`;) -> `Promotion`

Delete promotion by id

Delete a promotion within Pinterest.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`promotion_id`** | **`String`**| Promotion ID |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Return type

[**`Promotion`**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_get**
> `promotions_get`(req::`HTTP.Request`, `promotion_id`::`String`, `ad_account_id`::`String`;) -> `Promotion`

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`promotion_id`** | **`String`**| Promotion ID |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Return type

[**`Promotion`**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_list**
> `promotions_list`(req::`HTTP.Request`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing,) -> `PromotionsList200Response`

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]

### Return type

[**`PromotionsList200Response`**](PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_update**
> `promotions_update`(req::`HTTP.Request`, `ad_account_id`::`String`, `promotion_batch_update`::`Vector{PromotionBatchUpdate}`;) -> `PromotionsResponse`

Update promotions

Update multiple promotions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`promotion_batch_update`** | [**`Vector{PromotionBatchUpdate}`**](PromotionBatchUpdate.md)|  |

### Return type

[**`PromotionsResponse`**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

