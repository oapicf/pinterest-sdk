# ResourcesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adAccountCountriesGet**](ResourcesApi.md#adAccountCountriesGet) | **GET** /resources/ad_account_countries | Get ad accounts countries |
| [**deliveryMetricsGet**](ResourcesApi.md#deliveryMetricsGet) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions |
| [**interestTargetingOptionsGet**](ResourcesApi.md#interestTargetingOptionsGet) | **GET** /resources/targeting/interests/{interest_id} | Get interest details |
| [**leadFormQuestionsGet**](ResourcesApi.md#leadFormQuestionsGet) | **GET** /resources/lead_form_questions | Get lead form questions |
| [**metricsReadyStateGet**](ResourcesApi.md#metricsReadyStateGet) | **GET** /resources/metrics_ready_state | Get metrics ready state |
| [**targetingOptionsGet**](ResourcesApi.md#targetingOptionsGet) | **GET** /resources/targeting/{targeting_type} | Get targeting options |


<a id="adAccountCountriesGet"></a>
# **adAccountCountriesGet**
> AdAccountsCountryResponse adAccountCountriesGet()

Get ad accounts countries

Get Ad Accounts countries

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
try {
    val result : AdAccountsCountryResponse = apiInstance.adAccountCountriesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#adAccountCountriesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#adAccountCountriesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdAccountsCountryResponse**](AdAccountsCountryResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deliveryMetricsGet"></a>
# **deliveryMetricsGet**
> DeliveryMetricsResponse deliveryMetricsGet(reportType)

Get available metrics&#39; definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See &lt;a href&#x3D;&#39;/docs/api-features/analytics-overview/&#39;&gt;Organic Analytics&lt;/a&gt; and &lt;a href&#x3D;&#39;/docs/api-features/ads-reporting/&#39;&gt;Ads Analytics&lt;/a&gt; for more information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val reportType : kotlin.String = reportType_example // kotlin.String | Report type.
try {
    val result : DeliveryMetricsResponse = apiInstance.deliveryMetricsGet(reportType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#deliveryMetricsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#deliveryMetricsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reportType** | **kotlin.String**| Report type. | [optional] [enum: SYNC, ASYNC] |

### Return type

[**DeliveryMetricsResponse**](DeliveryMetricsResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="interestTargetingOptionsGet"></a>
# **interestTargetingOptionsGet**
> SingleInterestTargetingOptionResponse interestTargetingOptionsGet(interestId)

Get interest details

&lt;p&gt;Get details of a specific interest given interest ID.&lt;/p&gt; &lt;p&gt;Click &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; for a spreadsheet listing interests and their IDs.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val interestId : kotlin.String = interestId_example // kotlin.String | Unique identifier of an interest.
try {
    val result : SingleInterestTargetingOptionResponse = apiInstance.interestTargetingOptionsGet(interestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#interestTargetingOptionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#interestTargetingOptionsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **interestId** | **kotlin.String**| Unique identifier of an interest. | |

### Return type

[**SingleInterestTargetingOptionResponse**](SingleInterestTargetingOptionResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadFormQuestionsGet"></a>
# **leadFormQuestionsGet**
> leadFormQuestionsGet()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
try {
    apiInstance.leadFormQuestionsGet()
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#leadFormQuestionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#leadFormQuestionsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="metricsReadyStateGet"></a>
# **metricsReadyStateGet**
> BookClosedResponse metricsReadyStateGet(date)

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val date : kotlin.String = 2022-07-13 // kotlin.String | Analytics reports request date (UTC). Format: YYYY-MM-DD
try {
    val result : BookClosedResponse = apiInstance.metricsReadyStateGet(date)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#metricsReadyStateGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#metricsReadyStateGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **date** | **kotlin.String**| Analytics reports request date (UTC). Format: YYYY-MM-DD | |

### Return type

[**BookClosedResponse**](BookClosedResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetingOptionsGet"></a>
# **targetingOptionsGet**
> kotlin.collections.List&lt;kotlin.Any&gt; targetingOptionsGet(targetingType, clientId, oauthSignature, timestamp, adAccountId)

Get targeting options

&lt;p&gt;You can use targeting values in ads placement to define your intended audience. &lt;/p&gt; &lt;p&gt;Targeting metrics are organized around targeting specifications.&lt;/p&gt; &lt;p&gt;For more information on ads targeting, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Sample return:&lt;/b&gt;&lt;/p&gt; &lt;pre class&#x3D;\&quot;literal-block\&quot;&gt; [{&amp;quot;36313&amp;quot;: &amp;quot;Australia: Moreton Bay - North&amp;quot;, &amp;quot;124735&amp;quot;: &amp;quot;Canada: North Battleford&amp;quot;, &amp;quot;36109&amp;quot;: &amp;quot;Australia: Murray&amp;quot;, &amp;quot;36108&amp;quot;: &amp;quot;Australia: Mid North Coast&amp;quot;, &amp;quot;36101&amp;quot;: &amp;quot;Australia: Capital Region&amp;quot;, &amp;quot;811&amp;quot;: &amp;quot;U.S.: Reno&amp;quot;, &amp;quot;36103&amp;quot;: &amp;quot;Australia: Central West&amp;quot;, &amp;quot;36102&amp;quot;: &amp;quot;Australia: Central Coast&amp;quot;, &amp;quot;36105&amp;quot;: &amp;quot;Australia: Far West and Orana&amp;quot;, &amp;quot;36104&amp;quot;: &amp;quot;Australia: Coffs Harbour - Grafton&amp;quot;, &amp;quot;36107&amp;quot;: &amp;quot;Australia: Illawarra&amp;quot;, &amp;quot;36106&amp;quot;: &amp;quot;Australia: Hunter Valley Exc Newcastle&amp;quot;, &amp;quot;554017&amp;quot;: &amp;quot;New Zealand: Wanganui&amp;quot;, &amp;quot;554016&amp;quot;: &amp;quot;New Zealand: Marlborough&amp;quot;, &amp;quot;554015&amp;quot;: &amp;quot;New Zealand: Gisborne&amp;quot;, &amp;quot;554014&amp;quot;: &amp;quot;New Zealand: Tararua&amp;quot;, &amp;quot;554013&amp;quot;: &amp;quot;New Zealand: Invercargill&amp;quot;, &amp;quot;GR&amp;quot;: &amp;quot;Greece&amp;quot;, &amp;quot;554011&amp;quot;: &amp;quot;New Zealand: Whangarei&amp;quot;, &amp;quot;554010&amp;quot;: &amp;quot;New Zealand: Far North&amp;quot;, &amp;quot;717&amp;quot;: &amp;quot;U.S.: Quincy-Hannibal-Keokuk&amp;quot;, &amp;quot;716&amp;quot;: &amp;quot;U.S.: Baton Rouge&amp;quot;,...}] &lt;/pre&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val targetingType : kotlin.String = APPTYPE // kotlin.String | Public targeting type.
val clientId : kotlin.String = 1094834 // kotlin.String | Client ID.
val oauthSignature : kotlin.String = 8209f // kotlin.String | Oauth signature
val timestamp : kotlin.String = 1618338184277 // kotlin.String | Timestamp
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.List<kotlin.Any> = apiInstance.targetingOptionsGet(targetingType, clientId, oauthSignature, timestamp, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#targetingOptionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#targetingOptionsGet")
    e.printStackTrace()
}
```

### Parameters
| **targetingType** | **kotlin.String**| Public targeting type. | [enum: APPTYPE, GENDER, LOCALE, AGE_BUCKET, LOCATION, GEO, INTEREST, KEYWORD, AUDIENCE_INCLUDE, AUDIENCE_EXCLUDE] |
| **clientId** | **kotlin.String**| Client ID. | [optional] |
| **oauthSignature** | **kotlin.String**| Oauth signature | [optional] |
| **timestamp** | **kotlin.String**| Timestamp | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

