# Org.OpenAPITools.Api.BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AssetAccessRequestsCreate**](BusinessAccessInviteApi.md#assetaccessrequestscreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets. |
| [**CancelInvitesOrRequests**](BusinessAccessInviteApi.md#cancelinvitesorrequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests |
| [**CreateAssetInvites**](BusinessAccessInviteApi.md#createassetinvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission |
| [**CreateMembershipOrPartnershipInvites**](BusinessAccessInviteApi.md#createmembershiporpartnershipinvites) | **POST** /businesses/{business_id}/invites | Create invites or requests |
| [**GetInvites**](BusinessAccessInviteApi.md#getinvites) | **GET** /businesses/{business_id}/invites | Get invites/requests |
| [**RespondBusinessAccessInvites**](BusinessAccessInviteApi.md#respondbusinessaccessinvites) | **PATCH** /businesses/invites | Accept or decline an invite/request |

<a id="assetaccessrequestscreate"></a>
# **AssetAccessRequestsCreate**
> CreateAssetAccessRequestResponse AssetAccessRequestsCreate (string businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody)

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AssetAccessRequestsCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessInviteApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var createAssetAccessRequestBody = new CreateAssetAccessRequestBody(); // CreateAssetAccessRequestBody | 

            try
            {
                // Create a request to access an existing partner's assets.
                CreateAssetAccessRequestResponse result = apiInstance.AssetAccessRequestsCreate(businessId, createAssetAccessRequestBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessInviteApi.AssetAccessRequestsCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AssetAccessRequestsCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create a request to access an existing partner's assets.
    ApiResponse<CreateAssetAccessRequestResponse> response = apiInstance.AssetAccessRequestsCreateWithHttpInfo(businessId, createAssetAccessRequestBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessInviteApi.AssetAccessRequestsCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **createAssetAccessRequestBody** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md) |  |  |

### Return type

[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

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

<a id="cancelinvitesorrequests"></a>
# **CancelInvitesOrRequests**
> DeleteInvitesResultsResponseArray CancelInvitesOrRequests (string businessId, CancelInvitesBody cancelInvitesBody)

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CancelInvitesOrRequestsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessInviteApi(config);
            var businessId = 729090764583391194;  // string | Business id
            var cancelInvitesBody = new CancelInvitesBody(); // CancelInvitesBody | A list with invite ids

            try
            {
                // Cancel invites/requests
                DeleteInvitesResultsResponseArray result = apiInstance.CancelInvitesOrRequests(businessId, cancelInvitesBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessInviteApi.CancelInvitesOrRequests: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CancelInvitesOrRequestsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Cancel invites/requests
    ApiResponse<DeleteInvitesResultsResponseArray> response = apiInstance.CancelInvitesOrRequestsWithHttpInfo(businessId, cancelInvitesBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessInviteApi.CancelInvitesOrRequestsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Business id |  |
| **cancelInvitesBody** | [**CancelInvitesBody**](CancelInvitesBody.md) | A list with invite ids |  |

### Return type

[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)

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

<a id="createassetinvites"></a>
# **CreateAssetInvites**
> UpdateInvitesResultsResponseArray CreateAssetInvites (string businessId, CreateAssetInvitesRequest createAssetInvitesRequest)

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateAssetInvitesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessInviteApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var createAssetInvitesRequest = new CreateAssetInvitesRequest(); // CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request. 

            try
            {
                // Update invite/request with an asset permission
                UpdateInvitesResultsResponseArray result = apiInstance.CreateAssetInvites(businessId, createAssetInvitesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessInviteApi.CreateAssetInvites: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateAssetInvitesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update invite/request with an asset permission
    ApiResponse<UpdateInvitesResultsResponseArray> response = apiInstance.CreateAssetInvitesWithHttpInfo(businessId, createAssetInvitesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessInviteApi.CreateAssetInvitesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **createAssetInvitesRequest** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md) | A list of invites/requests together with the asset permissions to be assigned to the invite/request.  |  |

### Return type

[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

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

<a id="createmembershiporpartnershipinvites"></a>
# **CreateMembershipOrPartnershipInvites**
> CreateInvitesResultsResponseArray CreateMembershipOrPartnershipInvites (string businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody)

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateMembershipOrPartnershipInvitesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessInviteApi(config);
            var businessId = 729090764583391194;  // string | Business id
            var createMembershipOrPartnershipInvitesBody = new CreateMembershipOrPartnershipInvitesBody(); // CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role

            try
            {
                // Create invites or requests
                CreateInvitesResultsResponseArray result = apiInstance.CreateMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessInviteApi.CreateMembershipOrPartnershipInvites: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateMembershipOrPartnershipInvitesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create invites or requests
    ApiResponse<CreateInvitesResultsResponseArray> response = apiInstance.CreateMembershipOrPartnershipInvitesWithHttpInfo(businessId, createMembershipOrPartnershipInvitesBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessInviteApi.CreateMembershipOrPartnershipInvitesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Business id |  |
| **createMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md) | An object with the properties: invite_type, partners, members, business_role |  |

### Return type

[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

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

<a id="getinvites"></a>
# **GetInvites**
> GetInvites200Response GetInvites (string businessId, bool? isMember = null, List<string>? inviteStatus = null, InviteType? inviteType = null, string? bookmark = null, int? pageSize = null)

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetInvitesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessInviteApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var isMember = true;  // bool? | A boolean field to indicate whether the invite is to create a partnership or a membership. (optional)  (default to true)
            var inviteStatus = new List<string>?(); // List<string>? | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional) 
            var inviteType = new InviteType?(); // InviteType? | Invite type to filter invites by. Only invites of the specified type will be returned. (optional) 
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // Get invites/requests
                GetInvites200Response result = apiInstance.GetInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessInviteApi.GetInvites: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetInvitesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get invites/requests
    ApiResponse<GetInvites200Response> response = apiInstance.GetInvitesWithHttpInfo(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessInviteApi.GetInvitesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **isMember** | **bool?** | A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to true] |
| **inviteStatus** | [**List&lt;string&gt;?**](string.md) | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional]  |
| **inviteType** | [**InviteType?**](InviteType?.md) | Invite type to filter invites by. Only invites of the specified type will be returned. | [optional]  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**GetInvites200Response**](GetInvites200Response.md)

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

<a id="respondbusinessaccessinvites"></a>
# **RespondBusinessAccessInvites**
> RespondToInvitesResponseArray RespondBusinessAccessInvites (AuthRespondInvitesBody authRespondInvitesBody)

Accept or decline an invite/request

Accept or decline invites or requests.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RespondBusinessAccessInvitesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessInviteApi(config);
            var authRespondInvitesBody = new AuthRespondInvitesBody(); // AuthRespondInvitesBody | 

            try
            {
                // Accept or decline an invite/request
                RespondToInvitesResponseArray result = apiInstance.RespondBusinessAccessInvites(authRespondInvitesBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessInviteApi.RespondBusinessAccessInvites: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RespondBusinessAccessInvitesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Accept or decline an invite/request
    ApiResponse<RespondToInvitesResponseArray> response = apiInstance.RespondBusinessAccessInvitesWithHttpInfo(authRespondInvitesBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessInviteApi.RespondBusinessAccessInvitesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authRespondInvitesBody** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md) |  |  |

### Return type

[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)

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

