# .CatalogFeedsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**feedProcessingResultsList**](CatalogFeedsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**feedsCreate**](CatalogFeedsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](CatalogFeedsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](CatalogFeedsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsIngest**](CatalogFeedsApi.md#feedsIngest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**feedsList**](CatalogFeedsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](CatalogFeedsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsIssuesList**](CatalogFeedsApi.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues


# **feedProcessingResultsList**
> FeedProcessingResultsList200Response feedProcessingResultsList()

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example


```typescript
import { createConfiguration, CatalogFeedsApi } from '';
import type { CatalogFeedsApiFeedProcessingResultsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogFeedsApi(configuration);

const request: CatalogFeedsApiFeedProcessingResultsListRequest = {
    // Unique identifier of a feed
  feedId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.feedProcessingResultsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
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

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example


```typescript
import { createConfiguration, CatalogFeedsApi } from '';
import type { CatalogFeedsApiFeedsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogFeedsApi(configuration);

const request: CatalogFeedsApiFeedsCreateRequest = {
    // Request object used to created a feed.
  feedsCreateRequest: null,
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.feedsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedsCreateRequest** | **FeedsCreateRequest**| Request object used to created a feed. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsFeed**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

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

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.

### Example


```typescript
import { createConfiguration, CatalogFeedsApi } from '';
import type { CatalogFeedsApiFeedsDeleteRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogFeedsApi(configuration);

const request: CatalogFeedsApiFeedsDeleteRequest = {
    // Unique identifier of a feed
  feedId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.feedsDelete(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**void**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

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

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.

### Example


```typescript
import { createConfiguration, CatalogFeedsApi } from '';
import type { CatalogFeedsApiFeedsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogFeedsApi(configuration);

const request: CatalogFeedsApiFeedsGetRequest = {
    // Unique identifier of a feed
  feedId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.feedsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsFeed**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

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

# **feedsIngest**
> CatalogsFeedIngestion feedsIngest()

Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example


```typescript
import { createConfiguration, CatalogFeedsApi } from '';
import type { CatalogFeedsApiFeedsIngestRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogFeedsApi(configuration);

const request: CatalogFeedsApiFeedsIngestRequest = {
    // Unique identifier of a feed
  feedId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.feedsIngest(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | [**string**] | Unique identifier of a feed | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**CatalogsFeedIngestion**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The ingestion process was successfully started. |  -  |
**400** | Invalid feed parameters. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**404** | Data feed not found. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **feedsList**
> FeedsList200Response feedsList()

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.

### Example


```typescript
import { createConfiguration, CatalogFeedsApi } from '';
import type { CatalogFeedsApiFeedsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogFeedsApi(configuration);

const request: CatalogFeedsApiFeedsListRequest = {
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
  catalogId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.feedsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **catalogId** | [**string**] | Filter entities for a given catalog_id. If not given, all catalogs are considered. | (optional) defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**FeedsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

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

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href=\'https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href=\'/docs/api-features/shopping-overview/\'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example


```typescript
import { createConfiguration, CatalogFeedsApi } from '';
import type { CatalogFeedsApiFeedsUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogFeedsApi(configuration);

const request: CatalogFeedsApiFeedsUpdateRequest = {
    // Unique identifier of a feed
  feedId: "4",
    // Request object used to update a feed.
  feedsUpdateRequest: null,
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.feedsUpdate(request);
console.log('API called successfully. Returned data:', data);
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

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

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

# **itemsIssuesList**
> ItemsIssuesList200Response itemsIssuesList()

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters \'item_numbers\' and \'item_validation_issue\' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href=\'/docs/api/v5/#operation/reports/create\'>Build catalogs report</a> and <a href=\'/docs/api/v5/#operation/reports/get\'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href=\'/docs/api-features/shopping-overview/\'>Learn more</a>

### Example


```typescript
import { createConfiguration, CatalogFeedsApi } from '';
import type { CatalogFeedsApiItemsIssuesListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CatalogFeedsApi(configuration);

const request: CatalogFeedsApiItemsIssuesListRequest = {
    // Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
  processingResultId: "5224831246441439241",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Item number based on order of appearance in the Catalogs Feed. For example, \'0\' refers to first item found in a feed that was downloaded from a \'location\' specified during feed creation. (optional)
  itemNumbers: [1,5],
    // Filter item validation issues that have a given type of item validation issue. (optional)
  itemValidationIssue: "TITLE_MISSING",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.itemsIssuesList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processingResultId** | [**string**] | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
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


