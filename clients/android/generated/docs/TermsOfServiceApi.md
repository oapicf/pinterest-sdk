# TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsOfServiceGet**](TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service



## termsOfServiceGet

> TermsOfService termsOfServiceGet(adAccountId, includeHtml, tosType)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TermsOfServiceApi;

TermsOfServiceApi apiInstance = new TermsOfServiceApi();
String adAccountId = null; // String | Unique identifier of an ad account.
Boolean includeHtml = false; // Boolean | Return HTML in TOS text.
String tosType = null; // String | Request type.
try {
    TermsOfService result = apiInstance.termsOfServiceGet(adAccountId, includeHtml, tosType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TermsOfServiceApi#termsOfServiceGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **includeHtml** | **Boolean**| Return HTML in TOS text. | [optional] [default to false]
 **tosType** | **String**| Request type. | [optional] [default to null]

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

