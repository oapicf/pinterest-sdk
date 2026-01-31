# PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**promotionsCreate**](PromotionsApi.md#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions |
| [**promotionsDelete**](PromotionsApi.md#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id |
| [**promotionsGet**](PromotionsApi.md#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id |
| [**promotionsList**](PromotionsApi.md#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions |
| [**promotionsUpdate**](PromotionsApi.md#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions |


<a id="promotionsCreate"></a>
# **promotionsCreate**
> PromotionsResponse promotionsCreate(adAccountId, promotionCreateRequest)

Create promotions

Create multiple new promotions.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val promotionCreateRequest : kotlin.collections.List<PromotionCreateRequest> =  // kotlin.collections.List<PromotionCreateRequest> | List of promotions to create, size limit [1, 30].
try {
    val result : PromotionsResponse = apiInstance.promotionsCreate(adAccountId, promotionCreateRequest)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promotionCreateRequest** | [**kotlin.collections.List&lt;PromotionCreateRequest&gt;**](PromotionCreateRequest.md)| List of promotions to create, size limit [1, 30]. | |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="promotionsDelete"></a>
# **promotionsDelete**
> promotionsDelete(adAccountId, promotionId)

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val promotionId : kotlin.String = promotionId_example // kotlin.String | Unique identifier of a promotion
try {
    apiInstance.promotionsDelete(adAccountId, promotionId)
} catch (e: ClientException) {
    println("4xx response calling PromotionsApi#promotionsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PromotionsApi#promotionsDelete")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promotionId** | **kotlin.String**| Unique identifier of a promotion | |

### Return type

null (empty response body)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="promotionsGet"></a>
# **promotionsGet**
> PromotionResponse promotionsGet(adAccountId, promotionId)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val promotionId : kotlin.String = promotionId_example // kotlin.String | Unique identifier of a promotion
try {
    val result : PromotionResponse = apiInstance.promotionsGet(adAccountId, promotionId)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promotionId** | **kotlin.String**| Unique identifier of a promotion | |

### Return type

[**PromotionResponse**](PromotionResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="promotionsList"></a>
# **promotionsList**
> PromotionsList200Response promotionsList(adAccountId, pageSize, order, bookmark)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
val order : kotlin.String = ASCENDING // kotlin.String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : PromotionsList200Response = apiInstance.promotionsList(adAccountId, pageSize, order, bookmark)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **kotlin.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**PromotionsList200Response**](PromotionsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="promotionsUpdate"></a>
# **promotionsUpdate**
> PromotionsResponse promotionsUpdate(adAccountId, promotionUpdateRequest)

Update promotions

Update multiple promotions.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val promotionUpdateRequest : kotlin.collections.List<PromotionUpdateRequest> =  // kotlin.collections.List<PromotionUpdateRequest> | List of promotions to create, size limit [1, 30].
try {
    val result : PromotionsResponse = apiInstance.promotionsUpdate(adAccountId, promotionUpdateRequest)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promotionUpdateRequest** | [**kotlin.collections.List&lt;PromotionUpdateRequest&gt;**](PromotionUpdateRequest.md)| List of promotions to create, size limit [1, 30]. | |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

