# Org.OpenAPITools.Api.OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OauthToken**](OauthApi.md#oauthtoken) | **POST** /oauth/token | Generate OAuth access token


<a name="oauthtoken"></a>
# **OauthToken**
> OauthAccessTokenResponse OauthToken (string grantType)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class OauthTokenExample
    {
        public void main()
        {
            var apiInstance = new OauthApi();
            var grantType = "authorization_code";  // string | 

            try
            {
                // Generate OAuth access token
                OauthAccessTokenResponse result = apiInstance.OauthToken(grantType);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OauthApi.OauthToken: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **string**|  | 

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

