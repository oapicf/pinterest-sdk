# CatalogProductGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupPinsList**](CatalogProductGroupsAPI.md#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogsProductGroupsCreate**](CatalogProductGroupsAPI.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsCreateMany**](CatalogProductGroupsAPI.md#catalogsproductgroupscreatemany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**catalogsProductGroupsDelete**](CatalogProductGroupsAPI.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsDeleteMany**](CatalogProductGroupsAPI.md#catalogsproductgroupsdeletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**catalogsProductGroupsGet**](CatalogProductGroupsAPI.md#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](CatalogProductGroupsAPI.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](CatalogProductGroupsAPI.md#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogsProductGroupsUpdate**](CatalogProductGroupsAPI.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**productsByProductGroupFilterList**](CatalogProductGroupsAPI.md#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter


# **catalogsProductGroupPinsList**
```swift
    open class func catalogsProductGroupPinsList(productGroupId: String, adAccountId: String? = nil, pinMetrics: Bool? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: CatalogsProductGroupPinsList200Response?, _ error: Error?) -> Void)
```

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let pinMetrics = true // Bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List products by product group
CatalogProductGroupsAPI.catalogsProductGroupPinsList(productGroupId: productGroupId, adAccountId: adAccountId, pinMetrics: pinMetrics, bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String** | Unique identifier of a product group | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **Bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsCreate**
```swift
    open class func catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsVerticalProductGroup?, _ error: Error?) -> Void)
```

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogsProductGroupsCreateRequestSchema = CatalogsProductGroupsCreateRequestSchema(description: "description_example", feedId: "feedId_example", filters: CatalogsCreativeAssetsProductGroupFilters(anyOf: [CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria(negated: false, values: ["values_example"]), cUSTOMLABEL0: CatalogsProductGroupFilterOperatorTypeCriteria(filterOperatorType: FilterOperatorType(), negated: false, values: ["values_example"]), cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria(negated: false, values: [["values_example"]]), gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil, MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria(negated: false, values: [MediaType()]), TITLE_KEYWORDS: nil, LINK: nil)], allOf: [nil]), isFeatured: false, name: "name_example", catalogId: "catalogId_example", catalogType: "catalogType_example", country: Country(), locale: CatalogsLocale()) // CatalogsProductGroupsCreateRequestSchema | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create product group
CatalogProductGroupsAPI.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema: catalogsProductGroupsCreateRequestSchema, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateRequestSchema** | [**CatalogsProductGroupsCreateRequestSchema**](CatalogsProductGroupsCreateRequestSchema.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsCreateMany**
```swift
    open class func catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems: [CatalogsProductGroupsCreateManyRequestItems], adAccountId: String? = nil, completion: @escaping (_ data: [String]?, _ error: Error?) -> Void)
```

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogsProductGroupsCreateManyRequestItems = [CatalogsProductGroupsCreateManyRequestItems(description: "description_example", feedId: "feedId_example", filters: CatalogsCreativeAssetsProductGroupFilters(anyOf: [CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria(negated: false, values: ["values_example"]), cUSTOMLABEL0: CatalogsProductGroupFilterOperatorTypeCriteria(filterOperatorType: FilterOperatorType(), negated: false, values: ["values_example"]), cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria(negated: false, values: [["values_example"]]), gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil, MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria(negated: false, values: [MediaType()]), TITLE_KEYWORDS: nil, LINK: nil)], allOf: [nil]), isFeatured: false, name: "name_example", catalogId: "catalogId_example", catalogType: "catalogType_example", country: Country(), locale: CatalogsLocale())] // [CatalogsProductGroupsCreateManyRequestItems] | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create product groups
CatalogProductGroupsAPI.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems: catalogsProductGroupsCreateManyRequestItems, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateManyRequestItems** | [**[CatalogsProductGroupsCreateManyRequestItems]**](CatalogsProductGroupsCreateManyRequestItems.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

**[String]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsDelete**
```swift
    open class func catalogsProductGroupsDelete(productGroupId: String, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsVerticalProductGroup?, _ error: Error?) -> Void)
```

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Delete product group
CatalogProductGroupsAPI.catalogsProductGroupsDelete(productGroupId: productGroupId, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String** | Unique identifier of a product group | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsDeleteMany**
```swift
    open class func catalogsProductGroupsDeleteMany(id: [Int], adAccountId: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete product groups

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = [123] // [Int] | Comma-separated list of product group ids
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Delete product groups
CatalogProductGroupsAPI.catalogsProductGroupsDeleteMany(id: id, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**[Int]**](Int.md) | Comma-separated list of product group ids | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsGet**
```swift
    open class func catalogsProductGroupsGet(productGroupId: String, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsVerticalProductGroup?, _ error: Error?) -> Void)
```

Get product group

Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get product group
CatalogProductGroupsAPI.catalogsProductGroupsGet(productGroupId: productGroupId, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String** | Unique identifier of a product group | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsList**
```swift
    open class func catalogsProductGroupsList(id: [Int]? = nil, feedId: String? = nil, catalogId: String? = nil, adAccountId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: CatalogsProductGroupsList200Response?, _ error: Error?) -> Void)
