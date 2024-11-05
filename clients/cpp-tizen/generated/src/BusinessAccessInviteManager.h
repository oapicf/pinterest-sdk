#ifndef _BusinessAccessInviteManager_H_
#define _BusinessAccessInviteManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AuthRespondInvitesBody.h"
#include "CancelInvitesBody.h"
#include "CreateAssetAccessRequestBody.h"
#include "CreateAssetAccessRequestResponse.h"
#include "CreateAssetInvitesRequest.h"
#include "CreateInvitesResultsResponseArray.h"
#include "CreateMembershipOrPartnershipInvitesBody.h"
#include "DeleteInvitesResultsResponseArray.h"
#include "Error.h"
#include "Get_invites_200_response.h"
#include "InviteType.h"
#include "RespondToInvitesResponseArray.h"
#include "UpdateInvitesResultsResponseArray.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup BusinessAccessInvite BusinessAccessInvite
 * \ingroup Operations
 *  @{
 */
class BusinessAccessInviteManager {
public:
	BusinessAccessInviteManager();
	virtual ~BusinessAccessInviteManager();

/*! \brief Create a request to access an existing partner's assets.. *Synchronous*
 *
 * Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param createAssetAccessRequestBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool assetAccessRequestsCreateSync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetAccessRequestBody> createAssetAccessRequestBody, 
	void(* handler)(CreateAssetAccessRequestResponse, Error, void* )
	, void* userData);

/*! \brief Create a request to access an existing partner's assets.. *Asynchronous*
 *
 * Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param createAssetAccessRequestBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool assetAccessRequestsCreateAsync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetAccessRequestBody> createAssetAccessRequestBody, 
	void(* handler)(CreateAssetAccessRequestResponse, Error, void* )
	, void* userData);


/*! \brief Cancel invites/requests. *Synchronous*
 *
 * Cancel membership/partnership invites and/or requests.
 * \param businessId Business id *Required*
 * \param cancelInvitesBody A list with invite ids *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelInvitesOrRequestsSync(char * accessToken,
	std::string businessId, std::shared_ptr<CancelInvitesBody> cancelInvitesBody, 
	void(* handler)(DeleteInvitesResultsResponseArray, Error, void* )
	, void* userData);

/*! \brief Cancel invites/requests. *Asynchronous*
 *
 * Cancel membership/partnership invites and/or requests.
 * \param businessId Business id *Required*
 * \param cancelInvitesBody A list with invite ids *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelInvitesOrRequestsAsync(char * accessToken,
	std::string businessId, std::shared_ptr<CancelInvitesBody> cancelInvitesBody, 
	void(* handler)(DeleteInvitesResultsResponseArray, Error, void* )
	, void* userData);


/*! \brief Update invite/request with an asset permission. *Synchronous*
 *
 * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param createAssetInvitesRequest A list of invites/requests together with the asset permissions to be assigned to the invite/request.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createAssetInvitesSync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetInvitesRequest> createAssetInvitesRequest, 
	void(* handler)(UpdateInvitesResultsResponseArray, Error, void* )
	, void* userData);

/*! \brief Update invite/request with an asset permission. *Asynchronous*
 *
 * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param createAssetInvitesRequest A list of invites/requests together with the asset permissions to be assigned to the invite/request.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createAssetInvitesAsync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateAssetInvitesRequest> createAssetInvitesRequest, 
	void(* handler)(UpdateInvitesResultsResponseArray, Error, void* )
	, void* userData);


/*! \brief Create invites or requests. *Synchronous*
 *
 * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
 * \param businessId Business id *Required*
 * \param createMembershipOrPartnershipInvitesBody An object with the properties: invite_type, partners, members, business_role *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createMembershipOrPartnershipInvitesSync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateMembershipOrPartnershipInvitesBody> createMembershipOrPartnershipInvitesBody, 
	void(* handler)(CreateInvitesResultsResponseArray, Error, void* )
	, void* userData);

/*! \brief Create invites or requests. *Asynchronous*
 *
 * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
 * \param businessId Business id *Required*
 * \param createMembershipOrPartnershipInvitesBody An object with the properties: invite_type, partners, members, business_role *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createMembershipOrPartnershipInvitesAsync(char * accessToken,
	std::string businessId, std::shared_ptr<CreateMembershipOrPartnershipInvitesBody> createMembershipOrPartnershipInvitesBody, 
	void(* handler)(CreateInvitesResultsResponseArray, Error, void* )
	, void* userData);


/*! \brief Get invites/requests. *Synchronous*
 *
 * Get the membership/partnership invites and/or requests for the authorized user.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param isMember A boolean field to indicate whether the invite is to create a partnership or a membership.
 * \param inviteStatus A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
 * \param inviteType Invite type to filter invites by. Only invites of the specified type will be returned.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getInvitesSync(char * accessToken,
	std::string businessId, bool isMember, std::list<std::string> inviteStatus, InviteType inviteType, std::string bookmark, int pageSize, 
	void(* handler)(Get_invites_200_response, Error, void* )
	, void* userData);

/*! \brief Get invites/requests. *Asynchronous*
 *
 * Get the membership/partnership invites and/or requests for the authorized user.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param isMember A boolean field to indicate whether the invite is to create a partnership or a membership.
 * \param inviteStatus A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
 * \param inviteType Invite type to filter invites by. Only invites of the specified type will be returned.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getInvitesAsync(char * accessToken,
	std::string businessId, bool isMember, std::list<std::string> inviteStatus, InviteType inviteType, std::string bookmark, int pageSize, 
	void(* handler)(Get_invites_200_response, Error, void* )
	, void* userData);


/*! \brief Accept or decline an invite/request. *Synchronous*
 *
 * Accept or decline invites or requests.
 * \param authRespondInvitesBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool respondBusinessAccessInvitesSync(char * accessToken,
	std::shared_ptr<AuthRespondInvitesBody> authRespondInvitesBody, 
	void(* handler)(RespondToInvitesResponseArray, Error, void* )
	, void* userData);

/*! \brief Accept or decline an invite/request. *Asynchronous*
 *
 * Accept or decline invites or requests.
 * \param authRespondInvitesBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool respondBusinessAccessInvitesAsync(char * accessToken,
	std::shared_ptr<AuthRespondInvitesBody> authRespondInvitesBody, 
	void(* handler)(RespondToInvitesResponseArray, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* BusinessAccessInviteManager_H_ */
