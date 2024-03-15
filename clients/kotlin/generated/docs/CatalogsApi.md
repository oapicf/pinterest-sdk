# CatalogsApi

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


<a id="catalogsList"></a>
# **catalogsList**
> CatalogsList200Response catalogsList(bookmark, pageSize, adAccountId)

List catalogs

Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsList200Response = apiInstance.catalogsList(bookmark, pageSize, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#catalogsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#catalogsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="catalogsProductGroupPinsList"></a>
# **catalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId)

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val productGroupId : kotlin.String = productGroupId_example // kotlin.String | Unique identifier of a product group
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsProductGroupPinsList200Response = apiInstance.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#catalogsProductGroupPinsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#catalogsProductGroupPinsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **kotlin.String**| Unique identifier of a product group |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="catalogsProductGroupsCreate"></a>
# **catalogsProductGroupsCreate**
> CatalogsProductGroupsCreate201Response catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, adAccountId)

Create product group

Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val catalogsProductGroupsCreateRequest : CatalogsProductGroupsCreateRequest = {"name":"Few Filters using \"all_of\"","feed_id":"2680059592705","featured":false,"filters":{"all_of":[{"MIN_PRICE":{"values":999.99,"inclusion":true}},{"CURRENCY":{"values":"USD"}},{"CUSTOM_LABEL_0":{"values":["Luxury Items"]}}]}} // CatalogsProductGroupsCreateRequest | Request object used to created a catalogs product group.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsProductGroupsCreate201Response = apiInstance.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#catalogsProductGroupsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#catalogsProductGroupsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateRequest** | [**CatalogsProductGroupsCreateRequest**](CatalogsProductGroupsCreateRequest.md)| Request object used to created a catalogs product group. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="catalogsProductGroupsDelete"></a>
# **catalogsProductGroupsDelete**
> catalogsProductGroupsDelete(productGroupId, adAccountId)

Delete product group

Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val productGroupId : kotlin.String = productGroupId_example // kotlin.String | Unique identifier of a product group
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    apiInstance.catalogsProductGroupsDelete(productGroupId, adAccountId)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#catalogsProductGroupsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#catalogsProductGroupsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **kotlin.String**| Unique identifier of a product group |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

null (empty response body)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="catalogsProductGroupsGet"></a>
# **catalogsProductGroupsGet**
> CatalogsProductGroupsCreate201Response catalogsProductGroupsGet(productGroupId, adAccountId)

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val productGroupId : kotlin.String = productGroupId_example // kotlin.String | Unique identifier of a product group
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsProductGroupsCreate201Response = apiInstance.catalogsProductGroupsGet(productGroupId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#catalogsProductGroupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#catalogsProductGroupsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **kotlin.String**| Unique identifier of a product group |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="catalogsProductGroupsList"></a>
# **catalogsProductGroupsList**
> CatalogsProductGroupsList200Response catalogsProductGroupsList(feedId, catalogId, bookmark, pageSize, adAccountId)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val feedId : kotlin.String = feedId_example // kotlin.String | Filter entities for a given feed_id. If not given, all feeds are considered.
val catalogId : kotlin.String = catalogId_example // kotlin.String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsProductGroupsList200Response = apiInstance.catalogsProductGroupsList(feedId, catalogId, bookmark, pageSize, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#catalogsProductGroupsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#catalogsProductGroupsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **kotlin.String**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional]
 **catalogId** | **kotlin.String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="catalogsProductGroupsProductCountsGet"></a>
# **catalogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCounts catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val productGroupId : kotlin.String = productGroupId_example // kotlin.String | Unique identifier of a product group
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsProductGroupProductCounts = apiInstance.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#catalogsProductGroupsProductCountsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#catalogsProductGroupsProductCountsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **kotlin.String**| Unique identifier of a product group |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsProductGroupProductCounts**](CatalogsProductGroupProductCounts.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="catalogsProductGroupsUpdate"></a>
# **catalogsProductGroupsUpdate**
> CatalogsProductGroupsCreate201Response catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId)

Update product group

Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val productGroupId : kotlin.String = productGroupId_example // kotlin.String | Unique identifier of a product group
val catalogsProductGroupsUpdateRequest : CatalogsProductGroupsUpdateRequest =  // CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsProductGroupsCreate201Response = apiInstance.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#catalogsProductGroupsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#catalogsProductGroupsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **kotlin.String**| Unique identifier of a product group |
 **catalogsProductGroupsUpdateRequest** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md)| Request object used to Update a catalogs product group. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="feedProcessingResultsList"></a>
# **feedProcessingResultsList**
> FeedProcessingResultsList200Response feedProcessingResultsList(feedId, bookmark, pageSize, adAccountId)

