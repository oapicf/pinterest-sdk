# Org.OpenAPITools.Api.AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AudiencesCreate**](AudiencesApi.md#audiencescreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
| [**AudiencesCreateCustom**](AudiencesApi.md#audiencescreatecustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience |
| [**AudiencesGet**](AudiencesApi.md#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
| [**AudiencesList**](AudiencesApi.md#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
| [**AudiencesUpdate**](AudiencesApi.md#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |

<a id="audiencescreate"></a>
# **AudiencesCreate**
> Audience AudiencesCreate (string adAccountId, AudienceCreateRequest audienceCreateRequest)

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AudiencesCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudiencesApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var audienceCreateRequest = new AudienceCreateRequest(); // AudienceCreateRequest | List of ads to create, size limit [1, 30]

            try
            {
                // Create audience
                Audience result = apiInstance.AudiencesCreate(adAccountId, audienceCreateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudiencesApi.AudiencesCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AudiencesCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create audience
    ApiResponse<Audience> response = apiInstance.AudiencesCreateWithHttpInfo(adAccountId, audienceCreateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudiencesApi.AudiencesCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **audienceCreateRequest** | [**AudienceCreateRequest**](AudienceCreateRequest.md) | List of ads to create, size limit [1, 30] |  |

### Return type

[**Audience**](Audience.md)

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

<a id="audiencescreatecustom"></a>
# **AudiencesCreateCustom**
> Audience AudiencesCreateCustom (string adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest)

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AudiencesCreateCustomExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudiencesApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var audienceCreateCustomRequest = new AudienceCreateCustomRequest(); // AudienceCreateCustomRequest | Custom audience to create.

            try
            {
                // Create custom audience
                Audience result = apiInstance.AudiencesCreateCustom(adAccountId, audienceCreateCustomRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudiencesApi.AudiencesCreateCustom: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AudiencesCreateCustomWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create custom audience
    ApiResponse<Audience> response = apiInstance.AudiencesCreateCustomWithHttpInfo(adAccountId, audienceCreateCustomRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudiencesApi.AudiencesCreateCustomWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **audienceCreateCustomRequest** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md) | Custom audience to create. |  |

### Return type

[**Audience**](Audience.md)

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

<a id="audiencesget"></a>
# **AudiencesGet**
> Audience AudiencesGet (string adAccountId, string audienceId)

Get audience

Get a specific audience given the audience ID.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AudiencesGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudiencesApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var audienceId = "audienceId_example";  // string | Unique identifier of an audience

            try
            {
                // Get audience
                Audience result = apiInstance.AudiencesGet(adAccountId, audienceId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudiencesApi.AudiencesGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AudiencesGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get audience
    ApiResponse<Audience> response = apiInstance.AudiencesGetWithHttpInfo(adAccountId, audienceId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudiencesApi.AudiencesGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **audienceId** | **string** | Unique identifier of an audience |  |

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Audience not found. |  -  |
| **0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="audienceslist"></a>
# **AudiencesList**
> AudiencesList200Response AudiencesList (string adAccountId, string? bookmark = null, string? order = null, int? pageSize = null, string? ownershipType = null)

List audiences

Get list of audiences for the ad account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AudiencesListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudiencesApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var order = ASCENDING;  // string? | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var ownershipType = OWNED;  // string? | <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type. (optional)  (default to OWNED)

            try
            {
                // List audiences
                AudiencesList200Response result = apiInstance.AudiencesList(adAccountId, bookmark, order, pageSize, ownershipType);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudiencesApi.AudiencesList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AudiencesListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List audiences
    ApiResponse<AudiencesList200Response> response = apiInstance.AudiencesListWithHttpInfo(adAccountId, bookmark, order, pageSize, ownershipType);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudiencesApi.AudiencesListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **order** | **string?** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **ownershipType** | **string?** | &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional] [default to OWNED] |

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account audience parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="audiencesupdate"></a>
# **AudiencesUpdate**
> Audience AudiencesUpdate (string adAccountId, string audienceId, AudienceUpdateRequest? audienceUpdateRequest = null)

Update audience

Update (edit or remove) an existing targeting audience.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AudiencesUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudiencesApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var audienceId = "audienceId_example";  // string | Unique identifier of an audience
            var audienceUpdateRequest = new AudienceUpdateRequest?(); // AudienceUpdateRequest? | The audience to be updated. (optional) 

            try
            {
                // Update audience
                Audience result = apiInstance.AudiencesUpdate(adAccountId, audienceId, audienceUpdateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudiencesApi.AudiencesUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AudiencesUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update audience
    ApiResponse<Audience> response = apiInstance.AudiencesUpdateWithHttpInfo(adAccountId, audienceId, audienceUpdateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudiencesApi.AudiencesUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **audienceId** | **string** | Unique identifier of an audience |  |
| **audienceUpdateRequest** | [**AudienceUpdateRequest?**](AudienceUpdateRequest?.md) | The audience to be updated. | [optional]  |

### Return type

[**Audience**](Audience.md)

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

