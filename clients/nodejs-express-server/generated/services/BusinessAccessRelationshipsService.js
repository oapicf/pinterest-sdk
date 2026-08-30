/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create a Brand Account
* Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
*
* businessUnderscorehierarchyUnderscoreid String business hierarchy node id
* brandAccountCreate BrandAccountCreate 
* returns BrandAccount
* */
const brand_accounts/create = ({ businessUnderscorehierarchyUnderscoreid, brandAccountCreate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscorehierarchyUnderscoreid,
        brandAccountCreate,
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
* Update a Brand Account
* Update an existing Brand Account
*
* brandUnderscoreaccountUnderscoreid String 
* businessUnderscorehierarchyUnderscoreid String business hierarchy node id
* brandAccountUpdate BrandAccountUpdate 
* returns BrandAccount
* */
const brand_accounts/update = ({ brandUnderscoreaccountUnderscoreid, businessUnderscorehierarchyUnderscoreid, brandAccountUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        brandUnderscoreaccountUnderscoreid,
        businessUnderscorehierarchyUnderscoreid,
        brandAccountUpdate,
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
* Terminate business memberships
* Terminate memberships between the specified members and your business.
*
* businessUnderscoreid String Business id
* deleteBusinessMembershipBody DeleteBusinessMembershipBody 
* returns delete_business_membership_200_response
* */
const delete_business_membership = ({ businessUnderscoreid, deleteBusinessMembershipBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        deleteBusinessMembershipBody,
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
* deleteBusinessPartnersDelete DeleteBusinessPartnersDelete 
* returns DeleteBusinessPartners
* */
const delete_business_partners = ({ businessUnderscoreid, deleteBusinessPartnersDelete }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        deleteBusinessPartnersDelete,
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
* assetsUnderscoresummary Boolean Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns get_business_employers_200_response
* */
const get/business_employers = ({ assetsUnderscoresummary, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        assetsUnderscoresummary,
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
* Get business members
* Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
*
* businessUnderscoreid String Unique identifier of the requesting business.
* fetchUnderscoresystemUnderscoreusers Boolean Fetches system users if True. Fetches regular user employees if False. (optional)
* assetsUnderscoresummary Boolean Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
* businessUnderscoreroles List A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
* memberUnderscoreids String A list of business members ids separated by comma. (optional)
* startUnderscoreindex Integer An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns get_business_employers_200_response
* */
const get/business_members = ({ businessUnderscoreid, fetchUnderscoresystemUnderscoreusers, assetsUnderscoresummary, businessUnderscoreroles, memberUnderscoreids, startUnderscoreindex, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        fetchUnderscoresystemUnderscoreusers,
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
* partnerUnderscoretype PartnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
* partnerUnderscoreids String A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
* startUnderscoreindex Integer An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
* sortUnderscoreascending Boolean Sort ascending. (optional)
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
* returns get_business_employers_200_response
* */
const get/business_partners = ({ businessUnderscoreid, assetsUnderscoresummary, partnerUnderscoretype, partnerUnderscoreids, startUnderscoreindex, sortUnderscoreascending, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        assetsUnderscoresummary,
        partnerUnderscoretype,
        partnerUnderscoreids,
        startUnderscoreindex,
        sortUnderscoreascending,
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
* Update a system user information.
* Update a system user information such as name.
*
* businessUnderscoreid String Unique identifier of the requesting business.
* systemUnderscoreuserUnderscoreid String Unique identifier of a system user.
* systemUserUpdateWithRequiredBody SystemUserUpdateWithRequiredBody 
* no response value expected for this operation
* */
const system_user/update = ({ businessUnderscoreid, systemUnderscoreuserUnderscoreid, systemUserUpdateWithRequiredBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        systemUnderscoreuserUnderscoreid,
        systemUserUpdateWithRequiredBody,
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
* businessMembershipMember List 
* returns UpdateBusinessMembershipsResponse
* */
const update/business_memberships = ({ businessUnderscoreid, businessMembershipMember }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        businessUnderscoreid,
        businessMembershipMember,
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
  brand_accounts/create,
  brand_accounts/update,
  delete_business_membership,
  delete_business_partners,
  get/business_employers,
  get/business_members,
  get/business_partners,
  system_user/update,
  update/business_memberships,
};
