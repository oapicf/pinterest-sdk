# PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**multiPinsAnalytics**](PinsApi.md#multiPinsAnalytics) | **GET** /pins/analytics | Get multiple Pin analytics |
| [**pinsAnalytics**](PinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics |
| [**pinsCreate**](PinsApi.md#pinsCreate) | **POST** /pins | Create Pin |
| [**pinsDelete**](PinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin |
| [**pinsGet**](PinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin |
| [**pinsList**](PinsApi.md#pinsList) | **GET** /pins | List Pins |
| [**pinsSave**](PinsApi.md#pinsSave) | **POST** /pins/{pin_id}/save | Save Pin |
| [**pinsUpdate**](PinsApi.md#pinsUpdate) | **PATCH** /pins/{pin_id} | Update Pin |


<a id="multiPinsAnalytics"></a>
# **multiPinsAnalytics**
> kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Map&lt;kotlin.String, PinAnalyticsMetricsResponse&gt;&gt; multiPinsAnalytics(pinIds, startDate, endDate, metricTypes, appTypes, adAccountId)

Get multiple Pin analytics

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Pin IDs.
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val metricTypes : kotlin.collections.List<MultiPinsAnalyticsMetricTypesItem> =  // kotlin.collections.List<MultiPinsAnalyticsMetricTypesItem> | Pin metric types to get data for.
val appTypes : kotlin.String = appTypes_example // kotlin.String | Apps or devices to get data for, default is all.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, PinAnalyticsMetricsResponse>> = apiInstance.multiPinsAnalytics(pinIds, startDate, endDate, metricTypes, appTypes, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#multiPinsAnalytics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#multiPinsAnalytics")
    e.printStackTrace()
}
```

### Parameters
| **pinIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Pin IDs. | |
| **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **metricTypes** | [**kotlin.collections.List&lt;MultiPinsAnalyticsMetricTypesItem&gt;**](MultiPinsAnalyticsMetricTypesItem.md)| Pin metric types to get data for. | |
| **appTypes** | **kotlin.String**| Apps or devices to get data for, default is all. | [optional] [default to AppTypes.ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Map&lt;kotlin.String, PinAnalyticsMetricsResponse&gt;&gt;**

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

<a id="pinsAnalytics"></a>
# **pinsAnalytics**
> kotlin.collections.Map&lt;kotlin.String, PinAnalyticsMetricsResponse&gt; pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)

Get Pin analytics

Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | Unique identifier of a Pin.
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val metricTypes : kotlin.collections.List<QuerypinanalyticsmetrictypesItems> =  // kotlin.collections.List<QuerypinanalyticsmetrictypesItems> | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before `2023-03-20`, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than `NO_SPLIT`.
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
| **pinId** | **kotlin.String**| Unique identifier of a Pin. | |
| **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **metricTypes** | [**kotlin.collections.List&lt;QuerypinanalyticsmetrictypesItems&gt;**](QuerypinanalyticsmetrictypesItems.md)| Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &#x60;2023-03-20&#x60;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &#x60;NO_SPLIT&#x60;. | |
| **appTypes** | **kotlin.String**| Apps or devices to get data for, default is all. | [optional] [default to AppTypes.ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| **splitField** | **kotlin.String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to SplitField.NO_SPLIT] [enum: NO_SPLIT, APP_TYPE] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**kotlin.collections.Map&lt;kotlin.String, PinAnalyticsMetricsResponse&gt;**](PinAnalyticsMetricsResponse.md)

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

<a id="pinsCreate"></a>
# **pinsCreate**
> Pin pinsCreate(pinCreate, adAccountId)

Create Pin

 Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.   Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinCreate : PinCreate =  // PinCreate | 
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
| **pinCreate** | [**PinCreate**](PinCreate.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**Pin**](Pin.md)

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pinsDelete"></a>
# **pinsDelete**
> Pin pinsDelete(pinId, adAccountId)

Delete Pin

  Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Pin = apiInstance.pinsDelete(pinId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsDelete")
    e.printStackTrace()
}
```

### Parameters
| **pinId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**Pin**](Pin.md)

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

<a id="pinsGet"></a>
# **pinsGet**
> Pin pinsGet(pinId, adAccountId, pinMetrics)

Get Pin

  Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pinMetrics : kotlin.Boolean = true // kotlin.Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
try {
    val result : Pin = apiInstance.pinsGet(pinId, adAccountId, pinMetrics)
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
| **pinId** | **kotlin.String**|  | |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pinMetrics** | **kotlin.Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false] |

### Return type

[**Pin**](Pin.md)

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

<a id="pinsList"></a>
# **pinsList**
> PinsList200Response pinsList(pinFilter, pinMetrics, includeProtectedPins, pinType, creativeTypes, adAccountId, domain, domains, includeProductTagObj, bookmark, pageSize)

List Pins

    Get a list of the Pins owned by the \&quot;operation user_account\&quot;.     - By default, the \&quot;operation user_account\&quot; is the token user_account.     - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an &#x60;ad_account_id&#x60; to use the owner of that ad_account as the \&quot;operation user_account\&quot;.      Disclaimer: There are known performance issues when filtering by field &#x60;creative_type&#x60; and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinFilter : PinFilter =  // PinFilter | The filter to apply to the pins
val pinMetrics : kotlin.Boolean = true // kotlin.Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
val includeProtectedPins : kotlin.Boolean = true // kotlin.Boolean | Whether to include protected pins in the results
val pinType : PinType =  // PinType | The type of pins to return, currently only enabled for private pins
val creativeTypes : kotlin.collections.List<CreativeType> =  // kotlin.collections.List<CreativeType> | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val domain : kotlin.String = domain_example // kotlin.String | Only return pins with links that match the exact domain. Domain should not include 'www.' prefix. For example, 'pinterest.com' is a valid domain, but 'www.pinterest.com' is not (will not match any pins).
val domains : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. `?domains=instagram.com,jcpenney.com`).
val includeProductTagObj : kotlin.Boolean = true // kotlin.Boolean | Include product tag objects in the response with their associated links.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : PinsList200Response = apiInstance.pinsList(pinFilter, pinMetrics, includeProtectedPins, pinType, creativeTypes, adAccountId, domain, domains, includeProductTagObj, bookmark, pageSize)
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
| **pinFilter** | [**PinFilter**](.md)| The filter to apply to the pins | [optional] [enum: exclude_native, exclude_repins, has_been_promoted] |
| **pinMetrics** | **kotlin.Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false] |
| **includeProtectedPins** | **kotlin.Boolean**| Whether to include protected pins in the results | [optional] [default to false] |
| **pinType** | [**PinType**](.md)| The type of pins to return, currently only enabled for private pins | [optional] [enum: PRIVATE] |
| **creativeTypes** | [**kotlin.collections.List&lt;CreativeType&gt;**](CreativeType.md)| Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |
| **domain** | **kotlin.String**| Only return pins with links that match the exact domain. Domain should not include &#39;www.&#39; prefix. For example, &#39;pinterest.com&#39; is a valid domain, but &#39;www.pinterest.com&#39; is not (will not match any pins). | [optional] |
| **domains** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. &#x60;?domains&#x3D;instagram.com,jcpenney.com&#x60;). | [optional] |
| **includeProductTagObj** | **kotlin.Boolean**| Include product tag objects in the response with their associated links. | [optional] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**PinsList200Response**](PinsList200Response.md)

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

<a id="pinsSave"></a>
# **pinsSave**
> Pin pinsSave(pinId, pinsSaveRequestCreate, adAccountId)

Save Pin

Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | Unique identifier of a Pin.
val pinsSaveRequestCreate : PinsSaveRequestCreate =  // PinsSaveRequestCreate | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Pin = apiInstance.pinsSave(pinId, pinsSaveRequestCreate, adAccountId)
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
| **pinId** | **kotlin.String**| Unique identifier of a Pin. | |
| **pinsSaveRequestCreate** | [**PinsSaveRequestCreate**](PinsSaveRequestCreate.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**Pin**](Pin.md)

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pinsUpdate"></a>
# **pinsUpdate**
> Pin pinsUpdate(pinId, pinUpdate, adAccountId)

Update Pin

Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PinsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | 
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
| **pinId** | **kotlin.String**|  | |
| **pinUpdate** | [**PinUpdate**](PinUpdate.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**Pin**](Pin.md)

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

 - **Content-Type**: application/json
 - **Accept**: application/json