List processing results for a given feed

Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val feedId : kotlin.String = feedId_example // kotlin.String | Unique identifier of a feed
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : FeedProcessingResultsList200Response = apiInstance.feedProcessingResultsList(feedId, bookmark, pageSize, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#feedProcessingResultsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#feedProcessingResultsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **kotlin.String**| Unique identifier of a feed |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**FeedProcessingResultsList200Response**](FeedProcessingResultsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="feedsCreate"></a>
# **feedsCreate**
> CatalogsFeed feedsCreate(feedsCreateRequest, adAccountId)

Create feed

Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val feedsCreateRequest : FeedsCreateRequest =  // FeedsCreateRequest | Request object used to created a feed.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsFeed = apiInstance.feedsCreate(feedsCreateRequest, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#feedsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#feedsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedsCreateRequest** | [**FeedsCreateRequest**](FeedsCreateRequest.md)| Request object used to created a feed. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="feedsDelete"></a>
# **feedsDelete**
> feedsDelete(feedId, adAccountId)

Delete feed

Delete a feed owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val feedId : kotlin.String = feedId_example // kotlin.String | Unique identifier of a feed
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    apiInstance.feedsDelete(feedId, adAccountId)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#feedsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#feedsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **kotlin.String**| Unique identifier of a feed |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

null (empty response body)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="feedsGet"></a>
# **feedsGet**
> CatalogsFeed feedsGet(feedId, adAccountId)

Get feed

Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val feedId : kotlin.String = feedId_example // kotlin.String | Unique identifier of a feed
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsFeed = apiInstance.feedsGet(feedId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#feedsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#feedsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **kotlin.String**| Unique identifier of a feed |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="feedsList"></a>
# **feedsList**
> FeedsList200Response feedsList(bookmark, pageSize, catalogId, adAccountId)

List feeds

Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val catalogId : kotlin.String = catalogId_example // kotlin.String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : FeedsList200Response = apiInstance.feedsList(bookmark, pageSize, catalogId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#feedsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#feedsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **catalogId** | **kotlin.String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**FeedsList200Response**](FeedsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="feedsUpdate"></a>
# **feedsUpdate**
> CatalogsFeed feedsUpdate(feedId, feedsUpdateRequest, adAccountId)

Update feed

Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val feedId : kotlin.String = feedId_example // kotlin.String | Unique identifier of a feed
val feedsUpdateRequest : FeedsUpdateRequest =  // FeedsUpdateRequest | Request object used to update a feed.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsFeed = apiInstance.feedsUpdate(feedId, feedsUpdateRequest, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#feedsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#feedsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **kotlin.String**| Unique identifier of a feed |
 **feedsUpdateRequest** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md)| Request object used to update a feed. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="itemsBatchGet"></a>
# **itemsBatchGet**
> CatalogsItemsBatch itemsBatchGet(batchId, adAccountId)

Get catalogs item batch status

Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val batchId : kotlin.String = 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e // kotlin.String | Id of a catalogs items batch to fetch
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsItemsBatch = apiInstance.itemsBatchGet(batchId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#itemsBatchGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#itemsBatchGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.String**| Id of a catalogs items batch to fetch |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemsBatchPost"></a>
# **itemsBatchPost**
> CatalogsItemsBatch itemsBatchPost(itemsBatchPostRequest, adAccountId)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val itemsBatchPostRequest : ItemsBatchPostRequest =  // ItemsBatchPostRequest | Request object used to create catalogs items in a batch
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsItemsBatch = apiInstance.itemsBatchPost(itemsBatchPostRequest, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#itemsBatchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#itemsBatchPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemsBatchPostRequest** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="itemsGet"></a>
# **itemsGet**
> CatalogsItems itemsGet(country, language, adAccountId, itemIds, filters)

Get catalogs items

Get the items of the catalog owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val country : kotlin.String = US // kotlin.String | Country for the Catalogs Items
val language : kotlin.String = EN // kotlin.String | Language for the Catalogs Items
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val itemIds : kotlin.collections.List<kotlin.String> = ["CR123"] // kotlin.collections.List<kotlin.String> | This parameter is deprecated. Use filters instead.
val filters : CatalogsItemsFilters =  // CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter.
try {
    val result : CatalogsItems = apiInstance.itemsGet(country, language, adAccountId, itemIds, filters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#itemsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#itemsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **kotlin.String**| Country for the Catalogs Items |
 **language** | **kotlin.String**| Language for the Catalogs Items |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **itemIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| This parameter is deprecated. Use filters instead. | [optional]
 **filters** | [**CatalogsItemsFilters**](.md)| Identifies items to be retrieved. This is a required parameter. | [optional]

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemsIssuesList"></a>
# **itemsIssuesList**
> ItemsIssuesList200Response itemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId)

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val processingResultId : kotlin.String = 5224831246441439241 // kotlin.String | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val itemNumbers : kotlin.collections.List<kotlin.Int> = [1,5] // kotlin.collections.List<kotlin.Int> | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
val itemValidationIssue : CatalogsItemValidationIssue = TITLE_MISSING // CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : ItemsIssuesList200Response = apiInstance.itemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#itemsIssuesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#itemsIssuesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processingResultId** | **kotlin.String**| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **itemNumbers** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional]
 **itemValidationIssue** | [**CatalogsItemValidationIssue**](.md)| Filter item validation issues that have a given type of item validation issue. | [optional] [enum: AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADULT_INVALID, ADWORDS_FORMAT_INVALID, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, EXPIRATION_DATE_INVALID, GENDER_INVALID, GTIN_INVALID, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, IMAGE_LINK_WARNING, INVALID_DOMAIN, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, ITEMID_MISSING, LINK_FORMAT_INVALID, LINK_FORMAT_WARNING, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, MIN_AD_PRICE_INVALID, MPN_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, PRODUCT_TYPE_LENGTH_TOO_LONG, SALE_DATE_INVALID, SALES_PRICE_INVALID, SALES_PRICE_TOO_HIGH, SALES_PRICE_TOO_LOW, SHIPPING_INVALID, SHIPPING_HEIGHT_INVALID, SHIPPING_WEIGHT_INVALID, SHIPPING_WIDTH_INVALID, SIZE_SYSTEM_INVALID, SIZE_TYPE_INVALID, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TITLE_MISSING, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UTM_SOURCE_AUTO_CORRECTED, WEIGHT_UNIT_INVALID]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="productsByProductGroupFilterList"></a>
# **productsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId)

List filtered products

List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val catalogsListProductsByFilterRequest : CatalogsListProductsByFilterRequest =  // CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : CatalogsProductGroupPinsList200Response = apiInstance.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#productsByProductGroupFilterList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#productsByProductGroupFilterList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

