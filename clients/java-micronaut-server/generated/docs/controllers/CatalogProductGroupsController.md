# CatalogProductGroupsController

All URIs are relative to `"/v5"`

The controller class is defined in **[CatalogProductGroupsController.java](../../src/main/java/org/openapitools/controller/CatalogProductGroupsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupPinsList**](#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogsProductGroupsCreate**](#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsCreateMany**](#catalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**catalogsProductGroupsDelete**](#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsDeleteMany**](#catalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**catalogsProductGroupsGet**](#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogsProductGroupsUpdate**](#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**productsByProductGroupFilterList**](#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter

<a id="catalogsProductGroupPinsList"></a>
# **catalogsProductGroupPinsList**
```java
Mono<CatalogsProductGroupPinsList200Response> CatalogProductGroupsController.catalogsProductGroupPinsList(productGroupIdbookmarkpageSizeadAccountIdpinMetrics)
```

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**productGroupId** | `String` | Unique identifier of a product group |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**pinMetrics** | `Boolean` | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional parameter] [default to `false`]

### Return type
[**CatalogsProductGroupPinsList200Response**](../../docs/models/CatalogsProductGroupPinsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `catalogs:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="catalogsProductGroupsCreate"></a>
# **catalogsProductGroupsCreate**
```java
Mono<CatalogsVerticalProductGroup> CatalogProductGroupsController.catalogsProductGroupsCreate(multipleProductGroupsInneradAccountId)
```

Create product group

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**multipleProductGroupsInner** | [**MultipleProductGroupsInner**](../../docs/models/MultipleProductGroupsInner.md) | Request object used to create a single catalogs product groups. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**CatalogsVerticalProductGroup**](../../docs/models/CatalogsVerticalProductGroup.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="catalogsProductGroupsCreateMany"></a>
# **catalogsProductGroupsCreateMany**
```java
Mono<List<String>> CatalogProductGroupsController.catalogsProductGroupsCreateMany(multipleProductGroupsInneradAccountId)
```

Create product groups

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**multipleProductGroupsInner** | [**List&lt;MultipleProductGroupsInner&gt;**](../../docs/models/MultipleProductGroupsInner.md) | Request object used to create one or more catalogs product groups. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
`List&lt;String&gt;`

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="catalogsProductGroupsDelete"></a>
# **catalogsProductGroupsDelete**
```java
Mono<Object> CatalogProductGroupsController.catalogsProductGroupsDelete(productGroupIdadAccountId)
```

Delete product group

Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**productGroupId** | `String` | Unique identifier of a product group |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]


### Authorization
* **pinterest_oauth2**, scopes: `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="catalogsProductGroupsDeleteMany"></a>
# **catalogsProductGroupsDeleteMany**
```java
Mono<Object> CatalogProductGroupsController.catalogsProductGroupsDeleteMany(idadAccountId)
```

Delete product groups

Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | [**List&lt;Integer&gt;**](../../docs/models/Integer.md) | Comma-separated list of product group ids |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]


### Authorization
* **pinterest_oauth2**, scopes: `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="catalogsProductGroupsGet"></a>
# **catalogsProductGroupsGet**
```java
Mono<CatalogsVerticalProductGroup> CatalogProductGroupsController.catalogsProductGroupsGet(productGroupIdadAccountId)
```

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**productGroupId** | `String` | Unique identifier of a product group |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**CatalogsVerticalProductGroup**](../../docs/models/CatalogsVerticalProductGroup.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="catalogsProductGroupsList"></a>
# **catalogsProductGroupsList**
```java
Mono<CatalogsProductGroupsList200Response> CatalogProductGroupsController.catalogsProductGroupsList(idfeedIdcatalogIdbookmarkpageSizeadAccountId)
```

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | [**List&lt;Integer&gt;**](../../docs/models/Integer.md) | Comma-separated list of product group ids | [optional parameter]
**feedId** | `String` | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional parameter]
**catalogId** | `String` | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**CatalogsProductGroupsList200Response**](../../docs/models/CatalogsProductGroupsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="catalogsProductGroupsProductCountsGet"></a>
# **catalogsProductGroupsProductCountsGet**
```java
Mono<CatalogsProductGroupProductCountsVertical> CatalogProductGroupsController.catalogsProductGroupsProductCountsGet(productGroupIdadAccountId)
```

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**productGroupId** | `String` | Unique identifier of a product group |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**CatalogsProductGroupProductCountsVertical**](../../docs/models/CatalogsProductGroupProductCountsVertical.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="catalogsProductGroupsUpdate"></a>
# **catalogsProductGroupsUpdate**
```java
Mono<CatalogsVerticalProductGroup> CatalogProductGroupsController.catalogsProductGroupsUpdate(productGroupIdcatalogsProductGroupsUpdateRequestadAccountId)
```

Update single product group

Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**productGroupId** | `String` | Unique identifier of a product group |
**catalogsProductGroupsUpdateRequest** | [**CatalogsProductGroupsUpdateRequest**](../../docs/models/CatalogsProductGroupsUpdateRequest.md) | Request object used to Update a catalogs product group. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**CatalogsVerticalProductGroup**](../../docs/models/CatalogsVerticalProductGroup.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="productsByProductGroupFilterList"></a>
# **productsByProductGroupFilterList**
```java
Mono<CatalogsProductGroupPinsList200Response> CatalogProductGroupsController.productsByProductGroupFilterList(catalogsListProductsByFilterRequestbookmarkpageSizeadAccountIdpinMetrics)
```

List products by filter

List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](../../docs/models/CatalogsListProductsByFilterRequest.md) | Object holding a group of filters for a catalog product group |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**pinMetrics** | `Boolean` | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional parameter] [default to `false`]

### Return type
[**CatalogsProductGroupPinsList200Response**](../../docs/models/CatalogsProductGroupPinsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `catalogs:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

