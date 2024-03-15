# ProductGroupsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsCatalogsProductGroupsList**](ProductGroupsApi.md#adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups



## adAccountsCatalogsProductGroupsList

Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Example

```bash
 adAccountsCatalogsProductGroupsList ad_account_id=value  feed_profile_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **feedProfileId** | **string** | The feed profile id whose catalog product groups we want to return. | [optional] [default to null]

### Return type

[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

