# Org.OpenAPITools.Api.AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AdAccountsAudiencesSharedAccountsList**](AudienceSharingApi.md#adaccountsaudiencessharedaccountslist) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account |
| [**BusinessAccountAudiencesSharedAccountsList**](AudienceSharingApi.md#businessaccountaudiencessharedaccountslist) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business |
| [**SharedAudiencesForBusinessList**](AudienceSharingApi.md#sharedaudiencesforbusinesslist) | **GET** /businesses/{business_id}/audiences | List received audiences for a business |
| [**UpdateAdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#updateadaccounttoadaccountsharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts |
| [**UpdateAdAccountToBusinessSharedAudience**](AudienceSharingApi.md#updateadaccounttobusinesssharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses |
| [**UpdateBusinessToAdAccountSharedAudience**](AudienceSharingApi.md#updatebusinesstoadaccountsharedaudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts |
| [**UpdateBusinessToBusinessSharedAudience**](AudienceSharingApi.md#updatebusinesstobusinesssharedaudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses |

<a id="adaccountsaudiencessharedaccountslist"></a>
# **AdAccountsAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response AdAccountsAudiencesSharedAccountsList (string adAccountId, string audienceId, AudienceAccountType accountType, int? pageSize = null, string? bookmark = null)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdAccountsAudiencesSharedAccountsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudienceSharingApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var audienceId = "audienceId_example";  // string | Unique identifier of the audience to use to filter the results.
            var accountType = (AudienceAccountType) "AD_ACCOUNT";  // AudienceAccountType | Filter accounts by account type.
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 

            try
            {
                // List accounts with access to an audience owned by an ad account
                AdAccountsAudiencesSharedAccountsList200Response result = apiInstance.AdAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudienceSharingApi.AdAccountsAudiencesSharedAccountsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdAccountsAudiencesSharedAccountsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List accounts with access to an audience owned by an ad account
    ApiResponse<AdAccountsAudiencesSharedAccountsList200Response> response = apiInstance.AdAccountsAudiencesSharedAccountsListWithHttpInfo(adAccountId, audienceId, accountType, pageSize, bookmark);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudienceSharingApi.AdAccountsAudiencesSharedAccountsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **audienceId** | **string** | Unique identifier of the audience to use to filter the results. |  |
| **accountType** | **AudienceAccountType** | Filter accounts by account type. |  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account audiences shared accounts parameters. |  -  |
| **404** | Shared accounts not found. |  -  |
| **0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="businessaccountaudiencessharedaccountslist"></a>
# **BusinessAccountAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response BusinessAccountAudiencesSharedAccountsList (string businessId, string audienceId, AudienceAccountType accountType, int? pageSize = null, string? bookmark = null)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BusinessAccountAudiencesSharedAccountsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudienceSharingApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var audienceId = "audienceId_example";  // string | Unique identifier of the audience to use to filter the results.
            var accountType = (AudienceAccountType) "AD_ACCOUNT";  // AudienceAccountType | Filter accounts by account type.
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 

            try
            {
                // List accounts with access to an audience owned by a business
                AdAccountsAudiencesSharedAccountsList200Response result = apiInstance.BusinessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudienceSharingApi.BusinessAccountAudiencesSharedAccountsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BusinessAccountAudiencesSharedAccountsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List accounts with access to an audience owned by a business
    ApiResponse<AdAccountsAudiencesSharedAccountsList200Response> response = apiInstance.BusinessAccountAudiencesSharedAccountsListWithHttpInfo(businessId, audienceId, accountType, pageSize, bookmark);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudienceSharingApi.BusinessAccountAudiencesSharedAccountsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **audienceId** | **string** | Unique identifier of the audience to use to filter the results. |  |
| **accountType** | **AudienceAccountType** | Filter accounts by account type. |  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid business audiences shared accounts parameters. |  -  |
| **404** | Shared accounts not found. |  -  |
| **0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="sharedaudiencesforbusinesslist"></a>
# **SharedAudiencesForBusinessList**
> AudiencesList200Response SharedAudiencesForBusinessList (string businessId, string? bookmark = null, string? order = null, int? pageSize = null)

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SharedAudiencesForBusinessListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudienceSharingApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var order = ASCENDING;  // string? | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // List received audiences for a business
                AudiencesList200Response result = apiInstance.SharedAudiencesForBusinessList(businessId, bookmark, order, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudienceSharingApi.SharedAudiencesForBusinessList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SharedAudiencesForBusinessListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List received audiences for a business
    ApiResponse<AudiencesList200Response> response = apiInstance.SharedAudiencesForBusinessListWithHttpInfo(businessId, bookmark, order, pageSize);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudienceSharingApi.SharedAudiencesForBusinessListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **order** | **string?** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

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
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateadaccounttoadaccountsharedaudience"></a>
# **UpdateAdAccountToAdAccountSharedAudience**
> SharedAudienceResponse UpdateAdAccountToAdAccountSharedAudience (string adAccountId, SharedAudience sharedAudience)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateAdAccountToAdAccountSharedAudienceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudienceSharingApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var sharedAudience = new SharedAudience(); // SharedAudience | 

            try
            {
                // Update audience sharing between ad accounts
                SharedAudienceResponse result = apiInstance.UpdateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudienceSharingApi.UpdateAdAccountToAdAccountSharedAudience: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateAdAccountToAdAccountSharedAudienceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update audience sharing between ad accounts
    ApiResponse<SharedAudienceResponse> response = apiInstance.UpdateAdAccountToAdAccountSharedAudienceWithHttpInfo(adAccountId, sharedAudience);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudienceSharingApi.UpdateAdAccountToAdAccountSharedAudienceWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **sharedAudience** | [**SharedAudience**](SharedAudience.md) |  |  |

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updateadaccounttobusinesssharedaudience"></a>
# **UpdateAdAccountToBusinessSharedAudience**
> BusinessSharedAudienceResponse UpdateAdAccountToBusinessSharedAudience (string adAccountId, BusinessSharedAudience businessSharedAudience)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateAdAccountToBusinessSharedAudienceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudienceSharingApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var businessSharedAudience = new BusinessSharedAudience(); // BusinessSharedAudience | 

            try
            {
                // Update audience sharing from an ad account to businesses
                BusinessSharedAudienceResponse result = apiInstance.UpdateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudienceSharingApi.UpdateAdAccountToBusinessSharedAudience: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateAdAccountToBusinessSharedAudienceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update audience sharing from an ad account to businesses
    ApiResponse<BusinessSharedAudienceResponse> response = apiInstance.UpdateAdAccountToBusinessSharedAudienceWithHttpInfo(adAccountId, businessSharedAudience);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudienceSharingApi.UpdateAdAccountToBusinessSharedAudienceWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md) |  |  |

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatebusinesstoadaccountsharedaudience"></a>
# **UpdateBusinessToAdAccountSharedAudience**
> SharedAudienceResponse UpdateBusinessToAdAccountSharedAudience (string businessId, SharedAudience sharedAudience)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateBusinessToAdAccountSharedAudienceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudienceSharingApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var sharedAudience = new SharedAudience(); // SharedAudience | 

            try
            {
                // Update audience sharing from a business to ad accounts
                SharedAudienceResponse result = apiInstance.UpdateBusinessToAdAccountSharedAudience(businessId, sharedAudience);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudienceSharingApi.UpdateBusinessToAdAccountSharedAudience: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateBusinessToAdAccountSharedAudienceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update audience sharing from a business to ad accounts
    ApiResponse<SharedAudienceResponse> response = apiInstance.UpdateBusinessToAdAccountSharedAudienceWithHttpInfo(businessId, sharedAudience);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudienceSharingApi.UpdateBusinessToAdAccountSharedAudienceWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **sharedAudience** | [**SharedAudience**](SharedAudience.md) |  |  |

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatebusinesstobusinesssharedaudience"></a>
# **UpdateBusinessToBusinessSharedAudience**
> BusinessSharedAudienceResponse UpdateBusinessToBusinessSharedAudience (string businessId, BusinessSharedAudience businessSharedAudience)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateBusinessToBusinessSharedAudienceExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AudienceSharingApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var businessSharedAudience = new BusinessSharedAudience(); // BusinessSharedAudience | 

            try
            {
                // Update audience sharing between businesses
                BusinessSharedAudienceResponse result = apiInstance.UpdateBusinessToBusinessSharedAudience(businessId, businessSharedAudience);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AudienceSharingApi.UpdateBusinessToBusinessSharedAudience: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateBusinessToBusinessSharedAudienceWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update audience sharing between businesses
    ApiResponse<BusinessSharedAudienceResponse> response = apiInstance.UpdateBusinessToBusinessSharedAudienceWithHttpInfo(businessId, businessSharedAudience);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AudienceSharingApi.UpdateBusinessToBusinessSharedAudienceWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md) |  |  |

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

