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

> PromotionsResponse promotionsCreate(adAccountId, promotionCreateRequest)

Create promotions

Create multiple new promotions.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PromotionsApi;

PromotionsApi apiInstance = new PromotionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<PromotionCreateRequest> promotionCreateRequest = Arrays.asList(new PromotionCreateRequest()); // List<PromotionCreateRequest> | List of promotions to create, size limit [1, 30].
try {
    PromotionsResponse result = apiInstance.promotionsCreate(adAccountId, promotionCreateRequest);
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
 **promotionCreateRequest** | [**List&lt;PromotionCreateRequest&gt;**](PromotionCreateRequest.md)| List of promotions to create, size limit [1, 30]. |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## promotionsDelete

> promotionsDelete(adAccountId, promotionId)

Delete promotion by id

Delete a promotion within Pinterest.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PromotionsApi;

PromotionsApi apiInstance = new PromotionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String promotionId = null; // String | Unique identifier of a promotion
try {
    apiInstance.promotionsDelete(adAccountId, promotionId);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionsApi#promotionsDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **promotionId** | **String**| Unique identifier of a promotion | [default to null]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotionsGet

> PromotionResponse promotionsGet(adAccountId, promotionId)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PromotionsApi;

PromotionsApi apiInstance = new PromotionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String promotionId = null; // String | Unique identifier of a promotion
try {
    PromotionResponse result = apiInstance.promotionsGet(adAccountId, promotionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PromotionsApi#promotionsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **promotionId** | **String**| Unique identifier of a promotion | [default to null]

### Return type

[**PromotionResponse**](PromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotionsList

> PromotionsList200Response promotionsList(adAccountId, pageSize, order, bookmark)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PromotionsApi;

PromotionsApi apiInstance = new PromotionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
String order = ASCENDING; // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
String bookmark = null; // String | Cursor used to fetch the next page of items
try {
    PromotionsList200Response result = apiInstance.promotionsList(adAccountId, pageSize, order, bookmark);
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
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**PromotionsList200Response**](PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotionsUpdate

> PromotionsResponse promotionsUpdate(adAccountId, promotionUpdateRequest)

Update promotions

Update multiple promotions.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PromotionsApi;

PromotionsApi apiInstance = new PromotionsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<PromotionUpdateRequest> promotionUpdateRequest = Arrays.asList(new PromotionUpdateRequest()); // List<PromotionUpdateRequest> | List of promotions to create, size limit [1, 30].
try {
    PromotionsResponse result = apiInstance.promotionsUpdate(adAccountId, promotionUpdateRequest);
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
 **promotionUpdateRequest** | [**List&lt;PromotionUpdateRequest&gt;**](PromotionUpdateRequest.md)| List of promotions to create, size limit [1, 30]. |

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