```

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = [123] // [Int] | Comma-separated list of product group ids (optional)
let feedId = "feedId_example" // String | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
let catalogId = "catalogId_example" // String | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List product groups
CatalogProductGroupsAPI.catalogsProductGroupsList(id: id, feedId: feedId, catalogId: catalogId, adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**[Int]**](Int.md) | Comma-separated list of product group ids | [optional] 
 **feedId** | **String** | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **catalogId** | **String** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsProductCountsGet**
```swift
    open class func catalogsProductGroupsProductCountsGet(productGroupId: String, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsProductGroupProductCountsVertical?, _ error: Error?) -> Void)
```

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get product counts
CatalogProductGroupsAPI.catalogsProductGroupsProductCountsGet(productGroupId: productGroupId, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String** | Unique identifier of a product group | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupProductCountsVertical**](CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsUpdate**
```swift
    open class func catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsVerticalProductGroup?, _ error: Error?) -> Void)
```

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let catalogsProductGroupsUpdateRequestSchema = CatalogsProductGroupsUpdateRequestSchema(description: "description_example", filters: CatalogsCreativeAssetsProductGroupFilters(anyOf: [CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria(negated: false, values: ["values_example"]), cUSTOMLABEL0: CatalogsProductGroupFilterOperatorTypeCriteria(filterOperatorType: FilterOperatorType(), negated: false, values: ["values_example"]), cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria(negated: false, values: [["values_example"]]), gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil, MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria(negated: false, values: [MediaType()]), TITLE_KEYWORDS: nil, LINK: nil)], allOf: [nil]), isFeatured: false, name: "name_example", catalogType: "catalogType_example", country: Country(), locale: CatalogsLocale()) // CatalogsProductGroupsUpdateRequestSchema | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Update single product group
CatalogProductGroupsAPI.catalogsProductGroupsUpdate(productGroupId: productGroupId, catalogsProductGroupsUpdateRequestSchema: catalogsProductGroupsUpdateRequestSchema, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String** | Unique identifier of a product group | 
 **catalogsProductGroupsUpdateRequestSchema** | [**CatalogsProductGroupsUpdateRequestSchema**](CatalogsProductGroupsUpdateRequestSchema.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productsByProductGroupFilterList**
```swift
    open class func productsByProductGroupFilterList(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: String? = nil, pageSize: Int? = nil, adAccountId: String? = nil, pinMetrics: Bool? = nil, completion: @escaping (_ data: CatalogsProductGroupPinsList200Response?, _ error: Error?) -> Void)
```

List products by filter

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogsListProductsByFilterRequest = CatalogsListProductsByFilterRequest(feedId: "feedId_example", filters: CatalogsCreativeAssetsProductGroupFilters(anyOf: [CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria(negated: false, values: ["values_example"]), cUSTOMLABEL0: CatalogsProductGroupFilterOperatorTypeCriteria(filterOperatorType: FilterOperatorType(), negated: false, values: ["values_example"]), cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria(negated: false, values: [["values_example"]]), gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil, MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria(negated: false, values: [MediaType()]), TITLE_KEYWORDS: nil, LINK: nil)], allOf: [nil]), catalogId: "catalogId_example", catalogType: "catalogType_example", country: Country(), locale: CatalogsLocale()) // CatalogsListProductsByFilterRequest | 
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let pinMetrics = true // Bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

// List products by filter
CatalogProductGroupsAPI.productsByProductGroupFilterList(catalogsListProductsByFilterRequest: catalogsListProductsByFilterRequest, bookmark: bookmark, pageSize: pageSize, adAccountId: adAccountId, pinMetrics: pinMetrics) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md) |  | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **Bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

