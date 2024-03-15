# Org.OpenAPITools.Api.TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**TermsOfServiceGet**](TermsOfServiceApi.md#termsofserviceget) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |

<a id="termsofserviceget"></a>
# **TermsOfServiceGet**
> TermsOfService TermsOfServiceGet (string adAccountId, bool? includeHtml = null, string? tosType = null)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class TermsOfServiceGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new TermsOfServiceApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var includeHtml = false;  // bool? | Return HTML in TOS text. (optional)  (default to false)
            var tosType = "tosType_example";  // string? | Request type. (optional) 

            try
            {
                // Get terms of service
                TermsOfService result = apiInstance.TermsOfServiceGet(adAccountId, includeHtml, tosType);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TermsOfServiceApi.TermsOfServiceGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TermsOfServiceGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get terms of service
    ApiResponse<TermsOfService> response = apiInstance.TermsOfServiceGetWithHttpInfo(adAccountId, includeHtml, tosType);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TermsOfServiceApi.TermsOfServiceGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **includeHtml** | **bool?** | Return HTML in TOS text. | [optional] [default to false] |
| **tosType** | **string?** | Request type. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

