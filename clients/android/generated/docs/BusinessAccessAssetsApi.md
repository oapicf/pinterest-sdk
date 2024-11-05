# BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetGroupCreate**](BusinessAccessAssetsApi.md#assetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**assetGroupDelete**](BusinessAccessAssetsApi.md#assetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**assetGroupUpdate**](BusinessAccessAssetsApi.md#assetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**businessAssetMembersGet**](BusinessAccessAssetsApi.md#businessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**businessAssetPartnersGet**](BusinessAccessAssetsApi.md#businessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**businessAssetsGet**](BusinessAccessAssetsApi.md#businessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets
[**businessMemberAssetsGet**](BusinessAccessAssetsApi.md#businessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**businessMembersAssetAccessDelete**](BusinessAccessAssetsApi.md#businessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**businessMembersAssetAccessUpdate**](BusinessAccessAssetsApi.md#businessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**businessPartnerAssetAccessGet**](BusinessAccessAssetsApi.md#businessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**deletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**updatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions



## assetGroupCreate

> CreateAssetGroupResponse assetGroupCreate(businessId, createAssetGroupBody)

Create a new asset group.

Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
CreateAssetGroupBody createAssetGroupBody = new CreateAssetGroupBody(); // CreateAssetGroupBody | 
try {
    CreateAssetGroupResponse result = apiInstance.assetGroupCreate(businessId, createAssetGroupBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#assetGroupCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **createAssetGroupBody** | [**CreateAssetGroupBody**](CreateAssetGroupBody.md)|  |

### Return type

[**CreateAssetGroupResponse**](CreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## assetGroupDelete

> DeleteAssetGroupResponse assetGroupDelete(businessId, deleteAssetGroupBody)

Delete asset groups.

Delete a batch of asset groups.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
DeleteAssetGroupBody deleteAssetGroupBody = new DeleteAssetGroupBody(); // DeleteAssetGroupBody | 
try {
    DeleteAssetGroupResponse result = apiInstance.assetGroupDelete(businessId, deleteAssetGroupBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#assetGroupDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **deleteAssetGroupBody** | [**DeleteAssetGroupBody**](DeleteAssetGroupBody.md)|  |

### Return type

[**DeleteAssetGroupResponse**](DeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## assetGroupUpdate

> UpdateAssetGroupResponse assetGroupUpdate(businessId, updateAssetGroupBody)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
UpdateAssetGroupBody updateAssetGroupBody = new UpdateAssetGroupBody(); // UpdateAssetGroupBody | 
try {
    UpdateAssetGroupResponse result = apiInstance.assetGroupUpdate(businessId, updateAssetGroupBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#assetGroupUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **updateAssetGroupBody** | [**UpdateAssetGroupBody**](UpdateAssetGroupBody.md)|  |

### Return type

[**UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## businessAssetMembersGet

> BusinessAssetMembersGet200Response businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
String assetId = 729090764583391194; // String | Unique identifier of a business asset.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
try {
    BusinessAssetMembersGet200Response result = apiInstance.businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#businessAssetMembersGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **assetId** | **String**| Unique identifier of a business asset. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## businessAssetPartnersGet

> BusinessAssetPartnersGet200Response businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
String assetId = 729090764583391194; // String | Unique identifier of a business asset.
Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    BusinessAssetPartnersGet200Response result = apiInstance.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#businessAssetPartnersGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **assetId** | **String**| Unique identifier of a business asset. | [default to null]
 **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetPartnersGet200Response**](BusinessAssetPartnersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## businessAssetsGet

> BusinessAssetsGet200Response businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
List<PermissionsWithOwner> permissions = null; // List<PermissionsWithOwner> | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
String childAssetId = 549764894835; // String | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
String assetGroupId = 7078106104032; // String | An asset group unique identifier. Used to fetch assets contained within the specified asset group.
String assetType = AD_ACCOUNT; // String | A resource type to filter the assets by. Only assets of the specified type will be returned.
Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    BusinessAssetsGet200Response result = apiInstance.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#businessAssetsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **permissions** | [**List&lt;PermissionsWithOwner&gt;**](PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] [default to null]
 **childAssetId** | **String**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] [default to null]
 **assetGroupId** | **String**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] [default to null]
 **assetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP]
 **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## businessMemberAssetsGet

> BusinessMemberAssetsGet200Response businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
String memberId = 729090764583391194; // String | The member id to fetch assets for.
String assetType = AD_ACCOUNT; // String | A resource type to filter the assets by. Only assets of the specified type will be returned.
Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    BusinessMemberAssetsGet200Response result = apiInstance.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#businessMemberAssetsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **memberId** | **String**| The member id to fetch assets for. | [default to null]
 **assetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP]
 **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessMemberAssetsGet200Response**](BusinessMemberAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## businessMembersAssetAccessDelete

> DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest)

Delete member access to asset

Terminate multiple members&#39; access to an asset.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest = new BusinessMembersAssetAccessDeleteRequest(); // BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.
try {
    DeleteMemberAccessResultsResponseArray result = apiInstance.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#businessMembersAssetAccessDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **businessMembersAssetAccessDeleteRequest** | [**BusinessMembersAssetAccessDeleteRequest**](BusinessMembersAssetAccessDeleteRequest.md)| List member assset permissions to delete. |

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## businessMembersAssetAccessUpdate

> UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
UpdateMemberAssetAccessBody updateMemberAssetAccessBody = new UpdateMemberAssetAccessBody(); // UpdateMemberAssetAccessBody | List of member asset permissions to create or update.
try {
    UpdateMemberAssetsResultsResponseArray result = apiInstance.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#businessMembersAssetAccessUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md)| List of member asset permissions to create or update. |

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## businessPartnerAssetAccessGet

> BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
String partnerId = 729090764583391194; // String | The partner id to be bound to the Business
PartnerType partnerType = INTERNAL; // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
String assetType = AD_ACCOUNT; // String | A resource type to filter the assets by. Only assets of the specified type will be returned.
Integer startIndex = 0; // Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
String bookmark = null; // String | Cursor used to fetch the next page of items
try {
    BusinessPartnerAssetAccessGet200Response result = apiInstance.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#businessPartnerAssetAccessGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **partnerId** | **String**| The partner id to be bound to the Business | [default to null]
 **partnerType** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to null]
 **assetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP]
 **startIndex** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deletePartnerAssetAccessHandlerImpl

> DeletePartnerAssetsResultsResponseArray deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)

Delete partner access to asset

Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = new DeletePartnerAssetAccessBody(); // DeletePartnerAssetAccessBody | 
try {
    DeletePartnerAssetsResultsResponseArray result = apiInstance.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#deletePartnerAssetAccessHandlerImpl");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **deletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md)|  |

### Return type

[**DeletePartnerAssetsResultsResponseArray**](DeletePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updatePartnerAssetAccessHandlerImpl

> UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BusinessAccessAssetsApi;

BusinessAccessAssetsApi apiInstance = new BusinessAccessAssetsApi();
String businessId = 729090764583391194; // String | Unique identifier of the requesting business.
UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = new UpdatePartnerAssetAccessBody(); // UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.
try {
    UpdatePartnerAssetsResultsResponseArray result = apiInstance.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessAccessAssetsApi#updatePartnerAssetAccessHandlerImpl");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | [default to null]
 **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md)| A list of assets and permissions to assign to your partners. |

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

