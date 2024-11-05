# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adAccountsAudiencesSharedAccountsList**](AudienceSharingApi.md#adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account |
| [**businessAccountAudiencesSharedAccountsList**](AudienceSharingApi.md#businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business |
| [**sharedAudiencesForBusinessList**](AudienceSharingApi.md#sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business |
| [**updateAdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts |
| [**updateAdAccountToBusinessSharedAudience**](AudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses |
| [**updateBusinessToAdAccountSharedAudience**](AudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts |
| [**updateBusinessToBusinessSharedAudience**](AudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses |


<a id="adAccountsAudiencesSharedAccountsList"></a>
# **adAccountsAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudienceSharingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val audienceId : kotlin.String = audienceId_example // kotlin.String | Unique identifier of the audience to use to filter the results.
val accountType : AudienceAccountType =  // AudienceAccountType | Filter accounts by account type.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : AdAccountsAudiencesSharedAccountsList200Response = apiInstance.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudienceSharingApi#adAccountsAudiencesSharedAccountsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudienceSharingApi#adAccountsAudiencesSharedAccountsList")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **audienceId** | **kotlin.String**| Unique identifier of the audience to use to filter the results. | |
| **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [default to AD_ACCOUNT] [enum: AD_ACCOUNT, BUSINESS_ACCOUNT] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="businessAccountAudiencesSharedAccountsList"></a>
# **businessAccountAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudienceSharingApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val audienceId : kotlin.String = audienceId_example // kotlin.String | Unique identifier of the audience to use to filter the results.
val accountType : AudienceAccountType =  // AudienceAccountType | Filter accounts by account type.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : AdAccountsAudiencesSharedAccountsList200Response = apiInstance.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudienceSharingApi#businessAccountAudiencesSharedAccountsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudienceSharingApi#businessAccountAudiencesSharedAccountsList")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| **audienceId** | **kotlin.String**| Unique identifier of the audience to use to filter the results. | |
| **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [default to AD_ACCOUNT] [enum: AD_ACCOUNT, BUSINESS_ACCOUNT] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="sharedAudiencesForBusinessList"></a>
# **sharedAudiencesForBusinessList**
> AudiencesList200Response sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize)

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudienceSharingApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val order : kotlin.String = ASCENDING // kotlin.String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    val result : AudiencesList200Response = apiInstance.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudienceSharingApi#sharedAudiencesForBusinessList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudienceSharingApi#sharedAudiencesForBusinessList")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| **order** | **kotlin.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateAdAccountToAdAccountSharedAudience"></a>
# **updateAdAccountToAdAccountSharedAudience**
> SharedAudienceResponse updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudienceSharingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val sharedAudience : SharedAudience =  // SharedAudience | 
try {
    val result : SharedAudienceResponse = apiInstance.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudienceSharingApi#updateAdAccountToAdAccountSharedAudience")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudienceSharingApi#updateAdAccountToAdAccountSharedAudience")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sharedAudience** | [**SharedAudience**](SharedAudience.md)|  | |

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateAdAccountToBusinessSharedAudience"></a>
# **updateAdAccountToBusinessSharedAudience**
> BusinessSharedAudienceResponse updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudienceSharingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val businessSharedAudience : BusinessSharedAudience =  // BusinessSharedAudience | 
try {
    val result : BusinessSharedAudienceResponse = apiInstance.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudienceSharingApi#updateAdAccountToBusinessSharedAudience")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudienceSharingApi#updateAdAccountToBusinessSharedAudience")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  | |

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateBusinessToAdAccountSharedAudience"></a>
# **updateBusinessToAdAccountSharedAudience**
> SharedAudienceResponse updateBusinessToAdAccountSharedAudience(businessId, sharedAudience)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudienceSharingApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val sharedAudience : SharedAudience =  // SharedAudience | 
try {
    val result : SharedAudienceResponse = apiInstance.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudienceSharingApi#updateBusinessToAdAccountSharedAudience")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudienceSharingApi#updateBusinessToAdAccountSharedAudience")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sharedAudience** | [**SharedAudience**](SharedAudience.md)|  | |

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateBusinessToBusinessSharedAudience"></a>
# **updateBusinessToBusinessSharedAudience**
> BusinessSharedAudienceResponse updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudienceSharingApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val businessSharedAudience : BusinessSharedAudience =  // BusinessSharedAudience | 
try {
    val result : BusinessSharedAudienceResponse = apiInstance.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudienceSharingApi#updateBusinessToBusinessSharedAudience")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudienceSharingApi#updateBusinessToBusinessSharedAudience")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  | |

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

