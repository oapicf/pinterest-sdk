# CatalogFeedsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogFeedsAPI_feedProcessingResultsList**](CatalogFeedsAPI.md#CatalogFeedsAPI_feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**CatalogFeedsAPI_feedsCreate**](CatalogFeedsAPI.md#CatalogFeedsAPI_feedsCreate) | **POST** /catalogs/feeds | Create feed
[**CatalogFeedsAPI_feedsDelete**](CatalogFeedsAPI.md#CatalogFeedsAPI_feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**CatalogFeedsAPI_feedsGet**](CatalogFeedsAPI.md#CatalogFeedsAPI_feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**CatalogFeedsAPI_feedsIngest**](CatalogFeedsAPI.md#CatalogFeedsAPI_feedsIngest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**CatalogFeedsAPI_feedsList**](CatalogFeedsAPI.md#CatalogFeedsAPI_feedsList) | **GET** /catalogs/feeds | List feeds
[**CatalogFeedsAPI_feedsUpdate**](CatalogFeedsAPI.md#CatalogFeedsAPI_feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**CatalogFeedsAPI_itemsIssuesList**](CatalogFeedsAPI.md#CatalogFeedsAPI_itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues


# **CatalogFeedsAPI_feedProcessingResultsList**
```c
// List feed processing results
//
// Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
feed_processing_results_list_200_response_t* CatalogFeedsAPI_feedProcessingResultsList(apiClient_t *apiClient, char *feed_id, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feed_id** | **char \*** | Unique identifier of a feed. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[feed_processing_results_list_200_response_t](feed_processing_results_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogFeedsAPI_feedsCreate**
```c
// Create feed
//
// Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_feed_t* CatalogFeedsAPI_feedsCreate(apiClient_t *apiClient, catalogs_feed_create_request_schema_t *catalogs_feed_create_request_schema, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalogs_feed_create_request_schema** | **[catalogs_feed_create_request_schema_t](catalogs_feed_create_request_schema.md) \*** |  | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_feed_t](catalogs_feed.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogFeedsAPI_feedsDelete**
```c
// Delete feed
//
// Delete a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
//
catalogs_feed_t* CatalogFeedsAPI_feedsDelete(apiClient_t *apiClient, char *feed_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feed_id** | **char \*** | Unique identifier of a feed. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_feed_t](catalogs_feed.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogFeedsAPI_feedsGet**
```c
// Get feed
//
// Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
//
catalogs_feed_t* CatalogFeedsAPI_feedsGet(apiClient_t *apiClient, char *feed_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feed_id** | **char \*** | Unique identifier of a feed. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_feed_t](catalogs_feed.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogFeedsAPI_feedsIngest**
```c
// Ingest feed items
//
// Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_feed_ingestion_t* CatalogFeedsAPI_feedsIngest(apiClient_t *apiClient, char *feed_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feed_id** | **char \*** | Unique identifier of a feed. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_feed_ingestion_t](catalogs_feed_ingestion.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogFeedsAPI_feedsList**
```c
// List feeds
//
// Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
//
feeds_list_200_response_t* CatalogFeedsAPI_feedsList(apiClient_t *apiClient, char *catalog_id, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalog_id** | **char \*** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[feeds_list_200_response_t](feeds_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogFeedsAPI_feedsUpdate**
```c
// Update feed
//
// Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_feed_t* CatalogFeedsAPI_feedsUpdate(apiClient_t *apiClient, char *feed_id, catalogs_feed_update_request_schema_t *catalogs_feed_update_request_schema, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feed_id** | **char \*** | Unique identifier of a feed. | 
**catalogs_feed_update_request_schema** | **[catalogs_feed_update_request_schema_t](catalogs_feed_update_request_schema.md) \*** |  | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_feed_t](catalogs_feed.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogFeedsAPI_itemsIssuesList**
```c
// List item issues
//
// List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)
//
items_issues_list_200_response_t* CatalogFeedsAPI_itemsIssuesList(apiClient_t *apiClient, char *processing_result_id, list_t *item_numbers, catalogs_item_validation_issue_e item_validation_issue, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**processing_result_id** | **char \*** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). | 
**item_numbers** | **[list_t](int.md) \*** | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] 
**item_validation_issue** | **catalogs_item_validation_issue_e** | Filter item validation issues that have a given type of item validation issue. | [optional] 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[items_issues_list_200_response_t](items_issues_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

