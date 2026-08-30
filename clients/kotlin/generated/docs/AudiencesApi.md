# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**audiencesCreate**](AudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
| [**audiencesGet**](AudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
| [**audiencesList**](AudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
| [**audiencesUpdate**](AudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |


<a id="audiencesCreate"></a>
# **audiencesCreate**
> AdAccountsAudience audiencesCreate(adAccountId, adAccountsAudienceCreate)

Create audience

Create a new audience for the ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudiencesApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adAccountsAudienceCreate : AdAccountsAudienceCreate =  // AdAccountsAudienceCreate | 
try {
    val result : AdAccountsAudience = apiInstance.audiencesCreate(adAccountId, adAccountsAudienceCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudiencesApi#audiencesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudiencesApi#audiencesCreate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountsAudienceCreate** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md)|  | |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

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

<a id="audiencesGet"></a>
# **audiencesGet**
> AdAccountsAudience audiencesGet(audienceId, adAccountId)

Get audience

Get a specific audience given the audience ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudiencesApi()
val audienceId : kotlin.String = audienceId_example // kotlin.String | Audience ID.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : AdAccountsAudience = apiInstance.audiencesGet(audienceId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudiencesApi#audiencesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudiencesApi#audiencesGet")
    e.printStackTrace()
}
```

### Parameters
| **audienceId** | **kotlin.String**| Audience ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

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

<a id="audiencesList"></a>
# **audiencesList**
> AudiencesList200Response audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca)

List audiences

Get list of audiences for the ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudiencesApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val ownershipType : AudienceOwnershipType =  // AudienceOwnershipType | 
val excludeNca : kotlin.Boolean = true // kotlin.Boolean | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
try {
    val result : AudiencesList200Response = apiInstance.audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudiencesApi#audiencesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudiencesApi#audiencesList")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| **ownershipType** | [**AudienceOwnershipType**](.md)|  | [optional] [enum: OWNED, RECEIVED] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **excludeNca** | **kotlin.Boolean**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to false] |

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

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

<a id="audiencesUpdate"></a>
# **audiencesUpdate**
> AdAccountsAudience audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate)

Update audience

Update an existing audience for the ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudiencesApi()
val audienceId : kotlin.String = audienceId_example // kotlin.String | Audience ID.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adAccountsAudienceUpdate : AdAccountsAudienceUpdate =  // AdAccountsAudienceUpdate | 
try {
    val result : AdAccountsAudience = apiInstance.audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudiencesApi#audiencesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudiencesApi#audiencesUpdate")
    e.printStackTrace()
}
```

### Parameters
| **audienceId** | **kotlin.String**| Audience ID. | |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountsAudienceUpdate** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md)|  | |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

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

