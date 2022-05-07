# CatalogsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupsCreate**](CatalogsAPI.md#catalogsproductgroupscreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsDelete**](CatalogsAPI.md#catalogsproductgroupsdelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsList**](CatalogsAPI.md#catalogsproductgroupslist) | **GET** /catalogs/product_groups | Get product groups list
[**catalogsProductGroupsUpdate**](CatalogsAPI.md#catalogsproductgroupsupdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResultsList**](CatalogsAPI.md#feedprocessingresultslist) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feedsCreate**](CatalogsAPI.md#feedscreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](CatalogsAPI.md#feedsdelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](CatalogsAPI.md#feedsget) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsList**](CatalogsAPI.md#feedslist) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](CatalogsAPI.md#feedsupdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](CatalogsAPI.md#itemsbatchget) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**itemsBatchPost**](CatalogsAPI.md#itemsbatchpost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**itemsGet**](CatalogsAPI.md#itemsget) | **GET** /catalogs/items | Get catalogs items


# **catalogsProductGroupsCreate**
```swift
    open class func catalogsProductGroupsCreate(catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest, completion: @escaping (_ data: AnyCodable?, _ error: Error?) -> Void)
```

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogsProductGroupCreateRequest = CatalogsProductGroupCreateRequest(feedId: "feedId_example", name: "name_example", description: "description_example", filters: CatalogsProductGroupFilters(anyOf: [CatalogsProductGroupFilterKeys(MIN_PRICE: CatalogsProductGroupPricingCriteria(inclusion: false, values: 123, negated: false), MAX_PRICE: nil, CURRENCY: CatalogsProductGroupCurrencyCriteria(values: NonNullableCatalogsCurrency(), negated: false), ITEM_ID: nil, AVAILABILITY: CatalogsProductGroupMultipleStringCriteria(values: ["values_example"], negated: false), BRAND: nil, CONDITION: nil, cUSTOMLABEL0: nil, cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, ITEM_GROUP_ID: nil, GENDER: nil, pRODUCTTYPE4: CatalogsProductGroupMultipleStringListCriteria(values: [["values_example"]], negated: false), pRODUCTTYPE3: nil, pRODUCTTYPE2: nil, pRODUCTTYPE1: nil, pRODUCTTYPE0: nil, gOOGLEPRODUCTCATEGORY6: nil, gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil)], allOf: [nil])) // CatalogsProductGroupCreateRequest | Request object used to created a catalogs product group.

// Create product group
CatalogsAPI.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest: catalogsProductGroupCreateRequest) { (response, error) in
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
 **catalogsProductGroupCreateRequest** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md) | Request object used to created a catalogs product group. | 

### Return type

