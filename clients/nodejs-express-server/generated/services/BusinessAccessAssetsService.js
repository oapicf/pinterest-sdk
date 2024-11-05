/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create a new asset group.
* Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* createAssetGroupBody CreateAssetGroupBody 
* returns CreateAssetGroupResponse
* */
const asset_group/create = ({ businessUnderscoreid, createAssetGroupBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        createAssetGroupBody,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete asset groups.
* Delete a batch of asset groups.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* deleteAssetGroupBody DeleteAssetGroupBody 
* returns DeleteAssetGroupResponse
* */
const asset_group/delete = ({ businessUnderscoreid, deleteAssetGroupBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        deleteAssetGroupBody,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update asset groups.
* Update a batch of asset groups with the specified parameters.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* updateAssetGroupBody UpdateAssetGroupBody 
* returns UpdateAssetGroupResponse
* */
const asset_group/update = ({ businessUnderscoreid, updateAssetGroupBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        updateAssetGroupBody,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get members with access to asset
* Get all the members the requesting business has granted access to on the given asset.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* assetUnderscoreid String Unique identifier of a business asset.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* startUnderscoreindex Integer An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
* returns business_asset_members_get_200_response
* */
const business_asset_members/get = ({ businessUnderscoreid, assetUnderscoreid, bookmark, pageUnderscoresize, startUnderscoreindex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        assetUnderscoreid,
        bookmark,
        pageUnderscoresize,
        startUnderscoreindex,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get partners with access to asset
* Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* assetUnderscoreid String Unique identifier of a business asset.
* startUnderscoreindex Integer An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* returns business_asset_partners_get_200_response
* */
const business_asset_partners/get = ({ businessUnderscoreid, assetUnderscoreid, startUnderscoreindex, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        assetUnderscoreid,
        startUnderscoreindex,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List business assets
* Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* permissions List A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
* childUnderscoreassetUnderscoreid String A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
* assetUnderscoregroupUnderscoreid String An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
* assetUnderscoretype String A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)
* startUnderscoreindex Integer An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* returns business_assets_get_200_response
* */
const business_assets/get = ({ businessUnderscoreid, permissions, childUnderscoreassetUnderscoreid, assetUnderscoregroupUnderscoreid, assetUnderscoretype, startUnderscoreindex, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        permissions,
        childUnderscoreassetUnderscoreid,
        assetUnderscoregroupUnderscoreid,
        assetUnderscoretype,
        startUnderscoreindex,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get assets assigned to a member
* Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* memberUnderscoreid String The member id to fetch assets for.
* assetUnderscoretype String A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)
* startUnderscoreindex Integer An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* returns business_member_assets_get_200_response
* */
const business_member_assets/get = ({ businessUnderscoreid, memberUnderscoreid, assetUnderscoretype, startUnderscoreindex, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        memberUnderscoreid,
        assetUnderscoretype,
        startUnderscoreindex,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete member access to asset
* Terminate multiple members' access to an asset.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* businessMembersAssetAccessDeleteRequest BusinessMembersAssetAccessDeleteRequest List member assset permissions to delete.
* returns DeleteMemberAccessResultsResponseArray
* */
const business_members_asset_access/delete = ({ businessUnderscoreid, businessMembersAssetAccessDeleteRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        businessMembersAssetAccessDeleteRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Assign/Update member asset permissions
* Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
*
* businessUnderscoreid String Unique identifier of the requesting business.
* updateMemberAssetAccessBody UpdateMemberAssetAccessBody List of member asset permissions to create or update.
* returns UpdateMemberAssetsResultsResponseArray
* */
const business_members_asset_access/update = ({ businessUnderscoreid, updateMemberAssetAccessBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        updateMemberAssetAccessBody,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get assets assigned to a partner or assets assigned by a partner
* Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* partnerUnderscoreid String The partner id to be bound to the Business
* partnerUnderscoretype PartnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
* assetUnderscoretype String A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)
* startUnderscoreindex Integer An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns business_partner_asset_access_get_200_response
* */
const business_partner_asset_access/get = ({ businessUnderscoreid, partnerUnderscoreid, partnerUnderscoretype, assetUnderscoretype, startUnderscoreindex, pageUnderscoresize, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        partnerUnderscoreid,
        partnerUnderscoretype,
        assetUnderscoretype,
        startUnderscoreindex,
        pageUnderscoresize,
        bookmark,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete partner access to asset
* Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* deletePartnerAssetAccessBody DeletePartnerAssetAccessBody 
* returns DeletePartnerAssetsResultsResponseArray
* */
const delete_partner_asset_access_handler_impl = ({ businessUnderscoreid, deletePartnerAssetAccessBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        deletePartnerAssetAccessBody,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Assign/Update partner asset permissions
* Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* updatePartnerAssetAccessBody UpdatePartnerAssetAccessBody A list of assets and permissions to assign to your partners.
* returns UpdatePartnerAssetsResultsResponseArray
* */
const update_partner_asset_access_handler_impl = ({ businessUnderscoreid, updatePartnerAssetAccessBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        updatePartnerAssetAccessBody,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  asset_group/create,
  asset_group/delete,
  asset_group/update,
  business_asset_members/get,
  business_asset_partners/get,
  business_assets/get,
  business_member_assets/get,
  business_members_asset_access/delete,
  business_members_asset_access/update,
  business_partner_asset_access/get,
  delete_partner_asset_access_handler_impl,
  update_partner_asset_access_handler_impl,
};
