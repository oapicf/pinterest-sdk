# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**boardsUserFollowsList**](UserAccountApi.md#boardsUserFollowsList) | **GET** /user_account/following/boards | List following boards |
| [**followUserUpdate**](UserAccountApi.md#followUserUpdate) | **POST** /user_account/following/{username} | Follow user |
| [**followersList**](UserAccountApi.md#followersList) | **GET** /user_account/followers | List followers |
| [**linkedBusinessAccountsGet**](UserAccountApi.md#linkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses |
| [**unverifyWebsiteDelete**](UserAccountApi.md#unverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website |
| [**userAccountAnalytics**](UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics |
| [**userAccountAnalyticsTopPins**](UserAccountApi.md#userAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
| [**userAccountAnalyticsTopVideoPins**](UserAccountApi.md#userAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
| [**userAccountFollowedInterests**](UserAccountApi.md#userAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests |
| [**userAccountGet**](UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account |
| [**userFollowingGet**](UserAccountApi.md#userFollowingGet) | **GET** /user_account/following | List following |
| [**userWebsitesGet**](UserAccountApi.md#userWebsitesGet) | **GET** /user_account/websites | Get user websites |
| [**verifyWebsiteUpdate**](UserAccountApi.md#verifyWebsiteUpdate) | **POST** /user_account/websites | Verify website |
| [**websiteVerificationGet**](UserAccountApi.md#websiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming |


<a id="boardsUserFollowsList"></a>
# **boardsUserFollowsList**
> BoardsList200Response boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val explicitFollowing : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : BoardsList200Response = apiInstance.boardsUserFollowsList(adAccountId, explicitFollowing, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#boardsUserFollowsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#boardsUserFollowsList")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |
| **explicitFollowing** | **kotlin.Boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

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

<a id="followUserUpdate"></a>
# **followUserUpdate**
> FollowUser followUserUpdate(username, followUserCreate)

Follow user

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val username : kotlin.String = username_example // kotlin.String | A valid username
val followUserCreate : FollowUserCreate =  // FollowUserCreate | 
try {
    val result : FollowUser = apiInstance.followUserUpdate(username, followUserCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#followUserUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#followUserUpdate")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**| A valid username | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **followUserCreate** | [**FollowUserCreate**](FollowUserCreate.md)|  | |

### Return type

[**FollowUser**](FollowUser.md)

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

<a id="followersList"></a>
# **followersList**
> FollowersList200Response followersList(bookmark, pageSize)

List followers

Get a list of your followers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : FollowersList200Response = apiInstance.followersList(bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#followersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#followersList")
    e.printStackTrace()
}
```

### Parameters
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

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

<a id="linkedBusinessAccountsGet"></a>
# **linkedBusinessAccountsGet**
> kotlin.collections.List&lt;LinkedBusiness&gt; linkedBusinessAccountsGet()

List linked businesses

Get a list of your linked business accounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
try {
    val result : kotlin.collections.List<LinkedBusiness> = apiInstance.linkedBusinessAccountsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#linkedBusinessAccountsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#linkedBusinessAccountsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;LinkedBusiness&gt;**](LinkedBusiness.md)

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

<a id="unverifyWebsiteDelete"></a>
# **unverifyWebsiteDelete**
> UserWebsite unverifyWebsiteDelete(website)

Unverify website

Unverify a website verified by the signed-in user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val website : kotlin.String = website_example // kotlin.String | Website with path or domain only
try {
    val result : UserWebsite = apiInstance.unverifyWebsiteDelete(website)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#unverifyWebsiteDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#unverifyWebsiteDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **website** | **kotlin.String**| Website with path or domain only | |

### Return type

[**UserWebsite**](UserWebsite.md)

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

<a id="userAccountAnalytics"></a>
# **userAccountAnalytics**
> kotlin.collections.Map&lt;kotlin.String, AnalyticsMetricsResponse&gt; userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId)

Get user account analytics

Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val fromClaimedContent : kotlin.String = fromClaimedContent_example // kotlin.String | Filter on Pins that match your claimed domain.
val pinFormat : kotlin.String = pinFormat_example // kotlin.String | Pin formats to get data for, default is all.
val appTypes : kotlin.String = appTypes_example // kotlin.String | Apps or devices to get data for, default is all.
val contentType : kotlin.String = contentType_example // kotlin.String | Filter to paid or organic data. Default is all.
val source : kotlin.String = source_example // kotlin.String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
val metricTypes : kotlin.collections.List<QuerymetrictypesItems> =  // kotlin.collections.List<QuerymetrictypesItems> | Metric types to get data for, default is all.
val splitField : kotlin.String = splitField_example // kotlin.String | How to split the data into groups. Not including this param means data won't be split.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.Map<kotlin.String, AnalyticsMetricsResponse> = apiInstance.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#userAccountAnalytics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#userAccountAnalytics")
    e.printStackTrace()
}
```

### Parameters
| **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **fromClaimedContent** | **kotlin.String**| Filter on Pins that match your claimed domain. | [optional] [default to FromClaimedContent.BOTH] [enum: OTHER, CLAIMED, BOTH] |
| **pinFormat** | **kotlin.String**| Pin formats to get data for, default is all. | [optional] [default to PinFormat.ALL] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **appTypes** | **kotlin.String**| Apps or devices to get data for, default is all. | [optional] [default to AppTypes.ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| **contentType** | **kotlin.String**| Filter to paid or organic data. Default is all. | [optional] [default to ContentType.ALL] [enum: ALL, PAID, ORGANIC] |
| **source** | **kotlin.String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to Source.ALL] [enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metricTypes** | [**kotlin.collections.List&lt;QuerymetrictypesItems&gt;**](QuerymetrictypesItems.md)| Metric types to get data for, default is all. | [optional] |
| **splitField** | **kotlin.String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to SplitField.NO_SPLIT] [enum: NO_SPLIT, APP_TYPE, OWNED_CONTENT, SOURCE, PIN_FORMAT] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**kotlin.collections.Map&lt;kotlin.String, AnalyticsMetricsResponse&gt;**](AnalyticsMetricsResponse.md)

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

<a id="userAccountAnalyticsTopPins"></a>
# **userAccountAnalyticsTopPins**
> TopPinsAnalyticsResponse userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)

Get user account top pins analytics

Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val sortBy : TopPinsSortBy =  // TopPinsSortBy | Specify sorting order for metrics
val fromClaimedContent : kotlin.String = fromClaimedContent_example // kotlin.String | Filter on Pins that match your claimed domain.
val pinFormat : kotlin.String = pinFormat_example // kotlin.String | Pin formats to get data for, default is all.
val appTypes : kotlin.String = appTypes_example // kotlin.String | Apps or devices to get data for, default is all.
val contentType : kotlin.String = contentType_example // kotlin.String | Filter to paid or organic data. Default is all.
val source : kotlin.String = source_example // kotlin.String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
val metricTypes : kotlin.collections.List<QuerymetrictypesItems> =  // kotlin.collections.List<QuerymetrictypesItems> | Metric types to get data for, default is all.
val numOfPins : kotlin.Int = 56 // kotlin.Int | Number of pins to include, default is 10. Max is 50.
val createdInLastNDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Get metrics for pins created in the last \"n\" days.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : TopPinsAnalyticsResponse = apiInstance.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#userAccountAnalyticsTopPins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#userAccountAnalyticsTopPins")
    e.printStackTrace()
}
```

### Parameters
| **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **sortBy** | [**TopPinsSortBy**](.md)| Specify sorting order for metrics | [enum: ENGAGEMENT, SAVE, IMPRESSION, OUTBOUND_CLICK, PIN_CLICK] |
| **fromClaimedContent** | **kotlin.String**| Filter on Pins that match your claimed domain. | [optional] [default to FromClaimedContent.BOTH] [enum: OTHER, CLAIMED, BOTH] |
| **pinFormat** | **kotlin.String**| Pin formats to get data for, default is all. | [optional] [default to PinFormat.ALL] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **appTypes** | **kotlin.String**| Apps or devices to get data for, default is all. | [optional] [default to AppTypes.ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| **contentType** | **kotlin.String**| Filter to paid or organic data. Default is all. | [optional] [default to ContentType.ALL] [enum: ALL, PAID, ORGANIC] |
| **source** | **kotlin.String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to Source.ALL] [enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metricTypes** | [**kotlin.collections.List&lt;QuerymetrictypesItems&gt;**](QuerymetrictypesItems.md)| Metric types to get data for, default is all. | [optional] |
| **numOfPins** | **kotlin.Int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **createdInLastNDays** | **java.math.BigDecimal**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [enum: 30] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

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

<a id="userAccountAnalyticsTopVideoPins"></a>
# **userAccountAnalyticsTopVideoPins**
> TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)

Get user account top video pins analytics

Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val sortBy : TopVideoPinsSortBy =  // TopVideoPinsSortBy | Specify sorting order for video metrics
val fromClaimedContent : kotlin.String = fromClaimedContent_example // kotlin.String | Filter on Pins that match your claimed domain.
val pinFormat : kotlin.String = pinFormat_example // kotlin.String | Pin formats to get data for, default is all.
val appTypes : kotlin.String = appTypes_example // kotlin.String | Apps or devices to get data for, default is all.
val contentType : kotlin.String = contentType_example // kotlin.String | Filter to paid or organic data. Default is all.
val source : kotlin.String = source_example // kotlin.String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
val metricTypes : kotlin.collections.List<QueryvideopinmetrictypesItems> =  // kotlin.collections.List<QueryvideopinmetrictypesItems> | Metric types to get video data for, default is all.
val numOfPins : kotlin.Int = 56 // kotlin.Int | Number of pins to include, default is 10. Max is 50.
val createdInLastNDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Get metrics for pins created in the last \"n\" days.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : TopVideoPinsAnalyticsResponse = apiInstance.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#userAccountAnalyticsTopVideoPins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#userAccountAnalyticsTopVideoPins")
    e.printStackTrace()
}
```

### Parameters
| **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **sortBy** | [**TopVideoPinsSortBy**](.md)| Specify sorting order for video metrics | [enum: SAVE, IMPRESSION, OUTBOUND_CLICK, VIDEO_MRC_VIEW, VIDEO_AVG_WATCH_TIME, VIDEO_V50_WATCH_TIME, QUARTILE_95_PERCENT_VIEW, VIDEO_10S_VIEW, VIDEO_START] |
| **fromClaimedContent** | **kotlin.String**| Filter on Pins that match your claimed domain. | [optional] [default to FromClaimedContent.BOTH] [enum: OTHER, CLAIMED, BOTH] |
| **pinFormat** | **kotlin.String**| Pin formats to get data for, default is all. | [optional] [default to PinFormat.ALL] [enum: ALL, ORGANIC_IMAGE, ORGANIC_PRODUCT, ORGANIC_VIDEO, ADS_STANDARD, ADS_PRODUCT, ADS_VIDEO, ADS_IDEA] |
| **appTypes** | **kotlin.String**| Apps or devices to get data for, default is all. | [optional] [default to AppTypes.ALL] [enum: ALL, MOBILE, TABLET, WEB] |
| **contentType** | **kotlin.String**| Filter to paid or organic data. Default is all. | [optional] [default to ContentType.ALL] [enum: ALL, PAID, ORGANIC] |
| **source** | **kotlin.String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to Source.ALL] [enum: ALL, YOUR_PINS, OTHER_PINS] |
| **metricTypes** | [**kotlin.collections.List&lt;QueryvideopinmetrictypesItems&gt;**](QueryvideopinmetrictypesItems.md)| Metric types to get video data for, default is all. | [optional] |
| **numOfPins** | **kotlin.Int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **createdInLastNDays** | **java.math.BigDecimal**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] [enum: 30] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

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

<a id="userAccountFollowedInterests"></a>
# **userAccountFollowedInterests**
> UserAccountFollowedInterests200Response userAccountFollowedInterests(username, bookmark, pageSize)

List following interests

Get a list of a user&#39;s following interests in one place.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val username : kotlin.String = username_example // kotlin.String | A valid username
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : UserAccountFollowedInterests200Response = apiInstance.userAccountFollowedInterests(username, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#userAccountFollowedInterests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#userAccountFollowedInterests")
    e.printStackTrace()
}
```

### Parameters
| **username** | **kotlin.String**| A valid username | |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)

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

<a id="userAccountGet"></a>
# **userAccountGet**
> Account userAccountGet(adAccountId)

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Account = apiInstance.userAccountGet(adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#userAccountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#userAccountGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**Account**](Account.md)

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

<a id="userFollowingGet"></a>
# **userFollowingGet**
> FollowersList200Response userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize)

List following

Get a list of who a certain user follows.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val explicitFollowing : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
val feedType : UserFollowingFeedType =  // UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : FollowersList200Response = apiInstance.userFollowingGet(adAccountId, explicitFollowing, feedType, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#userFollowingGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#userFollowingGet")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |
| **explicitFollowing** | **kotlin.Boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false] |
| **feedType** | [**UserFollowingFeedType**](.md)| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] [default to UserFollowingFeedType.ALL] [enum: ALL, RANKED, CREATOR_ONLY, RANKED_CREATOR_ONLY] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

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

<a id="userWebsitesGet"></a>
# **userWebsitesGet**
> UserWebsitesGet200Response userWebsitesGet(bookmark, pageSize)

Get user websites

Get user websites, claimed or not

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : UserWebsitesGet200Response = apiInstance.userWebsitesGet(bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#userWebsitesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#userWebsitesGet")
    e.printStackTrace()
}
```

### Parameters
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)

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

<a id="verifyWebsiteUpdate"></a>
# **verifyWebsiteUpdate**
> UserWebsite verifyWebsiteUpdate(userWebsiteCreate, adAccountId)

Verify website

Verify a website as a signed-in user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val userWebsiteCreate : UserWebsiteCreate =  // UserWebsiteCreate | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : UserWebsite = apiInstance.verifyWebsiteUpdate(userWebsiteCreate, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#verifyWebsiteUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#verifyWebsiteUpdate")
    e.printStackTrace()
}
```

### Parameters
| **userWebsiteCreate** | [**UserWebsiteCreate**](UserWebsiteCreate.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**UserWebsite**](UserWebsite.md)

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

<a id="websiteVerificationGet"></a>
# **websiteVerificationGet**
> UserWebsiteVerification websiteVerificationGet(adAccountId)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAccountApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : UserWebsiteVerification = apiInstance.websiteVerificationGet(adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAccountApi#websiteVerificationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAccountApi#websiteVerificationGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**UserWebsiteVerification**](UserWebsiteVerification.md)

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

