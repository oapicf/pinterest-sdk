# CatalogFeedsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**feedProcessingResultsList**](#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results|
|[**feedsCreate**](#feedscreate) | **POST** /catalogs/feeds | Create feed|
|[**feedsDelete**](#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed|
|[**feedsGet**](#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed|
|[**feedsIngest**](#feedsingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items|
|[**feedsList**](#feedslist) | **GET** /catalogs/feeds | List feeds|
|[**feedsUpdate**](#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed|
|[**itemsIssuesList**](#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues|

# **feedProcessingResultsList**
> FeedProcessingResultsList200Response feedProcessingResultsList()

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```typescript
import {
    CatalogFeedsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogFeedsApi(configuration);

let feedId: string; //Unique identifier of a feed. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.feedProcessingResultsList(
    feedId,
    adAccountId,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **feedId** | [**string**] | Unique identifier of a feed. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsCreate**
> CatalogsFeed feedsCreate(catalogsFeedCreateRequestSchema)

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogFeedsApi,
    Configuration,
    CatalogsFeedCreateRequestSchema
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogFeedsApi(configuration);

let catalogsFeedCreateRequestSchema: CatalogsFeedCreateRequestSchema; //
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsCreate(
    catalogsFeedCreateRequestSchema,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogsFeedCreateRequestSchema** | **CatalogsFeedCreateRequestSchema**|  | |
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
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsDelete**
> CatalogsFeed feedsDelete()

Delete a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Example

```typescript
import {
    CatalogFeedsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogFeedsApi(configuration);

let feedId: string; //Unique identifier of a feed. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsDelete(
    feedId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **feedId** | [**string**] | Unique identifier of a feed. | defaults to undefined|
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
|**200** | The request has succeeded. |  -  |
|**204** | Resource deleted successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsGet**
> CatalogsFeed feedsGet()

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Example

```typescript
import {
    CatalogFeedsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogFeedsApi(configuration);

let feedId: string; //Unique identifier of a feed. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsGet(
    feedId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **feedId** | [**string**] | Unique identifier of a feed. | defaults to undefined|
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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsIngest**
> CatalogsFeedIngestion feedsIngest()

Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogFeedsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogFeedsApi(configuration);

let feedId: string; //Unique identifier of a feed. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsIngest(
    feedId,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **feedId** | [**string**] | Unique identifier of a feed. | defaults to undefined|
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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsList**
> FeedsList200Response feedsList()

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Example

```typescript
import {
    CatalogFeedsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogFeedsApi(configuration);

let catalogId: string; //Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional) (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.feedsList(
    catalogId,
    adAccountId,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogId** | [**string**] | Filter entities for a given catalog_id. If not given, all catalogs are considered. | (optional) defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsUpdate**
> CatalogsFeed feedsUpdate(catalogsFeedUpdateRequestSchema)

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```typescript
import {
    CatalogFeedsApi,
    Configuration,
    CatalogsFeedUpdateRequestSchema
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogFeedsApi(configuration);

let feedId: string; //Unique identifier of a feed. (default to undefined)
let catalogsFeedUpdateRequestSchema: CatalogsFeedUpdateRequestSchema; //
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)

const { status, data } = await apiInstance.feedsUpdate(
    feedId,
    catalogsFeedUpdateRequestSchema,
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **catalogsFeedUpdateRequestSchema** | **CatalogsFeedUpdateRequestSchema**|  | |
| **feedId** | [**string**] | Unique identifier of a feed. | defaults to undefined|
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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsIssuesList**
> ItemsIssuesList200Response itemsIssuesList()

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \'item_numbers\' and \'item_validation_issue\' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```typescript
import {
    CatalogFeedsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CatalogFeedsApi(configuration);

let processingResultId: string; //Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). (default to undefined)
let itemNumbers: Array<number>; //Item number based on order of appearance in the Catalogs Feed. For example, \'0\' refers to first item found in a feed that was downloaded from a \'location\' specified during feed creation. (optional) (default to undefined)
let itemValidationIssue: CatalogsItemValidationIssue; //Filter item validation issues that have a given type of item validation issue. (optional) (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.itemsIssuesList(
    processingResultId,
    itemNumbers,
    itemValidationIssue,
    adAccountId,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **processingResultId** | [**string**] | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). | defaults to undefined|
| **itemNumbers** | **Array&lt;number&gt;** | Item number based on order of appearance in the Catalogs Feed. For example, \&#39;0\&#39; refers to first item found in a feed that was downloaded from a \&#39;location\&#39; specified during feed creation. | (optional) defaults to undefined|
| **itemValidationIssue** | **CatalogsItemValidationIssue** | Filter item validation issues that have a given type of item validation issue. | (optional) defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

