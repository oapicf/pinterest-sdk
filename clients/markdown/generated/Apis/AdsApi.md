# AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adPreviews/create**](AdsApi.md#adPreviews/create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image |
| [**adTargetingAnalytics/get**](AdsApi.md#adTargetingAnalytics/get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads |
| [**ads/analytics**](AdsApi.md#ads/analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics |
| [**ads/create**](AdsApi.md#ads/create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads |
| [**ads/get**](AdsApi.md#ads/get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad |
| [**ads/list**](AdsApi.md#ads/list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads |
| [**ads/update**](AdsApi.md#ads/update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads |
| [**campaignAdPreview/create**](AdsApi.md#campaignAdPreview/create) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups |
| [**campaignAdPreview/delete**](AdsApi.md#campaignAdPreview/delete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups |
| [**campaignAdPreview/read**](AdsApi.md#campaignAdPreview/read) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups |


<a name="adPreviews/create"></a>
# **adPreviews/create**
> AdPreviewURLResponse adPreviews/create(ad\_account\_id, AdPreviewRequest)

Create ad preview with pin or image

    Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdPreviewRequest** | [**AdPreviewRequest**](../Models/AdPreviewRequest.md)|  | |

### Return type

[**AdPreviewURLResponse**](../Models/AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adTargetingAnalytics/get"></a>
# **adTargetingAnalytics/get**
> MetricsResponse adTargetingAnalytics/get(ad\_account\_id, ad\_ids, start\_date, end\_date, targeting\_types, columns, granularity, click\_window\_days, engagement\_window\_days, view\_window\_days, conversion\_report\_time, attribution\_types, reporting\_timezone, sort\_columns, sort\_ascending)

Get targeting analytics for ads

    Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ad\_ids** | [**List**](../Models/String.md)| List of Ad Ids to use to filter the results. | [default to null] |
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null] |
| **targeting\_types** | [**List**](../Models/AdsAnalyticsAdTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [default to null] |
| **columns** | [**List**](../Models/ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null] |
| **granularity** | [**Granularity**](../Models/.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **click\_window\_days** | [**ConversionAttributionWindowDays**](../Models/.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to null] [enum: 0, 1, 7, 14, 30, 60] |
| **engagement\_window\_days** | [**ConversionAttributionWindowDays**](../Models/.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to null] [enum: 0, 1, 7, 14, 30, 60] |
| **view\_window\_days** | [**ConversionAttributionWindowDays**](../Models/.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to null] [enum: 0, 1, 7, 14, 30, 60] |
| **conversion\_report\_time** | [**ConversionReportTimeType**](../Models/.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to null] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **attribution\_types** | [**List**](../Models/ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] [default to null] |
| **reporting\_timezone** | [**ReportingTimeZone**](../Models/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |
| **sort\_columns** | [**List**](../Models/String.md)| Sort Columns. | [optional] [default to null] |
| **sort\_ascending** | **Boolean**| Sort ascending. | [optional] [default to null] |

### Return type

[**MetricsResponse**](../Models/MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ads/analytics"></a>
# **ads/analytics**
> List ads/analytics(start\_date, end\_date, columns, granularity, ad\_account\_id, pin\_ids, ad\_ids, click\_window\_days, engagement\_window\_days, view\_window\_days, conversion\_report\_time, campaign\_ids, reporting\_timezone)

Get ad analytics

        Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **start\_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null] |
| **end\_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null] |
| **columns** | [**List**](../Models/ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null] |
| **granularity** | [**Granularity**](../Models/.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **pin\_ids** | [**List**](../Models/String.md)| List of Pin IDs. | [optional] [default to null] |
| **ad\_ids** | [**List**](../Models/String.md)| List of Ad Ids to use to filter the results. | [optional] [default to null] |
| **click\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **engagement\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **view\_window\_days** | **BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60] |
| **conversion\_report\_time** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **campaign\_ids** | [**List**](../Models/String.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null] |
| **reporting\_timezone** | [**ReportingTimeZone**](../Models/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**List**](../Models/AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ads/create"></a>
# **ads/create**
> AdBatchWriteResponseModel ads/create(ad\_account\_id, AdCreate)

Create ads

    Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdCreate** | [**List**](../Models/AdCreate.md)|  | |

### Return type

[**AdBatchWriteResponseModel**](../Models/AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="ads/get"></a>
# **ads/get**
> Ad ads/get(ad\_id, ad\_account\_id)

Get ad

    Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_id** | **String**| The ID of this ad. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**Ad**](../Models/Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ads/list"></a>
# **ads/list**
> ads_list_200_response ads/list(ad\_account\_id, bookmark, page\_size, order, campaign\_ids, ad\_group\_ids, ad\_ids, entity\_statuses)

List ads

    List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **campaign\_ids** | [**List**](../Models/String.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null] |
| **ad\_group\_ids** | [**List**](../Models/String.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] [default to null] |
| **ad\_ids** | [**List**](../Models/String.md)| List of Ad Ids to use to filter the results. | [optional] [default to null] |
| **entity\_statuses** | [**List**](../Models/EntityStatus.md)| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]] |

### Return type

[**ads_list_200_response**](../Models/ads_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ads/update"></a>
# **ads/update**
> AdBatchWriteResponseModel ads/update(ad\_account\_id, AdBatchUpdate)

Update ads

    Update multiple existing ads

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdBatchUpdate** | [**List**](../Models/AdBatchUpdate.md)|  | |

### Return type

[**AdBatchWriteResponseModel**](../Models/AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="campaignAdPreview/create"></a>
# **campaignAdPreview/create**
> List campaignAdPreview/create(ad\_account\_id, CampaignAdPreviewCreate)

Create ad preview records for one or more ad groups

    Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **CampaignAdPreviewCreate** | [**List**](../Models/CampaignAdPreviewCreate.md)|  | |

### Return type

[**List**](../Models/campaign_ad_preview_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="campaignAdPreview/delete"></a>
# **campaignAdPreview/delete**
> List campaignAdPreview/delete(ad\_group\_ids, ad\_account\_id)

Delete ad preview records for one or more ad groups

    Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_group\_ids** | [**List**](../Models/String.md)| List of Ad group Ids to use to filter the results. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**List**](../Models/campaign_ad_preview_delete_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="campaignAdPreview/read"></a>
# **campaignAdPreview/read**
> List campaignAdPreview/read(ad\_group\_ids, ad\_account\_id)

Fetch ad preview records for one or more ad groups

    Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_group\_ids** | [**List**](../Models/String.md)| List of Ad group Ids to use to filter the results. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**List**](../Models/CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

