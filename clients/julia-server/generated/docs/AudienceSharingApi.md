# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_audiences_shared_accounts_list**](AudienceSharingApi.md#ad_accounts_audiences_shared_accounts_list) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**business_account_audiences_shared_accounts_list**](AudienceSharingApi.md#business_account_audiences_shared_accounts_list) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**shared_audiences_for_business_list**](AudienceSharingApi.md#shared_audiences_for_business_list) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**update_ad_account_to_ad_account_shared_audience**](AudienceSharingApi.md#update_ad_account_to_ad_account_shared_audience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**update_ad_account_to_business_shared_audience**](AudienceSharingApi.md#update_ad_account_to_business_shared_audience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**update_business_to_ad_account_shared_audience**](AudienceSharingApi.md#update_business_to_ad_account_shared_audience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**update_business_to_business_shared_audience**](AudienceSharingApi.md#update_business_to_business_shared_audience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


# **ad_accounts_audiences_shared_accounts_list**
> `ad_accounts_audiences_shared_accounts_list`(req::`HTTP.Request`, `audience_id`::`String`, `account_type`::`AudienceAccountType`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing,) -> `AdAccountsAudiencesSharedAccountsList200Response`

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`audience_id`** | **`String`**| Unique identifier of the audience to use to filter the results. |
**`account_type`** | [**`AudienceAccountType`**](.md)| Filter accounts by account type. |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`AdAccountsAudiencesSharedAccountsList200Response`**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_account_audiences_shared_accounts_list**
> `business_account_audiences_shared_accounts_list`(req::`HTTP.Request`, `business_id`::`String`, `audience_id`::`String`, `account_type`::`AudienceAccountType`; `bookmark`=nothing, `page_size`=nothing,) -> `AdAccountsAudiencesSharedAccountsList200Response`

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`audience_id`** | **`String`**| Unique identifier of the audience to use to filter the results. |
**`account_type`** | [**`AudienceAccountType`**](.md)| Filter accounts by account type. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`AdAccountsAudiencesSharedAccountsList200Response`**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shared_audiences_for_business_list**
> `shared_audiences_for_business_list`(req::`HTTP.Request`, `business_id`::`String`; `order`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `SharedAudiencesForBusinessList200Response`

List received audiences for a business

Get a list of received audiences for the given business.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`order`** | [**`Order`**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`SharedAudiencesForBusinessList200Response`**](SharedAudiencesForBusinessList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ad_account_to_ad_account_shared_audience**
> `update_ad_account_to_ad_account_shared_audience`(req::`HTTP.Request`, `ad_account_id`::`String`, `ad_account_to_ad_account_shared_audience_update_with_required_body`::`AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody`;) -> `AdAccountToAdAccountSharedAudience`

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`ad_account_to_ad_account_shared_audience_update_with_required_body`** | [**`AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody`**](AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  |

### Return type

[**`AdAccountToAdAccountSharedAudience`**](AdAccountToAdAccountSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ad_account_to_business_shared_audience**
> `update_ad_account_to_business_shared_audience`(req::`HTTP.Request`, `ad_account_id`::`String`, `ad_account_to_business_shared_audience_update_with_required_body`::`AdAccountToBusinessSharedAudienceUpdateWithRequiredBody`;) -> `AdAccountToBusinessSharedAudience`

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`ad_account_to_business_shared_audience_update_with_required_body`** | [**`AdAccountToBusinessSharedAudienceUpdateWithRequiredBody`**](AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)|  |

### Return type

[**`AdAccountToBusinessSharedAudience`**](AdAccountToBusinessSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_to_ad_account_shared_audience**
> `update_business_to_ad_account_shared_audience`(req::`HTTP.Request`, `business_id`::`String`, `business_to_ad_account_shared_audience_update_with_required_body`::`BusinessToAdAccountSharedAudienceUpdateWithRequiredBody`;) -> `BusinessToAdAccountSharedAudience`

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`business_to_ad_account_shared_audience_update_with_required_body`** | [**`BusinessToAdAccountSharedAudienceUpdateWithRequiredBody`**](BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  |

### Return type

[**`BusinessToAdAccountSharedAudience`**](BusinessToAdAccountSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_to_business_shared_audience**
> `update_business_to_business_shared_audience`(req::`HTTP.Request`, `business_id`::`String`, `business_to_business_shared_audience_update_with_required_body`::`BusinessToBusinessSharedAudienceUpdateWithRequiredBody`;) -> `BusinessToBusinessSharedAudience`

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`business_to_business_shared_audience_update_with_required_body`** | [**`BusinessToBusinessSharedAudienceUpdateWithRequiredBody`**](BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)|  |

### Return type

[**`BusinessToBusinessSharedAudience`**](BusinessToBusinessSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

