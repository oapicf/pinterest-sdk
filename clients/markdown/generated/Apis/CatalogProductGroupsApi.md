# CatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**catalogsProductGroupPins/list**](CatalogProductGroupsApi.md#catalogsProductGroupPins/list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group |
| [**catalogsProductGroups/create**](CatalogProductGroupsApi.md#catalogsProductGroups/create) | **POST** /catalogs/product_groups | Create product group |
| [**catalogsProductGroups/createMany**](CatalogProductGroupsApi.md#catalogsProductGroups/createMany) | **POST** /catalogs/product_groups/multiple | Create product groups |
| [**catalogsProductGroups/delete**](CatalogProductGroupsApi.md#catalogsProductGroups/delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
| [**catalogsProductGroups/deleteMany**](CatalogProductGroupsApi.md#catalogsProductGroups/deleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups |
| [**catalogsProductGroups/get**](CatalogProductGroupsApi.md#catalogsProductGroups/get) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
| [**catalogsProductGroups/list**](CatalogProductGroupsApi.md#catalogsProductGroups/list) | **GET** /catalogs/product_groups | List product groups |
| [**catalogsProductGroups/productCountsGet**](CatalogProductGroupsApi.md#catalogsProductGroups/productCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts |
| [**catalogsProductGroups/update**](CatalogProductGroupsApi.md#catalogsProductGroups/update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group |
| [**productsByProductGroupFilter/list**](CatalogProductGroupsApi.md#productsByProductGroupFilter/list) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter |


<a name="catalogsProductGroupPins/list"></a>
# **catalogsProductGroupPins/list**
> catalogs_product_group_pins_list_200_response catalogsProductGroupPins/list(product\_group\_id, ad\_account\_id, pin\_metrics, bookmark, page\_size)

List products by product group

    Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_group\_id** | **String**| Unique identifier of a product group | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |
| **pin\_metrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**catalogs_product_group_pins_list_200_response**](../Models/catalogs_product_group_pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/create"></a>
# **catalogsProductGroups/create**
> CatalogsVerticalProductGroup catalogsProductGroups/create(CatalogsProductGroupsCreateRequestSchema, ad\_account\_id)

Create product group

    Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CatalogsProductGroupsCreateRequestSchema** | [**CatalogsProductGroupsCreateRequestSchema**](../Models/CatalogsProductGroupsCreateRequestSchema.md)|  | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**CatalogsVerticalProductGroup**](../Models/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="catalogsProductGroups/createMany"></a>
# **catalogsProductGroups/createMany**
> List catalogsProductGroups/createMany(CatalogsProductGroupsCreateManyRequestItems, ad\_account\_id)

Create product groups

    Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CatalogsProductGroupsCreateManyRequestItems** | [**List**](../Models/CatalogsProductGroupsCreateManyRequestItems.md)|  | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

**List**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="catalogsProductGroups/delete"></a>
# **catalogsProductGroups/delete**
> CatalogsVerticalProductGroup catalogsProductGroups/delete(product\_group\_id, ad\_account\_id)

Delete product group

    Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_group\_id** | **String**| Unique identifier of a product group | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**CatalogsVerticalProductGroup**](../Models/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/deleteMany"></a>
# **catalogsProductGroups/deleteMany**
> catalogsProductGroups/deleteMany(id, ad\_account\_id)

Delete product groups

    Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | [**List**](../Models/Integer.md)| Comma-separated list of product group ids | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/get"></a>
# **catalogsProductGroups/get**
> CatalogsVerticalProductGroup catalogsProductGroups/get(product\_group\_id, ad\_account\_id)

Get product group

    Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_group\_id** | **String**| Unique identifier of a product group | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**CatalogsVerticalProductGroup**](../Models/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/list"></a>
# **catalogsProductGroups/list**
> catalogs_product_groups_list_200_response catalogsProductGroups/list(id, feed\_id, catalog\_id, ad\_account\_id, bookmark, page\_size)

List product groups

    Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | [**List**](../Models/Integer.md)| Comma-separated list of product group ids | [optional] [default to null] |
| **feed\_id** | **String**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] [default to null] |
| **catalog\_id** | **String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**catalogs_product_groups_list_200_response**](../Models/catalogs_product_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/productCountsGet"></a>
# **catalogsProductGroups/productCountsGet**
> CatalogsProductGroupProductCountsVertical catalogsProductGroups/productCountsGet(product\_group\_id, ad\_account\_id)

Get product counts

    Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_group\_id** | **String**| Unique identifier of a product group | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**CatalogsProductGroupProductCountsVertical**](../Models/CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/update"></a>
# **catalogsProductGroups/update**
> CatalogsVerticalProductGroup catalogsProductGroups/update(product\_group\_id, CatalogsProductGroupsUpdateRequestSchema, ad\_account\_id)

Update single product group

    Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_group\_id** | **String**| Unique identifier of a product group | [default to null] |
| **CatalogsProductGroupsUpdateRequestSchema** | [**CatalogsProductGroupsUpdateRequestSchema**](../Models/CatalogsProductGroupsUpdateRequestSchema.md)|  | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**CatalogsVerticalProductGroup**](../Models/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="productsByProductGroupFilter/list"></a>
# **productsByProductGroupFilter/list**
> catalogs_product_group_pins_list_200_response productsByProductGroupFilter/list(CatalogsListProductsByFilterRequest, bookmark, page\_size, ad\_account\_id, pin\_metrics)

List products by filter

    List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CatalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](../Models/CatalogsListProductsByFilterRequest.md)|  | |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |
| **pin\_metrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false] |

### Return type

[**catalogs_product_group_pins_list_200_response**](../Models/catalogs_product_group_pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

