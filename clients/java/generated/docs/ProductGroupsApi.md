# ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adAccountsCatalogsProductGroupsList**](ProductGroupsApi.md#adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups |


<a id="adAccountsCatalogsProductGroupsList"></a>
# **adAccountsCatalogsProductGroupsList**
> AdAccountsCatalogsProductGroupsList200Response adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId)

Get catalog product groups

This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.ProductGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ProductGroupsApi apiInstance = new ProductGroupsApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    String feedProfileId = "feedProfileId_example"; // String | The feed profile id whose catalog product groups we want to return.
    try {
      AdAccountsCatalogsProductGroupsList200Response result = apiInstance.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductGroupsApi#adAccountsCatalogsProductGroupsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **feedProfileId** | **String**| The feed profile id whose catalog product groups we want to return. | [optional] |

### Return type

[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads parameters. |  -  |
| **401** | Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest. |  -  |
| **404** | Merchant data not found. |  -  |
| **0** | Unexpected error |  -  |

