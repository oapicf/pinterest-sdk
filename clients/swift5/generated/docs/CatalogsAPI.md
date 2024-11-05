# CatalogsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsCreate**](CatalogsAPI.md#catalogscreate) | **POST** /catalogs | Create catalog
[**catalogsList**](CatalogsAPI.md#catalogslist) | **GET** /catalogs | List catalogs
[**catalogsProductGroupPinsList**](CatalogsAPI.md#catalogsproductgrouppinslist) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogsProductGroupsCreate**](CatalogsAPI.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsCreateMany**](CatalogsAPI.md#catalogsproductgroupscreatemany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**catalogsProductGroupsDelete**](CatalogsAPI.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsDeleteMany**](CatalogsAPI.md#catalogsproductgroupsdeletemany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**catalogsProductGroupsGet**](CatalogsAPI.md#catalogsproductgroupsget) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](CatalogsAPI.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](CatalogsAPI.md#catalogsproductgroupsproductcountsget) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogsProductGroupsUpdate**](CatalogsAPI.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**feedProcessingResultsList**](CatalogsAPI.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**feedsCreate**](CatalogsAPI.md#feedscreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](CatalogsAPI.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](CatalogsAPI.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsIngest**](CatalogsAPI.md#feedsingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**feedsList**](CatalogsAPI.md#feedslist) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](CatalogsAPI.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](CatalogsAPI.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**itemsBatchPost**](CatalogsAPI.md#itemsbatchpost) | **POST** /catalogs/items/batch | Operate on item batch
[**itemsGet**](CatalogsAPI.md#itemsget) | **GET** /catalogs/items | Get catalogs items
[**itemsIssuesList**](CatalogsAPI.md#itemsissueslist) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
[**itemsPost**](CatalogsAPI.md#itemspost) | **POST** /catalogs/items | Get catalogs items (POST)
[**productsByProductGroupFilterList**](CatalogsAPI.md#productsbyproductgroupfilterlist) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
[**reportsCreate**](CatalogsAPI.md#reportscreate) | **POST** /catalogs/reports | Build catalogs report
[**reportsGet**](CatalogsAPI.md#reportsget) | **GET** /catalogs/reports | Get catalogs report
[**reportsStats**](CatalogsAPI.md#reportsstats) | **GET** /catalogs/reports/stats | List report stats


# **catalogsCreate**
```swift
    open class func catalogsCreate(catalogsCreateRequest: CatalogsCreateRequest, adAccountId: String? = nil, completion: @escaping (_ data: Catalog?, _ error: Error?) -> Void)
```

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: this API only supports the catalog type of HOTEL for now.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogsCreateRequest = CatalogsCreateRequest(catalogType: "catalogType_example", name: "name_example") // CatalogsCreateRequest | Request object used to created a feed.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create catalog
CatalogsAPI.catalogsCreate(catalogsCreateRequest: catalogsCreateRequest, adAccountId: adAccountId) { (response, error) in
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
 **catalogsCreateRequest** | [**CatalogsCreateRequest**](CatalogsCreateRequest.md) | Request object used to created a feed. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Catalog**](Catalog.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsList**
```swift
    open class func catalogsList(bookmark: String? = nil, pageSize: Int? = nil, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsList200Response?, _ error: Error?) -> Void)
```

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// List catalogs
CatalogsAPI.catalogsList(bookmark: bookmark, pageSize: pageSize, adAccountId: adAccountId) { (response, error) in
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
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupPinsList**
```swift
    open class func catalogsProductGroupPinsList(productGroupId: String, bookmark: String? = nil, pageSize: Int? = nil, adAccountId: String? = nil, pinMetrics: Bool? = nil, completion: @escaping (_ data: CatalogsProductGroupPinsList200Response?, _ error: Error?) -> Void)
```

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let pinMetrics = true // Bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

// List products by product group
CatalogsAPI.catalogsProductGroupPinsList(productGroupId: productGroupId, bookmark: bookmark, pageSize: pageSize, adAccountId: adAccountId, pinMetrics: pinMetrics) { (response, error) in
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
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **Bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsCreate**
```swift
    open class func catalogsProductGroupsCreate(multipleProductGroupsInner: MultipleProductGroupsInner, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsVerticalProductGroup?, _ error: Error?) -> Void)
```

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let multipleProductGroupsInner = multiple_product_groups_inner(name: "name_example", description: "description_example", isFeatured: false, filters: CatalogsCreativeAssetsProductGroupFilters(anyOf: [CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria(values: ["values_example"], negated: false), cUSTOMLABEL0: nil, cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria(values: [["values_example"]], negated: false), gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil, MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria(values: [MediaType()], negated: false))], allOf: [nil]), feedId: "feedId_example", catalogType: "catalogType_example", catalogId: "catalogId_example", country: Country(), locale: CatalogsLocale()) // MultipleProductGroupsInner | Request object used to create a single catalogs product groups.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create product group
CatalogsAPI.catalogsProductGroupsCreate(multipleProductGroupsInner: multipleProductGroupsInner, adAccountId: adAccountId) { (response, error) in
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
 **multipleProductGroupsInner** | [**MultipleProductGroupsInner**](MultipleProductGroupsInner.md) | Request object used to create a single catalogs product groups. | 
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
    open class func catalogsProductGroupsCreateMany(multipleProductGroupsInner: [MultipleProductGroupsInner], adAccountId: String? = nil, completion: @escaping (_ data: [String]?, _ error: Error?) -> Void)
```

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let multipleProductGroupsInner = [multiple_product_groups_inner(name: "name_example", description: "description_example", isFeatured: false, filters: CatalogsCreativeAssetsProductGroupFilters(anyOf: [CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria(values: ["values_example"], negated: false), cUSTOMLABEL0: nil, cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria(values: [["values_example"]], negated: false), gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil, MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria(values: [MediaType()], negated: false))], allOf: [nil]), feedId: "feedId_example", catalogType: "catalogType_example", catalogId: "catalogId_example", country: Country(), locale: CatalogsLocale())] // [MultipleProductGroupsInner] | Request object used to create one or more catalogs product groups.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create product groups
CatalogsAPI.catalogsProductGroupsCreateMany(multipleProductGroupsInner: multipleProductGroupsInner, adAccountId: adAccountId) { (response, error) in
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
 **multipleProductGroupsInner** | [**[MultipleProductGroupsInner]**](MultipleProductGroupsInner.md) | Request object used to create one or more catalogs product groups. | 
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
    open class func catalogsProductGroupsDelete(productGroupId: String, adAccountId: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Delete product group
CatalogsAPI.catalogsProductGroupsDelete(productGroupId: productGroupId, adAccountId: adAccountId) { (response, error) in
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

Void (empty response body)

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

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = [123] // [Int] | Comma-separated list of product group ids
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Delete product groups
CatalogsAPI.catalogsProductGroupsDeleteMany(id: id, adAccountId: adAccountId) { (response, error) in
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

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get product group
CatalogsAPI.catalogsProductGroupsGet(productGroupId: productGroupId, adAccountId: adAccountId) { (response, error) in
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
    open class func catalogsProductGroupsList(id: [Int]? = nil, feedId: String? = nil, catalogId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsProductGroupsList200Response?, _ error: Error?) -> Void)
```

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = [123] // [Int] | Comma-separated list of product group ids (optional)
let feedId = "feedId_example" // String | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
let catalogId = "catalogId_example" // String | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// List product groups
CatalogsAPI.catalogsProductGroupsList(id: id, feedId: feedId, catalogId: catalogId, bookmark: bookmark, pageSize: pageSize, adAccountId: adAccountId) { (response, error) in
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
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

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

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get product counts
CatalogsAPI.catalogsProductGroupsProductCountsGet(productGroupId: productGroupId, adAccountId: adAccountId) { (response, error) in
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
    open class func catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsVerticalProductGroup?, _ error: Error?) -> Void)
```

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let catalogsProductGroupsUpdateRequest = catalogs_product_groups_update_request(name: "name_example", description: "description_example", isFeatured: false, filters: CatalogsCreativeAssetsProductGroupFilters(anyOf: [CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria(values: ["values_example"], negated: false), cUSTOMLABEL0: nil, cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria(values: [["values_example"]], negated: false), gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil, MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria(values: [MediaType()], negated: false))], allOf: [nil]), catalogType: "catalogType_example", country: Country(), locale: CatalogsLocale()) // CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Update single product group
CatalogsAPI.catalogsProductGroupsUpdate(productGroupId: productGroupId, catalogsProductGroupsUpdateRequest: catalogsProductGroupsUpdateRequest, adAccountId: adAccountId) { (response, error) in
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
 **catalogsProductGroupsUpdateRequest** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md) | Request object used to Update a catalogs product group. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedProcessingResultsList**
```swift
    open class func feedProcessingResultsList(feedId: String, bookmark: String? = nil, pageSize: Int? = nil, adAccountId: String? = nil, completion: @escaping (_ data: FeedProcessingResultsList200Response?, _ error: Error?) -> Void)
```

List feed processing results

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedId = "feedId_example" // String | Unique identifier of a feed
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// List feed processing results
CatalogsAPI.feedProcessingResultsList(feedId: feedId, bookmark: bookmark, pageSize: pageSize, adAccountId: adAccountId) { (response, error) in
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
 **feedId** | **String** | Unique identifier of a feed | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**FeedProcessingResultsList200Response**](FeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsCreate**
```swift
    open class func feedsCreate(feedsCreateRequest: FeedsCreateRequest, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsFeed?, _ error: Error?) -> Void)
```

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedsCreateRequest = feeds_create_request(defaultCurrency: NullableCurrency(), name: "name_example", format: CatalogsFormat(), defaultLocale: CatalogsFeedsCreateRequest_default_locale(), credentials: CatalogsFeedCredentials(password: "password_example", username: "username_example"), location: "location_example", preferredProcessingSchedule: CatalogsFeedProcessingSchedule(time: "time_example", timezone: "timezone_example"), catalogType: CatalogsType(), defaultCountry: Country(), defaultAvailability: ProductAvailabilityType(), status: CatalogsStatus(), catalogId: "catalogId_example") // FeedsCreateRequest | Request object used to created a feed.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create feed
CatalogsAPI.feedsCreate(feedsCreateRequest: feedsCreateRequest, adAccountId: adAccountId) { (response, error) in
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
 **feedsCreateRequest** | [**FeedsCreateRequest**](FeedsCreateRequest.md) | Request object used to created a feed. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsDelete**
```swift
    open class func feedsDelete(feedId: String, adAccountId: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedId = "feedId_example" // String | Unique identifier of a feed
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Delete feed
CatalogsAPI.feedsDelete(feedId: feedId, adAccountId: adAccountId) { (response, error) in
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
 **feedId** | **String** | Unique identifier of a feed | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsGet**
```swift
    open class func feedsGet(feedId: String, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsFeed?, _ error: Error?) -> Void)
```

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedId = "feedId_example" // String | Unique identifier of a feed
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get feed
CatalogsAPI.feedsGet(feedId: feedId, adAccountId: adAccountId) { (response, error) in
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
 **feedId** | **String** | Unique identifier of a feed | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsIngest**
```swift
    open class func feedsIngest(feedId: String, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsFeedIngestion?, _ error: Error?) -> Void)
```

Ingest feed items

Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedId = "feedId_example" // String | Unique identifier of a feed
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Ingest feed items
CatalogsAPI.feedsIngest(feedId: feedId, adAccountId: adAccountId) { (response, error) in
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
 **feedId** | **String** | Unique identifier of a feed | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeedIngestion**](CatalogsFeedIngestion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsList**
```swift
    open class func feedsList(bookmark: String? = nil, pageSize: Int? = nil, catalogId: String? = nil, adAccountId: String? = nil, completion: @escaping (_ data: FeedsList200Response?, _ error: Error?) -> Void)
```

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let catalogId = "catalogId_example" // String | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// List feeds
CatalogsAPI.feedsList(bookmark: bookmark, pageSize: pageSize, catalogId: catalogId, adAccountId: adAccountId) { (response, error) in
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
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **catalogId** | **String** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**FeedsList200Response**](FeedsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsUpdate**
```swift
    open class func feedsUpdate(feedId: String, feedsUpdateRequest: FeedsUpdateRequest, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsFeed?, _ error: Error?) -> Void)
```

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedId = "feedId_example" // String | Unique identifier of a feed
let feedsUpdateRequest = feeds_update_request(defaultCurrency: NullableCurrency(), name: "name_example", format: CatalogsFormat(), credentials: CatalogsFeedCredentials(password: "password_example", username: "username_example"), location: "location_example", preferredProcessingSchedule: CatalogsFeedProcessingSchedule(time: "time_example", timezone: "timezone_example"), status: CatalogsStatus(), catalogType: CatalogsType(), defaultAvailability: ProductAvailabilityType()) // FeedsUpdateRequest | Request object used to update a feed.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Update feed
CatalogsAPI.feedsUpdate(feedId: feedId, feedsUpdateRequest: feedsUpdateRequest, adAccountId: adAccountId) { (response, error) in
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
 **feedId** | **String** | Unique identifier of a feed | 
 **feedsUpdateRequest** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md) | Request object used to update a feed. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsBatchGet**
```swift
    open class func itemsBatchGet(batchId: String, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsItemsBatch?, _ error: Error?) -> Void)
```

Get item batch status

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let batchId = "batchId_example" // String | Id of a catalogs items batch to fetch
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get item batch status
CatalogsAPI.itemsBatchGet(batchId: batchId, adAccountId: adAccountId) { (response, error) in
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
 **batchId** | **String** | Id of a catalogs items batch to fetch | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsBatchPost**
```swift
    open class func itemsBatchPost(itemsBatchPostRequest: ItemsBatchPostRequest, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsItemsBatch?, _ error: Error?) -> Void)
```

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager to get assistance.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let itemsBatchPostRequest = items_batch_post_request(catalogType: "catalogType_example", country: Country(), language: CatalogsItemsRequest_language(), items: [ItemDeleteBatchRecord(itemId: "itemId_example")], catalogId: "catalogId_example", operation: BatchOperation()) // ItemsBatchPostRequest | Request object used to create catalogs items in a batch
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Operate on item batch
CatalogsAPI.itemsBatchPost(itemsBatchPostRequest: itemsBatchPostRequest, adAccountId: adAccountId) { (response, error) in
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
 **itemsBatchPostRequest** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md) | Request object used to create catalogs items in a batch | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsGet**
```swift
    open class func itemsGet(country: String, language: String, adAccountId: String? = nil, itemIds: [String]? = nil, filters: CatalogsItemsFilters? = nil, completion: @escaping (_ data: CatalogsItems?, _ error: Error?) -> Void)
```

Get catalogs items

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: this endpoint is deprecated and will be deleted soon. Please use <a href='/docs/api/v5/#operation/items/post'>Get catalogs items (POST)</a> instead.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let country = "country_example" // String | Country for the Catalogs Items
let language = "language_example" // String | Language for the Catalogs Items
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let itemIds = ["inner_example"] // [String] | This parameter is deprecated. Use filters instead. (optional)
let filters = CatalogsItemsFilters(catalogType: CatalogsType(), itemIds: ["itemIds_example"], catalogId: "catalogId_example", hotelIds: ["hotelIds_example"], creativeAssetsIds: ["creativeAssetsIds_example"]) // CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter. (optional)

// Get catalogs items
CatalogsAPI.itemsGet(country: country, language: language, adAccountId: adAccountId, itemIds: itemIds, filters: filters) { (response, error) in
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
 **country** | **String** | Country for the Catalogs Items | 
 **language** | **String** | Language for the Catalogs Items | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **itemIds** | [**[String]**](String.md) | This parameter is deprecated. Use filters instead. | [optional] 
 **filters** | [**CatalogsItemsFilters**](.md) | Identifies items to be retrieved. This is a required parameter. | [optional] 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsIssuesList**
```swift
    open class func itemsIssuesList(processingResultId: String, bookmark: String? = nil, pageSize: Int? = nil, itemNumbers: [Int]? = nil, itemValidationIssue: CatalogsItemValidationIssue? = nil, adAccountId: String? = nil, completion: @escaping (_ data: ItemsIssuesList200Response?, _ error: Error?) -> Void)
```

List item issues

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a> and <a href='/docs/api/v5/#operation/reports/get'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let processingResultId = "processingResultId_example" // String | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let itemNumbers = [123] // [Int] | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. (optional)
let itemValidationIssue = CatalogsItemValidationIssue() // CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// List item issues
CatalogsAPI.itemsIssuesList(processingResultId: processingResultId, bookmark: bookmark, pageSize: pageSize, itemNumbers: itemNumbers, itemValidationIssue: itemValidationIssue, adAccountId: adAccountId) { (response, error) in
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
 **processingResultId** | **String** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **itemNumbers** | [**[Int]**](Int.md) | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] 
 **itemValidationIssue** | [**CatalogsItemValidationIssue**](.md) | Filter item validation issues that have a given type of item validation issue. | [optional] 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsPost**
```swift
    open class func itemsPost(catalogsItemsRequest: CatalogsItemsRequest, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsItems?, _ error: Error?) -> Void)
```

Get catalogs items (POST)

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogsItemsRequest = CatalogsItemsRequest(country: Country(), language: CatalogsItemsRequest_language(), filters: CatalogsItemsPostFilters(catalogType: CatalogsType(), itemIds: ["itemIds_example"], catalogId: "catalogId_example", hotelIds: ["hotelIds_example"], creativeAssetsIds: ["creativeAssetsIds_example"])) // CatalogsItemsRequest | Request object used to get catalogs items
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get catalogs items (POST)
CatalogsAPI.itemsPost(catalogsItemsRequest: catalogsItemsRequest, adAccountId: adAccountId) { (response, error) in
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
 **catalogsItemsRequest** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md) | Request object used to get catalogs items | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItems**](CatalogsItems.md)

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

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogsListProductsByFilterRequest = CatalogsListProductsByFilterRequest(feedId: "feedId_example", filters: CatalogsCreativeAssetsProductGroupFilters(anyOf: [CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria(values: ["values_example"], negated: false), cUSTOMLABEL0: nil, cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria(values: [["values_example"]], negated: false), gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil, MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria(values: [MediaType()], negated: false))], allOf: [nil]), catalogType: "catalogType_example", catalogId: "catalogId_example", country: Country(), locale: CatalogsLocale()) // CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let pinMetrics = true // Bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

// List products by filter
CatalogsAPI.productsByProductGroupFilterList(catalogsListProductsByFilterRequest: catalogsListProductsByFilterRequest, bookmark: bookmark, pageSize: pageSize, adAccountId: adAccountId, pinMetrics: pinMetrics) { (response, error) in
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
 **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md) | Object holding a group of filters for a catalog product group | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **Bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reportsCreate**
```swift
    open class func reportsCreate(catalogsReportParameters: CatalogsReportParameters, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsCreateReportResponse?, _ error: Error?) -> Void)
```

Build catalogs report

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogsReportParameters = CatalogsReportParameters(catalogType: CatalogsType(), report: CatalogsHotelReportParameters_report(reportType: "reportType_example", feedId: "feedId_example", processingResultId: "processingResultId_example", catalogId: "catalogId_example")) // CatalogsReportParameters | Request object to asynchronously create a report.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Build catalogs report
CatalogsAPI.reportsCreate(catalogsReportParameters: catalogsReportParameters, adAccountId: adAccountId) { (response, error) in
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
 **catalogsReportParameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md) | Request object to asynchronously create a report. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsCreateReportResponse**](CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reportsGet**
```swift
    open class func reportsGet(token: String, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsReport?, _ error: Error?) -> Void)
```

Get catalogs report

This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let token = "token_example" // String | Token returned from async build report call
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get catalogs report
CatalogsAPI.reportsGet(token: token, adAccountId: adAccountId) { (response, error) in
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
 **token** | **String** | Token returned from async build report call | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsReport**](CatalogsReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reportsStats**
```swift
    open class func reportsStats(parameters: CatalogsReportParameters, adAccountId: String? = nil, pageSize: Int? = nil, bookmark: String? = nil, completion: @escaping (_ data: ReportsStats200Response?, _ error: Error?) -> Void)
```

List report stats

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let parameters = CatalogsReportParameters(catalogType: CatalogsType(), report: CatalogsHotelReportParameters_report(reportType: "reportType_example", feedId: "feedId_example", processingResultId: "processingResultId_example", catalogId: "catalogId_example")) // CatalogsReportParameters | Contains the parameters for report identification.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// List report stats
CatalogsAPI.reportsStats(parameters: parameters, adAccountId: adAccountId, pageSize: pageSize, bookmark: bookmark) { (response, error) in
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
 **parameters** | [**CatalogsReportParameters**](.md) | Contains the parameters for report identification. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**ReportsStats200Response**](ReportsStats200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

