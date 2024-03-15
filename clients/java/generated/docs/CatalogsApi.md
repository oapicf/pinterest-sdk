# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**catalogsList**](CatalogsApi.md#catalogsList) | **GET** /catalogs | List catalogs |
| [**catalogsProductGroupPinsList**](CatalogsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group |
| [**catalogsProductGroupsCreate**](CatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group |
| [**catalogsProductGroupsDelete**](CatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
| [**catalogsProductGroupsGet**](CatalogsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
| [**catalogsProductGroupsList**](CatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups |
| [**catalogsProductGroupsProductCountsGet**](CatalogsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group |
| [**catalogsProductGroupsUpdate**](CatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group |
| [**feedProcessingResultsList**](CatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed |
| [**feedsCreate**](CatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed |
| [**feedsDelete**](CatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
| [**feedsGet**](CatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed |
| [**feedsList**](CatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds |
| [**feedsUpdate**](CatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
| [**itemsBatchGet**](CatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status |
| [**itemsBatchPost**](CatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch |
| [**itemsGet**](CatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items |
| [**itemsIssuesList**](CatalogsApi.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result |
| [**productsByProductGroupFilterList**](CatalogsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products |


<a id="catalogsList"></a>
# **catalogsList**
> CatalogsList200Response catalogsList(bookmark, pageSize, adAccountId)

List catalogs

Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsList200Response result = apiInstance.catalogsList(bookmark, pageSize, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#catalogsList");
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
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **0** | Unexpected error. |  -  |

<a id="catalogsProductGroupPinsList"></a>
# **catalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId)

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsProductGroupPinsList200Response result = apiInstance.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#catalogsProductGroupPinsList");
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
| **productGroupId** | **String**| Unique identifier of a product group | |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **404** | Catalogs product group not found. |  -  |
| **0** | Unexpected error. |  -  |

<a id="catalogsProductGroupsCreate"></a>
# **catalogsProductGroupsCreate**
> CatalogsProductGroupsCreate201Response catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, adAccountId)

Create product group

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest = new CatalogsProductGroupsCreateRequest(); // CatalogsProductGroupsCreateRequest | Request object used to created a catalogs product group.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsProductGroupsCreate201Response result = apiInstance.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#catalogsProductGroupsCreate");
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
| **catalogsProductGroupsCreateRequest** | [**CatalogsProductGroupsCreateRequest**](CatalogsProductGroupsCreateRequest.md)| Request object used to created a catalogs product group. | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Invalid body. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
| **0** | Unexpected error. |  -  |

<a id="catalogsProductGroupsDelete"></a>
# **catalogsProductGroupsDelete**
> catalogsProductGroupsDelete(productGroupId, adAccountId)

Delete product group

Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      apiInstance.catalogsProductGroupsDelete(productGroupId, adAccountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#catalogsProductGroupsDelete");
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
| **productGroupId** | **String**| Unique identifier of a product group | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Catalogs Product Group deleted successfully. |  -  |
| **400** | Invalid catalogs product group id parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **404** | Catalogs product group not found. |  -  |
| **409** | Conflict. Can&#39;t delete this catalogs product group. |  -  |
| **0** | Unexpected error. |  -  |

<a id="catalogsProductGroupsGet"></a>
# **catalogsProductGroupsGet**
> CatalogsProductGroupsCreate201Response catalogsProductGroupsGet(productGroupId, adAccountId)

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsProductGroupsCreate201Response result = apiInstance.catalogsProductGroupsGet(productGroupId, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#catalogsProductGroupsGet");
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
| **productGroupId** | **String**| Unique identifier of a product group | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid catalogs product group id parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **404** | Catalogs product group not found. |  -  |
| **409** | Conflict. Can&#39;t get a catalogs product group without an existing catalog. |  -  |
| **0** | Unexpected error. |  -  |

<a id="catalogsProductGroupsList"></a>
# **catalogsProductGroupsList**
> CatalogsProductGroupsList200Response catalogsProductGroupsList(feedId, catalogId, bookmark, pageSize, adAccountId)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String feedId = "feedId_example"; // String | Filter entities for a given feed_id. If not given, all feeds are considered.
    String catalogId = "catalogId_example"; // String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsProductGroupsList200Response result = apiInstance.catalogsProductGroupsList(feedId, catalogId, bookmark, pageSize, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#catalogsProductGroupsList");
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
| **feedId** | **String**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] |
| **catalogId** | **String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid feed parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **404** | Data feed not found. |  -  |
| **409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
| **0** | Unexpected error. |  -  |

<a id="catalogsProductGroupsProductCountsGet"></a>
# **catalogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCounts catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsProductGroupProductCounts result = apiInstance.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#catalogsProductGroupsProductCountsGet");
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
| **productGroupId** | **String**| Unique identifier of a product group | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupProductCounts**](CatalogsProductGroupProductCounts.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Product Group Not Found. |  -  |
| **409** | Can&#39;t access this feature without an existing catalog. |  -  |
| **0** | Unexpected error. |  -  |

<a id="catalogsProductGroupsUpdate"></a>
# **catalogsProductGroupsUpdate**
> CatalogsProductGroupsCreate201Response catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId)

Update product group

Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
    CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest = new CatalogsProductGroupsUpdateRequest(); // CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsProductGroupsCreate201Response result = apiInstance.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#catalogsProductGroupsUpdate");
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
| **productGroupId** | **String**| Unique identifier of a product group | |
| **catalogsProductGroupsUpdateRequest** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md)| Request object used to Update a catalogs product group. | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **404** | Catalogs product group not found. |  -  |
| **409** | Conflict. Can&#39;t update this catalogs product group to this value. |  -  |
| **0** | Unexpected error. |  -  |

<a id="feedProcessingResultsList"></a>
# **feedProcessingResultsList**
> FeedProcessingResultsList200Response feedProcessingResultsList(feedId, bookmark, pageSize, adAccountId)

List processing results for a given feed

Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String feedId = "feedId_example"; // String | Unique identifier of a feed
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      FeedProcessingResultsList200Response result = apiInstance.feedProcessingResultsList(feedId, bookmark, pageSize, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#feedProcessingResultsList");
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
| **feedId** | **String**| Unique identifier of a feed | |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**FeedProcessingResultsList200Response**](FeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **404** | Feed not found. |  -  |
| **0** | Unexpected error. |  -  |

<a id="feedsCreate"></a>
# **feedsCreate**
> CatalogsFeed feedsCreate(feedsCreateRequest, adAccountId)

Create feed

Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    FeedsCreateRequest feedsCreateRequest = new FeedsCreateRequest(); // FeedsCreateRequest | Request object used to created a feed.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsFeed result = apiInstance.feedsCreate(feedsCreateRequest, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#feedsCreate");
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
| **feedsCreateRequest** | [**FeedsCreateRequest**](FeedsCreateRequest.md)| Request object used to created a feed. | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Invalid feed parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Business account required. |  -  |
| **409** | User website required. |  -  |
| **422** | Unique feed name is required. |  -  |
| **501** | Not implemented (absent \&quot;default_country\&quot; or \&quot;default_locale\&quot;). |  -  |
| **0** | Unexpected error |  -  |

<a id="feedsDelete"></a>
# **feedsDelete**
> feedsDelete(feedId, adAccountId)

Delete feed

Delete a feed owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String feedId = "feedId_example"; // String | Unique identifier of a feed
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      apiInstance.feedsDelete(feedId, adAccountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#feedsDelete");
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
| **feedId** | **String**| Unique identifier of a feed | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Feed deleted successfully. |  -  |
| **400** | Invalid feed parameters. |  -  |
| **403** | Forbidden. Account not approved for feed mutations yet. |  -  |
| **404** | Data feed not found. |  -  |
| **409** | Conflict. Can&#39;t delete a feed with active promotions. |  -  |
| **0** | Unexpected error |  -  |

<a id="feedsGet"></a>
# **feedsGet**
> CatalogsFeed feedsGet(feedId, adAccountId)

Get feed

Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String feedId = "feedId_example"; // String | Unique identifier of a feed
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsFeed result = apiInstance.feedsGet(feedId, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#feedsGet");
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
| **feedId** | **String**| Unique identifier of a feed | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid feed parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **404** | Data feed not found. |  -  |
| **0** | Unexpected error. |  -  |

<a id="feedsList"></a>
# **feedsList**
> FeedsList200Response feedsList(bookmark, pageSize, catalogId, adAccountId)

List feeds

Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    String catalogId = "catalogId_example"; // String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      FeedsList200Response result = apiInstance.feedsList(bookmark, pageSize, catalogId, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#feedsList");
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
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **catalogId** | **String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**FeedsList200Response**](FeedsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **0** | Unexpected error. |  -  |

<a id="feedsUpdate"></a>
# **feedsUpdate**
> CatalogsFeed feedsUpdate(feedId, feedsUpdateRequest, adAccountId)

Update feed

Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String feedId = "feedId_example"; // String | Unique identifier of a feed
    FeedsUpdateRequest feedsUpdateRequest = new FeedsUpdateRequest(); // FeedsUpdateRequest | Request object used to update a feed.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsFeed result = apiInstance.feedsUpdate(feedId, feedsUpdateRequest, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#feedsUpdate");
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
| **feedId** | **String**| Unique identifier of a feed | |
| **feedsUpdateRequest** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md)| Request object used to update a feed. | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid feed parameters. |  -  |
| **403** | Forbidden. Account not approved for feed mutations yet. |  -  |
| **404** | Data feed not found. |  -  |
| **0** | Unexpected error |  -  |

<a id="itemsBatchGet"></a>
# **itemsBatchGet**
> CatalogsItemsBatch itemsBatchGet(batchId, adAccountId)

Get catalogs item batch status

Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String batchId = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e"; // String | Id of a catalogs items batch to fetch
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsItemsBatch result = apiInstance.itemsBatchGet(batchId, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#itemsBatchGet");
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
| **batchId** | **String**| Id of a catalogs items batch to fetch | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the requested catalogs items batch |  -  |
| **401** | Not authenticated to access catalogs items batch |  -  |
| **403** | Not authorized to access catalogs items batch |  -  |
| **404** | Catalogs items batch not found |  -  |
| **405** | Method Not Allowed. |  -  |
| **0** | Unexpected error |  -  |

<a id="itemsBatchPost"></a>
# **itemsBatchPost**
> CatalogsItemsBatch itemsBatchPost(itemsBatchPostRequest, adAccountId)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    ItemsBatchPostRequest itemsBatchPostRequest = new ItemsBatchPostRequest(); // ItemsBatchPostRequest | Request object used to create catalogs items in a batch
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsItemsBatch result = apiInstance.itemsBatchPost(itemsBatchPostRequest, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#itemsBatchPost");
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
| **itemsBatchPostRequest** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the requested catalogs items batch |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Not authenticated to post catalogs items |  -  |
| **403** | Not authorized to post catalogs items |  -  |
| **0** | Unexpected error |  -  |

<a id="itemsGet"></a>
# **itemsGet**
> CatalogsItems itemsGet(country, language, adAccountId, itemIds, filters)

Get catalogs items

Get the items of the catalog owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String country = "US"; // String | Country for the Catalogs Items
    String language = "EN"; // String | Language for the Catalogs Items
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    List<String> itemIds = Arrays.asList(); // List<String> | This parameter is deprecated. Use filters instead.
    CatalogsItemsFilters filters = new CatalogsItemsFilters(); // CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter.
    try {
      CatalogsItems result = apiInstance.itemsGet(country, language, adAccountId, itemIds, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#itemsGet");
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
| **country** | **String**| Country for the Catalogs Items | |
| **language** | **String**| Language for the Catalogs Items | |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |
| **itemIds** | [**List&lt;String&gt;**](String.md)| This parameter is deprecated. Use filters instead. | [optional] |
| **filters** | [**CatalogsItemsFilters**](.md)| Identifies items to be retrieved. This is a required parameter. | [optional] |

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the requested catalogs items |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Not authorized to access catalogs items |  -  |
| **403** | Not authorized to access catalogs items |  -  |
| **0** | Unexpected error |  -  |

<a id="itemsIssuesList"></a>
# **itemsIssuesList**
> ItemsIssuesList200Response itemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId)

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String processingResultId = "5224831246441439241"; // String | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    List<Integer> itemNumbers = Arrays.asList(); // List<Integer> | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
    CatalogsItemValidationIssue itemValidationIssue = CatalogsItemValidationIssue.fromValue("AD_LINK_FORMAT_WARNING"); // CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      ItemsIssuesList200Response result = apiInstance.itemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#itemsIssuesList");
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
| **processingResultId** | **String**| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **itemNumbers** | [**List&lt;Integer&gt;**](Integer.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] |
| **itemValidationIssue** | [**CatalogsItemValidationIssue**](.md)| Filter item validation issues that have a given type of item validation issue. | [optional] [enum: AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADULT_INVALID, ADWORDS_FORMAT_INVALID, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, EXPIRATION_DATE_INVALID, GENDER_INVALID, GTIN_INVALID, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, IMAGE_LINK_WARNING, INVALID_DOMAIN, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, ITEMID_MISSING, LINK_FORMAT_INVALID, LINK_FORMAT_WARNING, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, MIN_AD_PRICE_INVALID, MPN_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, PRODUCT_TYPE_LENGTH_TOO_LONG, SALE_DATE_INVALID, SALES_PRICE_INVALID, SALES_PRICE_TOO_HIGH, SALES_PRICE_TOO_LOW, SHIPPING_INVALID, SHIPPING_HEIGHT_INVALID, SHIPPING_WEIGHT_INVALID, SHIPPING_WIDTH_INVALID, SIZE_SYSTEM_INVALID, SIZE_TYPE_INVALID, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TITLE_MISSING, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UTM_SOURCE_AUTO_CORRECTED, WEIGHT_UNIT_INVALID] |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized access. |  -  |
| **404** | Processing Result not found. |  -  |
| **501** | Not implemented. |  -  |
| **0** | Unexpected error. |  -  |

<a id="productsByProductGroupFilterList"></a>
# **productsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId)

List filtered products

List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest = new CatalogsListProductsByFilterRequest(); // CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    try {
      CatalogsProductGroupPinsList200Response result = apiInstance.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#productsByProductGroupFilterList");
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
| **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group | |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **adAccountId** | **String**| Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized access. |  -  |
| **409** | Conflict. Can&#39;t get products. |  -  |
| **0** | Unexpected error. |  -  |

