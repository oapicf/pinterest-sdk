# CatalogSupplementalAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsLocalInventoryItemsBatchOperate**](CatalogSupplementalAPI.md#catalogslocalinventoryitemsbatchoperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogsLocalInventoryItemsPost**](CatalogSupplementalAPI.md#catalogslocalinventoryitemspost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogsLocalStoresCreate**](CatalogSupplementalAPI.md#catalogslocalstorescreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogsLocalStoresDelete**](CatalogSupplementalAPI.md#catalogslocalstoresdelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogsLocalStoresList**](CatalogSupplementalAPI.md#catalogslocalstoreslist) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogsLocalStoresUpdate**](CatalogSupplementalAPI.md#catalogslocalstoresupdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogsSupplementalItemsBatchGet**](CatalogSupplementalAPI.md#catalogssupplementalitemsbatchget) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


# **catalogsLocalInventoryItemsBatchOperate**
```swift
    open class func catalogsLocalInventoryItemsBatchOperate(catalogId: String, localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate, adAccountId: String? = nil, completion: @escaping (_ data: SupplementalItemsBatchResponse?, _ error: Error?) -> Void)
```

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogId = "catalogId_example" // String | Unique identifier of a catalog.
let localInventoryItemsBatchCreate = LocalInventoryItemsBatchCreate(operations: [LocalInventoryOperation(attributes: RetailLocalInventoryItemAttributes(adLink: "adLink_example", availability: ItemAvailability(), price: "price_example", salePrice: "salePrice_example"), itemId: "itemId_example", operation: "operation_example", storeCode: "storeCode_example")]) // LocalInventoryItemsBatchCreate | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Operate on local inventory item batch
CatalogSupplementalAPI.catalogsLocalInventoryItemsBatchOperate(catalogId: catalogId, localInventoryItemsBatchCreate: localInventoryItemsBatchCreate, adAccountId: adAccountId) { (response, error) in
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
 **catalogId** | **String** | Unique identifier of a catalog. | 
 **localInventoryItemsBatchCreate** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsLocalInventoryItemsPost**
```swift
    open class func catalogsLocalInventoryItemsPost(catalogId: String, localInventoryItemsGetCreate: LocalInventoryItemsGetCreate, adAccountId: String? = nil, completion: @escaping (_ data: LocalInventoryItemsGet?, _ error: Error?) -> Void)
```

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogId = "catalogId_example" // String | Unique identifier of a catalog.
let localInventoryItemsGetCreate = LocalInventoryItemsGetCreate(itemFilters: [ItemIdStoreCodePair(itemId: "itemId_example", storeCode: "storeCode_example")]) // LocalInventoryItemsGetCreate | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get local inventory items (POST)
CatalogSupplementalAPI.catalogsLocalInventoryItemsPost(catalogId: catalogId, localInventoryItemsGetCreate: localInventoryItemsGetCreate, adAccountId: adAccountId) { (response, error) in
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
 **catalogId** | **String** | Unique identifier of a catalog. | 
 **localInventoryItemsGetCreate** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsLocalStoresCreate**
```swift
    open class func catalogsLocalStoresCreate(catalogId: String, localStoreCreate: [LocalStoreCreate], adAccountId: String? = nil, completion: @escaping (_ data: [CatalogsLocalStoresCreate200ResponseInner]?, _ error: Error?) -> Void)
```

Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogId = "catalogId_example" // String | Unique identifier of a catalog.
let localStoreCreate = [LocalStoreCreate(addressPrimary: "addressPrimary_example", addressSecondary: "addressSecondary_example", city: "city_example", country: Country(), latitude: 123, longitude: 123, name: "name_example", postalCode: "postalCode_example", region: "region_example", storeCode: "storeCode_example")] // [LocalStoreCreate] | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create local stores
CatalogSupplementalAPI.catalogsLocalStoresCreate(catalogId: catalogId, localStoreCreate: localStoreCreate, adAccountId: adAccountId) { (response, error) in
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
 **catalogId** | **String** | Unique identifier of a catalog. | 
 **localStoreCreate** | [**[LocalStoreCreate]**](LocalStoreCreate.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**[CatalogsLocalStoresCreate200ResponseInner]**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsLocalStoresDelete**
```swift
    open class func catalogsLocalStoresDelete(catalogId: String, ids: [String], adAccountId: String? = nil, completion: @escaping (_ data: [CatalogsLocalStoresDelete200ResponseInner]?, _ error: Error?) -> Void)
```

Delete local stores

  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogId = "catalogId_example" // String | Unique identifier of a catalog.
let ids = ["inner_example"] // [String] | List of local store IDs to filter by.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Delete local stores
CatalogSupplementalAPI.catalogsLocalStoresDelete(catalogId: catalogId, ids: ids, adAccountId: adAccountId) { (response, error) in
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
 **catalogId** | **String** | Unique identifier of a catalog. | 
 **ids** | [**[String]**](String.md) | List of local store IDs to filter by. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**[CatalogsLocalStoresDelete200ResponseInner]**](CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsLocalStoresList**
```swift
    open class func catalogsLocalStoresList(catalogId: String, ids: [String]? = nil, adAccountId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: CatalogsLocalStoresList200Response?, _ error: Error?) -> Void)
```

List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogId = "catalogId_example" // String | Unique identifier of a catalog.
let ids = ["inner_example"] // [String] | List of local store IDs to filter by. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List local stores
CatalogSupplementalAPI.catalogsLocalStoresList(catalogId: catalogId, ids: ids, adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **catalogId** | **String** | Unique identifier of a catalog. | 
 **ids** | [**[String]**](String.md) | List of local store IDs to filter by. | [optional] 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsLocalStoresUpdate**
```swift
    open class func catalogsLocalStoresUpdate(catalogId: String, localStoreBatchUpdate: [LocalStoreBatchUpdate], adAccountId: String? = nil, completion: @escaping (_ data: [CatalogsLocalStoresCreate200ResponseInner]?, _ error: Error?) -> Void)
```

Update local stores

  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogId = "catalogId_example" // String | Unique identifier of a catalog.
let localStoreBatchUpdate = [LocalStoreBatchUpdate(addressPrimary: "addressPrimary_example", addressSecondary: "addressSecondary_example", city: "city_example", country: Country(), id: "id_example", latitude: 123, longitude: 123, name: "name_example", postalCode: "postalCode_example", region: "region_example", storeCode: "storeCode_example")] // [LocalStoreBatchUpdate] | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Update local stores
CatalogSupplementalAPI.catalogsLocalStoresUpdate(catalogId: catalogId, localStoreBatchUpdate: localStoreBatchUpdate, adAccountId: adAccountId) { (response, error) in
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
 **catalogId** | **String** | Unique identifier of a catalog. | 
 **localStoreBatchUpdate** | [**[LocalStoreBatchUpdate]**](LocalStoreBatchUpdate.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**[CatalogsLocalStoresCreate200ResponseInner]**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsSupplementalItemsBatchGet**
```swift
    open class func catalogsSupplementalItemsBatchGet(catalogId: String, batchId: String, adAccountId: String? = nil, completion: @escaping (_ data: SupplementalItemsBatchResponse?, _ error: Error?) -> Void)
```

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogId = "catalogId_example" // String | Unique identifier of a catalog.
let batchId = "batchId_example" // String | Unique identifier of an items batch operation.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get supplemental items batch status
CatalogSupplementalAPI.catalogsSupplementalItemsBatchGet(catalogId: catalogId, batchId: batchId, adAccountId: adAccountId) { (response, error) in
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
 **catalogId** | **String** | Unique identifier of a catalog. | 
 **batchId** | **String** | Unique identifier of an items batch operation. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

