# AUDIENCES_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**audiences_create**](AUDIENCES_API.md#audiences_create) | **Post** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiences_create_custom**](AUDIENCES_API.md#audiences_create_custom) | **Post** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**audiences_get**](AUDIENCES_API.md#audiences_get) | **Get** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiences_list**](AUDIENCES_API.md#audiences_list) | **Get** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiences_update**](AUDIENCES_API.md#audiences_update) | **Patch** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiences_create**
> audiences_create (ad_account_id: STRING_32 ; audience_create_request: AUDIENCE_CREATE_REQUEST ): detachable AUDIENCE


Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **audience_create_request** | [**AUDIENCE_CREATE_REQUEST**](AUDIENCE_CREATE_REQUEST.md)| List of ads to create, size limit [1, 30] | 

### Return type

[**AUDIENCE**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_create_custom**
> audiences_create_custom (ad_account_id: STRING_32 ; audience_create_custom_request: AUDIENCE_CREATE_CUSTOM_REQUEST ): detachable AUDIENCE


Create custom audience

Create a custom audience and find the audiences you want your ads to reach.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **audience_create_custom_request** | [**AUDIENCE_CREATE_CUSTOM_REQUEST**](AUDIENCE_CREATE_CUSTOM_REQUEST.md)| Custom audience to create. | 

### Return type

[**AUDIENCE**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_get**
> audiences_get (ad_account_id: STRING_32 ; audience_id: STRING_32 ): detachable AUDIENCE


Get audience

Get a specific audience given the audience ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **audience_id** | **STRING_32**| Unique identifier of an audience | [default to null]

### Return type

[**AUDIENCE**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_list**
> audiences_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; order:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; ownership_type:  detachable STRING_32 ): detachable AUDIENCES_LIST_200_RESPONSE


List audiences

Get list of audiences for the ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ownership_type** | **STRING_32**| &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional] [default to OWNED]

### Return type

[**AUDIENCES_LIST_200_RESPONSE**](audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_update**
> audiences_update (ad_account_id: STRING_32 ; audience_id: STRING_32 ; audience_update_request:  detachable AUDIENCE_UPDATE_REQUEST ): detachable AUDIENCE


Update audience

Update (edit or remove) an existing targeting audience.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **audience_id** | **STRING_32**| Unique identifier of an audience | [default to null]
 **audience_update_request** | [**AUDIENCE_UPDATE_REQUEST**](AUDIENCE_UPDATE_REQUEST.md)| The audience to be updated. | [optional] 

### Return type

[**AUDIENCE**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

