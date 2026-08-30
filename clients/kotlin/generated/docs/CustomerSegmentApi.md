# CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customerSegmentCreate**](CustomerSegmentApi.md#customerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments |
| [**customerSegmentList**](CustomerSegmentApi.md#customerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments |
| [**customerSegmentUpdate**](CustomerSegmentApi.md#customerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments |


<a id="customerSegmentCreate"></a>
# **customerSegmentCreate**
> CustomerSegment customerSegmentCreate(adAccountId, customerSegmentCreate)

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerSegmentApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val customerSegmentCreate : CustomerSegmentCreate =  // CustomerSegmentCreate | 
try {
    val result : CustomerSegment = apiInstance.customerSegmentCreate(adAccountId, customerSegmentCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerSegmentApi#customerSegmentCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerSegmentApi#customerSegmentCreate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerSegmentCreate** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md)|  | |

### Return type

[**CustomerSegment**](CustomerSegment.md)

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

<a id="customerSegmentList"></a>
# **customerSegmentList**
> CustomerSegmentList200Response customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)

List customer segments

Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerSegmentApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val includeSizing : kotlin.Boolean = true // kotlin.Boolean | Include audience sizing in result or not
val searchQuery : kotlin.String = searchQuery_example // kotlin.String | Search query. Can contain pin description keywords or comma-separated pin IDs.
try {
    val result : CustomerSegmentList200Response = apiInstance.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerSegmentApi#customerSegmentList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerSegmentApi#customerSegmentList")
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

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md)

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

<a id="customerSegmentUpdate"></a>
# **customerSegmentUpdate**
> customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody)

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerSegmentApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val customerSegmentUpdateRequestUpdateWithRequiredBody : CustomerSegmentUpdateRequestUpdateWithRequiredBody =  // CustomerSegmentUpdateRequestUpdateWithRequiredBody | 
try {
    apiInstance.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody)
} catch (e: ClientException) {
    println("4xx response calling CustomerSegmentApi#customerSegmentUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerSegmentApi#customerSegmentUpdate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerSegmentUpdateRequestUpdateWithRequiredBody** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  | |

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

