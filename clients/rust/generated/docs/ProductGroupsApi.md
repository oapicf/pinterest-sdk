# \ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_catalogs_product_groups_slash_list**](ProductGroupsApi.md#ad_accounts_catalogs_product_groups_slash_list) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups



## ad_accounts_catalogs_product_groups_slash_list

> models::AdAccountsCatalogsProductGroupsList200Response ad_accounts_catalogs_product_groups_slash_list(ad_account_id, feed_profile_id)
Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**feed_profile_id** | Option<**String**> | The feed profile id whose catalog product groups we want to return. |  |

### Return type

[**models::AdAccountsCatalogsProductGroupsList200Response**](ad_accounts_catalogs_product_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

