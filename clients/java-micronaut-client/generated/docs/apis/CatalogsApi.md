# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupsCreate**](CatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsDelete**](CatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsList**](CatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | Get product groups list
[**catalogsProductGroupsUpdate**](CatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResultsList**](CatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feedsCreate**](CatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](CatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](CatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsList**](CatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](CatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](CatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**itemsBatchPost**](CatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**itemsGet**](CatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items


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

<a name="catalogsProductGroupsCreate"></a>
# **catalogsProductGroupsCreate**
```java
Mono<Object> CatalogsApi.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest)
```

Create product group

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupCreateRequest** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. |


### Return type
`Object`

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a name="catalogsProductGroupsDelete"></a>
# **catalogsProductGroupsDelete**
```java
Mono<Void> CatalogsApi.catalogsProductGroupsDelete(productGroupId)
```

Delete product group

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | `String`| Unique identifier of a product group |




### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="catalogsProductGroupsList"></a>
# **catalogsProductGroupsList**
```java
Mono<Paginated> CatalogsApi.catalogsProductGroupsList(feedIdbookmarkpageSize)
```

Get product groups list

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | `String`| Unique identifier of a feed |
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="catalogsProductGroupsUpdate"></a>
# **catalogsProductGroupsUpdate**
```java
Mono<CatalogsProductGroup> CatalogsApi.catalogsProductGroupsUpdate(productGroupIdcatalogsProductGroupUpdateRequest)
```

Update product group

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | `String`| Unique identifier of a product group |
 **catalogsProductGroupUpdateRequest** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. |


### Return type
[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a name="feedProcessingResultsList"></a>
# **feedProcessingResultsList**
```java
Mono<Paginated> CatalogsApi.feedProcessingResultsList(feedIdbookmarkpageSize)
```

List processing results for a given feed

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | `String`| Unique identifier of a feed |
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="feedsCreate"></a>
# **feedsCreate**
```java
Mono<CatalogsFeed> CatalogsApi.feedsCreate(catalogsFeedsCreateRequest)
```

Create feed

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsFeedsCreateRequest** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md)| Request object used to created a feed. |


### Return type
[**CatalogsFeed**](CatalogsFeed.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a name="feedsDelete"></a>
# **feedsDelete**
```java
Mono<Void> CatalogsApi.feedsDelete(feedId)
```

Delete feed

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | `String`| Unique identifier of a feed |




### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="feedsGet"></a>
# **feedsGet**
```java
Mono<CatalogsFeed> CatalogsApi.feedsGet(feedId)
```

Get feed

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | `String`| Unique identifier of a feed |


### Return type
[**CatalogsFeed**](CatalogsFeed.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="feedsList"></a>
# **feedsList**
```java
Mono<Paginated> CatalogsApi.feedsList(bookmarkpageSize)
```

List feeds

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="feedsUpdate"></a>
# **feedsUpdate**
```java
Mono<CatalogsFeed> CatalogsApi.feedsUpdate(feedIdcatalogsFeedsUpdateRequest)
```

Update feed

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | `String`| Unique identifier of a feed |
 **catalogsFeedsUpdateRequest** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. |


### Return type
[**CatalogsFeed**](CatalogsFeed.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a name="itemsBatchGet"></a>
# **itemsBatchGet**
```java
Mono<CatalogsItemsBatch> CatalogsApi.itemsBatchGet(batchId)
```

Get catalogs items batch

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | `String`| Id of a catalogs items batch to fetch |


### Return type
[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="itemsBatchPost"></a>
# **itemsBatchPost**
```java
Mono<CatalogsItemsBatch> CatalogsApi.itemsBatchPost(catalogsItemsBatchRequest)
```

Perform an operation on an item batch

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsBatchRequest** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch |


### Return type
[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a name="itemsGet"></a>
# **itemsGet**
```java
Mono<CatalogsItems> CatalogsApi.itemsGet(countryitemIdslanguage)
```

Get catalogs items

Get the items of the catalog created by the \&quot;operating user_account\&quot;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | `String`| Country for the Catalogs Items |
 **itemIds** | [**List&lt;String&gt;**](String.md)| Catalos Item ids |
 **language** | `String`| Language for the Catalogs Items |


### Return type
[**CatalogsItems**](CatalogsItems.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

