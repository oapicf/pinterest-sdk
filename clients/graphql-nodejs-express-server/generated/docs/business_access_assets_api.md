# business_access_assets_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssetGroupCreate**](business_access_assets_api.md#AssetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**AssetGroupDelete**](business_access_assets_api.md#AssetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**AssetGroupUpdate**](business_access_assets_api.md#AssetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**BusinessAssetMembersGet**](business_access_assets_api.md#BusinessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**BusinessAssetPartnersGet**](business_access_assets_api.md#BusinessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**BusinessAssetsGet**](business_access_assets_api.md#BusinessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets
[**BusinessMemberAssetsGet**](business_access_assets_api.md#BusinessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**BusinessMembersAssetAccessDelete**](business_access_assets_api.md#BusinessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**BusinessMembersAssetAccessUpdate**](business_access_assets_api.md#BusinessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**BusinessPartnerAssetAccessGet**](business_access_assets_api.md#BusinessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**DeletePartnerAssetAccessHandlerImpl**](business_access_assets_api.md#DeletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**UpdatePartnerAssetAccessHandlerImpl**](business_access_assets_api.md#UpdatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


<a name="AssetGroupCreate"></a>
# **AssetGroupCreate**
> CreateAssetGroupResponse AssetGroupCreate(businessId, createAssetGroupBody)

Create a new asset group.

Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
<a name="AssetGroupDelete"></a>
# **AssetGroupDelete**
> DeleteAssetGroupResponse AssetGroupDelete(businessId, deleteAssetGroupBody)

Delete asset groups.

Delete a batch of asset groups.
<a name="AssetGroupUpdate"></a>
# **AssetGroupUpdate**
> UpdateAssetGroupResponse AssetGroupUpdate(businessId, updateAssetGroupBody)

Update asset groups.

Update a batch of asset groups with the specified parameters.
<a name="BusinessAssetMembersGet"></a>
# **BusinessAssetMembersGet**
> BusinessAssetMembersGet200Response BusinessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.
<a name="BusinessAssetPartnersGet"></a>
# **BusinessAssetPartnersGet**
> BusinessAssetPartnersGet200Response BusinessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
<a name="BusinessAssetsGet"></a>
# **BusinessAssetsGet**
> BusinessAssetsGet200Response BusinessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
<a name="BusinessMemberAssetsGet"></a>
# **BusinessMemberAssetsGet**
> BusinessMemberAssetsGet200Response BusinessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
<a name="BusinessMembersAssetAccessDelete"></a>
# **BusinessMembersAssetAccessDelete**
> DeleteMemberAccessResultsResponseArray BusinessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest)

Delete member access to asset

Terminate multiple members&#39; access to an asset.
<a name="BusinessMembersAssetAccessUpdate"></a>
# **BusinessMembersAssetAccessUpdate**
> UpdateMemberAssetsResultsResponseArray BusinessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
<a name="BusinessPartnerAssetAccessGet"></a>
# **BusinessPartnerAssetAccessGet**
> BusinessPartnerAssetAccessGet200Response BusinessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
<a name="DeletePartnerAssetAccessHandlerImpl"></a>
# **DeletePartnerAssetAccessHandlerImpl**
> DeletePartnerAssetsResultsResponseArray DeletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)

Delete partner access to asset

Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
<a name="UpdatePartnerAssetAccessHandlerImpl"></a>
# **UpdatePartnerAssetAccessHandlerImpl**
> UpdatePartnerAssetsResultsResponseArray UpdatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
