# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](AudiencesApi.md#audiencesCreate) | **Post** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesGet**](AudiencesApi.md#audiencesGet) | **Get** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](AudiencesApi.md#audiencesList) | **Get** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](AudiencesApi.md#audiencesUpdate) | **Patch** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


<a name="audiencesCreate"></a>
# **audiencesCreate**
> AdAccountsAudience audiencesCreate(adAccountId, adAccountsAudienceCreate)

Create audience

Create a new audience for the ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adAccountsAudienceCreate** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md)|  |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="audiencesGet"></a>
# **audiencesGet**
> AdAccountsAudience audiencesGet(audienceId, adAccountId)

Get audience

Get a specific audience given the audience ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceId** | **kotlin.String**| Audience ID. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="audiencesList"></a>
# **audiencesList**
> AudiencesList200Response audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca)

List audiences

Get list of audiences for the ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **ownershipType** | [**AudienceOwnershipType**](.md)|  | [optional] [enum: OWNED, RECEIVED]
 **excludeNca** | **kotlin.Boolean**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="audiencesUpdate"></a>
# **audiencesUpdate**
> AdAccountsAudience audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate)

Update audience

Update an existing audience for the ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceId** | **kotlin.String**| Audience ID. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adAccountsAudienceUpdate** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md)|  |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

