# PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**promotionsCreate**](PromotionsApi.md#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions |
| [**promotionsDelete**](PromotionsApi.md#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id |
| [**promotionsGet**](PromotionsApi.md#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id |
| [**promotionsList**](PromotionsApi.md#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions |
| [**promotionsUpdate**](PromotionsApi.md#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions |


## Creating PromotionsApi

To initiate an instance of `PromotionsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.PromotionsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(PromotionsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    PromotionsApi promotionsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="promotionsCreate"></a>
# **promotionsCreate**
```java
Mono<PromotionsResponse> PromotionsApi.promotionsCreate(adAccountIdpromotionCreate)
```

Create promotions

Create multiple new promotions.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **promotionCreate** | [**List&lt;@Valid PromotionCreate&gt;**](PromotionCreate.md)|  | |


### Return type
[**PromotionsResponse**](PromotionsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="promotionsDelete"></a>
# **promotionsDelete**
```java
Mono<Promotion> PromotionsApi.promotionsDelete(promotionIdadAccountId)
```

Delete promotion by id

Delete a promotion within Pinterest.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promotionId** | `String`| Promotion ID | |
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**Promotion**](Promotion.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="promotionsGet"></a>
# **promotionsGet**
```java
Mono<Promotion> PromotionsApi.promotionsGet(promotionIdadAccountId)
```

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promotionId** | `String`| Promotion ID | |
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**Promotion**](Promotion.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="promotionsList"></a>
# **promotionsList**
```java
Mono<PromotionsList200Response> PromotionsApi.promotionsList(adAccountIdbookmarkpageSizeorder)
```

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |


### Return type
[**PromotionsList200Response**](PromotionsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="promotionsUpdate"></a>
# **promotionsUpdate**
```java
Mono<PromotionsResponse> PromotionsApi.promotionsUpdate(adAccountIdpromotionBatchUpdate)
```

Update promotions

Update multiple promotions.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **promotionBatchUpdate** | [**List&lt;@Valid PromotionBatchUpdate&gt;**](PromotionBatchUpdate.md)|  | |


### Return type
[**PromotionsResponse**](PromotionsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

