# product_groups_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**ad_accounts_catalogs_product_groups/list**](product_groups_api.md#ad_accounts_catalogs_product_groups/list) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups


# **ad_accounts_catalogs_product_groups/list**
> models::AdAccountsCatalogsProductGroupsList200Response ad_accounts_catalogs_product_groups/list(ctx, ad_account_id, optional)
Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

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
 **feed_profile_id** | **String**| The feed profile id whose catalog product groups we want to return. | 

### Return type

[**models::AdAccountsCatalogsProductGroupsList200Response**](ad_accounts_catalogs_product_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

