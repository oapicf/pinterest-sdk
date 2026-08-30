# OrderLinesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**orderLinesGet**](OrderLinesApi.md#orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line |
| [**orderLinesList**](OrderLinesApi.md#orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines. |


<a id="orderLinesGet"></a>
# **orderLinesGet**
> OrderLine orderLinesGet(orderLineId, adAccountId)

Get order line

Get a specific existing order line associated with an ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderLinesApi()
val orderLineId : kotlin.String = orderLineId_example // kotlin.String | Order line ID.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : OrderLine = apiInstance.orderLinesGet(orderLineId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderLinesApi#orderLinesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderLinesApi#orderLinesGet")
    e.printStackTrace()
}
```

### Parameters
| **orderLineId** | **kotlin.String**| Order line ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |

### Return type

[**OrderLine**](OrderLine.md)

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

<a id="orderLinesList"></a>
# **orderLinesList**
> OrderLinesList200Response orderLinesList(adAccountId, bookmark, pageSize, order)

Get order lines.

List existing order lines associated with an ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderLinesApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
try {
    val result : OrderLinesList200Response = apiInstance.orderLinesList(adAccountId, bookmark, pageSize, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderLinesApi#orderLinesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderLinesApi#orderLinesList")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |

### Return type

[**OrderLinesList200Response**](OrderLinesList200Response.md)

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

