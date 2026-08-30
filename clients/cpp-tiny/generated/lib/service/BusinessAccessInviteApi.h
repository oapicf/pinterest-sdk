#ifndef TINY_CPP_CLIENT_BusinessAccessInviteApi_H_
#define TINY_CPP_CLIENT_BusinessAccessInviteApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AuthRespondInvitesBody.h"
#include "CancelInvitesRequest.h"
#include "CancelInvitesResponse.h"
#include "CreateAssetAccessRequestBody.h"
#include "CreateAssetAccessRequestResponse.h"
#include "CreateAssetInvitesRequest.h"
#include "CreateInvitesResultsResponseArray.h"
#include "CreateMembershipOrPartnershipInvitesBody.h"
#include "Get_invites_200_response.h"
#include "InviteFilterStatus.h"
#include "InviteType.h"
#include "Pinterest.Lib.Error.h"
#include "RespondToInvitesResponseArray.h"
#include "UpdateInvitesResultsResponseArray.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BusinessAccessInviteApi : public Service {
public:
    BusinessAccessInviteApi() = default;

    virtual ~BusinessAccessInviteApi();

    /**
    * Create a request to access an existing partner's assets..
    *
    * Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param createAssetAccessRequestBody  *Required*
    */
    Response<
                CreateAssetAccessRequestResponse
        >
    assetAccessRequests_create(
            
            std::string businessId
            , 
            
            CreateAssetAccessRequestBody createAssetAccessRequestBody
            
    );
    /**
    * Cancel invites/requests.
    *
    * Cancel membership/partnership invites and/or requests.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param cancelInvitesRequest  *Required*
    */
    Response<
                CancelInvitesResponse
        >
    cancelInvitesOrRequests(
            
            std::string businessId
            , 
            
            CancelInvitesRequest cancelInvitesRequest
            
    );
    /**
    * Update invite/request with an asset permission.
    *
    * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param createAssetInvitesRequest  *Required*
    */
    Response<
                UpdateInvitesResultsResponseArray
        >
    createAssetInvites(
            
            std::string businessId
            , 
            
            CreateAssetInvitesRequest createAssetInvitesRequest
            
    );
    /**
    * Create invites or requests.
    *
    * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param createMembershipOrPartnershipInvitesBody  *Required*
    */
    Response<
                CreateInvitesResultsResponseArray
        >
    createMembershipOrPartnershipInvites(
            
            std::string businessId
            , 
            
            CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody
            
    );
    /**
    * Get invites/requests.
    *
    * Get the membership/partnership invites and/or requests for the authorized user.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param isMember A boolean field to indicate whether the invite is to create a partnership or a membership.
    * \param inviteStatus A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
    * \param inviteType Invite type to filter invites by. Only invites of the specified type will be returned.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Get_invites_200_response
        >
    get_invites(
            
            std::string businessId
            , 
            
            bool isMember
            , 
            std::list<InviteFilterStatus> inviteStatus
            
            , 
            
            InviteType inviteType
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Accept or decline an invite/request.
    *
    * Accept or decline invites or requests.
    * \param authRespondInvitesBody  *Required*
    */
    Response<
                RespondToInvitesResponseArray
        >
    respondBusinessAccessInvites(
            
            AuthRespondInvitesBody authRespondInvitesBody
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BusinessAccessInviteApi_H_ */