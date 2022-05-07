# PinterestSdk.UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAccountAnalytics**](UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountGet**](UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account



## userAccountAnalytics

> {String: AnalyticsMetricsResponse} userAccountAnalytics(startDate, endDate, opts)

Get user account analytics

Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.UserAccountApi();
let startDate = new Date("2013-10-20"); // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = new Date("2013-10-20"); // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let opts = {
  'fromClaimedContent': "'BOTH'", // String | Filter on Pins that match your claimed domain.
  'pinFormat': "'ALL'", // String | Pin formats to get data for, default is all.
  'appTypes': "'ALL'", // String | Apps or devices to get data for, default is all.
  'metricTypes': ["null"], // [String] | Metric types to get data for, default is all. 
  'splitField': "'NO_SPLIT'", // String | How to split the data into groups. Not including this param means data won't be split.
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.userAccountAnalytics(startDate, endDate, opts, (error, data, response) => {
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
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **fromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **metricTypes** | [**[String]**](String.md)| Metric types to get data for, default is all.  | [optional] 
 **splitField** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**{String: AnalyticsMetricsResponse}**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## userAccountGet

> Account userAccountGet(opts)

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.UserAccountApi();
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.userAccountGet(opts, (error, data, response) => {
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
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

