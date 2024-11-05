# TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**targetingTemplateCreate**](TargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
| [**targetingTemplateList**](TargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
| [**targetingTemplateUpdate**](TargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |


<a id="targetingTemplateCreate"></a>
# **targetingTemplateCreate**
> TargetingTemplateGetResponseData targetingTemplateCreate(adAccountId, targetingTemplateCreate)

Create targeting templates

&lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TargetingTemplateApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val targetingTemplateCreate : TargetingTemplateCreate =  // TargetingTemplateCreate | targeting template creation entity
try {
    val result : TargetingTemplateGetResponseData = apiInstance.targetingTemplateCreate(adAccountId, targetingTemplateCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetingTemplateApi#targetingTemplateCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetingTemplateApi#targetingTemplateCreate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **targetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)| targeting template creation entity | |

### Return type

[**TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="targetingTemplateList"></a>
# **targetingTemplateList**
> TargetingTemplateList200Response targetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark)

List targeting templates

Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TargetingTemplateApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val order : kotlin.String = ASCENDING // kotlin.String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
val includeSizing : kotlin.Boolean = true // kotlin.Boolean | Include audience sizing in result or not
val searchQuery : kotlin.String = gaming // kotlin.String | Search keyword for targeting templates
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : TargetingTemplateList200Response = apiInstance.targetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TargetingTemplateApi#targetingTemplateList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetingTemplateApi#targetingTemplateList")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **order** | **kotlin.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| **includeSizing** | **kotlin.Boolean**| Include audience sizing in result or not | [optional] [default to false] |
| **searchQuery** | **kotlin.String**| Search keyword for targeting templates | [optional] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="targetingTemplateUpdate"></a>
# **targetingTemplateUpdate**
> targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest)

Update targeting templates

&lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TargetingTemplateApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val targetingTemplateUpdateRequest : TargetingTemplateUpdateRequest =  // TargetingTemplateUpdateRequest | Operation type and targeting template ID
try {
    apiInstance.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest)
} catch (e: ClientException) {
    println("4xx response calling TargetingTemplateApi#targetingTemplateUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TargetingTemplateApi#targetingTemplateUpdate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **targetingTemplateUpdateRequest** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md)| Operation type and targeting template ID | |

### Return type

null (empty response body)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

