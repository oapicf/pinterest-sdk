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
Mono<PromotionsResponse> PromotionsController.promotionsCreate(adAccountIdpromotionCreate)
```

Create promotions

Create multiple new promotions.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**promotionCreate** | [**List&lt;@Valid PromotionCreate&gt;**](../../docs/models/PromotionCreate.md) |  |

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
Mono<Promotion> PromotionsController.promotionsDelete(promotionIdadAccountId)
```

Delete promotion by id

Delete a promotion within Pinterest.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**promotionId** | `String` | Promotion ID |
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**Promotion**](../../docs/models/Promotion.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="promotionsGet"></a>
# **promotionsGet**
```java
Mono<Promotion> PromotionsController.promotionsGet(promotionIdadAccountId)
```

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**promotionId** | `String` | Promotion ID |
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**Promotion**](../../docs/models/Promotion.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="promotionsList"></a>
# **promotionsList**
```java
Mono<PromotionsList200Response> PromotionsController.promotionsList(adAccountIdbookmarkpageSizeorder)
```

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]

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
Mono<PromotionsResponse> PromotionsController.promotionsUpdate(adAccountIdpromotionBatchUpdate)
```

Update promotions

Update multiple promotions.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**promotionBatchUpdate** | [**List&lt;@Valid PromotionBatchUpdate&gt;**](../../docs/models/PromotionBatchUpdate.md) |  |

### Return type
[**PromotionsResponse**](../../docs/models/PromotionsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

