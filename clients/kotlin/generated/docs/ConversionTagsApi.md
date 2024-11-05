# ConversionTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**conversionTagsCreate**](ConversionTagsApi.md#conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag |
| [**conversionTagsGet**](ConversionTagsApi.md#conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag |
| [**conversionTagsList**](ConversionTagsApi.md#conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags |
| [**ocpmEligibleConversionTagsGet**](ConversionTagsApi.md#ocpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags |
| [**pageVisitConversionTagsGet**](ConversionTagsApi.md#pageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags |


<a id="conversionTagsCreate"></a>
# **conversionTagsCreate**
> ConversionTagResponse conversionTagsCreate(adAccountId, conversionTagCreate)

Create conversion tag

Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/#enhanced-match\&quot;&gt;Enhanced match&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversionTagsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val conversionTagCreate : ConversionTagCreate =  // ConversionTagCreate | Conversion Tag to create
try {
    val result : ConversionTagResponse = apiInstance.conversionTagsCreate(adAccountId, conversionTagCreate)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversionTagCreate** | [**ConversionTagCreate**](ConversionTagCreate.md)| Conversion Tag to create | |

### Return type

[**ConversionTagResponse**](ConversionTagResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="conversionTagsGet"></a>
# **conversionTagsGet**
> ConversionTagResponse conversionTagsGet(adAccountId, conversionTagId)

Get conversion tag

Get information about an existing conversion tag.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversionTagsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val conversionTagId : kotlin.String = 2617998078212 // kotlin.String | Id of the conversion tag.
try {
    val result : ConversionTagResponse = apiInstance.conversionTagsGet(adAccountId, conversionTagId)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversionTagId** | **kotlin.String**| Id of the conversion tag. | |

### Return type

[**ConversionTagResponse**](ConversionTagResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="conversionTagsList"></a>
# **conversionTagsList**
> ConversionTagListResponse conversionTagsList(adAccountId, filterDeleted)

Get conversion tags

List conversion tags associated with an ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversionTagsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val filterDeleted : kotlin.Boolean = true // kotlin.Boolean | Filter out deleted tags.
try {
    val result : ConversionTagListResponse = apiInstance.conversionTagsList(adAccountId, filterDeleted)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterDeleted** | **kotlin.Boolean**| Filter out deleted tags. | [optional] [default to false] |

### Return type

[**ConversionTagListResponse**](ConversionTagListResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ocpmEligibleConversionTagsGet"></a>
# **ocpmEligibleConversionTagsGet**
> kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;ConversionEventResponse&gt;&gt; ocpmEligibleConversionTagsGet(adAccountId)

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;ConversionEventResponse&gt;&gt;**

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pageVisitConversionTagsGet"></a>
# **pageVisitConversionTagsGet**
> PageVisitConversionTagsGet200Response pageVisitConversionTagsGet(adAccountId, pageSize, order, bookmark)

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversionTagsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
val order : kotlin.String = ASCENDING // kotlin.String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : PageVisitConversionTagsGet200Response = apiInstance.pageVisitConversionTagsGet(adAccountId, pageSize, order, bookmark)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **kotlin.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**PageVisitConversionTagsGet200Response**](PageVisitConversionTagsGet200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

