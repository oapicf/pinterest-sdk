# Org.OpenAPITools.Api.CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsProductGroupsCreate**](CatalogsApi.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
[**CatalogsProductGroupsDelete**](CatalogsApi.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsProductGroupsList**](CatalogsApi.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | Get product groups list
[**CatalogsProductGroupsUpdate**](CatalogsApi.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**FeedProcessingResultsList**](CatalogsApi.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**FeedsCreate**](CatalogsApi.md#feedscreate) | **POST** /catalogs/feeds | Create feed
[**FeedsDelete**](CatalogsApi.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**FeedsGet**](CatalogsApi.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**FeedsList**](CatalogsApi.md#feedslist) | **GET** /catalogs/feeds | List feeds
[**FeedsUpdate**](CatalogsApi.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**ItemsBatchGet**](CatalogsApi.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**ItemsBatchPost**](CatalogsApi.md#itemsbatchpost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**ItemsGet**](CatalogsApi.md#itemsget) | **GET** /catalogs/items | Get catalogs items


<a name="catalogsproductgroupscreate"></a>
# **CatalogsProductGroupsCreate**
> Object CatalogsProductGroupsCreate (CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest)

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupsCreateExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var catalogsProductGroupCreateRequest = new CatalogsProductGroupCreateRequest(); // CatalogsProductGroupCreateRequest | Request object used to created a catalogs product group.

            try
            {
                // Create product group
                Object result = apiInstance.CatalogsProductGroupsCreate(catalogsProductGroupCreateRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsCreate: " + e.Message );
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="catalogsproductgroupsdelete"></a>
# **CatalogsProductGroupsDelete**
> void CatalogsProductGroupsDelete (string productGroupId)

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupsDeleteExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var productGroupId = "productGroupId_example";  // string | Unique identifier of a product group

            try
            {
                // Delete product group
                apiInstance.CatalogsProductGroupsDelete(productGroupId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **string**| Unique identifier of a product group | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="catalogsproductgroupslist"></a>
# **CatalogsProductGroupsList**
> Paginated CatalogsProductGroupsList (string feedId, string bookmark, int? pageSize)

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupsListExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var feedId = "feedId_example";  // string | Unique identifier of a feed
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // Get product groups list
                Paginated result = apiInstance.CatalogsProductGroupsList(feedId, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string**| Unique identifier of a feed | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="catalogsproductgroupsupdate"></a>
# **CatalogsProductGroupsUpdate**
> CatalogsProductGroup CatalogsProductGroupsUpdate (string productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest)

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CatalogsProductGroupsUpdateExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var productGroupId = "productGroupId_example";  // string | Unique identifier of a product group
            var catalogsProductGroupUpdateRequest = new CatalogsProductGroupUpdateRequest(); // CatalogsProductGroupUpdateRequest | Request object used to Update a catalogs product group.

            try
            {
                // Update product group
                CatalogsProductGroup result = apiInstance.CatalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.CatalogsProductGroupsUpdate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **string**| Unique identifier of a product group | 
 **catalogsProductGroupUpdateRequest** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. | 

### Return type

[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="feedprocessingresultslist"></a>
# **FeedProcessingResultsList**
> Paginated FeedProcessingResultsList (string feedId, string bookmark, int? pageSize)

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedProcessingResultsListExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var feedId = "feedId_example";  // string | Unique identifier of a feed
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // List processing results for a given feed
                Paginated result = apiInstance.FeedProcessingResultsList(feedId, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedProcessingResultsList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string**| Unique identifier of a feed | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="feedscreate"></a>
# **FeedsCreate**
> CatalogsFeed FeedsCreate (CatalogsFeedsCreateRequest catalogsFeedsCreateRequest)

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedsCreateExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var catalogsFeedsCreateRequest = new CatalogsFeedsCreateRequest(); // CatalogsFeedsCreateRequest | Request object used to created a feed.

            try
            {
                // Create feed
                CatalogsFeed result = apiInstance.FeedsCreate(catalogsFeedsCreateRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedsCreate: " + e.Message );
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="feedsdelete"></a>
# **FeedsDelete**
> void FeedsDelete (string feedId)

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedsDeleteExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var feedId = "feedId_example";  // string | Unique identifier of a feed

            try
            {
                // Delete feed
                apiInstance.FeedsDelete(feedId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedsDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string**| Unique identifier of a feed | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="feedsget"></a>
# **FeedsGet**
> CatalogsFeed FeedsGet (string feedId)

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedsGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var feedId = "feedId_example";  // string | Unique identifier of a feed

            try
            {
                // Get feed
                CatalogsFeed result = apiInstance.FeedsGet(feedId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string**| Unique identifier of a feed | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="feedslist"></a>
# **FeedsList**
> Paginated FeedsList (string bookmark, int? pageSize)

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedsListExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // List feeds
                Paginated result = apiInstance.FeedsList(bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedsList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="feedsupdate"></a>
# **FeedsUpdate**
> CatalogsFeed FeedsUpdate (string feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest)

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FeedsUpdateExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var feedId = "feedId_example";  // string | Unique identifier of a feed
            var catalogsFeedsUpdateRequest = new CatalogsFeedsUpdateRequest(); // CatalogsFeedsUpdateRequest | Request object used to update a feed.

            try
            {
                // Update feed
                CatalogsFeed result = apiInstance.FeedsUpdate(feedId, catalogsFeedsUpdateRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.FeedsUpdate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string**| Unique identifier of a feed | 
 **catalogsFeedsUpdateRequest** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="itemsbatchget"></a>
# **ItemsBatchGet**
> CatalogsItemsBatch ItemsBatchGet (string batchId)

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ItemsBatchGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var batchId = 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e;  // string | Id of a catalogs items batch to fetch

            try
            {
                // Get catalogs items batch
                CatalogsItemsBatch result = apiInstance.ItemsBatchGet(batchId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.ItemsBatchGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string**| Id of a catalogs items batch to fetch | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="itemsbatchpost"></a>
# **ItemsBatchPost**
> CatalogsItemsBatch ItemsBatchPost (CatalogsItemsBatchRequest catalogsItemsBatchRequest)

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ItemsBatchPostExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var catalogsItemsBatchRequest = new CatalogsItemsBatchRequest(); // CatalogsItemsBatchRequest | Request object used to create catalogs items in a batch

            try
            {
                // Perform an operation on an item batch
                CatalogsItemsBatch result = apiInstance.ItemsBatchPost(catalogsItemsBatchRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.ItemsBatchPost: " + e.Message );
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="itemsget"></a>
# **ItemsGet**
> CatalogsItems ItemsGet (string country, List<string> itemIds, string language)

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ItemsGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CatalogsApi();
            var country = US;  // string | Country for the Catalogs Items
            var itemIds = new List<string>(); // List<string> | Catalos Item ids
            var language = EN;  // string | Language for the Catalogs Items

            try
            {
                // Get catalogs items
                CatalogsItems result = apiInstance.ItemsGet(country, itemIds, language);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CatalogsApi.ItemsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **string**| Country for the Catalogs Items | 
 **itemIds** | [**List<string>**](string.md)| Catalos Item ids | 
 **language** | **string**| Language for the Catalogs Items | 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

