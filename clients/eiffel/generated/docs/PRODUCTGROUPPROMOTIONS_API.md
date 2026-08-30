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
> product_group_promotions_create (ad_account_id: STRING_32 ; product_group_promotions_create: PRODUCT_GROUP_PROMOTIONS_CREATE ): detachable PRODUCT_GROUP_PROMOTIONS


Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **product_group_promotions_create** | [**PRODUCT_GROUP_PROMOTIONS_CREATE**](PRODUCT_GROUP_PROMOTIONS_CREATE.md)|  | 

### Return type

[**PRODUCT_GROUP_PROMOTIONS**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_get**
> product_group_promotions_get (ad_account_id: STRING_32 ; product_group_promotion_id: STRING_32 ): detachable PRODUCT_GROUP_PROMOTION


Get a product group promotion by id

Get a product group promotion by id


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **product_group_promotion_id** | **STRING_32**| Unique identifier of a product group promotion | [default to null]

### Return type

[**PRODUCT_GROUP_PROMOTION**](ProductGroupPromotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_list**
> product_group_promotions_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ; product_group_promotion_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [ENTITY_STATUS] ; ad_group_id:  detachable STRING_32 ): detachable PRODUCT_GROUP_PROMOTIONS_LIST_200_RESPONSE


Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **product_group_promotion_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Product group promotion Ids. | [optional] [default to null]
 **entity_statuses** | [**LIST [ENTITY_STATUS]**](ENTITY_STATUS.md)| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **ad_group_id** | **STRING_32**| Ad group Id. | [optional] [default to null]

### Return type

[**PRODUCT_GROUP_PROMOTIONS_LIST_200_RESPONSE**](product_group_promotions_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_update**
> product_group_promotions_update (ad_account_id: STRING_32 ; product_group_promotions_update_with_required_body: PRODUCT_GROUP_PROMOTIONS_UPDATE_WITH_REQUIRED_BODY ): detachable PRODUCT_GROUP_PROMOTIONS


Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **product_group_promotions_update_with_required_body** | [**PRODUCT_GROUP_PROMOTIONS_UPDATE_WITH_REQUIRED_BODY**](PRODUCT_GROUP_PROMOTIONS_UPDATE_WITH_REQUIRED_BODY.md)|  | 

### Return type

[**PRODUCT_GROUP_PROMOTIONS**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_groups_analytics**
> product_groups_analytics (start_date: DATE ; end_date: DATE ; product_group_ids: LIST [STRING_32] ; columns: LIST [REPORTING_COLUMN_SYNC] ; granularity: GRANULARITY ; ad_account_id: STRING_32 ; click_window_days:  detachable REAL_32 ; engagement_window_days:  detachable REAL_32 ; view_window_days:  detachable REAL_32 ; conversion_report_time:  detachable STRING_32 ; reporting_timezone:  detachable REPORTING_TIME_ZONE ): detachable LIST [PRODUCT_GROUP_ANALYTICS_ITEMS]


Get product group analytics

Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **product_group_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Product group Ids to use to filter the results. | [default to null]
 **columns** | [**LIST [REPORTING_COLUMN_SYNC]**](REPORTING_COLUMN_SYNC.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**GRANULARITY**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **click_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **REAL_32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **STRING_32**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **reporting_timezone** | [**REPORTING_TIME_ZONE**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**LIST [PRODUCT_GROUP_ANALYTICS_ITEMS]**](ProductGroupAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

