# ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**product_group_promotions_create**](ProductGroupPromotionsApi.md#product_group_promotions_create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**product_group_promotions_get**](ProductGroupPromotionsApi.md#product_group_promotions_get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**product_group_promotions_list**](ProductGroupPromotionsApi.md#product_group_promotions_list) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**product_group_promotions_update**](ProductGroupPromotionsApi.md#product_group_promotions_update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**product_groups_analytics**](ProductGroupPromotionsApi.md#product_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **product_group_promotions_create**
> `product_group_promotions_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `product_group_promotions_create_param`::`ProductGroupPromotionsCreate`;) -> `ProductGroupPromotions`

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`product_group_promotions_create_param`** | [**`ProductGroupPromotionsCreate`**](ProductGroupPromotionsCreate.md)|  |

### Return type

[**`ProductGroupPromotions`**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_get**
> `product_group_promotions_get`(req::`HTTP.Request`, `ad_account_id`::`String`, `product_group_promotion_id`::`String`;) -> `ProductGroupPromotion`

Get a product group promotion by id

Get a product group promotion by id

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`product_group_promotion_id`** | **`String`**| Unique identifier of a product group promotion |

### Return type

[**`ProductGroupPromotion`**](ProductGroupPromotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_list**
> `product_group_promotions_list`(req::`HTTP.Request`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `product_group_promotion_ids`=nothing, `entity_statuses`=nothing, `ad_group_id`=nothing,) -> `ProductGroupPromotionsList200Response`

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

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
 **`product_group_promotion_ids`** | [**`Vector{String}`**](String.md)| List of Product group promotion Ids. | [default to nothing]
 **`entity_statuses`** | [**`Vector{EntityStatus}`**](EntityStatus.md)| Entity status | [default to nothing]
 **`ad_group_id`** | **`String`**| Ad group Id. | [default to nothing]

### Return type

[**`ProductGroupPromotionsList200Response`**](ProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_update**
> `product_group_promotions_update`(req::`HTTP.Request`, `ad_account_id`::`String`, `product_group_promotions_update_with_required_body`::`ProductGroupPromotionsUpdateWithRequiredBody`;) -> `ProductGroupPromotions`

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`product_group_promotions_update_with_required_body`** | [**`ProductGroupPromotionsUpdateWithRequiredBody`**](ProductGroupPromotionsUpdateWithRequiredBody.md)|  |

### Return type

[**`ProductGroupPromotions`**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_groups_analytics**
> `product_groups_analytics`(req::`HTTP.Request`, `start_date`::`Date`, `end_date`::`Date`, `product_group_ids`::`Vector{String}`, `columns`::`Vector{ReportingColumnSync}`, `granularity`::`Granularity`, `ad_account_id`::`String`; `click_window_days`=nothing, `engagement_window_days`=nothing, `view_window_days`=nothing, `conversion_report_time`=nothing, `reporting_timezone`=nothing,) -> `Vector{ProductGroupAnalyticsItems}`

Get product group analytics

Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`start_date`** | **`Date`**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`product_group_ids`** | [**`Vector{String}`**](String.md)| List of Product group Ids to use to filter the results. |
**`columns`** | [**`Vector{ReportingColumnSync}`**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**`granularity`** | [**`Granularity`**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`click_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **`engagement_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **`view_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **`conversion_report_time`** | **`String`**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **`reporting_timezone`** | [**`ReportingTimeZone`**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [default to nothing]

### Return type

[**`Vector{ProductGroupAnalyticsItems}`**](ProductGroupAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

