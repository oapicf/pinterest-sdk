/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Terminate business memberships
* Terminate memberships between the specified members and your business.
*
* businessUnderscoreid String Business id
* membersToDeleteBody MembersToDeleteBody List of members with role to delete.
* returns DeletedMembersResponse
* */
const delete_business_membership = ({ businessUnderscoreid, membersToDeleteBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        membersToDeleteBody,
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
* Terminate business partnerships
* Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* deletePartnersRequest DeletePartnersRequest An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 
* returns DeletePartnersResponse
* */
const delete_business_partners = ({ businessUnderscoreid, deletePartnersRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        deletePartnersRequest,
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
* List business employers for user
* Get all of the viewing user's business employers.
*
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns get_business_employers_200_response
* */
const get/business_employers = ({ pageUnderscoresize, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get business members
* Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
*
* businessUnderscoreid String Unique identifier of the requesting business.
* assetsUnderscoresummary Boolean Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
* businessUnderscoreroles List A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
* memberUnderscoreids String A list of business members ids separated by comma. (optional)
* startUnderscoreindex Integer An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* returns get_business_members_200_response
* */
const get/business_members = ({ businessUnderscoreid, assetsUnderscoresummary, businessUnderscoreroles, memberUnderscoreids, startUnderscoreindex, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        assetsUnderscoresummary,
        businessUnderscoreroles,
        memberUnderscoreids,
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
* Get business partners
* Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* assetsUnderscoresummary Boolean Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
* partnerUnderscoretype PartnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
* partnerUnderscoreids String A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
* startUnderscoreindex Integer An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* returns get_business_partners_200_response
* */
const get/business_partners = ({ businessUnderscoreid, assetsUnderscoresummary, partnerUnderscoretype, partnerUnderscoreids, startUnderscoreindex, pageUnderscoresize, bookmark }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        assetsUnderscoresummary,
        partnerUnderscoretype,
        partnerUnderscoreids,
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
* Update member's business role
* Update a member's business role within the business.
*
* businessUnderscoreid String Business id
* updateMemberBusinessRoleBody List List of objects with the member id and the business_role.
* returns UpdateMemberResultsResponseArray
* */
const update/business_memberships = ({ businessUnderscoreid, updateMemberBusinessRoleBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        updateMemberBusinessRoleBody,
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
  delete_business_membership,
  delete_business_partners,
  get/business_employers,
  get/business_members,
  get/business_partners,
  update/business_memberships,
};
