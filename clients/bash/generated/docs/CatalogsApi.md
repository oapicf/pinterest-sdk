# CatalogsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsAvailableFilterValues**](CatalogsApi.md#catalogsAvailableFilterValues) | **GET** /catalogs/available_filter_values | List available filter values
[**catalogsCreate**](CatalogsApi.md#catalogsCreate) | **POST** /catalogs | Create catalog
[**catalogsList**](CatalogsApi.md#catalogsList) | **GET** /catalogs | List catalogs



## catalogsAvailableFilterValues

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.
- 'country', 'language', and 'feed_id' are only used in retail catalogs.
- Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.

Optional: Business Access: Specify an 'ad_account_id' (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

```bash
 catalogsAvailableFilterValues  catalog_id=value  feed_id=value  country=value  language=value  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **string** | Filter entities for a given catalog_id. | [default to null]
 **feedId** | **string** | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] [default to null]
 **country** | [**Country**](.md) | Country for the Catalogs Items | [optional] [default to null]
 **language** | [**CatalogsLocale**](.md) | Language for the Catalogs Items | [optional] [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsAvailableFilterValues**](CatalogsAvailableFilterValues.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## catalogsCreate

Create catalog

Create a new catalog owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```bash
 catalogsCreate  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogCreate** | [**CatalogCreate**](CatalogCreate.md) |  |
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Catalog**](Catalog.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## catalogsList

List catalogs

Fetch catalogs owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

```bash
 catalogsList  ad_account_id=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

