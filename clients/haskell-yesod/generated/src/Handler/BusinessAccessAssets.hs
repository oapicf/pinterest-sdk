{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.BusinessAccessAssets where

import           Import


-- | Create a new asset group.
--
-- Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
-- operationId: assetGroup/create
postBusinessesByTextAssetGroupsR :: Text -- ^ Unique identifier of the requesting business.
                                 -> Handler Value
postBusinessesByTextAssetGroupsR businessId = notImplemented

-- | Delete asset groups.
--
-- Delete a batch of asset groups.
-- operationId: assetGroup/delete
deleteBusinessesByTextAssetGroupsR :: Text -- ^ Unique identifier of the requesting business.
                                   -> Handler Value
deleteBusinessesByTextAssetGroupsR businessId = notImplemented

-- | Update asset groups.
--
-- Update a batch of asset groups with the specified parameters.
-- operationId: assetGroup/update
patchBusinessesByTextAssetGroupsR :: Text -- ^ Unique identifier of the requesting business.
                                  -> Handler Value
patchBusinessesByTextAssetGroupsR businessId = notImplemented

-- | Get members with access to asset
--
-- Get all the members the requesting business has granted access to on the given asset.
-- operationId: businessAssetMembers/get
getBusinessesByTextAssetsByTextMembersR :: Text -- ^ Unique identifier of the requesting business.
                                        -> Text -- ^ Unique identifier of a business asset.
                                        -> Handler Value
getBusinessesByTextAssetsByTextMembersR businessId assetId = notImplemented

-- | Get partners with access to asset
--
-- Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
-- operationId: businessAssetPartners/get
getBusinessesByTextAssetsByTextPartnersR :: Text -- ^ Unique identifier of the requesting business.
                                         -> Text -- ^ Unique identifier of a business asset.
                                         -> Handler Value
getBusinessesByTextAssetsByTextPartnersR businessId assetId = notImplemented

-- | List business assets
--
-- Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
-- operationId: businessAssets/get
getBusinessesByTextAssetsR :: Text -- ^ Unique identifier of the requesting business.
                           -> Handler Value
getBusinessesByTextAssetsR businessId = notImplemented

-- | Get assets assigned to a member
--
-- Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
-- operationId: businessMemberAssets/get
getBusinessesByTextMembersByTextAssetsR :: Text -- ^ Unique identifier of the requesting business.
                                        -> Text -- ^ The member id to fetch assets for.
                                        -> Handler Value
getBusinessesByTextMembersByTextAssetsR businessId memberId = notImplemented

-- | Delete member access to asset
--
-- Terminate multiple members&#39; access to an asset.
-- operationId: businessMembersAssetAccess/delete
deleteBusinessesByTextMembersAssetsAccessR :: Text -- ^ Unique identifier of the requesting business.
                                           -> Handler Value
deleteBusinessesByTextMembersAssetsAccessR businessId = notImplemented

-- | Assign/Update member asset permissions
--
-- Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
-- operationId: businessMembersAssetAccess/update
patchBusinessesByTextMembersAssetsAccessR :: Text -- ^ Unique identifier of the requesting business.
                                          -> Handler Value
patchBusinessesByTextMembersAssetsAccessR businessId = notImplemented

-- | Get assets assigned to a partner or assets assigned by a partner
--
-- Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
-- operationId: businessPartnerAssetAccess/get
getBusinessesByTextPartnersByTextAssetsR :: Text -- ^ Unique identifier of the requesting business.
                                         -> Text -- ^ The partner id to be bound to the Business
                                         -> Handler Value
getBusinessesByTextPartnersByTextAssetsR businessId partnerId = notImplemented

-- | Delete partner access to asset
--
-- Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
-- operationId: deletePartnerAssetAccessHandlerImpl
deleteBusinessesByTextPartnersAssetsR :: Text -- ^ Unique identifier of the requesting business.
                                      -> Handler Value
deleteBusinessesByTextPartnersAssetsR businessId = notImplemented

-- | Assign/Update partner asset permissions
--
-- Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
-- operationId: updatePartnerAssetAccessHandlerImpl
patchBusinessesByTextPartnersAssetsR :: Text -- ^ Unique identifier of the requesting business.
                                     -> Handler Value
patchBusinessesByTextPartnersAssetsR businessId = notImplemented
