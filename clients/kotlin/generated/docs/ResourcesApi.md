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
> AdAccountCountriesGet200Response adAccountCountriesGet()

Get ad accounts countries

Get Ad Accounts countries

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
try {
    val result : AdAccountCountriesGet200Response = apiInstance.adAccountCountriesGet()
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

[**AdAccountCountriesGet200Response**](AdAccountCountriesGet200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deliveryMetricsGet"></a>
# **deliveryMetricsGet**
> DeliveryMetricsGet200Response deliveryMetricsGet(reportType)

Get available metrics&#39; definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val reportType : ReportType =  // ReportType | Report type.
try {
    val result : DeliveryMetricsGet200Response = apiInstance.deliveryMetricsGet(reportType)
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
| **reportType** | [**ReportType**](.md)| Report type. | [optional] [enum: SYNC, ASYNC] |

### Return type

[**DeliveryMetricsGet200Response**](DeliveryMetricsGet200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="interestTargetingOptionsGet"></a>
# **interestTargetingOptionsGet**
> SingleInterestTargetingOption interestTargetingOptionsGet(interestId)

Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val interestId : kotlin.String = interestId_example // kotlin.String | Unique identifier of an interest.
try {
    val result : SingleInterestTargetingOption = apiInstance.interestTargetingOptionsGet(interestId)
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

[**SingleInterestTargetingOption**](SingleInterestTargetingOption.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadFormQuestionsGet"></a>
# **leadFormQuestionsGet**
> leadFormQuestionsGet()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="metricsReadyStateGet"></a>
# **metricsReadyStateGet**
> BookClosed metricsReadyStateGet(date)

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val date : kotlin.String = date_example // kotlin.String | Analytics reports request date (UTC). Format: YYYY-MM-DD
try {
    val result : BookClosed = apiInstance.metricsReadyStateGet(date)
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

[**BookClosed**](BookClosed.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetingOptionsGet"></a>
# **targetingOptionsGet**
> kotlin.collections.List&lt;kotlin.Any&gt; targetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp)

Get targeting options

    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val targetingType : PublicTargetingType =  // PublicTargetingType | Public targeting type
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val clientId : kotlin.String = clientId_example // kotlin.String | Client ID
val oauthSignature : kotlin.String = oauthSignature_example // kotlin.String | Oauth signature
val timestamp : kotlin.String = timestamp_example // kotlin.String | Timestamp.
try {
    val result : kotlin.collections.List<kotlin.Any> = apiInstance.targetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp)
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
| **targetingType** | [**PublicTargetingType**](.md)| Public targeting type | [enum: APPTYPE, GENDER, LOCALE, AGE_BUCKET, LOCATION, GEO, INTEREST, KEYWORD, AUDIENCE_INCLUDE, AUDIENCE_EXCLUDE] |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |
| **clientId** | **kotlin.String**| Client ID | [optional] |
| **oauthSignature** | **kotlin.String**| Oauth signature | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestamp** | **kotlin.String**| Timestamp. | [optional] |

### Return type

[**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

