# PinterestSdk.BusinessAccessAssetsApi

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let createAssetGroupBody = new PinterestSdk.CreateAssetGroupBody(); // CreateAssetGroupBody | 
apiInstance.assetGroupCreate(businessId, createAssetGroupBody, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let deleteAssetGroupBody = new PinterestSdk.DeleteAssetGroupBody(); // DeleteAssetGroupBody | 
apiInstance.assetGroupDelete(businessId, deleteAssetGroupBody, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let updateAssetGroupBody = new PinterestSdk.UpdateAssetGroupBody(); // UpdateAssetGroupBody | 
apiInstance.assetGroupUpdate(businessId, updateAssetGroupBody, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **updateAssetGroupBody** | [**UpdateAssetGroupBody**](UpdateAssetGroupBody.md)|  | 

### Return type

[**UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## businessAssetMembersGet

> BusinessAssetMembersGet200Response businessAssetMembersGet(businessId, assetId, opts)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let assetId = "729090764583391194"; // String | Unique identifier of a business asset.
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  'startIndex': 0 // Number | An index to start fetching the results from. Only the results starting from this index will be returned.
};
apiInstance.businessAssetMembersGet(businessId, assetId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **assetId** | **String**| Unique identifier of a business asset. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **startIndex** | **Number**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## businessAssetPartnersGet

> BusinessAssetPartnersGet200Response businessAssetPartnersGet(businessId, assetId, opts)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let assetId = "729090764583391194"; // String | Unique identifier of a business asset.
let opts = {
  'startIndex': 0, // Number | An index to start fetching the results from. Only the results starting from this index will be returned.
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25 // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
};
apiInstance.businessAssetPartnersGet(businessId, assetId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **assetId** | **String**| Unique identifier of a business asset. | 
 **startIndex** | **Number**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetPartnersGet200Response**](BusinessAssetPartnersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## businessAssetsGet

> BusinessAssetsGet200Response businessAssetsGet(businessId, opts)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let opts = {
  'permissions': [new PinterestSdk.PermissionsWithOwner()], // [PermissionsWithOwner] | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
  'childAssetId': "549764894835", // String | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
  'assetGroupId': "7078106104032", // String | An asset group unique identifier. Used to fetch assets contained within the specified asset group.
  'assetType': "AD_ACCOUNT", // String | A resource type to filter the assets by. Only assets of the specified type will be returned.
  'startIndex': 0, // Number | An index to start fetching the results from. Only the results starting from this index will be returned.
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25 // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
};
apiInstance.businessAssetsGet(businessId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **permissions** | [**[PermissionsWithOwner]**](PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] 
 **childAssetId** | **String**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] 
 **assetGroupId** | **String**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] 
 **assetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **startIndex** | **Number**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## businessMemberAssetsGet

> BusinessMemberAssetsGet200Response businessMemberAssetsGet(businessId, memberId, opts)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let memberId = "729090764583391194"; // String | The member id to fetch assets for.
let opts = {
  'assetType': "AD_ACCOUNT", // String | A resource type to filter the assets by. Only assets of the specified type will be returned.
  'startIndex': 0, // Number | An index to start fetching the results from. Only the results starting from this index will be returned.
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25 // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
};
apiInstance.businessMemberAssetsGet(businessId, memberId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **memberId** | **String**| The member id to fetch assets for. | 
 **assetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **startIndex** | **Number**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let businessMembersAssetAccessDeleteRequest = new PinterestSdk.BusinessMembersAssetAccessDeleteRequest(); // BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.
apiInstance.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let updateMemberAssetAccessBody = new PinterestSdk.UpdateMemberAssetAccessBody(); // UpdateMemberAssetAccessBody | List of member asset permissions to create or update.
apiInstance.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md)| List of member asset permissions to create or update. | 

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## businessPartnerAssetAccessGet

> BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(businessId, partnerId, opts)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let partnerId = "729090764583391194"; // String | The partner id to be bound to the Business
let opts = {
  'partnerType': new PinterestSdk.PartnerType(), // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
  'assetType': "AD_ACCOUNT", // String | A resource type to filter the assets by. Only assets of the specified type will be returned.
  'startIndex': 0, // Number | An index to start fetching the results from. Only the results starting from this index will be returned.
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  'bookmark': "bookmark_example" // String | Cursor used to fetch the next page of items
};
apiInstance.businessPartnerAssetAccessGet(businessId, partnerId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **partnerId** | **String**| The partner id to be bound to the Business | 
 **partnerType** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **assetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **startIndex** | **Number**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let deletePartnerAssetAccessBody = new PinterestSdk.DeletePartnerAssetAccessBody(); // DeletePartnerAssetAccessBody | 
apiInstance.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessAssetsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let updatePartnerAssetAccessBody = new PinterestSdk.UpdatePartnerAssetAccessBody(); // UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.
apiInstance.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md)| A list of assets and permissions to assign to your partners. | 

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

