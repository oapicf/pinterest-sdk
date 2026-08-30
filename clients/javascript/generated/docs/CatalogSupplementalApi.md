# PinterestSdk.CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsLocalInventoryItemsBatchOperate**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogsLocalInventoryItemsPost**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogsLocalStoresCreate**](CatalogSupplementalApi.md#catalogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogsLocalStoresDelete**](CatalogSupplementalApi.md#catalogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogsLocalStoresList**](CatalogSupplementalApi.md#catalogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogsLocalStoresUpdate**](CatalogSupplementalApi.md#catalogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogsSupplementalItemsBatchGet**](CatalogSupplementalApi.md#catalogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status



## catalogsLocalInventoryItemsBatchOperate

> SupplementalItemsBatchResponse catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, opts)

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogSupplementalApi();
let catalogId = "catalogId_example"; // String | Unique identifier of a catalog.
let localInventoryItemsBatchCreate = new PinterestSdk.LocalInventoryItemsBatchCreate(); // LocalInventoryItemsBatchCreate | 
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | 
 **localInventoryItemsBatchCreate** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md)|  | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsLocalInventoryItemsPost

> LocalInventoryItemsGet catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, opts)

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogSupplementalApi();
let catalogId = "catalogId_example"; // String | Unique identifier of a catalog.
let localInventoryItemsGetCreate = new PinterestSdk.LocalInventoryItemsGetCreate(); // LocalInventoryItemsGetCreate | 
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | 
 **localInventoryItemsGetCreate** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md)|  | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsLocalStoresCreate

> [CatalogsLocalStoresCreate200ResponseInner] catalogsLocalStoresCreate(catalogId, localStoreCreate, opts)

Create local stores

Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogSupplementalApi();
let catalogId = "catalogId_example"; // String | Unique identifier of a catalog.
let localStoreCreate = [new PinterestSdk.LocalStoreCreate()]; // [LocalStoreCreate] | 
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsLocalStoresCreate(catalogId, localStoreCreate, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | 
 **localStoreCreate** | [**[LocalStoreCreate]**](LocalStoreCreate.md)|  | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**[CatalogsLocalStoresCreate200ResponseInner]**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsLocalStoresDelete

> [CatalogsLocalStoresDelete200ResponseInner] catalogsLocalStoresDelete(catalogId, ids, opts)

Delete local stores

  Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogSupplementalApi();
let catalogId = "catalogId_example"; // String | Unique identifier of a catalog.
let ids = ["null"]; // [String] | List of local store IDs to filter by.
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsLocalStoresDelete(catalogId, ids, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | 
 **ids** | [**[String]**](String.md)| List of local store IDs to filter by. | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**[CatalogsLocalStoresDelete200ResponseInner]**](CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsLocalStoresList

> CatalogsLocalStoresList200Response catalogsLocalStoresList(catalogId, opts)

List local stores

Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogSupplementalApi();
let catalogId = "catalogId_example"; // String | Unique identifier of a catalog.
let opts = {
  'ids': ["null"], // [String] | List of local store IDs to filter by.
  'adAccountId': "adAccountId_example", // String | Unique identifier of an ad account.
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25 // Number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
};
apiInstance.catalogsLocalStoresList(catalogId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | 
 **ids** | [**[String]**](String.md)| List of local store IDs to filter by. | [optional] 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsLocalStoresUpdate

> [CatalogsLocalStoresCreate200ResponseInner] catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, opts)

Update local stores

  Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogSupplementalApi();
let catalogId = "catalogId_example"; // String | Unique identifier of a catalog.
let localStoreBatchUpdate = [new PinterestSdk.LocalStoreBatchUpdate()]; // [LocalStoreBatchUpdate] | 
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | 
 **localStoreBatchUpdate** | [**[LocalStoreBatchUpdate]**](LocalStoreBatchUpdate.md)|  | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**[CatalogsLocalStoresCreate200ResponseInner]**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsSupplementalItemsBatchGet

> SupplementalItemsBatchResponse catalogsSupplementalItemsBatchGet(catalogId, batchId, opts)

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogSupplementalApi();
let catalogId = "catalogId_example"; // String | Unique identifier of a catalog.
let batchId = "batchId_example"; // String | Unique identifier of an items batch operation.
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsSupplementalItemsBatchGet(catalogId, batchId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **String**| Unique identifier of a catalog. | 
 **batchId** | **String**| Unique identifier of an items batch operation. | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

