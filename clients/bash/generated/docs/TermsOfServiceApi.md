# TermsOfServiceApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsOfServiceGet**](TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service



## termsOfServiceGet

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example

```bash
 termsOfServiceGet ad_account_id=value  include_html=value  tos_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **includeHtml** | **boolean** | Return HTML in TOS text. | [optional] [default to false]
 **tosType** | **string** | Request type. | [optional] [default to null]

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

