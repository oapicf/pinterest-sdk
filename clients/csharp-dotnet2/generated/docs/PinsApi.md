# Org.OpenAPITools.Api.PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PinsAnalytics**](PinsApi.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**PinsCreate**](PinsApi.md#pinscreate) | **POST** /pins | Create Pin
[**PinsDelete**](PinsApi.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**PinsGet**](PinsApi.md#pinsget) | **GET** /pins/{pin_id} | Get Pin


<a name="pinsanalytics"></a>
# **PinsAnalytics**
> Dictionary<string, AnalyticsMetricsResponse> PinsAnalytics (string pinId, DateTime? startDate, DateTime? endDate, List<string> metricTypes, string appTypes, string splitField, string adAccountId)

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsAnalyticsExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi();
            var pinId = "pinId_example";  // string | Unique identifier of a Pin.
            var startDate = DateTime.Parse("2013-10-20");  // DateTime? | Metric report start date (UTC). Format: YYYY-MM-DD
            var endDate = DateTime.Parse("2013-10-20");  // DateTime? | Metric report end date (UTC). Format: YYYY-MM-DD
            var metricTypes = new List<string>(); // List<string> | Pin metric types to get data for, default is all.
            var appTypes = "ALL";  // string | Apps or devices to get data for, default is all. (optional)  (default to ALL)
            var splitField = "NO_SPLIT";  // string | How to split the data into groups. Not including this param means data won't be split. (optional)  (default to NO_SPLIT)
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account. (optional) 

            try
            {
                // Get Pin analytics
                Dictionary&lt;string, AnalyticsMetricsResponse&gt; result = apiInstance.PinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PinsApi.PinsAnalytics: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. | 
 **startDate** | **DateTime?**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **DateTime?**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **metricTypes** | [**List<string>**](string.md)| Pin metric types to get data for, default is all. | 
 **appTypes** | **string**| Apps or devices to get data for, default is all. | [optional] [default to ALL]
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

<a name="pinscreate"></a>
# **PinsCreate**
> Pin PinsCreate (Pin pin)

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsCreateExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi();
            var pin = new Pin(); // Pin | Create a new Pin.

            try
            {
                // Create Pin
                Pin result = apiInstance.PinsCreate(pin);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PinsApi.PinsCreate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**Pin**](Pin.md)| Create a new Pin. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pinsdelete"></a>
# **PinsDelete**
> void PinsDelete (string pinId)

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsDeleteExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi();
            var pinId = "pinId_example";  // string | Unique identifier of a Pin.

            try
            {
                // Delete Pin
                apiInstance.PinsDelete(pinId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PinsApi.PinsDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pinsget"></a>
# **PinsGet**
> Pin PinsGet (string pinId, string adAccountId)

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi();
            var pinId = "pinId_example";  // string | Unique identifier of a Pin.
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account. (optional) 

            try
            {
                // Get Pin
                Pin result = apiInstance.PinsGet(pinId, adAccountId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PinsApi.PinsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. | 
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

