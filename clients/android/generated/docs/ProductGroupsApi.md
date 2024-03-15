# ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsCatalogsProductGroupsList**](ProductGroupsApi.md#adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups



## adAccountsCatalogsProductGroupsList

> AdAccountsCatalogsProductGroupsList200Response adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId)

Get catalog product groups

This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductGroupsApi;

ProductGroupsApi apiInstance = new ProductGroupsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String feedProfileId = null; // String | The feed profile id whose catalog product groups we want to return.
try {
    AdAccountsCatalogsProductGroupsList200Response result = apiInstance.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductGroupsApi#adAccountsCatalogsProductGroupsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **feedProfileId** | **String**| The feed profile id whose catalog product groups we want to return. | [optional] [default to null]

### Return type

[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

