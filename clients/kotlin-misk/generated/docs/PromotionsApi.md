# PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotionsCreate**](PromotionsApi.md#promotionsCreate) | **Post** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotionsDelete**](PromotionsApi.md#promotionsDelete) | **Delete** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotionsGet**](PromotionsApi.md#promotionsGet) | **Get** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotionsList**](PromotionsApi.md#promotionsList) | **Get** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotionsUpdate**](PromotionsApi.md#promotionsUpdate) | **Patch** /ad_accounts/{ad_account_id}/promotions | Update promotions


<a name="promotionsCreate"></a>
# **promotionsCreate**
> PromotionsResponse promotionsCreate(adAccountId, promotionCreate)

Create promotions

Create multiple new promotions.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val promotionCreate : kotlin.collections.List<PromotionCreate> =  // kotlin.collections.List<PromotionCreate> | 
try {
    val result : PromotionsResponse = apiInstance.promotionsCreate(adAccountId, promotionCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PromotionsApi#promotionsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PromotionsApi#promotionsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **promotionCreate** | [**kotlin.collections.List&lt;PromotionCreate&gt;**](PromotionCreate.md)|  |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="promotionsDelete"></a>
# **promotionsDelete**
> Promotion promotionsDelete(promotionId, adAccountId)

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PromotionsApi()
val promotionId : kotlin.String = promotionId_example // kotlin.String | Promotion ID
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Promotion = apiInstance.promotionsDelete(promotionId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PromotionsApi#promotionsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PromotionsApi#promotionsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **kotlin.String**| Promotion ID |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="promotionsGet"></a>
# **promotionsGet**
> Promotion promotionsGet(promotionId, adAccountId)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PromotionsApi()
val promotionId : kotlin.String = promotionId_example // kotlin.String | Promotion ID
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Promotion = apiInstance.promotionsGet(promotionId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PromotionsApi#promotionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PromotionsApi#promotionsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **kotlin.String**| Promotion ID |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="promotionsList"></a>
# **promotionsList**
> PromotionsList200Response promotionsList(adAccountId, bookmark, pageSize, order)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
try {
    val result : PromotionsList200Response = apiInstance.promotionsList(adAccountId, bookmark, pageSize, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PromotionsApi#promotionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PromotionsApi#promotionsList")
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

[**PromotionsList200Response**](PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="promotionsUpdate"></a>
# **promotionsUpdate**
> PromotionsResponse promotionsUpdate(adAccountId, promotionBatchUpdate)

Update promotions

Update multiple promotions.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val promotionBatchUpdate : kotlin.collections.List<PromotionBatchUpdate> =  // kotlin.collections.List<PromotionBatchUpdate> | 
try {
    val result : PromotionsResponse = apiInstance.promotionsUpdate(adAccountId, promotionBatchUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PromotionsApi#promotionsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PromotionsApi#promotionsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **promotionBatchUpdate** | [**kotlin.collections.List&lt;PromotionBatchUpdate&gt;**](PromotionBatchUpdate.md)|  |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

