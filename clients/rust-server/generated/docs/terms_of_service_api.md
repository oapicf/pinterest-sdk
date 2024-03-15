# terms_of_service_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**terms_of_service/get**](terms_of_service_api.md#terms_of_service/get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


# **terms_of_service/get**
> models::TermsOfService terms_of_service/get(ctx, ad_account_id, optional)
Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

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
 **include_html** | **bool**| Return HTML in TOS text. | [default to false]
 **tos_type** | **String**| Request type. | 

### Return type

[**models::TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

