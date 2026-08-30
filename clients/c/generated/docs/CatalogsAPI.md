# CatalogsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsAPI_catalogsAvailableFilterValues**](CatalogsAPI.md#CatalogsAPI_catalogsAvailableFilterValues) | **GET** /catalogs/available_filter_values | List available filter values
[**CatalogsAPI_catalogsCreate**](CatalogsAPI.md#CatalogsAPI_catalogsCreate) | **POST** /catalogs | Create catalog
[**CatalogsAPI_catalogsList**](CatalogsAPI.md#CatalogsAPI_catalogsList) | **GET** /catalogs | List catalogs


# **CatalogsAPI_catalogsAvailableFilterValues**
```c
// List available filter values
//
// Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
catalogs_available_filter_values_t* CatalogsAPI_catalogsAvailableFilterValues(apiClient_t *apiClient, char *catalog_id, char *feed_id, country_e country, catalogs_locale_e language, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalog_id** | **char \*** | Filter entities for a given catalog_id. | 
**feed_id** | **char \*** | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
**country** | **country_e** | Country for the Catalogs Items | [optional] 
**language** | **catalogs_locale_e** | Language for the Catalogs Items | [optional] 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_available_filter_values_t](catalogs_available_filter_values.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_catalogsCreate**
```c
// Create catalog
//
// Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalog_t* CatalogsAPI_catalogsCreate(apiClient_t *apiClient, catalog_create_t *catalog_create, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalog_create** | **[catalog_create_t](catalog_create.md) \*** |  | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalog_t](catalog.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_catalogsList**
```c
// List catalogs
//
// Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
//
catalogs_list_200_response_t* CatalogsAPI_catalogsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[catalogs_list_200_response_t](catalogs_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

