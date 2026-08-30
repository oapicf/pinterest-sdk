# \PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotions_slash_create**](PromotionsApi.md#promotions_slash_create) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotions_slash_delete**](PromotionsApi.md#promotions_slash_delete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotions_slash_get**](PromotionsApi.md#promotions_slash_get) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotions_slash_list**](PromotionsApi.md#promotions_slash_list) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotions_slash_update**](PromotionsApi.md#promotions_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions



## promotions_slash_create

> models::PromotionsResponse promotions_slash_create(ad_account_id, promotion_create)
Create promotions

Create multiple new promotions.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**promotion_create** | [**Vec<models::PromotionCreate>**](PromotionCreate.md) |  | [required] |

### Return type

[**models::PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## promotions_slash_delete

> models::Promotion promotions_slash_delete(promotion_id, ad_account_id)
Delete promotion by id

Delete a promotion within Pinterest.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**promotion_id** | **String** | Promotion ID | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## promotions_slash_get

> models::Promotion promotions_slash_get(promotion_id, ad_account_id)
Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**promotion_id** | **String** | Promotion ID | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## promotions_slash_list

> models::PromotionsList200Response promotions_slash_list(ad_account_id, bookmark, page_size, order)
Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]
**order** | Option<[**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)> | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. |  |

### Return type

[**models::PromotionsList200Response**](promotions_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## promotions_slash_update

> models::PromotionsResponse promotions_slash_update(ad_account_id, promotion_batch_update)
Update promotions

Update multiple promotions.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**promotion_batch_update** | [**Vec<models::PromotionBatchUpdate>**](PromotionBatchUpdate.md) |  | [required] |

### Return type

[**models::PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

