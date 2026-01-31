# promotions_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PromotionsCreate**](promotions_api.md#PromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**PromotionsDelete**](promotions_api.md#PromotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**PromotionsGet**](promotions_api.md#PromotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**PromotionsList**](promotions_api.md#PromotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**PromotionsUpdate**](promotions_api.md#PromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions


<a name="PromotionsCreate"></a>
# **PromotionsCreate**
> PromotionsResponse PromotionsCreate(adAccountId, promotionCreateRequest)

Create promotions

Create multiple new promotions.
<a name="PromotionsDelete"></a>
# **PromotionsDelete**
> PromotionsDelete(adAccountId, promotionId)

Delete promotion by id

Delete a promotion within Pinterest.
<a name="PromotionsGet"></a>
# **PromotionsGet**
> PromotionResponse PromotionsGet(adAccountId, promotionId)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
<a name="PromotionsList"></a>
# **PromotionsList**
> PromotionsList200Response PromotionsList(adAccountId, pageSize, order, bookmark)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
<a name="PromotionsUpdate"></a>
# **PromotionsUpdate**
> PromotionsResponse PromotionsUpdate(adAccountId, promotionUpdateRequest)

Update promotions

Update multiple promotions.
