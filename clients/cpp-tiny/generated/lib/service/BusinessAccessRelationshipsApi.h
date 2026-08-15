#ifndef TINY_CPP_CLIENT_BusinessAccessRelationshipsApi_H_
#define TINY_CPP_CLIENT_BusinessAccessRelationshipsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Brand_accounts_create_200_response.h"
#include "Brand_accounts_create_request.h"
#include "Brand_accounts_update_request.h"
#include "DeletePartnersRequest.h"
#include "DeletePartnersResponse.h"
#include "DeletedMembersResponse.h"
#include "Error.h"
#include "Get_business_employers_200_response.h"
#include "Get_business_members_200_response.h"
#include "Get_business_partners_200_response.h"
#include "MemberBusinessRole.h"
#include "MembersToDeleteBody.h"
#include "PartnerType.h"
#include "System_user_update_request.h"
#include "UpdateMemberBusinessRoleBody.h"
#include "UpdateMemberResultsResponseArray.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BusinessAccessRelationshipsApi : public Service {
public:
    BusinessAccessRelationshipsApi() = default;

    virtual ~BusinessAccessRelationshipsApi() = default;

    /**
    * Create a Brand Account.
    *
    * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
    * \param businessHierarchyId business hierarchy node id *Required*
    * \param brandAccountsCreateRequest  *Required*
    */
    Response<
                Brand_accounts_create_200_response
        >
    brandAccounts_create(
            
            std::string businessHierarchyId
            , 
            
            Brand_accounts_create_request brandAccountsCreateRequest
            
    );
    /**
    * Update a Brand Account.
    *
    * Update an existing Brand Account
    * \param businessHierarchyId business hierarchy node id *Required*
    * \param brandAccountId Unique identifier of a brand account. *Required*
    * \param brandAccountsUpdateRequest  *Required*
    */
    Response<
                Brand_accounts_create_200_response
        >
    brandAccounts_update(
            
            std::string businessHierarchyId
            , 
            
            std::string brandAccountId
            , 
            
            Brand_accounts_update_request brandAccountsUpdateRequest
            
    );
    /**
    * Terminate business memberships.
    *
    * Terminate memberships between the specified members and your business.
    * \param businessId Business id *Required*
    * \param membersToDeleteBody List of members with role to delete. *Required*
    */
    Response<
                DeletedMembersResponse
        >
    deleteBusinessMembership(
            
            std::string businessId
            , 
            
            MembersToDeleteBody membersToDeleteBody
            
    );
    /**
    * Terminate business partnerships.
    *
    * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param deletePartnersRequest An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete.  *Required*
    */
    Response<
                DeletePartnersResponse
        >
    deleteBusinessPartners(
            
            std::string businessId
            , 
            
            DeletePartnersRequest deletePartnersRequest
            
    );
    /**
    * List business employers for user.
    *
    * Get all of the viewing user's business employers.
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Get_business_employers_200_response
        >
    get_businessEmployers(
            
            int pageSize
            , 
            
            std::string bookmark
            
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
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Get_business_members_200_response
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
    * \param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
    * \param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Get_business_partners_200_response
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
            
            int pageSize
            , 
            
            std::string bookmark
            
    );
    /**
    * Update a system user information..
    *
    * Update a system user information such as name.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param systemUserId Unique identifier of a system user. *Required*
    * \param systemUserUpdateRequest  *Required*
    */
    Response<
            String
        >
    systemUser_update(
            
            std::string businessId
            , 
            
            std::string systemUserId
            , 
            
            System_user_update_request systemUserUpdateRequest
            
    );
    /**
    * Update member's business role.
    *
    * Update a member's business role within the business.
    * \param businessId Business id *Required*
    * \param updateMemberBusinessRoleBody List of objects with the member id and the business_role. *Required*
    */
    Response<
                UpdateMemberResultsResponseArray
        >
    update_businessMemberships(
            
            std::string businessId
            , 
            std::list<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BusinessAccessRelationshipsApi_H_ */