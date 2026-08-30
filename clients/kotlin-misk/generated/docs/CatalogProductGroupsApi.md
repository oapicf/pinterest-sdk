# CatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupPinsList**](CatalogProductGroupsApi.md#catalogsProductGroupPinsList) | **Get** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogsProductGroupsCreate**](CatalogProductGroupsApi.md#catalogsProductGroupsCreate) | **Post** /catalogs/product_groups | Create product group
[**catalogsProductGroupsCreateMany**](CatalogProductGroupsApi.md#catalogsProductGroupsCreateMany) | **Post** /catalogs/product_groups/multiple | Create product groups
[**catalogsProductGroupsDelete**](CatalogProductGroupsApi.md#catalogsProductGroupsDelete) | **Delete** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsDeleteMany**](CatalogProductGroupsApi.md#catalogsProductGroupsDeleteMany) | **Delete** /catalogs/product_groups/multiple | Delete product groups
[**catalogsProductGroupsGet**](CatalogProductGroupsApi.md#catalogsProductGroupsGet) | **Get** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](CatalogProductGroupsApi.md#catalogsProductGroupsList) | **Get** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](CatalogProductGroupsApi.md#catalogsProductGroupsProductCountsGet) | **Get** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogsProductGroupsUpdate**](CatalogProductGroupsApi.md#catalogsProductGroupsUpdate) | **Patch** /catalogs/product_groups/{product_group_id} | Update single product group
[**productsByProductGroupFilterList**](CatalogProductGroupsApi.md#productsByProductGroupFilterList) | **Post** /catalogs/products/get_by_product_group_filters | List products by filter


<a name="catalogsProductGroupPinsList"></a>
# **catalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize)

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogProductGroupsApi()
val productGroupId : kotlin.String = productGroupId_example // kotlin.String | Unique identifier of a product group
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pinMetrics : kotlin.Boolean = true // kotlin.Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : CatalogsProductGroupPinsList200Response = apiInstance.catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogProductGroupsApi#catalogsProductGroupPinsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogProductGroupsApi#catalogsProductGroupPinsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **kotlin.String**| Unique identifier of a product group |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **pinMetrics** | **kotlin.Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="catalogsProductGroupsCreate"></a>
# **catalogsProductGroupsCreate**
> CatalogsVerticalProductGroup catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId)

Create product group

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogProductGroupsApi()
val catalogsProductGroupsCreateRequestSchema : CatalogsProductGroupsCreateRequestSchema =  // CatalogsProductGroupsCreateRequestSchema | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsVerticalProductGroup = apiInstance.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogProductGroupsApi#catalogsProductGroupsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogProductGroupsApi#catalogsProductGroupsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateRequestSchema** | [**CatalogsProductGroupsCreateRequestSchema**](CatalogsProductGroupsCreateRequestSchema.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="catalogsProductGroupsCreateMany"></a>
# **catalogsProductGroupsCreateMany**
> kotlin.collections.List&lt;kotlin.String&gt; catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId)

Create product groups

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogProductGroupsApi()
val catalogsProductGroupsCreateManyRequestItems : kotlin.collections.List<CatalogsProductGroupsCreateManyRequestItems> =  // kotlin.collections.List<CatalogsProductGroupsCreateManyRequestItems> | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogProductGroupsApi#catalogsProductGroupsCreateMany")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogProductGroupsApi#catalogsProductGroupsCreateMany")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateManyRequestItems** | [**kotlin.collections.List&lt;CatalogsProductGroupsCreateManyRequestItems&gt;**](CatalogsProductGroupsCreateManyRequestItems.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="catalogsProductGroupsDelete"></a>
# **catalogsProductGroupsDelete**
> CatalogsVerticalProductGroup catalogsProductGroupsDelete(productGroupId, adAccountId)

Delete product group

Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogProductGroupsApi()
val productGroupId : kotlin.String = productGroupId_example // kotlin.String | Unique identifier of a product group
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsVerticalProductGroup = apiInstance.catalogsProductGroupsDelete(productGroupId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogProductGroupsApi#catalogsProductGroupsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogProductGroupsApi#catalogsProductGroupsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **kotlin.String**| Unique identifier of a product group |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="catalogsProductGroupsDeleteMany"></a>
# **catalogsProductGroupsDeleteMany**
> catalogsProductGroupsDeleteMany(id, adAccountId)

Delete product groups

Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogProductGroupsApi()
val id : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Comma-separated list of product group ids
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    apiInstance.catalogsProductGroupsDeleteMany(id, adAccountId)
} catch (e: ClientException) {
    println("4xx response calling CatalogProductGroupsApi#catalogsProductGroupsDeleteMany")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogProductGroupsApi#catalogsProductGroupsDeleteMany")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Comma-separated list of product group ids |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="catalogsProductGroupsGet"></a>
# **catalogsProductGroupsGet**
> CatalogsVerticalProductGroup catalogsProductGroupsGet(productGroupId, adAccountId)

Get product group

Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogProductGroupsApi()
val productGroupId : kotlin.String = productGroupId_example // kotlin.String | Unique identifier of a product group
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsVerticalProductGroup = apiInstance.catalogsProductGroupsGet(productGroupId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogProductGroupsApi#catalogsProductGroupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogProductGroupsApi#catalogsProductGroupsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **kotlin.String**| Unique identifier of a product group |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="catalogsProductGroupsList"></a>
# **catalogsProductGroupsList**
> CatalogsProductGroupsList200Response catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogProductGroupsApi()
val id : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Comma-separated list of product group ids
val feedId : kotlin.String = feedId_example // kotlin.String | Filter entities for a given feed_id. If not given, all feeds are considered.
val catalogId : kotlin.String = catalogId_example // kotlin.String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : CatalogsProductGroupsList200Response = apiInstance.catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogProductGroupsApi#catalogsProductGroupsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogProductGroupsApi#catalogsProductGroupsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Comma-separated list of product group ids | [optional]
 **feedId** | **kotlin.String**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional]
 **catalogId** | **kotlin.String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="catalogsProductGroupsProductCountsGet"></a>
# **catalogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCountsVertical catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogProductGroupsApi()
val productGroupId : kotlin.String = productGroupId_example // kotlin.String | Unique identifier of a product group
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsProductGroupProductCountsVertical = apiInstance.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogProductGroupsApi#catalogsProductGroupsProductCountsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogProductGroupsApi#catalogsProductGroupsProductCountsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **kotlin.String**| Unique identifier of a product group |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsProductGroupProductCountsVertical**](CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="catalogsProductGroupsUpdate"></a>
# **catalogsProductGroupsUpdate**
> CatalogsVerticalProductGroup catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId)

Update single product group

Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogProductGroupsApi()
val productGroupId : kotlin.String = productGroupId_example // kotlin.String | Unique identifier of a product group
val catalogsProductGroupsUpdateRequestSchema : CatalogsProductGroupsUpdateRequestSchema =  // CatalogsProductGroupsUpdateRequestSchema | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsVerticalProductGroup = apiInstance.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogProductGroupsApi#catalogsProductGroupsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogProductGroupsApi#catalogsProductGroupsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **kotlin.String**| Unique identifier of a product group |
 **catalogsProductGroupsUpdateRequestSchema** | [**CatalogsProductGroupsUpdateRequestSchema**](CatalogsProductGroupsUpdateRequestSchema.md)|  |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="productsByProductGroupFilterList"></a>
# **productsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics)

List products by filter

List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CatalogProductGroupsApi()
val catalogsListProductsByFilterRequest : CatalogsListProductsByFilterRequest =  // CatalogsListProductsByFilterRequest | 
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pinMetrics : kotlin.Boolean = true // kotlin.Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
try {
    val result : CatalogsProductGroupPinsList200Response = apiInstance.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogProductGroupsApi#productsByProductGroupFilterList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogProductGroupsApi#productsByProductGroupFilterList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)|  |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **pinMetrics** | **kotlin.Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

