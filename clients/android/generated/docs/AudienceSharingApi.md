# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsAudiencesSharedAccountsList**](AudienceSharingApi.md#adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**businessAccountAudiencesSharedAccountsList**](AudienceSharingApi.md#businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**sharedAudiencesForBusinessList**](AudienceSharingApi.md#sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**updateAdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**updateAdAccountToBusinessSharedAudience**](AudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**updateBusinessToAdAccountSharedAudience**](AudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**updateBusinessToBusinessSharedAudience**](AudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses



## adAccountsAudiencesSharedAccountsList

> AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudienceSharingApi;

AudienceSharingApi apiInstance = new AudienceSharingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String audienceId = null; // String | Unique identifier of the audience to use to filter the results.
AudienceAccountType accountType = null; // AudienceAccountType | Filter accounts by account type.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
String bookmark = null; // String | Cursor used to fetch the next page of items
try {
    AdAccountsAudiencesSharedAccountsList200Response result = apiInstance.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceSharingApi#adAccountsAudiencesSharedAccountsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **audienceId** | **String**| Unique identifier of the audience to use to filter the results. | [default to null]
 **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [default to null] [enum: AD_ACCOUNT, BUSINESS_ACCOUNT]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## businessAccountAudiencesSharedAccountsList

> AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudienceSharingApi;

AudienceSharingApi apiInstance = new AudienceSharingApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
String audienceId = null; // String | Unique identifier of the audience to use to filter the results.
AudienceAccountType accountType = null; // AudienceAccountType | Filter accounts by account type.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
String bookmark = null; // String | Cursor used to fetch the next page of items
try {
    AdAccountsAudiencesSharedAccountsList200Response result = apiInstance.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceSharingApi#businessAccountAudiencesSharedAccountsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **audienceId** | **String**| Unique identifier of the audience to use to filter the results. | [default to null]
 **accountType** | [**AudienceAccountType**](.md)| Filter accounts by account type. | [default to null] [enum: AD_ACCOUNT, BUSINESS_ACCOUNT]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## sharedAudiencesForBusinessList

> AudiencesList200Response sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize)

List received audiences for a business

Get a list of received audiences for the given business.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudienceSharingApi;

AudienceSharingApi apiInstance = new AudienceSharingApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
String bookmark = null; // String | Cursor used to fetch the next page of items
String order = ASCENDING; // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    AudiencesList200Response result = apiInstance.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceSharingApi#sharedAudiencesForBusinessList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateAdAccountToAdAccountSharedAudience

> SharedAudienceResponse updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudienceSharingApi;

AudienceSharingApi apiInstance = new AudienceSharingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
SharedAudience sharedAudience = new SharedAudience(); // SharedAudience | 
try {
    SharedAudienceResponse result = apiInstance.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceSharingApi#updateAdAccountToAdAccountSharedAudience");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **sharedAudience** | [**SharedAudience**](SharedAudience.md)|  |

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateAdAccountToBusinessSharedAudience

> BusinessSharedAudienceResponse updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudienceSharingApi;

AudienceSharingApi apiInstance = new AudienceSharingApi();
String adAccountId = null; // String | Unique identifier of an ad account.
BusinessSharedAudience businessSharedAudience = new BusinessSharedAudience(); // BusinessSharedAudience | 
try {
    BusinessSharedAudienceResponse result = apiInstance.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceSharingApi#updateAdAccountToBusinessSharedAudience");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  |

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateBusinessToAdAccountSharedAudience

> SharedAudienceResponse updateBusinessToAdAccountSharedAudience(businessId, sharedAudience)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudienceSharingApi;

AudienceSharingApi apiInstance = new AudienceSharingApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
SharedAudience sharedAudience = new SharedAudience(); // SharedAudience | 
try {
    SharedAudienceResponse result = apiInstance.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceSharingApi#updateBusinessToAdAccountSharedAudience");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **sharedAudience** | [**SharedAudience**](SharedAudience.md)|  |

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateBusinessToBusinessSharedAudience

> BusinessSharedAudienceResponse updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudienceSharingApi;

AudienceSharingApi apiInstance = new AudienceSharingApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
BusinessSharedAudience businessSharedAudience = new BusinessSharedAudience(); // BusinessSharedAudience | 
try {
    BusinessSharedAudienceResponse result = apiInstance.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceSharingApi#updateBusinessToBusinessSharedAudience");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  |

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

