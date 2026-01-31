# CatalogFeedsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**feedProcessingResultsList**](CatalogFeedsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results |
| [**feedsCreate**](CatalogFeedsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed |
| [**feedsDelete**](CatalogFeedsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
| [**feedsGet**](CatalogFeedsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed |
| [**feedsIngest**](CatalogFeedsApi.md#feedsIngest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items |
| [**feedsList**](CatalogFeedsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds |
| [**feedsUpdate**](CatalogFeedsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
| [**itemsIssuesList**](CatalogFeedsApi.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues |


## Creating CatalogFeedsApi

To initiate an instance of `CatalogFeedsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.CatalogFeedsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(CatalogFeedsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    CatalogFeedsApi catalogFeedsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="feedProcessingResultsList"></a>
# **feedProcessingResultsList**
```java
Mono<FeedProcessingResultsList200Response> CatalogFeedsApi.feedProcessingResultsList(feedIdbookmarkpageSizeadAccountId)
```

List feed processing results

Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedId** | `String`| Unique identifier of a feed | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
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
Mono<CatalogsFeed> CatalogFeedsApi.feedsCreate(feedsCreateRequestadAccountId)
```

Create feed

Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedsCreateRequest** | [**FeedsCreateRequest**](FeedsCreateRequest.md)| Request object used to created a feed. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsFeed**](CatalogsFeed.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`, `catalogs:write`
* **[client_credentials](auth.md#client_credentials)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="feedsDelete"></a>
# **feedsDelete**
```java
Mono<Void> CatalogFeedsApi.feedsDelete(feedIdadAccountId)
```

Delete feed

Delete a feed owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedId** | `String`| Unique identifier of a feed | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |




### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`, `catalogs:write`
* **[client_credentials](auth.md#client_credentials)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="feedsGet"></a>
# **feedsGet**
```java
Mono<CatalogsFeed> CatalogFeedsApi.feedsGet(feedIdadAccountId)
```

Get feed

Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedId** | `String`| Unique identifier of a feed | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsFeed**](CatalogsFeed.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="feedsIngest"></a>
# **feedsIngest**
```java
Mono<CatalogsFeedIngestion> CatalogFeedsApi.feedsIngest(feedIdadAccountId)
```

Ingest feed items

Ingest items for a given feed owned by the \&quot;operation user_account\&quot;.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedId** | `String`| Unique identifier of a feed | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**CatalogsFeedIngestion**](CatalogsFeedIngestion.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="feedsList"></a>
# **feedsList**
```java
Mono<FeedsList200Response> CatalogFeedsApi.feedsList(bookmarkpageSizecatalogIdadAccountId)
```

List feeds

Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **catalogId** | `String`| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional parameter] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**FeedsList200Response**](FeedsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="feedsUpdate"></a>
# **feedsUpdate**
```java
Mono<CatalogsFeed> CatalogFeedsApi.feedsUpdate(feedIdfeedsUpdateRequestadAccountId)
```

Update feed

Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
* **[client_credentials](auth.md#client_credentials)**, scopes: `catalogs:read`, `catalogs:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="itemsIssuesList"></a>
# **itemsIssuesList**
```java
Mono<ItemsIssuesList200Response> CatalogFeedsApi.itemsIssuesList(processingResultIdbookmarkpageSizeitemNumbersitemValidationIssueadAccountId)
```

List item issues

List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/create&#39;&gt;Build catalogs report&lt;/a&gt; and &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/get&#39;&gt;Get catalogs report&lt;/a&gt; endpoints. Moreover, they support multiple types of catalogs.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **processingResultId** | `String`| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **itemNumbers** | [**List&lt;Integer&gt;**](Integer.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional parameter] |
| **itemValidationIssue** | [**CatalogsItemValidationIssue**](.md)| Filter item validation issues that have a given type of item validation issue. | [optional parameter] [enum: `AD_IMAGE_0_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_1_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_2_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_3_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_4_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_5_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_6_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_7_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_8_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_9_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_10_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_11_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_12_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_13_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_14_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_15_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_16_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_17_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_18_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_19_LINK_LENGTH_TOO_LONG`, `AD_IMAGE_0_LINK_WARNING`, `AD_IMAGE_1_LINK_WARNING`, `AD_IMAGE_2_LINK_WARNING`, `AD_IMAGE_3_LINK_WARNING`, `AD_IMAGE_4_LINK_WARNING`, `AD_IMAGE_5_LINK_WARNING`, `AD_IMAGE_6_LINK_WARNING`, `AD_IMAGE_7_LINK_WARNING`, `AD_IMAGE_8_LINK_WARNING`, `AD_IMAGE_9_LINK_WARNING`, `AD_IMAGE_10_LINK_WARNING`, `AD_IMAGE_11_LINK_WARNING`, `AD_IMAGE_12_LINK_WARNING`, `AD_IMAGE_13_LINK_WARNING`, `AD_IMAGE_14_LINK_WARNING`, `AD_IMAGE_15_LINK_WARNING`, `AD_IMAGE_16_LINK_WARNING`, `AD_IMAGE_17_LINK_WARNING`, `AD_IMAGE_18_LINK_WARNING`, `AD_IMAGE_19_LINK_WARNING`, `AD_IMAGE_0_LINK_REQUIRED`, `AD_IMAGE_1_LINK_REQUIRED`, `AD_IMAGE_2_LINK_REQUIRED`, `AD_IMAGE_3_LINK_REQUIRED`, `AD_IMAGE_4_LINK_REQUIRED`, `AD_IMAGE_5_LINK_REQUIRED`, `AD_IMAGE_6_LINK_REQUIRED`, `AD_IMAGE_7_LINK_REQUIRED`, `AD_IMAGE_8_LINK_REQUIRED`, `AD_IMAGE_9_LINK_REQUIRED`, `AD_IMAGE_10_LINK_REQUIRED`, `AD_IMAGE_11_LINK_REQUIRED`, `AD_IMAGE_12_LINK_REQUIRED`, `AD_IMAGE_13_LINK_REQUIRED`, `AD_IMAGE_14_LINK_REQUIRED`, `AD_IMAGE_15_LINK_REQUIRED`, `AD_IMAGE_16_LINK_REQUIRED`, `AD_IMAGE_17_LINK_REQUIRED`, `AD_IMAGE_18_LINK_REQUIRED`, `AD_IMAGE_19_LINK_REQUIRED`, `AD_IMAGE_0_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_1_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_2_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_3_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_4_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_5_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_6_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_7_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_8_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_9_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_10_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_11_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_12_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_13_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_14_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_15_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_16_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_17_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_18_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_19_TAG_LENGTH_TOO_LONG`, `AD_IMAGE_0_TAG_REQUIRED`, `AD_IMAGE_1_TAG_REQUIRED`, `AD_IMAGE_2_TAG_REQUIRED`, `AD_IMAGE_3_TAG_REQUIRED`, `AD_IMAGE_4_TAG_REQUIRED`, `AD_IMAGE_5_TAG_REQUIRED`, `AD_IMAGE_6_TAG_REQUIRED`, `AD_IMAGE_7_TAG_REQUIRED`, `AD_IMAGE_8_TAG_REQUIRED`, `AD_IMAGE_9_TAG_REQUIRED`, `AD_IMAGE_10_TAG_REQUIRED`, `AD_IMAGE_11_TAG_REQUIRED`, `AD_IMAGE_12_TAG_REQUIRED`, `AD_IMAGE_13_TAG_REQUIRED`, `AD_IMAGE_14_TAG_REQUIRED`, `AD_IMAGE_15_TAG_REQUIRED`, `AD_IMAGE_16_TAG_REQUIRED`, `AD_IMAGE_17_TAG_REQUIRED`, `AD_IMAGE_18_TAG_REQUIRED`, `AD_IMAGE_19_TAG_REQUIRED`, `AD_IMAGE_0_LINK_DUPLICATED`, `AD_IMAGE_1_LINK_DUPLICATED`, `AD_IMAGE_2_LINK_DUPLICATED`, `AD_IMAGE_3_LINK_DUPLICATED`, `AD_IMAGE_4_LINK_DUPLICATED`, `AD_IMAGE_5_LINK_DUPLICATED`, `AD_IMAGE_6_LINK_DUPLICATED`, `AD_IMAGE_7_LINK_DUPLICATED`, `AD_IMAGE_8_LINK_DUPLICATED`, `AD_IMAGE_9_LINK_DUPLICATED`, `AD_IMAGE_10_LINK_DUPLICATED`, `AD_IMAGE_11_LINK_DUPLICATED`, `AD_IMAGE_12_LINK_DUPLICATED`, `AD_IMAGE_13_LINK_DUPLICATED`, `AD_IMAGE_14_LINK_DUPLICATED`, `AD_IMAGE_15_LINK_DUPLICATED`, `AD_IMAGE_16_LINK_DUPLICATED`, `AD_IMAGE_17_LINK_DUPLICATED`, `AD_IMAGE_18_LINK_DUPLICATED`, `AD_IMAGE_19_LINK_DUPLICATED`, `AD_IMAGE_0_TAG_DUPLICATED`, `AD_IMAGE_1_TAG_DUPLICATED`, `AD_IMAGE_2_TAG_DUPLICATED`, `AD_IMAGE_3_TAG_DUPLICATED`, `AD_IMAGE_4_TAG_DUPLICATED`, `AD_IMAGE_5_TAG_DUPLICATED`, `AD_IMAGE_6_TAG_DUPLICATED`, `AD_IMAGE_7_TAG_DUPLICATED`, `AD_IMAGE_8_TAG_DUPLICATED`, `AD_IMAGE_9_TAG_DUPLICATED`, `AD_IMAGE_10_TAG_DUPLICATED`, `AD_IMAGE_11_TAG_DUPLICATED`, `AD_IMAGE_12_TAG_DUPLICATED`, `AD_IMAGE_13_TAG_DUPLICATED`, `AD_IMAGE_14_TAG_DUPLICATED`, `AD_IMAGE_15_TAG_DUPLICATED`, `AD_IMAGE_16_TAG_DUPLICATED`, `AD_IMAGE_17_TAG_DUPLICATED`, `AD_IMAGE_18_TAG_DUPLICATED`, `AD_IMAGE_19_TAG_DUPLICATED`, `AD_VIDEO_0_LINK_LENGTH_TOO_LONG`, `AD_VIDEO_1_LINK_LENGTH_TOO_LONG`, `AD_VIDEO_2_LINK_LENGTH_TOO_LONG`, `AD_VIDEO_0_LINK_WARNING`, `AD_VIDEO_1_LINK_WARNING`, `AD_VIDEO_2_LINK_WARNING`, `AD_VIDEO_0_LINK_REQUIRED`, `AD_VIDEO_1_LINK_REQUIRED`, `AD_VIDEO_2_LINK_REQUIRED`, `AD_VIDEO_0_LINK_DUPLICATED`, `AD_VIDEO_1_LINK_DUPLICATED`, `AD_VIDEO_2_LINK_DUPLICATED`, `AD_VIDEO_0_TAG_LENGTH_TOO_LONG`, `AD_VIDEO_1_TAG_LENGTH_TOO_LONG`, `AD_VIDEO_2_TAG_LENGTH_TOO_LONG`, `AD_VIDEO_0_TAG_REQUIRED`, `AD_VIDEO_1_TAG_REQUIRED`, `AD_VIDEO_2_TAG_REQUIRED`, `AD_VIDEO_0_TAG_DUPLICATED`, `AD_VIDEO_1_TAG_DUPLICATED`, `AD_VIDEO_2_TAG_DUPLICATED`, `VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED`, `AD_LINK_FORMAT_WARNING`, `AD_LINK_SAME_AS_LINK`, `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`, `ADDITIONAL_IMAGE_LINK_WARNING`, `ADULT_INVALID`, `ADWORDS_FORMAT_INVALID`, `ADWORDS_FORMAT_WARNING`, `ADWORDS_SAME_AS_LINK`, `AGE_GROUP_INVALID`, `ANDROID_DEEP_LINK_INVALID`, `AVAILABILITY_DATE_INVALID`, `AVAILABILITY_INVALID`, `BLOCKLISTED_IMAGE_SIGNATURE`, `COUNTRY_DOES_NOT_MAP_TO_CURRENCY`, `CUSTOM_LABEL_LENGTH_TOO_LONG`, `DESCRIPTION_LENGTH_TOO_LONG`, `DESCRIPTION_MISSING`, `DUPLICATE_PRODUCTS`, `EXPIRATION_DATE_INVALID`, `GENDER_INVALID`, `GTIN_INVALID`, `IMAGE_LINK_INVALID`, `IMAGE_LINK_LENGTH_TOO_LONG`, `IMAGE_LINK_MISSING`, `IMAGE_LINK_WARNING`, `INVALID_DOMAIN`, `IOS_DEEP_LINK_INVALID`, `IS_BUNDLE_INVALID`, `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`, `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`, `ITEMID_MISSING`, `LINK_FORMAT_INVALID`, `LINK_FORMAT_WARNING`, `LINK_LENGTH_TOO_LONG`, `LIST_PRICE_INVALID`, `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`, `MIN_AD_PRICE_INVALID`, `MPN_INVALID`, `MULTIPACK_INVALID`, `OPTIONAL_CONDITION_INVALID`, `OPTIONAL_CONDITION_MISSING`, `OPTIONAL_PRODUCT_CATEGORY_INVALID`, `OPTIONAL_PRODUCT_CATEGORY_MISSING`, `PARSE_LINE_ERROR`, `PINJOIN_CONTENT_UNSAFE`, `PRICE_CANNOT_BE_DETERMINED`, `PRICE_MISSING`, `PRODUCT_CATEGORY_DEPTH_WARNING`, `PRODUCT_LINK_MISSING`, `PRODUCT_PRICE_INVALID`, `PRODUCT_TYPE_LENGTH_TOO_LONG`, `SALE_DATE_INVALID`, `SALES_PRICE_INVALID`, `SALES_PRICE_TOO_HIGH`, `SALES_PRICE_TOO_LOW`, `SHIPPING_INVALID`, `SHIPPING_HEIGHT_INVALID`, `SHIPPING_WEIGHT_INVALID`, `SHIPPING_WIDTH_INVALID`, `SIZE_SYSTEM_INVALID`, `SIZE_TYPE_INVALID`, `TAX_INVALID`, `TITLE_LENGTH_TOO_LONG`, `TITLE_MISSING`, `TOO_MANY_ADDITIONAL_IMAGE_LINKS`, `UTM_SOURCE_AUTO_CORRECTED`, `WEIGHT_UNIT_INVALID`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `catalogs:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

