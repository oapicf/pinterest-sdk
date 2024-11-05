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
Mono<AdAccountsAudiencesSharedAccountsList200Response> AudienceSharingController.adAccountsAudiencesSharedAccountsList(adAccountIdaudienceIdaccountTypepageSizebookmark)
```

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**audienceId** | `String` | Unique identifier of the audience to use to filter the results. |
**accountType** | [**AudienceAccountType**](../../docs/models/.md) | Filter accounts by account type. | [default to `AD_ACCOUNT`] [enum: `AD_ACCOUNT`, `BUSINESS_ACCOUNT`]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

### Return type
[**AdAccountsAudiencesSharedAccountsList200Response**](../../docs/models/AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="businessAccountAudiencesSharedAccountsList"></a>
# **businessAccountAudiencesSharedAccountsList**
```java
Mono<AdAccountsAudiencesSharedAccountsList200Response> AudienceSharingController.businessAccountAudiencesSharedAccountsList(businessIdaudienceIdaccountTypepageSizebookmark)
```

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**audienceId** | `String` | Unique identifier of the audience to use to filter the results. |
**accountType** | [**AudienceAccountType**](../../docs/models/.md) | Filter accounts by account type. | [default to `AD_ACCOUNT`] [enum: `AD_ACCOUNT`, `BUSINESS_ACCOUNT`]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

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
Mono<AudiencesList200Response> AudienceSharingController.sharedAudiencesForBusinessList(businessIdbookmarkorderpageSize)
```

List received audiences for a business

Get a list of received audiences for the given business.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**order** | `String` | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**AudiencesList200Response**](../../docs/models/AudiencesList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="updateAdAccountToAdAccountSharedAudience"></a>
# **updateAdAccountToAdAccountSharedAudience**
```java
Mono<SharedAudienceResponse> AudienceSharingController.updateAdAccountToAdAccountSharedAudience(adAccountIdsharedAudience)
```

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**sharedAudience** | [**SharedAudience**](../../docs/models/SharedAudience.md) |  |

### Return type
[**SharedAudienceResponse**](../../docs/models/SharedAudienceResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="updateAdAccountToBusinessSharedAudience"></a>
# **updateAdAccountToBusinessSharedAudience**
```java
Mono<BusinessSharedAudienceResponse> AudienceSharingController.updateAdAccountToBusinessSharedAudience(adAccountIdbusinessSharedAudience)
```

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**businessSharedAudience** | [**BusinessSharedAudience**](../../docs/models/BusinessSharedAudience.md) |  |

### Return type
[**BusinessSharedAudienceResponse**](../../docs/models/BusinessSharedAudienceResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="updateBusinessToAdAccountSharedAudience"></a>
# **updateBusinessToAdAccountSharedAudience**
```java
Mono<SharedAudienceResponse> AudienceSharingController.updateBusinessToAdAccountSharedAudience(businessIdsharedAudience)
```

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**sharedAudience** | [**SharedAudience**](../../docs/models/SharedAudience.md) |  |

### Return type
[**SharedAudienceResponse**](../../docs/models/SharedAudienceResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="updateBusinessToBusinessSharedAudience"></a>
# **updateBusinessToBusinessSharedAudience**
```java
Mono<BusinessSharedAudienceResponse> AudienceSharingController.updateBusinessToBusinessSharedAudience(businessIdbusinessSharedAudience)
```

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**businessSharedAudience** | [**BusinessSharedAudience**](../../docs/models/BusinessSharedAudience.md) |  |

### Return type
[**BusinessSharedAudienceResponse**](../../docs/models/BusinessSharedAudienceResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

