# ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productGroupPromotion/get**](ProductGroupPromotionsApi.md#productGroupPromotion/get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id |
| [**productGroupPromotions/create**](ProductGroupPromotionsApi.md#productGroupPromotions/create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions |
| [**productGroupPromotions/update**](ProductGroupPromotionsApi.md#productGroupPromotions/update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions |


<a name="productGroupPromotion/get"></a>
# **productGroupPromotion/get**
> ProductGroupPromotion productGroupPromotion/get(ad\_account\_id, product\_group\_promotion\_id)

Get a product group promotion by id

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; Get a product group promotion by id

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **product\_group\_promotion\_id** | **String**| Unique identifier of a product group promotion | [default to null] |

### Return type

[**ProductGroupPromotion**](../Models/ProductGroupPromotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="productGroupPromotions/create"></a>
# **productGroupPromotions/create**
> List productGroupPromotions/create(ad\_account\_id, ProductGroupPromotionCreateRequest)

Create product group promotions

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ProductGroupPromotionCreateRequest** | [**ProductGroupPromotionCreateRequest**](../Models/ProductGroupPromotionCreateRequest.md)| List of Product Group Promotions to create, size limit [1, 30]. | |

### Return type

[**List**](../Models/ProductGroupPromotionArrayElement.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="productGroupPromotions/update"></a>
# **productGroupPromotions/update**
> List productGroupPromotions/update(ad\_account\_id, ProductGroupPromotionUpdateRequest)

Update product group promotions

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; Update multiple existing Product Group Promotions (by product_group_id)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ProductGroupPromotionUpdateRequest** | [**ProductGroupPromotionUpdateRequest**](../Models/ProductGroupPromotionUpdateRequest.md)| Parameters to update Product group promotions | |

### Return type

[**List**](../Models/ProductGroupPromotionUpdateResponseItem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

