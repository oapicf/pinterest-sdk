# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**catalogsList**](CatalogsApi.md#catalogsList) | **GET** /catalogs | List catalogs |
| [**catalogsProductGroupPinsList**](CatalogsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group |
| [**catalogsProductGroupsCreate**](CatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group |
| [**catalogsProductGroupsDelete**](CatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
| [**catalogsProductGroupsGet**](CatalogsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
| [**catalogsProductGroupsList**](CatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups |
| [**catalogsProductGroupsProductCountsGet**](CatalogsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group |
| [**catalogsProductGroupsUpdate**](CatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group |
| [**feedProcessingResultsList**](CatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed |
| [**feedsCreate**](CatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed |
| [**feedsDelete**](CatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
| [**feedsGet**](CatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed |
| [**feedsList**](CatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds |
| [**feedsUpdate**](CatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
| [**itemsBatchGet**](CatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status |
| [**itemsBatchPost**](CatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch |
| [**itemsGet**](CatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items |
| [**itemsIssuesList**](CatalogsApi.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result |
| [**productsByProductGroupFilterList**](CatalogsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products |


## Creating CatalogsApi

To initiate an instance of `CatalogsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.CatalogsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(CatalogsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    CatalogsApi catalogsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="catalogsList"></a>
# **catalogsList**
```java
Mono<CatalogsList200Response> CatalogsApi.catalogsList(bookmarkpageSizeadAccountId)
```

List catalogs

Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="catalogsProductGroupPinsList"></a>
# **catalogsProductGroupPinsList**
```java
Mono<CatalogsProductGroupPinsList200Response> CatalogsApi.catalogsProductGroupPinsList(productGroupIdbookmarkpageSizeadAccountId)
```

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productGroupId** | `String`| Unique identifier of a product group | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `catalogs:read`, `pins:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="catalogsProductGroupsCreate"></a>
# **catalogsProductGroupsCreate**
```java
Mono<CatalogsProductGroupsCreate201Response> CatalogsApi.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestadAccountId)
```

Create product group

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogsProductGroupsCreateRequest** | [**CatalogsProductGroupsCreateRequest**](CatalogsProductGroupsCreateRequest.md)| Request object used to created a catalogs product group. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="catalogsProductGroupsDelete"></a>
# **catalogsProductGroupsDelete**
```java
Mono<Void> CatalogsApi.catalogsProductGroupsDelete(productGroupIdadAccountId)
```

Delete product group

Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productGroupId** | `String`| Unique identifier of a product group | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |




### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="catalogsProductGroupsGet"></a>
# **catalogsProductGroupsGet**
```java
Mono<CatalogsProductGroupsCreate201Response> CatalogsApi.catalogsProductGroupsGet(productGroupIdadAccountId)
```

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productGroupId** | `String`| Unique identifier of a product group | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="catalogsProductGroupsList"></a>
# **catalogsProductGroupsList**
```java
Mono<CatalogsProductGroupsList200Response> CatalogsApi.catalogsProductGroupsList(feedIdcatalogIdbookmarkpageSizeadAccountId)
```

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedId** | `String`| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional parameter] |
| **catalogId** | `String`| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional parameter] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="catalogsProductGroupsProductCountsGet"></a>
# **catalogsProductGroupsProductCountsGet**
```java
Mono<CatalogsProductGroupProductCounts> CatalogsApi.catalogsProductGroupsProductCountsGet(productGroupIdadAccountId)
```

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productGroupId** | `String`| Unique identifier of a product group | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsProductGroupProductCounts**](CatalogsProductGroupProductCounts.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="catalogsProductGroupsUpdate"></a>
# **catalogsProductGroupsUpdate**
```java
Mono<CatalogsProductGroupsCreate201Response> CatalogsApi.catalogsProductGroupsUpdate(productGroupIdcatalogsProductGroupsUpdateRequestadAccountId)
```

Update product group

Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productGroupId** | `String`| Unique identifier of a product group | |
| **catalogsProductGroupsUpdateRequest** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md)| Request object used to Update a catalogs product group. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="feedProcessingResultsList"></a>
# **feedProcessingResultsList**
```java
Mono<FeedProcessingResultsList200Response> CatalogsApi.feedProcessingResultsList(feedIdbookmarkpageSizeadAccountId)
```

List processing results for a given feed

Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedId** | `String`| Unique identifier of a feed | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**FeedProcessingResultsList200Response**](FeedProcessingResultsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="feedsCreate"></a>
# **feedsCreate**
```java
Mono<CatalogsFeed> CatalogsApi.feedsCreate(feedsCreateRequestadAccountId)
```

Create feed

Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedsCreateRequest** | [**FeedsCreateRequest**](FeedsCreateRequest.md)| Request object used to created a feed. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsFeed**](CatalogsFeed.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="feedsDelete"></a>
# **feedsDelete**
```java
Mono<Void> CatalogsApi.feedsDelete(feedIdadAccountId)
```

Delete feed

Delete a feed owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedId** | `String`| Unique identifier of a feed | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |




### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="feedsGet"></a>
# **feedsGet**
```java
Mono<CatalogsFeed> CatalogsApi.feedsGet(feedIdadAccountId)
```

Get feed

Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedId** | `String`| Unique identifier of a feed | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsFeed**](CatalogsFeed.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="feedsList"></a>
# **feedsList**
```java
Mono<FeedsList200Response> CatalogsApi.feedsList(bookmarkpageSizecatalogIdadAccountId)
```

List feeds

Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **catalogId** | `String`| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional parameter] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**FeedsList200Response**](FeedsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="feedsUpdate"></a>
# **feedsUpdate**
```java
Mono<CatalogsFeed> CatalogsApi.feedsUpdate(feedIdfeedsUpdateRequestadAccountId)
```

Update feed

Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedId** | `String`| Unique identifier of a feed | |
| **feedsUpdateRequest** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md)| Request object used to update a feed. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsFeed**](CatalogsFeed.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="itemsBatchGet"></a>
# **itemsBatchGet**
```java
Mono<CatalogsItemsBatch> CatalogsApi.itemsBatchGet(batchIdadAccountId)
```

Get catalogs item batch status

Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchId** | `String`| Id of a catalogs items batch to fetch | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemsBatchPost"></a>
# **itemsBatchPost**
```java
Mono<CatalogsItemsBatch> CatalogsApi.itemsBatchPost(itemsBatchPostRequestadAccountId)
```

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemsBatchPostRequest** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="itemsGet"></a>
# **itemsGet**
```java
Mono<CatalogsItems> CatalogsApi.itemsGet(countrylanguageadAccountIditemIdsfilters)
```

Get catalogs items

Get the items of the catalog owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **country** | `String`| Country for the Catalogs Items | |
| **language** | `String`| Language for the Catalogs Items | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |
| **itemIds** | [**List&lt;String&gt;**](String.md)| This parameter is deprecated. Use filters instead. | [optional parameter] |
| **filters** | [**CatalogsItemsFilters**](.md)| Identifies items to be retrieved. This is a required parameter. | [optional parameter] |


### Return type
[**CatalogsItems**](CatalogsItems.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemsIssuesList"></a>
# **itemsIssuesList**
```java
Mono<ItemsIssuesList200Response> CatalogsApi.itemsIssuesList(processingResultIdbookmarkpageSizeitemNumbersitemValidationIssueadAccountId)
```

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **processingResultId** | `String`| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **itemNumbers** | [**List&lt;Integer&gt;**](Integer.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional parameter] |
| **itemValidationIssue** | [**CatalogsItemValidationIssue**](.md)| Filter item validation issues that have a given type of item validation issue. | [optional parameter] [enum: `AD_LINK_FORMAT_WARNING`, `AD_LINK_SAME_AS_LINK`, `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`, `ADDITIONAL_IMAGE_LINK_WARNING`, `ADULT_INVALID`, `ADWORDS_FORMAT_INVALID`, `ADWORDS_FORMAT_WARNING`, `ADWORDS_SAME_AS_LINK`, `AGE_GROUP_INVALID`, `ANDROID_DEEP_LINK_INVALID`, `AVAILABILITY_DATE_INVALID`, `AVAILABILITY_INVALID`, `BLOCKLISTED_IMAGE_SIGNATURE`, `COUNTRY_DOES_NOT_MAP_TO_CURRENCY`, `CUSTOM_LABEL_LENGTH_TOO_LONG`, `DESCRIPTION_LENGTH_TOO_LONG`, `DESCRIPTION_MISSING`, `DUPLICATE_PRODUCTS`, `EXPIRATION_DATE_INVALID`, `GENDER_INVALID`, `GTIN_INVALID`, `IMAGE_LINK_INVALID`, `IMAGE_LINK_LENGTH_TOO_LONG`, `IMAGE_LINK_MISSING`, `IMAGE_LINK_WARNING`, `INVALID_DOMAIN`, `IOS_DEEP_LINK_INVALID`, `IS_BUNDLE_INVALID`, `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`, `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`, `ITEMID_MISSING`, `LINK_FORMAT_INVALID`, `LINK_FORMAT_WARNING`, `LINK_LENGTH_TOO_LONG`, `LIST_PRICE_INVALID`, `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`, `MIN_AD_PRICE_INVALID`, `MPN_INVALID`, `MULTIPACK_INVALID`, `OPTIONAL_CONDITION_INVALID`, `OPTIONAL_CONDITION_MISSING`, `OPTIONAL_PRODUCT_CATEGORY_INVALID`, `OPTIONAL_PRODUCT_CATEGORY_MISSING`, `PARSE_LINE_ERROR`, `PINJOIN_CONTENT_UNSAFE`, `PRICE_CANNOT_BE_DETERMINED`, `PRICE_MISSING`, `PRODUCT_CATEGORY_DEPTH_WARNING`, `PRODUCT_LINK_MISSING`, `PRODUCT_PRICE_INVALID`, `PRODUCT_TYPE_LENGTH_TOO_LONG`, `SALE_DATE_INVALID`, `SALES_PRICE_INVALID`, `SALES_PRICE_TOO_HIGH`, `SALES_PRICE_TOO_LOW`, `SHIPPING_INVALID`, `SHIPPING_HEIGHT_INVALID`, `SHIPPING_WEIGHT_INVALID`, `SHIPPING_WIDTH_INVALID`, `SIZE_SYSTEM_INVALID`, `SIZE_TYPE_INVALID`, `TAX_INVALID`, `TITLE_LENGTH_TOO_LONG`, `TITLE_MISSING`, `TOO_MANY_ADDITIONAL_IMAGE_LINKS`, `UTM_SOURCE_AUTO_CORRECTED`, `WEIGHT_UNIT_INVALID`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="productsByProductGroupFilterList"></a>
# **productsByProductGroupFilterList**
```java
Mono<CatalogsProductGroupPinsList200Response> CatalogsApi.productsByProductGroupFilterList(catalogsListProductsByFilterRequestbookmarkpageSizeadAccountId)
```

List filtered products

List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `catalogs:read`, `pins:read`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

