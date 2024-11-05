# .TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsOfServiceGet**](TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


# **termsOfServiceGet**
> TermsOfService termsOfServiceGet()

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example


```typescript
import { createConfiguration, TermsOfServiceApi } from '';
import type { TermsOfServiceApiTermsOfServiceGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new TermsOfServiceApi(configuration);

const request: TermsOfServiceApiTermsOfServiceGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Return HTML in TOS text. (optional)
  includeHtml: false,
    // Request type. (optional)
  tosType: "tos_type_example",
};

const data = await apiInstance.termsOfServiceGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **includeHtml** | [**boolean**] | Return HTML in TOS text. | (optional) defaults to false
 **tosType** | [**string**] | Request type. | (optional) defaults to undefined


### Return type

**TermsOfService**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


