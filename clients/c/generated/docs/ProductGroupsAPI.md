# ProductGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProductGroupsAPI_adAccountsCatalogsProductGroupsList**](ProductGroupsAPI.md#ProductGroupsAPI_adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups


# **ProductGroupsAPI_adAccountsCatalogsProductGroupsList**
```c
// Get catalog product groups
//
// This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.
//
ad_accounts_catalogs_product_groups_list_200_response_t* ProductGroupsAPI_adAccountsCatalogsProductGroupsList(apiClient_t *apiClient, char *ad_account_id, char *feed_profile_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**feed_profile_id** | **char \*** | The feed profile id whose catalog product groups we want to return. | [optional] 

### Return type

[ad_accounts_catalogs_product_groups_list_200_response_t](ad_accounts_catalogs_product_groups_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

