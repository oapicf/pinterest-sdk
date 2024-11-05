#ifndef _BusinessAccessRelationshipsManager_H_
#define _BusinessAccessRelationshipsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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
#include "UpdateMemberBusinessRoleBody.h"
#include "UpdateMemberResultsResponseArray.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup BusinessAccessRelationships BusinessAccessRelationships
 * \ingroup Operations
 *  @{
 */
class BusinessAccessRelationshipsManager {
public:
	BusinessAccessRelationshipsManager();
	virtual ~BusinessAccessRelationshipsManager();

/*! \brief Terminate business memberships. *Synchronous*
 *
 * Terminate memberships between the specified members and your business.
 * \param businessId Business id *Required*
 * \param membersToDeleteBody List of members with role to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteBusinessMembershipSync(char * accessToken,
	std::string businessId, std::shared_ptr<MembersToDeleteBody> membersToDeleteBody, 
	void(* handler)(DeletedMembersResponse, Error, void* )
	, void* userData);

/*! \brief Terminate business memberships. *Asynchronous*
 *
 * Terminate memberships between the specified members and your business.
 * \param businessId Business id *Required*
 * \param membersToDeleteBody List of members with role to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteBusinessMembershipAsync(char * accessToken,
	std::string businessId, std::shared_ptr<MembersToDeleteBody> membersToDeleteBody, 
	void(* handler)(DeletedMembersResponse, Error, void* )
	, void* userData);


/*! \brief Terminate business partnerships. *Synchronous*
 *
 * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param deletePartnersRequest An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteBusinessPartnersSync(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnersRequest> deletePartnersRequest, 
	void(* handler)(DeletePartnersResponse, Error, void* )
	, void* userData);

/*! \brief Terminate business partnerships. *Asynchronous*
 *
 * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param deletePartnersRequest An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteBusinessPartnersAsync(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnersRequest> deletePartnersRequest, 
	void(* handler)(DeletePartnersResponse, Error, void* )
	, void* userData);


/*! \brief List business employers for user. *Synchronous*
 *
 * Get all of the viewing user's business employers.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessEmployersSync(char * accessToken,
	int pageSize, std::string bookmark, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
	, void* userData);

/*! \brief List business employers for user. *Asynchronous*
 *
 * Get all of the viewing user's business employers.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessEmployersAsync(char * accessToken,
	int pageSize, std::string bookmark, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
	, void* userData);


/*! \brief Get business members. *Synchronous*
 *
 * Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
 * \param businessRoles A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
 * \param memberIds A list of business members ids separated by comma.
 * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessMembersSync(char * accessToken,
	std::string businessId, bool assetsSummary, std::list<MemberBusinessRole> businessRoles, std::string memberIds, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_members_200_response, Error, void* )
	, void* userData);

/*! \brief Get business members. *Asynchronous*
 *
 * Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
 * \param businessRoles A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
 * \param memberIds A list of business members ids separated by comma.
 * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessMembersAsync(char * accessToken,
	std::string businessId, bool assetsSummary, std::list<MemberBusinessRole> businessRoles, std::string memberIds, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_members_200_response, Error, void* )
	, void* userData);


/*! \brief Get business partners. *Synchronous*
 *
 * Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
 * \param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
 * \param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
 * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessPartnersSync(char * accessToken,
	std::string businessId, bool assetsSummary, PartnerType partnerType, std::string partnerIds, int startIndex, int pageSize, std::string bookmark, 
	void(* handler)(Get_business_partners_200_response, Error, void* )
	, void* userData);

/*! \brief Get business partners. *Asynchronous*
 *
 * Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
 * \param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
 * \param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
 * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessPartnersAsync(char * accessToken,
	std::string businessId, bool assetsSummary, PartnerType partnerType, std::string partnerIds, int startIndex, int pageSize, std::string bookmark, 
	void(* handler)(Get_business_partners_200_response, Error, void* )
	, void* userData);


/*! \brief Update member's business role. *Synchronous*
 *
 * Update a member's business role within the business.
 * \param businessId Business id *Required*
 * \param updateMemberBusinessRoleBody List of objects with the member id and the business_role. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateBusinessMembershipsSync(char * accessToken,
	std::string businessId, std::list<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody, 
	void(* handler)(UpdateMemberResultsResponseArray, Error, void* )
	, void* userData);

/*! \brief Update member's business role. *Asynchronous*
 *
 * Update a member's business role within the business.
 * \param businessId Business id *Required*
 * \param updateMemberBusinessRoleBody List of objects with the member id and the business_role. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateBusinessMembershipsAsync(char * accessToken,
	std::string businessId, std::list<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody, 
	void(* handler)(UpdateMemberResultsResponseArray, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* BusinessAccessRelationshipsManager_H_ */
