# BusinessAccessAssetsController

All URIs are relative to `"/v5"`

The controller class is defined in **[BusinessAccessAssetsController.java](../../src/main/java/org/openapitools/controller/BusinessAccessAssetsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetGroupCreate**](#assetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**assetGroupDelete**](#assetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**assetGroupUpdate**](#assetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**businessAssetMembersGet**](#businessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**businessAssetPartnersGet**](#businessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**businessAssetsGet**](#businessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets
[**businessMemberAssetsGet**](#businessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**businessMembersAssetAccessDelete**](#businessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**businessMembersAssetAccessUpdate**](#businessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**businessPartnerAssetAccessGet**](#businessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**deletePartnerAssetAccessHandlerImpl**](#deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**updatePartnerAssetAccessHandlerImpl**](#updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions

<a id="assetGroupCreate"></a>
# **assetGroupCreate**
```java
Mono<CreateAssetGroupResponse> BusinessAccessAssetsController.assetGroupCreate(businessIdcreateAssetGroupBody)
```

Create a new asset group.

Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**createAssetGroupBody** | [**CreateAssetGroupBody**](../../docs/models/CreateAssetGroupBody.md) |  |

### Return type
[**CreateAssetGroupResponse**](../../docs/models/CreateAssetGroupResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="assetGroupDelete"></a>
# **assetGroupDelete**
```java
Mono<DeleteAssetGroupResponse> BusinessAccessAssetsController.assetGroupDelete(businessIddeleteAssetGroupBody)
```

Delete asset groups.

Delete a batch of asset groups.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**deleteAssetGroupBody** | [**DeleteAssetGroupBody**](../../docs/models/DeleteAssetGroupBody.md) |  |

### Return type
[**DeleteAssetGroupResponse**](../../docs/models/DeleteAssetGroupResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="assetGroupUpdate"></a>
# **assetGroupUpdate**
```java
Mono<UpdateAssetGroupResponse> BusinessAccessAssetsController.assetGroupUpdate(businessIdupdateAssetGroupBody)
```

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**updateAssetGroupBody** | [**UpdateAssetGroupBody**](../../docs/models/UpdateAssetGroupBody.md) |  |

### Return type
[**UpdateAssetGroupResponse**](../../docs/models/UpdateAssetGroupResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="businessAssetMembersGet"></a>
# **businessAssetMembersGet**
```java
Mono<BusinessAssetMembersGet200Response> BusinessAccessAssetsController.businessAssetMembersGet(businessIdassetIdbookmarkpageSizestartIndex)
```

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**assetId** | `String` | Unique identifier of a business asset. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**startIndex** | `Integer` | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional parameter] [default to `0`]

### Return type
[**BusinessAssetMembersGet200Response**](../../docs/models/BusinessAssetMembersGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="businessAssetPartnersGet"></a>
# **businessAssetPartnersGet**
```java
Mono<BusinessAssetPartnersGet200Response> BusinessAccessAssetsController.businessAssetPartnersGet(businessIdassetIdstartIndexbookmarkpageSize)
```

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**assetId** | `String` | Unique identifier of a business asset. |
**startIndex** | `Integer` | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional parameter] [default to `0`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**BusinessAssetPartnersGet200Response**](../../docs/models/BusinessAssetPartnersGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="businessAssetsGet"></a>
# **businessAssetsGet**
```java
Mono<BusinessAssetsGet200Response> BusinessAccessAssetsController.businessAssetsGet(businessIdpermissionschildAssetIdassetGroupIdassetTypestartIndexbookmarkpageSize)
```

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**permissions** | [**List&lt;PermissionsWithOwner&gt;**](../../docs/models/PermissionsWithOwner.md) | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional parameter]
**childAssetId** | `String` | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional parameter]
**assetGroupId** | `String` | An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional parameter]
**assetType** | `String` | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional parameter] [default to `AD_ACCOUNT`] [enum: `AD_ACCOUNT`, `PROFILE`, `ASSET_GROUP`]
**startIndex** | `Integer` | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional parameter] [default to `0`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**BusinessAssetsGet200Response**](../../docs/models/BusinessAssetsGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="businessMemberAssetsGet"></a>
# **businessMemberAssetsGet**
```java
Mono<BusinessMemberAssetsGet200Response> BusinessAccessAssetsController.businessMemberAssetsGet(businessIdmemberIdassetTypestartIndexbookmarkpageSize)
```

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**memberId** | `String` | The member id to fetch assets for. |
**assetType** | `String` | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional parameter] [default to `AD_ACCOUNT`] [enum: `AD_ACCOUNT`, `PROFILE`, `ASSET_GROUP`]
**startIndex** | `Integer` | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional parameter] [default to `0`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**BusinessMemberAssetsGet200Response**](../../docs/models/BusinessMemberAssetsGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="businessMembersAssetAccessDelete"></a>
# **businessMembersAssetAccessDelete**
```java
Mono<DeleteMemberAccessResultsResponseArray> BusinessAccessAssetsController.businessMembersAssetAccessDelete(businessIdbusinessMembersAssetAccessDeleteRequest)
```

Delete member access to asset

Terminate multiple members&#39; access to an asset.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**businessMembersAssetAccessDeleteRequest** | [**BusinessMembersAssetAccessDeleteRequest**](../../docs/models/BusinessMembersAssetAccessDeleteRequest.md) | List member assset permissions to delete. |

### Return type
[**DeleteMemberAccessResultsResponseArray**](../../docs/models/DeleteMemberAccessResultsResponseArray.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="businessMembersAssetAccessUpdate"></a>
# **businessMembersAssetAccessUpdate**
```java
Mono<UpdateMemberAssetsResultsResponseArray> BusinessAccessAssetsController.businessMembersAssetAccessUpdate(businessIdupdateMemberAssetAccessBody)
```

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](../../docs/models/UpdateMemberAssetAccessBody.md) | List of member asset permissions to create or update. |

### Return type
[**UpdateMemberAssetsResultsResponseArray**](../../docs/models/UpdateMemberAssetsResultsResponseArray.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="businessPartnerAssetAccessGet"></a>
# **businessPartnerAssetAccessGet**
```java
Mono<BusinessPartnerAssetAccessGet200Response> BusinessAccessAssetsController.businessPartnerAssetAccessGet(businessIdpartnerIdpartnerTypeassetTypestartIndexpageSizebookmark)
```

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**partnerId** | `String` | The partner id to be bound to the Business |
**partnerType** | [**PartnerType**](../../docs/models/.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional parameter]
**assetType** | `String` | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional parameter] [default to `AD_ACCOUNT`] [enum: `AD_ACCOUNT`, `PROFILE`, `ASSET_GROUP`]
**startIndex** | `Integer` | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional parameter] [default to `0`]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

