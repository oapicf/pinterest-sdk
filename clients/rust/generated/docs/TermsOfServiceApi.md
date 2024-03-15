# \TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terms_of_service_slash_get**](TermsOfServiceApi.md#terms_of_service_slash_get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service



## terms_of_service_slash_get

> models::TermsOfService terms_of_service_slash_get(ad_account_id, include_html, tos_type)
Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**include_html** | Option<**bool**> | Return HTML in TOS text. |  |[default to false]
**tos_type** | Option<**String**> | Request type. |  |

### Return type

[**models::TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

