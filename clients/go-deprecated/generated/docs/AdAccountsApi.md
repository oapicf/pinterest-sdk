# \AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountAnalytics**](AdAccountsApi.md#AdAccountAnalytics) | **Get** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**AdAccountsList**](AdAccountsApi.md#AdAccountsList) | **Get** /ad_accounts | List ad accounts
[**AdGroupsAnalytics**](AdAccountsApi.md#AdGroupsAnalytics) | **Get** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**AdGroupsList**](AdAccountsApi.md#AdGroupsList) | **Get** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**AdsAnalytics**](AdAccountsApi.md#AdsAnalytics) | **Get** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**AdsList**](AdAccountsApi.md#AdsList) | **Get** /ad_accounts/{ad_account_id}/ads | List ads
[**AnalyticsCreateReport**](AdAccountsApi.md#AnalyticsCreateReport) | **Post** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**AnalyticsGetReport**](AdAccountsApi.md#AnalyticsGetReport) | **Get** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**CampaignsAnalytics**](AdAccountsApi.md#CampaignsAnalytics) | **Get** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**CampaignsList**](AdAccountsApi.md#CampaignsList) | **Get** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**ProductGroupsAnalytics**](AdAccountsApi.md#ProductGroupsAnalytics) | **Get** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics



## AdAccountAnalytics

> []map[string]map[string]interface{} AdAccountAnalytics(ctx, adAccountId, startDate, endDate, columns, granularity, optional)

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string**| Unique identifier of an ad account. | 
**startDate** | **string**| Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **string**| Metric report end date (UTC). Format: YYYY-MM-DD | 
**columns** | [**[]string**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
**granularity** | [**Granularity**](.md)| Granularity | 
 **optional** | ***AdAccountAnalyticsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a AdAccountAnalyticsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------





 **clickWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **optional.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to TIME_OF_AD_ACTION]

### Return type

[**[]map[string]map[string]interface{}**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdAccountsList

> Paginated AdAccountsList(ctx, optional)

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AdAccountsListOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a AdAccountsListOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **includeSharedAccounts** | **optional.Bool**| Include shared ad accounts | [default to true]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsAnalytics

> []map[string]map[string]interface{} AdGroupsAnalytics(ctx, adAccountId, startDate, endDate, adGroupIds, columns, granularity, optional)

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string**| Unique identifier of an ad account. | 
**startDate** | **string**| Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **string**| Metric report end date (UTC). Format: YYYY-MM-DD | 
**adGroupIds** | [**[]string**](string.md)| List of Ad group Ids to use to filter the results. | 
**columns** | [**[]string**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
**granularity** | [**Granularity**](.md)| Granularity | 
 **optional** | ***AdGroupsAnalyticsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a AdGroupsAnalyticsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------






 **clickWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **optional.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to TIME_OF_AD_ACTION]

### Return type

[**[]map[string]map[string]interface{}**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsList

> Paginated AdGroupsList(ctx, adAccountId, optional)

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string**| Unique identifier of an ad account. | 
 **optional** | ***AdGroupsListOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a AdGroupsListOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **campaignIds** | [**optional.Interface of []string**](string.md)| List of Campaign Ids to use to filter the results. | 
 **adGroupIds** | [**optional.Interface of []string**](string.md)| List of Ad group Ids to use to filter the results. | 
 **entityStatuses** | [**optional.Interface of []string**](string.md)| Entity status | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **optional.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 
 **translateInterestsToNames** | **optional.Bool**| Return interests as text names (if value is true) rather than topic IDs. | [default to false]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsAnalytics

> []map[string]map[string]interface{} AdsAnalytics(ctx, adAccountId, startDate, endDate, adIds, columns, granularity, optional)

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string**| Unique identifier of an ad account. | 
**startDate** | **string**| Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **string**| Metric report end date (UTC). Format: YYYY-MM-DD | 
**adIds** | [**[]string**](string.md)| List of Ad Ids to use to filter the results. | 
**columns** | [**[]string**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
**granularity** | [**Granularity**](.md)| Granularity | 
 **optional** | ***AdsAnalyticsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a AdsAnalyticsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------






 **clickWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **optional.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to TIME_OF_AD_ACTION]

### Return type

[**[]map[string]map[string]interface{}**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsList

> Paginated AdsList(ctx, adAccountId, optional)

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string**| Unique identifier of an ad account. | 
 **optional** | ***AdsListOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a AdsListOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **campaignIds** | [**optional.Interface of []string**](string.md)| List of Campaign Ids to use to filter the results. | 
 **adGroupIds** | [**optional.Interface of []string**](string.md)| List of Ad group Ids to use to filter the results. | 
 **adIds** | [**optional.Interface of []string**](string.md)| List of Ad Ids to use to filter the results. | 
 **entityStatuses** | [**optional.Interface of []string**](string.md)| Entity status | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **optional.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AnalyticsCreateReport

> AdsAnalyticsCreateAsyncResponse AnalyticsCreateReport(ctx, adAccountId, adsAnalyticsCreateAsyncRequest)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string**| Unique identifier of an ad account. | 
**adsAnalyticsCreateAsyncRequest** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md)|  | 

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AnalyticsGetReport

> AdsAnalyticsGetAsyncResponse AnalyticsGetReport(ctx, adAccountId, token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string**| Unique identifier of an ad account. | 
**token** | **string**| Token returned from the post request creation call | 

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignsAnalytics

> []map[string]map[string]interface{} CampaignsAnalytics(ctx, adAccountId, startDate, endDate, campaignIds, columns, granularity, optional)

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string**| Unique identifier of an ad account. | 
**startDate** | **string**| Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **string**| Metric report end date (UTC). Format: YYYY-MM-DD | 
**campaignIds** | [**[]string**](string.md)| List of Campaign Ids to use to filter the results. | 
**columns** | [**[]string**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
**granularity** | [**Granularity**](.md)| Granularity | 
 **optional** | ***CampaignsAnalyticsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a CampaignsAnalyticsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------






 **clickWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **optional.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to TIME_OF_AD_ACTION]

### Return type

[**[]map[string]map[string]interface{}**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignsList

> Paginated CampaignsList(ctx, adAccountId, optional)

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string**| Unique identifier of an ad account. | 
 **optional** | ***CampaignsListOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a CampaignsListOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **campaignIds** | [**optional.Interface of []string**](string.md)| List of Campaign Ids to use to filter the results. | 
 **entityStatuses** | [**optional.Interface of []string**](string.md)| Entity status | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **optional.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductGroupsAnalytics

> []map[string]map[string]interface{} ProductGroupsAnalytics(ctx, adAccountId, startDate, endDate, productGroupIds, columns, granularity, optional)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string**| Unique identifier of an ad account. | 
**startDate** | **string**| Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **string**| Metric report end date (UTC). Format: YYYY-MM-DD | 
**productGroupIds** | [**[]string**](string.md)| List of Product group Ids to use to filter the results. | 
**columns** | [**[]string**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
**granularity** | [**Granularity**](.md)| Granularity | 
 **optional** | ***ProductGroupsAnalyticsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ProductGroupsAnalyticsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------






 **clickWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **optional.Int32**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **optional.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to TIME_OF_AD_ACTION]

### Return type

[**[]map[string]map[string]interface{}**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

