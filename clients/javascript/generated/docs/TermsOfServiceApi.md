# PinterestSdk.TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsOfServiceGet**](TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service



## termsOfServiceGet

> TermsOfService termsOfServiceGet(adAccountId, opts)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.TermsOfServiceApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let opts = {
  'includeHtml': false, // Boolean | Return HTML in TOS text.
  'tosType': "tosType_example" // String | Request type.
};
apiInstance.termsOfServiceGet(adAccountId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **includeHtml** | **Boolean**| Return HTML in TOS text. | [optional] [default to false]
 **tosType** | **String**| Request type. | [optional] 

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

