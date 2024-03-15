# TERMSOFSERVICE_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**terms_of_service_get**](TERMSOFSERVICE_API.md#terms_of_service_get) | **Get** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


# **terms_of_service_get**
> terms_of_service_get (ad_account_id: STRING_32 ; include_html:  detachable BOOLEAN ; tos_type:  detachable STRING_32 ): detachable TERMS_OF_SERVICE


Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **include_html** | **BOOLEAN**| Return HTML in TOS text. | [optional] [default to false]
 **tos_type** | **STRING_32**| Request type. | [optional] [default to null]

### Return type

[**TERMS_OF_SERVICE**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

