# product_group_promotions_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**product_group_promotions/create**](product_group_promotions_api.md#product_group_promotions/create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
**product_group_promotions/list**](product_group_promotions_api.md#product_group_promotions/list) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
**product_group_promotions/update**](product_group_promotions_api.md#product_group_promotions/update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
**product_groups/analytics**](product_group_promotions_api.md#product_groups/analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics
**product_group_promotions/get**](product_group_promotions_api.md#product_group_promotions/get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id


# **product_group_promotions/create**
> models::ProductGroupPromotions product_group_promotions/create(ctx, ad_account_id, product_group_promotions_create)
Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **product_group_promotions_create** | [**ProductGroupPromotionsCreate**](ProductGroupPromotionsCreate.md)|  | 

### Return type

[**models::ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions/list**
> models::ProductGroupPromotionsList200Response product_group_promotions/list(ctx, ad_account_id, optional)
Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [****](.md)| The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **product_group_promotion_ids** | [**String**](String.md)| List of Product group promotion Ids. | 
 **entity_statuses** | [**models::EntityStatus**](models::EntityStatus.md)| Entity status | 
 **ad_group_id** | **String**| Ad group Id. | 

### Return type

[**models::ProductGroupPromotionsList200Response**](product_group_promotions_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions/update**
> models::ProductGroupPromotions product_group_promotions/update(ctx, ad_account_id, product_group_promotions_update_with_required_body)
Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **product_group_promotions_update_with_required_body** | [**ProductGroupPromotionsUpdateWithRequiredBody**](ProductGroupPromotionsUpdateWithRequiredBody.md)|  | 

### Return type

[**models::ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_groups/analytics**
> Vec<models::ProductGroupAnalyticsItems> product_groups/analytics(ctx, ctx, start_date, end_date, product_group_ids, columns, granularity, ad_account_id, optional)
Get product group analytics

Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
  **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
  **product_group_ids** | [**String**](String.md)| List of Product group Ids to use to filter the results. | 
  **columns** | [**models::ReportingColumnSync**](models::ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
  **granularity** | [****](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **chrono::naive::NaiveDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **chrono::naive::NaiveDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **product_group_ids** | [**String**](String.md)| List of Product group Ids to use to filter the results. | 
 **columns** | [**models::ReportingColumnSync**](models::ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [****](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **click_window_days** | [****](.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | 
 **engagement_window_days** | [****](.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | 
 **view_window_days** | [****](.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | 
 **conversion_report_time** | [****](.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | 
 **reporting_timezone** | [****](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | 

### Return type

[**Vec<models::ProductGroupAnalyticsItems>**](ProductGroupAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions/get**
> models::ProductGroupPromotion product_group_promotions/get(ctx, ad_account_id, product_group_promotion_id)
Get a product group promotion by id

Get a product group promotion by id

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **product_group_promotion_id** | **String**| Unique identifier of a product group promotion | 

### Return type

[**models::ProductGroupPromotion**](ProductGroupPromotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

