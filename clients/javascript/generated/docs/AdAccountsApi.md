# PinterestSdk.AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

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

> [{String: Object}] adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, opts)

Get ad account analytics

Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let startDate = new Date("2013-10-20"); // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = new Date("2013-10-20"); // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let columns = ["SPEND_IN_DOLLAR"]; // [String] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = DAY; // Granularity | Granularity
let opts = {
  'clickWindowDays': 1, // Number | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  'engagementWindowDays': 30, // Number | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  'viewWindowDays': 1, // Number | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  'conversionReportTime': TIME_OF_AD_ACTION // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
};
apiInstance.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **columns** | [**[String]**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **clickWindowDays** | **Number**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **Number**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **Number**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**[{String: Object}]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adAccountsList

> Paginated adAccountsList(opts)

List ad accounts

Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
  'includeSharedAccounts': true // Boolean | Include shared ad accounts
};
apiInstance.adAccountsList(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **includeSharedAccounts** | **Boolean**| Include shared ad accounts | [optional] [default to true]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adGroupsAnalytics

> [{String: Object}] adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, opts)

Get ad group analytics

Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let startDate = new Date("2013-10-20"); // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = new Date("2013-10-20"); // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let adGroupIds = ["null"]; // [String] | List of Ad group Ids to use to filter the results.
let columns = ["SPEND_IN_DOLLAR"]; // [String] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = DAY; // Granularity | Granularity
let opts = {
  'clickWindowDays': 1, // Number | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  'engagementWindowDays': 30, // Number | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  'viewWindowDays': 1, // Number | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  'conversionReportTime': TIME_OF_AD_ACTION // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
};
apiInstance.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **adGroupIds** | [**[String]**](String.md)| List of Ad group Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **clickWindowDays** | **Number**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **Number**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **Number**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**[{String: Object}]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adGroupsList

> Paginated adGroupsList(adAccountId, opts)

List ad groups

Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let opts = {
  'campaignIds': ["null"], // [String] | List of Campaign Ids to use to filter the results.
  'adGroupIds': ["null"], // [String] | List of Ad group Ids to use to filter the results.
  'entityStatuses': ["ACTIVE"], // [String] | Entity status
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
  'order': ASCENDING, // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'translateInterestsToNames': false // Boolean | Return interests as text names (if value is true) rather than topic IDs.
};
apiInstance.adGroupsList(adAccountId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **campaignIds** | [**[String]**](String.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **adGroupIds** | [**[String]**](String.md)| List of Ad group Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[String]**](String.md)| Entity status | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **translateInterestsToNames** | **Boolean**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adsAnalytics

> [{String: Object}] adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, opts)

Get ad analytics

Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let startDate = new Date("2013-10-20"); // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = new Date("2013-10-20"); // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let adIds = ["null"]; // [String] | List of Ad Ids to use to filter the results.
let columns = ["SPEND_IN_DOLLAR"]; // [String] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = DAY; // Granularity | Granularity
let opts = {
  'clickWindowDays': 1, // Number | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  'engagementWindowDays': 30, // Number | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  'viewWindowDays': 1, // Number | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  'conversionReportTime': TIME_OF_AD_ACTION // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
};
apiInstance.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **adIds** | [**[String]**](String.md)| List of Ad Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **clickWindowDays** | **Number**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **Number**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **Number**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**[{String: Object}]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adsList

> Paginated adsList(adAccountId, opts)

List ads

Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let opts = {
  'campaignIds': ["null"], // [String] | List of Campaign Ids to use to filter the results.
  'adGroupIds': ["null"], // [String] | List of Ad group Ids to use to filter the results.
  'adIds': ["null"], // [String] | List of Ad Ids to use to filter the results.
  'entityStatuses': ["ACTIVE"], // [String] | Entity status
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
  'order': ASCENDING, // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  'bookmark': "bookmark_example" // String | Cursor used to fetch the next page of items
};
apiInstance.adsList(adAccountId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **campaignIds** | [**[String]**](String.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **adGroupIds** | [**[String]**](String.md)| List of Ad group Ids to use to filter the results. | [optional] 
 **adIds** | [**[String]**](String.md)| List of Ad Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[String]**](String.md)| Entity status | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analyticsCreateReport

> AdsAnalyticsCreateAsyncResponse analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let adsAnalyticsCreateAsyncRequest = new PinterestSdk.AdsAnalyticsCreateAsyncRequest(); // AdsAnalyticsCreateAsyncRequest | 
apiInstance.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **adsAnalyticsCreateAsyncRequest** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md)|  | 

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## analyticsGetReport

> AdsAnalyticsGetAsyncResponse analyticsGetReport(adAccountId, token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it&#39;s valid for an hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let token = "token_example"; // String | Token returned from the post request creation call
apiInstance.analyticsGetReport(adAccountId, token, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **token** | **String**| Token returned from the post request creation call | 

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaignsAnalytics

> [{String: Object}] campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, opts)

Get campaign analytics

Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let startDate = new Date("2013-10-20"); // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = new Date("2013-10-20"); // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let campaignIds = ["null"]; // [String] | List of Campaign Ids to use to filter the results.
let columns = ["SPEND_IN_DOLLAR"]; // [String] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = DAY; // Granularity | Granularity
let opts = {
  'clickWindowDays': 1, // Number | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  'engagementWindowDays': 30, // Number | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  'viewWindowDays': 1, // Number | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  'conversionReportTime': TIME_OF_AD_ACTION // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
};
apiInstance.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **campaignIds** | [**[String]**](String.md)| List of Campaign Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **clickWindowDays** | **Number**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **Number**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **Number**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**[{String: Object}]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaignsList

> Paginated campaignsList(adAccountId, opts)

List campaigns

Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let opts = {
  'campaignIds': ["null"], // [String] | List of Campaign Ids to use to filter the results.
  'entityStatuses': ["ACTIVE"], // [String] | Entity status
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
  'order': ASCENDING, // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  'bookmark': "bookmark_example" // String | Cursor used to fetch the next page of items
};
apiInstance.campaignsList(adAccountId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **campaignIds** | [**[String]**](String.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[String]**](String.md)| Entity status | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productGroupsAnalytics

> [{String: Object}] productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, opts)

Get product group analytics

Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.AdAccountsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let startDate = new Date("2013-10-20"); // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = new Date("2013-10-20"); // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let productGroupIds = ["null"]; // [String] | List of Product group Ids to use to filter the results.
let columns = ["SPEND_IN_DOLLAR"]; // [String] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = DAY; // Granularity | Granularity
let opts = {
  'clickWindowDays': 1, // Number | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  'engagementWindowDays': 30, // Number | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  'viewWindowDays': 1, // Number | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  'conversionReportTime': TIME_OF_AD_ACTION // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
};
apiInstance.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **productGroupIds** | [**[String]**](String.md)| List of Product group Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **clickWindowDays** | **Number**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **Number**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **Number**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**[{String: Object}]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