### Return type
[**BusinessPartnerAssetAccessGet200Response**](../../docs/models/BusinessPartnerAssetAccessGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="deletePartnerAssetAccessHandlerImpl"></a>
# **deletePartnerAssetAccessHandlerImpl**
```java
Mono<DeletePartnerAssetsResultsResponseArray> BusinessAccessAssetsController.deletePartnerAssetAccessHandlerImpl(businessIddeletePartnerAssetAccessBody)
```

Delete partner access to asset

Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**deletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](../../docs/models/DeletePartnerAssetAccessBody.md) |  |

### Return type
[**DeletePartnerAssetsResultsResponseArray**](../../docs/models/DeletePartnerAssetsResultsResponseArray.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="updatePartnerAssetAccessHandlerImpl"></a>
# **updatePartnerAssetAccessHandlerImpl**
```java
Mono<UpdatePartnerAssetsResultsResponseArray> BusinessAccessAssetsController.updatePartnerAssetAccessHandlerImpl(businessIdupdatePartnerAssetAccessBody)
```

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](../../docs/models/UpdatePartnerAssetAccessBody.md) | A list of assets and permissions to assign to your partners. |

### Return type
[**UpdatePartnerAssetsResultsResponseArray**](../../docs/models/UpdatePartnerAssetsResultsResponseArray.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

