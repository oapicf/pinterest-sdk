# Org.OpenAPITools.Api.CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CatalogsList**](CatalogsApi.md#catalogslist) | **GET** /catalogs | List catalogs |
| [**CatalogsProductGroupPinsList**](CatalogsApi.md#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group |
| [**CatalogsProductGroupsCreate**](CatalogsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group |
| [**CatalogsProductGroupsDelete**](CatalogsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
| [**CatalogsProductGroupsGet**](CatalogsApi.md#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
| [**CatalogsProductGroupsList**](CatalogsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups |
| [**CatalogsProductGroupsProductCountsGet**](CatalogsApi.md#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group |
| [**CatalogsProductGroupsUpdate**](CatalogsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group |
| [**FeedProcessingResultsList**](CatalogsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed |
| [**FeedsCreate**](CatalogsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed |
| [**FeedsDelete**](CatalogsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
| [**FeedsGet**](CatalogsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed |
| [**FeedsList**](CatalogsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds |
| [**FeedsUpdate**](CatalogsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
| [**ItemsBatchGet**](CatalogsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status |
| [**ItemsBatchPost**](CatalogsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Operate on item batch |
| [**ItemsGet**](CatalogsApi.md#itemsget) | **GET** /catalogs/items | Get catalogs items |
| [**ItemsIssuesList**](CatalogsApi.md#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result |
| [**ProductsByProductGroupFilterList**](CatalogsApi.md#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products |

<a id="catalogslist"></a>
# **CatalogsList**
> CatalogsList200Response CatalogsList (string? bookmark = null, int? pageSize = null, string? adAccountId = null)

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // List catalogs
                CatalogsList200Response result = apiInstance.CatalogsList(bookmark, pageSize, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CatalogsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List catalogs
    ApiResponse<CatalogsList200Response> response = apiInstance.CatalogsListWithHttpInfo(bookmark, pageSize, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.CatalogsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="catalogsproductgrouppinslist"></a>
# **CatalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response CatalogsProductGroupPinsList (string productGroupId, string? bookmark = null, int? pageSize = null, string? adAccountId = null)

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupPinsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var productGroupId = "productGroupId_example";  // string | Unique identifier of a product group
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // List products for a Product Group
                CatalogsProductGroupPinsList200Response result = apiInstance.CatalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupPinsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CatalogsProductGroupPinsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List products for a Product Group
    ApiResponse<CatalogsProductGroupPinsList200Response> response = apiInstance.CatalogsProductGroupPinsListWithHttpInfo(productGroupId, bookmark, pageSize, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupPinsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **productGroupId** | **string** | Unique identifier of a product group |  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="catalogsproductgroupscreate"></a>
# **CatalogsProductGroupsCreate**
> CatalogsProductGroupsCreate201Response CatalogsProductGroupsCreate (CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest, string? adAccountId = null)

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupsCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var catalogsProductGroupsCreateRequest = new CatalogsProductGroupsCreateRequest(); // CatalogsProductGroupsCreateRequest | Request object used to created a catalogs product group.
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Create product group
                CatalogsProductGroupsCreate201Response result = apiInstance.CatalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CatalogsProductGroupsCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create product group
    ApiResponse<CatalogsProductGroupsCreate201Response> response = apiInstance.CatalogsProductGroupsCreateWithHttpInfo(catalogsProductGroupsCreateRequest, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **catalogsProductGroupsCreateRequest** | [**CatalogsProductGroupsCreateRequest**](CatalogsProductGroupsCreateRequest.md) | Request object used to created a catalogs product group. |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="catalogsproductgroupsdelete"></a>
# **CatalogsProductGroupsDelete**
> void CatalogsProductGroupsDelete (string productGroupId, string? adAccountId = null)

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupsDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var productGroupId = "productGroupId_example";  // string | Unique identifier of a product group
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Delete product group
                apiInstance.CatalogsProductGroupsDelete(productGroupId, adAccountId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsDelete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CatalogsProductGroupsDeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete product group
    apiInstance.CatalogsProductGroupsDeleteWithHttpInfo(productGroupId, adAccountId);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsDeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **productGroupId** | **string** | Unique identifier of a product group |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="catalogsproductgroupsget"></a>
# **CatalogsProductGroupsGet**
> CatalogsProductGroupsCreate201Response CatalogsProductGroupsGet (string productGroupId, string? adAccountId = null)

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var productGroupId = "productGroupId_example";  // string | Unique identifier of a product group
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get product group
                CatalogsProductGroupsCreate201Response result = apiInstance.CatalogsProductGroupsGet(productGroupId, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CatalogsProductGroupsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get product group
    ApiResponse<CatalogsProductGroupsCreate201Response> response = apiInstance.CatalogsProductGroupsGetWithHttpInfo(productGroupId, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **productGroupId** | **string** | Unique identifier of a product group |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="catalogsproductgroupslist"></a>
# **CatalogsProductGroupsList**
> CatalogsProductGroupsList200Response CatalogsProductGroupsList (string? feedId = null, string? catalogId = null, string? bookmark = null, int? pageSize = null, string? adAccountId = null)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var feedId = "feedId_example";  // string? | Filter entities for a given feed_id. If not given, all feeds are considered. (optional) 
            var catalogId = "catalogId_example";  // string? | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional) 
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // List product groups
                CatalogsProductGroupsList200Response result = apiInstance.CatalogsProductGroupsList(feedId, catalogId, bookmark, pageSize, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CatalogsProductGroupsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List product groups
    ApiResponse<CatalogsProductGroupsList200Response> response = apiInstance.CatalogsProductGroupsListWithHttpInfo(feedId, catalogId, bookmark, pageSize, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **feedId** | **string?** | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional]  |
| **catalogId** | **string?** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional]  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="catalogsproductgroupsproductcountsget"></a>
# **CatalogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCounts CatalogsProductGroupsProductCountsGet (string productGroupId, string? adAccountId = null)

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupsProductCountsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var productGroupId = "productGroupId_example";  // string | Unique identifier of a product group
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get product counts for a Product Group
                CatalogsProductGroupProductCounts result = apiInstance.CatalogsProductGroupsProductCountsGet(productGroupId, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsProductCountsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CatalogsProductGroupsProductCountsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get product counts for a Product Group
    ApiResponse<CatalogsProductGroupProductCounts> response = apiInstance.CatalogsProductGroupsProductCountsGetWithHttpInfo(productGroupId, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsProductCountsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **productGroupId** | **string** | Unique identifier of a product group |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="catalogsproductgroupsupdate"></a>
# **CatalogsProductGroupsUpdate**
> CatalogsProductGroupsCreate201Response CatalogsProductGroupsUpdate (string productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, string? adAccountId = null)

Update product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupsUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var productGroupId = "productGroupId_example";  // string | Unique identifier of a product group
            var catalogsProductGroupsUpdateRequest = new CatalogsProductGroupsUpdateRequest(); // CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Update product group
                CatalogsProductGroupsCreate201Response result = apiInstance.CatalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CatalogsProductGroupsUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update product group
    ApiResponse<CatalogsProductGroupsCreate201Response> response = apiInstance.CatalogsProductGroupsUpdateWithHttpInfo(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **productGroupId** | **string** | Unique identifier of a product group |  |
| **catalogsProductGroupsUpdateRequest** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md) | Request object used to Update a catalogs product group. |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="feedprocessingresultslist"></a>
# **FeedProcessingResultsList**
> FeedProcessingResultsList200Response FeedProcessingResultsList (string feedId, string? bookmark = null, int? pageSize = null, string? adAccountId = null)

List processing results for a given feed

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedProcessingResultsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var feedId = "feedId_example";  // string | Unique identifier of a feed
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // List processing results for a given feed
                FeedProcessingResultsList200Response result = apiInstance.FeedProcessingResultsList(feedId, bookmark, pageSize, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedProcessingResultsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FeedProcessingResultsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List processing results for a given feed
    ApiResponse<FeedProcessingResultsList200Response> response = apiInstance.FeedProcessingResultsListWithHttpInfo(feedId, bookmark, pageSize, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.FeedProcessingResultsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **feedId** | **string** | Unique identifier of a feed |  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="feedscreate"></a>
# **FeedsCreate**
> CatalogsFeed FeedsCreate (FeedsCreateRequest feedsCreateRequest, string? adAccountId = null)

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedsCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var feedsCreateRequest = new FeedsCreateRequest(); // FeedsCreateRequest | Request object used to created a feed.
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Create feed
                CatalogsFeed result = apiInstance.FeedsCreate(feedsCreateRequest, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedsCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FeedsCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create feed
    ApiResponse<CatalogsFeed> response = apiInstance.FeedsCreateWithHttpInfo(feedsCreateRequest, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.FeedsCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **feedsCreateRequest** | [**FeedsCreateRequest**](FeedsCreateRequest.md) | Request object used to created a feed. |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="feedsdelete"></a>
# **FeedsDelete**
> void FeedsDelete (string feedId, string? adAccountId = null)

Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedsDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var feedId = "feedId_example";  // string | Unique identifier of a feed
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Delete feed
                apiInstance.FeedsDelete(feedId, adAccountId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedsDelete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FeedsDeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete feed
    apiInstance.FeedsDeleteWithHttpInfo(feedId, adAccountId);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.FeedsDeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **feedId** | **string** | Unique identifier of a feed |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="feedsget"></a>
# **FeedsGet**
> CatalogsFeed FeedsGet (string feedId, string? adAccountId = null)

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var feedId = "feedId_example";  // string | Unique identifier of a feed
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get feed
                CatalogsFeed result = apiInstance.FeedsGet(feedId, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FeedsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get feed
    ApiResponse<CatalogsFeed> response = apiInstance.FeedsGetWithHttpInfo(feedId, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.FeedsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **feedId** | **string** | Unique identifier of a feed |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="feedslist"></a>
# **FeedsList**
> FeedsList200Response FeedsList (string? bookmark = null, int? pageSize = null, string? catalogId = null, string? adAccountId = null)

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var catalogId = "catalogId_example";  // string? | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional) 
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // List feeds
                FeedsList200Response result = apiInstance.FeedsList(bookmark, pageSize, catalogId, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FeedsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List feeds
    ApiResponse<FeedsList200Response> response = apiInstance.FeedsListWithHttpInfo(bookmark, pageSize, catalogId, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.FeedsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **catalogId** | **string?** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional]  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="feedsupdate"></a>
# **FeedsUpdate**
> CatalogsFeed FeedsUpdate (string feedId, FeedsUpdateRequest feedsUpdateRequest, string? adAccountId = null)

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedsUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var feedId = "feedId_example";  // string | Unique identifier of a feed
            var feedsUpdateRequest = new FeedsUpdateRequest(); // FeedsUpdateRequest | Request object used to update a feed.
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Update feed
                CatalogsFeed result = apiInstance.FeedsUpdate(feedId, feedsUpdateRequest, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedsUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FeedsUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update feed
    ApiResponse<CatalogsFeed> response = apiInstance.FeedsUpdateWithHttpInfo(feedId, feedsUpdateRequest, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.FeedsUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **feedId** | **string** | Unique identifier of a feed |  |
| **feedsUpdateRequest** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md) | Request object used to update a feed. |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="itemsbatchget"></a>
# **ItemsBatchGet**
> CatalogsItemsBatch ItemsBatchGet (string batchId, string? adAccountId = null)

Get catalogs item batch status

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ItemsBatchGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var batchId = 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e;  // string | Id of a catalogs items batch to fetch
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get catalogs item batch status
                CatalogsItemsBatch result = apiInstance.ItemsBatchGet(batchId, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.ItemsBatchGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ItemsBatchGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get catalogs item batch status
    ApiResponse<CatalogsItemsBatch> response = apiInstance.ItemsBatchGetWithHttpInfo(batchId, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.ItemsBatchGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **batchId** | **string** | Id of a catalogs items batch to fetch |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="itemsbatchpost"></a>
# **ItemsBatchPost**
> CatalogsItemsBatch ItemsBatchPost (ItemsBatchPostRequest itemsBatchPostRequest, string? adAccountId = null)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ItemsBatchPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var itemsBatchPostRequest = new ItemsBatchPostRequest(); // ItemsBatchPostRequest | Request object used to create catalogs items in a batch
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Operate on item batch
                CatalogsItemsBatch result = apiInstance.ItemsBatchPost(itemsBatchPostRequest, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.ItemsBatchPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ItemsBatchPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Operate on item batch
    ApiResponse<CatalogsItemsBatch> response = apiInstance.ItemsBatchPostWithHttpInfo(itemsBatchPostRequest, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.ItemsBatchPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **itemsBatchPostRequest** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md) | Request object used to create catalogs items in a batch |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="itemsget"></a>
# **ItemsGet**
> CatalogsItems ItemsGet (string country, string language, string? adAccountId = null, List<string>? itemIds = null, CatalogsItemsFilters? filters = null)

Get catalogs items

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ItemsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var country = US;  // string | Country for the Catalogs Items
            var language = EN;  // string | Language for the Catalogs Items
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 
            var itemIds = new List<string>?(); // List<string>? | This parameter is deprecated. Use filters instead. (optional) 
            var filters = new CatalogsItemsFilters?(); // CatalogsItemsFilters? | Identifies items to be retrieved. This is a required parameter. (optional) 

            try
            {
                // Get catalogs items
                CatalogsItems result = apiInstance.ItemsGet(country, language, adAccountId, itemIds, filters);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.ItemsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ItemsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get catalogs items
    ApiResponse<CatalogsItems> response = apiInstance.ItemsGetWithHttpInfo(country, language, adAccountId, itemIds, filters);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.ItemsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **country** | **string** | Country for the Catalogs Items |  |
| **language** | **string** | Language for the Catalogs Items |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |
| **itemIds** | [**List&lt;string&gt;?**](string.md) | This parameter is deprecated. Use filters instead. | [optional]  |
| **filters** | [**CatalogsItemsFilters?**](CatalogsItemsFilters?.md) | Identifies items to be retrieved. This is a required parameter. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="itemsissueslist"></a>
# **ItemsIssuesList**
> ItemsIssuesList200Response ItemsIssuesList (string processingResultId, string? bookmark = null, int? pageSize = null, List<int>? itemNumbers = null, CatalogsItemValidationIssue? itemValidationIssue = null, string? adAccountId = null)

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ItemsIssuesListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var processingResultId = 5224831246441439241;  // string | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var itemNumbers = new List<int>?(); // List<int>? | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. (optional) 
            var itemValidationIssue = new CatalogsItemValidationIssue?(); // CatalogsItemValidationIssue? | Filter item validation issues that have a given type of item validation issue. (optional) 
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // List item issues for a given processing result
                ItemsIssuesList200Response result = apiInstance.ItemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.ItemsIssuesList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ItemsIssuesListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List item issues for a given processing result
    ApiResponse<ItemsIssuesList200Response> response = apiInstance.ItemsIssuesListWithHttpInfo(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.ItemsIssuesListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **processingResultId** | **string** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). |  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **itemNumbers** | [**List&lt;int&gt;?**](int.md) | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional]  |
| **itemValidationIssue** | [**CatalogsItemValidationIssue?**](CatalogsItemValidationIssue?.md) | Filter item validation issues that have a given type of item validation issue. | [optional]  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="productsbyproductgroupfilterlist"></a>
# **ProductsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response ProductsByProductGroupFilterList (CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, string? bookmark = null, int? pageSize = null, string? adAccountId = null)

List filtered products

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ProductsByProductGroupFilterListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi(config);
            var catalogsListProductsByFilterRequest = new CatalogsListProductsByFilterRequest(); // CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // List filtered products
                CatalogsProductGroupPinsList200Response result = apiInstance.ProductsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CatalogsApi.ProductsByProductGroupFilterList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ProductsByProductGroupFilterListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List filtered products
    ApiResponse<CatalogsProductGroupPinsList200Response> response = apiInstance.ProductsByProductGroupFilterListWithHttpInfo(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CatalogsApi.ProductsByProductGroupFilterListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md) | Object holding a group of filters for a catalog product group |  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

