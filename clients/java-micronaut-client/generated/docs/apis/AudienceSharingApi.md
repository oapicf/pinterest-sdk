# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adAccountsAudiencesSharedAccountsList**](AudienceSharingApi.md#adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account |
| [**businessAccountAudiencesSharedAccountsList**](AudienceSharingApi.md#businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business |
| [**sharedAudiencesForBusinessList**](AudienceSharingApi.md#sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business |
| [**updateAdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts |
| [**updateAdAccountToBusinessSharedAudience**](AudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses |
| [**updateBusinessToAdAccountSharedAudience**](AudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts |
| [**updateBusinessToBusinessSharedAudience**](AudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses |


## Creating AudienceSharingApi

To initiate an instance of `AudienceSharingApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.AudienceSharingApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(AudienceSharingApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    AudienceSharingApi audienceSharingApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="adAccountsAudiencesSharedAccountsList"></a>
# **adAccountsAudiencesSharedAccountsList**
```java
Mono<AdAccountsAudiencesSharedAccountsList200Response> AudienceSharingApi.adAccountsAudiencesSharedAccountsList(adAccountIdaudienceIdaccountTypepageSizebookmark)
```

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **audienceId** | `String`| Unique identifier of the audience to use to filter the results. | |
| **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [default to `AD_ACCOUNT`] [enum: `AD_ACCOUNT`, `BUSINESS_ACCOUNT`] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |


### Return type
[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="businessAccountAudiencesSharedAccountsList"></a>
# **businessAccountAudiencesSharedAccountsList**
```java
Mono<AdAccountsAudiencesSharedAccountsList200Response> AudienceSharingApi.businessAccountAudiencesSharedAccountsList(businessIdaudienceIdaccountTypepageSizebookmark)
```

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Unique identifier of the requesting business. | |
| **audienceId** | `String`| Unique identifier of the audience to use to filter the results. | |
| **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [default to `AD_ACCOUNT`] [enum: `AD_ACCOUNT`, `BUSINESS_ACCOUNT`] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |


### Return type
[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="sharedAudiencesForBusinessList"></a>
# **sharedAudiencesForBusinessList**
```java
Mono<AudiencesList200Response> AudienceSharingApi.sharedAudiencesForBusinessList(businessIdbookmarkorderpageSize)
```

List received audiences for a business

Get a list of received audiences for the given business.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Unique identifier of the requesting business. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **order** | `String`| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |


### Return type
[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="updateAdAccountToAdAccountSharedAudience"></a>
# **updateAdAccountToAdAccountSharedAudience**
```java
Mono<SharedAudienceResponse> AudienceSharingApi.updateAdAccountToAdAccountSharedAudience(adAccountIdsharedAudience)
```

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **sharedAudience** | [**SharedAudience**](SharedAudience.md)|  | |


### Return type
[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateAdAccountToBusinessSharedAudience"></a>
# **updateAdAccountToBusinessSharedAudience**
```java
Mono<BusinessSharedAudienceResponse> AudienceSharingApi.updateAdAccountToBusinessSharedAudience(adAccountIdbusinessSharedAudience)
```

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  | |


### Return type
[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateBusinessToAdAccountSharedAudience"></a>
# **updateBusinessToAdAccountSharedAudience**
```java
Mono<SharedAudienceResponse> AudienceSharingApi.updateBusinessToAdAccountSharedAudience(businessIdsharedAudience)
```

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Unique identifier of the requesting business. | |
| **sharedAudience** | [**SharedAudience**](SharedAudience.md)|  | |


### Return type
[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateBusinessToBusinessSharedAudience"></a>
# **updateBusinessToBusinessSharedAudience**
```java
Mono<BusinessSharedAudienceResponse> AudienceSharingApi.updateBusinessToBusinessSharedAudience(businessIdbusinessSharedAudience)
```

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `String`| Unique identifier of the requesting business. | |
| **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  | |


### Return type
[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `biz_access:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

