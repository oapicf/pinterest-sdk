# TermsOfServiceAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TermsOfServiceAPI_termsOfServiceGet**](TermsOfServiceAPI.md#TermsOfServiceAPI_termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


# **TermsOfServiceAPI_termsOfServiceGet**
```c
// Get terms of service
//
// Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
//
terms_of_service_t* TermsOfServiceAPI_termsOfServiceGet(apiClient_t *apiClient, char *ad_account_id, int *include_html, char *tos_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**include_html** | **int \*** | Return HTML in TOS text. | [optional] [default to false]
**tos_type** | **char \*** | Request type. | [optional] 

### Return type

[terms_of_service_t](terms_of_service.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

