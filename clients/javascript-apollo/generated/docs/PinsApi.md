# PinterestRestApi.PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics**](PinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](PinsApi.md#pinsCreate) | **POST** /pins | Create Pin
[**pinsDelete**](PinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](PinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin



## pinsAnalytics

> {String: AnalyticsMetricsResponse} pinsAnalytics(pinId, startDate, endDate, metricTypes, opts)

Get Pin analytics

Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Example

```javascript
import PinterestRestApi from 'pinterest_rest_api';
let defaultClient = PinterestRestApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestRestApi.PinsApi();
let pinId = "pinId_example"; // String | Unique identifier of a Pin.
let startDate = new Date("2013-10-20"); // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = new Date("2013-10-20"); // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let metricTypes = ["null"]; // [String] | Pin metric types to get data for, default is all.
let opts = {
  'appTypes': "'ALL'", // String | Apps or devices to get data for, default is all.
  'splitField': "'NO_SPLIT'", // String | How to split the data into groups. Not including this param means data won't be split.
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.pinsAnalytics(pinId, startDate, endDate, metricTypes, opts, (error, data, response) => {
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
 **pinId** | **String**| Unique identifier of a Pin. | 
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **metricTypes** | [**[String]**](String.md)| Pin metric types to get data for, default is all. | 
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **splitField** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**{String: AnalyticsMetricsResponse}**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pinsCreate

> Pin pinsCreate(pin)

Create Pin

Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/solutions/content-apps&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Example

```javascript
import PinterestRestApi from 'pinterest_rest_api';
let defaultClient = PinterestRestApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestRestApi.PinsApi();
let pin = new PinterestRestApi.Pin(); // Pin | Create a new Pin.
apiInstance.pinsCreate(pin, (error, data, response) => {
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
 **pin** | [**Pin**](Pin.md)| Create a new Pin. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## pinsDelete

> pinsDelete(pinId)

Delete Pin

Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```javascript
import PinterestRestApi from 'pinterest_rest_api';
let defaultClient = PinterestRestApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestRestApi.PinsApi();
let pinId = "pinId_example"; // String | Unique identifier of a Pin.
apiInstance.pinsDelete(pinId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. | 

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pinsGet

> Pin pinsGet(pinId, opts)

Get Pin

Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example

```javascript
import PinterestRestApi from 'pinterest_rest_api';
let defaultClient = PinterestRestApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestRestApi.PinsApi();
let pinId = "pinId_example"; // String | Unique identifier of a Pin.
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.pinsGet(pinId, opts, (error, data, response) => {
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
 **pinId** | **String**| Unique identifier of a Pin. | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

