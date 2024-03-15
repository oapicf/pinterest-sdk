# Org.OpenAPITools.Api.BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**BulkDownloadCreate**](BulkApi.md#bulkdownloadcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk |
| [**BulkRequestGet**](BulkApi.md#bulkrequestget) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk |
| [**BulkUpsertCreate**](BulkApi.md#bulkupsertcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk |

<a id="bulkdownloadcreate"></a>
# **BulkDownloadCreate**
> BulkDownloadResponse BulkDownloadCreate (string adAccountId, BulkDownloadRequest bulkDownloadRequest)

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BulkDownloadCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BulkApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var bulkDownloadRequest = new BulkDownloadRequest(); // BulkDownloadRequest | Parameters to get ad entities in bulk

            try
            {
                // Get advertiser entities in bulk
                BulkDownloadResponse result = apiInstance.BulkDownloadCreate(adAccountId, bulkDownloadRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BulkApi.BulkDownloadCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BulkDownloadCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get advertiser entities in bulk
    ApiResponse<BulkDownloadResponse> response = apiInstance.BulkDownloadCreateWithHttpInfo(adAccountId, bulkDownloadRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BulkApi.BulkDownloadCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **bulkDownloadRequest** | [**BulkDownloadRequest**](BulkDownloadRequest.md) | Parameters to get ad entities in bulk |  |

### Return type

[**BulkDownloadResponse**](BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="bulkrequestget"></a>
# **BulkRequestGet**
> BulkUpsertStatusResponse BulkRequestGet (string adAccountId, string bulkRequestId, bool? includeDetails = null)

Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BulkRequestGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BulkApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var bulkRequestId = "bulkRequestId_example";  // string | Unique identifier of a bulk upsert request.
            var includeDetails = false;  // bool? | if set to True then attach the errors/details to all the requests (optional)  (default to false)

            try
            {
                // Download advertiser entities in bulk
                BulkUpsertStatusResponse result = apiInstance.BulkRequestGet(adAccountId, bulkRequestId, includeDetails);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BulkApi.BulkRequestGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BulkRequestGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Download advertiser entities in bulk
    ApiResponse<BulkUpsertStatusResponse> response = apiInstance.BulkRequestGetWithHttpInfo(adAccountId, bulkRequestId, includeDetails);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BulkApi.BulkRequestGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **bulkRequestId** | **string** | Unique identifier of a bulk upsert request. |  |
| **includeDetails** | **bool?** | if set to True then attach the errors/details to all the requests | [optional] [default to false] |

### Return type

[**BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md)

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

<a id="bulkupsertcreate"></a>
# **BulkUpsertCreate**
> BulkUpsertResponse BulkUpsertCreate (string adAccountId, BulkUpsertRequest bulkUpsertRequest)

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BulkUpsertCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BulkApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var bulkUpsertRequest = new BulkUpsertRequest(); // BulkUpsertRequest | Parameters to get create/update ad entities in bulk

            try
            {
                // Create/update ad entities in bulk
                BulkUpsertResponse result = apiInstance.BulkUpsertCreate(adAccountId, bulkUpsertRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BulkApi.BulkUpsertCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BulkUpsertCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create/update ad entities in bulk
    ApiResponse<BulkUpsertResponse> response = apiInstance.BulkUpsertCreateWithHttpInfo(adAccountId, bulkUpsertRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BulkApi.BulkUpsertCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **bulkUpsertRequest** | [**BulkUpsertRequest**](BulkUpsertRequest.md) | Parameters to get create/update ad entities in bulk |  |

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

