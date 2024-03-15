# ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adAccountsCatalogsProductGroups/list**](ProductGroupsApi.md#adAccountsCatalogsProductGroups/list) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups |


<a name="adAccountsCatalogsProductGroups/list"></a>
# **adAccountsCatalogsProductGroups/list**
> ad_accounts_catalogs_product_groups_list_200_response adAccountsCatalogsProductGroups/list(ad\_account\_id, feed\_profile\_id)

Get catalog product groups

    This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **feed\_profile\_id** | **String**| The feed profile id whose catalog product groups we want to return. | [optional] [default to null] |

### Return type

[**ad_accounts_catalogs_product_groups_list_200_response**](../Models/ad_accounts_catalogs_product_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

