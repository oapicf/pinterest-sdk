# OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token


<a name="oauthToken"></a>
# **oauthToken**
> OauthAccessTokenResponse oauthToken(grantType)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.OauthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");

    OauthApi apiInstance = new OauthApi(defaultClient);
    String grantType = "authorization_code"; // String | 
    try {
      OauthAccessTokenResponse result = apiInstance.oauthToken(grantType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#oauthToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**|  | [enum: authorization_code, refresh_token]

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

