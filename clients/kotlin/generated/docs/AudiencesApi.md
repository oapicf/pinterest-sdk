# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](AudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesCreateCustom**](AudiencesApi.md#audiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**audiencesGet**](AudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](AudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](AudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


<a id="audiencesCreate"></a>
# **audiencesCreate**
> Audience audiencesCreate(adAccountId, audienceCreateRequest)

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudiencesApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val audienceCreateRequest : AudienceCreateRequest =  // AudienceCreateRequest | List of ads to create, size limit [1, 30]
try {
    val result : Audience = apiInstance.audiencesCreate(adAccountId, audienceCreateRequest)
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
 **audienceCreateRequest** | [**AudienceCreateRequest**](AudienceCreateRequest.md)| List of ads to create, size limit [1, 30] |

### Return type

[**Audience**](Audience.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="audiencesCreateCustom"></a>
# **audiencesCreateCustom**
> Audience audiencesCreateCustom(adAccountId, audienceCreateCustomRequest)

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudiencesApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val audienceCreateCustomRequest : AudienceCreateCustomRequest =  // AudienceCreateCustomRequest | Custom audience to create.
try {
    val result : Audience = apiInstance.audiencesCreateCustom(adAccountId, audienceCreateCustomRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudiencesApi#audiencesCreateCustom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudiencesApi#audiencesCreateCustom")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **audienceCreateCustomRequest** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md)| Custom audience to create. |

### Return type

[**Audience**](Audience.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="audiencesGet"></a>
# **audiencesGet**
> Audience audiencesGet(adAccountId, audienceId)

Get audience

Get a specific audience given the audience ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudiencesApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val audienceId : kotlin.String = audienceId_example // kotlin.String | Unique identifier of an audience
try {
    val result : Audience = apiInstance.audiencesGet(adAccountId, audienceId)
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
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **audienceId** | **kotlin.String**| Unique identifier of an audience |

### Return type

[**Audience**](Audience.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="audiencesList"></a>
# **audiencesList**
> AudiencesList200Response audiencesList(adAccountId, bookmark, order, pageSize, ownershipType)

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
val order : kotlin.String = ASCENDING // kotlin.String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val ownershipType : kotlin.String = OWNED // kotlin.String | <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type.
try {
    val result : AudiencesList200Response = apiInstance.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType)
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
 **order** | **kotlin.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ownershipType** | **kotlin.String**| &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional] [default to OWNED] [enum: OWNED, RECEIVED]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="audiencesUpdate"></a>
# **audiencesUpdate**
> Audience audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest)

Update audience

Update (edit or remove) an existing targeting audience.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudiencesApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val audienceId : kotlin.String = audienceId_example // kotlin.String | Unique identifier of an audience
val audienceUpdateRequest : AudienceUpdateRequest =  // AudienceUpdateRequest | The audience to be updated.
try {
    val result : Audience = apiInstance.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest)
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
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **audienceId** | **kotlin.String**| Unique identifier of an audience |
 **audienceUpdateRequest** | [**AudienceUpdateRequest**](AudienceUpdateRequest.md)| The audience to be updated. | [optional]

### Return type

[**Audience**](Audience.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