[**AnyCodable**](AnyCodable.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsDelete**
```swift
    open class func catalogsProductGroupsDelete(productGroupId: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group

// Delete product group
CatalogsAPI.catalogsProductGroupsDelete(productGroupId: productGroupId) { (response, error) in
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

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsList**
```swift
    open class func catalogsProductGroupsList(feedId: String, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedId = "feedId_example" // String | Unique identifier of a feed
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

// Get product groups list
CatalogsAPI.catalogsProductGroupsList(feedId: feedId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsProductGroupsUpdate**
```swift
    open class func catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest, completion: @escaping (_ data: CatalogsProductGroup?, _ error: Error?) -> Void)
```

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let productGroupId = "productGroupId_example" // String | Unique identifier of a product group
let catalogsProductGroupUpdateRequest = CatalogsProductGroupUpdateRequest(feedId: "feedId_example", name: "name_example", description: "description_example", filters: CatalogsProductGroupFilters(anyOf: [CatalogsProductGroupFilterKeys(MIN_PRICE: CatalogsProductGroupPricingCriteria(inclusion: false, values: 123, negated: false), MAX_PRICE: nil, CURRENCY: CatalogsProductGroupCurrencyCriteria(values: NonNullableCatalogsCurrency(), negated: false), ITEM_ID: nil, AVAILABILITY: CatalogsProductGroupMultipleStringCriteria(values: ["values_example"], negated: false), BRAND: nil, CONDITION: nil, cUSTOMLABEL0: nil, cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, ITEM_GROUP_ID: nil, GENDER: nil, pRODUCTTYPE4: CatalogsProductGroupMultipleStringListCriteria(values: [["values_example"]], negated: false), pRODUCTTYPE3: nil, pRODUCTTYPE2: nil, pRODUCTTYPE1: nil, pRODUCTTYPE0: nil, gOOGLEPRODUCTCATEGORY6: nil, gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil)], allOf: [nil])) // CatalogsProductGroupUpdateRequest | Request object used to Update a catalogs product group.

// Update product group
CatalogsAPI.catalogsProductGroupsUpdate(productGroupId: productGroupId, catalogsProductGroupUpdateRequest: catalogsProductGroupUpdateRequest) { (response, error) in
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
 **catalogsProductGroupUpdateRequest** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md) | Request object used to Update a catalogs product group. | 

### Return type

[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedProcessingResultsList**
```swift
    open class func feedProcessingResultsList(feedId: String, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedId = "feedId_example" // String | Unique identifier of a feed
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

// List processing results for a given feed
CatalogsAPI.feedProcessingResultsList(feedId: feedId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsCreate**
```swift
    open class func feedsCreate(catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest, completion: @escaping (_ data: CatalogsFeed?, _ error: Error?) -> Void)
```

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogsFeedsCreateRequest = CatalogsFeedsCreateRequest(defaultCountry: Country(), defaultAvailability: ProductAvailabilityType(), defaultCurrency: NullableCurrency(), name: "name_example", format: CatalogsFormat(), defaultLocale: "defaultLocale_example", credentials: CatalogsFeedCredentials(password: "password_example", username: "username_example"), location: "location_example", preferredProcessingSchedule: CatalogsFeedProcessingSchedule(time: "time_example", timezone: "timezone_example")) // CatalogsFeedsCreateRequest | Request object used to created a feed.

// Create feed
CatalogsAPI.feedsCreate(catalogsFeedsCreateRequest: catalogsFeedsCreateRequest) { (response, error) in
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
 **catalogsFeedsCreateRequest** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md) | Request object used to created a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsDelete**
```swift
    open class func feedsDelete(feedId: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedId = "feedId_example" // String | Unique identifier of a feed

// Delete feed
CatalogsAPI.feedsDelete(feedId: feedId) { (response, error) in
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

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsGet**
```swift
    open class func feedsGet(feedId: String, completion: @escaping (_ data: CatalogsFeed?, _ error: Error?) -> Void)
```

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedId = "feedId_example" // String | Unique identifier of a feed

// Get feed
CatalogsAPI.feedsGet(feedId: feedId) { (response, error) in
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

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsList**
```swift
    open class func feedsList(bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

// List feeds
CatalogsAPI.feedsList(bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feedsUpdate**
```swift
    open class func feedsUpdate(feedId: String, catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest, completion: @escaping (_ data: CatalogsFeed?, _ error: Error?) -> Void)
```

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let feedId = "feedId_example" // String | Unique identifier of a feed
let catalogsFeedsUpdateRequest = CatalogsFeedsUpdateRequest(defaultAvailability: ProductAvailabilityType(), defaultCurrency: NullableCurrency(), name: "name_example", format: CatalogsFormat(), credentials: CatalogsFeedCredentials(password: "password_example", username: "username_example"), location: "location_example", preferredProcessingSchedule: CatalogsFeedProcessingSchedule(time: "time_example", timezone: "timezone_example"), status: CatalogsStatus()) // CatalogsFeedsUpdateRequest | Request object used to update a feed.

// Update feed
CatalogsAPI.feedsUpdate(feedId: feedId, catalogsFeedsUpdateRequest: catalogsFeedsUpdateRequest) { (response, error) in
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
 **catalogsFeedsUpdateRequest** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md) | Request object used to update a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsBatchGet**
```swift
    open class func itemsBatchGet(batchId: String, completion: @escaping (_ data: CatalogsItemsBatch?, _ error: Error?) -> Void)
```

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let batchId = "batchId_example" // String | Id of a catalogs items batch to fetch

// Get catalogs items batch
CatalogsAPI.itemsBatchGet(batchId: batchId) { (response, error) in
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

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsBatchPost**
```swift
    open class func itemsBatchPost(catalogsItemsBatchRequest: CatalogsItemsBatchRequest, completion: @escaping (_ data: CatalogsItemsBatch?, _ error: Error?) -> Void)
```

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogsItemsBatchRequest = CatalogsItemsBatchRequest(country: Country(), language: Language(), operation: BatchOperation(), items: [ItemBatchRecord(itemId: "itemId_example", attributes: ItemAttributes(adLink: "adLink_example", additionalImageLink: ["additionalImageLink_example"], adult: true, ageGroup: "ageGroup_example", availability: "availability_example", averageReviewRating: 123, brand: "brand_example", color: "color_example", condition: "condition_example", customLabel0: "customLabel0_example", customLabel1: "customLabel1_example", customLabel2: "customLabel2_example", customLabel3: "customLabel3_example", customLabel4: "customLabel4_example", description: "description_example", freeShippingLabel: true, freeShippingLimit: "freeShippingLimit_example", gender: "gender_example", googleProductCategory: "googleProductCategory_example", gtin: 123, id: "id_example", imageLink: ["imageLink_example"], itemGroupId: "itemGroupId_example", lastUpdatedTime: 123, link: "link_example", material: "material_example", minAdPrice: "minAdPrice_example", mobileLink: "mobileLink_example", mpn: "mpn_example", numberOfRatings: 123, numberOfReviews: 123, pattern: "pattern_example", price: "price_example", productType: "productType_example", salePrice: "salePrice_example", shipping: "shipping_example", shippingHeight: "shippingHeight_example", shippingWeight: "shippingWeight_example", shippingWidth: "shippingWidth_example", size: "size_example", sizeSystem: "sizeSystem_example", sizeType: "sizeType_example", tax: "tax_example", title: "title_example"))]) // CatalogsItemsBatchRequest | Request object used to create catalogs items in a batch

// Perform an operation on an item batch
CatalogsAPI.itemsBatchPost(catalogsItemsBatchRequest: catalogsItemsBatchRequest) { (response, error) in
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
 **catalogsItemsBatchRequest** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md) | Request object used to create catalogs items in a batch | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemsGet**
```swift
    open class func itemsGet(country: String, itemIds: [String], language: String, completion: @escaping (_ data: CatalogsItems?, _ error: Error?) -> Void)
```

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let country = "country_example" // String | Country for the Catalogs Items
let itemIds = ["inner_example"] // [String] | Catalos Item ids
let language = "language_example" // String | Language for the Catalogs Items

// Get catalogs items
CatalogsAPI.itemsGet(country: country, itemIds: itemIds, language: language) { (response, error) in
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
 **itemIds** | [**[String]**](String.md) | Catalos Item ids | 
 **language** | **String** | Language for the Catalogs Items | 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

