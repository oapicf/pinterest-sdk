# ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productGroupPromotion/get**](ProductGroupPromotionsApi.md#productGroupPromotion/get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id |
| [**productGroupPromotions/create**](ProductGroupPromotionsApi.md#productGroupPromotions/create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions |
| [**productGroupPromotions/update**](ProductGroupPromotionsApi.md#productGroupPromotions/update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions |
| [**productGroups/analytics**](ProductGroupPromotionsApi.md#productGroups/analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics |


<a name="productGroupPromotion/get"></a>
# **productGroupPromotion/get**
> ProductGroupPromotion productGroupPromotion/get(ad\_account\_id, product\_group\_promotion\_id)

Get a product group promotion by id

    Get a product group promotion by id

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

    Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)

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

    Update multiple existing Product Group Promotions (by product_group_id)

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

<a name="productGroups/analytics"></a>
# **productGroups/analytics**
> List productGroups/analytics(ad\_account\_id, start\_date, end\_date, product\_group\_ids, columns, granularity, click\_window\_days, engagement\_window\_days, view\_window\_days, conversion\_report\_time)

Get product group analytics

    Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD | [default to null] |
| **product\_group\_ids** | [**List**](../Models/String.md)| List of Product group Ids to use to filter the results. | [default to null] |
| **columns** | [**List**](../Models/String.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null] [enum: ADVERTISER_ID, PIN_PROMOTION_ID, AD_ACCOUNT_ID, AD_GROUP_ENTITY_STATUS, AD_GROUP_ID, AD_ID, CAMPAIGN_DAILY_SPEND_CAP, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_ID, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_NAME, CHECKOUT_ROAS, CLICKTHROUGH_1, CLICKTHROUGH_1_GROSS, CLICKTHROUGH_2, CPC_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, CPM_IN_MICRO_DOLLAR, CTR, CTR_2, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, ECPC_IN_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPE_IN_DOLLAR, ECPM_IN_MICRO_DOLLAR, ECPV_IN_DOLLAR, ECTR, EENGAGEMENT_RATE, ENGAGEMENT_1, ENGAGEMENT_2, ENGAGEMENT_RATE, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, IMPRESSION_1, IMPRESSION_1_GROSS, IMPRESSION_2, INAPP_CHECKOUT_COST_PER_ACTION, OUTBOUND_CLICK_1, OUTBOUND_CLICK_2, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, PAID_IMPRESSION, PIN_ID, REPIN_1, REPIN_2, REPIN_RATE, SPEND_IN_DOLLAR, SPEND_IN_MICRO_DOLLAR, TOTAL_CHECKOUT, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICKTHROUGH, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CONVERSIONS, TOTAL_CUSTOM, TOTAL_ENGAGEMENT, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_LEAD, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, TOTAL_IMPRESSION_FREQUENCY, TOTAL_IMPRESSION_USER, TOTAL_LEAD, TOTAL_OFFLINE_CHECKOUT, TOTAL_PAGE_VISIT, TOTAL_REPIN_RATE, TOTAL_SIGNUP, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, VIDEO_3SEC_VIEWS_2, VIDEO_LENGTH, VIDEO_MRC_VIEWS_2, VIDEO_P0_COMBINED_2, VIDEO_P100_COMPLETE_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, WEB_SESSIONS_1, WEB_SESSIONS_2] |
| **granularity** | [**Granularity**](../Models/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **click\_window\_days** | **Integer**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 1, 7, 30, 60] |
| **engagement\_window\_days** | **Integer**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 1, 7, 30, 60] |
| **view\_window\_days** | **Integer**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 1, 7, 30, 60] |
| **conversion\_report\_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |

### Return type

[**List**](../Models/ProductGroupAnalyticsResponse_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

