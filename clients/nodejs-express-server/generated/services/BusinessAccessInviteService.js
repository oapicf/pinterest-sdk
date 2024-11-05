/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create a request to access an existing partner's assets.
* Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* createAssetAccessRequestBody CreateAssetAccessRequestBody 
* returns CreateAssetAccessRequestResponse
* */
const asset_access_requests/create = ({ businessUnderscoreid, createAssetAccessRequestBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        createAssetAccessRequestBody,
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
* Cancel invites/requests
* Cancel membership/partnership invites and/or requests.
*
* businessUnderscoreid String Business id
* cancelInvitesBody CancelInvitesBody A list with invite ids
* returns DeleteInvitesResultsResponseArray
* */
const cancel_invites_or_requests = ({ businessUnderscoreid, cancelInvitesBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        cancelInvitesBody,
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
* Update invite/request with an asset permission
* Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* createAssetInvitesRequest CreateAssetInvitesRequest A list of invites/requests together with the asset permissions to be assigned to the invite/request. 
* returns UpdateInvitesResultsResponseArray
* */
const create_asset_invites = ({ businessUnderscoreid, createAssetInvitesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        createAssetInvitesRequest,
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
* Create invites or requests
* Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
*
* businessUnderscoreid String Business id
* createMembershipOrPartnershipInvitesBody CreateMembershipOrPartnershipInvitesBody An object with the properties: invite_type, partners, members, business_role
* returns CreateInvitesResultsResponseArray
* */
const create_membership_or_partnership_invites = ({ businessUnderscoreid, createMembershipOrPartnershipInvitesBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        createMembershipOrPartnershipInvitesBody,
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
* Get invites/requests
* Get the membership/partnership invites and/or requests for the authorized user.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* isUnderscoremember Boolean A boolean field to indicate whether the invite is to create a partnership or a membership. (optional)
* inviteUnderscorestatus List A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional)
* inviteUnderscoretype InviteType Invite type to filter invites by. Only invites of the specified type will be returned. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* returns get_invites_200_response
* */
const get/invites = ({ businessUnderscoreid, isUnderscoremember, inviteUnderscorestatus, inviteUnderscoretype, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        isUnderscoremember,
        inviteUnderscorestatus,
        inviteUnderscoretype,
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
* Accept or decline an invite/request
* Accept or decline invites or requests.
*
* authRespondInvitesBody AuthRespondInvitesBody 
* returns RespondToInvitesResponseArray
* */
const respond_business_access_invites = ({ authRespondInvitesBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authRespondInvitesBody,
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
  asset_access_requests/create,
  cancel_invites_or_requests,
  create_asset_invites,
  create_membership_or_partnership_invites,
  get/invites,
  respond_business_access_invites,
};
