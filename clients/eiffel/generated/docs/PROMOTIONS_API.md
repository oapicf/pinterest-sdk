# PROMOTIONS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**promotions_create**](PROMOTIONS_API.md#promotions_create) | **Post** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotions_delete**](PROMOTIONS_API.md#promotions_delete) | **Delete** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotions_get**](PROMOTIONS_API.md#promotions_get) | **Get** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotions_list**](PROMOTIONS_API.md#promotions_list) | **Get** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotions_update**](PROMOTIONS_API.md#promotions_update) | **Patch** /ad_accounts/{ad_account_id}/promotions | Update promotions


# **promotions_create**
> promotions_create (ad_account_id: STRING_32 ; promotion_create_request: LIST [PROMOTION_CREATE_REQUEST] ): detachable PROMOTIONS_RESPONSE


Create promotions

Create multiple new promotions.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **promotion_create_request** | [**LIST [PROMOTION_CREATE_REQUEST]**](PromotionCreateRequest.md)| List of promotions to create, size limit [1, 30]. | 

### Return type

[**PROMOTIONS_RESPONSE**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_delete**
> promotions_delete (ad_account_id: STRING_32 ; promotion_id: STRING_32 )


Delete promotion by id

Delete a promotion within Pinterest.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **promotion_id** | **STRING_32**| Unique identifier of a promotion | [default to null]

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_get**
> promotions_get (ad_account_id: STRING_32 ; promotion_id: STRING_32 ): detachable PROMOTION_RESPONSE


Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **promotion_id** | **STRING_32**| Unique identifier of a promotion | [default to null]

### Return type

[**PROMOTION_RESPONSE**](PromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_list**
> promotions_list (ad_account_id: STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable STRING_32 ; bookmark:  detachable STRING_32 ): detachable PROMOTIONS_LIST_200_RESPONSE


Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**PROMOTIONS_LIST_200_RESPONSE**](promotions_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_update**
> promotions_update (ad_account_id: STRING_32 ; promotion_update_request: LIST [PROMOTION_UPDATE_REQUEST] ): detachable PROMOTIONS_RESPONSE


Update promotions

Update multiple promotions.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **promotion_update_request** | [**LIST [PROMOTION_UPDATE_REQUEST]**](PromotionUpdateRequest.md)| List of promotions to create, size limit [1, 30]. | 

### Return type

[**PROMOTIONS_RESPONSE**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

