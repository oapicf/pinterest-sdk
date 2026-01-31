# PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**promotions/create**](PromotionsApi.md#promotions/create) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions |
| [**promotions/delete**](PromotionsApi.md#promotions/delete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id |
| [**promotions/get**](PromotionsApi.md#promotions/get) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id |
| [**promotions/list**](PromotionsApi.md#promotions/list) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions |
| [**promotions/update**](PromotionsApi.md#promotions/update) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions |


<a name="promotions/create"></a>
# **promotions/create**
> PromotionsResponse promotions/create(ad\_account\_id, PromotionCreateRequest)

Create promotions

    Create multiple new promotions.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **PromotionCreateRequest** | [**List**](../Models/PromotionCreateRequest.md)| List of promotions to create, size limit [1, 30]. | |

### Return type

[**PromotionsResponse**](../Models/PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="promotions/delete"></a>
# **promotions/delete**
> promotions/delete(ad\_account\_id, promotion\_id)

Delete promotion by id

    Delete a promotion within Pinterest.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **promotion\_id** | **String**| Unique identifier of a promotion | [default to null] |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="promotions/get"></a>
# **promotions/get**
> PromotionResponse promotions/get(ad\_account\_id, promotion\_id)

Get promotion by id

    Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **promotion\_id** | **String**| Unique identifier of a promotion | [default to null] |

### Return type

[**PromotionResponse**](../Models/PromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="promotions/list"></a>
# **promotions/list**
> promotions_list_200_response promotions/list(ad\_account\_id, page\_size, order, bookmark)

Get promotions

    Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**promotions_list_200_response**](../Models/promotions_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="promotions/update"></a>
# **promotions/update**
> PromotionsResponse promotions/update(ad\_account\_id, PromotionUpdateRequest)

Update promotions

    Update multiple promotions.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **PromotionUpdateRequest** | [**List**](../Models/PromotionUpdateRequest.md)| List of promotions to create, size limit [1, 30]. | |

### Return type

[**PromotionsResponse**](../Models/PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

