# ProductGroupPromotionsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productGroupPromotionsCreate**](ProductGroupPromotionsApi.md#productGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**productGroupPromotionsGet**](ProductGroupPromotionsApi.md#productGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**productGroupPromotionsList**](ProductGroupPromotionsApi.md#productGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**productGroupPromotionsUpdate**](ProductGroupPromotionsApi.md#productGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**productGroupsAnalytics**](ProductGroupPromotionsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics



## productGroupPromotionsCreate

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Example

```bash
 productGroupPromotionsCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **productGroupPromotionsCreate** | [**ProductGroupPromotionsCreate**](ProductGroupPromotionsCreate.md) |  |

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## productGroupPromotionsGet

Get a product group promotion by id

Get a product group promotion by id

### Example

```bash
 productGroupPromotionsGet ad_account_id=value product_group_promotion_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **productGroupPromotionId** | **string** | Unique identifier of a product group promotion | [default to null]

### Return type

[**ProductGroupPromotion**](ProductGroupPromotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## productGroupPromotionsList

Get product group promotions

List existing product group promotions associated with an ad account.

Include either ad_group_id or product_group_promotion_ids in your request.

**Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters.
Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Example

```bash
 productGroupPromotionsList ad_account_id=value  bookmark=value  page_size=value  order=value  Specify as:  product_group_promotion_ids=value1 product_group_promotion_ids=value2 product_group_promotion_ids=...  Specify as:  entity_statuses=value1 entity_statuses=value2 entity_statuses=...  ad_group_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID.
Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **productGroupPromotionIds** | [**array[string]**](string.md) | List of Product group promotion Ids. | [optional] [default to null]
 **entityStatuses** | [**array[EntityStatus]**](EntityStatus.md) | Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **adGroupId** | **string** | Ad group Id. | [optional] [default to null]

### Return type

[**ProductGroupPromotionsList200Response**](ProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## productGroupPromotionsUpdate

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example

```bash
 productGroupPromotionsUpdate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **productGroupPromotionsUpdateWithRequiredBody** | [**ProductGroupPromotionsUpdateWithRequiredBody**](ProductGroupPromotionsUpdateWithRequiredBody.md) |  |

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## productGroupsAnalytics

Get product group analytics

Get analytics for the specified product groups in the specified 'ad_account_id', filtered by the specified options.

- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```bash
 productGroupsAnalytics  start_date=value  end_date=value  Specify as:  product_group_ids=value1 product_group_ids=value2 product_group_ids=...  Specify as:  columns="value1,value2,..."  granularity=value ad_account_id=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value  reporting_timezone=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **productGroupIds** | [**array[string]**](string.md) | List of Product group Ids to use to filter the results. | [default to null]
 **columns** | [**array[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.

For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).

If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.

  DAY - metrics are broken down daily.

  HOUR - metrics are broken down hourly.

  WEEK - metrics are broken down weekly.

  MONTH - metrics are broken down monthly | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**array[ProductGroupAnalyticsItems]**](ProductGroupAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

