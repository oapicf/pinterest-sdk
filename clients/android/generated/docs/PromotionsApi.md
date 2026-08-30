# PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotionsCreate**](PromotionsApi.md#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotionsDelete**](PromotionsApi.md#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotionsGet**](PromotionsApi.md#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotionsList**](PromotionsApi.md#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotionsUpdate**](PromotionsApi.md#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions



## promotionsCreate

> PromotionsResponse promotionsCreate(adAccountId, promotionCreate)

Create promotions

Create multiple new promotions.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PromotionsApi;

PromotionsApi apiInstance = new PromotionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<PromotionCreate> promotionCreate = Arrays.asList(new PromotionCreate()); // List<PromotionCreate> | 
try {
    PromotionsResponse result = apiInstance.promotionsCreate(adAccountId, promotionCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionsApi#promotionsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **promotionCreate** | [**List&lt;PromotionCreate&gt;**](PromotionCreate.md)|  |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## promotionsDelete

> Promotion promotionsDelete(promotionId, adAccountId)

Delete promotion by id

Delete a promotion within Pinterest.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PromotionsApi;

PromotionsApi apiInstance = new PromotionsApi();
String promotionId = null; // String | Promotion ID
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Promotion result = apiInstance.promotionsDelete(promotionId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionsApi#promotionsDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **String**| Promotion ID | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotionsGet

> Promotion promotionsGet(promotionId, adAccountId)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PromotionsApi;

PromotionsApi apiInstance = new PromotionsApi();
String promotionId = null; // String | Promotion ID
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Promotion result = apiInstance.promotionsGet(promotionId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionsApi#promotionsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **String**| Promotion ID | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotionsList

> PromotionsList200Response promotionsList(adAccountId, bookmark, pageSize, order)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PromotionsApi;

PromotionsApi apiInstance = new PromotionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
PinterestLibPaginationOrder order = null; // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
try {
    PromotionsList200Response result = apiInstance.promotionsList(adAccountId, bookmark, pageSize, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionsApi#promotionsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]

### Return type

[**PromotionsList200Response**](PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotionsUpdate

> PromotionsResponse promotionsUpdate(adAccountId, promotionBatchUpdate)

Update promotions

Update multiple promotions.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PromotionsApi;

PromotionsApi apiInstance = new PromotionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<PromotionBatchUpdate> promotionBatchUpdate = Arrays.asList(new PromotionBatchUpdate()); // List<PromotionBatchUpdate> | 
try {
    PromotionsResponse result = apiInstance.promotionsUpdate(adAccountId, promotionBatchUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionsApi#promotionsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **promotionBatchUpdate** | [**List&lt;PromotionBatchUpdate&gt;**](PromotionBatchUpdate.md)|  |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

