# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupsCreate**](CatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsDelete**](CatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsList**](CatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | Get product groups list
[**catalogsProductGroupsUpdate**](CatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResultsList**](CatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feedsCreate**](CatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](CatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](CatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsList**](CatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](CatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](CatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**itemsBatchPost**](CatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**itemsGet**](CatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items


<a name="catalogsProductGroupsCreate"></a>
# **catalogsProductGroupsCreate**
> Object catalogsProductGroupsCreate(catalogsProductGroupCreateRequest)

Create product group

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest = new CatalogsProductGroupCreateRequest(); // CatalogsProductGroupCreateRequest | Request object used to created a catalogs product group.
    try {
      Object result = apiInstance.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupCreateRequest** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. |

### Return type

**Object**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | Invalid body. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
**0** | Unexpected error. |  -  |

<a name="catalogsProductGroupsDelete"></a>
# **catalogsProductGroupsDelete**
> catalogsProductGroupsDelete(productGroupId)

Delete product group

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
    try {
      apiInstance.catalogsProductGroupsDelete(productGroupId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String**| Unique identifier of a product group |

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
**204** | Catalogs Product Group deleted successfully. |  -  |
**400** | Invalid catalogs product group id parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**404** | Catalogs product group not found. |  -  |
**409** | Conflict. Can&#39;t delete this catalogs product group. |  -  |
**0** | Unexpected error. |  -  |

<a name="catalogsProductGroupsList"></a>
# **catalogsProductGroupsList**
> Paginated catalogsProductGroupsList(feedId, bookmark, pageSize)

Get product groups list

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

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
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
    try {
      Paginated result = apiInstance.catalogsProductGroupsList(feedId, bookmark, pageSize);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **String**| Unique identifier of a feed |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid feed parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**404** | Data feed not found. |  -  |
**409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
**0** | Unexpected error. |  -  |

<a name="catalogsProductGroupsUpdate"></a>
# **catalogsProductGroupsUpdate**
> CatalogsProductGroup catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest)

Update product group

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
    CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest = new CatalogsProductGroupUpdateRequest(); // CatalogsProductGroupUpdateRequest | Request object used to Update a catalogs product group.
    try {
      CatalogsProductGroup result = apiInstance.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String**| Unique identifier of a product group |
 **catalogsProductGroupUpdateRequest** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. |

### Return type

[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**401** | Unauthorized access. |  -  |
**404** | Catalogs product group not found. |  -  |
**409** | Conflict. Can&#39;t update this catalogs product group to this value. |  -  |
**0** | Unexpected error. |  -  |

<a name="feedProcessingResultsList"></a>
# **feedProcessingResultsList**
> Paginated feedProcessingResultsList(feedId, bookmark, pageSize)

List processing results for a given feed

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

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
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
    try {
      Paginated result = apiInstance.feedProcessingResultsList(feedId, bookmark, pageSize);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **String**| Unique identifier of a feed |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**401** | Unauthorized access. |  -  |
**404** | Feed not found. |  -  |
**0** | Unexpected error. |  -  |

<a name="feedsCreate"></a>
# **feedsCreate**
> CatalogsFeed feedsCreate(catalogsFeedsCreateRequest)

Create feed

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    CatalogsFeedsCreateRequest catalogsFeedsCreateRequest = new CatalogsFeedsCreateRequest(); // CatalogsFeedsCreateRequest | Request object used to created a feed.
    try {
      CatalogsFeed result = apiInstance.feedsCreate(catalogsFeedsCreateRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsFeedsCreateRequest** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md)| Request object used to created a feed. |

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
**201** | Success |  -  |
**400** | Invalid feed parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Business account required. |  -  |
**409** | User website required. |  -  |
**422** | Unique feed name is required. |  -  |
**0** | Unexpected error |  -  |

<a name="feedsDelete"></a>
# **feedsDelete**
> feedsDelete(feedId)

Delete feed

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String feedId = "feedId_example"; // String | Unique identifier of a feed
    try {
      apiInstance.feedsDelete(feedId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **String**| Unique identifier of a feed |

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
**204** | Feed deleted successfully. |  -  |
**400** | Invalid feed parameters. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**404** | Data feed not found. |  -  |
**409** | Conflict. Can&#39;t delete a feed with active promotions. |  -  |
**0** | Unexpected error |  -  |

<a name="feedsGet"></a>
# **feedsGet**
> CatalogsFeed feedsGet(feedId)

Get feed

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String feedId = "feedId_example"; // String | Unique identifier of a feed
    try {
      CatalogsFeed result = apiInstance.feedsGet(feedId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **String**| Unique identifier of a feed |

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
**200** | Success |  -  |
**400** | Invalid feed parameters. |  -  |
**401** | Unauthorized access. |  -  |
**404** | Data feed not found. |  -  |
**0** | Unexpected error. |  -  |

<a name="feedsList"></a>
# **feedsList**
> Paginated feedsList(bookmark, pageSize)

List feeds

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
    try {
      Paginated result = apiInstance.feedsList(bookmark, pageSize);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**401** | Unauthorized access. |  -  |
**0** | Unexpected error. |  -  |

<a name="feedsUpdate"></a>
# **feedsUpdate**
> CatalogsFeed feedsUpdate(feedId, catalogsFeedsUpdateRequest)

Update feed

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String feedId = "feedId_example"; // String | Unique identifier of a feed
    CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest = new CatalogsFeedsUpdateRequest(); // CatalogsFeedsUpdateRequest | Request object used to update a feed.
    try {
      CatalogsFeed result = apiInstance.feedsUpdate(feedId, catalogsFeedsUpdateRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **String**| Unique identifier of a feed |
 **catalogsFeedsUpdateRequest** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. |

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
**200** | Success |  -  |
**400** | Invalid feed parameters. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**404** | Data feed not found. |  -  |
**0** | Unexpected error |  -  |

<a name="itemsBatchGet"></a>
# **itemsBatchGet**
> CatalogsItemsBatch itemsBatchGet(batchId)

Get catalogs items batch

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String batchId = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e"; // String | Id of a catalogs items batch to fetch
    try {
      CatalogsItemsBatch result = apiInstance.itemsBatchGet(batchId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| Id of a catalogs items batch to fetch |

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
**200** | Response containing the requested catalogs items batch |  -  |
**401** | Not authorized to access catalogs items batch |  -  |
**403** | Not authorized to access catalogs items batch |  -  |
**404** | Catalogs items batch not found |  -  |
**0** | Unexpected error |  -  |

<a name="itemsBatchPost"></a>
# **itemsBatchPost**
> CatalogsItemsBatch itemsBatchPost(catalogsItemsBatchRequest)

Perform an operation on an item batch

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    CatalogsItemsBatchRequest catalogsItemsBatchRequest = new CatalogsItemsBatchRequest(); // CatalogsItemsBatchRequest | Request object used to create catalogs items in a batch
    try {
      CatalogsItemsBatch result = apiInstance.itemsBatchPost(catalogsItemsBatchRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsBatchRequest** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch |

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
**200** | Response containing the requested catalogs items batch |  -  |
**401** | Not authorized to post catalogs items |  -  |
**403** | Not authorized to post catalogs items |  -  |
**0** | Unexpected error |  -  |

<a name="itemsGet"></a>
# **itemsGet**
> CatalogsItems itemsGet(country, itemIds, language)

Get catalogs items

Get the items of the catalog created by the \&quot;operating user_account\&quot;

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    String country = "US"; // String | Country for the Catalogs Items
    List<String> itemIds = Arrays.asList(); // List<String> | Catalos Item ids
    String language = "EN"; // String | Language for the Catalogs Items
    try {
      CatalogsItems result = apiInstance.itemsGet(country, itemIds, language);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Country for the Catalogs Items |
 **itemIds** | [**List&lt;String&gt;**](String.md)| Catalos Item ids |
 **language** | **String**| Language for the Catalogs Items |

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
**200** | Response containing the requested catalogs items |  -  |
**401** | Not authorized to access catalogs items |  -  |
**403** | Not authorized to access catalogs items |  -  |
**0** | Unexpected error |  -  |

