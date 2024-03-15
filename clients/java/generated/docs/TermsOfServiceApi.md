# TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**termsOfServiceGet**](TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |


<a id="termsOfServiceGet"></a>
# **termsOfServiceGet**
> TermsOfService termsOfServiceGet(adAccountId, includeHtml, tosType)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example
```java
// Import classes:
import com.github.oapicf.pinterestsdk.ApiClient;
import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.Configuration;
import com.github.oapicf.pinterestsdk.auth.*;
import com.github.oapicf.pinterestsdk.models.*;
import com.github.oapicf.pinterestsdk.api.TermsOfServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TermsOfServiceApi apiInstance = new TermsOfServiceApi(defaultClient);
    String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
    Boolean includeHtml = false; // Boolean | Return HTML in TOS text.
    String tosType = "tosType_example"; // String | Request type.
    try {
      TermsOfService result = apiInstance.termsOfServiceGet(adAccountId, includeHtml, tosType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsOfServiceApi#termsOfServiceGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **includeHtml** | **Boolean**| Return HTML in TOS text. | [optional] [default to false] |
| **tosType** | **String**| Request type. | [optional] |

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

