# CatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_product_group_pins_list**](CatalogProductGroupsApi.md#catalogs_product_group_pins_list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogs_product_groups_create**](CatalogProductGroupsApi.md#catalogs_product_groups_create) | **POST** /catalogs/product_groups | Create product group
[**catalogs_product_groups_create_many**](CatalogProductGroupsApi.md#catalogs_product_groups_create_many) | **POST** /catalogs/product_groups/multiple | Create product groups
[**catalogs_product_groups_delete**](CatalogProductGroupsApi.md#catalogs_product_groups_delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogs_product_groups_delete_many**](CatalogProductGroupsApi.md#catalogs_product_groups_delete_many) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**catalogs_product_groups_get**](CatalogProductGroupsApi.md#catalogs_product_groups_get) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogs_product_groups_list**](CatalogProductGroupsApi.md#catalogs_product_groups_list) | **GET** /catalogs/product_groups | List product groups
[**catalogs_product_groups_product_counts_get**](CatalogProductGroupsApi.md#catalogs_product_groups_product_counts_get) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogs_product_groups_update**](CatalogProductGroupsApi.md#catalogs_product_groups_update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**products_by_product_group_filter_list**](CatalogProductGroupsApi.md#products_by_product_group_filter_list) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter


# **catalogs_product_group_pins_list**
> `catalogs_product_group_pins_list`(_api::`CatalogProductGroupsApi`, `product_group_id`::`String`; `ad_account_id`=nothing, `pin_metrics`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `CatalogsProductGroupPinsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_product_group_pins_list`(_api::`CatalogProductGroupsApi`, response_stream::`Channel`, `product_group_id`::`String`; `ad_account_id`=nothing, `pin_metrics`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsProductGroupPinsList200Response` }, `OpenAPI.Clients.ApiResponse`

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogProductGroupsApi`** | API context | 
**`product_group_id`** | **`String`** | Unique identifier of a product group |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`pin_metrics`** | **`Bool`** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`CatalogsProductGroupPinsList200Response`**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_product_groups_create**
> `catalogs_product_groups_create`(_api::`CatalogProductGroupsApi`, `catalogs_product_groups_create_request_schema`::`CatalogsProductGroupsCreateRequestSchema`; `ad_account_id`=nothing, _mediaType=nothing) -> `CatalogsVerticalProductGroup`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_product_groups_create`(_api::`CatalogProductGroupsApi`, response_stream::`Channel`, `catalogs_product_groups_create_request_schema`::`CatalogsProductGroupsCreateRequestSchema`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsVerticalProductGroup` }, `OpenAPI.Clients.ApiResponse`

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogProductGroupsApi`** | API context | 
**`catalogs_product_groups_create_request_schema`** | [**`CatalogsProductGroupsCreateRequestSchema`**](CatalogsProductGroupsCreateRequestSchema.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsVerticalProductGroup`**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_product_groups_create_many**
> `catalogs_product_groups_create_many`(_api::`CatalogProductGroupsApi`, `catalogs_product_groups_create_many_request_items`::`Vector{CatalogsProductGroupsCreateManyRequestItems}`; `ad_account_id`=nothing, _mediaType=nothing) -> `Vector{String}`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_product_groups_create_many`(_api::`CatalogProductGroupsApi`, response_stream::`Channel`, `catalogs_product_groups_create_many_request_items`::`Vector{CatalogsProductGroupsCreateManyRequestItems}`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Vector{String}` }, `OpenAPI.Clients.ApiResponse`

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogProductGroupsApi`** | API context | 
**`catalogs_product_groups_create_many_request_items`** | [**`Vector{CatalogsProductGroupsCreateManyRequestItems}`**](CatalogsProductGroupsCreateManyRequestItems.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

**`Vector{String}`**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_product_groups_delete**
> `catalogs_product_groups_delete`(_api::`CatalogProductGroupsApi`, `product_group_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `CatalogsVerticalProductGroup`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_product_groups_delete`(_api::`CatalogProductGroupsApi`, response_stream::`Channel`, `product_group_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsVerticalProductGroup` }, `OpenAPI.Clients.ApiResponse`

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogProductGroupsApi`** | API context | 
**`product_group_id`** | **`String`** | Unique identifier of a product group |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsVerticalProductGroup`**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_product_groups_delete_many**
> `catalogs_product_groups_delete_many`(_api::`CatalogProductGroupsApi`, `id`::`Vector{Int64}`; `ad_account_id`=nothing, _mediaType=nothing) -> `Nothing`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_product_groups_delete_many`(_api::`CatalogProductGroupsApi`, response_stream::`Channel`, `id`::`Vector{Int64}`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Nothing` }, `OpenAPI.Clients.ApiResponse`

Delete product groups

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogProductGroupsApi`** | API context | 
**`id`** | [**`Vector{Int64}`**](Int64.md) | Comma-separated list of product group ids |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

`Nothing`

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_product_groups_get**
> `catalogs_product_groups_get`(_api::`CatalogProductGroupsApi`, `product_group_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `CatalogsVerticalProductGroup`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_product_groups_get`(_api::`CatalogProductGroupsApi`, response_stream::`Channel`, `product_group_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsVerticalProductGroup` }, `OpenAPI.Clients.ApiResponse`

Get product group

Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogProductGroupsApi`** | API context | 
**`product_group_id`** | **`String`** | Unique identifier of a product group |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsVerticalProductGroup`**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_product_groups_list**
> `catalogs_product_groups_list`(_api::`CatalogProductGroupsApi`; `id`=nothing, `feed_id`=nothing, `catalog_id`=nothing, `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `CatalogsProductGroupsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_product_groups_list`(_api::`CatalogProductGroupsApi`, response_stream::`Channel`; `id`=nothing, `feed_id`=nothing, `catalog_id`=nothing, `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsProductGroupsList200Response` }, `OpenAPI.Clients.ApiResponse`

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogProductGroupsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`id`** | [**`Vector{Int64}`**](Int64.md) | Comma-separated list of product group ids | [default to nothing]
 **`feed_id`** | **`String`** | Filter entities for a given feed_id. If not given, all feeds are considered. | [default to nothing]
 **`catalog_id`** | **`String`** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [default to nothing]
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`CatalogsProductGroupsList200Response`**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_product_groups_product_counts_get**
> `catalogs_product_groups_product_counts_get`(_api::`CatalogProductGroupsApi`, `product_group_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `CatalogsProductGroupProductCountsVertical`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_product_groups_product_counts_get`(_api::`CatalogProductGroupsApi`, response_stream::`Channel`, `product_group_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsProductGroupProductCountsVertical` }, `OpenAPI.Clients.ApiResponse`

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogProductGroupsApi`** | API context | 
**`product_group_id`** | **`String`** | Unique identifier of a product group |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsProductGroupProductCountsVertical`**](CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **catalogs_product_groups_update**
> `catalogs_product_groups_update`(_api::`CatalogProductGroupsApi`, `product_group_id`::`String`, `catalogs_product_groups_update_request_schema`::`CatalogsProductGroupsUpdateRequestSchema`; `ad_account_id`=nothing, _mediaType=nothing) -> `CatalogsVerticalProductGroup`, `OpenAPI.Clients.ApiResponse` <br/>
> `catalogs_product_groups_update`(_api::`CatalogProductGroupsApi`, response_stream::`Channel`, `product_group_id`::`String`, `catalogs_product_groups_update_request_schema`::`CatalogsProductGroupsUpdateRequestSchema`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsVerticalProductGroup` }, `OpenAPI.Clients.ApiResponse`

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogProductGroupsApi`** | API context | 
**`product_group_id`** | **`String`** | Unique identifier of a product group |
**`catalogs_product_groups_update_request_schema`** | [**`CatalogsProductGroupsUpdateRequestSchema`**](CatalogsProductGroupsUpdateRequestSchema.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsVerticalProductGroup`**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **products_by_product_group_filter_list**
> `products_by_product_group_filter_list`(_api::`CatalogProductGroupsApi`, `catalogs_list_products_by_filter_request`::`CatalogsListProductsByFilterRequest`; `bookmark`=nothing, `page_size`=nothing, `ad_account_id`=nothing, `pin_metrics`=nothing, _mediaType=nothing) -> `CatalogsProductGroupPinsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `products_by_product_group_filter_list`(_api::`CatalogProductGroupsApi`, response_stream::`Channel`, `catalogs_list_products_by_filter_request`::`CatalogsListProductsByFilterRequest`; `bookmark`=nothing, `page_size`=nothing, `ad_account_id`=nothing, `pin_metrics`=nothing, _mediaType=nothing) -> `Channel`{ `CatalogsProductGroupPinsList200Response` }, `OpenAPI.Clients.ApiResponse`

List products by filter

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CatalogProductGroupsApi`** | API context | 
**`catalogs_list_products_by_filter_request`** | [**`CatalogsListProductsByFilterRequest`**](CatalogsListProductsByFilterRequest.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`pin_metrics`** | **`Bool`** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]

### Return type

[**`CatalogsProductGroupPinsList200Response`**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

