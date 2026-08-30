# CustomerListsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customerListsCreate**](CustomerListsApi.md#customerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists |
| [**customerListsGet**](CustomerListsApi.md#customerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list |
| [**customerListsList**](CustomerListsApi.md#customerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists |
| [**customerListsUpdate**](CustomerListsApi.md#customerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list |


<a id="customerListsCreate"></a>
# **customerListsCreate**
> CustomerList customerListsCreate(adAccountId, customerListCreate)

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerListsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val customerListCreate : CustomerListCreate =  // CustomerListCreate | 
try {
    val result : CustomerList = apiInstance.customerListsCreate(adAccountId, customerListCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerListsApi#customerListsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerListsApi#customerListsCreate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerListCreate** | [**CustomerListCreate**](CustomerListCreate.md)|  | |

### Return type

[**CustomerList**](CustomerList.md)

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

<a id="customerListsGet"></a>
# **customerListsGet**
> CustomerList customerListsGet(adAccountId, customerListId)

Get customer list

Gets a specific customer list given the customer list ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerListsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val customerListId : kotlin.String = customerListId_example // kotlin.String | Customer list ID.
try {
    val result : CustomerList = apiInstance.customerListsGet(adAccountId, customerListId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerListsApi#customerListsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerListsApi#customerListsGet")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerListId** | **kotlin.String**| Customer list ID. | |

### Return type

[**CustomerList**](CustomerList.md)

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

<a id="customerListsList"></a>
# **customerListsList**
> CustomerListsList200Response customerListsList(adAccountId, bookmark, pageSize, order, excludeNca)

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerListsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val excludeNca : kotlin.Boolean = true // kotlin.Boolean | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
try {
    val result : CustomerListsList200Response = apiInstance.customerListsList(adAccountId, bookmark, pageSize, order, excludeNca)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerListsApi#customerListsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerListsApi#customerListsList")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**|  | |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **excludeNca** | **kotlin.Boolean**| When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional] [default to false] |

### Return type

[**CustomerListsList200Response**](CustomerListsList200Response.md)

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

<a id="customerListsUpdate"></a>
# **customerListsUpdate**
> CustomerList customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody)

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerListsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val customerListId : kotlin.String = customerListId_example // kotlin.String | Customer list ID.
val customerListUpdateWithRequiredBody : CustomerListUpdateWithRequiredBody =  // CustomerListUpdateWithRequiredBody | 
try {
    val result : CustomerList = apiInstance.customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerListsApi#customerListsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerListsApi#customerListsUpdate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**|  | |
| **customerListId** | **kotlin.String**| Customer list ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerListUpdateWithRequiredBody** | [**CustomerListUpdateWithRequiredBody**](CustomerListUpdateWithRequiredBody.md)|  | |

### Return type

[**CustomerList**](CustomerList.md)

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

