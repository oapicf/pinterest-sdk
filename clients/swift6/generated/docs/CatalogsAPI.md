# CatalogsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsAvailableFilterValues**](CatalogsAPI.md#catalogsavailablefiltervalues) | **GET** /catalogs/available_filter_values | List available filter values
[**catalogsCreate**](CatalogsAPI.md#catalogscreate) | **POST** /catalogs | Create catalog
[**catalogsList**](CatalogsAPI.md#catalogslist) | **GET** /catalogs | List catalogs


# **catalogsAvailableFilterValues**
```swift
    open class func catalogsAvailableFilterValues(catalogId: String, feedId: String? = nil, country: Country? = nil, language: CatalogsLocale? = nil, adAccountId: String? = nil, completion: @escaping (_ data: CatalogsAvailableFilterValues?, _ error: Error?) -> Void)
```

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogId = "catalogId_example" // String | Filter entities for a given catalog_id.
let feedId = "feedId_example" // String | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
let country = Country() // Country | Country for the Catalogs Items (optional)
let language = CatalogsLocale() // CatalogsLocale | Language for the Catalogs Items (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// List available filter values
CatalogsAPI.catalogsAvailableFilterValues(catalogId: catalogId, feedId: feedId, country: country, language: language, adAccountId: adAccountId) { (response, error) in
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
 **catalogId** | **String** | Filter entities for a given catalog_id. | 
 **feedId** | **String** | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **country** | [**Country**](.md) | Country for the Catalogs Items | [optional] 
 **language** | [**CatalogsLocale**](.md) | Language for the Catalogs Items | [optional] 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsAvailableFilterValues**](CatalogsAvailableFilterValues.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsCreate**
```swift
    open class func catalogsCreate(catalogCreate: CatalogCreate, adAccountId: String? = nil, completion: @escaping (_ data: Catalog?, _ error: Error?) -> Void)
```

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let catalogCreate = CatalogCreate(catalogType: CatalogsType(), name: "name_example") // CatalogCreate | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create catalog
CatalogsAPI.catalogsCreate(catalogCreate: catalogCreate, adAccountId: adAccountId) { (response, error) in
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
 **catalogCreate** | [**CatalogCreate**](CatalogCreate.md) |  | 
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
    open class func catalogsList(adAccountId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: CatalogsList200Response?, _ error: Error?) -> Void)
```

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List catalogs
CatalogsAPI.catalogsList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

