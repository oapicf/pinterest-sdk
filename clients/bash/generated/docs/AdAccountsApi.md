# AdAccountsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](AdAccountsApi.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountsList**](AdAccountsApi.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
[**adGroupsAnalytics**](AdAccountsApi.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsList**](AdAccountsApi.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adsAnalytics**](AdAccountsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsList**](AdAccountsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**analyticsCreateReport**](AdAccountsApi.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsGetReport**](AdAccountsApi.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**campaignsAnalytics**](AdAccountsApi.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsList**](AdAccountsApi.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**productGroupsAnalytics**](AdAccountsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics



## adAccountAnalytics

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```bash
 adAccountAnalytics ad_account_id=value  start_date=value  end_date=value  Specify as:  columns="value1,value2,..."  granularity=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **columns** | [**array[string]**](string.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | [default to null]
 **granularity** | [**Granularity**](.md) | Granularity | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

**array[map[String, map]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adAccountsList

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to.
- This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example

```bash
 adAccountsList  bookmark=value  page_size=value  include_shared_accounts=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]
 **includeSharedAccounts** | **boolean** | Include shared ad accounts | [optional] [default to true]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adGroupsAnalytics

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```bash
 adGroupsAnalytics ad_account_id=value  start_date=value  end_date=value  Specify as:  ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...  Specify as:  columns="value1,value2,..."  granularity=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **adGroupIds** | [**array[string]**](string.md) | List of Ad group Ids to use to filter the results. | [default to null]
 **columns** | [**array[string]**](string.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | [default to null]
 **granularity** | [**Granularity**](.md) | Granularity | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

**array[map[String, map]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adGroupsList

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```bash
 adGroupsList ad_account_id=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  Specify as:  ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...  Specify as:  entity_statuses=value1 entity_statuses=value2 entity_statuses=...  page_size=value  order=value  bookmark=value  translate_interests_to_names=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignIds** | [**array[string]**](string.md) | List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **adGroupIds** | [**array[string]**](string.md) | List of Ad group Ids to use to filter the results. | [optional] [default to null]
 **entityStatuses** | [**array[string]**](string.md) | Entity status | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items. | [optional] [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **translateInterestsToNames** | **boolean** | Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adsAnalytics

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```bash
 adsAnalytics ad_account_id=value  start_date=value  end_date=value  Specify as:  ad_ids=value1 ad_ids=value2 ad_ids=...  Specify as:  columns="value1,value2,..."  granularity=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **adIds** | [**array[string]**](string.md) | List of Ad Ids to use to filter the results. | [default to null]
 **columns** | [**array[string]**](string.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | [default to null]
 **granularity** | [**Granularity**](.md) | Granularity | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

**array[map[String, map]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adsList

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```bash
 adsList ad_account_id=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  Specify as:  ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...  Specify as:  ad_ids=value1 ad_ids=value2 ad_ids=...  Specify as:  entity_statuses=value1 entity_statuses=value2 entity_statuses=...  page_size=value  order=value  bookmark=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignIds** | [**array[string]**](string.md) | List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **adGroupIds** | [**array[string]**](string.md) | List of Ad group Ids to use to filter the results. | [optional] [default to null]
 **adIds** | [**array[string]**](string.md) | List of Ad Ids to use to filter the results. | [optional] [default to null]
 **entityStatuses** | [**array[string]**](string.md) | Entity status | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items. | [optional] [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analyticsCreateReport

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```bash
 analyticsCreateReport ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **adsAnalyticsCreateAsyncRequest** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md) |  |

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## analyticsGetReport

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```bash
 analyticsGetReport ad_account_id=value  token=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **token** | **string** | Token returned from the post request creation call | [default to null]

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignsAnalytics

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```bash
 campaignsAnalytics ad_account_id=value  start_date=value  end_date=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  Specify as:  columns="value1,value2,..."  granularity=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **campaignIds** | [**array[string]**](string.md) | List of Campaign Ids to use to filter the results. | [default to null]
 **columns** | [**array[string]**](string.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | [default to null]
 **granularity** | [**Granularity**](.md) | Granularity | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

**array[map[String, map]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignsList

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```bash
 campaignsList ad_account_id=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  Specify as:  entity_statuses=value1 entity_statuses=value2 entity_statuses=...  page_size=value  order=value  bookmark=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignIds** | [**array[string]**](string.md) | List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **entityStatuses** | [**array[string]**](string.md) | Entity status | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items. | [optional] [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## productGroupsAnalytics

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```bash
 productGroupsAnalytics ad_account_id=value  start_date=value  end_date=value  Specify as:  product_group_ids=value1 product_group_ids=value2 product_group_ids=...  Specify as:  columns="value1,value2,..."  granularity=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
 **productGroupIds** | [**array[string]**](string.md) | List of Product group Ids to use to filter the results. | [default to null]
 **columns** | [**array[string]**](string.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned | [default to null]
 **granularity** | [**Granularity**](.md) | Granularity | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

**array[map[String, map]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

