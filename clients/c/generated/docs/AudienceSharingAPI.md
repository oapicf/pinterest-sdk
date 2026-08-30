# AudienceSharingAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudienceSharingAPI_adAccountsAudiencesSharedAccountsList**](AudienceSharingAPI.md#AudienceSharingAPI_adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**AudienceSharingAPI_businessAccountAudiencesSharedAccountsList**](AudienceSharingAPI.md#AudienceSharingAPI_businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**AudienceSharingAPI_sharedAudiencesForBusinessList**](AudienceSharingAPI.md#AudienceSharingAPI_sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**AudienceSharingAPI_updateAdAccountToAdAccountSharedAudience**](AudienceSharingAPI.md#AudienceSharingAPI_updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**AudienceSharingAPI_updateAdAccountToBusinessSharedAudience**](AudienceSharingAPI.md#AudienceSharingAPI_updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**AudienceSharingAPI_updateBusinessToAdAccountSharedAudience**](AudienceSharingAPI.md#AudienceSharingAPI_updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**AudienceSharingAPI_updateBusinessToBusinessSharedAudience**](AudienceSharingAPI.md#AudienceSharingAPI_updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


# **AudienceSharingAPI_adAccountsAudiencesSharedAccountsList**
```c
// List accounts with access to an audience owned by an ad account
//
// List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
//
ad_accounts_audiences_shared_accounts_list_200_response_t* AudienceSharingAPI_adAccountsAudiencesSharedAccountsList(apiClient_t *apiClient, char *audience_id, audience_account_type_e account_type, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**audience_id** | **char \*** | Unique identifier of the audience to use to filter the results. | 
**account_type** | **audience_account_type_e** | Filter accounts by account type. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[ad_accounts_audiences_shared_accounts_list_200_response_t](ad_accounts_audiences_shared_accounts_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudienceSharingAPI_businessAccountAudiencesSharedAccountsList**
```c
// List accounts with access to an audience owned by a business
//
// List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
//
ad_accounts_audiences_shared_accounts_list_200_response_t* AudienceSharingAPI_businessAccountAudiencesSharedAccountsList(apiClient_t *apiClient, char *business_id, char *audience_id, audience_account_type_e account_type, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**audience_id** | **char \*** | Unique identifier of the audience to use to filter the results. | 
**account_type** | **audience_account_type_e** | Filter accounts by account type. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[ad_accounts_audiences_shared_accounts_list_200_response_t](ad_accounts_audiences_shared_accounts_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudienceSharingAPI_sharedAudiencesForBusinessList**
```c
// List received audiences for a business
//
// Get a list of received audiences for the given business.
//
shared_audiences_for_business_list_200_response_t* AudienceSharingAPI_sharedAudiencesForBusinessList(apiClient_t *apiClient, char *business_id, order_e order, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**order** | **order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[shared_audiences_for_business_list_200_response_t](shared_audiences_for_business_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudienceSharingAPI_updateAdAccountToAdAccountSharedAudience**
```c
// Update audience sharing between ad accounts
//
// From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
//
ad_account_to_ad_account_shared_audience_t* AudienceSharingAPI_updateAdAccountToAdAccountSharedAudience(apiClient_t *apiClient, char *ad_account_id, ad_account_to_ad_account_shared_audience_update_with_required_body_t *ad_account_to_ad_account_shared_audience_update_with_required_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_account_to_ad_account_shared_audience_update_with_required_body** | **[ad_account_to_ad_account_shared_audience_update_with_required_body_t](ad_account_to_ad_account_shared_audience_update_with_required_body.md) \*** |  | 

### Return type

[ad_account_to_ad_account_shared_audience_t](ad_account_to_ad_account_shared_audience.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudienceSharingAPI_updateAdAccountToBusinessSharedAudience**
```c
// Update audience sharing from an ad account to businesses
//
// From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
//
ad_account_to_business_shared_audience_t* AudienceSharingAPI_updateAdAccountToBusinessSharedAudience(apiClient_t *apiClient, char *ad_account_id, ad_account_to_business_shared_audience_update_with_required_body_t *ad_account_to_business_shared_audience_update_with_required_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**ad_account_to_business_shared_audience_update_with_required_body** | **[ad_account_to_business_shared_audience_update_with_required_body_t](ad_account_to_business_shared_audience_update_with_required_body.md) \*** |  | 

### Return type

[ad_account_to_business_shared_audience_t](ad_account_to_business_shared_audience.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudienceSharingAPI_updateBusinessToAdAccountSharedAudience**
```c
// Update audience sharing from a business to ad accounts
//
// From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
//
business_to_ad_account_shared_audience_t* AudienceSharingAPI_updateBusinessToAdAccountSharedAudience(apiClient_t *apiClient, char *business_id, business_to_ad_account_shared_audience_update_with_required_body_t *business_to_ad_account_shared_audience_update_with_required_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**business_to_ad_account_shared_audience_update_with_required_body** | **[business_to_ad_account_shared_audience_update_with_required_body_t](business_to_ad_account_shared_audience_update_with_required_body.md) \*** |  | 

### Return type

[business_to_ad_account_shared_audience_t](business_to_ad_account_shared_audience.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AudienceSharingAPI_updateBusinessToBusinessSharedAudience**
```c
// Update audience sharing between businesses
//
// From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
//
business_to_business_shared_audience_t* AudienceSharingAPI_updateBusinessToBusinessSharedAudience(apiClient_t *apiClient, char *business_id, business_to_business_shared_audience_update_with_required_body_t *business_to_business_shared_audience_update_with_required_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**business_to_business_shared_audience_update_with_required_body** | **[business_to_business_shared_audience_update_with_required_body_t](business_to_business_shared_audience_update_with_required_body.md) \*** |  | 

### Return type

[business_to_business_shared_audience_t](business_to_business_shared_audience.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

