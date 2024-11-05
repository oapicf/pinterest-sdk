# AUDIENCESHARING_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_audiences_shared_accounts_list**](AUDIENCESHARING_API.md#ad_accounts_audiences_shared_accounts_list) | **Get** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**business_account_audiences_shared_accounts_list**](AUDIENCESHARING_API.md#business_account_audiences_shared_accounts_list) | **Get** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**shared_audiences_for_business_list**](AUDIENCESHARING_API.md#shared_audiences_for_business_list) | **Get** /businesses/{business_id}/audiences | List received audiences for a business
[**update_ad_account_to_ad_account_shared_audience**](AUDIENCESHARING_API.md#update_ad_account_to_ad_account_shared_audience) | **Patch** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**update_ad_account_to_business_shared_audience**](AUDIENCESHARING_API.md#update_ad_account_to_business_shared_audience) | **Patch** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**update_business_to_ad_account_shared_audience**](AUDIENCESHARING_API.md#update_business_to_ad_account_shared_audience) | **Patch** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**update_business_to_business_shared_audience**](AUDIENCESHARING_API.md#update_business_to_business_shared_audience) | **Patch** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


# **ad_accounts_audiences_shared_accounts_list**
> ad_accounts_audiences_shared_accounts_list (ad_account_id: STRING_32 ; audience_id: STRING_32 ; account_type: AUDIENCE_ACCOUNT_TYPE ; page_size:  detachable INTEGER_32 ; bookmark:  detachable STRING_32 ): detachable AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE


List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **audience_id** | **STRING_32**| Unique identifier of the audience to use to filter the results. | [default to null]
 **account_type** | [**AUDIENCE_ACCOUNT_TYPE**](.md)| Filter accounts by account type. | [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE**](ad_accounts_audiences_shared_accounts_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_account_audiences_shared_accounts_list**
> business_account_audiences_shared_accounts_list (business_id: STRING_32 ; audience_id: STRING_32 ; account_type: AUDIENCE_ACCOUNT_TYPE ; page_size:  detachable INTEGER_32 ; bookmark:  detachable STRING_32 ): detachable AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE


List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **audience_id** | **STRING_32**| Unique identifier of the audience to use to filter the results. | [default to null]
 **account_type** | [**AUDIENCE_ACCOUNT_TYPE**](.md)| Filter accounts by account type. | [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE**](ad_accounts_audiences_shared_accounts_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shared_audiences_for_business_list**
> shared_audiences_for_business_list (business_id: STRING_32 ; bookmark:  detachable STRING_32 ; order:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable AUDIENCES_LIST_200_RESPONSE


List received audiences for a business

Get a list of received audiences for the given business.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**AUDIENCES_LIST_200_RESPONSE**](audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ad_account_to_ad_account_shared_audience**
> update_ad_account_to_ad_account_shared_audience (ad_account_id: STRING_32 ; shared_audience: SHARED_AUDIENCE ): detachable SHARED_AUDIENCE_RESPONSE


Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **shared_audience** | [**SHARED_AUDIENCE**](SHARED_AUDIENCE.md)|  | 

### Return type

[**SHARED_AUDIENCE_RESPONSE**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ad_account_to_business_shared_audience**
> update_ad_account_to_business_shared_audience (ad_account_id: STRING_32 ; business_shared_audience: BUSINESS_SHARED_AUDIENCE ): detachable BUSINESS_SHARED_AUDIENCE_RESPONSE


Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **business_shared_audience** | [**BUSINESS_SHARED_AUDIENCE**](BUSINESS_SHARED_AUDIENCE.md)|  | 

### Return type

[**BUSINESS_SHARED_AUDIENCE_RESPONSE**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_to_ad_account_shared_audience**
> update_business_to_ad_account_shared_audience (business_id: STRING_32 ; shared_audience: SHARED_AUDIENCE ): detachable SHARED_AUDIENCE_RESPONSE


Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **shared_audience** | [**SHARED_AUDIENCE**](SHARED_AUDIENCE.md)|  | 

### Return type

[**SHARED_AUDIENCE_RESPONSE**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_to_business_shared_audience**
> update_business_to_business_shared_audience (business_id: STRING_32 ; business_shared_audience: BUSINESS_SHARED_AUDIENCE ): detachable BUSINESS_SHARED_AUDIENCE_RESPONSE


Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **business_shared_audience** | [**BUSINESS_SHARED_AUDIENCE**](BUSINESS_SHARED_AUDIENCE.md)|  | 

### Return type

[**BUSINESS_SHARED_AUDIENCE_RESPONSE**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

