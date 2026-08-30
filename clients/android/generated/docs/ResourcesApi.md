# ResourcesApi

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

> AdAccountCountriesGet200Response adAccountCountriesGet()

Get ad accounts countries

Get Ad Accounts countries

### Example

```java
// Import classes:
//import org.openapitools.client.api.ResourcesApi;

ResourcesApi apiInstance = new ResourcesApi();
try {
    AdAccountCountriesGet200Response result = apiInstance.adAccountCountriesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#adAccountCountriesGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AdAccountCountriesGet200Response**](AdAccountCountriesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deliveryMetricsGet

> DeliveryMetricsGet200Response deliveryMetricsGet(reportType)

Get available metrics&#39; definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ResourcesApi;

ResourcesApi apiInstance = new ResourcesApi();
ReportType reportType = null; // ReportType | Report type.
try {
    DeliveryMetricsGet200Response result = apiInstance.deliveryMetricsGet(reportType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#deliveryMetricsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportType** | [**ReportType**](.md)| Report type. | [optional] [default to null] [enum: SYNC, ASYNC]

### Return type

[**DeliveryMetricsGet200Response**](DeliveryMetricsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## interestTargetingOptionsGet

> SingleInterestTargetingOption interestTargetingOptionsGet(interestId)

Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ResourcesApi;

ResourcesApi apiInstance = new ResourcesApi();
String interestId = null; // String | Unique identifier of an interest.
try {
    SingleInterestTargetingOption result = apiInstance.interestTargetingOptionsGet(interestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#interestTargetingOptionsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interestId** | **String**| Unique identifier of an interest. | [default to null]

### Return type

[**SingleInterestTargetingOption**](SingleInterestTargetingOption.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## leadFormQuestionsGet

> leadFormQuestionsGet()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example

```java
// Import classes:
//import org.openapitools.client.api.ResourcesApi;

ResourcesApi apiInstance = new ResourcesApi();
try {
    apiInstance.leadFormQuestionsGet();
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#leadFormQuestionsGet");
    e.printStackTrace();
}
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

> BookClosed metricsReadyStateGet(date)

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ResourcesApi;

ResourcesApi apiInstance = new ResourcesApi();
String date = null; // String | Analytics reports request date (UTC). Format: YYYY-MM-DD
try {
    BookClosed result = apiInstance.metricsReadyStateGet(date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#metricsReadyStateGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**| Analytics reports request date (UTC). Format: YYYY-MM-DD | [default to null]

### Return type

[**BookClosed**](BookClosed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## targetingOptionsGet

> List&lt;Object&gt; targetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp)

Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
//import org.openapitools.client.api.ResourcesApi;

ResourcesApi apiInstance = new ResourcesApi();
PublicTargetingType targetingType = null; // PublicTargetingType | Public targeting type
String adAccountId = null; // String | Unique identifier of an ad account.
String clientId = null; // String | Client ID
String oauthSignature = null; // String | Oauth signature
String timestamp = null; // String | Timestamp.
try {
    List<Object> result = apiInstance.targetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#targetingOptionsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetingType** | [**PublicTargetingType**](.md)| Public targeting type | [default to null] [enum: APPTYPE, GENDER, LOCALE, AGE_BUCKET, LOCATION, GEO, INTEREST, KEYWORD, AUDIENCE_INCLUDE, AUDIENCE_EXCLUDE]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **clientId** | **String**| Client ID | [optional] [default to null]
 **oauthSignature** | **String**| Oauth signature | [optional] [default to null]
 **timestamp** | **String**| Timestamp. | [optional] [default to null]

### Return type

**List&lt;Object&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

