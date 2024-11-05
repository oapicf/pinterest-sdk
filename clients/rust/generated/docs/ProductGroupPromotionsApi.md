# \ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**product_group_promotions_slash_create**](ProductGroupPromotionsApi.md#product_group_promotions_slash_create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**product_group_promotions_slash_get**](ProductGroupPromotionsApi.md#product_group_promotions_slash_get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**product_group_promotions_slash_list**](ProductGroupPromotionsApi.md#product_group_promotions_slash_list) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**product_group_promotions_slash_update**](ProductGroupPromotionsApi.md#product_group_promotions_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**product_groups_slash_analytics**](ProductGroupPromotionsApi.md#product_groups_slash_analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics



## product_group_promotions_slash_create

> models::ProductGroupPromotionResponse product_group_promotions_slash_create(ad_account_id, product_group_promotion_create_request)
Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**product_group_promotion_create_request** | [**ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md) | List of Product Group Promotions to create, size limit [1, 30]. | [required] |

### Return type

[**models::ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## product_group_promotions_slash_get

> models::ProductGroupPromotionResponse product_group_promotions_slash_get(ad_account_id, product_group_promotion_id)
Get a product group promotion by id

Get a product group promotion by id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**product_group_promotion_id** | **String** | Unique identifier of a product group promotion | [required] |

### Return type

[**models::ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## product_group_promotions_slash_list

> models::ProductGroupPromotionsList200Response product_group_promotions_slash_list(ad_account_id, product_group_promotion_ids, entity_statuses, ad_group_id, page_size, order, bookmark)
Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**product_group_promotion_ids** | Option<[**Vec<String>**](String.md)> | List of Product group promotion Ids. |  |
**entity_statuses** | Option<[**Vec<String>**](String.md)> | Entity status |  |[default to ["ACTIVE","PAUSED"]]
**ad_group_id** | Option<**String**> | Ad group Id. |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]
**order** | Option<**String**> | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |

### Return type

[**models::ProductGroupPromotionsList200Response**](product_group_promotions_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## product_group_promotions_slash_update

> models::ProductGroupPromotionResponse product_group_promotions_slash_update(ad_account_id, product_group_promotion_update_request)
Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**product_group_promotion_update_request** | [**ProductGroupPromotionUpdateRequest**](ProductGroupPromotionUpdateRequest.md) | Parameters to update Product group promotions | [required] |

### Return type

[**models::ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## product_groups_slash_analytics

> Vec<models::ProductGroupAnalyticsResponseInner> product_groups_slash_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time)
Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**product_group_ids** | [**Vec<String>**](String.md) | List of Product group Ids to use to filter the results. | [required] |
**columns** | [**Vec<String>**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | [required] |
**granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly | [required] |
**click_window_days** | Option<**i32**> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |[default to 30]
**engagement_window_days** | Option<**i32**> | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |[default to 30]
**view_window_days** | Option<**i32**> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. |  |[default to 1]
**conversion_report_time** | Option<**String**> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  |[default to TIME_OF_AD_ACTION]

### Return type

[**Vec<models::ProductGroupAnalyticsResponseInner>**](ProductGroupAnalyticsResponse_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

