# PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics**](PinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](PinsApi.md#pinsCreate) | **POST** /pins | Create Pin
[**pinsDelete**](PinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](PinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin
[**pinsList**](PinsApi.md#pinsList) | **GET** /pins | List Pins
[**pinsSave**](PinsApi.md#pinsSave) | **POST** /pins/{pin_id}/save | Save Pin
[**pinsUpdate**](PinsApi.md#pinsUpdate) | **PATCH** /pins/{pin_id} | Update Pin



## pinsAnalytics

> Map&lt;String, PinAnalyticsMetricsResponse&gt; pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)

Get Pin analytics

Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PinsApi;

PinsApi apiInstance = new PinsApi();
String pinId = null; // String | Unique identifier of a Pin.
Date startDate = null; // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
Date endDate = null; // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
List<PinsAnalyticsMetricTypesParameterInner> metricTypes = null; // List<PinsAnalyticsMetricTypesParameterInner> | Pin metric types to get data for, default is all.
String appTypes = ALL; // String | Apps or devices to get data for, default is all.
String splitField = NO_SPLIT; // String | How to split the data into groups. Not including this param means data won't be split.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Map<String, PinAnalyticsMetricsResponse> result = apiInstance.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinsApi#pinsAnalytics");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. | [default to null]
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **metricTypes** | [**List&lt;PinsAnalyticsMetricTypesParameterInner&gt;**](PinsAnalyticsMetricTypesParameterInner.md)| Pin metric types to get data for, default is all. | [default to null]
 **appTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB]
 **splitField** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] [enum: NO_SPLIT, APP_TYPE]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Map&lt;String, PinAnalyticsMetricsResponse&gt;**](PinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pinsCreate

> Pin pinsCreate(pinCreate, adAccountId)

Create Pin

Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/content/content-creation/&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PinsApi;

PinsApi apiInstance = new PinsApi();
PinCreate pinCreate = new PinCreate(); // PinCreate | Create a new Pin.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Pin result = apiInstance.pinsCreate(pinCreate, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinsApi#pinsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinCreate** | [**PinCreate**](PinCreate.md)| Create a new Pin. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## pinsDelete

> pinsDelete(pinId, adAccountId)

Delete Pin

Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PinsApi;

PinsApi apiInstance = new PinsApi();
String pinId = null; // String | Unique identifier of a Pin.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    apiInstance.pinsDelete(pinId, adAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling PinsApi#pinsDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pinsGet

> Pin pinsGet(pinId, pinMetrics, adAccountId)

Get Pin

Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PinsApi;

PinsApi apiInstance = new PinsApi();
String pinId = null; // String | Unique identifier of a Pin.
Boolean pinMetrics = false; // Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Pin result = apiInstance.pinsGet(pinId, pinMetrics, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinsApi#pinsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. | [default to null]
 **pinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pinsList

> PinsList200Response pinsList(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics)

List Pins

Get a list of the Pins owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PinsApi;

PinsApi apiInstance = new PinsApi();
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
String pinFilter = null; // String | Pin filter.
Boolean includeProtectedPins = false; // Boolean | Specify if return pins from protected boards
String pinType = null; // String | The type of pins to return, currently only enabled for private pins
List<String> creativeTypes = null; // List<String> | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
String adAccountId = null; // String | Unique identifier of an ad account.
Boolean pinMetrics = false; // Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
try {
    PinsList200Response result = apiInstance.pinsList(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinsApi#pinsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **pinFilter** | **String**| Pin filter. | [optional] [default to null] [enum: exclude_native, exclude_repins, has_been_promoted]
 **includeProtectedPins** | **Boolean**| Specify if return pins from protected boards | [optional] [default to false]
 **pinType** | **String**| The type of pins to return, currently only enabled for private pins | [optional] [default to null] [enum: PRIVATE]
 **creativeTypes** | [**List&lt;String&gt;**](String.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to null] [enum: REGULAR, VIDEO, SHOPPING, CAROUSEL, MAX_VIDEO, SHOP_THE_PIN, COLLECTION, IDEA]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **pinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pinsSave

> Pin pinsSave(pinId, pinsSaveRequest, adAccountId)

Save Pin

Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PinsApi;

PinsApi apiInstance = new PinsApi();
String pinId = null; // String | Unique identifier of a Pin.
PinsSaveRequest pinsSaveRequest = new PinsSaveRequest(); // PinsSaveRequest | Request object used to save an existing pin
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Pin result = apiInstance.pinsSave(pinId, pinsSaveRequest, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinsApi#pinsSave");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. | [default to null]
 **pinsSaveRequest** | [**PinsSaveRequest**](PinsSaveRequest.md)| Request object used to save an existing pin |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## pinsUpdate

> Pin pinsUpdate(pinId, pinUpdate, adAccountId)

Update Pin

Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.PinsApi;

PinsApi apiInstance = new PinsApi();
String pinId = null; // String | Unique identifier of a Pin.
PinUpdate pinUpdate = new PinUpdate(); // PinUpdate | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Pin result = apiInstance.pinsUpdate(pinId, pinUpdate, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinsApi#pinsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of a Pin. | [default to null]
 **pinUpdate** | [**PinUpdate**](PinUpdate.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

