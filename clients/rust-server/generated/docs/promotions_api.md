# promotions_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**promotions/create**](promotions_api.md#promotions/create) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
**promotions/list**](promotions_api.md#promotions/list) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
**promotions/update**](promotions_api.md#promotions/update) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions
**promotions/delete**](promotions_api.md#promotions/delete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
**promotions/get**](promotions_api.md#promotions/get) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id


# **promotions/create**
> models::PromotionsResponse promotions/create(ctx, ad_account_id, promotion_create)
Create promotions

Create multiple new promotions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **promotion_create** | [**PromotionCreate**](PromotionCreate.md)|  | 

### Return type

[**models::PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions/list**
> models::PromotionsList200Response promotions/list(ctx, ad_account_id, optional)
Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [****](.md)| The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. | 

### Return type

[**models::PromotionsList200Response**](promotions_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions/update**
> models::PromotionsResponse promotions/update(ctx, ad_account_id, promotion_batch_update)
Update promotions

Update multiple promotions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **promotion_batch_update** | [**PromotionBatchUpdate**](PromotionBatchUpdate.md)|  | 

### Return type

[**models::PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions/delete**
> models::Promotion promotions/delete(ctx, promotion_id, ad_account_id)
Delete promotion by id

Delete a promotion within Pinterest.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **promotion_id** | **String**| Promotion ID | 
  **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions/get**
> models::Promotion promotions/get(ctx, promotion_id, ad_account_id)
Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **promotion_id** | **String**| Promotion ID | 
  **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

