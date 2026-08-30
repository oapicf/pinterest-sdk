# AUDIENCES_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**audiences_create**](AUDIENCES_API.md#audiences_create) | **Post** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiences_get**](AUDIENCES_API.md#audiences_get) | **Get** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiences_list**](AUDIENCES_API.md#audiences_list) | **Get** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiences_update**](AUDIENCES_API.md#audiences_update) | **Patch** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiences_create**
> audiences_create (ad_account_id: STRING_32 ; ad_accounts_audience_create: AD_ACCOUNTS_AUDIENCE_CREATE ): detachable AD_ACCOUNTS_AUDIENCE


Create audience

Create a new audience for the ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_accounts_audience_create** | [**AD_ACCOUNTS_AUDIENCE_CREATE**](AD_ACCOUNTS_AUDIENCE_CREATE.md)|  | 

### Return type

[**AD_ACCOUNTS_AUDIENCE**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_get**
> audiences_get (audience_id: STRING_32 ; ad_account_id: STRING_32 ): detachable AD_ACCOUNTS_AUDIENCE


Get audience

Get a specific audience given the audience ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audience_id** | **STRING_32**| Audience ID. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**AD_ACCOUNTS_AUDIENCE**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_list**
> audiences_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ; ownership_type:  detachable AUDIENCE_OWNERSHIP_TYPE ; exclude_nca:  detachable BOOLEAN ): detachable AUDIENCES_LIST_200_RESPONSE


List audiences

Get list of audiences for the ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **ownership_type** | [**AUDIENCE_OWNERSHIP_TYPE**](.md)|  | [optional] [default to null]
 **exclude_nca** | **BOOLEAN**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**AUDIENCES_LIST_200_RESPONSE**](audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_update**
> audiences_update (audience_id: STRING_32 ; ad_account_id: STRING_32 ; ad_accounts_audience_update: AD_ACCOUNTS_AUDIENCE_UPDATE ): detachable AD_ACCOUNTS_AUDIENCE


Update audience

Update an existing audience for the ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audience_id** | **STRING_32**| Audience ID. | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **ad_accounts_audience_update** | [**AD_ACCOUNTS_AUDIENCE_UPDATE**](AD_ACCOUNTS_AUDIENCE_UPDATE.md)|  | 

### Return type

[**AD_ACCOUNTS_AUDIENCE**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

