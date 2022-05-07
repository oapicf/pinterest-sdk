# Org.OpenAPITools.Api.UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserAccountAnalytics**](UserAccountApi.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics
[**UserAccountGet**](UserAccountApi.md#useraccountget) | **GET** /user_account | Get user account


<a name="useraccountanalytics"></a>
# **UserAccountAnalytics**
> Dictionary<string, AnalyticsMetricsResponse> UserAccountAnalytics (DateTime? startDate, DateTime? endDate, string fromClaimedContent, string pinFormat, string appTypes, List<string> metricTypes, string splitField, string adAccountId)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserAccountAnalyticsExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi();
            var startDate = DateTime.Parse("2013-10-20");  // DateTime? | Metric report start date (UTC). Format: YYYY-MM-DD
            var endDate = DateTime.Parse("2013-10-20");  // DateTime? | Metric report end date (UTC). Format: YYYY-MM-DD
            var fromClaimedContent = "OTHER";  // string | Filter on Pins that match your claimed domain. (optional)  (default to BOTH)
            var pinFormat = "ALL";  // string | Pin formats to get data for, default is all. (optional)  (default to ALL)
            var appTypes = "ALL";  // string | Apps or devices to get data for, default is all. (optional)  (default to ALL)
            var metricTypes = new List<string>(); // List<string> | Metric types to get data for, default is all.  (optional) 
            var splitField = "NO_SPLIT";  // string | How to split the data into groups. Not including this param means data won't be split. (optional)  (default to NO_SPLIT)
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account. (optional) 

            try
            {
                // Get user account analytics
                Dictionary&lt;string, AnalyticsMetricsResponse&gt; result = apiInstance.UserAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserAccountApi.UserAccountAnalytics: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **DateTime?**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **DateTime?**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **fromClaimedContent** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH]
 **pinFormat** | **string**| Pin formats to get data for, default is all. | [optional] [default to ALL]
 **appTypes** | **string**| Apps or devices to get data for, default is all. | [optional] [default to ALL]
 **metricTypes** | [**List<string>**](string.md)| Metric types to get data for, default is all.  | [optional] 
 **splitField** | **string**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**Dictionary<string, AnalyticsMetricsResponse>**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="useraccountget"></a>
# **UserAccountGet**
> Account UserAccountGet (string adAccountId)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserAccountGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserAccountApi();
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account. (optional) 

            try
            {
                // Get user account
                Account result = apiInstance.UserAccountGet(adAccountId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserAccountApi.UserAccountGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

