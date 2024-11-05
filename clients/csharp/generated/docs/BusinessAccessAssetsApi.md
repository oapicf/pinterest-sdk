# Org.OpenAPITools.Api.BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AssetGroupCreate**](BusinessAccessAssetsApi.md#assetgroupcreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group. |
| [**AssetGroupDelete**](BusinessAccessAssetsApi.md#assetgroupdelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups. |
| [**AssetGroupUpdate**](BusinessAccessAssetsApi.md#assetgroupupdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups. |
| [**BusinessAssetMembersGet**](BusinessAccessAssetsApi.md#businessassetmembersget) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset |
| [**BusinessAssetPartnersGet**](BusinessAccessAssetsApi.md#businessassetpartnersget) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset |
| [**BusinessAssetsGet**](BusinessAccessAssetsApi.md#businessassetsget) | **GET** /businesses/{business_id}/assets | List business assets |
| [**BusinessMemberAssetsGet**](BusinessAccessAssetsApi.md#businessmemberassetsget) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member |
| [**BusinessMembersAssetAccessDelete**](BusinessAccessAssetsApi.md#businessmembersassetaccessdelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset |
| [**BusinessMembersAssetAccessUpdate**](BusinessAccessAssetsApi.md#businessmembersassetaccessupdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions |
| [**BusinessPartnerAssetAccessGet**](BusinessAccessAssetsApi.md#businesspartnerassetaccessget) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner |
| [**DeletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset |
| [**UpdatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions |

<a id="assetgroupcreate"></a>
# **AssetGroupCreate**
> CreateAssetGroupResponse AssetGroupCreate (string businessId, CreateAssetGroupBody createAssetGroupBody)

Create a new asset group.

Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AssetGroupCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var createAssetGroupBody = new CreateAssetGroupBody(); // CreateAssetGroupBody | 

            try
            {
                // Create a new asset group.
                CreateAssetGroupResponse result = apiInstance.AssetGroupCreate(businessId, createAssetGroupBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.AssetGroupCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AssetGroupCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create a new asset group.
    ApiResponse<CreateAssetGroupResponse> response = apiInstance.AssetGroupCreateWithHttpInfo(businessId, createAssetGroupBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.AssetGroupCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **createAssetGroupBody** | [**CreateAssetGroupBody**](CreateAssetGroupBody.md) |  |  |

### Return type

[**CreateAssetGroupResponse**](CreateAssetGroupResponse.md)

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

<a id="assetgroupdelete"></a>
# **AssetGroupDelete**
> DeleteAssetGroupResponse AssetGroupDelete (string businessId, DeleteAssetGroupBody deleteAssetGroupBody)

Delete asset groups.

Delete a batch of asset groups.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AssetGroupDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var deleteAssetGroupBody = new DeleteAssetGroupBody(); // DeleteAssetGroupBody | 

            try
            {
                // Delete asset groups.
                DeleteAssetGroupResponse result = apiInstance.AssetGroupDelete(businessId, deleteAssetGroupBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.AssetGroupDelete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AssetGroupDeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete asset groups.
    ApiResponse<DeleteAssetGroupResponse> response = apiInstance.AssetGroupDeleteWithHttpInfo(businessId, deleteAssetGroupBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.AssetGroupDeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **deleteAssetGroupBody** | [**DeleteAssetGroupBody**](DeleteAssetGroupBody.md) |  |  |

### Return type

[**DeleteAssetGroupResponse**](DeleteAssetGroupResponse.md)

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

<a id="assetgroupupdate"></a>
# **AssetGroupUpdate**
> UpdateAssetGroupResponse AssetGroupUpdate (string businessId, UpdateAssetGroupBody updateAssetGroupBody)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AssetGroupUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var updateAssetGroupBody = new UpdateAssetGroupBody(); // UpdateAssetGroupBody | 

            try
            {
                // Update asset groups.
                UpdateAssetGroupResponse result = apiInstance.AssetGroupUpdate(businessId, updateAssetGroupBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.AssetGroupUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AssetGroupUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update asset groups.
    ApiResponse<UpdateAssetGroupResponse> response = apiInstance.AssetGroupUpdateWithHttpInfo(businessId, updateAssetGroupBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.AssetGroupUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **updateAssetGroupBody** | [**UpdateAssetGroupBody**](UpdateAssetGroupBody.md) |  |  |

### Return type

[**UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

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

<a id="businessassetmembersget"></a>
# **BusinessAssetMembersGet**
> BusinessAssetMembersGet200Response BusinessAssetMembersGet (string businessId, string assetId, string? bookmark = null, int? pageSize = null, int? startIndex = null)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BusinessAssetMembersGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var assetId = 729090764583391194;  // string | Unique identifier of a business asset.
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var startIndex = 0;  // int? | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)  (default to 0)

            try
            {
                // Get members with access to asset
                BusinessAssetMembersGet200Response result = apiInstance.BusinessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessAssetMembersGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BusinessAssetMembersGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get members with access to asset
    ApiResponse<BusinessAssetMembersGet200Response> response = apiInstance.BusinessAssetMembersGetWithHttpInfo(businessId, assetId, bookmark, pageSize, startIndex);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessAssetMembersGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **assetId** | **string** | Unique identifier of a business asset. |  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **startIndex** | **int?** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucess |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="businessassetpartnersget"></a>
# **BusinessAssetPartnersGet**
> BusinessAssetPartnersGet200Response BusinessAssetPartnersGet (string businessId, string assetId, int? startIndex = null, string? bookmark = null, int? pageSize = null)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BusinessAssetPartnersGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var assetId = 729090764583391194;  // string | Unique identifier of a business asset.
            var startIndex = 0;  // int? | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)  (default to 0)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // Get partners with access to asset
                BusinessAssetPartnersGet200Response result = apiInstance.BusinessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessAssetPartnersGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BusinessAssetPartnersGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get partners with access to asset
    ApiResponse<BusinessAssetPartnersGet200Response> response = apiInstance.BusinessAssetPartnersGetWithHttpInfo(businessId, assetId, startIndex, bookmark, pageSize);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessAssetPartnersGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **assetId** | **string** | Unique identifier of a business asset. |  |
| **startIndex** | **int?** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**BusinessAssetPartnersGet200Response**](BusinessAssetPartnersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucess |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="businessassetsget"></a>
# **BusinessAssetsGet**
> BusinessAssetsGet200Response BusinessAssetsGet (string businessId, List<PermissionsWithOwner>? permissions = null, string? childAssetId = null, string? assetGroupId = null, string? assetType = null, int? startIndex = null, string? bookmark = null, int? pageSize = null)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BusinessAssetsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var permissions = new List<PermissionsWithOwner>?(); // List<PermissionsWithOwner>? | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional) 
            var childAssetId = 549764894835;  // string? | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional) 
            var assetGroupId = 7078106104032;  // string? | An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional) 
            var assetType = AD_ACCOUNT;  // string? | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)  (default to AD_ACCOUNT)
            var startIndex = 0;  // int? | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)  (default to 0)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // List business assets
                BusinessAssetsGet200Response result = apiInstance.BusinessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessAssetsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BusinessAssetsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List business assets
    ApiResponse<BusinessAssetsGet200Response> response = apiInstance.BusinessAssetsGetWithHttpInfo(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessAssetsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **permissions** | [**List&lt;PermissionsWithOwner&gt;?**](PermissionsWithOwner.md) | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional]  |
| **childAssetId** | **string?** | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional]  |
| **assetGroupId** | **string?** | An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional]  |
| **assetType** | **string?** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] |
| **startIndex** | **int?** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

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

<a id="businessmemberassetsget"></a>
# **BusinessMemberAssetsGet**
> BusinessMemberAssetsGet200Response BusinessMemberAssetsGet (string businessId, string memberId, string? assetType = null, int? startIndex = null, string? bookmark = null, int? pageSize = null)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BusinessMemberAssetsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var memberId = 729090764583391194;  // string | The member id to fetch assets for.
            var assetType = AD_ACCOUNT;  // string? | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)  (default to AD_ACCOUNT)
            var startIndex = 0;  // int? | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)  (default to 0)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // Get assets assigned to a member
                BusinessMemberAssetsGet200Response result = apiInstance.BusinessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessMemberAssetsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BusinessMemberAssetsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get assets assigned to a member
    ApiResponse<BusinessMemberAssetsGet200Response> response = apiInstance.BusinessMemberAssetsGetWithHttpInfo(businessId, memberId, assetType, startIndex, bookmark, pageSize);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessMemberAssetsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **memberId** | **string** | The member id to fetch assets for. |  |
| **assetType** | **string?** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] |
| **startIndex** | **int?** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**BusinessMemberAssetsGet200Response**](BusinessMemberAssetsGet200Response.md)

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

<a id="businessmembersassetaccessdelete"></a>
# **BusinessMembersAssetAccessDelete**
> DeleteMemberAccessResultsResponseArray BusinessMembersAssetAccessDelete (string businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest)

Delete member access to asset

Terminate multiple members' access to an asset.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BusinessMembersAssetAccessDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var businessMembersAssetAccessDeleteRequest = new BusinessMembersAssetAccessDeleteRequest(); // BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.

            try
            {
                // Delete member access to asset
                DeleteMemberAccessResultsResponseArray result = apiInstance.BusinessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessMembersAssetAccessDelete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BusinessMembersAssetAccessDeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete member access to asset
    ApiResponse<DeleteMemberAccessResultsResponseArray> response = apiInstance.BusinessMembersAssetAccessDeleteWithHttpInfo(businessId, businessMembersAssetAccessDeleteRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessMembersAssetAccessDeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **businessMembersAssetAccessDeleteRequest** | [**BusinessMembersAssetAccessDeleteRequest**](BusinessMembersAssetAccessDeleteRequest.md) | List member assset permissions to delete. |  |

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

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

<a id="businessmembersassetaccessupdate"></a>
# **BusinessMembersAssetAccessUpdate**
> UpdateMemberAssetsResultsResponseArray BusinessMembersAssetAccessUpdate (string businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BusinessMembersAssetAccessUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var updateMemberAssetAccessBody = new UpdateMemberAssetAccessBody(); // UpdateMemberAssetAccessBody | List of member asset permissions to create or update.

            try
            {
                // Assign/Update member asset permissions
                UpdateMemberAssetsResultsResponseArray result = apiInstance.BusinessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessMembersAssetAccessUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BusinessMembersAssetAccessUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Assign/Update member asset permissions
    ApiResponse<UpdateMemberAssetsResultsResponseArray> response = apiInstance.BusinessMembersAssetAccessUpdateWithHttpInfo(businessId, updateMemberAssetAccessBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessMembersAssetAccessUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md) | List of member asset permissions to create or update. |  |

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

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

<a id="businesspartnerassetaccessget"></a>
# **BusinessPartnerAssetAccessGet**
> BusinessPartnerAssetAccessGet200Response BusinessPartnerAssetAccessGet (string businessId, string partnerId, PartnerType? partnerType = null, string? assetType = null, int? startIndex = null, int? pageSize = null, string? bookmark = null)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BusinessPartnerAssetAccessGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var partnerId = 729090764583391194;  // string | The partner id to be bound to the Business
            var partnerType = new PartnerType?(); // PartnerType? | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional) 
            var assetType = AD_ACCOUNT;  // string? | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)  (default to AD_ACCOUNT)
            var startIndex = 0;  // int? | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)  (default to 0)
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 

            try
            {
                // Get assets assigned to a partner or assets assigned by a partner
                BusinessPartnerAssetAccessGet200Response result = apiInstance.BusinessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessPartnerAssetAccessGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BusinessPartnerAssetAccessGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get assets assigned to a partner or assets assigned by a partner
    ApiResponse<BusinessPartnerAssetAccessGet200Response> response = apiInstance.BusinessPartnerAssetAccessGetWithHttpInfo(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.BusinessPartnerAssetAccessGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **partnerId** | **string** | The partner id to be bound to the Business |  |
| **partnerType** | [**PartnerType?**](PartnerType?.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional]  |
| **assetType** | **string?** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] |
| **startIndex** | **int?** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

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

<a id="deletepartnerassetaccesshandlerimpl"></a>
# **DeletePartnerAssetAccessHandlerImpl**
> DeletePartnerAssetsResultsResponseArray DeletePartnerAssetAccessHandlerImpl (string businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody)

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeletePartnerAssetAccessHandlerImplExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var deletePartnerAssetAccessBody = new DeletePartnerAssetAccessBody(); // DeletePartnerAssetAccessBody | 

            try
            {
                // Delete partner access to asset
                DeletePartnerAssetsResultsResponseArray result = apiInstance.DeletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.DeletePartnerAssetAccessHandlerImpl: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeletePartnerAssetAccessHandlerImplWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete partner access to asset
    ApiResponse<DeletePartnerAssetsResultsResponseArray> response = apiInstance.DeletePartnerAssetAccessHandlerImplWithHttpInfo(businessId, deletePartnerAssetAccessBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.DeletePartnerAssetAccessHandlerImplWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **deletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md) |  |  |

### Return type

[**DeletePartnerAssetsResultsResponseArray**](DeletePartnerAssetsResultsResponseArray.md)

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

<a id="updatepartnerassetaccesshandlerimpl"></a>
# **UpdatePartnerAssetAccessHandlerImpl**
> UpdatePartnerAssetsResultsResponseArray UpdatePartnerAssetAccessHandlerImpl (string businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdatePartnerAssetAccessHandlerImplExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BusinessAccessAssetsApi(config);
            var businessId = 729090764583391194;  // string | Unique identifier of the requesting business.
            var updatePartnerAssetAccessBody = new UpdatePartnerAssetAccessBody(); // UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.

            try
            {
                // Assign/Update partner asset permissions
                UpdatePartnerAssetsResultsResponseArray result = apiInstance.UpdatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BusinessAccessAssetsApi.UpdatePartnerAssetAccessHandlerImpl: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdatePartnerAssetAccessHandlerImplWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Assign/Update partner asset permissions
    ApiResponse<UpdatePartnerAssetsResultsResponseArray> response = apiInstance.UpdatePartnerAssetAccessHandlerImplWithHttpInfo(businessId, updatePartnerAssetAccessBody);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BusinessAccessAssetsApi.UpdatePartnerAssetAccessHandlerImplWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md) | A list of assets and permissions to assign to your partners. |  |

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

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

