# audiences_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**audiences/create**](audiences_api.md#audiences/create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
**audiences/create_custom**](audiences_api.md#audiences/create_custom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
**audiences/get**](audiences_api.md#audiences/get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
**audiences/list**](audiences_api.md#audiences/list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
**audiences/update**](audiences_api.md#audiences/update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiences/create**
> models::Audience audiences/create(ctx, ad_account_id, audience_create_request)
Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **audience_create_request** | [**AudienceCreateRequest**](AudienceCreateRequest.md)| List of ads to create, size limit [1, 30] | 

### Return type

[**models::Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences/create_custom**
> models::Audience audiences/create_custom(ctx, ad_account_id, audience_create_custom_request)
Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **audience_create_custom_request** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md)| Custom audience to create. | 

### Return type

[**models::Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences/get**
> models::Audience audiences/get(ctx, ad_account_id, audience_id)
Get audience

Get a specific audience given the audience ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **audience_id** | **String**| Unique identifier of an audience | 

### Return type

[**models::Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences/list**
> models::AudiencesList200Response audiences/list(ctx, ad_account_id, optional)
List audiences

Get list of audiences for the ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]
 **ownership_type** | **String**| <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type. | [default to "OWNED".to_string()]

### Return type

[**models::AudiencesList200Response**](audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences/update**
> models::Audience audiences/update(ctx, ad_account_id, audience_id, optional)
Update audience

Update (edit or remove) an existing targeting audience.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **audience_id** | **String**| Unique identifier of an audience | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **audience_id** | **String**| Unique identifier of an audience | 
 **audience_update_request** | [**AudienceUpdateRequest**](AudienceUpdateRequest.md)| The audience to be updated. | 

### Return type

[**models::Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

