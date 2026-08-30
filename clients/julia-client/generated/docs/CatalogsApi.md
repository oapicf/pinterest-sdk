# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_available_filter_values**](CatalogsApi.md#catalogs_available_filter_values) | **GET** /catalogs/available_filter_values | List available filter values
[**catalogs_create**](CatalogsApi.md#catalogs_create) | **POST** /catalogs | Create catalog
[**catalogs_list**](CatalogsApi.md#catalogs_list) | **GET** /catalogs | List catalogs


# **catalogs_available_filter_values**
> `catalogs_available_filter_values`(_api::`CatalogsApi`, `catalog_id`::`String`; `feed_id`=nothing, `country`=nothing, `language`=nothing, `ad_account_id`=nothing, _mediaType=nothing) -> `CatalogsAvailableFilterValues`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_available_filter_values`(_api::`CatalogsApi`, response_stream::`Channel`, `catalog_id`::`String`; `feed_id`=nothing, `country`=nothing, `language`=nothing, `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsAvailableFilterValues` }, `OpenAPI.Clients.ApiResponse`

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogsApi`** | API context | 
**`catalog_id`** | **`String`** | Filter entities for a given catalog_id. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`feed_id`** | **`String`** | Filter entities for a given feed_id. If not given, all feeds are considered. | [default to nothing]
 **`country`** | [**`Country`**](.md) | Country for the Catalogs Items | [default to nothing]
 **`language`** | [**`CatalogsLocale`**](.md) | Language for the Catalogs Items | [default to nothing]
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsAvailableFilterValues`**](CatalogsAvailableFilterValues.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_create**
> `catalogs_create`(_api::`CatalogsApi`, `catalog_create`::`CatalogCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Catalog`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_create`(_api::`CatalogsApi`, response_stream::`Channel`, `catalog_create`::`CatalogCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Catalog` }, `OpenAPI.Clients.ApiResponse`

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogsApi`** | API context | 
**`catalog_create`** | [**`CatalogCreate`**](CatalogCreate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Catalog`**](Catalog.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_list**
> `catalogs_list`(_api::`CatalogsApi`; `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `CatalogsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_list`(_api::`CatalogsApi`, response_stream::`Channel`; `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsList200Response` }, `OpenAPI.Clients.ApiResponse`

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`CatalogsList200Response`**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

