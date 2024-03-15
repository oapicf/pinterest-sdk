# PRODUCTGROUPS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_catalogs_product_groups_list**](PRODUCTGROUPS_API.md#ad_accounts_catalogs_product_groups_list) | **Get** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups


# **ad_accounts_catalogs_product_groups_list**
> ad_accounts_catalogs_product_groups_list (ad_account_id: STRING_32 ; feed_profile_id:  detachable STRING_32 ): detachable AD_ACCOUNTS_CATALOGS_PRODUCT_GROUPS_LIST_200_RESPONSE


Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **feed_profile_id** | **STRING_32**| The feed profile id whose catalog product groups we want to return. | [optional] [default to null]

### Return type

[**AD_ACCOUNTS_CATALOGS_PRODUCT_GROUPS_LIST_200_RESPONSE**](ad_accounts_catalogs_product_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

