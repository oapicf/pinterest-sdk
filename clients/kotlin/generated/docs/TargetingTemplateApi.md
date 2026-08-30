# TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**targetingTemplateCreate**](TargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
| [**targetingTemplateList**](TargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
| [**targetingTemplateUpdate**](TargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |


<a id="targetingTemplateCreate"></a>
# **targetingTemplateCreate**
> TargetingTemplate targetingTemplateCreate(adAccountId, targetingTemplateCreate)

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TargetingTemplateApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val targetingTemplateCreate : TargetingTemplateCreate =  // TargetingTemplateCreate | 
try {
    val result : TargetingTemplate = apiInstance.targetingTemplateCreate(adAccountId, targetingTemplateCreate)
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
| **targetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)|  | |

### Return type

[**TargetingTemplate**](TargetingTemplate.md)

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

<a id="targetingTemplateList"></a>
# **targetingTemplateList**
> TargetingTemplateList200Response targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)

List targeting templates

Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TargetingTemplateApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val includeSizing : kotlin.Boolean = true // kotlin.Boolean | Include audience sizing in result or not
val searchQuery : kotlin.String = searchQuery_example // kotlin.String | Search query. Can contain pin description keywords or comma-separated pin IDs.
try {
    val result : TargetingTemplateList200Response = apiInstance.targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)
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
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| **includeSizing** | **kotlin.Boolean**| Include audience sizing in result or not | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchQuery** | **kotlin.String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] |

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

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

<a id="targetingTemplateUpdate"></a>
# **targetingTemplateUpdate**
> targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate)

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TargetingTemplateApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val targetingTemplateUpdateRequestReadOrUpdate : TargetingTemplateUpdateRequestReadOrUpdate =  // TargetingTemplateUpdateRequestReadOrUpdate | 
try {
    apiInstance.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate)
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
| **targetingTemplateUpdateRequestReadOrUpdate** | [**TargetingTemplateUpdateRequestReadOrUpdate**](TargetingTemplateUpdateRequestReadOrUpdate.md)|  | |

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

 - **Content-Type**: application/json
 - **Accept**: application/json

