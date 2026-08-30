# \CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_slash_available_filter_values**](CatalogsApi.md#catalogs_slash_available_filter_values) | **GET** /catalogs/available_filter_values | List available filter values
[**catalogs_slash_create**](CatalogsApi.md#catalogs_slash_create) | **POST** /catalogs | Create catalog
[**catalogs_slash_list**](CatalogsApi.md#catalogs_slash_list) | **GET** /catalogs | List catalogs



## catalogs_slash_available_filter_values

> models::CatalogsAvailableFilterValues catalogs_slash_available_filter_values(catalog_id, feed_id, country, language, ad_account_id)
List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**catalog_id** | **String** | Filter entities for a given catalog_id. | [required] |
**feed_id** | Option<**String**> | Filter entities for a given feed_id. If not given, all feeds are considered. |  |
**country** | Option<[**Country**](Country.md)> | Country for the Catalogs Items |  |
**language** | Option<[**CatalogsLocale**](CatalogsLocale.md)> | Language for the Catalogs Items |  |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::CatalogsAvailableFilterValues**](CatalogsAvailableFilterValues.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## catalogs_slash_create

> models::Catalog catalogs_slash_create(catalog_create, ad_account_id)
Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**catalog_create** | [**CatalogCreate**](CatalogCreate.md) |  | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::Catalog**](Catalog.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## catalogs_slash_list

> models::CatalogsList200Response catalogs_slash_list(ad_account_id, bookmark, page_size)
List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]

### Return type

[**models::CatalogsList200Response**](catalogs_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

