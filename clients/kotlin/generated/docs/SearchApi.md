# SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchPartnerPins**](SearchApi.md#searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
[**searchUserBoardsGet**](SearchApi.md#searchUserBoardsGet) | **GET** /search/boards | Search user&#39;s boards
[**searchUserPinsList**](SearchApi.md#searchUserPinsList) | **GET** /search/pins | Search user&#39;s Pins


<a id="searchPartnerPins"></a>
# **searchPartnerPins**
> SearchPartnerPins200Response searchPartnerPins(term, countryCode, bookmark, locale, limit)

Search pins by a given search term

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val term : kotlin.String = term_example // kotlin.String | Search term to look up pins.
val countryCode : kotlin.String = US // kotlin.String | Two letter country code (ISO 3166-1 alpha-2)
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val locale : kotlin.String = locale_example // kotlin.String | Search locale.
val limit : kotlin.Int = 4 // kotlin.Int | Max search result size
try {
    val result : SearchPartnerPins200Response = apiInstance.searchPartnerPins(term, countryCode, bookmark, locale, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchPartnerPins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchPartnerPins")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **kotlin.String**| Search term to look up pins. |
 **countryCode** | **kotlin.String**| Two letter country code (ISO 3166-1 alpha-2) |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **locale** | **kotlin.String**| Search locale. | [optional]
 **limit** | **kotlin.Int**| Max search result size | [optional] [default to 10]

### Return type

[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchUserBoardsGet"></a>
# **searchUserBoardsGet**
> SearchUserBoardsGet200Response searchUserBoardsGet(adAccountId, bookmark, pageSize, query)

Search user&#39;s boards

Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val query : kotlin.String = query_example // kotlin.String | Search query. Can contain pin description keywords or comma-separated pin IDs.
try {
    val result : SearchUserBoardsGet200Response = apiInstance.searchUserBoardsGet(adAccountId, bookmark, pageSize, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchUserBoardsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchUserBoardsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **query** | **kotlin.String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional]

### Return type

[**SearchUserBoardsGet200Response**](SearchUserBoardsGet200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchUserPinsList"></a>
# **searchUserPinsList**
> PinsList200Response searchUserPinsList(query, adAccountId, bookmark)

Search user&#39;s Pins

Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val query : kotlin.String = Plants // kotlin.String | Search query. Can contain pin description keywords or comma-separated pin IDs.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : PinsList200Response = apiInstance.searchUserPinsList(query, adAccountId, bookmark)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchUserPinsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchUserPinsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| Search query. Can contain pin description keywords or comma-separated pin IDs. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

