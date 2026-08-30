# AudienceSharingController

All URIs are relative to `"/v5"`

The controller class is defined in **[AudienceSharingController.java](../../src/main/java/org/openapitools/controller/AudienceSharingController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsAudiencesSharedAccountsList**](#adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**businessAccountAudiencesSharedAccountsList**](#businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**sharedAudiencesForBusinessList**](#sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**updateAdAccountToAdAccountSharedAudience**](#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**updateAdAccountToBusinessSharedAudience**](#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**updateBusinessToAdAccountSharedAudience**](#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**updateBusinessToBusinessSharedAudience**](#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses

<a id="adAccountsAudiencesSharedAccountsList"></a>
# **adAccountsAudiencesSharedAccountsList**
```java
Mono<AdAccountsAudiencesSharedAccountsList200Response> AudienceSharingController.adAccountsAudiencesSharedAccountsList(audienceIdaccountTypeadAccountIdbookmarkpageSize)
```

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**audienceId** | `String` | Unique identifier of the audience to use to filter the results. |
**accountType** | [**AudienceAccountType**](../../docs/models/.md) | Filter accounts by account type. | [enum: `AD_ACCOUNT`, `BUSINESS_ACCOUNT`]
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**AdAccountsAudiencesSharedAccountsList200Response**](../../docs/models/AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="businessAccountAudiencesSharedAccountsList"></a>
# **businessAccountAudiencesSharedAccountsList**
```java
Mono<AdAccountsAudiencesSharedAccountsList200Response> AudienceSharingController.businessAccountAudiencesSharedAccountsList(businessIdaudienceIdaccountTypebookmarkpageSize)
```

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**audienceId** | `String` | Unique identifier of the audience to use to filter the results. |
**accountType** | [**AudienceAccountType**](../../docs/models/.md) | Filter accounts by account type. | [enum: `AD_ACCOUNT`, `BUSINESS_ACCOUNT`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**AdAccountsAudiencesSharedAccountsList200Response**](../../docs/models/AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="sharedAudiencesForBusinessList"></a>
# **sharedAudiencesForBusinessList**
```java
Mono<SharedAudiencesForBusinessList200Response> AudienceSharingController.sharedAudiencesForBusinessList(businessIdorderbookmarkpageSize)
```

List received audiences for a business

Get a list of received audiences for the given business.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**order** | [**Order**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**SharedAudiencesForBusinessList200Response**](../../docs/models/SharedAudiencesForBusinessList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="updateAdAccountToAdAccountSharedAudience"></a>
# **updateAdAccountToAdAccountSharedAudience**
```java
Mono<AdAccountToAdAccountSharedAudience> AudienceSharingController.updateAdAccountToAdAccountSharedAudience(adAccountIdadAccountToAdAccountSharedAudienceUpdateWithRequiredBody)
```

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**adAccountToAdAccountSharedAudienceUpdateWithRequiredBody** | [**AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody**](../../docs/models/AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md) |  |

### Return type
[**AdAccountToAdAccountSharedAudience**](../../docs/models/AdAccountToAdAccountSharedAudience.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="updateAdAccountToBusinessSharedAudience"></a>
# **updateAdAccountToBusinessSharedAudience**
```java
Mono<AdAccountToBusinessSharedAudience> AudienceSharingController.updateAdAccountToBusinessSharedAudience(adAccountIdadAccountToBusinessSharedAudienceUpdateWithRequiredBody)
```

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**adAccountToBusinessSharedAudienceUpdateWithRequiredBody** | [**AdAccountToBusinessSharedAudienceUpdateWithRequiredBody**](../../docs/models/AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md) |  |

### Return type
[**AdAccountToBusinessSharedAudience**](../../docs/models/AdAccountToBusinessSharedAudience.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="updateBusinessToAdAccountSharedAudience"></a>
# **updateBusinessToAdAccountSharedAudience**
```java
Mono<BusinessToAdAccountSharedAudience> AudienceSharingController.updateBusinessToAdAccountSharedAudience(businessIdbusinessToAdAccountSharedAudienceUpdateWithRequiredBody)
```

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**businessToAdAccountSharedAudienceUpdateWithRequiredBody** | [**BusinessToAdAccountSharedAudienceUpdateWithRequiredBody**](../../docs/models/BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md) |  |

### Return type
[**BusinessToAdAccountSharedAudience**](../../docs/models/BusinessToAdAccountSharedAudience.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="updateBusinessToBusinessSharedAudience"></a>
# **updateBusinessToBusinessSharedAudience**
```java
Mono<BusinessToBusinessSharedAudience> AudienceSharingController.updateBusinessToBusinessSharedAudience(businessIdbusinessToBusinessSharedAudienceUpdateWithRequiredBody)
```

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**businessToBusinessSharedAudienceUpdateWithRequiredBody** | [**BusinessToBusinessSharedAudienceUpdateWithRequiredBody**](../../docs/models/BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md) |  |

### Return type
[**BusinessToBusinessSharedAudience**](../../docs/models/BusinessToBusinessSharedAudience.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

