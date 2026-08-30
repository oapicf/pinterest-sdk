#ifndef _BusinessAccessRelationshipsManager_H_
#define _BusinessAccessRelationshipsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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

/*! \brief Create a Brand Account. *Synchronous*
 *
 * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
 * \param businessHierarchyId business hierarchy node id *Required*
 * \param brandAccountCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool brandAccountsCreateSync(char * accessToken,
	std::string businessHierarchyId, std::shared_ptr<BrandAccountCreate> brandAccountCreate, 
	void(* handler)(BrandAccount, Error, void* )
	, void* userData);

/*! \brief Create a Brand Account. *Asynchronous*
 *
 * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
 * \param businessHierarchyId business hierarchy node id *Required*
 * \param brandAccountCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool brandAccountsCreateAsync(char * accessToken,
	std::string businessHierarchyId, std::shared_ptr<BrandAccountCreate> brandAccountCreate, 
	void(* handler)(BrandAccount, Error, void* )
	, void* userData);


/*! \brief Update a Brand Account. *Synchronous*
 *
 * Update an existing Brand Account
 * \param brandAccountId  *Required*
 * \param businessHierarchyId business hierarchy node id *Required*
 * \param brandAccountUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool brandAccountsUpdateSync(char * accessToken,
	std::string brandAccountId, std::string businessHierarchyId, std::shared_ptr<BrandAccountUpdate> brandAccountUpdate, 
	void(* handler)(BrandAccount, Error, void* )
	, void* userData);

/*! \brief Update a Brand Account. *Asynchronous*
 *
 * Update an existing Brand Account
 * \param brandAccountId  *Required*
 * \param businessHierarchyId business hierarchy node id *Required*
 * \param brandAccountUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool brandAccountsUpdateAsync(char * accessToken,
	std::string brandAccountId, std::string businessHierarchyId, std::shared_ptr<BrandAccountUpdate> brandAccountUpdate, 
	void(* handler)(BrandAccount, Error, void* )
	, void* userData);


/*! \brief Terminate business memberships. *Synchronous*
 *
 * Terminate memberships between the specified members and your business.
 * \param businessId Business id *Required*
 * \param deleteBusinessMembershipBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteBusinessMembershipSync(char * accessToken,
	std::string businessId, std::shared_ptr<DeleteBusinessMembershipBody> deleteBusinessMembershipBody, 
	void(* handler)(Delete_business_membership_200_response, Error, void* )
	, void* userData);

/*! \brief Terminate business memberships. *Asynchronous*
 *
 * Terminate memberships between the specified members and your business.
 * \param businessId Business id *Required*
 * \param deleteBusinessMembershipBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteBusinessMembershipAsync(char * accessToken,
	std::string businessId, std::shared_ptr<DeleteBusinessMembershipBody> deleteBusinessMembershipBody, 
	void(* handler)(Delete_business_membership_200_response, Error, void* )
	, void* userData);


/*! \brief Terminate business partnerships. *Synchronous*
 *
 * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param deleteBusinessPartnersDelete  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteBusinessPartnersSync(char * accessToken,
	std::string businessId, std::shared_ptr<DeleteBusinessPartnersDelete> deleteBusinessPartnersDelete, 
	void(* handler)(DeleteBusinessPartners, Error, void* )
	, void* userData);

/*! \brief Terminate business partnerships. *Asynchronous*
 *
 * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param deleteBusinessPartnersDelete  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteBusinessPartnersAsync(char * accessToken,
	std::string businessId, std::shared_ptr<DeleteBusinessPartnersDelete> deleteBusinessPartnersDelete, 
	void(* handler)(DeleteBusinessPartners, Error, void* )
	, void* userData);


/*! \brief List business employers for user. *Synchronous*
 *
 * Get all of the viewing user's business employers.
 * \param assetsSummary Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessEmployersSync(char * accessToken,
	bool assetsSummary, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
	, void* userData);

/*! \brief List business employers for user. *Asynchronous*
 *
 * Get all of the viewing user's business employers.
 * \param assetsSummary Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessEmployersAsync(char * accessToken,
	bool assetsSummary, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
	, void* userData);


/*! \brief Get business members. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessMembersSync(char * accessToken,
	std::string businessId, bool fetchSystemUsers, bool assetsSummary, std::list<MemberBusinessRole> businessRoles, std::string memberIds, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
	, void* userData);

/*! \brief Get business members. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessMembersAsync(char * accessToken,
	std::string businessId, bool fetchSystemUsers, bool assetsSummary, std::list<MemberBusinessRole> businessRoles, std::string memberIds, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
	, void* userData);


/*! \brief Get business partners. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessPartnersSync(char * accessToken,
	std::string businessId, bool assetsSummary, PartnerType partnerType, std::string partnerIds, int startIndex, bool sortAscending, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
	, void* userData);

/*! \brief Get business partners. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBusinessPartnersAsync(char * accessToken,
	std::string businessId, bool assetsSummary, PartnerType partnerType, std::string partnerIds, int startIndex, bool sortAscending, std::string bookmark, int pageSize, 
	void(* handler)(Get_business_employers_200_response, Error, void* )
	, void* userData);


/*! \brief Update a system user information.. *Synchronous*
 *
 * Update a system user information such as name.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param systemUserId Unique identifier of a system user. *Required*
 * \param systemUserUpdateWithRequiredBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool systemUserUpdateSync(char * accessToken,
	std::string businessId, std::string systemUserId, std::shared_ptr<SystemUserUpdateWithRequiredBody> systemUserUpdateWithRequiredBody, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update a system user information.. *Asynchronous*
 *
 * Update a system user information such as name.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param systemUserId Unique identifier of a system user. *Required*
 * \param systemUserUpdateWithRequiredBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool systemUserUpdateAsync(char * accessToken,
	std::string businessId, std::string systemUserId, std::shared_ptr<SystemUserUpdateWithRequiredBody> systemUserUpdateWithRequiredBody, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Update member's business role. *Synchronous*
 *
 * Update a member's business role within the business.
 * \param businessId Business id *Required*
 * \param businessMembershipMember  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateBusinessMembershipsSync(char * accessToken,
	std::string businessId, std::list<BusinessMembershipMember> businessMembershipMember, 
	void(* handler)(UpdateBusinessMembershipsResponse, Error, void* )
	, void* userData);

/*! \brief Update member's business role. *Asynchronous*
 *
 * Update a member's business role within the business.
 * \param businessId Business id *Required*
 * \param businessMembershipMember  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateBusinessMembershipsAsync(char * accessToken,
	std::string businessId, std::list<BusinessMembershipMember> businessMembershipMember, 
	void(* handler)(UpdateBusinessMembershipsResponse, Error, void* )
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
