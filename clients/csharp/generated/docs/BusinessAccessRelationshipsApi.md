# Org.OpenAPITools.Api.BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DeleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**DeleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**GetBusinessEmployers**](BusinessAccessRelationshipsApi.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user |
| [**GetBusinessMembers**](BusinessAccessRelationshipsApi.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members |
| [**GetBusinessPartners**](BusinessAccessRelationshipsApi.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**UpdateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role |

<a id="deletebusinessmembership"></a>
# **DeleteBusinessMembership**
> DeletedMembersResponse DeleteBusinessMembership (string businessId, MembersToDeleteBody membersToDeleteBody)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteBusinessMembershipExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessRelationshipsApi(config);
            var businessId = 729090764583391194;  // string | Business id
            var membersToDeleteBody = new MembersToDeleteBody(); // MembersToDeleteBody | List of members with role to delete.

            try
            {
                // Terminate business memberships
                DeletedMembersResponse result = apiInstance.DeleteBusinessMembership(businessId, membersToDeleteBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessRelationshipsApi.DeleteBusinessMembership: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteBusinessMembershipWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Terminate business memberships
    ApiResponse<DeletedMembersResponse> response = apiInstance.DeleteBusinessMembershipWithHttpInfo(businessId, membersToDeleteBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessRelationshipsApi.DeleteBusinessMembershipWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Business id |  |
| **membersToDeleteBody** | [**MembersToDeleteBody**](MembersToDeleteBody.md) | List of members with role to delete. |  |

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

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

<a id="deletebusinesspartners"></a>
# **DeleteBusinessPartners**
> DeletePartnersResponse DeleteBusinessPartners (string businessId, DeletePartnersRequest deletePartnersRequest)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteBusinessPartnersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessRelationshipsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var deletePartnersRequest = new DeletePartnersRequest(); // DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 

            try
            {
                // Terminate business partnerships
                DeletePartnersResponse result = apiInstance.DeleteBusinessPartners(businessId, deletePartnersRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessRelationshipsApi.DeleteBusinessPartners: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteBusinessPartnersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Terminate business partnerships
    ApiResponse<DeletePartnersResponse> response = apiInstance.DeleteBusinessPartnersWithHttpInfo(businessId, deletePartnersRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessRelationshipsApi.DeleteBusinessPartnersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **deletePartnersRequest** | [**DeletePartnersRequest**](DeletePartnersRequest.md) | An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  |  |

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | A supplied partner id doesn&#39;t exist |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getbusinessemployers"></a>
# **GetBusinessEmployers**
> GetBusinessEmployers200Response GetBusinessEmployers (int? pageSize = null, string? bookmark = null)

List business employers for user

Get all of the viewing user's business employers.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetBusinessEmployersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessRelationshipsApi(config);
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 

            try
            {
                // List business employers for user
                GetBusinessEmployers200Response result = apiInstance.GetBusinessEmployers(pageSize, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessRelationshipsApi.GetBusinessEmployers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBusinessEmployersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List business employers for user
    ApiResponse<GetBusinessEmployers200Response> response = apiInstance.GetBusinessEmployersWithHttpInfo(pageSize, bookmark);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessRelationshipsApi.GetBusinessEmployersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

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

<a id="getbusinessmembers"></a>
# **GetBusinessMembers**
> GetBusinessMembers200Response GetBusinessMembers (string businessId, bool? assetsSummary = null, List<MemberBusinessRole>? businessRoles = null, string? memberIds = null, int? startIndex = null, string? bookmark = null, int? pageSize = null)

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetBusinessMembersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessRelationshipsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var assetsSummary = false;  // bool? | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)  (default to false)
            var businessRoles = new List<MemberBusinessRole>?(); // List<MemberBusinessRole>? | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional) 
            var memberIds = 00101010101,2222220101;  // string? | A list of business members ids separated by comma. (optional) 
            var startIndex = 0;  // int? | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)  (default to 0)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // Get business members
                GetBusinessMembers200Response result = apiInstance.GetBusinessMembers(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessRelationshipsApi.GetBusinessMembers: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBusinessMembersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get business members
    ApiResponse<GetBusinessMembers200Response> response = apiInstance.GetBusinessMembersWithHttpInfo(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessRelationshipsApi.GetBusinessMembersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **assetsSummary** | **bool?** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **businessRoles** | [**List&lt;MemberBusinessRole&gt;?**](MemberBusinessRole.md) | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional]  |
| **memberIds** | **string?** | A list of business members ids separated by comma. | [optional]  |
| **startIndex** | **int?** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

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

<a id="getbusinesspartners"></a>
# **GetBusinessPartners**
> GetBusinessPartners200Response GetBusinessPartners (string businessId, bool? assetsSummary = null, PartnerType? partnerType = null, string? partnerIds = null, int? startIndex = null, int? pageSize = null, string? bookmark = null)

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetBusinessPartnersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessRelationshipsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var assetsSummary = false;  // bool? | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)  (default to false)
            var partnerType = new PartnerType?(); // PartnerType? | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional) 
            var partnerIds = 00101010101,2222220101;  // string? | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional) 
            var startIndex = 0;  // int? | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)  (default to 0)
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 

            try
            {
                // Get business partners
                GetBusinessPartners200Response result = apiInstance.GetBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessRelationshipsApi.GetBusinessPartners: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBusinessPartnersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get business partners
    ApiResponse<GetBusinessPartners200Response> response = apiInstance.GetBusinessPartnersWithHttpInfo(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessRelationshipsApi.GetBusinessPartnersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **assetsSummary** | **bool?** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **partnerType** | [**PartnerType?**](PartnerType?.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional]  |
| **partnerIds** | **string?** | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional]  |
| **startIndex** | **int?** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

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

<a id="updatebusinessmemberships"></a>
# **UpdateBusinessMemberships**
> UpdateMemberResultsResponseArray UpdateBusinessMemberships (string businessId, List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody)

Update member's business role

Update a member's business role within the business.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateBusinessMembershipsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessRelationshipsApi(config);
            var businessId = 729090764583391194;  // string | Business id
            var updateMemberBusinessRoleBody = new List<UpdateMemberBusinessRoleBody>(); // List<UpdateMemberBusinessRoleBody> | List of objects with the member id and the business_role.

            try
            {
                // Update member's business role
                UpdateMemberResultsResponseArray result = apiInstance.UpdateBusinessMemberships(businessId, updateMemberBusinessRoleBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessRelationshipsApi.UpdateBusinessMemberships: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateBusinessMembershipsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update member's business role
    ApiResponse<UpdateMemberResultsResponseArray> response = apiInstance.UpdateBusinessMembershipsWithHttpInfo(businessId, updateMemberBusinessRoleBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessRelationshipsApi.UpdateBusinessMembershipsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Business id |  |
| **updateMemberBusinessRoleBody** | [**List&lt;UpdateMemberBusinessRoleBody&gt;**](UpdateMemberBusinessRoleBody.md) | List of objects with the member id and the business_role. |  |

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

