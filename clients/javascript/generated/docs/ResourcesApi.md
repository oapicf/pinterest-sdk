# PinterestSdk.ResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountCountriesGet**](ResourcesApi.md#adAccountCountriesGet) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**deliveryMetricsGet**](ResourcesApi.md#deliveryMetricsGet) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
[**interestTargetingOptionsGet**](ResourcesApi.md#interestTargetingOptionsGet) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**leadFormQuestionsGet**](ResourcesApi.md#leadFormQuestionsGet) | **GET** /resources/lead_form_questions | Get lead form questions
[**metricsReadyStateGet**](ResourcesApi.md#metricsReadyStateGet) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**targetingOptionsGet**](ResourcesApi.md#targetingOptionsGet) | **GET** /resources/targeting/{targeting_type} | Get targeting options



## adAccountCountriesGet

> AdAccountsCountryResponse adAccountCountriesGet()

Get ad accounts countries

Get Ad Accounts countries

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ResourcesApi();
apiInstance.adAccountCountriesGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AdAccountsCountryResponse**](AdAccountsCountryResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deliveryMetricsGet

> DeliveryMetricsResponse deliveryMetricsGet(opts)

Get available metrics&#39; definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See &lt;a href&#x3D;&#39;/docs/content/analytics/&#39;&gt;Organic Analytics&lt;/a&gt; and &lt;a href&#x3D;&#39;/docs/ads/ad-analytics-reporting/&#39;&gt;Ads Analytics&lt;/a&gt; for more information.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ResourcesApi();
let opts = {
  'reportType': "reportType_example" // String | Report type.
};
apiInstance.deliveryMetricsGet(opts, (error, data, response) => {
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
 **reportType** | **String**| Report type. | [optional] 

### Return type

[**DeliveryMetricsResponse**](DeliveryMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## interestTargetingOptionsGet

> SingleInterestTargetingOptionResponse interestTargetingOptionsGet(interestId)

Get interest details

&lt;p&gt;Get details of a specific interest given interest ID.&lt;/p&gt; &lt;p&gt;Click &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; for a spreadsheet listing interests and their IDs.&lt;/p&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ResourcesApi();
let interestId = "interestId_example"; // String | Unique identifier of an interest.
apiInstance.interestTargetingOptionsGet(interestId, (error, data, response) => {
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
 **interestId** | **String**| Unique identifier of an interest. | 

### Return type

[**SingleInterestTargetingOptionResponse**](SingleInterestTargetingOptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## leadFormQuestionsGet

> leadFormQuestionsGet()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ResourcesApi();
apiInstance.leadFormQuestionsGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## metricsReadyStateGet

> BookClosedResponse metricsReadyStateGet(date)

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ResourcesApi();
let date = 2022-07-13; // String | Analytics reports request date (UTC). Format: YYYY-MM-DD
apiInstance.metricsReadyStateGet(date, (error, data, response) => {
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
 **date** | **String**| Analytics reports request date (UTC). Format: YYYY-MM-DD | 

### Return type

[**BookClosedResponse**](BookClosedResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## targetingOptionsGet

> [Object] targetingOptionsGet(targetingType, opts)

Get targeting options

&lt;p&gt;You can use targeting values in ads placement to define your intended audience. &lt;/p&gt; &lt;p&gt;Targeting metrics are organized around targeting specifications.&lt;/p&gt; &lt;p&gt;For more information on ads targeting, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Sample return:&lt;/b&gt;&lt;/p&gt; &lt;pre class&#x3D;\&quot;literal-block\&quot;&gt; [{&amp;quot;36313&amp;quot;: &amp;quot;Australia: Moreton Bay - North&amp;quot;, &amp;quot;124735&amp;quot;: &amp;quot;Canada: North Battleford&amp;quot;, &amp;quot;36109&amp;quot;: &amp;quot;Australia: Murray&amp;quot;, &amp;quot;36108&amp;quot;: &amp;quot;Australia: Mid North Coast&amp;quot;, &amp;quot;36101&amp;quot;: &amp;quot;Australia: Capital Region&amp;quot;, &amp;quot;811&amp;quot;: &amp;quot;U.S.: Reno&amp;quot;, &amp;quot;36103&amp;quot;: &amp;quot;Australia: Central West&amp;quot;, &amp;quot;36102&amp;quot;: &amp;quot;Australia: Central Coast&amp;quot;, &amp;quot;36105&amp;quot;: &amp;quot;Australia: Far West and Orana&amp;quot;, &amp;quot;36104&amp;quot;: &amp;quot;Australia: Coffs Harbour - Grafton&amp;quot;, &amp;quot;36107&amp;quot;: &amp;quot;Australia: Illawarra&amp;quot;, &amp;quot;36106&amp;quot;: &amp;quot;Australia: Hunter Valley Exc Newcastle&amp;quot;, &amp;quot;554017&amp;quot;: &amp;quot;New Zealand: Wanganui&amp;quot;, &amp;quot;554016&amp;quot;: &amp;quot;New Zealand: Marlborough&amp;quot;, &amp;quot;554015&amp;quot;: &amp;quot;New Zealand: Gisborne&amp;quot;, &amp;quot;554014&amp;quot;: &amp;quot;New Zealand: Tararua&amp;quot;, &amp;quot;554013&amp;quot;: &amp;quot;New Zealand: Invercargill&amp;quot;, &amp;quot;GR&amp;quot;: &amp;quot;Greece&amp;quot;, &amp;quot;554011&amp;quot;: &amp;quot;New Zealand: Whangarei&amp;quot;, &amp;quot;554010&amp;quot;: &amp;quot;New Zealand: Far North&amp;quot;, &amp;quot;717&amp;quot;: &amp;quot;U.S.: Quincy-Hannibal-Keokuk&amp;quot;, &amp;quot;716&amp;quot;: &amp;quot;U.S.: Baton Rouge&amp;quot;,...}] &lt;/pre&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ResourcesApi();
let targetingType = APPTYPE; // String | Public targeting type.
let opts = {
  'clientId': 1094834, // String | Client ID.
  'oauthSignature': 8209f, // String | Oauth signature
  'timestamp': 1618338184277 // String | Timestamp
};
apiInstance.targetingOptionsGet(targetingType, opts, (error, data, response) => {
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
 **targetingType** | **String**| Public targeting type. | 
 **clientId** | **String**| Client ID. | [optional] 
 **oauthSignature** | **String**| Oauth signature | [optional] 
 **timestamp** | **String**| Timestamp | [optional] 

### Return type

**[Object]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

