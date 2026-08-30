# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsAudiencesSharedAccountsList**](AudienceSharingApi.md#adAccountsAudiencesSharedAccountsList) | **Get** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**businessAccountAudiencesSharedAccountsList**](AudienceSharingApi.md#businessAccountAudiencesSharedAccountsList) | **Get** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**sharedAudiencesForBusinessList**](AudienceSharingApi.md#sharedAudiencesForBusinessList) | **Get** /businesses/{business_id}/audiences | List received audiences for a business
[**updateAdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **Patch** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**updateAdAccountToBusinessSharedAudience**](AudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **Patch** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**updateBusinessToAdAccountSharedAudience**](AudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **Patch** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**updateBusinessToBusinessSharedAudience**](AudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **Patch** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


<a name="adAccountsAudiencesSharedAccountsList"></a>
# **adAccountsAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(audienceId, accountType, adAccountId, bookmark, pageSize)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AudienceSharingApi()
val audienceId : kotlin.String = audienceId_example // kotlin.String | Unique identifier of the audience to use to filter the results.
val accountType : AudienceAccountType =  // AudienceAccountType | Filter accounts by account type.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : AdAccountsAudiencesSharedAccountsList200Response = apiInstance.adAccountsAudiencesSharedAccountsList(audienceId, accountType, adAccountId, bookmark, pageSize)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceId** | **kotlin.String**| Unique identifier of the audience to use to filter the results. |
 **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [enum: AD_ACCOUNT, BUSINESS_ACCOUNT]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="businessAccountAudiencesSharedAccountsList"></a>
# **businessAccountAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, bookmark, pageSize)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AudienceSharingApi()
val businessId : kotlin.String = businessId_example // kotlin.String | Unique identifier of the requesting business.
val audienceId : kotlin.String = audienceId_example // kotlin.String | Unique identifier of the audience to use to filter the results.
val accountType : AudienceAccountType =  // AudienceAccountType | Filter accounts by account type.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : AdAccountsAudiencesSharedAccountsList200Response = apiInstance.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, bookmark, pageSize)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **kotlin.String**| Unique identifier of the requesting business. |
 **audienceId** | **kotlin.String**| Unique identifier of the audience to use to filter the results. |
 **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [enum: AD_ACCOUNT, BUSINESS_ACCOUNT]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="sharedAudiencesForBusinessList"></a>
# **sharedAudiencesForBusinessList**
> SharedAudiencesForBusinessList200Response sharedAudiencesForBusinessList(businessId, order, bookmark, pageSize)

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AudienceSharingApi()
val businessId : kotlin.String = businessId_example // kotlin.String | Unique identifier of the requesting business.
val order : Order =  // Order | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : SharedAudiencesForBusinessList200Response = apiInstance.sharedAudiencesForBusinessList(businessId, order, bookmark, pageSize)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **kotlin.String**| Unique identifier of the requesting business. |
 **order** | [**Order**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SharedAudiencesForBusinessList200Response**](SharedAudiencesForBusinessList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="updateAdAccountToAdAccountSharedAudience"></a>
# **updateAdAccountToAdAccountSharedAudience**
> AdAccountToAdAccountSharedAudience updateAdAccountToAdAccountSharedAudience(adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AudienceSharingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adAccountToAdAccountSharedAudienceUpdateWithRequiredBody : AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody =  // AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody | 
try {
    val result : AdAccountToAdAccountSharedAudience = apiInstance.updateAdAccountToAdAccountSharedAudience(adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adAccountToAdAccountSharedAudienceUpdateWithRequiredBody** | [**AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody**](AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  |

### Return type

[**AdAccountToAdAccountSharedAudience**](AdAccountToAdAccountSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="updateAdAccountToBusinessSharedAudience"></a>
# **updateAdAccountToBusinessSharedAudience**
> AdAccountToBusinessSharedAudience updateAdAccountToBusinessSharedAudience(adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AudienceSharingApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val adAccountToBusinessSharedAudienceUpdateWithRequiredBody : AdAccountToBusinessSharedAudienceUpdateWithRequiredBody =  // AdAccountToBusinessSharedAudienceUpdateWithRequiredBody | 
try {
    val result : AdAccountToBusinessSharedAudience = apiInstance.updateAdAccountToBusinessSharedAudience(adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **adAccountToBusinessSharedAudienceUpdateWithRequiredBody** | [**AdAccountToBusinessSharedAudienceUpdateWithRequiredBody**](AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)|  |

### Return type

[**AdAccountToBusinessSharedAudience**](AdAccountToBusinessSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="updateBusinessToAdAccountSharedAudience"></a>
# **updateBusinessToAdAccountSharedAudience**
> BusinessToAdAccountSharedAudience updateBusinessToAdAccountSharedAudience(businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AudienceSharingApi()
val businessId : kotlin.String = businessId_example // kotlin.String | Unique identifier of the requesting business.
val businessToAdAccountSharedAudienceUpdateWithRequiredBody : BusinessToAdAccountSharedAudienceUpdateWithRequiredBody =  // BusinessToAdAccountSharedAudienceUpdateWithRequiredBody | 
try {
    val result : BusinessToAdAccountSharedAudience = apiInstance.updateBusinessToAdAccountSharedAudience(businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **kotlin.String**| Unique identifier of the requesting business. |
 **businessToAdAccountSharedAudienceUpdateWithRequiredBody** | [**BusinessToAdAccountSharedAudienceUpdateWithRequiredBody**](BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  |

### Return type

[**BusinessToAdAccountSharedAudience**](BusinessToAdAccountSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="updateBusinessToBusinessSharedAudience"></a>
# **updateBusinessToBusinessSharedAudience**
> BusinessToBusinessSharedAudience updateBusinessToBusinessSharedAudience(businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = AudienceSharingApi()
val businessId : kotlin.String = businessId_example // kotlin.String | Unique identifier of the requesting business.
val businessToBusinessSharedAudienceUpdateWithRequiredBody : BusinessToBusinessSharedAudienceUpdateWithRequiredBody =  // BusinessToBusinessSharedAudienceUpdateWithRequiredBody | 
try {
    val result : BusinessToBusinessSharedAudience = apiInstance.updateBusinessToBusinessSharedAudience(businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **kotlin.String**| Unique identifier of the requesting business. |
 **businessToBusinessSharedAudienceUpdateWithRequiredBody** | [**BusinessToBusinessSharedAudienceUpdateWithRequiredBody**](BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)|  |

### Return type

[**BusinessToBusinessSharedAudience**](BusinessToBusinessSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

