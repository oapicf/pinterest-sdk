# .CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsList**](CatalogsApi.md#catalogsList) | **GET** /catalogs | List catalogs
[**catalogsProductGroupPinsList**](CatalogsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
[**catalogsProductGroupsCreate**](CatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsDelete**](CatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsGet**](CatalogsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](CatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](CatalogsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
[**catalogsProductGroupsUpdate**](CatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResultsList**](CatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feedsCreate**](CatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](CatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](CatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsList**](CatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](CatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](CatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
[**itemsBatchPost**](CatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**itemsGet**](CatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items
[**itemsIssuesList**](CatalogsApi.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
[**productsByProductGroupFilterList**](CatalogsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products


# **catalogsList**
> CatalogsList200Response catalogsList()

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiCatalogsListRequest = {
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.catalogsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **catalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList()

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiCatalogsProductGroupPinsListRequest = {
  // string | Unique identifier of a product group
  productGroupId: "4",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.catalogsProductGroupPinsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsProductGroupPinsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**401** | Unauthorized access. |  -  |
**404** | Catalogs product group not found. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **catalogsProductGroupsCreate**
> CatalogsProductGroupsCreate201Response catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest)

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiCatalogsProductGroupsCreateRequest = {
  // CatalogsProductGroupsCreateRequest | Request object used to created a catalogs product group.
  catalogsProductGroupsCreateRequest: null,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.catalogsProductGroupsCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateRequest** | **CatalogsProductGroupsCreateRequest**| Request object used to created a catalogs product group. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsProductGroupsCreate201Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | Invalid body. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
**409** | Conflict. Can\&#39;t create this catalogs product group with this value. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **catalogsProductGroupsDelete**
> void catalogsProductGroupsDelete()

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiCatalogsProductGroupsDeleteRequest = {
  // string | Unique identifier of a product group
  productGroupId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.catalogsProductGroupsDelete(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**void**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Catalogs Product Group deleted successfully. |  -  |
**400** | Invalid catalogs product group id parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
**404** | Catalogs product group not found. |  -  |
**409** | Conflict. Can\&#39;t delete this catalogs product group. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **catalogsProductGroupsGet**
> CatalogsProductGroupsCreate201Response catalogsProductGroupsGet()

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiCatalogsProductGroupsGetRequest = {
  // string | Unique identifier of a product group
  productGroupId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.catalogsProductGroupsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsProductGroupsCreate201Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid catalogs product group id parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
**404** | Catalogs product group not found. |  -  |
**409** | Conflict. Can\&#39;t get a catalogs product group without an existing catalog. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **catalogsProductGroupsList**
> CatalogsProductGroupsList200Response catalogsProductGroupsList()

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiCatalogsProductGroupsListRequest = {
  // string | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
  feedId: "4",
  // string | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
  catalogId: "4",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.catalogsProductGroupsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | [**string**] | Filter entities for a given feed_id. If not given, all feeds are considered. | (optional) defaults to undefined
 **catalogId** | [**string**] | Filter entities for a given catalog_id. If not given, all catalogs are considered. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsProductGroupsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid feed parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
**404** | Data feed not found. |  -  |
**409** | Conflict. Can\&#39;t create this catalogs product group with this value. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **catalogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCounts catalogsProductGroupsProductCountsGet()

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiCatalogsProductGroupsProductCountsGetRequest = {
  // string | Unique identifier of a product group
  productGroupId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.catalogsProductGroupsProductCountsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsProductGroupProductCounts**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Product Group Not Found. |  -  |
**409** | Can\&#39;t access this feature without an existing catalog. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **catalogsProductGroupsUpdate**
> CatalogsProductGroupsCreate201Response catalogsProductGroupsUpdate(catalogsProductGroupsUpdateRequest)

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiCatalogsProductGroupsUpdateRequest = {
  // string | Unique identifier of a product group
  productGroupId: "4",
  // CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
  catalogsProductGroupsUpdateRequest: null,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.catalogsProductGroupsUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsUpdateRequest** | **CatalogsProductGroupsUpdateRequest**| Request object used to Update a catalogs product group. |
 **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsProductGroupsCreate201Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
**404** | Catalogs product group not found. |  -  |
**409** | Conflict. Can\&#39;t update this catalogs product group to this value. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **feedProcessingResultsList**
> FeedProcessingResultsList200Response feedProcessingResultsList()

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiFeedProcessingResultsListRequest = {
  // string | Unique identifier of a feed
  feedId: "4",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.feedProcessingResultsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**FeedProcessingResultsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **feedsCreate**
> CatalogsFeed feedsCreate(feedsCreateRequest)

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiFeedsCreateRequest = {
  // FeedsCreateRequest | Request object used to created a feed.
  feedsCreateRequest: null,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.feedsCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedsCreateRequest** | **FeedsCreateRequest**| Request object used to created a feed. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsFeed**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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
**501** | Not implemented (absent \&quot;default_country\&quot; or \&quot;default_locale\&quot;). |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **feedsDelete**
> void feedsDelete()

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiFeedsDeleteRequest = {
  // string | Unique identifier of a feed
  feedId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.feedsDelete(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**void**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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
**409** | Conflict. Can\&#39;t delete a feed with active promotions. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **feedsGet**
> CatalogsFeed feedsGet()

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiFeedsGetRequest = {
  // string | Unique identifier of a feed
  feedId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.feedsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsFeed**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **feedsList**
> FeedsList200Response feedsList()

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiFeedsListRequest = {
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // string | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
  catalogId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.feedsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **catalogId** | [**string**] | Filter entities for a given catalog_id. If not given, all catalogs are considered. | (optional) defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**FeedsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **feedsUpdate**
> CatalogsFeed feedsUpdate(feedsUpdateRequest)

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/shopping/catalog/\'>Pinterest API for shopping</a>.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiFeedsUpdateRequest = {
  // string | Unique identifier of a feed
  feedId: "4",
  // FeedsUpdateRequest | Request object used to update a feed.
  feedsUpdateRequest: null,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.feedsUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedsUpdateRequest** | **FeedsUpdateRequest**| Request object used to update a feed. |
 **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsFeed**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **itemsBatchGet**
> CatalogsItemsBatch itemsBatchGet()

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiItemsBatchGetRequest = {
  // string | Id of a catalogs items batch to fetch
  batchId: "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.itemsBatchGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | [**string**] | Id of a catalogs items batch to fetch | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsItemsBatch**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the requested catalogs items batch |  -  |
**401** | Not authenticated to access catalogs items batch |  -  |
**403** | Not authorized to access catalogs items batch |  -  |
**404** | Catalogs items batch not found |  -  |
**405** | Method Not Allowed. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **itemsBatchPost**
> CatalogsItemsBatch itemsBatchPost(itemsBatchPostRequest)

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiItemsBatchPostRequest = {
  // ItemsBatchPostRequest | Request object used to create catalogs items in a batch
  itemsBatchPostRequest: null,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.itemsBatchPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemsBatchPostRequest** | **ItemsBatchPostRequest**| Request object used to create catalogs items in a batch |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsItemsBatch**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the requested catalogs items batch |  -  |
**400** | Invalid request parameters. |  -  |
**401** | Not authenticated to post catalogs items |  -  |
**403** | Not authorized to post catalogs items |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **itemsGet**
> CatalogsItems itemsGet()

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiItemsGetRequest = {
  // string | Country for the Catalogs Items
  country: "US",
  // string | Language for the Catalogs Items
  language: "EN",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
  // Array<string> | This parameter is deprecated. Use filters instead. (optional)
  itemIds: ["CR123"],
  // CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter. (optional)
  filters: {
    catalogType: "RETAIL",
    itemIds: [
      "itemIds_example",
    ],
    catalogId: "4",
  },
};

apiInstance.itemsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | [**string**] | Country for the Catalogs Items | defaults to undefined
 **language** | [**string**] | Language for the Catalogs Items | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **itemIds** | **Array&lt;string&gt;** | This parameter is deprecated. Use filters instead. | (optional) defaults to undefined
 **filters** | **CatalogsItemsFilters** | Identifies items to be retrieved. This is a required parameter. | (optional) defaults to undefined


### Return type

**CatalogsItems**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the requested catalogs items |  -  |
**400** | Invalid request parameters. |  -  |
**401** | Not authorized to access catalogs items |  -  |
**403** | Not authorized to access catalogs items |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **itemsIssuesList**
> ItemsIssuesList200Response itemsIssuesList()

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \'item_numbers\' and \'item_validation_issue\' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiItemsIssuesListRequest = {
  // string | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
  processingResultId: "5224831246441439241",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // Array<number> | Item number based on order of appearance in the Catalogs Feed. For example, \'0\' refers to first item found in a feed that was downloaded from a \'location\' specified during feed creation. (optional)
  itemNumbers: [1,5],
  // CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue. (optional)
  itemValidationIssue: "TITLE_MISSING",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.itemsIssuesList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processingResultId** | [**string**] | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **itemNumbers** | **Array&lt;number&gt;** | Item number based on order of appearance in the Catalogs Feed. For example, \&#39;0\&#39; refers to first item found in a feed that was downloaded from a \&#39;location\&#39; specified during feed creation. | (optional) defaults to undefined
 **itemValidationIssue** | **CatalogsItemValidationIssue** | Filter item validation issues that have a given type of item validation issue. | (optional) defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**ItemsIssuesList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unauthorized access. |  -  |
**404** | Processing Result not found. |  -  |
**501** | Not implemented. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **productsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(catalogsListProductsByFilterRequest)

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/shopping/catalog/\'>Learn more</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CatalogsApi(configuration);

let body:.CatalogsApiProductsByProductGroupFilterListRequest = {
  // CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
  catalogsListProductsByFilterRequest: {
    feedId: "2680059592705",
    filters: ,
  },
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.productsByProductGroupFilterList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | **CatalogsListProductsByFilterRequest**| Object holding a group of filters for a catalog product group |
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsProductGroupPinsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Unauthorized access. |  -  |
**409** | Conflict. Can\&#39;t get products. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


