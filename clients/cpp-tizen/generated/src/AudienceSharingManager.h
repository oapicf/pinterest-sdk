#ifndef _AudienceSharingManager_H_
#define _AudienceSharingManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Ad_accounts_audiences_shared_accounts_list_200_response.h"
#include "AudienceAccountType.h"
#include "Audiences_list_200_response.h"
#include "BusinessSharedAudience.h"
#include "BusinessSharedAudienceResponse.h"
#include "Error.h"
#include "SharedAudience.h"
#include "SharedAudienceResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup AudienceSharing AudienceSharing
 * \ingroup Operations
 *  @{
 */
class AudienceSharingManager {
public:
	AudienceSharingManager();
	virtual ~AudienceSharingManager();

/*! \brief List accounts with access to an audience owned by an ad account. *Synchronous*
 *
 * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceId Unique identifier of the audience to use to filter the results. *Required*
 * \param accountType Filter accounts by account type. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsAudiencesSharedAccountsListSync(char * accessToken,
	std::string adAccountId, std::string audienceId, AudienceAccountType accountType, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
	, void* userData);

/*! \brief List accounts with access to an audience owned by an ad account. *Asynchronous*
 *
 * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceId Unique identifier of the audience to use to filter the results. *Required*
 * \param accountType Filter accounts by account type. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsAudiencesSharedAccountsListAsync(char * accessToken,
	std::string adAccountId, std::string audienceId, AudienceAccountType accountType, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
	, void* userData);


/*! \brief List accounts with access to an audience owned by a business. *Synchronous*
 *
 * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param audienceId Unique identifier of the audience to use to filter the results. *Required*
 * \param accountType Filter accounts by account type. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessAccountAudiencesSharedAccountsListSync(char * accessToken,
	std::string businessId, std::string audienceId, AudienceAccountType accountType, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
	, void* userData);

/*! \brief List accounts with access to an audience owned by a business. *Asynchronous*
 *
 * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param audienceId Unique identifier of the audience to use to filter the results. *Required*
 * \param accountType Filter accounts by account type. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessAccountAudiencesSharedAccountsListAsync(char * accessToken,
	std::string businessId, std::string audienceId, AudienceAccountType accountType, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_audiences_shared_accounts_list_200_response, Error, void* )
	, void* userData);


/*! \brief List received audiences for a business. *Synchronous*
 *
 * Get a list of received audiences for the given business.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sharedAudiencesForBusinessListSync(char * accessToken,
	std::string businessId, std::string bookmark, std::string order, int pageSize, 
	void(* handler)(Audiences_list_200_response, Error, void* )
	, void* userData);

/*! \brief List received audiences for a business. *Asynchronous*
 *
 * Get a list of received audiences for the given business.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sharedAudiencesForBusinessListAsync(char * accessToken,
	std::string businessId, std::string bookmark, std::string order, int pageSize, 
	void(* handler)(Audiences_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update audience sharing between ad accounts. *Synchronous*
 *
 * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sharedAudience  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateAdAccountToAdAccountSharedAudienceSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SharedAudience> sharedAudience, 
	void(* handler)(SharedAudienceResponse, Error, void* )
	, void* userData);

/*! \brief Update audience sharing between ad accounts. *Asynchronous*
 *
 * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sharedAudience  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateAdAccountToAdAccountSharedAudienceAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SharedAudience> sharedAudience, 
	void(* handler)(SharedAudienceResponse, Error, void* )
	, void* userData);


/*! \brief Update audience sharing from an ad account to businesses. *Synchronous*
 *
 * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param businessSharedAudience  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateAdAccountToBusinessSharedAudienceSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BusinessSharedAudience> businessSharedAudience, 
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
	, void* userData);

/*! \brief Update audience sharing from an ad account to businesses. *Asynchronous*
 *
 * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param businessSharedAudience  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateAdAccountToBusinessSharedAudienceAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BusinessSharedAudience> businessSharedAudience, 
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
	, void* userData);


/*! \brief Update audience sharing from a business to ad accounts. *Synchronous*
 *
 * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param sharedAudience  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateBusinessToAdAccountSharedAudienceSync(char * accessToken,
	std::string businessId, std::shared_ptr<SharedAudience> sharedAudience, 
	void(* handler)(SharedAudienceResponse, Error, void* )
	, void* userData);

/*! \brief Update audience sharing from a business to ad accounts. *Asynchronous*
 *
 * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param sharedAudience  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateBusinessToAdAccountSharedAudienceAsync(char * accessToken,
	std::string businessId, std::shared_ptr<SharedAudience> sharedAudience, 
	void(* handler)(SharedAudienceResponse, Error, void* )
	, void* userData);


/*! \brief Update audience sharing between businesses. *Synchronous*
 *
 * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param businessSharedAudience  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateBusinessToBusinessSharedAudienceSync(char * accessToken,
	std::string businessId, std::shared_ptr<BusinessSharedAudience> businessSharedAudience, 
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
	, void* userData);

/*! \brief Update audience sharing between businesses. *Asynchronous*
 *
 * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param businessSharedAudience  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateBusinessToBusinessSharedAudienceAsync(char * accessToken,
	std::string businessId, std::shared_ptr<BusinessSharedAudience> businessSharedAudience, 
	void(* handler)(BusinessSharedAudienceResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* AudienceSharingManager_H_ */
