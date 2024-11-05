# PRODUCTGROUPPROMOTIONS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**product_group_promotions_create**](PRODUCTGROUPPROMOTIONS_API.md#product_group_promotions_create) | **Post** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**product_group_promotions_get**](PRODUCTGROUPPROMOTIONS_API.md#product_group_promotions_get) | **Get** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**product_group_promotions_list**](PRODUCTGROUPPROMOTIONS_API.md#product_group_promotions_list) | **Get** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**product_group_promotions_update**](PRODUCTGROUPPROMOTIONS_API.md#product_group_promotions_update) | **Patch** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**product_groups_analytics**](PRODUCTGROUPPROMOTIONS_API.md#product_groups_analytics) | **Get** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **product_group_promotions_create**
> product_group_promotions_create (ad_account_id: STRING_32 ; product_group_promotion_create_request: PRODUCT_GROUP_PROMOTION_CREATE_REQUEST ): detachable PRODUCT_GROUP_PROMOTION_RESPONSE


Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **product_group_promotion_create_request** | [**PRODUCT_GROUP_PROMOTION_CREATE_REQUEST**](PRODUCT_GROUP_PROMOTION_CREATE_REQUEST.md)| List of Product Group Promotions to create, size limit [1, 30]. | 

### Return type

[**PRODUCT_GROUP_PROMOTION_RESPONSE**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_get**
> product_group_promotions_get (ad_account_id: STRING_32 ; product_group_promotion_id: STRING_32 ): detachable PRODUCT_GROUP_PROMOTION_RESPONSE


Get a product group promotion by id

Get a product group promotion by id


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **product_group_promotion_id** | **STRING_32**| Unique identifier of a product group promotion | [default to null]

### Return type

[**PRODUCT_GROUP_PROMOTION_RESPONSE**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_list**
> product_group_promotions_list (ad_account_id: STRING_32 ; product_group_promotion_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [STRING_32] ; ad_group_id:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable STRING_32 ; bookmark:  detachable STRING_32 ): detachable PRODUCT_GROUP_PROMOTIONS_LIST_200_RESPONSE


Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **product_group_promotion_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Product group promotion Ids. | [optional] [default to null]
 **entity_statuses** | [**LIST [STRING_32]**](STRING_32.md)| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **ad_group_id** | **STRING_32**| Ad group Id. | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**PRODUCT_GROUP_PROMOTIONS_LIST_200_RESPONSE**](product_group_promotions_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_update**
> product_group_promotions_update (ad_account_id: STRING_32 ; product_group_promotion_update_request: PRODUCT_GROUP_PROMOTION_UPDATE_REQUEST ): detachable PRODUCT_GROUP_PROMOTION_RESPONSE


Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **product_group_promotion_update_request** | [**PRODUCT_GROUP_PROMOTION_UPDATE_REQUEST**](PRODUCT_GROUP_PROMOTION_UPDATE_REQUEST.md)| Parameters to update Product group promotions | 

### Return type

[**PRODUCT_GROUP_PROMOTION_RESPONSE**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_groups_analytics**
> product_groups_analytics (ad_account_id: STRING_32 ; start_date: DATE ; end_date: DATE ; product_group_ids: LIST [STRING_32] ; columns: LIST [STRING_32] ; granularity: GRANULARITY ; click_window_days:  detachable INTEGER_32 ; engagement_window_days:  detachable INTEGER_32 ; view_window_days:  detachable INTEGER_32 ; conversion_report_time:  detachable STRING_32 ): detachable LIST [PRODUCT_GROUP_ANALYTICS_RESPONSE_INNER]


Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **product_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Product group Ids to use to filter the results. | [default to null]
 **columns** | [**LIST [STRING_32]**](STRING_32.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [default to null]
 **granularity** | [**GRANULARITY**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [default to null]
 **click_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **INTEGER_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

[**LIST [PRODUCT_GROUP_ANALYTICS_RESPONSE_INNER]**](ProductGroupAnalyticsResponse_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

