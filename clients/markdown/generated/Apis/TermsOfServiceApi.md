# TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**termsOfService/get**](TermsOfServiceApi.md#termsOfService/get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |


<a name="termsOfService/get"></a>
# **termsOfService/get**
> TermsOfService termsOfService/get(ad\_account\_id, include\_html, tos\_type)

Get terms of service

    Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **include\_html** | **Boolean**| Return HTML in TOS text. | [optional] [default to false] |
| **tos\_type** | **String**| Request type. | [optional] [default to null] |

### Return type

[**TermsOfService**](../Models/TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

