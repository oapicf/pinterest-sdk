# .CatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupPinsList**](CatalogProductGroupsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogsProductGroupsCreate**](CatalogProductGroupsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsCreateMany**](CatalogProductGroupsApi.md#catalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**catalogsProductGroupsDelete**](CatalogProductGroupsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsDeleteMany**](CatalogProductGroupsApi.md#catalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**catalogsProductGroupsGet**](CatalogProductGroupsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](CatalogProductGroupsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](CatalogProductGroupsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogsProductGroupsUpdate**](CatalogProductGroupsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**productsByProductGroupFilterList**](CatalogProductGroupsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter


# **catalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList()

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example


```typescript
import { createConfiguration, CatalogProductGroupsApi } from '';
import type { CatalogProductGroupsApiCatalogsProductGroupPinsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogProductGroupsApi(configuration);

const request: CatalogProductGroupsApiCatalogsProductGroupPinsListRequest = {
    // Unique identifier of a product group
  productGroupId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
  pinMetrics: false,
};

const data = await apiInstance.catalogsProductGroupPinsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false


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
> CatalogsVerticalProductGroup catalogsProductGroupsCreate(multipleProductGroupsInner)

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example


```typescript
import { createConfiguration, CatalogProductGroupsApi } from '';
import type { CatalogProductGroupsApiCatalogsProductGroupsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogProductGroupsApi(configuration);

const request: CatalogProductGroupsApiCatalogsProductGroupsCreateRequest = {
    // Request object used to create a single catalogs product groups.
  multipleProductGroupsInner: null,
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.catalogsProductGroupsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **multipleProductGroupsInner** | **MultipleProductGroupsInner**| Request object used to create a single catalogs product groups. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsVerticalProductGroup**

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

# **catalogsProductGroupsCreateMany**
> Array<string> catalogsProductGroupsCreateMany(multipleProductGroupsInner)

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example


```typescript
import { createConfiguration, CatalogProductGroupsApi } from '';
import type { CatalogProductGroupsApiCatalogsProductGroupsCreateManyRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogProductGroupsApi(configuration);

const request: CatalogProductGroupsApiCatalogsProductGroupsCreateManyRequest = {
    // Request object used to create one or more catalogs product groups.
  multipleProductGroupsInner: [
    null,
  ],
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.catalogsProductGroupsCreateMany(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **multipleProductGroupsInner** | **Array<MultipleProductGroupsInner>**| Request object used to create one or more catalogs product groups. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**Array<string>**

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

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example


```typescript
import { createConfiguration, CatalogProductGroupsApi } from '';
import type { CatalogProductGroupsApiCatalogsProductGroupsDeleteRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogProductGroupsApi(configuration);

const request: CatalogProductGroupsApiCatalogsProductGroupsDeleteRequest = {
    // Unique identifier of a product group
  productGroupId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.catalogsProductGroupsDelete(request);
console.log('API called successfully. Returned data:', data);
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

# **catalogsProductGroupsDeleteMany**
> void catalogsProductGroupsDeleteMany()

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example


```typescript
import { createConfiguration, CatalogProductGroupsApi } from '';
import type { CatalogProductGroupsApiCatalogsProductGroupsDeleteManyRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogProductGroupsApi(configuration);

const request: CatalogProductGroupsApiCatalogsProductGroupsDeleteManyRequest = {
    // Comma-separated list of product group ids
  id: [
    1,
  ],
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.catalogsProductGroupsDeleteMany(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Array&lt;number&gt;** | Comma-separated list of product group ids | defaults to undefined
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
**204** | Catalogs Product Groups deleted successfully. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
**404** | Catalogs product group not found. |  -  |
**409** | Conflict. Can\&#39;t delete this catalogs product group. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **catalogsProductGroupsGet**
> CatalogsVerticalProductGroup catalogsProductGroupsGet()

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example


```typescript
import { createConfiguration, CatalogProductGroupsApi } from '';
import type { CatalogProductGroupsApiCatalogsProductGroupsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogProductGroupsApi(configuration);

const request: CatalogProductGroupsApiCatalogsProductGroupsGetRequest = {
    // Unique identifier of a product group
  productGroupId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.catalogsProductGroupsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsVerticalProductGroup**

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

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example


```typescript
import { createConfiguration, CatalogProductGroupsApi } from '';
import type { CatalogProductGroupsApiCatalogsProductGroupsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogProductGroupsApi(configuration);

const request: CatalogProductGroupsApiCatalogsProductGroupsListRequest = {
    // Comma-separated list of product group ids (optional)
  id: [
    1,
  ],
    // Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
  feedId: "4",
    // Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
  catalogId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.catalogsProductGroupsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Array&lt;number&gt;** | Comma-separated list of product group ids | (optional) defaults to undefined
 **feedId** | [**string**] | Filter entities for a given feed_id. If not given, all feeds are considered. | (optional) defaults to undefined
 **catalogId** | [**string**] | Filter entities for a given catalog_id. If not given, all catalogs are considered. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
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
> CatalogsProductGroupProductCountsVertical catalogsProductGroupsProductCountsGet()

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example


```typescript
import { createConfiguration, CatalogProductGroupsApi } from '';
import type { CatalogProductGroupsApiCatalogsProductGroupsProductCountsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogProductGroupsApi(configuration);

const request: CatalogProductGroupsApiCatalogsProductGroupsProductCountsGetRequest = {
    // Unique identifier of a product group
  productGroupId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.catalogsProductGroupsProductCountsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsProductGroupProductCountsVertical**

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
> CatalogsVerticalProductGroup catalogsProductGroupsUpdate(catalogsProductGroupsUpdateRequest)

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example


```typescript
import { createConfiguration, CatalogProductGroupsApi } from '';
import type { CatalogProductGroupsApiCatalogsProductGroupsUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogProductGroupsApi(configuration);

const request: CatalogProductGroupsApiCatalogsProductGroupsUpdateRequest = {
    // Unique identifier of a product group
  productGroupId: "4",
    // Request object used to Update a catalogs product group.
  catalogsProductGroupsUpdateRequest: null,
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.catalogsProductGroupsUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsUpdateRequest** | **CatalogsProductGroupsUpdateRequest**| Request object used to Update a catalogs product group. |
 **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsVerticalProductGroup**

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

# **productsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(catalogsListProductsByFilterRequest)

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example


```typescript
import { createConfiguration, CatalogProductGroupsApi } from '';
import type { CatalogProductGroupsApiProductsByProductGroupFilterListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogProductGroupsApi(configuration);

const request: CatalogProductGroupsApiProductsByProductGroupFilterListRequest = {
    // Object holding a group of filters for a catalog product group
  catalogsListProductsByFilterRequest: {
    feedId: "2680059592705",
    filters: ,
  },
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
  pinMetrics: false,
};

const data = await apiInstance.productsByProductGroupFilterList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | **CatalogsListProductsByFilterRequest**| Object holding a group of filters for a catalog product group |
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false


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


