# CatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**catalogsProductGroupPinsList**](#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group|
|[**catalogsProductGroupsCreate**](#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group|
|[**catalogsProductGroupsCreateMany**](#catalogsproductgroupscreatemany) | **POST** /catalogs/product_groups/multiple | Create product groups|
|[**catalogsProductGroupsDelete**](#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group|
|[**catalogsProductGroupsDeleteMany**](#catalogsproductgroupsdeletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups|
|[**catalogsProductGroupsGet**](#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group|
|[**catalogsProductGroupsList**](#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups|
|[**catalogsProductGroupsProductCountsGet**](#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts|
|[**catalogsProductGroupsUpdate**](#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group|
|[**productsByProductGroupFilterList**](#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter|

# **catalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList()

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```typescript
import {
    CatalogProductGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogProductGroupsApi(configuration);

let productGroupId: string; //Unique identifier of a product group (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let pinMetrics: boolean; //Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.catalogsProductGroupPinsList(
    productGroupId,
    adAccountId,
    pinMetrics,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **productGroupId** | [**string**] | Unique identifier of a product group | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**CatalogsProductGroupPinsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsCreate**
> CatalogsVerticalProductGroup catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema)

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogProductGroupsApi,
    Configuration,
    CatalogsProductGroupsCreateRequestSchema
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogProductGroupsApi(configuration);

let catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema; //
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsCreate(
    catalogsProductGroupsCreateRequestSchema,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogsProductGroupsCreateRequestSchema** | **CatalogsProductGroupsCreateRequestSchema**|  | |
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
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsCreateMany**
> Array<string> catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems)

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogProductGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogProductGroupsApi(configuration);

let catalogsProductGroupsCreateManyRequestItems: Array<CatalogsProductGroupsCreateManyRequestItems>; //
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsCreateMany(
    catalogsProductGroupsCreateManyRequestItems,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogsProductGroupsCreateManyRequestItems** | **Array<CatalogsProductGroupsCreateManyRequestItems>**|  | |
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
|**201** | The request has succeeded and a new resource has been created as a result. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsDelete**
> CatalogsVerticalProductGroup catalogsProductGroupsDelete()

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```typescript
import {
    CatalogProductGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogProductGroupsApi(configuration);

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

**CatalogsVerticalProductGroup**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**204** | Resource deleted successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsDeleteMany**
> catalogsProductGroupsDeleteMany()

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```typescript
import {
    CatalogProductGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogProductGroupsApi(configuration);

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
|**204** | Resource deleted successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsGet**
> CatalogsVerticalProductGroup catalogsProductGroupsGet()

Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```typescript
import {
    CatalogProductGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogProductGroupsApi(configuration);

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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsList**
> CatalogsProductGroupsList200Response catalogsProductGroupsList()

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```typescript
import {
    CatalogProductGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogProductGroupsApi(configuration);

let id: Array<number>; //Comma-separated list of product group ids (optional) (default to undefined)
let feedId: string; //Filter entities for a given feed_id. If not given, all feeds are considered. (optional) (default to undefined)
let catalogId: string; //Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional) (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.catalogsProductGroupsList(
    id,
    feedId,
    catalogId,
    adAccountId,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | **Array&lt;number&gt;** | Comma-separated list of product group ids | (optional) defaults to undefined|
| **feedId** | [**string**] | Filter entities for a given feed_id. If not given, all feeds are considered. | (optional) defaults to undefined|
| **catalogId** | [**string**] | Filter entities for a given catalog_id. If not given, all catalogs are considered. | (optional) defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCountsVertical catalogsProductGroupsProductCountsGet()

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```typescript
import {
    CatalogProductGroupsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogProductGroupsApi(configuration);

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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsUpdate**
> CatalogsVerticalProductGroup catalogsProductGroupsUpdate(catalogsProductGroupsUpdateRequestSchema)

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogProductGroupsApi,
    Configuration,
    CatalogsProductGroupsUpdateRequestSchema
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogProductGroupsApi(configuration);

let productGroupId: string; //Unique identifier of a product group (default to undefined)
let catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema; //
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.catalogsProductGroupsUpdate(
    productGroupId,
    catalogsProductGroupsUpdateRequestSchema,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogsProductGroupsUpdateRequestSchema** | **CatalogsProductGroupsUpdateRequestSchema**|  | |
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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(catalogsListProductsByFilterRequest)

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```typescript
import {
    CatalogProductGroupsApi,
    Configuration,
    CatalogsListProductsByFilterRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogProductGroupsApi(configuration);

let catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest; //
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let pinMetrics: boolean; //Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

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
| **catalogsListProductsByFilterRequest** | **CatalogsListProductsByFilterRequest**|  | |
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false|


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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

