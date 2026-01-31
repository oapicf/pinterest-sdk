# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**catalogsCreate**](#catalogscreate) | **POST** /catalogs | Create catalog|
|[**catalogsList**](#catalogslist) | **GET** /catalogs | List catalogs|
|[**catalogsProductGroupPinsList**](#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group|
|[**catalogsProductGroupsCreate**](#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group|
|[**catalogsProductGroupsCreateMany**](#catalogsproductgroupscreatemany) | **POST** /catalogs/product_groups/multiple | Create product groups|
|[**catalogsProductGroupsDelete**](#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group|
|[**catalogsProductGroupsDeleteMany**](#catalogsproductgroupsdeletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups|
|[**catalogsProductGroupsGet**](#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group|
|[**catalogsProductGroupsList**](#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups|
|[**catalogsProductGroupsProductCountsGet**](#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts|
|[**catalogsProductGroupsUpdate**](#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group|
|[**feedProcessingResultsList**](#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results|
|[**feedsCreate**](#feedscreate) | **POST** /catalogs/feeds | Create feed|
|[**feedsDelete**](#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed|
|[**feedsGet**](#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed|
|[**feedsIngest**](#feedsingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items|
|[**feedsList**](#feedslist) | **GET** /catalogs/feeds | List feeds|
|[**feedsUpdate**](#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed|
|[**itemsBatchGet**](#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status|
|[**itemsBatchPost**](#itemsbatchpost) | **POST** /catalogs/items/batch | Operate on item batch|
|[**itemsGet**](#itemsget) | **GET** /catalogs/items | Get catalogs items|
|[**itemsIssuesList**](#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues|
|[**itemsPost**](#itemspost) | **POST** /catalogs/items | Get catalogs items (POST)|
|[**productsByProductGroupFilterList**](#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter|
|[**reportsCreate**](#reportscreate) | **POST** /catalogs/reports | Build catalogs report|
|[**reportsGet**](#reportsget) | **GET** /catalogs/reports | Get catalogs report|
|[**reportsStats**](#reportsstats) | **GET** /catalogs/reports/stats | List report stats|

# **catalogsCreate**
> Catalog catalogsCreate(catalogsCreateRequest)

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: this API only supports the catalog type of HOTEL for now.

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    CatalogsCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let catalogsCreateRequest: CatalogsCreateRequest; //Request object used to created a feed.
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsCreate(
    catalogsCreateRequest,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogsCreateRequest** | **CatalogsCreateRequest**| Request object used to created a feed. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**Catalog**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsList**
> CatalogsList200Response catalogsList()

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsList(
    bookmark,
    pageSize,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList()

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let productGroupId: string; //Unique identifier of a product group (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let pinMetrics: boolean; //Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

const { status, data } = await apiInstance.catalogsProductGroupPinsList(
    productGroupId,
    bookmark,
    pageSize,
    adAccountId,
    pinMetrics
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false|


### Return type

**CatalogsProductGroupPinsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**404** | Catalogs product group not found. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsCreate**
> CatalogsVerticalProductGroup catalogsProductGroupsCreate(multipleProductGroupsInner)

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    MultipleProductGroupsInner
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let multipleProductGroupsInner: MultipleProductGroupsInner; //Request object used to create a single catalogs product groups.
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsCreate(
    multipleProductGroupsInner,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **multipleProductGroupsInner** | **MultipleProductGroupsInner**| Request object used to create a single catalogs product groups. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsVerticalProductGroup**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Success |  -  |
|**400** | Invalid body. |  -  |
|**401** | Unauthorized access. |  -  |
|**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
|**409** | Conflict. Can\&#39;t create this catalogs product group with this value. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsCreateMany**
> Array<string> catalogsProductGroupsCreateMany(multipleProductGroupsInner)

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let multipleProductGroupsInner: Array<MultipleProductGroupsInner>; //Request object used to create one or more catalogs product groups.
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsCreateMany(
    multipleProductGroupsInner,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **multipleProductGroupsInner** | **Array<MultipleProductGroupsInner>**| Request object used to create one or more catalogs product groups. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**Array<string>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Success |  -  |
|**400** | Invalid body. |  -  |
|**401** | Unauthorized access. |  -  |
|**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
|**409** | Conflict. Can\&#39;t create this catalogs product group with this value. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsDelete**
> catalogsProductGroupsDelete()

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let productGroupId: string; //Unique identifier of a product group (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsDelete(
    productGroupId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


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
|**204** | Catalogs Product Group deleted successfully. |  -  |
|**400** | Invalid catalogs product group id parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
|**404** | Catalogs product group not found. |  -  |
|**409** | Conflict. Can\&#39;t delete this catalogs product group. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsDeleteMany**
> catalogsProductGroupsDeleteMany()

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let id: Array<number>; //Comma-separated list of product group ids (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsDeleteMany(
    id,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | **Array&lt;number&gt;** | Comma-separated list of product group ids | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


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
|**204** | Catalogs Product Groups deleted successfully. |  -  |
|**401** | Unauthorized access. |  -  |
|**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
|**404** | Catalogs product group not found. |  -  |
|**409** | Conflict. Can\&#39;t delete this catalogs product group. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsGet**
> CatalogsVerticalProductGroup catalogsProductGroupsGet()

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let productGroupId: string; //Unique identifier of a product group (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsGet(
    productGroupId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsVerticalProductGroup**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid catalogs product group id parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
|**404** | Catalogs product group not found. |  -  |
|**409** | Conflict. Can\&#39;t get a catalogs product group without an existing catalog. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsList**
> CatalogsProductGroupsList200Response catalogsProductGroupsList()

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let id: Array<number>; //Comma-separated list of product group ids (optional) (default to undefined)
let feedId: string; //Filter entities for a given feed_id. If not given, all feeds are considered. (optional) (default to undefined)
let catalogId: string; //Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsList(
    id,
    feedId,
    catalogId,
    bookmark,
    pageSize,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | **Array&lt;number&gt;** | Comma-separated list of product group ids | (optional) defaults to undefined|
| **feedId** | [**string**] | Filter entities for a given feed_id. If not given, all feeds are considered. | (optional) defaults to undefined|
| **catalogId** | [**string**] | Filter entities for a given catalog_id. If not given, all catalogs are considered. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsProductGroupsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid feed parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
|**404** | Data feed not found. |  -  |
|**409** | Conflict. Can\&#39;t create this catalogs product group with this value. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCountsVertical catalogsProductGroupsProductCountsGet()

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let productGroupId: string; //Unique identifier of a product group (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsProductCountsGet(
    productGroupId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsProductGroupProductCountsVertical**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**404** | Product Group Not Found. |  -  |
|**409** | Can\&#39;t access this feature without an existing catalog. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsUpdate**
> CatalogsVerticalProductGroup catalogsProductGroupsUpdate(catalogsProductGroupsUpdateRequest)

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    CatalogsProductGroupsUpdateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let productGroupId: string; //Unique identifier of a product group (default to undefined)
let catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest; //Request object used to Update a catalogs product group.
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsUpdate(
    productGroupId,
    catalogsProductGroupsUpdateRequest,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogsProductGroupsUpdateRequest** | **CatalogsProductGroupsUpdateRequest**| Request object used to Update a catalogs product group. | |
| **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsVerticalProductGroup**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
|**404** | Catalogs product group not found. |  -  |
|**409** | Conflict. Can\&#39;t update this catalogs product group to this value. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedProcessingResultsList**
> FeedProcessingResultsList200Response feedProcessingResultsList()

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let feedId: string; //Unique identifier of a feed (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedProcessingResultsList(
    feedId,
    bookmark,
    pageSize,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**FeedProcessingResultsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**404** | Feed not found. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsCreate**
> CatalogsFeed feedsCreate(feedsCreateRequest)

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    FeedsCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let feedsCreateRequest: FeedsCreateRequest; //Request object used to created a feed.
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsCreate(
    feedsCreateRequest,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **feedsCreateRequest** | **FeedsCreateRequest**| Request object used to created a feed. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsFeed**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**201** | Success |  -  |
|**400** | Invalid feed parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**403** | Business account required. |  -  |
|**409** | User website required. |  -  |
|**422** | Unique feed name is required. |  -  |
|**501** | Not implemented (absent \&quot;default_country\&quot; or \&quot;default_locale\&quot;). |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsDelete**
> feedsDelete()

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let feedId: string; //Unique identifier of a feed (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsDelete(
    feedId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**204** | Feed deleted successfully. |  -  |
|**400** | Invalid feed parameters. |  -  |
|**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
|**404** | Data feed not found. |  -  |
|**409** | Conflict. Can\&#39;t delete a feed with active promotions. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsGet**
> CatalogsFeed feedsGet()

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let feedId: string; //Unique identifier of a feed (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsGet(
    feedId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsFeed**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid feed parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**404** | Data feed not found. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsIngest**
> CatalogsFeedIngestion feedsIngest()

Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let feedId: string; //Unique identifier of a feed (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsIngest(
    feedId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsFeedIngestion**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The ingestion process was successfully started. |  -  |
|**400** | Invalid feed parameters. |  -  |
|**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
|**404** | Data feed not found. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsList**
> FeedsList200Response feedsList()

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let catalogId: string; //Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional) (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsList(
    bookmark,
    pageSize,
    catalogId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **catalogId** | [**string**] | Filter entities for a given catalog_id. If not given, all catalogs are considered. | (optional) defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**FeedsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**401** | Unauthorized access. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsUpdate**
> CatalogsFeed feedsUpdate(feedsUpdateRequest)

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    FeedsUpdateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let feedId: string; //Unique identifier of a feed (default to undefined)
let feedsUpdateRequest: FeedsUpdateRequest; //Request object used to update a feed.
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsUpdate(
    feedId,
    feedsUpdateRequest,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **feedsUpdateRequest** | **FeedsUpdateRequest**| Request object used to update a feed. | |
| **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsFeed**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid feed parameters. |  -  |
|**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
|**404** | Data feed not found. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsBatchGet**
> CatalogsItemsBatch itemsBatchGet()

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let batchId: string; //Id of a catalogs items batch to fetch (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.itemsBatchGet(
    batchId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **batchId** | [**string**] | Id of a catalogs items batch to fetch | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsItemsBatch**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Response containing the requested catalogs items batch |  -  |
|**401** | Not authenticated to access catalogs items batch |  -  |
|**403** | Not authorized to access catalogs items batch |  -  |
|**404** | Catalogs items batch not found |  -  |
|**405** | Method Not Allowed. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsBatchPost**
> CatalogsItemsBatch itemsBatchPost(itemsBatchPostRequest)

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager to get assistance.

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    ItemsBatchPostRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let itemsBatchPostRequest: ItemsBatchPostRequest; //Request object used to create catalogs items in a batch
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.itemsBatchPost(
    itemsBatchPostRequest,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **itemsBatchPostRequest** | **ItemsBatchPostRequest**| Request object used to create catalogs items in a batch | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsItemsBatch**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Response containing the requested catalogs items batch |  -  |
|**400** | Invalid request parameters. |  -  |
|**401** | Not authenticated to post catalogs items |  -  |
|**403** | Not authorized to post catalogs items |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsGet**
> CatalogsItems itemsGet()

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: this endpoint is deprecated and will be deleted soon. Please use <a href=\'/docs/api/v5/#operation/items/post\'>Get catalogs items (POST)</a> instead.

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    CatalogsItemsFilters
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let country: string; //Country for the Catalogs Items (default to undefined)
let language: string; //Language for the Catalogs Items (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let itemIds: Array<string>; //This parameter is deprecated. Use filters instead. (optional) (default to undefined)
let filters: CatalogsItemsFilters; //Identifies items to be retrieved. This is a required parameter. (optional) (default to undefined)

const { status, data } = await apiInstance.itemsGet(
    country,
    language,
    adAccountId,
    itemIds,
    filters
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **country** | [**string**] | Country for the Catalogs Items | defaults to undefined|
| **language** | [**string**] | Language for the Catalogs Items | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **itemIds** | **Array&lt;string&gt;** | This parameter is deprecated. Use filters instead. | (optional) defaults to undefined|
| **filters** | **CatalogsItemsFilters** | Identifies items to be retrieved. This is a required parameter. | (optional) defaults to undefined|


### Return type

**CatalogsItems**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Response containing the requested catalogs items |  -  |
|**400** | Invalid request parameters. |  -  |
|**401** | Not authorized to access catalogs items |  -  |
|**403** | Not authorized to access catalogs items |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsIssuesList**
> ItemsIssuesList200Response itemsIssuesList()

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \'item_numbers\' and \'item_validation_issue\' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href=\'/docs/api/v5/#operation/reports/create\'>Build catalogs report</a> and <a href=\'/docs/api/v5/#operation/reports/get\'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let processingResultId: string; //Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let itemNumbers: Array<number>; //Item number based on order of appearance in the Catalogs Feed. For example, \'0\' refers to first item found in a feed that was downloaded from a \'location\' specified during feed creation. (optional) (default to undefined)
let itemValidationIssue: CatalogsItemValidationIssue; //Filter item validation issues that have a given type of item validation issue. (optional) (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.itemsIssuesList(
    processingResultId,
    bookmark,
    pageSize,
    itemNumbers,
    itemValidationIssue,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **processingResultId** | [**string**] | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **itemNumbers** | **Array&lt;number&gt;** | Item number based on order of appearance in the Catalogs Feed. For example, \&#39;0\&#39; refers to first item found in a feed that was downloaded from a \&#39;location\&#39; specified during feed creation. | (optional) defaults to undefined|
| **itemValidationIssue** | **CatalogsItemValidationIssue** | Filter item validation issues that have a given type of item validation issue. | (optional) defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**ItemsIssuesList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**401** | Unauthorized access. |  -  |
|**404** | Processing Result not found. |  -  |
|**501** | Not implemented. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsPost**
> CatalogsItems itemsPost(catalogsItemsRequest)

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    CatalogsItemsRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let catalogsItemsRequest: CatalogsItemsRequest; //Request object used to get catalogs items
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.itemsPost(
    catalogsItemsRequest,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogsItemsRequest** | **CatalogsItemsRequest**| Request object used to get catalogs items | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsItems**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Response containing the requested catalogs items |  -  |
|**400** | Invalid request |  -  |
|**401** | Not authorized to access catalogs items |  -  |
|**403** | Not authorized to access catalogs items |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(catalogsListProductsByFilterRequest)

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    CatalogsListProductsByFilterRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest; //Object holding a group of filters for a catalog product group
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let pinMetrics: boolean; //Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

const { status, data } = await apiInstance.productsByProductGroupFilterList(
    catalogsListProductsByFilterRequest,
    bookmark,
    pageSize,
    adAccountId,
    pinMetrics
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogsListProductsByFilterRequest** | **CatalogsListProductsByFilterRequest**| Object holding a group of filters for a catalog product group | |
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false|


### Return type

**CatalogsProductGroupPinsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**401** | Unauthorized access. |  -  |
|**409** | Conflict. Can\&#39;t get products. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reportsCreate**
> CatalogsCreateReportResponse reportsCreate(catalogsReportParameters)

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    CatalogsReportParameters
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let catalogsReportParameters: CatalogsReportParameters; //Request object to asynchronously create a report.
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.reportsCreate(
    catalogsReportParameters,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogsReportParameters** | **CatalogsReportParameters**| Request object to asynchronously create a report. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsCreateReportResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Response containing the report token |  -  |
|**404** | Entity (e.g., catalog, feed or processing_result) not found |  -  |
|**409** | Can\&#39;t access this feature without an existing catalog. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reportsGet**
> CatalogsReport reportsGet()

This returns a URL to a report given a token returned from <a href=\'/docs/api/v5/#operation/reports/create\'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let token: string; //Token returned from async build report call (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.reportsGet(
    token,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **token** | [**string**] | Token returned from async build report call | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|


### Return type

**CatalogsReport**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Response that contains a link to download the report |  -  |
|**400** | The token you provided is not valid or has expired. |  -  |
|**409** | Can\&#39;t access this feature without an existing catalog. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reportsStats**
> ReportsStats200Response reportsStats()

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```typescript
import {
    CatalogsApi,
    Configuration,
    CatalogsReportParameters
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogsApi(configuration);

let parameters: CatalogsReportParameters; //Contains the parameters for report identification. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)

const { status, data } = await apiInstance.reportsStats(
    parameters,
    adAccountId,
    pageSize,
    bookmark
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **parameters** | **CatalogsReportParameters** | Contains the parameters for report identification. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|


### Return type

**ReportsStats200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Response containing the diagnostics aggregated counters |  -  |
|**401** | Not authorized to access catalogs |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

