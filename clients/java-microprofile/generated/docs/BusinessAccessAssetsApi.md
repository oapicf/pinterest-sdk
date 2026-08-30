# BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assetGroupCreate**](BusinessAccessAssetsApi.md#assetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group. |
| [**assetGroupDelete**](BusinessAccessAssetsApi.md#assetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups. |
| [**assetGroupUpdate**](BusinessAccessAssetsApi.md#assetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups. |
| [**businessAssetMembersGet**](BusinessAccessAssetsApi.md#businessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset |
| [**businessAssetPartnersGet**](BusinessAccessAssetsApi.md#businessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset |
| [**businessAssetsGet**](BusinessAccessAssetsApi.md#businessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets |
| [**businessMemberAssetsGet**](BusinessAccessAssetsApi.md#businessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member |
| [**businessMembersAssetAccessDelete**](BusinessAccessAssetsApi.md#businessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset |
| [**businessMembersAssetAccessUpdate**](BusinessAccessAssetsApi.md#businessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions |
| [**businessPartnerAssetAccessGet**](BusinessAccessAssetsApi.md#businessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner |
| [**deletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset |
| [**updatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions |



## assetGroupCreate

> AssetGroupInput assetGroupCreate(businessId, assetGroupInputCreate)

Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        AssetGroupInputCreate assetGroupInputCreate = new AssetGroupInputCreate(); // AssetGroupInputCreate | 
        try {
            AssetGroupInput result = apiInstance.assetGroupCreate(businessId, assetGroupInputCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#assetGroupCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **assetGroupInputCreate** | [**AssetGroupInputCreate**](AssetGroupInputCreate.md)|  | |

### Return type

[**AssetGroupInput**](AssetGroupInput.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## assetGroupDelete

> AssetGroupDeletion assetGroupDelete(businessId, assetGroupDeletionDelete)

Delete asset groups.

Delete a batch of asset groups.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        AssetGroupDeletionDelete assetGroupDeletionDelete = new AssetGroupDeletionDelete(); // AssetGroupDeletionDelete | 
        try {
            AssetGroupDeletion result = apiInstance.assetGroupDelete(businessId, assetGroupDeletionDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#assetGroupDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **assetGroupDeletionDelete** | [**AssetGroupDeletionDelete**](AssetGroupDeletionDelete.md)|  | |

### Return type

[**AssetGroupDeletion**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **200** | An unexpected error response. |  -  |


## assetGroupUpdate

> AssetGroupModification assetGroupUpdate(businessId, assetGroupModificationReadOrUpdate)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate = new AssetGroupModificationReadOrUpdate(); // AssetGroupModificationReadOrUpdate | 
        try {
            AssetGroupModification result = apiInstance.assetGroupUpdate(businessId, assetGroupModificationReadOrUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#assetGroupUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **assetGroupModificationReadOrUpdate** | [**AssetGroupModificationReadOrUpdate**](AssetGroupModificationReadOrUpdate.md)|  | |

### Return type

[**AssetGroupModification**](AssetGroupModification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## businessAssetMembersGet

> BusinessAssetMembersGet200Response businessAssetMembersGet(businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        String assetId = "assetId_example"; // String | Unique identifier of a business asset.
        Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
        Boolean fetchSystemUsers = false; // Boolean | Fetches system users if True. Fetches regular user employees if False.
        String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
        Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        try {
            BusinessAssetMembersGet200Response result = apiInstance.businessAssetMembersGet(businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#businessAssetMembersGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **assetId** | **String**| Unique identifier of a business asset. | |
| **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **fetchSystemUsers** | **Boolean**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## businessAssetPartnersGet

> BusinessAssetMembersGet200Response businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        String assetId = "assetId_example"; // String | Unique identifier of a business asset.
        Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
        String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
        Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        try {
            BusinessAssetMembersGet200Response result = apiInstance.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#businessAssetPartnersGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **assetId** | **String**| Unique identifier of a business asset. | |
| **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## businessAssetsGet

> BusinessAssetsGet200Response businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        List<PermissionsWithOwner> permissions = Arrays.asList(); // List<PermissionsWithOwner> | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
        String childAssetId = "childAssetId_example"; // String | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
        String assetGroupId = "assetGroupId_example"; // String | An asset group unique identifier. Used to fetch assets contained within the specified asset group.
        String assetType = "AD_ACCOUNT"; // String | A resource type to filter the assets by. Only assets of the specified type will be returned.
        Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
        String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
        Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        try {
            BusinessAssetsGet200Response result = apiInstance.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#businessAssetsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **permissions** | [**List&lt;PermissionsWithOwner&gt;**](PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] |
| **childAssetId** | **String**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] |
| **assetGroupId** | **String**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] |
| **assetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER] |
| **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## businessMemberAssetsGet

> BusinessMemberAssetsGetResponse businessMemberAssetsGet(businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        String memberId = "memberId_example"; // String | The member id to fetch assets for.
        String assetType = "AD_ACCOUNT"; // String | A resource type to filter the assets by. Only assets of the specified type will be returned.
        Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
        AssetSortBy sortBy = AssetSortBy.fromValue("NAME"); // AssetSortBy | The field to sort member assets by
        Boolean sortAscending = true; // Boolean | Sort assets in ascending order
        AssetSearchBy searchBy = AssetSearchBy.fromValue("NAME"); // AssetSearchBy | The field to search member assets by
        String searchValue = "searchValue_example"; // String | The value to search for
        AssetPermissionType assetPermissionType = AssetPermissionType.fromValue("AGGREGATED_PERMISSION"); // AssetPermissionType | The type of asset permission to filter by
        List<NonDraftEntityStatus> adAccountStatuses = Arrays.asList(); // List<NonDraftEntityStatus> | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
        String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
        Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        try {
            BusinessMemberAssetsGetResponse result = apiInstance.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#businessMemberAssetsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **memberId** | **String**| The member id to fetch assets for. | |
| **assetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER, CONVERSION_TAG] |
| **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **sortBy** | [**AssetSortBy**](.md)| The field to sort member assets by | [optional] [enum: NAME, ID, PERMISSIONS] |
| **sortAscending** | **Boolean**| Sort assets in ascending order | [optional] [default to true] |
| **searchBy** | [**AssetSearchBy**](.md)| The field to search member assets by | [optional] [enum: NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER] |
| **searchValue** | **String**| The value to search for | [optional] |
| **assetPermissionType** | [**AssetPermissionType**](.md)| The type of asset permission to filter by | [optional] [enum: AGGREGATED_PERMISSION, DIRECT_PERMISSION] |
| **adAccountStatuses** | [**List&lt;NonDraftEntityStatus&gt;**](NonDraftEntityStatus.md)| A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [optional] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BusinessMemberAssetsGetResponse**](BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## businessMembersAssetAccessDelete

> DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteBody)

Delete member access to asset

Terminate multiple members&#39; access to an asset.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody = new BusinessMembersAssetAccessDeleteBody(); // BusinessMembersAssetAccessDeleteBody | 
        try {
            DeleteMemberAccessResultsResponseArray result = apiInstance.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#businessMembersAssetAccessDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **businessMembersAssetAccessDeleteBody** | [**BusinessMembersAssetAccessDeleteBody**](BusinessMembersAssetAccessDeleteBody.md)|  | |

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
| **200** | The request has succeeded. |  -  |
| **200** | An unexpected error response. |  -  |


## businessMembersAssetAccessUpdate

> UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        UpdateMemberAssetAccessBody updateMemberAssetAccessBody = new UpdateMemberAssetAccessBody(); // UpdateMemberAssetAccessBody | 
        try {
            UpdateMemberAssetsResultsResponseArray result = apiInstance.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#businessMembersAssetAccessUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md)|  | |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## businessPartnerAssetAccessGet

> BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        String partnerId = "partnerId_example"; // String | The partner id to be bound to the Business
        String partnerType = "INTERNAL"; // String | Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
        String assetType = "AD_ACCOUNT"; // String | A resource type to filter the assets by. Only assets of the specified type will be returned.
        Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
        AssetSortBy sortBy = AssetSortBy.fromValue("NAME"); // AssetSortBy | The field to sort member assets by
        Boolean sortAscending = true; // Boolean | Sort assets in ascending order
        AssetSearchBy searchBy = AssetSearchBy.fromValue("NAME"); // AssetSearchBy | The field to search member assets by
        String searchValue = "searchValue_example"; // String | The value to search for
        String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
        Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        try {
            BusinessPartnerAssetAccessGet200Response result = apiInstance.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#businessPartnerAssetAccessGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **partnerId** | **String**| The partner id to be bound to the Business | |
| **partnerType** | **String**| Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to INTERNAL] [enum: INTERNAL, EXTERNAL] |
| **assetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, PINNER_LIST, CONVERSION_TAG, CATALOG, CONSUMER, CONVERSION_SEGMENT] |
| **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **sortBy** | [**AssetSortBy**](.md)| The field to sort member assets by | [optional] [enum: NAME, ID, PERMISSIONS] |
| **sortAscending** | **Boolean**| Sort assets in ascending order | [optional] [default to true] |
| **searchBy** | [**AssetSearchBy**](.md)| The field to search member assets by | [optional] [enum: NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER] |
| **searchValue** | **String**| The value to search for | [optional] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## deletePartnerAssetAccessHandlerImpl

> DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)

Delete partner access to asset

Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = new DeletePartnerAssetAccessBody(); // DeletePartnerAssetAccessBody | 
        try {
            DeletePartnerAssetAccessResultsResponseArray result = apiInstance.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#deletePartnerAssetAccessHandlerImpl");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **deletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md)|  | |

### Return type

[**DeletePartnerAssetAccessResultsResponseArray**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **200** | An unexpected error response. |  -  |


## updatePartnerAssetAccessHandlerImpl

> UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.BusinessAccessAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi(defaultClient);
        String businessId = "businessId_example"; // String | Unique identifier of the requesting business.
        UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = new UpdatePartnerAssetAccessBody(); // UpdatePartnerAssetAccessBody | 
        try {
            UpdatePartnerAssetsResultsResponseArray result = apiInstance.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessAccessAssetsApi#updatePartnerAssetAccessHandlerImpl");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **String**| Unique identifier of the requesting business. | |
| **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md)|  | |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |

