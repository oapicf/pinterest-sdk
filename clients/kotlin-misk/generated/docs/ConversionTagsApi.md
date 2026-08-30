# ConversionTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionTagsCreate**](ConversionTagsApi.md#conversionTagsCreate) | **Post** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversionTagsGet**](ConversionTagsApi.md#conversionTagsGet) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversionTagsList**](ConversionTagsApi.md#conversionTagsList) | **Get** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
[**ocpmEligibleConversionTagsGet**](ConversionTagsApi.md#ocpmEligibleConversionTagsGet) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**pageVisitConversionTagsGet**](ConversionTagsApi.md#pageVisitConversionTagsGet) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags


<a name="conversionTagsCreate"></a>
# **conversionTagsCreate**
> ConversionTag conversionTagsCreate(adAccountId, conversionTagCreate)

Create conversion tag

Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionTagsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val conversionTagCreate : ConversionTagCreate =  // ConversionTagCreate | 
try {
    val result : ConversionTag = apiInstance.conversionTagsCreate(adAccountId, conversionTagCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionTagsApi#conversionTagsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionTagsApi#conversionTagsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **conversionTagCreate** | [**ConversionTagCreate**](ConversionTagCreate.md)|  |

### Return type

[**ConversionTag**](ConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="conversionTagsGet"></a>
# **conversionTagsGet**
> ConversionTag conversionTagsGet(adAccountId, conversionTagId)

Get conversion tag

Get information about an existing conversion tag.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionTagsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val conversionTagId : kotlin.String = conversionTagId_example // kotlin.String | Id of the conversion tag.
try {
    val result : ConversionTag = apiInstance.conversionTagsGet(adAccountId, conversionTagId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionTagsApi#conversionTagsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionTagsApi#conversionTagsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **conversionTagId** | **kotlin.String**| Id of the conversion tag. |

### Return type

[**ConversionTag**](ConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="conversionTagsList"></a>
# **conversionTagsList**
> ConversionTagsList200Response conversionTagsList(adAccountId, filterDeleted)

List conversion tags

List conversion tags associated with an ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionTagsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val filterDeleted : kotlin.Boolean = true // kotlin.Boolean | Filter by deleted status
try {
    val result : ConversionTagsList200Response = apiInstance.conversionTagsList(adAccountId, filterDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionTagsApi#conversionTagsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionTagsApi#conversionTagsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **filterDeleted** | **kotlin.Boolean**| Filter by deleted status | [optional] [default to false]

### Return type

[**ConversionTagsList200Response**](ConversionTagsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="ocpmEligibleConversionTagsGet"></a>
# **ocpmEligibleConversionTagsGet**
> kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;ConversionEventResponse&gt;&gt; ocpmEligibleConversionTagsGet(adAccountId)

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionTagsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.collections.List<ConversionEventResponse>> = apiInstance.ocpmEligibleConversionTagsGet(adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionTagsApi#ocpmEligibleConversionTagsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionTagsApi#ocpmEligibleConversionTagsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;ConversionEventResponse&gt;&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pageVisitConversionTagsGet"></a>
# **pageVisitConversionTagsGet**
> PageVisitConversionTagsGet200Response pageVisitConversionTagsGet(adAccountId, bookmark, pageSize, order)

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionTagsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
try {
    val result : PageVisitConversionTagsGet200Response = apiInstance.pageVisitConversionTagsGet(adAccountId, bookmark, pageSize, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionTagsApi#pageVisitConversionTagsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionTagsApi#pageVisitConversionTagsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]

### Return type

[**PageVisitConversionTagsGet200Response**](PageVisitConversionTagsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

