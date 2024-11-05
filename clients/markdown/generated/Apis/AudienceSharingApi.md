# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adAccountsAudiencesSharedAccounts/list**](AudienceSharingApi.md#adAccountsAudiencesSharedAccounts/list) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account |
| [**businessAccountAudiencesSharedAccounts/list**](AudienceSharingApi.md#businessAccountAudiencesSharedAccounts/list) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business |
| [**sharedAudiencesForBusiness/list**](AudienceSharingApi.md#sharedAudiencesForBusiness/list) | **GET** /businesses/{business_id}/audiences | List received audiences for a business |
| [**updateAdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts |
| [**updateAdAccountToBusinessSharedAudience**](AudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses |
| [**updateBusinessToAdAccountSharedAudience**](AudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts |
| [**updateBusinessToBusinessSharedAudience**](AudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses |


<a name="adAccountsAudiencesSharedAccounts/list"></a>
# **adAccountsAudiencesSharedAccounts/list**
> ad_accounts_audiences_shared_accounts_list_200_response adAccountsAudiencesSharedAccounts/list(ad\_account\_id, audience\_id, account\_type, page\_size, bookmark)

List accounts with access to an audience owned by an ad account

    List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **audience\_id** | **String**| Unique identifier of the audience to use to filter the results. | [default to null] |
| **account\_type** | [**AudienceAccountType**](../Models/.md)| Filter accounts by account type. | [default to null] [enum: AD_ACCOUNT, BUSINESS_ACCOUNT] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**ad_accounts_audiences_shared_accounts_list_200_response**](../Models/ad_accounts_audiences_shared_accounts_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="businessAccountAudiencesSharedAccounts/list"></a>
# **businessAccountAudiencesSharedAccounts/list**
> ad_accounts_audiences_shared_accounts_list_200_response businessAccountAudiencesSharedAccounts/list(business\_id, audience\_id, account\_type, page\_size, bookmark)

List accounts with access to an audience owned by a business

    List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **audience\_id** | **String**| Unique identifier of the audience to use to filter the results. | [default to null] |
| **account\_type** | [**AudienceAccountType**](../Models/.md)| Filter accounts by account type. | [default to null] [enum: AD_ACCOUNT, BUSINESS_ACCOUNT] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**ad_accounts_audiences_shared_accounts_list_200_response**](../Models/ad_accounts_audiences_shared_accounts_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="sharedAudiencesForBusiness/list"></a>
# **sharedAudiencesForBusiness/list**
> audiences_list_200_response sharedAudiencesForBusiness/list(business\_id, bookmark, order, page\_size)

List received audiences for a business

    Get a list of received audiences for the given business.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**audiences_list_200_response**](../Models/audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateAdAccountToAdAccountSharedAudience"></a>
# **updateAdAccountToAdAccountSharedAudience**
> SharedAudienceResponse updateAdAccountToAdAccountSharedAudience(ad\_account\_id, SharedAudience)

Update audience sharing between ad accounts

    From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **SharedAudience** | [**SharedAudience**](../Models/SharedAudience.md)|  | |

### Return type

[**SharedAudienceResponse**](../Models/SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateAdAccountToBusinessSharedAudience"></a>
# **updateAdAccountToBusinessSharedAudience**
> BusinessSharedAudienceResponse updateAdAccountToBusinessSharedAudience(ad\_account\_id, BusinessSharedAudience)

Update audience sharing from an ad account to businesses

    From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **BusinessSharedAudience** | [**BusinessSharedAudience**](../Models/BusinessSharedAudience.md)|  | |

### Return type

[**BusinessSharedAudienceResponse**](../Models/BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateBusinessToAdAccountSharedAudience"></a>
# **updateBusinessToAdAccountSharedAudience**
> SharedAudienceResponse updateBusinessToAdAccountSharedAudience(business\_id, SharedAudience)

Update audience sharing from a business to ad accounts

    From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **SharedAudience** | [**SharedAudience**](../Models/SharedAudience.md)|  | |

### Return type

[**SharedAudienceResponse**](../Models/SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateBusinessToBusinessSharedAudience"></a>
# **updateBusinessToBusinessSharedAudience**
> BusinessSharedAudienceResponse updateBusinessToBusinessSharedAudience(business\_id, BusinessSharedAudience)

Update audience sharing between businesses

    From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **BusinessSharedAudience** | [**BusinessSharedAudience**](../Models/BusinessSharedAudience.md)|  | |

### Return type

[**BusinessSharedAudienceResponse**](../Models/BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

