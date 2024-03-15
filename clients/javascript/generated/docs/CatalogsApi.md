# PinterestSdk.CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsList**](CatalogsApi.md#catalogsList) | **GET** /catalogs | List catalogs
[**catalogsProductGroupPinsList**](CatalogsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
[**catalogsProductGroupsCreate**](CatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsDelete**](CatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsGet**](CatalogsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](CatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](CatalogsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
[**catalogsProductGroupsUpdate**](CatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResultsList**](CatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feedsCreate**](CatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](CatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](CatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsList**](CatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](CatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](CatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
[**itemsBatchPost**](CatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**itemsGet**](CatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items
[**itemsIssuesList**](CatalogsApi.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
[**productsByProductGroupFilterList**](CatalogsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products



## catalogsList

> CatalogsList200Response catalogsList(opts)

List catalogs

Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsList(opts, (error, data, response) => {
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
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupPinsList

> CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(productGroupId, opts)

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsProductGroupPinsList(productGroupId, opts, (error, data, response) => {
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
 **productGroupId** | **String**| Unique identifier of a product group | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsCreate

> CatalogsProductGroupsCreate201Response catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, opts)

Create product group

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let catalogsProductGroupsCreateRequest = {"name":"Few Filters using \"all_of\"","feed_id":"2680059592705","featured":false,"filters":{"all_of":[{"MIN_PRICE":{"values":999.99,"inclusion":true}},{"CURRENCY":{"values":"USD"}},{"CUSTOM_LABEL_0":{"values":["Luxury Items"]}}]}}; // CatalogsProductGroupsCreateRequest | Request object used to created a catalogs product group.
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, opts, (error, data, response) => {
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
 **catalogsProductGroupsCreateRequest** | [**CatalogsProductGroupsCreateRequest**](CatalogsProductGroupsCreateRequest.md)| Request object used to created a catalogs product group. | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsProductGroupsDelete

> catalogsProductGroupsDelete(productGroupId, opts)

Delete product group

Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsProductGroupsDelete(productGroupId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String**| Unique identifier of a product group | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsGet

> CatalogsProductGroupsCreate201Response catalogsProductGroupsGet(productGroupId, opts)

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsProductGroupsGet(productGroupId, opts, (error, data, response) => {
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
 **productGroupId** | **String**| Unique identifier of a product group | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsList

> CatalogsProductGroupsList200Response catalogsProductGroupsList(opts)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let opts = {
  'feedId': "feedId_example", // String | Filter entities for a given feed_id. If not given, all feeds are considered.
  'catalogId': "catalogId_example", // String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsProductGroupsList(opts, (error, data, response) => {
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
 **feedId** | **String**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **catalogId** | **String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsProductCountsGet

> CatalogsProductGroupProductCounts catalogsProductGroupsProductCountsGet(productGroupId, opts)

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsProductGroupsProductCountsGet(productGroupId, opts, (error, data, response) => {
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
 **productGroupId** | **String**| Unique identifier of a product group | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupProductCounts**](CatalogsProductGroupProductCounts.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsUpdate

> CatalogsProductGroupsCreate201Response catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, opts)

Update product group

Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let productGroupId = "productGroupId_example"; // String | Unique identifier of a product group
let catalogsProductGroupsUpdateRequest = new PinterestSdk.CatalogsProductGroupsUpdateRequest(); // CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, opts, (error, data, response) => {
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
 **productGroupId** | **String**| Unique identifier of a product group | 
 **catalogsProductGroupsUpdateRequest** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md)| Request object used to Update a catalogs product group. | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## feedProcessingResultsList

> FeedProcessingResultsList200Response feedProcessingResultsList(feedId, opts)

List processing results for a given feed

Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let feedId = "feedId_example"; // String | Unique identifier of a feed
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.feedProcessingResultsList(feedId, opts, (error, data, response) => {
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
 **feedId** | **String**| Unique identifier of a feed | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**FeedProcessingResultsList200Response**](FeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feedsCreate

> CatalogsFeed feedsCreate(feedsCreateRequest, opts)

Create feed

Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let feedsCreateRequest = new PinterestSdk.FeedsCreateRequest(); // FeedsCreateRequest | Request object used to created a feed.
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.feedsCreate(feedsCreateRequest, opts, (error, data, response) => {
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
 **feedsCreateRequest** | [**FeedsCreateRequest**](FeedsCreateRequest.md)| Request object used to created a feed. | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## feedsDelete

> feedsDelete(feedId, opts)

Delete feed

Delete a feed owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let feedId = "feedId_example"; // String | Unique identifier of a feed
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.feedsDelete(feedId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **String**| Unique identifier of a feed | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feedsGet

> CatalogsFeed feedsGet(feedId, opts)

Get feed

Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let feedId = "feedId_example"; // String | Unique identifier of a feed
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.feedsGet(feedId, opts, (error, data, response) => {
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
 **feedId** | **String**| Unique identifier of a feed | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feedsList

> FeedsList200Response feedsList(opts)

List feeds

Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  'catalogId': "catalogId_example", // String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.feedsList(opts, (error, data, response) => {
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
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **catalogId** | **String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**FeedsList200Response**](FeedsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feedsUpdate

> CatalogsFeed feedsUpdate(feedId, feedsUpdateRequest, opts)

Update feed

Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let feedId = "feedId_example"; // String | Unique identifier of a feed
let feedsUpdateRequest = new PinterestSdk.FeedsUpdateRequest(); // FeedsUpdateRequest | Request object used to update a feed.
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.feedsUpdate(feedId, feedsUpdateRequest, opts, (error, data, response) => {
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
 **feedId** | **String**| Unique identifier of a feed | 
 **feedsUpdateRequest** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md)| Request object used to update a feed. | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## itemsBatchGet

> CatalogsItemsBatch itemsBatchGet(batchId, opts)

Get catalogs item batch status

Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let batchId = 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e; // String | Id of a catalogs items batch to fetch
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.itemsBatchGet(batchId, opts, (error, data, response) => {
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
 **batchId** | **String**| Id of a catalogs items batch to fetch | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemsBatchPost

> CatalogsItemsBatch itemsBatchPost(itemsBatchPostRequest, opts)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let itemsBatchPostRequest = new PinterestSdk.ItemsBatchPostRequest(); // ItemsBatchPostRequest | Request object used to create catalogs items in a batch
let opts = {
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.itemsBatchPost(itemsBatchPostRequest, opts, (error, data, response) => {
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
 **itemsBatchPostRequest** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## itemsGet

> CatalogsItems itemsGet(country, language, opts)

Get catalogs items

Get the items of the catalog owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let country = US; // String | Country for the Catalogs Items
let language = EN; // String | Language for the Catalogs Items
let opts = {
  'adAccountId': "adAccountId_example", // String | Unique identifier of an ad account.
  'itemIds': ["CR123"], // [String] | This parameter is deprecated. Use filters instead.
  'filters': new PinterestSdk.CatalogsItemsFilters() // CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter.
};
apiInstance.itemsGet(country, language, opts, (error, data, response) => {
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
 **country** | **String**| Country for the Catalogs Items | 
 **language** | **String**| Language for the Catalogs Items | 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **itemIds** | [**[String]**](String.md)| This parameter is deprecated. Use filters instead. | [optional] 
 **filters** | [**CatalogsItemsFilters**](.md)| Identifies items to be retrieved. This is a required parameter. | [optional] 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemsIssuesList

> ItemsIssuesList200Response itemsIssuesList(processingResultId, opts)

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let processingResultId = 5224831246441439241; // String | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  'itemNumbers': [1,5], // [Number] | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
  'itemValidationIssue': TITLE_MISSING, // CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue.
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.itemsIssuesList(processingResultId, opts, (error, data, response) => {
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
 **processingResultId** | **String**| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **itemNumbers** | [**[Number]**](Number.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] 
 **itemValidationIssue** | [**CatalogsItemValidationIssue**](.md)| Filter item validation issues that have a given type of item validation issue. | [optional] 
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productsByProductGroupFilterList

> CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(catalogsListProductsByFilterRequest, opts)

List filtered products

List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.CatalogsApi();
let catalogsListProductsByFilterRequest = new PinterestSdk.CatalogsListProductsByFilterRequest(); // CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  'adAccountId': "adAccountId_example" // String | Unique identifier of an ad account.
};
apiInstance.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, opts, (error, data, response) => {
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
 **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

