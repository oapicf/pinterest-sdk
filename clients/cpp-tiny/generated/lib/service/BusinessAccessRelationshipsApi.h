#ifndef TINY_CPP_CLIENT_BusinessAccessRelationshipsApi_H_
#define TINY_CPP_CLIENT_BusinessAccessRelationshipsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "BrandAccount.h"
#include "BrandAccountCreate.h"
#include "BrandAccountUpdate.h"
#include "BusinessMembershipMember.h"
#include "DeleteBusinessMembershipBody.h"
#include "DeleteBusinessPartners.h"
#include "DeleteBusinessPartnersDelete.h"
#include "Delete_business_membership_200_response.h"
#include "Get_business_employers_200_response.h"
#include "MemberBusinessRole.h"
#include "PartnerType.h"
#include "Pinterest.Lib.Error.h"
#include "SystemUserUpdateWithRequiredBody.h"
#include "UpdateBusinessMembershipsResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BusinessAccessRelationshipsApi : public Service {
public:
    BusinessAccessRelationshipsApi() = default;

    virtual ~BusinessAccessRelationshipsApi();

    /**
    * Create a Brand Account.
    *
    * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
    * \param businessHierarchyId business hierarchy node id *Required*
    * \param brandAccountCreate  *Required*
    */
    Response<
                BrandAccount
        >
    brandAccounts_create(
            
            std::string businessHierarchyId
            , 
            
            BrandAccountCreate brandAccountCreate
            
    );
    /**
    * Update a Brand Account.
    *
    * Update an existing Brand Account
    * \param brandAccountId  *Required*
    * \param businessHierarchyId business hierarchy node id *Required*
    * \param brandAccountUpdate  *Required*
    */
    Response<
                BrandAccount
        >
    brandAccounts_update(
            
            std::string brandAccountId
            , 
            
            std::string businessHierarchyId
            , 
            
            BrandAccountUpdate brandAccountUpdate
            
    );
    /**
    * Terminate business memberships.
    *
    * Terminate memberships between the specified members and your business.
    * \param businessId Business id *Required*
    * \param deleteBusinessMembershipBody  *Required*
    */
    Response<
                Delete_business_membership_200_response
        >
    deleteBusinessMembership(
            
            std::string businessId
            , 
            
            DeleteBusinessMembershipBody deleteBusinessMembershipBody
            
    );
    /**
    * Terminate business partnerships.
    *
    * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param deleteBusinessPartnersDelete  *Required*
    */
    Response<
                DeleteBusinessPartners
        >
    deleteBusinessPartners(
            
            std::string businessId
            , 
            
            DeleteBusinessPartnersDelete deleteBusinessPartnersDelete
            
    );
    /**
    * List business employers for user.
    *
    * Get all of the viewing user's business employers.
    * \param assetsSummary Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Get_business_employers_200_response
        >
    get_businessEmployers(
            
            bool assetsSummary
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Get business members.
    *
    * Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False.
    * \param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    * \param businessRoles A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
    * \param memberIds A list of business members ids separated by comma.
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Get_business_employers_200_response
        >
    get_businessMembers(
            
            std::string businessId
            , 
            
            bool fetchSystemUsers
            , 
            
            bool assetsSummary
            , 
            std::list<MemberBusinessRole> businessRoles
            
            , 
            
            std::string memberIds
            , 
            
            int startIndex
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Get business partners.
    *
    * Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    * \param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
    * \param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * \param sortAscending Sort ascending.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Get_business_employers_200_response
        >
    get_businessPartners(
            
            std::string businessId
            , 
            
            bool assetsSummary
            , 
            
            PartnerType partnerType
            , 
            
            std::string partnerIds
            , 
            
            int startIndex
            , 
            
            bool sortAscending
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Update a system user information..
    *
    * Update a system user information such as name.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param systemUserId Unique identifier of a system user. *Required*
    * \param systemUserUpdateWithRequiredBody  *Required*
    */
    Response<
            String
        >
    systemUser_update(
            
            std::string businessId
            , 
            
            std::string systemUserId
            , 
            
            SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody
            
    );
    /**
    * Update member's business role.
    *
    * Update a member's business role within the business.
    * \param businessId Business id *Required*
    * \param businessMembershipMember  *Required*
    */
    Response<
                UpdateBusinessMembershipsResponse
        >
    update_businessMemberships(
            
            std::string businessId
            , 
            std::list<BusinessMembershipMember> businessMembershipMember
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BusinessAccessRelationshipsApi_H_ */