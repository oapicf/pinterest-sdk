# CatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupPinsList**](CatalogProductGroupsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogsProductGroupsCreate**](CatalogProductGroupsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsCreateMany**](CatalogProductGroupsApi.md#catalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**catalogsProductGroupsDelete**](CatalogProductGroupsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsDeleteMany**](CatalogProductGroupsApi.md#catalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**catalogsProductGroupsGet**](CatalogProductGroupsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](CatalogProductGroupsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](CatalogProductGroupsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogsProductGroupsUpdate**](CatalogProductGroupsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**productsByProductGroupFilterList**](CatalogProductGroupsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter



## catalogsProductGroupPinsList

> CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize)

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogProductGroupsApi;

CatalogProductGroupsApi apiInstance = new CatalogProductGroupsApi();
String productGroupId = null; // String | Unique identifier of a product group
String adAccountId = null; // String | Unique identifier of an ad account.
Boolean pinMetrics = false; // Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    CatalogsProductGroupPinsList200Response result = apiInstance.catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductGroupsApi#catalogsProductGroupPinsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String**| Unique identifier of a product group | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **pinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsCreate

> CatalogsVerticalProductGroup catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId)

Create product group

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogProductGroupsApi;

CatalogProductGroupsApi apiInstance = new CatalogProductGroupsApi();
CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema = new CatalogsProductGroupsCreateRequestSchema(); // CatalogsProductGroupsCreateRequestSchema | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    CatalogsVerticalProductGroup result = apiInstance.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductGroupsApi#catalogsProductGroupsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateRequestSchema** | [**CatalogsProductGroupsCreateRequestSchema**](CatalogsProductGroupsCreateRequestSchema.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsProductGroupsCreateMany

> List&lt;String&gt; catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId)

Create product groups

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogProductGroupsApi;

CatalogProductGroupsApi apiInstance = new CatalogProductGroupsApi();
List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems = Arrays.asList(new CatalogsProductGroupsCreateManyRequestItems()); // List<CatalogsProductGroupsCreateManyRequestItems> | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    List<String> result = apiInstance.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductGroupsApi#catalogsProductGroupsCreateMany");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateManyRequestItems** | [**List&lt;CatalogsProductGroupsCreateManyRequestItems&gt;**](CatalogsProductGroupsCreateManyRequestItems.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

**List&lt;String&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogsProductGroupsDelete

> CatalogsVerticalProductGroup catalogsProductGroupsDelete(productGroupId, adAccountId)

Delete product group

Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogProductGroupsApi;

CatalogProductGroupsApi apiInstance = new CatalogProductGroupsApi();
String productGroupId = null; // String | Unique identifier of a product group
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    CatalogsVerticalProductGroup result = apiInstance.catalogsProductGroupsDelete(productGroupId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductGroupsApi#catalogsProductGroupsDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String**| Unique identifier of a product group | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsDeleteMany

> catalogsProductGroupsDeleteMany(id, adAccountId)

Delete product groups

Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogProductGroupsApi;

CatalogProductGroupsApi apiInstance = new CatalogProductGroupsApi();
List<Integer> id = null; // List<Integer> | Comma-separated list of product group ids
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    apiInstance.catalogsProductGroupsDeleteMany(id, adAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductGroupsApi#catalogsProductGroupsDeleteMany");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Integer&gt;**](Integer.md)| Comma-separated list of product group ids | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsGet

> CatalogsVerticalProductGroup catalogsProductGroupsGet(productGroupId, adAccountId)

Get product group

Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogProductGroupsApi;

CatalogProductGroupsApi apiInstance = new CatalogProductGroupsApi();
String productGroupId = null; // String | Unique identifier of a product group
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    CatalogsVerticalProductGroup result = apiInstance.catalogsProductGroupsGet(productGroupId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductGroupsApi#catalogsProductGroupsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String**| Unique identifier of a product group | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsList

> CatalogsProductGroupsList200Response catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogProductGroupsApi;

CatalogProductGroupsApi apiInstance = new CatalogProductGroupsApi();
List<Integer> id = null; // List<Integer> | Comma-separated list of product group ids
String feedId = null; // String | Filter entities for a given feed_id. If not given, all feeds are considered.
String catalogId = null; // String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    CatalogsProductGroupsList200Response result = apiInstance.catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductGroupsApi#catalogsProductGroupsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Integer&gt;**](Integer.md)| Comma-separated list of product group ids | [optional] [default to null]
 **feedId** | **String**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] [default to null]
 **catalogId** | **String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsProductCountsGet

> CatalogsProductGroupProductCountsVertical catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogProductGroupsApi;

CatalogProductGroupsApi apiInstance = new CatalogProductGroupsApi();
String productGroupId = null; // String | Unique identifier of a product group
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    CatalogsProductGroupProductCountsVertical result = apiInstance.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductGroupsApi#catalogsProductGroupsProductCountsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String**| Unique identifier of a product group | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsProductGroupProductCountsVertical**](CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogsProductGroupsUpdate

> CatalogsVerticalProductGroup catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId)

Update single product group

Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogProductGroupsApi;

CatalogProductGroupsApi apiInstance = new CatalogProductGroupsApi();
String productGroupId = null; // String | Unique identifier of a product group
CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema = new CatalogsProductGroupsUpdateRequestSchema(); // CatalogsProductGroupsUpdateRequestSchema | 
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    CatalogsVerticalProductGroup result = apiInstance.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductGroupsApi#catalogsProductGroupsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **String**| Unique identifier of a product group | [default to null]
 **catalogsProductGroupsUpdateRequestSchema** | [**CatalogsProductGroupsUpdateRequestSchema**](CatalogsProductGroupsUpdateRequestSchema.md)|  |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productsByProductGroupFilterList

> CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics)

List products by filter

List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CatalogProductGroupsApi;

CatalogProductGroupsApi apiInstance = new CatalogProductGroupsApi();
CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest = new CatalogsListProductsByFilterRequest(); // CatalogsListProductsByFilterRequest | 
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
String adAccountId = null; // String | Unique identifier of an ad account.
Boolean pinMetrics = false; // Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
try {
    CatalogsProductGroupPinsList200Response result = apiInstance.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductGroupsApi#productsByProductGroupFilterList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)|  |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **pinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

