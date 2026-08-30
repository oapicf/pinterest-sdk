# PinterestSdk.PromotionsApi

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.PromotionsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let promotionCreate = [new PinterestSdk.PromotionCreate()]; // [PromotionCreate] | 
apiInstance.promotionsCreate(adAccountId, promotionCreate, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **promotionCreate** | [**[PromotionCreate]**](PromotionCreate.md)|  | 

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.PromotionsApi();
let promotionId = "promotionId_example"; // String | Promotion ID
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
apiInstance.promotionsDelete(promotionId, adAccountId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **String**| Promotion ID | 
 **adAccountId** | **String**| Unique identifier of an ad account. | 

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.PromotionsApi();
let promotionId = "promotionId_example"; // String | Promotion ID
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
apiInstance.promotionsGet(promotionId, adAccountId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **String**| Promotion ID | 
 **adAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## promotionsList

> PromotionsList200Response promotionsList(adAccountId, opts)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.PromotionsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  'order': new PinterestSdk.PinterestLibPaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
};
apiInstance.promotionsList(adAccountId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.PromotionsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let promotionBatchUpdate = [new PinterestSdk.PromotionBatchUpdate()]; // [PromotionBatchUpdate] | 
apiInstance.promotionsUpdate(adAccountId, promotionBatchUpdate, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **promotionBatchUpdate** | [**[PromotionBatchUpdate]**](PromotionBatchUpdate.md)|  | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

