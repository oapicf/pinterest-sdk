# PromotionsController

All URIs are relative to `"/v5"`

The controller class is defined in **[PromotionsController.java](../../src/main/java/org/openapitools/controller/PromotionsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotionsCreate**](#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotionsDelete**](#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotionsGet**](#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotionsList**](#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotionsUpdate**](#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions

<a id="promotionsCreate"></a>
# **promotionsCreate**
```java
Mono<PromotionsResponse> PromotionsController.promotionsCreate(adAccountIdpromotionCreateRequest)
```

Create promotions

Create multiple new promotions.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**promotionCreateRequest** | [**List&lt;@Valid PromotionCreateRequest&gt;**](../../docs/models/PromotionCreateRequest.md) | List of promotions to create, size limit [1, 30]. |

### Return type
[**PromotionsResponse**](../../docs/models/PromotionsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="promotionsDelete"></a>
# **promotionsDelete**
```java
Mono<Object> PromotionsController.promotionsDelete(adAccountIdpromotionId)
```

Delete promotion by id

Delete a promotion within Pinterest.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**promotionId** | `String` | Unique identifier of a promotion |


### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="promotionsGet"></a>
# **promotionsGet**
```java
Mono<PromotionResponse> PromotionsController.promotionsGet(adAccountIdpromotionId)
```

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**promotionId** | `String` | Unique identifier of a promotion |

### Return type
[**PromotionResponse**](../../docs/models/PromotionResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="promotionsList"></a>
# **promotionsList**
```java
Mono<PromotionsList200Response> PromotionsController.promotionsList(adAccountIdpageSizeorderbookmark)
```

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**order** | `String` | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

### Return type
[**PromotionsList200Response**](../../docs/models/PromotionsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="promotionsUpdate"></a>
# **promotionsUpdate**
```java
Mono<PromotionsResponse> PromotionsController.promotionsUpdate(adAccountIdpromotionUpdateRequest)
```

Update promotions

Update multiple promotions.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**promotionUpdateRequest** | [**List&lt;@Valid PromotionUpdateRequest&gt;**](../../docs/models/PromotionUpdateRequest.md) | List of promotions to create, size limit [1, 30]. |

### Return type
[**PromotionsResponse**](../../docs/models/PromotionsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

