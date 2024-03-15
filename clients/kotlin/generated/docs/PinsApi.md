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


<a id="pinsAnalytics"></a>
# **pinsAnalytics**
> kotlin.collections.Map&lt;kotlin.String, PinAnalyticsMetricsResponse&gt; pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)

Get Pin analytics

Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | Unique identifier of a Pin.
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val metricTypes : kotlin.collections.List<PinsAnalyticsMetricTypesParameterInner> =  // kotlin.collections.List<PinsAnalyticsMetricTypesParameterInner> | Pin metric types to get data for, default is all.
val appTypes : kotlin.String = appTypes_example // kotlin.String | Apps or devices to get data for, default is all.
val splitField : kotlin.String = splitField_example // kotlin.String | How to split the data into groups. Not including this param means data won't be split.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.Map<kotlin.String, PinAnalyticsMetricsResponse> = apiInstance.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsAnalytics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsAnalytics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **kotlin.String**| Unique identifier of a Pin. |
 **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **metricTypes** | [**kotlin.collections.List&lt;PinsAnalyticsMetricTypesParameterInner&gt;**](PinsAnalyticsMetricTypesParameterInner.md)| Pin metric types to get data for, default is all. |
 **appTypes** | **kotlin.String**| Apps or devices to get data for, default is all. | [optional] [default to ALL] [enum: ALL, MOBILE, TABLET, WEB]
 **splitField** | **kotlin.String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] [enum: NO_SPLIT, APP_TYPE]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**kotlin.collections.Map&lt;kotlin.String, PinAnalyticsMetricsResponse&gt;**](PinAnalyticsMetricsResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pinsCreate"></a>
# **pinsCreate**
> Pin pinsCreate(pinCreate, adAccountId)

Create Pin

Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/content/content-creation/&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinCreate : PinCreate =  // PinCreate | Create a new Pin.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Pin = apiInstance.pinsCreate(pinCreate, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinCreate** | [**PinCreate**](PinCreate.md)| Create a new Pin. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**Pin**](Pin.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pinsDelete"></a>
# **pinsDelete**
> pinsDelete(pinId, adAccountId)

Delete Pin

Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | Unique identifier of a Pin.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    apiInstance.pinsDelete(pinId, adAccountId)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **kotlin.String**| Unique identifier of a Pin. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

null (empty response body)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pinsGet"></a>
# **pinsGet**
> Pin pinsGet(pinId, pinMetrics, adAccountId)

Get Pin

Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | Unique identifier of a Pin.
val pinMetrics : kotlin.Boolean = true // kotlin.Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Pin = apiInstance.pinsGet(pinId, pinMetrics, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **kotlin.String**| Unique identifier of a Pin. |
 **pinMetrics** | **kotlin.Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**Pin**](Pin.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pinsList"></a>
# **pinsList**
> PinsList200Response pinsList(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics)

List Pins

Get a list of the Pins owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val pinFilter : kotlin.String = pinFilter_example // kotlin.String | Pin filter.
val includeProtectedPins : kotlin.Boolean = true // kotlin.Boolean | Specify if return pins from protected boards
val pinType : kotlin.String = pinType_example // kotlin.String | The type of pins to return, currently only enabled for private pins
val creativeTypes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pinMetrics : kotlin.Boolean = true // kotlin.Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
try {
    val result : PinsList200Response = apiInstance.pinsList(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **pinFilter** | **kotlin.String**| Pin filter. | [optional] [enum: exclude_native, exclude_repins, has_been_promoted]
 **includeProtectedPins** | **kotlin.Boolean**| Specify if return pins from protected boards | [optional] [default to false]
 **pinType** | **kotlin.String**| The type of pins to return, currently only enabled for private pins | [optional] [enum: PRIVATE]
 **creativeTypes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [enum: REGULAR, VIDEO, SHOPPING, CAROUSEL, MAX_VIDEO, SHOP_THE_PIN, COLLECTION, IDEA]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **pinMetrics** | **kotlin.Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pinsSave"></a>
# **pinsSave**
> Pin pinsSave(pinId, pinsSaveRequest, adAccountId)

Save Pin

Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | Unique identifier of a Pin.
val pinsSaveRequest : PinsSaveRequest =  // PinsSaveRequest | Request object used to save an existing pin
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Pin = apiInstance.pinsSave(pinId, pinsSaveRequest, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsSave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsSave")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **kotlin.String**| Unique identifier of a Pin. |
 **pinsSaveRequest** | [**PinsSaveRequest**](PinsSaveRequest.md)| Request object used to save an existing pin |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**Pin**](Pin.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pinsUpdate"></a>
# **pinsUpdate**
> Pin pinsUpdate(pinId, pinUpdate, adAccountId)

Update Pin

Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | Unique identifier of a Pin.
val pinUpdate : PinUpdate =  // PinUpdate | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Pin = apiInstance.pinsUpdate(pinId, pinUpdate, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **kotlin.String**| Unique identifier of a Pin. |
 **pinUpdate** | [**PinUpdate**](PinUpdate.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**Pin**](Pin.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

