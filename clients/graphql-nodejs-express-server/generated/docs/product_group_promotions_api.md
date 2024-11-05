# product_group_promotions_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProductGroupPromotionsCreate**](product_group_promotions_api.md#ProductGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**ProductGroupPromotionsGet**](product_group_promotions_api.md#ProductGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**ProductGroupPromotionsList**](product_group_promotions_api.md#ProductGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**ProductGroupPromotionsUpdate**](product_group_promotions_api.md#ProductGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**ProductGroupsAnalytics**](product_group_promotions_api.md#ProductGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


<a name="ProductGroupPromotionsCreate"></a>
# **ProductGroupPromotionsCreate**
> ProductGroupPromotionResponse ProductGroupPromotionsCreate(adAccountId, productGroupPromotionCreateRequest)

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
<a name="ProductGroupPromotionsGet"></a>
# **ProductGroupPromotionsGet**
> ProductGroupPromotionResponse ProductGroupPromotionsGet(adAccountId, productGroupPromotionId)

Get a product group promotion by id

Get a product group promotion by id
<a name="ProductGroupPromotionsList"></a>
# **ProductGroupPromotionsList**
> ProductGroupPromotionsList200Response ProductGroupPromotionsList(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark)

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  &lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
<a name="ProductGroupPromotionsUpdate"></a>
# **ProductGroupPromotionsUpdate**
> ProductGroupPromotionResponse ProductGroupPromotionsUpdate(adAccountId, productGroupPromotionUpdateRequest)

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)
<a name="ProductGroupsAnalytics"></a>
# **ProductGroupsAnalytics**
> ProductGroupAnalyticsResponseInner ProductGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

Get product group analytics

Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
