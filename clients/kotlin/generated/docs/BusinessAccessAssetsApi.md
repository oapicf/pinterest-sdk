# BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
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


<a id="assetGroupCreate"></a>
# **assetGroupCreate**
> CreateAssetGroupResponse assetGroupCreate(businessId, createAssetGroupBody)

Create a new asset group.

Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val createAssetGroupBody : CreateAssetGroupBody =  // CreateAssetGroupBody | 
try {
    val result : CreateAssetGroupResponse = apiInstance.assetGroupCreate(businessId, createAssetGroupBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#assetGroupCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#assetGroupCreate")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createAssetGroupBody** | [**CreateAssetGroupBody**](CreateAssetGroupBody.md)|  | |

### Return type

[**CreateAssetGroupResponse**](CreateAssetGroupResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="assetGroupDelete"></a>
# **assetGroupDelete**
> DeleteAssetGroupResponse assetGroupDelete(businessId, deleteAssetGroupBody)

Delete asset groups.

Delete a batch of asset groups.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val deleteAssetGroupBody : DeleteAssetGroupBody =  // DeleteAssetGroupBody | 
try {
    val result : DeleteAssetGroupResponse = apiInstance.assetGroupDelete(businessId, deleteAssetGroupBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#assetGroupDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#assetGroupDelete")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteAssetGroupBody** | [**DeleteAssetGroupBody**](DeleteAssetGroupBody.md)|  | |

### Return type

[**DeleteAssetGroupResponse**](DeleteAssetGroupResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="assetGroupUpdate"></a>
# **assetGroupUpdate**
> UpdateAssetGroupResponse assetGroupUpdate(businessId, updateAssetGroupBody)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val updateAssetGroupBody : UpdateAssetGroupBody =  // UpdateAssetGroupBody | 
try {
    val result : UpdateAssetGroupResponse = apiInstance.assetGroupUpdate(businessId, updateAssetGroupBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#assetGroupUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#assetGroupUpdate")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateAssetGroupBody** | [**UpdateAssetGroupBody**](UpdateAssetGroupBody.md)|  | |

### Return type

[**UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="businessAssetMembersGet"></a>
# **businessAssetMembersGet**
> BusinessAssetMembersGet200Response businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val assetId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of a business asset.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
val startIndex : kotlin.Int = 0 // kotlin.Int | An index to start fetching the results from. Only the results starting from this index will be returned.
try {
    val result : BusinessAssetMembersGet200Response = apiInstance.businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#businessAssetMembersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#businessAssetMembersGet")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| **assetId** | **kotlin.String**| Unique identifier of a business asset. | |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **kotlin.Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="businessAssetPartnersGet"></a>
# **businessAssetPartnersGet**
> BusinessAssetPartnersGet200Response businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val assetId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of a business asset.
val startIndex : kotlin.Int = 0 // kotlin.Int | An index to start fetching the results from. Only the results starting from this index will be returned.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    val result : BusinessAssetPartnersGet200Response = apiInstance.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#businessAssetPartnersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#businessAssetPartnersGet")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| **assetId** | **kotlin.String**| Unique identifier of a business asset. | |
| **startIndex** | **kotlin.Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**BusinessAssetPartnersGet200Response**](BusinessAssetPartnersGet200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="businessAssetsGet"></a>
# **businessAssetsGet**
> BusinessAssetsGet200Response businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val permissions : kotlin.collections.List<PermissionsWithOwner> =  // kotlin.collections.List<PermissionsWithOwner> | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
val childAssetId : kotlin.String = 549764894835 // kotlin.String | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
val assetGroupId : kotlin.String = 7078106104032 // kotlin.String | An asset group unique identifier. Used to fetch assets contained within the specified asset group.
val assetType : kotlin.String = AD_ACCOUNT // kotlin.String | A resource type to filter the assets by. Only assets of the specified type will be returned.
val startIndex : kotlin.Int = 0 // kotlin.Int | An index to start fetching the results from. Only the results starting from this index will be returned.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    val result : BusinessAssetsGet200Response = apiInstance.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#businessAssetsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#businessAssetsGet")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| **permissions** | [**kotlin.collections.List&lt;PermissionsWithOwner&gt;**](PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] |
| **childAssetId** | **kotlin.String**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] |
| **assetGroupId** | **kotlin.String**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] |
| **assetType** | **kotlin.String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP] |
| **startIndex** | **kotlin.Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="businessMemberAssetsGet"></a>
# **businessMemberAssetsGet**
> BusinessMemberAssetsGet200Response businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val memberId : kotlin.String = 729090764583391194 // kotlin.String | The member id to fetch assets for.
val assetType : kotlin.String = AD_ACCOUNT // kotlin.String | A resource type to filter the assets by. Only assets of the specified type will be returned.
val startIndex : kotlin.Int = 0 // kotlin.Int | An index to start fetching the results from. Only the results starting from this index will be returned.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
try {
    val result : BusinessMemberAssetsGet200Response = apiInstance.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#businessMemberAssetsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#businessMemberAssetsGet")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| **memberId** | **kotlin.String**| The member id to fetch assets for. | |
| **assetType** | **kotlin.String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP] |
| **startIndex** | **kotlin.Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**BusinessMemberAssetsGet200Response**](BusinessMemberAssetsGet200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="businessMembersAssetAccessDelete"></a>
# **businessMembersAssetAccessDelete**
> DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest)

Delete member access to asset

Terminate multiple members&#39; access to an asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val businessMembersAssetAccessDeleteRequest : BusinessMembersAssetAccessDeleteRequest =  // BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.
try {
    val result : DeleteMemberAccessResultsResponseArray = apiInstance.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#businessMembersAssetAccessDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#businessMembersAssetAccessDelete")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessMembersAssetAccessDeleteRequest** | [**BusinessMembersAssetAccessDeleteRequest**](BusinessMembersAssetAccessDeleteRequest.md)| List member assset permissions to delete. | |

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="businessMembersAssetAccessUpdate"></a>
# **businessMembersAssetAccessUpdate**
> UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val updateMemberAssetAccessBody : UpdateMemberAssetAccessBody =  // UpdateMemberAssetAccessBody | List of member asset permissions to create or update.
try {
    val result : UpdateMemberAssetsResultsResponseArray = apiInstance.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#businessMembersAssetAccessUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#businessMembersAssetAccessUpdate")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md)| List of member asset permissions to create or update. | |

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="businessPartnerAssetAccessGet"></a>
# **businessPartnerAssetAccessGet**
> BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val partnerId : kotlin.String = 729090764583391194 // kotlin.String | The partner id to be bound to the Business
val partnerType : PartnerType = INTERNAL // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
val assetType : kotlin.String = AD_ACCOUNT // kotlin.String | A resource type to filter the assets by. Only assets of the specified type will be returned.
val startIndex : kotlin.Int = 0 // kotlin.Int | An index to start fetching the results from. Only the results starting from this index will be returned.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : BusinessPartnerAssetAccessGet200Response = apiInstance.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#businessPartnerAssetAccessGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#businessPartnerAssetAccessGet")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| **partnerId** | **kotlin.String**| The partner id to be bound to the Business | |
| **partnerType** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] |
| **assetType** | **kotlin.String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP] |
| **startIndex** | **kotlin.Int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deletePartnerAssetAccessHandlerImpl"></a>
# **deletePartnerAssetAccessHandlerImpl**
> DeletePartnerAssetsResultsResponseArray deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)

Delete partner access to asset

Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val deletePartnerAssetAccessBody : DeletePartnerAssetAccessBody =  // DeletePartnerAssetAccessBody | 
try {
    val result : DeletePartnerAssetsResultsResponseArray = apiInstance.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#deletePartnerAssetAccessHandlerImpl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#deletePartnerAssetAccessHandlerImpl")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md)|  | |

### Return type

[**DeletePartnerAssetsResultsResponseArray**](DeletePartnerAssetsResultsResponseArray.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updatePartnerAssetAccessHandlerImpl"></a>
# **updatePartnerAssetAccessHandlerImpl**
> UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessAccessAssetsApi()
val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
val updatePartnerAssetAccessBody : UpdatePartnerAssetAccessBody =  // UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.
try {
    val result : UpdatePartnerAssetsResultsResponseArray = apiInstance.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessAccessAssetsApi#updatePartnerAssetAccessHandlerImpl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessAccessAssetsApi#updatePartnerAssetAccessHandlerImpl")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.String**| Unique identifier of the requesting business. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md)| A list of assets and permissions to assign to your partners. | |

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

