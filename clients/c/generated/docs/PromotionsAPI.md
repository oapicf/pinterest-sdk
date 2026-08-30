# PromotionsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PromotionsAPI_promotionsCreate**](PromotionsAPI.md#PromotionsAPI_promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**PromotionsAPI_promotionsDelete**](PromotionsAPI.md#PromotionsAPI_promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**PromotionsAPI_promotionsGet**](PromotionsAPI.md#PromotionsAPI_promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**PromotionsAPI_promotionsList**](PromotionsAPI.md#PromotionsAPI_promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**PromotionsAPI_promotionsUpdate**](PromotionsAPI.md#PromotionsAPI_promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions


# **PromotionsAPI_promotionsCreate**
```c
// Create promotions
//
// Create multiple new promotions.
//
promotions_response_t* PromotionsAPI_promotionsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *promotion_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**promotion_create** | **[list_t](promotion_create.md) \*** |  | 

### Return type

[promotions_response_t](promotions_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PromotionsAPI_promotionsDelete**
```c
// Delete promotion by id
//
// Delete a promotion within Pinterest.
//
promotion_t* PromotionsAPI_promotionsDelete(apiClient_t *apiClient, char *promotion_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**promotion_id** | **char \*** | Promotion ID | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[promotion_t](promotion.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PromotionsAPI_promotionsGet**
```c
// Get promotion by id
//
// Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
//
promotion_t* PromotionsAPI_promotionsGet(apiClient_t *apiClient, char *promotion_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**promotion_id** | **char \*** | Promotion ID | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[promotion_t](promotion.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PromotionsAPI_promotionsList**
```c
// Get promotions
//
// Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
//
promotions_list_200_response_t* PromotionsAPI_promotionsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
**order** | **pinterest_lib_pagination_order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[promotions_list_200_response_t](promotions_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PromotionsAPI_promotionsUpdate**
```c
// Update promotions
//
// Update multiple promotions.
//
promotions_response_t* PromotionsAPI_promotionsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *promotion_batch_update);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**promotion_batch_update** | **[list_t](promotion_batch_update.md) \*** |  | 

### Return type

[promotions_response_t](promotions_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

